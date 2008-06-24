package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * MacroIf<br>
 * Executes macro defined in <macroname_a> if <expr> is true (otherwise <macroname_b> if provided) Arguments and return values as in application macro()
 * </p>
 * Created : Sun Jul 09 18:51:23 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MacroIf.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class MacroIf extends PbxApplication implements IMacroIf{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MacroIf
	**/
	public MacroIf(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MacroIf
	**/
	public MacroIf( String aexpr, String amacroname_a, String amacroname_b, String aarg1){
		super();
	
		this.expr = aexpr;	
		this.macroname_a = amacroname_a;	
		this.macroname_b = amacroname_b;	
		this.arg1 = aarg1;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MacroIf object){
		this.expr = object.expr;	
		this.macroname_a = object.macroname_a;	
		this.macroname_b = object.macroname_b;	
		this.arg1 = object.arg1;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String expr;
	public static final String VALUEID_EXPR="expr" ;

    /**   **/
	protected String macroname_a;
	public static final String VALUEID_MACRONAME_A="macroname_a" ;

    /**   **/
	protected String macroname_b;
	public static final String VALUEID_MACRONAME_B="macroname_b" ;

    /**   **/
	protected String arg1;
	public static final String VALUEID_ARG1="arg1" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_EXPR.equals(valueid)){
			return true;
		}
		if(VALUEID_MACRONAME_A.equals(valueid)){
			return true;
		}
		if(VALUEID_MACRONAME_B.equals(valueid)){
			return true;
		}
		if(VALUEID_ARG1.equals(valueid)){
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
		if(VALUEID_MACRONAME_A.equals(valueid)){
			setMacroname_a((String)data);
			return;
		}
		if(VALUEID_MACRONAME_B.equals(valueid)){
			setMacroname_b((String)data);
			return;
		}
		if(VALUEID_ARG1.equals(valueid)){
			setArg1((String)data);
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
		if(VALUEID_MACRONAME_A.equals(valueid)){
			return getMacroname_a();
			
		}
		if(VALUEID_MACRONAME_B.equals(valueid)){
			return getMacroname_b();
			
		}
		if(VALUEID_ARG1.equals(valueid)){
			return getArg1();
			
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
	* getmacroname_a 
	* 
	**/
	public String getMacroname_a(){		return  macroname_a;
	}
	/**
	*setmacroname_a 
	*/
	public void setMacroname_a(String amacroname_a){
		if(amacroname_a==null){
		    changed = (this.macroname_a!=null);
		    this.macroname_a = null;	    
		}else{
			changed = amacroname_a.equals(this.macroname_a);
			this.macroname_a=amacroname_a;
		}
	}


	/**
	* getmacroname_b 
	* 
	**/
	public String getMacroname_b(){		return  macroname_b;
	}
	/**
	*setmacroname_b 
	*/
	public void setMacroname_b(String amacroname_b){
		if(amacroname_b==null){
		    changed = (this.macroname_b!=null);
		    this.macroname_b = null;	    
		}else{
			changed = amacroname_b.equals(this.macroname_b);
			this.macroname_b=amacroname_b;
		}
	}


	/**
	* getarg1 
	* 
	**/
	public String getArg1(){		return  arg1;
	}
	/**
	*setarg1 
	*/
	public void setArg1(String aarg1){
		if(aarg1==null){
		    changed = (this.arg1!=null);
		    this.arg1 = null;	    
		}else{
			changed = aarg1.equals(this.arg1);
			this.arg1=aarg1;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("MacroIf, ")		
		//.append("expr=")
		.append(expr)
		.append(",")
		//.append("macroname_a=")
		.append(macroname_a)
		.append(",")
		//.append("macroname_b=")
		.append(macroname_b)
		.append(",")
		//.append("arg1=")
		.append(arg1)
    			.append("");

		return sb.toString();		
	}
}