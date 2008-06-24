

package com.useit.jact.model.misdndriverconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.MPortOptionSet;
import com.useit.jact.model.types.MisdnPortOptions;


/**
 * <p>
 * IMisdncardPorts<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:30 CEST 2006
 * 
 * @behavior.elementname MisdncardPorts
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMisdncardPorts.java,v 1.1 2008/06/24 20:45:01 urszeidler Exp $
 */
 public  interface  IMisdncardPorts {
public static final String MODELNAME = "MisdncardPorts";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_PORTN="portn" ;
// 	public static final String VALUEID_PORTOPTION="portoption" ;
// 	public static final String VALUEID_MPORTOPTION="mportoption" ;
	
	//---------  getter und setter

	/**
	* getportN 
	* 
	* @behavior.fieldname portN 
	**/
	public Integer getPortN();
	
	/**
	*setportN 
	* 
	* @behavior.fieldname portN 
	*/
	public void setPortN(Integer aportN);


	/**
	* getportOption 
	* 
	* @behavior.fieldname portOption 
	**/
	public MisdnPortOptions getPortOption();
	
	/**
	*setportOption 
	* 
	* @behavior.fieldname portOption 
	*/
	public void setPortOption(MisdnPortOptions aportOption);


	/**
	* getmPortOption 
	* 
	* @behavior.fieldname mPortOption 
	**/
	public MPortOptionSet getMPortOption();
	
	/**
	*setmPortOption 
	* 
	* @behavior.fieldname mPortOption 
	*/
	public void setMPortOption(MPortOptionSet amPortOption);


}