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

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.eq;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.isA;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import java.io.InputStream;

import org.junit.Test;
import org.osgi.framework.BundleContext;

/**
 * @author reto
 * 
 */
public class BundleLoaderTest {

	/**
	 * Tests that the bundleContext is invoked with the bundles in the model
	 * 
	 * @throws Exception
	 */
	@Test
	public void bundlesLoaded() throws Exception {
		BundleContext bundleContextMock = createMock(BundleContext.class);
		expect(
				bundleContextMock
						.installBundle(
								eq("http://repo1.maven.org/maven2/org/mortbay/jetty/jetty/6.1.7/jetty-6.1.7.jar"),
								isA(InputStream.class))).andReturn(null);
		expect(
				bundleContextMock
						.installBundle(
								eq("http://repo1.maven.org/maven2/javax/servlet/servlet-api/2.5/servlet-api-2.5.jar"),
								isA(InputStream.class))).andReturn(null);

		replay(bundleContextMock);
		BundleLoader bundleLoader = new BundleLoader(bundleContextMock);
		bundleLoader.loadBundles(getClass().getResource(
				"simple-bundle-description.rdf").toURI());
		verify(bundleContextMock);
	}

}
