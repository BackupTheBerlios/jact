

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISMS<br>
 * SMS handles exchange of SMS data with a call to/from SMS capabale phone or SMS PSTN service centre. Can send and/or receive SMS messages. Returns 0 if call handled correctly, or -1 if there were any problems. Works to ETSI ES 201 912 compatible with BT SMS PSTN service in UK Typical usage is to use to handle called from the SMS service centre CLI, or to set up a call using 'outgoing' or manager interface to connect service centre to SMS() name is the name of the queue used in /var/spool/asterisk/sms Argument 'a' means answer, i.e. send initial FSK packet. Argument 's' means act as service centre talking to a phone. Messages are processed as per text file message queues. smsq is a command to generate message queues and send messages.
 * </p>
 * Created : Wed Jul 05 18:54:10 CEST 2006
 * 
 * @behavior.elementname SMS
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISMS.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  ISMS {
public static final String MODELNAME = "SMS";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_NAME="name" ;
// 	public static final String VALUEID_A="a" ;
// 	public static final String VALUEID_S="s" ;
	//test
	//---------  getter und setter
	/**
	* getname 
	* 
	* @behavior.fieldname name 
	**/
	public String getName();
	
	/**
	*setname 
	* 
	* @behavior.fieldname name 
	*/
	public void setName(String aname);
	/**
	* geta 
	* 
	* @behavior.fieldname a 
	**/
	public String getA();
	
	/**
	*seta 
	* 
	* @behavior.fieldname a 
	*/
	public void setA(String aa);
	/**
	* gets 
	* 
	* @behavior.fieldname s 
	**/
	public String getS();
	
	/**
	*sets 
	* 
	* @behavior.fieldname s 
	*/
	public void setS(String as);

}