/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.sipconf;

import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.Sipauth;
import com.useit.jact.model.sipconf.Sipgeneral;
import com.useit.jact.model.sipconf.Sippeers;
import com.useit.jact.model.sipconf.Sipregister;


//import com.beronet.App.CSS.model.dataModel.Sipregister;
//import com.beronet.App.CSS.model.dataModel.Sipauth;
//import com.beronet.App.CSS.model.dataModel.SipConf;
//import com.beronet.App.CSS.model.dataModel.Sipgeneral;
//import com.beronet.App.CSS.model.dataModel.Sippeers;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
public abstract class DataClassRendere {

	protected static DataClassRendere defaultInstance;
    /**
     * 
     */
    protected DataClassRendere() {
        super();
     }

   private static DataClassRendere getInstance(){
    if (defaultInstance == null) {
        
            defaultInstance = new DataClassRendereImpl();
        }
        return defaultInstance;
    }


	/**
	* gibt den string des Datenobjectes zurück
	* für Sipregister
	*/
	public abstract String displayString(Sipregister  aSipregister);//{
		//return  aSipregister == null ? "" : aSipregister.toString(); //"DataObjectName";
//	}
	/**
	* gibt den string des Datenobjectes zurück
	* für Sipauth
	*/
	public abstract String displayString(Sipauth  aSipauth);//{
		//return  aSipauth == null ? "" : aSipauth.toString(); //"DataObjectName";
//	}
	/**
	* gibt den string des Datenobjectes zurück
	* für SipConf
	*/
	public abstract String displayString(SipConf  aSipConf);//{
		//return  aSipConf == null ? "" : aSipConf.toString(); //"DataObjectName";
//	}
	/**
	* gibt den string des Datenobjectes zurück
	* für Sipgeneral
	*/
	public abstract String displayString(Sipgeneral  aSipgeneral);//{
		//return  aSipgeneral == null ? "" : aSipgeneral.toString(); //"DataObjectName";
//	}
	/**
	* gibt den string des Datenobjectes zurück
	* für Sippeers
	*/
	public abstract String displayString(Sippeers  aSippeers);//{
		//return  aSippeers == null ? "" : aSippeers.toString(); //"DataObjectName";
//	}


 


	public static String displayString(Object  obj){
        if(obj instanceof Sipregister)
            return getInstance().displayString((Sipregister)obj);
        if(obj instanceof Sipauth)
            return getInstance().displayString((Sipauth)obj);
        if(obj instanceof SipConf)
            return getInstance().displayString((SipConf)obj);
        if(obj instanceof Sipgeneral)
            return getInstance().displayString((Sipgeneral)obj);
        if(obj instanceof Sippeers)
            return getInstance().displayString((Sippeers)obj);
	return obj.toString();	
	}
}
