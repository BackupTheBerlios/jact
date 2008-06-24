/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.extensionconf;

import com.useit.jact.model.extensionconf.Context;
import com.useit.jact.model.extensionconf.Extension;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.Globalvars;
import com.useit.jact.model.extensionconf.Includeconfigs;
import com.useit.jact.model.extensionconf.Includecontext;
import com.useit.jact.model.extensionconf.Switch;


//import com.beronet.App.CSS.model.dataModel.Context;
//import com.beronet.App.CSS.model.dataModel.Extension;
//import com.beronet.App.CSS.model.dataModel.Switch;
//import com.beronet.App.CSS.model.dataModel.Includecontext;
//import com.beronet.App.CSS.model.dataModel.Extensionconf;
//import com.beronet.App.CSS.model.dataModel.Includeconfigs;
//import com.beronet.App.CSS.model.dataModel.Globalvars;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $
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
	* für Context
	*/
	public abstract String displayString(Context  aContext);//{
		//return  aContext == null ? "" : aContext.toString(); //"DataObjectName";
//	}
	/**
	* gibt den string des Datenobjectes zurück
	* für Extension
	*/
	public abstract String displayString(Extension  aExtension);//{
		//return  aExtension == null ? "" : aExtension.toString(); //"DataObjectName";
//	}
	/**
	* gibt den string des Datenobjectes zurück
	* für Switch
	*/
	public abstract String displayString(Switch  aSwitch);//{
		//return  aSwitch == null ? "" : aSwitch.toString(); //"DataObjectName";
//	}
	/**
	* gibt den string des Datenobjectes zurück
	* für Includecontext
	*/
	public abstract String displayString(Includecontext  aIncludecontext);//{
		//return  aIncludecontext == null ? "" : aIncludecontext.toString(); //"DataObjectName";
//	}
	/**
	* gibt den string des Datenobjectes zurück
	* für Extensionconf
	*/
	public abstract String displayString(Extensionconf  aExtensionconf);//{
		//return  aExtensionconf == null ? "" : aExtensionconf.toString(); //"DataObjectName";
//	}
	/**
	* gibt den string des Datenobjectes zurück
	* für Includeconfigs
	*/
	public abstract String displayString(Includeconfigs  aIncludeconfigs);//{
		//return  aIncludeconfigs == null ? "" : aIncludeconfigs.toString(); //"DataObjectName";
//	}
	/**
	* gibt den string des Datenobjectes zurück
	* für Globalvars
	*/
	public abstract String displayString(Globalvars  aGlobalvars);//{
		//return  aGlobalvars == null ? "" : aGlobalvars.toString(); //"DataObjectName";
//	}


 


	public static String displayString(Object  obj){
        if(obj instanceof Context)
            return getInstance().displayString((Context)obj);
        if(obj instanceof Extension)
            return getInstance().displayString((Extension)obj);
        if(obj instanceof Switch)
            return getInstance().displayString((Switch)obj);
        if(obj instanceof Includecontext)
            return getInstance().displayString((Includecontext)obj);
        if(obj instanceof Extensionconf)
            return getInstance().displayString((Extensionconf)obj);
        if(obj instanceof Includeconfigs)
            return getInstance().displayString((Includeconfigs)obj);
        if(obj instanceof Globalvars)
            return getInstance().displayString((Globalvars)obj);
	return obj.toString();	
	}
}
