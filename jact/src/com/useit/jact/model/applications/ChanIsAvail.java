package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ChanIsAvail<br>
 * Checks is any of the requested channels are available. If none of the requested channels are available the new priority will be n+101 (unless such a priority does not exist or on error, in which case ChanIsAvail will return -1). If any of the requested channels are available, the next priority will be n+1, the channel variable ${AVAILCHAN} will be set to the name of the available channel and the ChanIsAvail app will return 0. ${AVAILORIGCHAN} is the canonical channel name that was used to create the channel. ${AVAILSTATUS} is the status code for the channel. If the option 's' is specified (state), will consider channel unavailable when the channel is in use at all, even if it can take another call.
 * </p>
 * Created : Sun Jul 09 18:48:46 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ChanIsAvail.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class ChanIsAvail extends PbxApplication implements IChanIsAvail{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ChanIsAvail
	**/
	public ChanIsAvail(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ChanIsAvail
	**/
	public ChanIsAvail( String aformatstr, String atechnology, String aresource, String atechnology2, String aresource2, String aoption){
		super();
	
		this.formatstr = aformatstr;	
		this.technology = atechnology;	
		this.resource = aresource;	
		this.technology2 = atechnology2;	
		this.resource2 = aresource2;	
		this.option = aoption;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ChanIsAvail object){
		this.formatstr = object.formatstr;	
		this.technology = object.technology;	
		this.resource = object.resource;	
		this.technology2 = object.technology2;	
		this.resource2 = object.resource2;	
		this.option = object.option;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String formatstr;
	public static final String VALUEID_FORMATSTR="formatstr" ;

    /**   **/
	protected String technology;
	public static final String VALUEID_TECHNOLOGY="technology" ;

    /**   **/
	protected String resource;
	public static final String VALUEID_RESOURCE="resource" ;

    /**   **/
	protected String technology2;
	public static final String VALUEID_TECHNOLOGY2="technology2" ;

    /**   **/
	protected String resource2;
	public static final String VALUEID_RESOURCE2="resource2" ;

    /**   **/
	protected String option;
	public static final String VALUEID_OPTION="option" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FORMATSTR.equals(valueid)){
			return true;
		}
		if(VALUEID_TECHNOLOGY.equals(valueid)){
			return true;
		}
		if(VALUEID_RESOURCE.equals(valueid)){
			return true;
		}
		if(VALUEID_TECHNOLOGY2.equals(valueid)){
			return true;
		}
		if(VALUEID_RESOURCE2.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTION.equals(valueid)){
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
		if(VALUEID_FORMATSTR.equals(valueid)){
			setFormatstr((String)data);
			return;
		}
		if(VALUEID_TECHNOLOGY.equals(valueid)){
			setTechnology((String)data);
			return;
		}
		if(VALUEID_RESOURCE.equals(valueid)){
			setResource((String)data);
			return;
		}
		if(VALUEID_TECHNOLOGY2.equals(valueid)){
			setTechnology2((String)data);
			return;
		}
		if(VALUEID_RESOURCE2.equals(valueid)){
			setResource2((String)data);
			return;
		}
		if(VALUEID_OPTION.equals(valueid)){
			setOption((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_FORMATSTR.equals(valueid)){
			return getFormatstr();
			
		}
		if(VALUEID_TECHNOLOGY.equals(valueid)){
			return getTechnology();
			
		}
		if(VALUEID_RESOURCE.equals(valueid)){
			return getResource();
			
		}
		if(VALUEID_TECHNOLOGY2.equals(valueid)){
			return getTechnology2();
			
		}
		if(VALUEID_RESOURCE2.equals(valueid)){
			return getResource2();
			
		}
		if(VALUEID_OPTION.equals(valueid)){
			return getOption();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getformatstr 
	* 
	**/
	public String getFormatstr(){		return  formatstr;
	}
	/**
	*setformatstr 
	*/
	public void setFormatstr(String aformatstr){
		if(aformatstr==null){
		    changed = (this.formatstr!=null);
		    this.formatstr = null;	    
		}else{
			changed = aformatstr.equals(this.formatstr);
			this.formatstr=aformatstr;
		}
	}


	/**
	* gettechnology 
	* 
	**/
	public String getTechnology(){		return  technology;
	}
	/**
	*settechnology 
	*/
	public void setTechnology(String atechnology){
		if(atechnology==null){
		    changed = (this.technology!=null);
		    this.technology = null;	    
		}else{
			changed = atechnology.equals(this.technology);
			this.technology=atechnology;
		}
	}


	/**
	* getresource 
	* 
	**/
	public String getResource(){		return  resource;
	}
	/**
	*setresource 
	*/
	public void setResource(String aresource){
		if(aresource==null){
		    changed = (this.resource!=null);
		    this.resource = null;	    
		}else{
			changed = aresource.equals(this.resource);
			this.resource=aresource;
		}
	}


	/**
	* gettechnology2 
	* 
	**/
	public String getTechnology2(){		return  technology2;
	}
	/**
	*settechnology2 
	*/
	public void setTechnology2(String atechnology2){
		if(atechnology2==null){
		    changed = (this.technology2!=null);
		    this.technology2 = null;	    
		}else{
			changed = atechnology2.equals(this.technology2);
			this.technology2=atechnology2;
		}
	}


	/**
	* getresource2 
	* 
	**/
	public String getResource2(){		return  resource2;
	}
	/**
	*setresource2 
	*/
	public void setResource2(String aresource2){
		if(aresource2==null){
		    changed = (this.resource2!=null);
		    this.resource2 = null;	    
		}else{
			changed = aresource2.equals(this.resource2);
			this.resource2=aresource2;
		}
	}


	/**
	* getoption 
	* 
	**/
	public String getOption(){		return  option;
	}
	/**
	*setoption 
	*/
	public void setOption(String aoption){
		if(aoption==null){
		    changed = (this.option!=null);
		    this.option = null;	    
		}else{
			changed = aoption.equals(this.option);
			this.option=aoption;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ChanIsAvail, ")		
		//.append("formatstr=")
		.append(formatstr)
		.append(",")
		//.append("technology=")
		.append(technology)
		.append(",")
		//.append("resource=")
		.append(resource)
		.append(",")
		//.append("technology2=")
		.append(technology2)
		.append(",")
		//.append("resource2=")
		.append(resource2)
		.append(",")
		//.append("option=")
		.append(option)
    			.append("");

		return sb.toString();		
	}
}