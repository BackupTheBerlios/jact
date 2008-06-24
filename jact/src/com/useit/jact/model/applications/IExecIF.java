

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IExecIF<br>
 * If <expr> is true, execute and return the result of <app>(<data>)
 * </p>
 * Created : Wed Jul 05 18:54:55 CEST 2006
 * 
 * @behavior.elementname ExecIF
 * @author urs
 * @version $Revision: 1.1 $, $Id: IExecIF.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IExecIF {
public static final String MODELNAME = "ExecIF";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_EXPR="expr" ;
// 	public static final String VALUEID_APP="app" ;
// 	public static final String VALUEID_DATA="data" ;
	//test
	//---------  getter und setter
	/**
	* getexpr 
	* 
	* @behavior.fieldname expr 
	**/
	public String getExpr();
	
	/**
	*setexpr 
	* 
	* @behavior.fieldname expr 
	*/
	public void setExpr(String aexpr);
	/**
	* getapp 
	* 
	* @behavior.fieldname app 
	**/
	public String getApp();
	
	/**
	*setapp 
	* 
	* @behavior.fieldname app 
	*/
	public void setApp(String aapp);
	/**
	* getdata 
	* 
	* @behavior.fieldname data 
	**/
	public String getData();
	
	/**
	*setdata 
	* 
	* @behavior.fieldname data 
	*/
	public void setData(String adata);

}