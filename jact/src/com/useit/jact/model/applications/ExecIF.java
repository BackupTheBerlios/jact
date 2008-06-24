package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ExecIF<br>
 * If <expr> is true, execute and return the result of <app>(<data>)
 * </p>
 * Created : Sun Jul 09 18:50:09 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExecIF.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class ExecIF extends PbxApplication implements IExecIF{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ExecIF
	**/
	public ExecIF(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ExecIF
	**/
	public ExecIF( String aexpr, String aapp, String adata){
		super();
	
		this.expr = aexpr;	
		this.app = aapp;	
		this.data = adata;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ExecIF object){
		this.expr = object.expr;	
		this.app = object.app;	
		this.data = object.data;	

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
	protected String app;
	public static final String VALUEID_APP="app" ;

    /**   **/
	protected String data;
	public static final String VALUEID_DATA="data" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_EXPR.equals(valueid)){
			return true;
		}
		if(VALUEID_APP.equals(valueid)){
			return true;
		}
		if(VALUEID_DATA.equals(valueid)){
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
		if(VALUEID_APP.equals(valueid)){
			setApp((String)data);
			return;
		}
		if(VALUEID_DATA.equals(valueid)){
			setData((String)data);
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
		if(VALUEID_APP.equals(valueid)){
			return getApp();
			
		}
		if(VALUEID_DATA.equals(valueid)){
			return getData();
			
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
	* getapp 
	* 
	**/
	public String getApp(){		return  app;
	}
	/**
	*setapp 
	*/
	public void setApp(String aapp){
		if(aapp==null){
		    changed = (this.app!=null);
		    this.app = null;	    
		}else{
			changed = aapp.equals(this.app);
			this.app=aapp;
		}
	}


	/**
	* getdata 
	* 
	**/
	public String getData(){		return  data;
	}
	/**
	*setdata 
	*/
	public void setData(String adata){
		if(adata==null){
		    changed = (this.data!=null);
		    this.data = null;	    
		}else{
			changed = adata.equals(this.data);
			this.data=adata;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ExecIF, ")		
		//.append("expr=")
		.append(expr)
		.append(",")
		//.append("app=")
		.append(app)
		.append(",")
		//.append("data=")
		.append(data)
    			.append("");

		return sb.toString();		
	}
}