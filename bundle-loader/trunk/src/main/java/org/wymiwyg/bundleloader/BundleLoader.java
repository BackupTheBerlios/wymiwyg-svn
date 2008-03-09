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

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.wymiwyg.bundleloader.vocabulary.BUNDLES;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.ResIterator;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.vocabulary.RDF;

/**
 * @author reto
 * 
 */
public class BundleLoader {
	private BundleContext bundleContext;

	BundleLoader(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/**
	 * Loads all Bundles described by instances of
	 * http://framework.wymiwyg.org/ontology#Bundle in the configuration graph
	 * 
	 * @param configurationGraphURI
	 * @return a collection of the installed bundles
	 * @throws BundleException
	 * @throws IOException
	 */
	public Collection<Bundle> loadBundles(URI configurationGraphURI) throws IOException,
			BundleException {
		Model model = ModelFactory.createDefaultModel();
		model.read(configurationGraphURI.toString());
		ResIterator bundleResIter = model.listSubjectsWithProperty(RDF.type,
				BUNDLES.Bundle);
		Collection<Bundle> result = new ArrayList<Bundle>();
		while (bundleResIter.hasNext()) {
			result.add(loadBundle(bundleResIter.nextResource()));
		}
		return result;
	}

	private Bundle loadBundle(Resource bundleResource) throws IOException,
			BundleException {
		StmtIterator stmtIter = bundleResource.listProperties(BUNDLES.location);

		Statement currentStmt = stmtIter.nextStatement();
		System.out.println(currentStmt);
		Literal uriLit = currentStmt.getLiteral();
		if (!uriLit.getDatatype().equals(XSDDatatype.XSDanyURI)) {
			throw new RuntimeException(
					"Object of location stmt not of type xsd:anyURI");
		}
		URI currentLocationURI;
		try {
			currentLocationURI = new URI(uriLit.getLexicalForm());
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
		System.out.println(currentLocationURI);
		return bundleContext.installBundle(currentLocationURI.toString(),
				currentLocationURI.toURL().openStream());

	}
}
