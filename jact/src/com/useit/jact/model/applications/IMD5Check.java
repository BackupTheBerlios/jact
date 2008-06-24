

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMD5Check<br>
 * Calculates a MD5 checksum on <string> and compares it with the hash. Returns 0 if <md5hash> is correct for <string>. Jumps to priority+101 if incorrect.
 * </p>
 * Created : Wed Jul 05 18:55:13 CEST 2006
 * 
 * @behavior.elementname MD5Check
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMD5Check.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IMD5Check {
public static final String MODELNAME = "MD5Check";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_MD5HASH="md5hash" ;
// 	public static final String VALUEID_STRING="string" ;
	//test
	//---------  getter und setter
	/**
	* getmd5hash 
	* 
	* @behavior.fieldname md5hash 
	**/
	public String getMd5hash();
	
	/**
	*setmd5hash 
	* 
	* @behavior.fieldname md5hash 
	*/
	public void setMd5hash(String amd5hash);
	/**
	* getstring 
	* 
	* @behavior.fieldname string 
	**/
	public String getString();
	
	/**
	*setstring 
	* 
	* @behavior.fieldname string 
	*/
	public void setString(String astring);

}