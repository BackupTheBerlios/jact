package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ForkCDR<br>
 * Causes the Call Data Record to fork an additional cdr record starting from the time of the fork call If the option 'v' is passed all cdr variables will be passed along also.
 * </p>
 * Created : Sun Jul 09 18:50:44 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ForkCDR.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class ForkCDR extends PbxApplication implements IForkCDR{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor f�r ForkCDR
	**/
	public ForkCDR(){
		super();
	
	}
	/**
	* komplexer Konstruktor f�r ForkCDR
	**/
	public ForkCDR( String aoptions){
		super();
	
		this.options = aoptions;	
	}
	/**
	 * �bernimmt alle Werte aus dem �bergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim �ndern der daten
	 * @param object
	 */
	public void assignTo(ForkCDR object){
		this.options = object.options;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

	/**
	 * �berpr�ft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_OPTIONS.equals(valueid)){
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
		if(VALUEID_OPTIONS.equals(valueid)){
			setOptions((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zur�ck
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getoptions 
	* 
	**/
	public String getOptions(){		return  options;
	}
	/**
	*setoptions 
	*/
	public void setOptions(String aoptions){
		if(aoptions==null){
		    changed = (this.options!=null);
		    this.options = null;	    
		}else{
			changed = aoptions.equals(this.options);
			this.options=aoptions;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ForkCDR, ")		
		//.append("options=")
		.append(options)
    			.append("");

		return sb.toString();		
	}
}