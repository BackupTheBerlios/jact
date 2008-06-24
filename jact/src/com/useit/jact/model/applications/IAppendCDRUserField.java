

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAppendCDRUserField<br>
 * [Description] AppendCDRUserField(value): Append value to the CDR user field  The Call Data Record (CDR) user field is an extra field you  can use for data not stored anywhere else in the record.  CDR records can be used for billing or storing other arbitrary data  (I.E. telephone survey responses)  Also see SetCDRUserField().  Always returns 0
 * </p>
 * Created : Wed Jul 05 18:53:52 CEST 2006
 * 
 * @behavior.elementname AppendCDRUserField
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAppendCDRUserField.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IAppendCDRUserField {
public static final String MODELNAME = "AppendCDRUserField";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_VALUE="value" ;
	//test
	//---------  getter und setter
	/**
	* getvalue 
	* 
	* @behavior.fieldname value 
	**/
	public String getValue();
	
	/**
	*setvalue 
	* 
	* @behavior.fieldname value 
	*/
	public void setValue(String avalue);

}