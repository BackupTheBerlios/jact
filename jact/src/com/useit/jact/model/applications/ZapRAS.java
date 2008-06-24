package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ZapRAS<br>
 * Executes a RAS server using pppd on the given channel. The channel must be a clear channel (i.e. PRI source) and a Zaptel channel to be able to use this function (No modem emulation is included). Your pppd must be patched to be zaptel aware. Arguments should be separated by | characters. Always returns -1.
 * </p>
 * Created : Sun Jul 09 18:50:56 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapRAS.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class ZapRAS extends PbxApplication implements IZapRAS{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ZapRAS
	**/
	public ZapRAS(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ZapRAS
	**/
	public ZapRAS( String aargs){
		super();
	
		this.args = aargs;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ZapRAS object){
		this.args = object.args;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String args;
	public static final String VALUEID_ARGS="args" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_ARGS.equals(valueid)){
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
		if(VALUEID_ARGS.equals(valueid)){
			setArgs((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_ARGS.equals(valueid)){
			return getArgs();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getargs 
	* 
	**/
	public String getArgs(){		return  args;
	}
	/**
	*setargs 
	*/
	public void setArgs(String aargs){
		if(aargs==null){
		    changed = (this.args!=null);
		    this.args = null;	    
		}else{
			changed = aargs.equals(this.args);
			this.args=aargs;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ZapRAS, ")		
		//.append("args=")
		.append(args)
    			.append("");

		return sb.toString();		
	}
}