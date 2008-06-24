

package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IVoicemailConf<br>
 * The voicemail.conf file contains one general section, one zonemessages section and one or more user-defined context sections. The general section holds global configuration informaton. The zonemessages section defines time zones and time reporting formats, and the context sections which follow define groups of users within a specific context. For example, in the above case, two context sections are defined: default and another_context. 
 * </p>
 * Created : Fri May 26 14:30:30 CEST 2006
 * 
 * @behavior.elementname VoicemailConf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IVoicemailConf.java,v 1.1 2008/06/24 20:45:17 urszeidler Exp $
 */
 public  interface  IVoicemailConf {
public static final String MODELNAME = "VoicemailConf";	

/**
 * gibt die List<Voicemailcontext> voicemailcontextMap zurück	
 * @return List<Voicemailcontext>
 * @behavior.list VoicemailcontextMap 
 * @behavior.list.type Voicemailcontext 
 */
public List getVoicemailcontextMap();
/**
 * setzt die Map VoicemailcontextMap
 * @param map voicemailcontextMapMap
 * @behavior.list VoicemailcontextMap 
 * @behavior.list.type Voicemailcontext 
 */
public void setVoicemailcontextMap(List aList);

/**
 * gibt die List<Zonemessages> zonemessagesMap zurück	
 * @return List<Zonemessages>
 * @behavior.list ZonemessagesMap 
 * @behavior.list.type Zonemessages 
 */
public List getZonemessagesMap();
/**
 * setzt die Map ZonemessagesMap
 * @param map zonemessagesMapMap
 * @behavior.list ZonemessagesMap 
 * @behavior.list.type Zonemessages 
 */
public void setZonemessagesMap(List aList);
 
// ------   1-1 aggregates
/**
 * @return Voicemailgeneral the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Voicemailgeneral 
 */
public IVoicemailgeneral getVoicemailgeneral();

/**
 * setzt den Voicemailgeneral und die Voicemailgeneralid	
 * @param Voicemailgeneral
 */
public void setVoicemailgeneral(IVoicemailgeneral aVoicemailgeneral);
	
	//---------  getter und setter

}