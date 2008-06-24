package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Extensionconf<br>
 * used by  the pbx_config module. This is where you configure all your   inbound and outbound calls in Asterisk.     This configuration file is reloaded   - With the "extensions reload" command in the CLI  - With the "reload" command (that reloads everything) in the CLI

The "General" category is for certain variables.
 * </p>
 * Created : Fri May 26 17:18:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Extensionconf.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Extensionconf extends AbstractSimpleDataClass implements IExtensionconf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Extensionconf
	**/
	public Extensionconf(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Extensionconf
	**/
	public Extensionconf( Boolean astatic_, Boolean awriteprotect, Boolean aautofallthrough, Boolean aclearglobalvars){
		super();
	
		this.static_ = astatic_;	
		this.writeprotect = awriteprotect;	
		this.autofallthrough = aautofallthrough;	
		this.clearglobalvars = aclearglobalvars;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Extensionconf object){
		this.static_ = object.static_;	
		this.writeprotect = object.writeprotect;	
		this.autofallthrough = object.autofallthrough;	
		this.clearglobalvars = object.clearglobalvars;	

	}
//--------------  map Funktionen
	//public static final String CONTEXTMAP = "contextMap";
	/** die typisierte List die die Aggregierten objekte(ContextImpl) enthält */
	protected List<Context> contextMap = new ArrayList<Context>();
	//public static final String GLOBALVARSMAP = "globalvarsMap";
	/** die typisierte List die die Aggregierten objekte(GlobalvarsImpl) enthält */
	protected List<Globalvars> globalvarsMap = new ArrayList<Globalvars>();
	//public static final String INCLUDECONFIGSMAP = "includeconfigsMap";
	/** die typisierte List die die Aggregierten objekte(IncludeconfigsImpl) enthält */
	protected List<Includeconfigs> includeconfigsMap = new ArrayList<Includeconfigs>();
	/** die typisierte Map die die Aggregierten objekte(ContextImpl) enthält */
	//protected ContextMap contextMapMap = new ContextMap();
	/** die typisierte Map die die Aggregierten objekte(GlobalvarsImpl) enthält */
	//protected GlobalvarsMap globalvarsMapMap = new GlobalvarsMap();
	/** die typisierte Map die die Aggregierten objekte(IncludeconfigsImpl) enthält */
	//protected IncludeconfigsMap includeconfigsMapMap = new IncludeconfigsMap();

	/**
	 * fügt ein Context Objekt zu der Mapp hinzu
	 * @param aContext
	 */
	public boolean addContext(Context aContext){
		return contextMap.add(aContext);
	}

	/**
	 * removed ein Context Objekt aus der Map
	 * @param aContext
	 */
	public boolean removeContext(Context aContext){
		return contextMap.remove(aContext);
	}


	/**
	 * fügt ein Globalvars Objekt zu der Mapp hinzu
	 * @param aGlobalvars
	 */
	public boolean addGlobalvars(Globalvars aGlobalvars){
		return globalvarsMap.add(aGlobalvars);
	}

	/**
	 * removed ein Globalvars Objekt aus der Map
	 * @param aGlobalvars
	 */
	public boolean removeGlobalvars(Globalvars aGlobalvars){
		return globalvarsMap.remove(aGlobalvars);
	}


	/**
	 * fügt ein Includeconfigs Objekt zu der Mapp hinzu
	 * @param aIncludeconfigs
	 */
	public boolean addIncludeconfigs(Includeconfigs aIncludeconfigs){
		return includeconfigsMap.add(aIncludeconfigs);
	}

	/**
	 * removed ein Includeconfigs Objekt aus der Map
	 * @param aIncludeconfigs
	 */
	public boolean removeIncludeconfigs(Includeconfigs aIncludeconfigs){
		return includeconfigsMap.remove(aIncludeconfigs);
	}

	

/**
 * gibt die List<Context> contextMap zurück	
 * @return List<Context>
 * @see  IExtensionconf#getContextMap
 */
public List<Context> getContextMap() {
	return contextMap;
}
/**
 * setzt die Map ContextMap
 * @param map contextMapMap
 */
 @SuppressWarnings("unchecked")
public void setContextMap(List aList){
    contextMap = aList;
   // contextMapTyper.setList(aList); 
}


/**
 * gibt die List<Globalvars> globalvarsMap zurück	
 * @return List<Globalvars>
 * @see  IExtensionconf#getGlobalvarsMap
 */
public List<Globalvars> getGlobalvarsMap() {
	return globalvarsMap;
}
/**
 * setzt die Map GlobalvarsMap
 * @param map globalvarsMapMap
 */
 @SuppressWarnings("unchecked")
public void setGlobalvarsMap(List aList){
    globalvarsMap = aList;
   // globalvarsMapTyper.setList(aList); 
}


/**
 * gibt die List<Includeconfigs> includeconfigsMap zurück	
 * @return List<Includeconfigs>
 * @see  IExtensionconf#getIncludeconfigsMap
 */
public List<Includeconfigs> getIncludeconfigsMap() {
	return includeconfigsMap;
}
/**
 * setzt die Map IncludeconfigsMap
 * @param map includeconfigsMapMap
 */
 @SuppressWarnings("unchecked")
public void setIncludeconfigsMap(List aList){
    includeconfigsMap = aList;
   // includeconfigsMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  If static is set to no, or omitted, then the pbx_config will rewrite  this file when extensions are modified.  Remember that all comments  made in the file will be lost when that happens.  XXX Not yet implemented XXX **/
	protected Boolean static_;
	public static final String VALUEID_STATIC_="static_" ;

    /**  if static yes and writeprotect no, you can save dialplan by CLI command 'save dialplan' too **/
	protected Boolean writeprotect;
	public static final String VALUEID_WRITEPROTECT="writeprotect" ;

    /**  If autofallthrough is set, then if an extension runs out of  things to do, it will terminate the call with BUSY, CONGESTION  or HANGUP depending on Asterisk's best guess (strongly recommended).If autofallthrough is not set, then if an extension runs out of   things to do, asterisk will wait for a new extension to be dialed   (this is the original behavior of Asterisk 1.0 and earlier). **/
	protected Boolean autofallthrough;
	public static final String VALUEID_AUTOFALLTHROUGH="autofallthrough" ;

    /**  If clearglobalvars is set, global variables will be cleared   and reparsed on an extensions reload, or Asterisk reload.

If clearglobalvars is not set, then global variables will persist  through reloads, and even if deleted from the extensions.conf or  one if its included files, will remain set to the previous value. **/
	protected Boolean clearglobalvars;
	public static final String VALUEID_CLEARGLOBALVARS="clearglobalvars" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_STATIC_.equals(valueid)){
			return true;
		}
		if(VALUEID_WRITEPROTECT.equals(valueid)){
			return true;
		}
		if(VALUEID_AUTOFALLTHROUGH.equals(valueid)){
			return true;
		}
		if(VALUEID_CLEARGLOBALVARS.equals(valueid)){
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
		if(VALUEID_STATIC_.equals(valueid)){
			if(data instanceof String){
		        setStatic_(new Boolean((String)data));
		        return;
		    }
			setStatic_((Boolean)data);
			return;
		}
		if(VALUEID_WRITEPROTECT.equals(valueid)){
			if(data instanceof String){
		        setWriteprotect(new Boolean((String)data));
		        return;
		    }
			setWriteprotect((Boolean)data);
			return;
		}
		if(VALUEID_AUTOFALLTHROUGH.equals(valueid)){
			if(data instanceof String){
		        setAutofallthrough(new Boolean((String)data));
		        return;
		    }
			setAutofallthrough((Boolean)data);
			return;
		}
		if(VALUEID_CLEARGLOBALVARS.equals(valueid)){
			if(data instanceof String){
		        setClearglobalvars(new Boolean((String)data));
		        return;
		    }
			setClearglobalvars((Boolean)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_STATIC_.equals(valueid)){
			return getStatic_();
			
		}
		if(VALUEID_WRITEPROTECT.equals(valueid)){
			return getWriteprotect();
			
		}
		if(VALUEID_AUTOFALLTHROUGH.equals(valueid)){
			return getAutofallthrough();
			
		}
		if(VALUEID_CLEARGLOBALVARS.equals(valueid)){
			return getClearglobalvars();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getstatic_ 
	* If static is set to no, or omitted, then the pbx_config will rewrite  this file when extensions are modified.  Remember that all comments  made in the file will be lost when that happens.  XXX Not yet implemented XXX
	**/
	public Boolean getStatic_(){		return  static_;
	}
	/**
	*setstatic_ 
	*/
	public void setStatic_(Boolean astatic_){
		if(astatic_==null){
		    changed = (this.static_!=null);
		    this.static_ = null;	    
		}else{
			changed = astatic_.equals(this.static_);
			this.static_=astatic_;
		}
	}


	/**
	* getwriteprotect 
	* if static yes and writeprotect no, you can save dialplan by CLI command 'save dialplan' too
	**/
	public Boolean getWriteprotect(){		return  writeprotect;
	}
	/**
	*setwriteprotect 
	*/
	public void setWriteprotect(Boolean awriteprotect){
		if(awriteprotect==null){
		    changed = (this.writeprotect!=null);
		    this.writeprotect = null;	    
		}else{
			changed = awriteprotect.equals(this.writeprotect);
			this.writeprotect=awriteprotect;
		}
	}


	/**
	* getautofallthrough 
	* If autofallthrough is set, then if an extension runs out of  things to do, it will terminate the call with BUSY, CONGESTION  or HANGUP depending on Asterisk's best guess (strongly recommended).If autofallthrough is not set, then if an extension runs out of   things to do, asterisk will wait for a new extension to be dialed   (this is the original behavior of Asterisk 1.0 and earlier).
	**/
	public Boolean getAutofallthrough(){		return  autofallthrough;
	}
	/**
	*setautofallthrough 
	*/
	public void setAutofallthrough(Boolean aautofallthrough){
		if(aautofallthrough==null){
		    changed = (this.autofallthrough!=null);
		    this.autofallthrough = null;	    
		}else{
			changed = aautofallthrough.equals(this.autofallthrough);
			this.autofallthrough=aautofallthrough;
		}
	}


	/**
	* getclearglobalvars 
	* If clearglobalvars is set, global variables will be cleared   and reparsed on an extensions reload, or Asterisk reload.

If clearglobalvars is not set, then global variables will persist  through reloads, and even if deleted from the extensions.conf or  one if its included files, will remain set to the previous value.
	**/
	public Boolean getClearglobalvars(){		return  clearglobalvars;
	}
	/**
	*setclearglobalvars 
	*/
	public void setClearglobalvars(Boolean aclearglobalvars){
		if(aclearglobalvars==null){
		    changed = (this.clearglobalvars!=null);
		    this.clearglobalvars = null;	    
		}else{
			changed = aclearglobalvars.equals(this.clearglobalvars);
			this.clearglobalvars=aclearglobalvars;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("static_=")
		.append(static_)
		.append(",")
		.append("writeprotect=")
		.append(writeprotect)
		.append(",")
		.append("autofallthrough=")
		.append(autofallthrough)
		.append(",")
		.append("clearglobalvars=")
		.append(clearglobalvars)
    			.append("]");

		return sb.toString();		
	}}