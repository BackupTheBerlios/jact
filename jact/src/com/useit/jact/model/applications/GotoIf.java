package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.AbstractExtension;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * GotoIf<br>
 * Go to label 1 if condition is true, to label2 if condition is false. Either label1 or label2 may be omitted (in that case, we just don't take the particular branch) but not both. Look for the condition syntax in examples or documentation.
 * </p>
 * Created : Sun Jul 09 18:50:07 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GotoIf.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class GotoIf extends PbxApplication implements IGotoIf{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für GotoIf
	**/
	public GotoIf(){
		super();
	
	}
	/**
	* komplexer Konstruktor für GotoIf
	**/
	public GotoIf( String acondition, String alabel1, String alabel2, AbstractExtension aextension1, AbstractExtension aextension2){
		super();
	
		this.condition = acondition;	
		this.extension2 = aextension2;	
		this.label1 = alabel1;	
		this.extension1 = aextension1;	
		this.label2 = alabel2;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(GotoIf object){
		this.condition = object.condition;	
		this.extension2 = object.extension2;	
		this.label1 = object.label1;	
		this.extension1 = object.extension1;	
		this.label2 = object.label2;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String condition;
	public static final String VALUEID_CONDITION="condition" ;

    /**   **/
	protected AbstractExtension extension2;
	public static final String VALUEID_EXTENSION2="extension2" ;

    /**   **/
	protected String label1;
	public static final String VALUEID_LABEL1="label1" ;

    /**   **/
	protected AbstractExtension extension1;
	public static final String VALUEID_EXTENSION1="extension1" ;

    /**   **/
	protected String label2;
	public static final String VALUEID_LABEL2="label2" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CONDITION.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTENSION2.equals(valueid)){
			return true;
		}
		if(VALUEID_LABEL1.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTENSION1.equals(valueid)){
			return true;
		}
		if(VALUEID_LABEL2.equals(valueid)){
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
		if(VALUEID_CONDITION.equals(valueid)){
			setCondition((String)data);
			return;
		}
		if(VALUEID_EXTENSION2.equals(valueid)){
			if(data instanceof String){
		        setExtension2(new AbstractExtension((String)data));
		        return;
		    }
			setExtension2((AbstractExtension)data);
			return;
		}
		if(VALUEID_LABEL1.equals(valueid)){
			setLabel1((String)data);
			return;
		}
		if(VALUEID_EXTENSION1.equals(valueid)){
			if(data instanceof String){
		        setExtension1(new AbstractExtension((String)data));
		        return;
		    }
			setExtension1((AbstractExtension)data);
			return;
		}
		if(VALUEID_LABEL2.equals(valueid)){
			setLabel2((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CONDITION.equals(valueid)){
			return getCondition();
			
		}
		if(VALUEID_EXTENSION2.equals(valueid)){
			return getExtension2();
			
		}
		if(VALUEID_LABEL1.equals(valueid)){
			return getLabel1();
			
		}
		if(VALUEID_EXTENSION1.equals(valueid)){
			return getExtension1();
			
		}
		if(VALUEID_LABEL2.equals(valueid)){
			return getLabel2();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcondition 
	* 
	**/
	public String getCondition(){		return  condition;
	}
	/**
	*setcondition 
	*/
	public void setCondition(String acondition){
		if(acondition==null){
		    changed = (this.condition!=null);
		    this.condition = null;	    
		}else{
			changed = acondition.equals(this.condition);
			this.condition=acondition;
		}
	}


	/**
	* getextension2 
	* 
	**/
	public AbstractExtension getExtension2(){		return  extension2;
	}
	/**
	*setextension2 
	*/
	public void setExtension2(AbstractExtension aextension2){
		if(aextension2==null){
		    changed = (this.extension2!=null);
		    this.extension2 = null;	    
		}else{
			changed = aextension2.equals(this.extension2);
			this.extension2=aextension2;
		}
	}


	/**
	* getlabel1 
	* 
	**/
	public String getLabel1(){		return  label1;
	}
	/**
	*setlabel1 
	*/
	public void setLabel1(String alabel1){
		if(alabel1==null){
		    changed = (this.label1!=null);
		    this.label1 = null;	    
		}else{
			changed = alabel1.equals(this.label1);
			this.label1=alabel1;
		}
	}


	/**
	* getextension1 
	* 
	**/
	public AbstractExtension getExtension1(){		return  extension1;
	}
	/**
	*setextension1 
	*/
	public void setExtension1(AbstractExtension aextension1){
		if(aextension1==null){
		    changed = (this.extension1!=null);
		    this.extension1 = null;	    
		}else{
			changed = aextension1.equals(this.extension1);
			this.extension1=aextension1;
		}
	}


	/**
	* getlabel2 
	* 
	**/
	public String getLabel2(){		return  label2;
	}
	/**
	*setlabel2 
	*/
	public void setLabel2(String alabel2){
		if(alabel2==null){
		    changed = (this.label2!=null);
		    this.label2 = null;	    
		}else{
			changed = alabel2.equals(this.label2);
			this.label2=alabel2;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("GotoIf, ")		
		//.append("condition=")
		.append(condition)
		.append(",")
		//.append("extension2=")
		.append(extension2)
		.append(",")
		//.append("label1=")
		.append(label1)
		.append(",")
		//.append("extension1=")
		.append(extension1)
		.append(",")
		//.append("label2=")
		.append(label2)
    			.append("");

		return sb.toString();		
	}
}