/*
 * (c) urs zeidler
 */
package com.useit.jact.io.managerconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.managerconf.ManagerSection;
import com.useit.jact.model.managerconf.Managerdeny;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.managerconf.Managerpermit;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.10 2006/01/12 15:20:12
 *          urs Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class ManagergeneralSectionwriteHelper {

        public String generalid_StartToken;

        public String generalid_StopToken;

        public void writegeneralid(StringBuffer strB, ManagergeneralSection impl) {
            if (impl.getGeneralid() != null && generalid_StartToken != null) {
                strB.append(generalid_StartToken).append(impl.getGeneralid())
                        .append(generalid_StopToken);
            }
        }

        public String enabled_StartToken;

        public String enabled_StopToken;

        public void writeenabled(StringBuffer strB, ManagergeneralSection impl) {
            if (impl.getEnabled() != null && enabled_StartToken != null) {
                strB.append(enabled_StartToken).append(impl.getEnabled())
                        .append(enabled_StopToken);
            }
        }

        public String portno_StartToken;

        public String portno_StopToken;

        public void writeportno(StringBuffer strB, ManagergeneralSection impl) {
            if (impl.getPortno() != null && portno_StartToken != null) {
                strB.append(portno_StartToken).append(impl.getPortno()).append(
                        portno_StopToken);
            }
        }

        public String bindaddr_StartToken;

        public String bindaddr_StopToken;

        public void writebindaddr(StringBuffer strB, ManagergeneralSection impl) {
            if (impl.getBindaddr() != null && bindaddr_StartToken != null) {
                strB.append(bindaddr_StartToken).append(impl.getBindaddr())
                        .append(bindaddr_StopToken);
            }
        }

        public String port_StartToken;

        public String port_StopToken;

        public void writeport(StringBuffer strB, ManagergeneralSection impl) {
            if (impl.getPort() != null && port_StartToken != null) {
                strB.append(port_StartToken).append(impl.getPort()).append(
                        port_StopToken);
            }
        }

        public String fileid_StartToken;

        public String fileid_StopToken;

        public void writefileid(StringBuffer strB, ManagergeneralSection impl) {
            if (impl.getFileid() != null && fileid_StartToken != null) {
                strB.append(fileid_StartToken).append(impl.getFileid()).append(
                        fileid_StopToken);
            }
        }
    }; // end of ManagergeneralSectionwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class ManagerdenywriteHelper {

        public String value_StartToken;

        public String value_StopToken;

        public void writevalue(StringBuffer strB, Managerdeny impl) {
            if (impl.getValue() != null && value_StartToken != null) {
                strB.append(value_StartToken).append(impl.getValue()).append(
                        value_StopToken);
            }
        }
    }; // end of ManagerdenywriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class ManagerSectionwriteHelper {

        public String username_StartToken;

        public String username_StopToken;

        public void writeusername(StringBuffer strB, ManagerSection impl) {
            if (impl.getUsername() != null && username_StartToken != null) {
                strB.append(username_StartToken).append(impl.getUsername())
                        .append(username_StopToken);
            }
        }

        public String secret_StartToken;

        public String secret_StopToken;

        public void writesecret(StringBuffer strB, ManagerSection impl) {
            if (impl.getSecret() != null && secret_StartToken != null) {
                strB.append(secret_StartToken).append(impl.getSecret()).append(
                        secret_StopToken);
            }
        }

        public String read_StartToken;

        public String read_StopToken;

        public void writeread(StringBuffer strB, ManagerSection impl) {
            if (impl.getRead() != null && read_StartToken != null) {
                strB.append(read_StartToken).append(impl.getRead()).append(
                        read_StopToken);
            }
        }

        public String write_StartToken;

        public String write_StopToken;

        public void writewrite(StringBuffer strB, ManagerSection impl) {
            if (impl.getWrite() != null && write_StartToken != null) {
                strB.append(write_StartToken).append(impl.getWrite()).append(
                        write_StopToken);
            }
        }
    }; // end of ManagerSectionwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class ManagerpermitwriteHelper {

        public String value_StartToken;

        public String value_StopToken;

        public void writevalue(StringBuffer strB, Managerpermit impl) {
            if (impl.getValue() != null && value_StartToken != null) {
                strB.append(value_StartToken).append(impl.getValue()).append(
                        value_StopToken);
            }
        }
    }; // end of ManagerpermitwriteHelper Declaration

    protected ManagergeneralSectionwriteHelper theManagergeneralSectionwriteHelper;

    protected ManagerdenywriteHelper theManagerdenywriteHelper;

    protected ManagerSectionwriteHelper theManagerSectionwriteHelper;

    protected ManagerpermitwriteHelper theManagerpermitwriteHelper;

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
        if (data instanceof ManagergeneralSection) {
            writeManagergeneralSection(strB, (ManagergeneralSection) data);
            return;
        }
        if (data instanceof Managerdeny) {
            writeManagerdeny(strB, (Managerdeny) data);
            return;
        }
        if (data instanceof ManagerSection) {
            writeManagerSection(strB, (ManagerSection) data);
            return;
        }
        if (data instanceof Managerpermit) {
            writeManagerpermit(strB, (Managerpermit) data);
            return;
        }
    }

    /**
     * schreibt die Felder von ManagergeneralSection
     * 
     * @param strB
     * @param msec
     */
    protected void writeManagergeneralSectionFields(StringBuffer strB,
            ManagergeneralSection impl) {

        // felder schreiben
        theManagergeneralSectionwriteHelper.writegeneralid(strB, impl);
        theManagergeneralSectionwriteHelper.writeenabled(strB, impl);
        theManagergeneralSectionwriteHelper.writeportno(strB, impl);
        theManagergeneralSectionwriteHelper.writebindaddr(strB, impl);
        theManagergeneralSectionwriteHelper.writeport(strB, impl);
        theManagergeneralSectionwriteHelper.writefileid(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von ManagergeneralSection
     * 
     * @param strB
     * @param msec
     */
    protected void writeManagergeneralSectionAggregates(StringBuffer strB,
            ManagergeneralSection impl) {

        // aggregate schreiben
        // maps schreiben
        // ManagerSectionMap
        for (Iterator iter = impl.getManagerSectionMap().iterator(); iter
                .hasNext();) {
            ManagerSection mobj = (ManagerSection) iter.next();
            writeManagerSection(strB, mobj);
        }

    }

    /**
     * schreibt ein ManagergeneralSection Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeManagergeneralSection(StringBuffer strB,
            ManagergeneralSection impl) {
        writeManagergeneralSectionFields(strB, impl);
        writeManagergeneralSectionAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Managerdeny
     * 
     * @param strB
     * @param msec
     */
    protected void writeManagerdenyFields(StringBuffer strB, Managerdeny impl) {

        // felder schreiben
        theManagerdenywriteHelper.writevalue(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Managerdeny
     * 
     * @param strB
     * @param msec
     */
    protected void writeManagerdenyAggregates(StringBuffer strB,
            Managerdeny impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Managerdeny Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeManagerdeny(StringBuffer strB, Managerdeny impl) {
        writeManagerdenyFields(strB, impl);
        writeManagerdenyAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von ManagerSection
     * 
     * @param strB
     * @param msec
     */
    protected void writeManagerSectionFields(StringBuffer strB,
            ManagerSection impl) {

        // felder schreiben
        theManagerSectionwriteHelper.writeusername(strB, impl);
        theManagerSectionwriteHelper.writesecret(strB, impl);
        theManagerSectionwriteHelper.writeread(strB, impl);
        theManagerSectionwriteHelper.writewrite(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von ManagerSection
     * 
     * @param strB
     * @param msec
     */
    protected void writeManagerSectionAggregates(StringBuffer strB,
            ManagerSection impl) {

        // aggregate schreiben
        // maps schreiben
        // ManagerdenyMap
        for (Iterator iter = impl.getManagerdenyMap().iterator(); iter
                .hasNext();) {
            Managerdeny mobj = (Managerdeny) iter.next();
            writeManagerdeny(strB, mobj);
        }
        // ManagerpermitMap
        for (Iterator iter = impl.getManagerpermitMap().iterator(); iter
                .hasNext();) {
            Managerpermit mobj = (Managerpermit) iter.next();
            writeManagerpermit(strB, mobj);
        }

    }

    /**
     * schreibt ein ManagerSection Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeManagerSection(StringBuffer strB, ManagerSection impl) {
        writeManagerSectionFields(strB, impl);
        writeManagerSectionAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Managerpermit
     * 
     * @param strB
     * @param msec
     */
    protected void writeManagerpermitFields(StringBuffer strB,
            Managerpermit impl) {

        // felder schreiben
        theManagerpermitwriteHelper.writevalue(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Managerpermit
     * 
     * @param strB
     * @param msec
     */
    protected void writeManagerpermitAggregates(StringBuffer strB,
            Managerpermit impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Managerpermit Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeManagerpermit(StringBuffer strB, Managerpermit impl) {
        writeManagerpermitFields(strB, impl);
        writeManagerpermitAggregates(strB, impl);

    }

    protected void initHelper() {
        theManagergeneralSectionwriteHelper = new ManagergeneralSectionwriteHelper();
        theManagergeneralSectionwriteHelper.generalid_StartToken = "generalid=";
        theManagergeneralSectionwriteHelper.generalid_StopToken = "\n";
        theManagergeneralSectionwriteHelper.enabled_StartToken = "enabled=";
        theManagergeneralSectionwriteHelper.enabled_StopToken = "\n";
        theManagergeneralSectionwriteHelper.portno_StartToken = "portno=";
        theManagergeneralSectionwriteHelper.portno_StopToken = "\n";
        theManagergeneralSectionwriteHelper.bindaddr_StartToken = "bindaddr=";
        theManagergeneralSectionwriteHelper.bindaddr_StopToken = "\n";
        theManagergeneralSectionwriteHelper.port_StartToken = "port=";
        theManagergeneralSectionwriteHelper.port_StopToken = "\n";
        theManagergeneralSectionwriteHelper.fileid_StartToken = "fileid=";
        theManagergeneralSectionwriteHelper.fileid_StopToken = "\n";

        theManagerdenywriteHelper = new ManagerdenywriteHelper();
        theManagerdenywriteHelper.value_StartToken = "value=";
        theManagerdenywriteHelper.value_StopToken = "\n";

        theManagerSectionwriteHelper = new ManagerSectionwriteHelper();
        theManagerSectionwriteHelper.username_StartToken = "username=";
        theManagerSectionwriteHelper.username_StopToken = "\n";
        theManagerSectionwriteHelper.secret_StartToken = "secret=";
        theManagerSectionwriteHelper.secret_StopToken = "\n";
        theManagerSectionwriteHelper.read_StartToken = "read=";
        theManagerSectionwriteHelper.read_StopToken = "\n";
        theManagerSectionwriteHelper.write_StartToken = "write=";
        theManagerSectionwriteHelper.write_StopToken = "\n";

        theManagerpermitwriteHelper = new ManagerpermitwriteHelper();
        theManagerpermitwriteHelper.value_StartToken = "value=";
        theManagerpermitwriteHelper.value_StopToken = "\n";

    }

}
