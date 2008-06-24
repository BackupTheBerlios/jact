package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ImportVar<br>
 * Sets variable n to variable as evaluated on the specified channel (instead of current). If prefixed with _, single inheritance assumed. If prefixed with __, infinite inheritance is assumed.
 * </p>
 * Created : Sun Jul 09 18:51:10 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ImportVar.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class ImportVar extends PbxApplication implements IImportVar{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ImportVar
	**/
	public ImportVar(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ImportVar
	**/
	public ImportVar( String an, String achannel, String avariable){
		super();
	
		this.n = an;	
		this.channel = achannel;	
		this.variable = avariable;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ImportVar object){
		this.n = object.n;	
		this.channel = object.channel;	
		this.variable = object.variable;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String n;
	public static final String VALUEID_N="n" ;

    /**   **/
	protected String channel;
	public static final String VALUEID_CHANNEL="channel" ;

    /**   **/
	protected String variable;
	public static final String VALUEID_VARIABLE="variable" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_N.equals(valueid)){
			return true;
		}
		if(VALUEID_CHANNEL.equals(valueid)){
			return true;
		}
		if(VALUEID_VARIABLE.equals(valueid)){
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
		if(VALUEID_N.equals(valueid)){
			setN((String)data);
			return;
		}
		if(VALUEID_CHANNEL.equals(valueid)){
			setChannel((String)data);
			return;
		}
		if(VALUEID_VARIABLE.equals(valueid)){
			setVariable((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_N.equals(valueid)){
			return getN();
			
		}
		if(VALUEID_CHANNEL.equals(valueid)){
			return getChannel();
			
		}
		if(VALUEID_VARIABLE.equals(valueid)){
			return getVariable();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getn 
	* 
	**/
	public String getN(){		return  n;
	}
	/**
	*setn 
	*/
	public void setN(String an){
		if(an==null){
		    changed = (this.n!=null);
		    this.n = null;	    
		}else{
			changed = an.equals(this.n);
			this.n=an;
		}
	}


	/**
	* getchannel 
	* 
	**/
	public String getChannel(){		return  channel;
	}
	/**
	*setchannel 
	*/
	public void setChannel(String achannel){
		if(achannel==null){
		    changed = (this.channel!=null);
		    this.channel = null;	    
		}else{
			changed = achannel.equals(this.channel);
			this.channel=achannel;
		}
	}


	/**
	* getvariable 
	* 
	**/
	public String getVariable(){		return  variable;
	}
	/**
	*setvariable 
	*/
	public void setVariable(String avariable){
		if(avariable==null){
		    changed = (this.variable!=null);
		    this.variable = null;	    
		}else{
			changed = avariable.equals(this.variable);
			this.variable=avariable;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ImportVar, ")		
		//.append("n=")
		.append(n)
		.append(",")
		//.append("channel=")
		.append(channel)
		.append(",")
		//.append("variable=")
		.append(variable)
    			.append("");

		return sb.toString();		
	}
}