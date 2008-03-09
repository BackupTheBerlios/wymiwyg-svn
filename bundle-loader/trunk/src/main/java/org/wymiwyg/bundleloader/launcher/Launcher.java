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
package org.wymiwyg.bundleloader.launcher;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.felix.framework.Felix;
import org.apache.felix.framework.cache.BundleCache;
import org.osgi.framework.Constants;
import org.wymiwyg.bundleloader.BundleLoaderActivator;

/**
 * @author reto
 * 
 */
public class Launcher  {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// Create a temporary bundle cache directory and
		// make sure to clean it up on exit.
		final File cachedir = File.createTempFile("felix.example.servicebased",
				null);
		cachedir.delete();
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				deleteFileOrDir(cachedir);
			}
		});

		Map<String, String> configMap = new HashMap<String, String>();
		configMap
				.put(
						Constants.FRAMEWORK_SYSTEMPACKAGES,
						"org.osgi.framework; version=1.3.0,"
								+ "org.osgi.service.packageadmin; version=1.2.0,"
								+ "org.osgi.service.startlevel; version=1.0.0,"
								+ "org.osgi.service.url; version=1.0.0,"
								+ "org.osgi.util.tracker; version=1.3.2,"
								+ "javax.swing");

		// configMap.put(FelixConstants.LOG_LEVEL_PROP, "1");
		configMap.put(BundleCache.CACHE_PROFILE_DIR_PROP, cachedir
				.getAbsolutePath());

		configMap.put("org.wymiwyg.bundleloader.configGraph", "http://foo.rdf");
		
		// Create list to hold custom framework activators.
		List<Object> list = new ArrayList<Object>();
		// Add activator to process auto-start/install properties.
		//list.add(new AutoActivator(configMap));
		// Add our own activator.
		list.add(new BundleLoaderActivator());

		try {
			// Now create an instance of the framework.
			Felix felix = new Felix(configMap, list);
			felix.start();
			Thread.sleep(2000);

			System.out.println("modifying");
			//String bundleURLString = "file:///home/reto/workspaces/felix/servicebased.host/target/servicebased.host-1.0.0.jar";
			//String bundleURLString = "file:///home/reto/workspaces/felix/servicebased.square/target/servicebased.square-1.0.0.jar";
			// URL bundleURL = new URL(bundleURLString);
			// Bundle bundle = felix.getBundleContext().installBundle(
			// bundleURLString, bundleURL.openStream());
			// bundle.start();

			// felix.getBundleContext().installBundle("file:../servicebased.square/target/servicebased.square-1.0.0.jar
			// ");
			// felix.loadClass("file:../servicebased.square/target/servicebased.square-1.0.0.jar
			// ");
		} catch (Exception ex) {
			System.err.println("Could not create framework: " + ex);
			ex.printStackTrace();
			System.exit(-1);
		}
	}

	/**
	 * Utility method used to delete the profile directory when run as a
	 * stand-alone application.
	 * 
	 * @param file
	 *            The file to recursively delete.
	 */
	private static void deleteFileOrDir(File file) {
		if (file.isDirectory()) {
			File[] childs = file.listFiles();
			for (int i = 0; i < childs.length; i++) {
				deleteFileOrDir(childs[i]);
			}
		}
		file.delete();
	}



}
