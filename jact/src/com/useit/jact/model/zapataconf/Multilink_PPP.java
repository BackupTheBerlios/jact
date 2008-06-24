package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Multilink_PPP<br>
 * If you have an ISDN PRI, you may be able to run multi-link PPP over it, to provide you with a data connection. Multi-link PPP is a technology that allows channels on a PRI to be dynamically allocated between voice and data. Asterisk can take voice channels allocated to it, dial a Remote Access Server, and dump the channels into a special extension that delivers the channel to the zaptel data layer. Configure the settings here, and then see the ZapRAS command to make it happen. PRI channels can have an idle extension and a minunused number. So long as at least minunused channels are idle, the Zap channel module will try to dial idledial on them, and then Asterisk will begin executing the commands for the context and extension specified by idleext. When channels are needed for voice calls, the "idle" calls are disconnected (so long as there are at least minidle calls still running, of course) to make more channels available. The primary use of this is to create a dynamic service, where idle channels are bundled through multilink PPP, thus more efficiently utilizing combined voice/data services than conventional fixed mappings/muxings.
 * </p>
 * Created : Fri May 26 14:32:07 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Multilink_PPP.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Multilink_PPP extends AbstractSimpleDataClass implements IMultilink_PPP{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Multilink_PPP
	**/
	public Multilink_PPP(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Multilink_PPP
	**/
	public Multilink_PPP( String aminunused, Integer aminidle, Integer aidledial, String aidleext){
		super();
	
		this.minunused = aminunused;	
		this.minidle = aminidle;	
		this.idledial = aidledial;	
		this.idleext = aidleext;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Multilink_PPP object){
		this.minunused = object.minunused;	
		this.minidle = object.minidle;	
		this.idledial = object.idledial;	
		this.idleext = object.idleext;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  The minimum number of unused channels available. If there are fewer channels available, Asterisk will not attempt to bundle any channels and give them to the data connection. Takes an integer. **/
	protected String minunused;
	public static final String VALUEID_MINUNUSED="minunused" ;

    /**  The minimum number of idle channels to bundle for the data link. Asterisk will keep this number of channels open for data, rather than taking them back for voice channels when needed. Takes an integer. **/
	protected Integer minidle;
	public static final String VALUEID_MINIDLE="minidle" ;

    /**  The number to dial as the idle number. This is typically the number to dial a Remote Access Server (RAS). Channels being idled for data will be sent to this extension. Takes an integer that does not conflict with any other extension in the Dialplan, and has been defined as an idleext. **/
	protected Integer idledial;
	public static final String VALUEID_IDLEDIAL="idledial" ;

    /**  The extension to use as the idle extension. Takes a value in the form of exten@context. Typically, the extension would be an extension to run the ZapRAS command. **/
	protected String idleext;
	public static final String VALUEID_IDLEEXT="idleext" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_MINUNUSED.equals(valueid)){
			return true;
		}
		if(VALUEID_MINIDLE.equals(valueid)){
			return true;
		}
		if(VALUEID_IDLEDIAL.equals(valueid)){
			return true;
		}
		if(VALUEID_IDLEEXT.equals(valueid)){
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
		if(VALUEID_MINUNUSED.equals(valueid)){
			setMinunused((String)data);
			return;
		}
		if(VALUEID_MINIDLE.equals(valueid)){
			if(data instanceof String){
		        setMinidle(new Integer((String)data));
		        return;
		    }
			setMinidle((Integer)data);
			return;
		}
		if(VALUEID_IDLEDIAL.equals(valueid)){
			if(data instanceof String){
		        setIdledial(new Integer((String)data));
		        return;
		    }
			setIdledial((Integer)data);
			return;
		}
		if(VALUEID_IDLEEXT.equals(valueid)){
			setIdleext((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_MINUNUSED.equals(valueid)){
			return getMinunused();
			
		}
		if(VALUEID_MINIDLE.equals(valueid)){
			return getMinidle();
			
		}
		if(VALUEID_IDLEDIAL.equals(valueid)){
			return getIdledial();
			
		}
		if(VALUEID_IDLEEXT.equals(valueid)){
			return getIdleext();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getminunused 
	* The minimum number of unused channels available. If there are fewer channels available, Asterisk will not attempt to bundle any channels and give them to the data connection. Takes an integer.
	**/
	public String getMinunused(){		return  minunused;
	}
	/**
	*setminunused 
	*/
	public void setMinunused(String aminunused){
		if(aminunused==null){
		    changed = (this.minunused!=null);
		    this.minunused = null;	    
		}else{
			changed = aminunused.equals(this.minunused);
			this.minunused=aminunused;
		}
	}


	/**
	* getminidle 
	* The minimum number of idle channels to bundle for the data link. Asterisk will keep this number of channels open for data, rather than taking them back for voice channels when needed. Takes an integer.
	**/
	public Integer getMinidle(){		return  minidle;
	}
	/**
	*setminidle 
	*/
	public void setMinidle(Integer aminidle){
		if(aminidle==null){
		    changed = (this.minidle!=null);
		    this.minidle = null;	    
		}else{
			changed = aminidle.equals(this.minidle);
			this.minidle=aminidle;
		}
	}


	/**
	* getidledial 
	* The number to dial as the idle number. This is typically the number to dial a Remote Access Server (RAS). Channels being idled for data will be sent to this extension. Takes an integer that does not conflict with any other extension in the Dialplan, and has been defined as an idleext.
	**/
	public Integer getIdledial(){		return  idledial;
	}
	/**
	*setidledial 
	*/
	public void setIdledial(Integer aidledial){
		if(aidledial==null){
		    changed = (this.idledial!=null);
		    this.idledial = null;	    
		}else{
			changed = aidledial.equals(this.idledial);
			this.idledial=aidledial;
		}
	}


	/**
	* getidleext 
	* The extension to use as the idle extension. Takes a value in the form of exten@context. Typically, the extension would be an extension to run the ZapRAS command.
	**/
	public String getIdleext(){		return  idleext;
	}
	/**
	*setidleext 
	*/
	public void setIdleext(String aidleext){
		if(aidleext==null){
		    changed = (this.idleext!=null);
		    this.idleext = null;	    
		}else{
			changed = aidleext.equals(this.idleext);
			this.idleext=aidleext;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("minunused=")
		.append(minunused)
		.append(",")
		.append("minidle=")
		.append(minidle)
		.append(",")
		.append("idledial=")
		.append(idledial)
		.append(",")
		.append("idleext=")
		.append(idleext)
    			.append("]");

		return sb.toString();		
	}}