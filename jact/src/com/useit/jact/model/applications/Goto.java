package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.AbstractExtension;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Goto<br>
 * Set the priority to the specified value, optionally setting the extension and optionally the context as well. The extension BYEXTENSION is special in that it uses the current extension, thus permitting you to go to a different context, without specifying a specific extension. Always returns 0, even if the given context, extension, or priority is invalid.
 * </p>
 * Created : Sun Jul 09 18:50:30 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Goto.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class Goto extends PbxApplication implements IGoto{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Goto
	**/
	public Goto(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Goto
	**/
	public Goto( String acontext, AbstractExtension aextension, String apriority){
		super();
	
		this.context = acontext;	
		this.extension = aextension;	
		this.priority = apriority;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Goto object){
		this.context = object.context;	
		this.extension = object.extension;	
		this.priority = object.priority;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String context;
	public static final String VALUEID_CONTEXT="context" ;

    /**   **/
	protected AbstractExtension extension;
	public static final String VALUEID_EXTENSION="extension" ;

    /**   **/
	protected String priority;
	public static final String VALUEID_PRIORITY="priority" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			return true;
		}
		if(VALUEID_PRIORITY.equals(valueid)){
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
		if(VALUEID_CONTEXT.equals(valueid)){
			setContext((String)data);
			return;
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			if(data instanceof String){
		        setExtension(new AbstractExtension((String)data));
		        return;
		    }
			setExtension((AbstractExtension)data);
			return;
		}
		if(VALUEID_PRIORITY.equals(valueid)){
			setPriority((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			return getExtension();
			
		}
		if(VALUEID_PRIORITY.equals(valueid)){
			return getPriority();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcontext 
	* 
	**/
	public String getContext(){		return  context;
	}
	/**
	*setcontext 
	*/
	public void setContext(String acontext){
		if(acontext==null){
		    changed = (this.context!=null);
		    this.context = null;	    
		}else{
			changed = acontext.equals(this.context);
			this.context=acontext;
		}
	}


	/**
	* getextension 
	* 
	**/
	public AbstractExtension getExtension(){		return  extension;
	}
	/**
	*setextension 
	*/
	public void setExtension(AbstractExtension aextension){
		if(aextension==null){
		    changed = (this.extension!=null);
		    this.extension = null;	    
		}else{
			changed = aextension.equals(this.extension);
			this.extension=aextension;
		}
	}


	/**
	* getpriority 
	* 
	**/
	public String getPriority(){		return  priority;
	}
	/**
	*setpriority 
	*/
	public void setPriority(String apriority){
		if(apriority==null){
		    changed = (this.priority!=null);
		    this.priority = null;	    
		}else{
			changed = apriority.equals(this.priority);
			this.priority=apriority;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Goto, ")		
		//.append("context=")
		.append(context)
		.append(",")
		//.append("extension=")
		.append(extension)
		.append(",")
		//.append("priority=")
		.append(priority)
    			.append("");

		return sb.toString();		
	}
}