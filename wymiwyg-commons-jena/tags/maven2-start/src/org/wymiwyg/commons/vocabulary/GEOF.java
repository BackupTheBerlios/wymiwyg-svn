/* CVS $Id: $ */
package org.wymiwyg.commons.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*; 
/**
 * Vocabulary definitions from http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl 
 * @author Auto-generated by schemagen on 31 Mai 2007 01:33 
 */
public class GEOF {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>hasSpatialLocation defines the qualitative location of some spatial thing</p> */
    public static final ObjectProperty hasSpatialLocation = m_model.createObjectProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#hasSpatialLocation" );
    
    /** <p>The property shape associates a geographic feature with a Spatial Description 
     *  defined by a blank node</p>
     */
    public static final ObjectProperty shape = m_model.createObjectProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#shape" );
    
    /** <p>xyCoordinates define the x,y,z location of a spatial thing. They must be ordered 
     *  as "x,y,z x,y,z x,y,z..."</p>
     */
    public static final DatatypeProperty xyzCoordinates = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#xyzCoordinates" );
    
    /** <p></p> */
    public static final DatatypeProperty iso_2digit = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#iso_2digit" );
    
    /** <p></p> */
    public static final DatatypeProperty status = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#status" );
    
    /** <p></p> */
    public static final DatatypeProperty cntry_name = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#cntry_name" );
    
    /** <p></p> */
    public static final DatatypeProperty pop_rank = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#pop_rank" );
    
    /** <p>Type of currency in country</p> */
    public static final DatatypeProperty curr_type = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#curr_type" );
    
    /** <p></p> */
    public static final DatatypeProperty gmi_cntry = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#gmi_cntry" );
    
    /** <p>Population of the country</p> */
    public static final DatatypeProperty pop_cntry = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#pop_cntry" );
    
    /** <p></p> */
    public static final DatatypeProperty sovereign = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#sovereign" );
    
    /** <p>Population of the administrative unit</p> */
    public static final DatatypeProperty pop_admin = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#pop_admin" );
    
    /** <p></p> */
    public static final DatatypeProperty fips_cntry = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#fips_cntry" );
    
    /** <p></p> */
    public static final DatatypeProperty fips_admin = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#fips_admin" );
    
    /** <p></p> */
    public static final DatatypeProperty pop_class = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#pop_class" );
    
    /** <p>xyCoordinates define the x,y location of a spatial thing. They must be ordered 
     *  as "x,y x,y x,y ..."</p>
     */
    public static final DatatypeProperty xyCoordinates = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#xyCoordinates" );
    
    /** <p></p> */
    public static final DatatypeProperty gmi_admin = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#gmi_admin" );
    
    /** <p></p> */
    public static final DatatypeProperty city_name = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#city_name" );
    
    /** <p></p> */
    public static final DatatypeProperty curr_code = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#curr_code" );
    
    /** <p>Type of administrative unit in language of country</p> */
    public static final DatatypeProperty type_loc = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#type_loc" );
    
    /** <p></p> */
    public static final DatatypeProperty iso_3digit = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#iso_3digit" );
    
    /** <p></p> */
    public static final DatatypeProperty port_id = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#port_id" );
    
    /** <p></p> */
    public static final DatatypeProperty admin_name = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#admin_name" );
    
    /** <p>Area in square kilometers</p> */
    public static final DatatypeProperty sqkm = m_model.createDatatypeProperty( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#sqkm" );
    
    /** <p></p> */
    public static final OntClass Point = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Point" );
    
    public static final OntClass Prefecture = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Prefecture" );
    
    public static final OntClass Governorate = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Governorate" );
    
    public static final OntClass Federal_Status_City = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Federal_Status_City" );
    
    public static final OntClass Capital_City = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Capital_City" );
    
    public static final OntClass Province = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Province" );
    
    public static final OntClass Parish = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Parish" );
    
    /** <p>a collection of points</p> */
    public static final OntClass MultiPoint = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#MultiPoint" );
    
    public static final OntClass Administrative_Subdivision = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Administrative_Subdivision" );
    
    public static final OntClass Division = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Division" );
    
    public static final OntClass Constitutional_Province = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Constitutional_Province" );
    
    public static final OntClass Municipality = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Municipality" );
    
    /** <p>cities, countries, admin units, and continents are subclasses of GeographicFeature</p> */
    public static final OntClass GeographicFeature = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#GeographicFeature" );
    
    public static final OntClass Emirate = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Emirate" );
    
    /** <p>a collection of polylines</p> */
    public static final OntClass MultiLinestring = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#MultiLinestring" );
    
    public static final OntClass Intendancy = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Intendancy" );
    
    public static final OntClass Federal_Dependencies = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Federal_Dependencies" );
    
    /** <p>A spatial description is a class of spatial descriptors used to describe the 
     *  spatial shape of a SpatialThing in terms of coordinates</p>
     */
    public static final OntClass SpatialDescription = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#SpatialDescription" );
    
    public static final OntClass Canton = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Canton" );
    
    public static final OntClass Republic = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Republic" );
    
    public static final OntClass Special_Region = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Special_Region" );
    
    public static final OntClass Capital_Territory = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Capital_Territory" );
    
    public static final OntClass Area = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Area" );
    
    public static final OntClass Federal_District = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Federal_District" );
    
    public static final OntClass National_Territory = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#National_Territory" );
    
    /** <p></p> */
    public static final OntClass Linestring = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Linestring" );
    
    public static final OntClass Town = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Town" );
    
    public static final OntClass Special_District = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Special_District" );
    
    public static final OntClass Pakistan_administered = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Pakistan-administered" );
    
    public static final OntClass Special_City = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Special_City" );
    
    public static final OntClass Autonomous_Municipality = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Autonomous_Municipality" );
    
    public static final OntClass Capital_Municipality = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Capital_Municipality" );
    
    public static final OntClass District = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#District" );
    
    public static final OntClass City = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#City" );
    
    public static final OntClass Department = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Department" );
    
    public static final OntClass State = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#State" );
    
    public static final OntClass Building = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Building" );
    
    public static final OntClass County = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#County" );
    
    public static final OntClass Zone = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Zone" );
    
    public static final OntClass Territory = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Territory" );
    
    public static final OntClass Union_Territory = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Union_Territory" );
    
    public static final OntClass Region = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Region" );
    
    public static final OntClass National_District = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#National_District" );
    
    public static final OntClass Autonomous_Community = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Autonomous_Community" );
    
    /** <p></p> */
    public static final OntClass Polygon = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Polygon" );
    
    public static final OntClass Administrative_Region = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Administrative_Region" );
    
    public static final OntClass Special_Municipality = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Special_Municipality" );
    
    public static final OntClass Economic_Prefecture = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Economic_Prefecture" );
    
    public static final OntClass Autonomous_Region = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Autonomous_Region" );
    
    public static final OntClass Independent_Town = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Independent_Town" );
    
    /** <p>a collection of polygons</p> */
    public static final OntClass MultiPolygon = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#MultiPolygon" );
    
    public static final OntClass Federal_Territory = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#Federal_Territory" );
    
    /** <p>A spatial thing is the simplest thing that has some spatial characteristics</p> */
    public static final OntClass SpatialThing = m_model.createClass( "http://www.mindswap.org/2003/owl/geo/geoFeatures20040307.owl#SpatialThing" );
    
}
