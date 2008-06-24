package com.useit.jact.model.channelconfig;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.misdnconf.Misdnconf;
import com.useit.jact.model.misdnconf.MisdnconfImpl;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.ZaptelconfImpl;

/**
 * <p>
 * BaseChannelConf<br>
 * 
 * </p>
 * Created : Sun Dec 25 18:50:57 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: BaseChannelConf.java,v 1.2 2005/12/29
 *          19:14:23 urs Exp $
 */
public class BaseChannelConf extends AbstractSimpleDataClass {
    // --------------- Konstruktor ---------------------
    /**
     * einfacher Konstruktor für BaseChannelConf
     */
    public BaseChannelConf() {
        super();

    }

    /**
     * Übernimmt alle Werte aus dem übergebenen object, werden nur als
     * referenzen Kopiert, also aufpaassen beim ändern der daten
     * 
     * @param object
     */
    public void assignTo(BaseChannelConf object) {

    }

    // -------------- map Funktionen

    // -------------- Aggregat Funktionen
    // ------ 1-1 aggregates
    protected Misdnconf fMisdnconf = new MisdnconfImpl();

    /**
     * @return
     */
    public Misdnconf getMisdnconf() {
        return fMisdnconf;
    }

    /**
     * setzt den Misdnconf und die Misdnconfid
     * 
     * @param Misdnconf
     */
    public void setMisdnconf(Misdnconf aMisdnconf) {
        if (aMisdnconf != null) {
            fMisdnconf = aMisdnconf;
            // misdnconf = aMisdnconf.get();
        } // end of if

    }

    protected Zaptelconf fZaptelconf = new ZaptelconfImpl();

    /**
     * @return
     */
    public Zaptelconf getZaptelconf() {
        return fZaptelconf;
    }

    /**
     * setzt den Zaptelconf und die Zaptelconfid
     * 
     * @param Zaptelconf
     */
    public void setZaptelconf(Zaptelconf aZaptelconf) {
        if (aZaptelconf != null) {
            fZaptelconf = aZaptelconf;
            // zaptelconf = aZaptelconf.get();
        } // end of if

    }

    // -------------- loadsavedelete Methoden
    // -------------- getter und setter und felder

    /**
     * überprüft ob es das value in dem Objekt gibt
     * 
     * @param valueid
     * @return
     */
    public static boolean hasValue(String valueid) {
        return false;
    }

    /**
     * setzt einen Wert per valueid
     * 
     * @param valueid
     * @param data
     */
    public void setByValue(String valueid, Object data) {
    }

    /**
     * gibt einen Wert by Vauleid zurück
     * 
     * @param valueid
     * @return
     */
    public Object getByValue(String valueid) {

        return null;
    }

    // --------- getter und setter

    /**
     * eine einfache to string methode die nur die Felder anzeigt.
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[").append("]");

        return sb.toString();
    }
}