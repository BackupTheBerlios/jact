package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SIPAddHeader<br>
 * Adds a header to a SIP call placed with DIAL. Remember to user the X-header if you are adding non-standard SIP headers, like "X-Asterisk-Accuntcode:". Use this with care. Adding the wrong headers may jeopardize the SIP dialog. Always returns 0
 * </p>
 * Created : Sun Jul 09 18:51:18 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SIPAddHeader.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SIPAddHeader extends PbxApplication implements ISIPAddHeader{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SIPAddHeader
	**/
	public SIPAddHeader(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SIPAddHeader
	**/
	public SIPAddHeader( String aheader, String acontent){
		super();
	
		this.header = aheader;	
		this.content = acontent;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SIPAddHeader object){
		this.header = object.header;	
		this.content = object.content;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String header;
	public static final String VALUEID_HEADER="header" ;

    /**   **/
	protected String content;
	public static final String VALUEID_CONTENT="content" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_HEADER.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTENT.equals(valueid)){
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
		if(VALUEID_HEADER.equals(valueid)){
			setHeader((String)data);
			return;
		}
		if(VALUEID_CONTENT.equals(valueid)){
			setContent((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_HEADER.equals(valueid)){
			return getHeader();
			
		}
		if(VALUEID_CONTENT.equals(valueid)){
			return getContent();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getheader 
	* 
	**/
	public String getHeader(){		return  header;
	}
	/**
	*setheader 
	*/
	public void setHeader(String aheader){
		if(aheader==null){
		    changed = (this.header!=null);
		    this.header = null;	    
		}else{
			changed = aheader.equals(this.header);
			this.header=aheader;
		}
	}


	/**
	* getcontent 
	* 
	**/
	public String getContent(){		return  content;
	}
	/**
	*setcontent 
	*/
	public void setContent(String acontent){
		if(acontent==null){
		    changed = (this.content!=null);
		    this.content = null;	    
		}else{
			changed = acontent.equals(this.content);
			this.content=acontent;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SIPAddHeader, ")		
		//.append("header=")
		.append(header)
		.append(",")
		//.append("content=")
		.append(content)
    			.append("");

		return sb.toString();		
	}
}