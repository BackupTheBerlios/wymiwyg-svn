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

import java.net.URL;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * @author reto
 * 
 */
public class BundleLoaderActivator implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("start (will load and start additional bundle)");
		System.out.println("Data file " + bundleContext.getDataFile("foo"));
		System.out.println(bundleContext
				.getProperty("org.wymiwyg.bundleloader.rdffile"));

		// String bundleURLString =
		// "file:///home/reto/workspaces/wrhapi/wrhapi/target/wrhapi-0.2.0.jar";

		String bundleURLString = "file:///home/reto/workspaces/felix/servicebased.host/target/servicebased.host-1.0.0.jar";
		URL bundleURL = new URL(bundleURLString);
		Bundle bundle = bundleContext.installBundle(bundleURLString, bundleURL
				.openStream());
		System.out.println("Starting loaded bundle");
		bundle.start();

		System.out.println("registered: "
				+ bundleContext.registerService(Map.class.getName(),
						new HashMap(), new Hashtable()));
		System.out.println("registered: "
				+ bundleContext.registerService(Map.class.getName(),
						new HashMap(), new Hashtable()));
		System.out.println("registered: "
				+ bundleContext.registerService(Map.class.getName(),
						new HashMap(), new Hashtable()));
		ServiceReference[] allServiceReferences = bundleContext
				.getAllServiceReferences(null, null);
		System.out.println("Services: " + allServiceReferences);
		for (ServiceReference serviceReference : allServiceReferences) {
			String[] propertyKeys = serviceReference.getPropertyKeys();
			for (String string : propertyKeys) {
				System.out.println("Service-keys: " + string + " = "
						+ serviceReference.getProperty(string));
			}

		}

	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		System.out.println("stopping " + BundleLoaderActivator.class.getName());

	}

}
