/* CVS $Id: IMG.java,v 1.21 2005/12/20 20:54:11 rebach Exp $ */
package org.wymiwyg.commons.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from /home/reto/workspace/wymiwyg-commons/src/org/wymiwyg/commons/vocabulary/mod_img.rdf 
 * @author Auto-generated by schemagen on 20 Dez 2005 21:48 
 */
public class IMG {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://wymiwyg.org/ontologies/rss/image#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>An image to be imcluded in an rss:item or rss:channel.</p> */
    public static final Property image = m_model.createProperty( "http://wymiwyg.org/ontologies/rss/image#image" );
    
    /** <p>The source of the image.</p> */
    public static final Property source = m_model.createProperty( "http://wymiwyg.org/ontologies/rss/image#source" );
    
    /** <p>The height of an image.</p> */
    public static final Property height = m_model.createProperty( "http://wymiwyg.org/ontologies/rss/image#height" );
    
    /** <p>The width of an image.</p> */
    public static final Property width = m_model.createProperty( "http://wymiwyg.org/ontologies/rss/image#width" );
    
    /** <p>The link on a image-item.</p> */
    public static final Property link = m_model.createProperty( "http://wymiwyg.org/ontologies/rss/image#link" );
    
    /** <p>A text to be shown when the image cannot be displayed</p> */
    public static final Property alt = m_model.createProperty( "http://wymiwyg.org/ontologies/rss/image#alt" );
    
    /** <p>A short text explaining the image</p> */
    public static final Property caption = m_model.createProperty( "http://wymiwyg.org/ontologies/rss/image#caption" );
    
    /** <p>A description of an image in a specific context (url, size, link etc.). This 
     *  may be an element in rss:items or the value of pict:image</p>
     */
    public static final Resource Image = m_model.createResource( "http://wymiwyg.org/ontologies/rss/image#Image" );
    
}
