

package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ICall_Logging_Options<br>
 * Asterisk normally generates Call Detail Records (CDR), being a log or database of the calls made through Asterisk. This data can be used for Automated Machine Accounting (AMA). See Asterisk Billing.
 * </p>
 * Created : Fri May 26 14:30:40 CEST 2006
 * 
 * @behavior.elementname Call_Logging_Options
 * @author urs
 * @version $Revision: 1.1 $, $Id: ICall_Logging_Options.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  ICall_Logging_Options {
public static final String MODELNAME = "Call_Logging_Options";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_ACCOUNTCODE="accountcode" ;
// 	public static final String VALUEID_AMAFLAGS="amaflags" ;
	
	//---------  getter und setter

	/**
	* getaccountcode 
	* Sets the data for the "account code" field in the CDR for calls placed from this channel. The account code may be any alphanumeric string. It may be overridden at call time with the (( Asterisk cmd SetAccount|SetAccount)) command.   accountcode=spencer145
	* @behavior.fieldname accountcode 
	**/
	public String getAccountcode();
	
	/**
	*setaccountcode 
	* Sets the data for the "account code" field in the CDR for calls placed from this channel. The account code may be any alphanumeric string. It may be overridden at call time with the (( Asterisk cmd SetAccount|SetAccount)) command.   accountcode=spencer145
	* @behavior.fieldname accountcode 
	*/
	public void setAccountcode(String aaccountcode);


	/**
	* getamaflags 
	* Sets the AMA flags, affecting the categorization of entries in the call detail records. Possible values are:     * default:Let the CDR system use its default value.     * omit:Do not record calls.     * billing:Mark the entry for billing     * documentation:Mark the entry for documentation.    amaflags=billing
	* @behavior.fieldname amaflags 
	**/
	public String getAmaflags();
	
	/**
	*setamaflags 
	* Sets the AMA flags, affecting the categorization of entries in the call detail records. Possible values are:     * default:Let the CDR system use its default value.     * omit:Do not record calls.     * billing:Mark the entry for billing     * documentation:Mark the entry for documentation.    amaflags=billing
	* @behavior.fieldname amaflags 
	*/
	public void setAmaflags(String aamaflags);


}