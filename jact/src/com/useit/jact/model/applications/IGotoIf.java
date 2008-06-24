

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.AbstractExtension;


/**
 * <p>
 * IGotoIf<br>
 * Go to label 1 if condition is true, to label2 if condition is false. Either label1 or label2 may be omitted (in that case, we just don't take the particular branch) but not both. Look for the condition syntax in examples or documentation.
 * </p>
 * Created : Wed Jul 05 18:54:53 CEST 2006
 * 
 * @behavior.elementname GotoIf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IGotoIf.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IGotoIf {
public static final String MODELNAME = "GotoIf";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CONDITION="condition" ;
// 	public static final String VALUEID_LABEL1="label1" ;
// 	public static final String VALUEID_EXTENSION2="extension2" ;
// 	public static final String VALUEID_EXTENSION1="extension1" ;
// 	public static final String VALUEID_LABEL2="label2" ;
	//test
	//---------  getter und setter
	/**
	* getcondition 
	* 
	* @behavior.fieldname condition 
	**/
	public String getCondition();
	
	/**
	*setcondition 
	* 
	* @behavior.fieldname condition 
	*/
	public void setCondition(String acondition);
	/**
	* getlabel1 
	* 
	* @behavior.fieldname label1 
	**/
	public String getLabel1();
	
	/**
	*setlabel1 
	* 
	* @behavior.fieldname label1 
	*/
	public void setLabel1(String alabel1);
	/**
	* getextension2 
	* 
	* @behavior.fieldname extension2 
	**/
	public AbstractExtension getExtension2();
	
	/**
	*setextension2 
	* 
	* @behavior.fieldname extension2 
	*/
	public void setExtension2(AbstractExtension aextension2);
	/**
	* getextension1 
	* 
	* @behavior.fieldname extension1 
	**/
	public AbstractExtension getExtension1();
	
	/**
	*setextension1 
	* 
	* @behavior.fieldname extension1 
	*/
	public void setExtension1(AbstractExtension aextension1);
	/**
	* getlabel2 
	* 
	* @behavior.fieldname label2 
	**/
	public String getLabel2();
	
	/**
	*setlabel2 
	* 
	* @behavior.fieldname label2 
	*/
	public void setLabel2(String alabel2);

}