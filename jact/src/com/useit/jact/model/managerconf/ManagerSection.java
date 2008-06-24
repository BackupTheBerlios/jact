package com.useit.jact.model.managerconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * ManagerSection<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:02 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagerSection.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  class ManagerSection extends AbstractSimpleDataClass implements IManagerSection{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ManagerSection
	**/
	public ManagerSection(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ManagerSection
	**/
	public ManagerSection( String ausername, String asecret, String aread, String awrite){
		super();
	
		this.username = ausername;	
		this.secret = asecret;	
		this.read = aread;	
		this.write = awrite;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ManagerSection object){
		this.username = object.username;	
		this.secret = object.secret;	
		this.read = object.read;	
		this.write = object.write;	

	}
//--------------  map Funktionen
	//public static final String MANAGERDENYMAP = "managerdenyMap";
	/** die typisierte List die die Aggregierten objekte(ManagerdenyImpl) enthält */
	protected List<Managerdeny> managerdenyMap = new ArrayList<Managerdeny>();
	//public static final String MANAGERPERMITMAP = "managerpermitMap";
	/** die typisierte List die die Aggregierten objekte(ManagerpermitImpl) enthält */
	protected List<Managerpermit> managerpermitMap = new ArrayList<Managerpermit>();
	/** die typisierte Map die die Aggregierten objekte(ManagerdenyImpl) enthält */
	//protected ManagerdenyMap managerdenyMapMap = new ManagerdenyMap();
	/** die typisierte Map die die Aggregierten objekte(ManagerpermitImpl) enthält */
	//protected ManagerpermitMap managerpermitMapMap = new ManagerpermitMap();

	/**
	 * fügt ein Managerdeny Objekt zu der Mapp hinzu
	 * @param aManagerdeny
	 */
	public boolean addManagerdeny(Managerdeny aManagerdeny){
		return managerdenyMap.add(aManagerdeny);
	}

	/**
	 * removed ein Managerdeny Objekt aus der Map
	 * @param aManagerdeny
	 */
	public boolean removeManagerdeny(Managerdeny aManagerdeny){
		return managerdenyMap.remove(aManagerdeny);
	}


	/**
	 * fügt ein Managerpermit Objekt zu der Mapp hinzu
	 * @param aManagerpermit
	 */
	public boolean addManagerpermit(Managerpermit aManagerpermit){
		return managerpermitMap.add(aManagerpermit);
	}

	/**
	 * removed ein Managerpermit Objekt aus der Map
	 * @param aManagerpermit
	 */
	public boolean removeManagerpermit(Managerpermit aManagerpermit){
		return managerpermitMap.remove(aManagerpermit);
	}

	

/**
 * gibt die List<Managerdeny> managerdenyMap zurück	
 * @return List<Managerdeny>
 * @see  IManagerSection#getManagerdenyMap
 */
public List<Managerdeny> getManagerdenyMap() {
	return managerdenyMap;
}
/**
 * setzt die Map ManagerdenyMap
 * @param map managerdenyMapMap
 */
 @SuppressWarnings("unchecked")
public void setManagerdenyMap(List aList){
    managerdenyMap = aList;
   // managerdenyMapTyper.setList(aList); 
}


/**
 * gibt die List<Managerpermit> managerpermitMap zurück	
 * @return List<Managerpermit>
 * @see  IManagerSection#getManagerpermitMap
 */
public List<Managerpermit> getManagerpermitMap() {
	return managerpermitMap;
}
/**
 * setzt die Map ManagerpermitMap
 * @param map managerpermitMapMap
 */
 @SuppressWarnings("unchecked")
public void setManagerpermitMap(List aList){
    managerpermitMap = aList;
   // managerpermitMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String username;
	public static final String VALUEID_USERNAME="username" ;

    /**   **/
	protected String secret;
	public static final String VALUEID_SECRET="secret" ;

    /**   **/
	protected String read;
	public static final String VALUEID_READ="read" ;

    /**   **/
	protected String write;
	public static final String VALUEID_WRITE="write" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_USERNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_SECRET.equals(valueid)){
			return true;
		}
		if(VALUEID_READ.equals(valueid)){
			return true;
		}
		if(VALUEID_WRITE.equals(valueid)){
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
		if(VALUEID_USERNAME.equals(valueid)){
			setUsername((String)data);
			return;
		}
		if(VALUEID_SECRET.equals(valueid)){
			setSecret((String)data);
			return;
		}
		if(VALUEID_READ.equals(valueid)){
			setRead((String)data);
			return;
		}
		if(VALUEID_WRITE.equals(valueid)){
			setWrite((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_USERNAME.equals(valueid)){
			return getUsername();
			
		}
		if(VALUEID_SECRET.equals(valueid)){
			return getSecret();
			
		}
		if(VALUEID_READ.equals(valueid)){
			return getRead();
			
		}
		if(VALUEID_WRITE.equals(valueid)){
			return getWrite();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getusername 
	* 
	**/
	public String getUsername(){		return  username;
	}
	/**
	*setusername 
	*/
	public void setUsername(String ausername){
		if(ausername==null){
		    changed = (this.username!=null);
		    this.username = null;	    
		}else{
			changed = ausername.equals(this.username);
			this.username=ausername;
		}
	}


	/**
	* getsecret 
	* 
	**/
	public String getSecret(){		return  secret;
	}
	/**
	*setsecret 
	*/
	public void setSecret(String asecret){
		if(asecret==null){
		    changed = (this.secret!=null);
		    this.secret = null;	    
		}else{
			changed = asecret.equals(this.secret);
			this.secret=asecret;
		}
	}


	/**
	* getread 
	* 
	**/
	public String getRead(){		return  read;
	}
	/**
	*setread 
	*/
	public void setRead(String aread){
		if(aread==null){
		    changed = (this.read!=null);
		    this.read = null;	    
		}else{
			changed = aread.equals(this.read);
			this.read=aread;
		}
	}


	/**
	* getwrite 
	* 
	**/
	public String getWrite(){		return  write;
	}
	/**
	*setwrite 
	*/
	public void setWrite(String awrite){
		if(awrite==null){
		    changed = (this.write!=null);
		    this.write = null;	    
		}else{
			changed = awrite.equals(this.write);
			this.write=awrite;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("username=")
		.append(username)
		.append(",")
		.append("secret=")
		.append(secret)
		.append(",")
		.append("read=")
		.append(read)
		.append(",")
		.append("write=")
		.append(write)
    			.append("]");

		return sb.toString();		
	}}