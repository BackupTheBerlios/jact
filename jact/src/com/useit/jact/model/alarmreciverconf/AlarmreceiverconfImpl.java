package com.useit.jact.model.alarmreciverconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * AlarmreceiverconfImpl
 * </p>
 * Created : Tue Dec 27 16:22:47 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AlarmreceiverconfImpl.java,v 1.2 2005/12/29
 *          19:14:23 urs Exp $
 */
public class AlarmreceiverconfImpl extends Alarmreceiverconf {

    /**
     * einfacher Konstruktor für Alarmreceiverconf
     */
    public AlarmreceiverconfImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Alarmreceiverconf
     */
    public AlarmreceiverconfImpl(String atimestampformat, String aeventcmd,
            String aeventspooldir, String alogindividualevents,
            Integer afdtimeout, Integer asdtimeout, Integer aloudness,
            String adbfamily) {
        super();

        this.timestampformat = atimestampformat;
        this.eventcmd = aeventcmd;
        this.eventspooldir = aeventspooldir;
        this.logindividualevents = alogindividualevents;
        this.fdtimeout = afdtimeout;
        this.sdtimeout = asdtimeout;
        this.loudness = aloudness;
        this.dbfamily = adbfamily;
    }
}