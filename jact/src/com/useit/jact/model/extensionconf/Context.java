package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Context<br>
 * The Dialplan constists of collection of contexts. These context definitions are the most important part of the extensions.conf file and are the most important part of Asterisk configuration. A context is just a collection of extensions.
 * </p>
 * Created : Fri May 26 17:18:26 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Context.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Context extends AbstractSimpleDataClass implements IContext{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Context
	**/
	public Context(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Context
	**/
	public Context( String acontextname, String aignorepat){
		super();
	
		this.ignorepat = aignorepat;	
		this.contextname = acontextname;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Context object){
		this.ignorepat = object.ignorepat;	
		this.contextname = object.contextname;	

	}
//--------------  map Funktionen
	//public static final String EXTENSIONMAP = "extensionMap";
	/** die typisierte List die die Aggregierten objekte(ExtensionImpl) enthält */
	protected List<Extension> extensionMap = new ArrayList<Extension>();
	//public static final String INCLUDECONTEXTMAP = "includecontextMap";
	/** die typisierte List die die Aggregierten objekte(IncludecontextImpl) enthält */
	protected List<Includecontext> includecontextMap = new ArrayList<Includecontext>();
	//public static final String SWITCHMAP = "switchMap";
	/** die typisierte List die die Aggregierten objekte(SwitchImpl) enthält */
	protected List<Switch> switchMap = new ArrayList<Switch>();
	/** die typisierte Map die die Aggregierten objekte(ExtensionImpl) enthält */
	//protected ExtensionMap extensionMapMap = new ExtensionMap();
	/** die typisierte Map die die Aggregierten objekte(IncludecontextImpl) enthält */
	//protected IncludecontextMap includecontextMapMap = new IncludecontextMap();
	/** die typisierte Map die die Aggregierten objekte(SwitchImpl) enthält */
	//protected SwitchMap switchMapMap = new SwitchMap();

	/**
	 * fügt ein Extension Objekt zu der Mapp hinzu
	 * @param aExtension
	 */
	public boolean addExtension(Extension aExtension){
		return extensionMap.add(aExtension);
	}

	/**
	 * removed ein Extension Objekt aus der Map
	 * @param aExtension
	 */
	public boolean removeExtension(Extension aExtension){
		return extensionMap.remove(aExtension);
	}


	/**
	 * fügt ein Includecontext Objekt zu der Mapp hinzu
	 * @param aIncludecontext
	 */
	public boolean addIncludecontext(Includecontext aIncludecontext){
		return includecontextMap.add(aIncludecontext);
	}

	/**
	 * removed ein Includecontext Objekt aus der Map
	 * @param aIncludecontext
	 */
	public boolean removeIncludecontext(Includecontext aIncludecontext){
		return includecontextMap.remove(aIncludecontext);
	}


	/**
	 * fügt ein Switch Objekt zu der Mapp hinzu
	 * @param aSwitch
	 */
	public boolean addSwitch(Switch aSwitch){
		return switchMap.add(aSwitch);
	}

	/**
	 * removed ein Switch Objekt aus der Map
	 * @param aSwitch
	 */
	public boolean removeSwitch(Switch aSwitch){
		return switchMap.remove(aSwitch);
	}

	

/**
 * gibt die List<Extension> extensionMap zurück	
 * @return List<Extension>
 * @see  IContext#getExtensionMap
 */
public List<Extension> getExtensionMap() {
	return extensionMap;
}
/**
 * setzt die Map ExtensionMap
 * @param map extensionMapMap
 */
 @SuppressWarnings("unchecked")
public void setExtensionMap(List aList){
    extensionMap = aList;
   // extensionMapTyper.setList(aList); 
}


/**
 * gibt die List<Includecontext> includecontextMap zurück	
 * @return List<Includecontext>
 * @see  IContext#getIncludecontextMap
 */
public List<Includecontext> getIncludecontextMap() {
	return includecontextMap;
}
/**
 * setzt die Map IncludecontextMap
 * @param map includecontextMapMap
 */
 @SuppressWarnings("unchecked")
public void setIncludecontextMap(List aList){
    includecontextMap = aList;
   // includecontextMapTyper.setList(aList); 
}


/**
 * gibt die List<Switch> switchMap zurück	
 * @return List<Switch>
 * @see  IContext#getSwitchMap
 */
public List<Switch> getSwitchMap() {
	return switchMap;
}
/**
 * setzt die Map SwitchMap
 * @param map switchMapMap
 */
 @SuppressWarnings("unchecked")
public void setSwitchMap(List aList){
    switchMap = aList;
   // switchMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String ignorepat;
	public static final String VALUEID_IGNOREPAT="ignorepat" ;

    /**   **/
	protected String contextname;
	public static final String VALUEID_CONTEXTNAME="contextname" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_IGNOREPAT.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXTNAME.equals(valueid)){
			return true;
		}
	    return false;
	}
	
	/**
	 * setzt einen Wert per valueid
	 * @param valueid
	 * @param data
	 */
	public void setByValue(String valueid,Object data){
		if(VALUEID_IGNOREPAT.equals(valueid)){
			setIgnorepat((String)data);
			return;
		}
		if(VALUEID_CONTEXTNAME.equals(valueid)){
			setContextname((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_IGNOREPAT.equals(valueid)){
			return getIgnorepat();
			
		}
		if(VALUEID_CONTEXTNAME.equals(valueid)){
			return getContextname();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getignorepat 
	* 
	**/
	public String getIgnorepat(){		return  ignorepat;
	}
	/**
	*setignorepat 
	*/
	public void setIgnorepat(String aignorepat){
		if(aignorepat==null){
		    changed = (this.ignorepat!=null);
		    this.ignorepat = null;	    
		}else{
			changed = aignorepat.equals(this.ignorepat);
			this.ignorepat=aignorepat;
		}
	}


	/**
	* getcontextname 
	* 
	**/
	public String getContextname(){		return  contextname;
	}
	/**
	*setcontextname 
	*/
	public void setContextname(String acontextname){
		if(acontextname==null){
		    changed = (this.contextname!=null);
		    this.contextname = null;	    
		}else{
			changed = acontextname.equals(this.contextname);
			this.contextname=acontextname;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("ignorepat=")
		.append(ignorepat)
		.append(",")
		.append("contextname=")
		.append(contextname)
    			.append("]");

		return sb.toString();		
	}}