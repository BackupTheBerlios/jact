

package com.useit.jact.model.musiconholdconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMohClasses<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:32 CEST 2006
 * 
 * @behavior.elementname MohClasses
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMohClasses.java,v 1.1 2008/06/24 20:45:26 urszeidler Exp $
 */
 public  interface  IMohClasses {
public static final String MODELNAME = "MohClasses";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_NAME="name" ;
// 	public static final String VALUEID_PLAYER="player" ;
// 	public static final String VALUEID_MOHDIR="mohdir" ;
// 	public static final String VALUEID_MOHPARA="mohpara" ;
	
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
	* getplayer 
	* 
	* @behavior.fieldname player 
	**/
	public String getPlayer();
	
	/**
	*setplayer 
	* 
	* @behavior.fieldname player 
	*/
	public void setPlayer(String aplayer);


	/**
	* getmohdir 
	* 
	* @behavior.fieldname mohdir 
	**/
	public String getMohdir();
	
	/**
	*setmohdir 
	* 
	* @behavior.fieldname mohdir 
	*/
	public void setMohdir(String amohdir);


	/**
	* getmohpara 
	* 
	* @behavior.fieldname mohpara 
	**/
	public String getMohpara();
	
	/**
	*setmohpara 
	* 
	* @behavior.fieldname mohpara 
	*/
	public void setMohpara(String amohpara);


}