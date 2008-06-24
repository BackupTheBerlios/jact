package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Macro<br>
 * Executes a macro using the context 'macro-<macroname>', jumping to the 's' extension of that context and executing each step, then returning when the steps end.  The calling extension, context, and priority are stored in ${MACRO_EXTEN},  ${MACRO_CONTEXT} and ${MACRO_PRIORITY} respectively. Arguments become ${ARG1}, ${ARG2}, etc in the macro context. If you Goto out of the Macro context, the Macro will terminate and control will be returned at the location of the Goto. Macro returns -1 if any step in the macro returns -1, and 0 otherwise. If ${MACRO_OFFSET} is set at termination, Macro will attempt to continue at priority MACRO_OFFSET + N + 1 if such a step exists, and N + 1 otherwise.
 * </p>
 * Created : Sun Jul 09 18:48:48 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Macro.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class Macro extends PbxApplication implements IMacro{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Macro
	**/
	public Macro(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Macro
	**/
	public Macro( String amacroname, String aarg1, String aarg2){
		super();
	
		this.macroname = amacroname;	
		this.arg1 = aarg1;	
		this.arg2 = aarg2;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Macro object){
		this.macroname = object.macroname;	
		this.arg1 = object.arg1;	
		this.arg2 = object.arg2;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String macroname;
	public static final String VALUEID_MACRONAME="macroname" ;

    /**   **/
	protected String arg1;
	public static final String VALUEID_ARG1="arg1" ;

    /**   **/
	protected String arg2;
	public static final String VALUEID_ARG2="arg2" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_MACRONAME.equals(valueid)){
			return true;
		}
		if(VALUEID_ARG1.equals(valueid)){
			return true;
		}
		if(VALUEID_ARG2.equals(valueid)){
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
		if(VALUEID_MACRONAME.equals(valueid)){
			setMacroname((String)data);
			return;
		}
		if(VALUEID_ARG1.equals(valueid)){
			setArg1((String)data);
			return;
		}
		if(VALUEID_ARG2.equals(valueid)){
			setArg2((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_MACRONAME.equals(valueid)){
			return getMacroname();
			
		}
		if(VALUEID_ARG1.equals(valueid)){
			return getArg1();
			
		}
		if(VALUEID_ARG2.equals(valueid)){
			return getArg2();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getmacroname 
	* 
	**/
	public String getMacroname(){		return  macroname;
	}
	/**
	*setmacroname 
	*/
	public void setMacroname(String amacroname){
		if(amacroname==null){
		    changed = (this.macroname!=null);
		    this.macroname = null;	    
		}else{
			changed = amacroname.equals(this.macroname);
			this.macroname=amacroname;
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
	* getarg2 
	* 
	**/
	public String getArg2(){		return  arg2;
	}
	/**
	*setarg2 
	*/
	public void setArg2(String aarg2){
		if(aarg2==null){
		    changed = (this.arg2!=null);
		    this.arg2 = null;	    
		}else{
			changed = aarg2.equals(this.arg2);
			this.arg2=aarg2;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Macro, ")		
		//.append("macroname=")
		.append(macroname)
		.append(",")
		//.append("arg1=")
		.append(arg1)
		.append(",")
		//.append("arg2=")
		.append(arg2)
    			.append("");

		return sb.toString();		
	}
}