package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * TrySystem<br>
 * Executes a command by using system(). Returns 0 on any situation. If the command itself executes but is in error, and if there exists a priority n + 101, where 'n' is the priority of the current instance, then the channel will be setup to continue at that priority level. Otherwise, System returns 0.
 * </p>
 * Created : Sun Jul 09 18:49:38 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: TrySystem.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class TrySystem extends PbxApplication implements ITrySystem{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für TrySystem
	**/
	public TrySystem(){
		super();
	
	}
	/**
	* komplexer Konstruktor für TrySystem
	**/
	public TrySystem( String acommand){
		super();
	
		this.command = acommand;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(TrySystem object){
		this.command = object.command;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String command;
	public static final String VALUEID_COMMAND="command" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_COMMAND.equals(valueid)){
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
		if(VALUEID_COMMAND.equals(valueid)){
			setCommand((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_COMMAND.equals(valueid)){
			return getCommand();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcommand 
	* 
	**/
	public String getCommand(){		return  command;
	}
	/**
	*setcommand 
	*/
	public void setCommand(String acommand){
		if(acommand==null){
		    changed = (this.command!=null);
		    this.command = null;	    
		}else{
			changed = acommand.equals(this.command);
			this.command=acommand;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("TrySystem, ")		
		//.append("command=")
		.append(command)
    			.append("");

		return sb.toString();		
	}
}