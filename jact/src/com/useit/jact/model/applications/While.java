package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * While<br>
 * Start a While Loop. Execution will return to this point when EndWhile is called until expr is no longer true.
 * </p>
 * Created : Sun Jul 09 18:51:34 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: While.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class While extends PbxApplication implements IWhile{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für While
	**/
	public While(){
		super();
	
	}
	/**
	* komplexer Konstruktor für While
	**/
	public While( String aexpr){
		super();
	
		this.expr = aexpr;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(While object){
		this.expr = object.expr;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String expr;
	public static final String VALUEID_EXPR="expr" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_EXPR.equals(valueid)){
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
		if(VALUEID_EXPR.equals(valueid)){
			setExpr((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_EXPR.equals(valueid)){
			return getExpr();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getexpr 
	* 
	**/
	public String getExpr(){		return  expr;
	}
	/**
	*setexpr 
	*/
	public void setExpr(String aexpr){
		if(aexpr==null){
		    changed = (this.expr!=null);
		    this.expr = null;	    
		}else{
			changed = aexpr.equals(this.expr);
			this.expr=aexpr;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("While, ")		
		//.append("expr=")
		.append(expr)
    			.append("");

		return sb.toString();		
	}
}