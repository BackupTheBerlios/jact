package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.PbxContext;


/**
 * <p>
 * Includecontext<br>
 * 
 * </p>
 * Created : Fri May 26 17:18:26 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Includecontext.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Includecontext extends AbstractSimpleDataClass implements IIncludecontext{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Includecontext
	**/
	public Includecontext(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Includecontext
	**/
	public Includecontext( PbxContext acontexname, String atimeing){
		super();
	
		this.contexname = acontexname;	
		this.timeing = atimeing;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Includecontext object){
		this.contexname = object.contexname;	
		this.timeing = object.timeing;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected PbxContext contexname;
	public static final String VALUEID_CONTEXNAME="contexname" ;

    /**  <time range>|<days of week>|<days of month>|<months> **/
	protected String timeing;
	public static final String VALUEID_TIMEING="timeing" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CONTEXNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_TIMEING.equals(valueid)){
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
		if(VALUEID_CONTEXNAME.equals(valueid)){
			if(data instanceof String){
		        setContexname(new PbxContext((String)data));
		        return;
		    }
			setContexname((PbxContext)data);
			return;
		}
		if(VALUEID_TIMEING.equals(valueid)){
			setTimeing((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CONTEXNAME.equals(valueid)){
			return getContexname();
			
		}
		if(VALUEID_TIMEING.equals(valueid)){
			return getTimeing();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcontexname 
	* 
	**/
	public PbxContext getContexname(){		return  contexname;
	}
	/**
	*setcontexname 
	*/
	public void setContexname(PbxContext acontexname){
		if(acontexname==null){
		    changed = (this.contexname!=null);
		    this.contexname = null;	    
		}else{
			changed = acontexname.equals(this.contexname);
			this.contexname=acontexname;
		}
	}


	/**
	* gettimeing 
	* <time range>|<days of week>|<days of month>|<months>
	**/
	public String getTimeing(){		return  timeing;
	}
	/**
	*settimeing 
	*/
	public void setTimeing(String atimeing){
		if(atimeing==null){
		    changed = (this.timeing!=null);
		    this.timeing = null;	    
		}else{
			changed = atimeing.equals(this.timeing);
			this.timeing=atimeing;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("contexname=")
		.append(contexname)
		.append(",")
		.append("timeing=")
		.append(timeing)
    			.append("]");

		return sb.toString();		
	}}