/*
 * (c) urs zeidler
 */
package com.useit.jact.io.meetmeconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.meetmeconf.Meetmerooms;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.8 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class MeetmeroomswriteHelper {

        public String confno_StartToken;

        public String confno_StopToken;

        public void writeconfno(StringBuffer strB, Meetmerooms impl) {
            if (impl.getConfno() != null && confno_StartToken != null) {
                strB.append(confno_StartToken).append(impl.getConfno()).append(
                        confno_StopToken);
            }
        }

        public String pincode_StartToken;

        public String pincode_StopToken;

        public void writepincode(StringBuffer strB, Meetmerooms impl) {
            if (impl.getPincode() != null && pincode_StartToken != null) {
                strB.append(pincode_StartToken).append(impl.getPincode())
                        .append(pincode_StopToken);
            }
        }

        public String adminpin_StartToken;

        public String adminpin_StopToken;

        public void writeadminpin(StringBuffer strB, Meetmerooms impl) {
            if (impl.getAdminpin() != null && adminpin_StartToken != null) {
                strB.append(adminpin_StartToken).append(impl.getAdminpin())
                        .append(adminpin_StopToken);
            }
        }
    }; // end of MeetmeroomswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class MeetmeconfwriteHelper {

        public String fileid_StartToken;

        public String fileid_StopToken;

        public void writefileid(StringBuffer strB, Meetmeconf impl) {
            if (impl.getFileid() != null && fileid_StartToken != null) {
                strB.append(fileid_StartToken).append(impl.getFileid()).append(
                        fileid_StopToken);
            }
        }
    }; // end of MeetmeconfwriteHelper Declaration

    protected MeetmeroomswriteHelper theMeetmeroomswriteHelper;

    protected MeetmeconfwriteHelper theMeetmeconfwriteHelper;

    /**
     * 
     */
    public ConfWriter() {
        super();

    }

    /**
     * schreibt die config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String string) {
        File file = new File(string);
        try {
            UseFileHelper.writeStringToFile(file, writetoString(data));
        } catch (FileNotFoundException e) {
            LOGGER.error("writetoFile(Object data = " + data
                    + ", String string = " + string + ")", e);
        } catch (IOException e) {
            LOGGER.error("writetoFile(Object data = " + data
                    + ", String string = " + string + ")", e);
        }

    }

    /**
     * gibt die config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        StringBuffer strb = new StringBuffer();
        writeConf(strb, data);
        return strb.toString();
    }

    /**
     * ruft die entsprechende write methode auf
     * 
     * @param strB
     * @param data
     */
    public void writeConf(StringBuffer strB, Object data) {
        if (data instanceof Meetmerooms) {
            writeMeetmerooms(strB, (Meetmerooms) data);
            return;
        }
        if (data instanceof Meetmeconf) {
            writeMeetmeconf(strB, (Meetmeconf) data);
            return;
        }
    }

    /**
     * schreibt die Felder von Meetmerooms
     * 
     * @param strB
     * @param msec
     */
    protected void writeMeetmeroomsFields(StringBuffer strB, Meetmerooms impl) {

        // felder schreiben
        theMeetmeroomswriteHelper.writeconfno(strB, impl);
        theMeetmeroomswriteHelper.writepincode(strB, impl);
        theMeetmeroomswriteHelper.writeadminpin(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Meetmerooms
     * 
     * @param strB
     * @param msec
     */
    protected void writeMeetmeroomsAggregates(StringBuffer strB,
            Meetmerooms impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Meetmerooms Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMeetmerooms(StringBuffer strB, Meetmerooms impl) {
        writeMeetmeroomsFields(strB, impl);
        writeMeetmeroomsAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Meetmeconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeMeetmeconfFields(StringBuffer strB, Meetmeconf impl) {

        // felder schreiben
        theMeetmeconfwriteHelper.writefileid(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Meetmeconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeMeetmeconfAggregates(StringBuffer strB, Meetmeconf impl) {

        // aggregate schreiben
        // maps schreiben
        // MeetmeroomsMap
        for (Iterator iter = impl.getMeetmeroomsMap().iterator(); iter
                .hasNext();) {
            Meetmerooms mobj = (Meetmerooms) iter.next();
            writeMeetmerooms(strB, mobj);
        }

    }

    /**
     * schreibt ein Meetmeconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMeetmeconf(StringBuffer strB, Meetmeconf impl) {
        writeMeetmeconfFields(strB, impl);
        writeMeetmeconfAggregates(strB, impl);

    }

    protected void initHelper() {
        theMeetmeroomswriteHelper = new MeetmeroomswriteHelper();
        theMeetmeroomswriteHelper.confno_StartToken = "confno=";
        theMeetmeroomswriteHelper.confno_StopToken = "\n";
        theMeetmeroomswriteHelper.pincode_StartToken = "pincode=";
        theMeetmeroomswriteHelper.pincode_StopToken = "\n";
        theMeetmeroomswriteHelper.adminpin_StartToken = "adminpin=";
        theMeetmeroomswriteHelper.adminpin_StopToken = "\n";

        theMeetmeconfwriteHelper = new MeetmeconfwriteHelper();
        theMeetmeconfwriteHelper.fileid_StartToken = "fileid=";
        theMeetmeconfwriteHelper.fileid_StopToken = "\n";

    }

}
