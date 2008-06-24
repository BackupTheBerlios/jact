

package com.useit.jact.model.musiconholdconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IMusic_on_HoldConf<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:32 CEST 2006
 * 
 * @behavior.elementname Music_on_HoldConf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMusic_on_HoldConf.java,v 1.1 2008/06/24 20:45:26 urszeidler Exp $
 */
 public  interface  IMusic_on_HoldConf {
public static final String MODELNAME = "Music_on_HoldConf";	

/**
 * gibt die List<MohClasses> mohClassesMap zurück	
 * @return List<MohClasses>
 * @behavior.list MohClassesMap 
 * @behavior.list.type MohClasses 
 */
public List getMohClassesMap();
/**
 * setzt die Map MohClassesMap
 * @param map mohClassesMapMap
 * @behavior.list MohClassesMap 
 * @behavior.list.type MohClasses 
 */
public void setMohClassesMap(List aList);
 
// ------   1-1 aggregates
	
	//---------  getter und setter

}