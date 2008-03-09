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

import java.net.URI;
import java.util.Collection;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author reto
 * 
 */
public class BundleLoaderActivator implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("start (will load and start additional bundle)");

		String configurationGraphURIString = bundleContext
				.getProperty("org.wymiwyg.bundleloader.configGraph");
		URI configurationGraphURI = new URI(configurationGraphURIString);
		Collection<Bundle> bundles = new BundleLoader(bundleContext).loadBundles(configurationGraphURI);
		for (Bundle bundle : bundles) {
			bundle.start();
		}
		// String bundleURLString =
		// "file:///home/reto/workspaces/wrhapi/wrhapi/target/wrhapi-0.2.0.jar";

		

//		System.out.println("registered: "
//				+ bundleContext.registerService(Map.class.getName(),
//						new HashMap(), new Hashtable()));
//		System.out.println("registered: "
//				+ bundleContext.registerService(Map.class.getName(),
//						new HashMap(), new Hashtable()));
//		System.out.println("registered: "
//				+ bundleContext.registerService(Map.class.getName(),
//						new HashMap(), new Hashtable()));
//		ServiceReference[] allServiceReferences = bundleContext
//				.getAllServiceReferences(null, null);
//		System.out.println("Services: " + allServiceReferences);
//		for (ServiceReference serviceReference : allServiceReferences) {
//			String[] propertyKeys = serviceReference.getPropertyKeys();
//			for (String string : propertyKeys) {
//				System.out.println("Service-keys: " + string + " = "
//						+ serviceReference.getProperty(string));
//			}
//
//		}

	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		System.out.println("stopping " + BundleLoaderActivator.class.getName());

	}

}
