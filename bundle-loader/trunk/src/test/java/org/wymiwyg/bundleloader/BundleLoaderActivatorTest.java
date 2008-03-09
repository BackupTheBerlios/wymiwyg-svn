/*
 * Copyright  2002-2006 WYMIWYG (http://wymiwyg.org)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.wymiwyg.bundleloader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.felix.framework.Felix;
import org.apache.felix.framework.cache.BundleCache;
import org.junit.Test;
import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;

/**
 * @author reto
 * 
 */
public class BundleLoaderActivatorTest {
	
	/**
	 * Checks that wrhapi is loaded and active loading the default-config
	 * @throws Exception 
	 */
	@Test
	public void loadDefaultBundles() throws Exception {
		final File cachedir = File.createTempFile("felix.example.servicebased",
				null);
		cachedir.delete();
		/*
		 * Runtime.getRuntime().addShutdownHook(new Thread() { public void run() {
		 * deleteFileOrDir(cachedir); } });
		 */

		Map<String, String> configMap = new HashMap<String, String>();
		configMap.put(Constants.FRAMEWORK_SYSTEMPACKAGES,
				"org.osgi.framework; version=1.3.0,"
						+ "org.osgi.service.packageadmin; version=1.2.0,"
						+ "org.osgi.service.startlevel; version=1.0.0,"
						+ "org.osgi.service.url; version=1.0.0,"
						+ "org.osgi.util.tracker; version=1.3.2,"
						+ "javax.swing,"
					    + "javax.activation,"
					    + "javax.xml.parsers,"
					    + "org.xml.sax,"
					    + "org.xml.sax.helpers"
					    + ", javax.security.cert" +
					    		", javax.net.ssl" +
					    		", org.apache.commons.logging; version=1.0.4");

		// configMap.put(FelixConstants.LOG_LEVEL_PROP, "1");
		configMap.put(BundleCache.CACHE_PROFILE_DIR_PROP, cachedir
				.getAbsolutePath());

		configMap.put("org.wymiwyg.bundleloader.configGraph",
				"http://framework.wymiwyg.org/default-config");

		// Create list to hold custom framework activators.
		List<Object> list = new ArrayList<Object>();
		// Add activator to process auto-start/install properties.
		// list.add(new AutoActivator(configMap));
		// Add our own activator.
		list.add(new BundleLoaderActivator());
		// Now create an instance of the framework.
		Felix felix = new Felix(configMap, list);
		felix.start();
		Bundle[] bundles = felix.getBundleContext().getBundles();
		boolean found = false;
		for (Bundle bundle : bundles) {
			System.out.println(bundle.getLocation());
			System.out.println(bundle.getState() == Bundle.ACTIVE);
			if (bundle
					.getLocation()
					.equals(
							"http://wymiwyg.berlios.de/maven2/org/wymiwyg/wrhapi/0.2.0/wrhapi-0.2.0.jar")) {
				found = true;
				assertEquals(Bundle.ACTIVE, bundle.getState());
			}
		}
		assertTrue(found);
	}
}
