

package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IZaptelspan<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:32 CEST 2006
 * 
 * @behavior.elementname Zaptelspan
 * @author urs
 * @version $Revision: 1.1 $, $Id: IZaptelspan.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IZaptelspan {
public static final String MODELNAME = "Zaptelspan";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_SPAN_NUM="span_num" ;
// 	public static final String VALUEID_TIMING="timing" ;
// 	public static final String VALUEID_LBO="lbo" ;
// 	public static final String VALUEID_FRAMING="framing" ;
// 	public static final String VALUEID_CODING="coding" ;
// 	public static final String VALUEID_YELLOW="yellow" ;
	
	//---------  getter und setter

	/**
	* getspan_num 
	* 
	* @behavior.fieldname span_num 
	**/
	public Integer getSpan_num();
	
	/**
	*setspan_num 
	* 
	* @behavior.fieldname span_num 
	*/
	public void setSpan_num(Integer aspan_num);


	/**
	* gettiming 
	* The timing parameter determines the selection of primary, secondary, and so on sync sources.  If this span should be considered a primary sync source, then give it a value of "1".  For a secondary, use "2", and so on. To not use this as a sync source, just use "0" 
	* @behavior.fieldname timing 
	**/
	public Integer getTiming();
	
	/**
	*settiming 
	* The timing parameter determines the selection of primary, secondary, and so on sync sources.  If this span should be considered a primary sync source, then give it a value of "1".  For a secondary, use "2", and so on. To not use this as a sync source, just use "0" 
	* @behavior.fieldname timing 
	*/
	public void setTiming(Integer atiming);


	/**
	* getlbo 
	* The line build-out (or LBO) is an integer, from the following table: 0: 0 db (CSU) / 0-133 feet (DSX-1) 1: 133-266 feet (DSX-1) 2: 266-399 feet (DSX-1) 3: 399-533 feet (DSX-1) 4: 533-655 feet (DSX-1) 5: -7.5db (CSU) 6: -15db (CSU) 7: -22.5db (CSU) 
	* @behavior.fieldname lbo 
	**/
	public Integer getLbo();
	
	/**
	*setlbo 
	* The line build-out (or LBO) is an integer, from the following table: 0: 0 db (CSU) / 0-133 feet (DSX-1) 1: 133-266 feet (DSX-1) 2: 266-399 feet (DSX-1) 3: 399-533 feet (DSX-1) 4: 533-655 feet (DSX-1) 5: -7.5db (CSU) 6: -15db (CSU) 7: -22.5db (CSU) 
	* @behavior.fieldname lbo 
	*/
	public void setLbo(Integer albo);


	/**
	* getframing 
	* The framing is one of "d4" or "esf" for T1 or "cas" or "ccs" for E1  Note: "d4" could be referred to as "sf" or "superframe" 
	* @behavior.fieldname framing 
	**/
	public String getFraming();
	
	/**
	*setframing 
	* The framing is one of "d4" or "esf" for T1 or "cas" or "ccs" for E1  Note: "d4" could be referred to as "sf" or "superframe" 
	* @behavior.fieldname framing 
	*/
	public void setFraming(String aframing);


	/**
	* getcoding 
	* The coding is one of "ami" or "b8zs" for T1 or "ami" or "hdb3" for E1 E1's may have the additional keyword "crc4" to enable CRC4 checking
	* @behavior.fieldname coding 
	**/
	public String getCoding();
	
	/**
	*setcoding 
	* The coding is one of "ami" or "b8zs" for T1 or "ami" or "hdb3" for E1 E1's may have the additional keyword "crc4" to enable CRC4 checking
	* @behavior.fieldname coding 
	*/
	public void setCoding(String acoding);


	/**
	* getyellow 
	* If the keyword "yellow" follows, yellow alarm is transmitted when no channels are open.
	* @behavior.fieldname yellow 
	**/
	public String getYellow();
	
	/**
	*setyellow 
	* If the keyword "yellow" follows, yellow alarm is transmitted when no channels are open.
	* @behavior.fieldname yellow 
	*/
	public void setYellow(String ayellow);


}