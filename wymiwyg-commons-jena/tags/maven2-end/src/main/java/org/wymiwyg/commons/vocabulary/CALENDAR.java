/* CVS $Id: $ */
package org.wymiwyg.commons.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*; 
/**
 * Vocabulary definitions from src/org/wymiwyg/commons/vocabulary/ical.rdf 
 * @author Auto-generated by schemagen on 31 Mai 2007 01:33 
 */
public class CALENDAR {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.w3.org/2002/12/cal#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>default value type: DATE-TIMEThis property is used in conjunction with the 
     *  "UID" and "SEQUENCE" property to identify a specific instance of a recurring 
     *  "VEVENT", "VTODO" or "VJOURNAL" calendar component. The property value is 
     *  the effective value of the "DTSTART" property of the recurrence instance.</p>
     */
    public static final ObjectProperty recurrenceId = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#recurrenceId" );
    
    /** <p>This property specifies the date and time that a calendar component ends.default 
     *  value type: DATE-TIME</p>
     */
    public static final ObjectProperty dtend = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#dtend" );
    
    /** <p>This property defines a rule or repeating pattern for an exception to a recurrence 
     *  set.value type: RECUR</p>
     */
    public static final ObjectProperty exrule = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#exrule" );
    
    /** <p>This property specifies when an alarm will trigger.default value type: DURATION</p> */
    public static final ObjectProperty trigger = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#trigger" );
    
    /** <p>value type: CAL-ADDRESSThe property defines the organizer for a calendar component.</p> */
    public static final ObjectProperty organizer = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#organizer" );
    
    /** <p>value type: list of FLOATThis property specifies information related to the 
     *  global position for the activity specified by a calendar component.</p>
     */
    public static final ObjectProperty geo = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#geo" );
    
    /** <p>value type: DATE-TIMEThe property indicates the date/time that the instance 
     *  of the iCalendar object was created.</p>
     */
    public static final ObjectProperty dtstamp = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#dtstamp" );
    
    /** <p>The property defines an "Attendee" within a calendar component.value type: 
     *  CAL-ADDRESS</p>
     */
    public static final ObjectProperty attendee = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#attendee" );
    
    /** <p>default value type: DATE-TIMEThis property specifies when the calendar component 
     *  begins.</p>
     */
    public static final ObjectProperty dtstart = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#dtstart" );
    
    /** <p>default value type: DATE-TIMEThis property defines the date and time that 
     *  a to-do is expected to be completed.</p>
     */
    public static final ObjectProperty due = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#due" );
    
    /** <p>The property defines one or more free or busy time intervals.value type: PERIOD</p> */
    public static final ObjectProperty freebusy = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#freebusy" );
    
    /** <p>The property provides the capability to associate a document object with a 
     *  calendar component.default value type: URI</p>
     */
    public static final ObjectProperty attach = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#attach" );
    
    /** <p>The property specifies a positive duration of time.value type: DURATION</p> */
    public static final ObjectProperty duration = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#duration" );
    
    /** <p>default value type: DATE-TIMEThis property defines the list of date/times 
     *  for a recurrence set.</p>
     */
    public static final ObjectProperty rdate = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#rdate" );
    
    /** <p>default value type: DATE-TIMEThis property defines the list of date/time exceptions 
     *  for a recurring calendar component.</p>
     */
    public static final ObjectProperty exdate = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#exdate" );
    
    /** <p>value type: DATE-TIMEThis property defines the date and time that a to-do 
     *  was actually completed.</p>
     */
    public static final ObjectProperty completed = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#completed" );
    
    /** <p>The TZURL provides a means for a VTIMEZONE component to point to a network 
     *  location that can be used to retrieve an up-to- date version of itself.value 
     *  type: URI</p>
     */
    public static final ObjectProperty tzurl = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#tzurl" );
    
    /** <p>This property specifies the date and time that the calendar information was 
     *  created by the calendar user agent in the calendar store. Note: This is analogous 
     *  to the creation date and time for a file in the file system.value type: DATE-TIME</p>
     */
    public static final ObjectProperty created = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#created" );
    
    /** <p>This property defines a rule or repeating pattern for recurring events, to-dos, 
     *  or time zone definitions.value type: RECUR</p>
     */
    public static final ObjectProperty rrule = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#rrule" );
    
    /** <p>This property defines a Uniform Resource Locator (URL) associated with the 
     *  iCalendar object.value type: URI</p>
     */
    public static final ObjectProperty url = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#url" );
    
    /** <p>value type: DATE-TIMEThe property specifies the date and time that the information 
     *  associated with the calendar component was last revised in the calendar store. 
     *  Note: This is analogous to the modification date and time for a file in the 
     *  file system.</p>
     */
    public static final ObjectProperty lastModified = m_model.createObjectProperty( "http://www.w3.org/2002/12/cal#lastModified" );
    
    /** <p>value type: TEXTThis property defines the calendar scale used for the calendar 
     *  information specified in the iCalendar object.</p>
     */
    public static final DatatypeProperty calscale = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#calscale" );
    
    /** <p>value type: TEXTThis property specifies the text value that uniquely identifies 
     *  the "VTIMEZONE" calendar component.</p>
     */
    public static final DatatypeProperty tzid = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#tzid" );
    
    /** <p>value type: TEXTThis property defines the iCalendar object method associated 
     *  with the calendar object.</p>
     */
    public static final DatatypeProperty method = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#method" );
    
    /** <p>This property defines the persistent, globally unique identifier for the calendar 
     *  component.value type: TEXT</p>
     */
    public static final DatatypeProperty uid = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#uid" );
    
    /** <p>The property is used to represent a relationship or reference between one 
     *  calendar component and another.value type: TEXT</p>
     */
    public static final DatatypeProperty relatedTo = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#relatedTo" );
    
    /** <p>value type: integerThis property defines the revision sequence number of the 
     *  calendar component within a sequence of revisions.</p>
     */
    public static final DatatypeProperty sequence = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#sequence" );
    
    /** <p>value type: TEXTThe property is used to represent contact information or alternately 
     *  a reference to contact information associated with the calendar component.</p>
     */
    public static final DatatypeProperty contact = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#contact" );
    
    /** <p>value type: TEXTThis property specifies the identifier for the product that 
     *  created the iCalendar object.</p>
     */
    public static final DatatypeProperty prodid = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#prodid" );
    
    /** <p>This property defines a short summary or subject for the calendar component.value 
     *  type: TEXT</p>
     */
    public static final DatatypeProperty summary = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#summary" );
    
    /** <p>value type: TEXTThis property defines the categories for a calendar component.</p> */
    public static final DatatypeProperty categories = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#categories" );
    
    /** <p>This property defines whether an event is transparent or not to busy time 
     *  searches.value type: TEXT</p>
     */
    public static final DatatypeProperty transp = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#transp" );
    
    /** <p>value type: TEXTThis property defines the overall status or confirmation for 
     *  the calendar component.</p>
     */
    public static final DatatypeProperty status = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#status" );
    
    /** <p>value type: UTC-OFFSETThis property specifies the offset which is in use in 
     *  this time zone observance.</p>
     */
    public static final DatatypeProperty tzoffsetto = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#tzoffsetto" );
    
    /** <p>value type: TEXTThis property defines the equipment or resources anticipated 
     *  for an activity specified by a calendar entity..</p>
     */
    public static final DatatypeProperty resources = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#resources" );
    
    /** <p>value type: TEXTThis property specifies non-processing information intended 
     *  to provide a comment to the calendar user.</p>
     */
    public static final DatatypeProperty comment = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#comment" );
    
    /** <p>value type: TEXTThis property provides a more complete description of the 
     *  calendar component, than that provided by the "SUMMARY" property.</p>
     */
    public static final DatatypeProperty description = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#description" );
    
    /** <p>value type: TEXTThis property defines the action to be invoked when an alarm 
     *  is triggered.</p>
     */
    public static final DatatypeProperty action = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#action" );
    
    /** <p>value type: UTC-OFFSETThis property specifies the offset which is in use prior 
     *  to this time zone observance.</p>
     */
    public static final DatatypeProperty tzoffsetfrom = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#tzoffsetfrom" );
    
    /** <p>value type: TEXTThis property defines the access classification for a calendar 
     *  component.</p>
     */
    public static final DatatypeProperty class_ = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#class" );
    
    /** <p>value type: TEXTThe property defines the intended venue for the activity defined 
     *  by a calendar component.</p>
     */
    public static final DatatypeProperty location = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#location" );
    
    /** <p>value type: TEXTThis property defines the status code returned for a scheduling 
     *  request.</p>
     */
    public static final DatatypeProperty requestStatus = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#requestStatus" );
    
    /** <p>The property defines the relative priority for a calendar component.value 
     *  type: INTEGER</p>
     */
    public static final DatatypeProperty priority = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#priority" );
    
    /** <p>value type: TEXTThis property specifies the customary designation for a time 
     *  zone description.</p>
     */
    public static final DatatypeProperty tzname = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#tzname" );
    
    /** <p>value type: TEXTThis class of property provides a framework for defining non-standard 
     *  properties.</p>
     */
    public static final DatatypeProperty X_ = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#X-" );
    
    /** <p>This property defines the number of time the alarm should be repeated, after 
     *  the initial trigger.value type: INTEGER</p>
     */
    public static final DatatypeProperty repeat = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#repeat" );
    
    /** <p>value type: INTEGERThis property is used by an assignee or delegatee of a 
     *  to-do to convey the percent completion of a to-do to the Organizer.</p>
     */
    public static final DatatypeProperty percentComplete = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#percentComplete" );
    
    /** <p>value type: TEXTThis property specifies the identifier corresponding to the 
     *  highest version number or the minimum and maximum range of the iCalendar specification 
     *  that is required in order to interpret the iCalendar object.</p>
     */
    public static final DatatypeProperty version = m_model.createDatatypeProperty( "http://www.w3.org/2002/12/cal#version" );
    
    public static final OntClass Value_PERIOD = m_model.createClass( "http://www.w3.org/2002/12/cal#Value_PERIOD" );
    
    public static final OntClass List_of_Float = m_model.createClass( "http://www.w3.org/2002/12/cal#List_of_Float" );
    
    /** <p>Provide a grouping of component properties that describe a journal entry.</p> */
    public static final OntClass Vjournal = m_model.createClass( "http://www.w3.org/2002/12/cal#Vjournal" );
    
    public static final OntClass DomainOf_rrule = m_model.createClass( "http://www.w3.org/2002/12/cal#DomainOf_rrule" );
    
    public static final OntClass Value_RECUR = m_model.createClass( "http://www.w3.org/2002/12/cal#Value_RECUR" );
    
    /** <p>Provide a grouping of calendar properties that describe a to-do.</p> */
    public static final OntClass Vtodo = m_model.createClass( "http://www.w3.org/2002/12/cal#Vtodo" );
    
    /** <p>Provide a grouping of component properties that describe either a request 
     *  for free/busy time, describe a response to a request for free/busy time or 
     *  describe a published set of busy time.</p>
     */
    public static final OntClass Vfreebusy = m_model.createClass( "http://www.w3.org/2002/12/cal#Vfreebusy" );
    
    /** <p>Provide a grouping of component properties that describe an event.</p> */
    public static final OntClass Vevent = m_model.createClass( "http://www.w3.org/2002/12/cal#Vevent" );
    
    public static final OntClass Value_DATE = m_model.createClass( "http://www.w3.org/2002/12/cal#Value_DATE" );
    
    /** <p>Provide a grouping of component properties that define an alarm.</p> */
    public static final OntClass Valarm = m_model.createClass( "http://www.w3.org/2002/12/cal#Valarm" );
    
    public static final OntClass Value_DURATION = m_model.createClass( "http://www.w3.org/2002/12/cal#Value_DURATION" );
    
    public static final OntClass Value_DATE_TIME = m_model.createClass( "http://www.w3.org/2002/12/cal#Value_DATE-TIME" );
    
    /** <p>Provide a grouping of component properties that defines a time zone.</p> */
    public static final OntClass Vtimezone = m_model.createClass( "http://www.w3.org/2002/12/cal#Vtimezone" );
    
    public static final OntClass Value_CAL_ADDRESS = m_model.createClass( "http://www.w3.org/2002/12/cal#Value_CAL-ADDRESS" );
    
}
