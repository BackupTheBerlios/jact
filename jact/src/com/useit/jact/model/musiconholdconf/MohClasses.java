package com.useit.jact.model.musiconholdconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * MohClasses<br>
 * 
 * </p>
 * Created : Fri May 26 14:31:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MohClasses.java,v 1.1 2008/06/24 20:45:25 urszeidler Exp $
 */
 public  class MohClasses extends AbstractSimpleDataClass implements IMohClasses{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MohClasses
	**/
	public MohClasses(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MohClasses
	**/
	public MohClasses( String aname, String aplayer, String amohdir, String amohpara){
		super();
	
		this.name = aname;	
		this.player = aplayer;	
		this.mohdir = amohdir;	
		this.mohpara = amohpara;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MohClasses object){
		this.name = object.name;	
		this.player = object.player;	
		this.mohdir = object.mohdir;	
		this.mohpara = object.mohpara;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String name;
	public static final String VALUEID_NAME="name" ;

    /**   **/
	protected String player;
	public static final String VALUEID_PLAYER="player" ;

    /**   **/
	protected String mohdir;
	public static final String VALUEID_MOHDIR="mohdir" ;

    /**   **/
	protected String mohpara;
	public static final String VALUEID_MOHPARA="mohpara" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_NAME.equals(valueid)){
			return true;
		}
		if(VALUEID_PLAYER.equals(valueid)){
			return true;
		}
		if(VALUEID_MOHDIR.equals(valueid)){
			return true;
		}
		if(VALUEID_MOHPARA.equals(valueid)){
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
		if(VALUEID_NAME.equals(valueid)){
			setName((String)data);
			return;
		}
		if(VALUEID_PLAYER.equals(valueid)){
			setPlayer((String)data);
			return;
		}
		if(VALUEID_MOHDIR.equals(valueid)){
			setMohdir((String)data);
			return;
		}
		if(VALUEID_MOHPARA.equals(valueid)){
			setMohpara((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_NAME.equals(valueid)){
			return getName();
			
		}
		if(VALUEID_PLAYER.equals(valueid)){
			return getPlayer();
			
		}
		if(VALUEID_MOHDIR.equals(valueid)){
			return getMohdir();
			
		}
		if(VALUEID_MOHPARA.equals(valueid)){
			return getMohpara();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getname 
	* 
	**/
	public String getName(){		return  name;
	}
	/**
	*setname 
	*/
	public void setName(String aname){
		if(aname==null){
		    changed = (this.name!=null);
		    this.name = null;	    
		}else{
			changed = aname.equals(this.name);
			this.name=aname;
		}
	}


	/**
	* getplayer 
	* 
	**/
	public String getPlayer(){		return  player;
	}
	/**
	*setplayer 
	*/
	public void setPlayer(String aplayer){
		if(aplayer==null){
		    changed = (this.player!=null);
		    this.player = null;	    
		}else{
			changed = aplayer.equals(this.player);
			this.player=aplayer;
		}
	}


	/**
	* getmohdir 
	* 
	**/
	public String getMohdir(){		return  mohdir;
	}
	/**
	*setmohdir 
	*/
	public void setMohdir(String amohdir){
		if(amohdir==null){
		    changed = (this.mohdir!=null);
		    this.mohdir = null;	    
		}else{
			changed = amohdir.equals(this.mohdir);
			this.mohdir=amohdir;
		}
	}


	/**
	* getmohpara 
	* 
	**/
	public String getMohpara(){		return  mohpara;
	}
	/**
	*setmohpara 
	*/
	public void setMohpara(String amohpara){
		if(amohpara==null){
		    changed = (this.mohpara!=null);
		    this.mohpara = null;	    
		}else{
			changed = amohpara.equals(this.mohpara);
			this.mohpara=amohpara;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("name=")
		.append(name)
		.append(",")
		.append("player=")
		.append(player)
		.append(",")
		.append("mohdir=")
		.append(mohdir)
		.append(",")
		.append("mohpara=")
		.append(mohpara)
    			.append("]");

		return sb.toString();		
	}}