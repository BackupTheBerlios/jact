

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetCDRUserField<br>
 * [Description] SetCDRUserField(value): Set the CDR 'user field' to value  The Call Data Record (CDR) user field is an extra field you  can use for data not stored anywhere else in the record.  CDR records can be used for billing or storing other arbitrary data  (I.E. telephone survey responses)  Also see AppendCDRUserField().  Always returns 0
 * </p>
 * Created : Wed Jul 05 18:54:34 CEST 2006
 * 
 * @behavior.elementname SetCDRUserField
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetCDRUserField.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ISetCDRUserField {
public static final String MODELNAME = "SetCDRUserField";	
 
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