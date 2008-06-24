/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zaptelconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.zaptelconf.Zaptelchannels;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.Zapteldynamicspan;
import com.useit.jact.model.zaptelconf.Zaptelspan;
import com.useit.jact.model.zaptelconf.Zapteltonezone;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.9 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class ZapteltonezonewriteHelper {

        public String zonename_StartToken;

        public String zonename_StopToken;

        public void writezonename(StringBuffer strB, Zapteltonezone impl) {
            if (impl.getZonename() != null && zonename_StartToken != null) {
                strB.append(zonename_StartToken).append(impl.getZonename())
                        .append(zonename_StopToken);
            }
        }
    }; // end of ZapteltonezonewriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class ZaptelchannelswriteHelper {

        public String device_StartToken;

        public String device_StopToken;

        public void writedevice(StringBuffer strB, Zaptelchannels impl) {
            if (impl.getDevice() != null && device_StartToken != null) {
                strB.append(device_StartToken).append(impl.getDevice()).append(
                        device_StopToken);
            }
        }

        public String channellist_StartToken;

        public String channellist_StopToken;

        public void writechannellist(StringBuffer strB, Zaptelchannels impl) {
            if (impl.getChannellist() != null && channellist_StartToken != null) {
                strB.append(channellist_StartToken).append(
                        impl.getChannellist()).append(channellist_StopToken);
            }
        }
    }; // end of ZaptelchannelswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class ZaptelconfwriteHelper {

        public String defaultzone_StartToken;

        public String defaultzone_StopToken;

        public void writedefaultzone(StringBuffer strB, Zaptelconf impl) {
            if (impl.getDefaultzone() != null && defaultzone_StartToken != null) {
                strB.append(defaultzone_StartToken).append(
                        impl.getDefaultzone()).append(defaultzone_StopToken);
            }
        }
    }; // end of ZaptelconfwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class ZapteldynamicspanwriteHelper {

        public String driver_StartToken;

        public String driver_StopToken;

        public void writedriver(StringBuffer strB, Zapteldynamicspan impl) {
            if (impl.getDriver() != null && driver_StartToken != null) {
                strB.append(driver_StartToken).append(impl.getDriver()).append(
                        driver_StopToken);
            }
        }

        public String address_StartToken;

        public String address_StopToken;

        public void writeaddress(StringBuffer strB, Zapteldynamicspan impl) {
            if (impl.getAddress() != null && address_StartToken != null) {
                strB.append(address_StartToken).append(impl.getAddress())
                        .append(address_StopToken);
            }
        }

        public String numchans_StartToken;

        public String numchans_StopToken;

        public void writenumchans(StringBuffer strB, Zapteldynamicspan impl) {
            if (impl.getNumchans() != null && numchans_StartToken != null) {
                strB.append(numchans_StartToken).append(impl.getNumchans())
                        .append(numchans_StopToken);
            }
        }

        public String timing_StartToken;

        public String timing_StopToken;

        public void writetiming(StringBuffer strB, Zapteldynamicspan impl) {
            if (impl.getTiming() != null && timing_StartToken != null) {
                strB.append(timing_StartToken).append(impl.getTiming()).append(
                        timing_StopToken);
            }
        }
    }; // end of ZapteldynamicspanwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class ZaptelspanwriteHelper {

        public String span_num_StartToken;

        public String span_num_StopToken;

        public void writespan_num(StringBuffer strB, Zaptelspan impl) {
            if (impl.getSpan_num() != null && span_num_StartToken != null) {
                strB.append(span_num_StartToken).append(impl.getSpan_num())
                        .append(span_num_StopToken);
            }
        }

        public String timing_StartToken;

        public String timing_StopToken;

        public void writetiming(StringBuffer strB, Zaptelspan impl) {
            if (impl.getTiming() != null && timing_StartToken != null) {
                strB.append(timing_StartToken).append(impl.getTiming()).append(
                        timing_StopToken);
            }
        }

        public String lbo_StartToken;

        public String lbo_StopToken;

        public void writelbo(StringBuffer strB, Zaptelspan impl) {
            if (impl.getLbo() != null && lbo_StartToken != null) {
                strB.append(lbo_StartToken).append(impl.getLbo()).append(
                        lbo_StopToken);
            }
        }

        public String framing_StartToken;

        public String framing_StopToken;

        public void writeframing(StringBuffer strB, Zaptelspan impl) {
            if (impl.getFraming() != null && framing_StartToken != null) {
                strB.append(framing_StartToken).append(impl.getFraming())
                        .append(framing_StopToken);
            }
        }

        public String coding_StartToken;

        public String coding_StopToken;

        public void writecoding(StringBuffer strB, Zaptelspan impl) {
            if (impl.getCoding() != null && coding_StartToken != null) {
                strB.append(coding_StartToken).append(impl.getCoding()).append(
                        coding_StopToken);
            }
        }

        public String yellow_StartToken;

        public String yellow_StopToken;

        public void writeyellow(StringBuffer strB, Zaptelspan impl) {
            if (impl.getYellow() != null && yellow_StartToken != null) {
                strB.append(yellow_StartToken).append(impl.getYellow()).append(
                        yellow_StopToken);
            }
        }
    }; // end of ZaptelspanwriteHelper Declaration

    protected ZapteltonezonewriteHelper theZapteltonezonewriteHelper;

    protected ZaptelchannelswriteHelper theZaptelchannelswriteHelper;

    protected ZaptelconfwriteHelper theZaptelconfwriteHelper;

    protected ZapteldynamicspanwriteHelper theZapteldynamicspanwriteHelper;

    protected ZaptelspanwriteHelper theZaptelspanwriteHelper;

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
        if (data instanceof Zapteltonezone) {
            writeZapteltonezone(strB, (Zapteltonezone) data);
            return;
        }
        if (data instanceof Zaptelchannels) {
            writeZaptelchannels(strB, (Zaptelchannels) data);
            return;
        }
        if (data instanceof Zaptelconf) {
            writeZaptelconf(strB, (Zaptelconf) data);
            return;
        }
        if (data instanceof Zapteldynamicspan) {
            writeZapteldynamicspan(strB, (Zapteldynamicspan) data);
            return;
        }
        if (data instanceof Zaptelspan) {
            writeZaptelspan(strB, (Zaptelspan) data);
            return;
        }
    }

    /**
     * schreibt die Felder von Zapteltonezone
     * 
     * @param strB
     * @param msec
     */
    protected void writeZapteltonezoneFields(StringBuffer strB,
            Zapteltonezone impl) {

        // felder schreiben
        theZapteltonezonewriteHelper.writezonename(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Zapteltonezone
     * 
     * @param strB
     * @param msec
     */
    protected void writeZapteltonezoneAggregates(StringBuffer strB,
            Zapteltonezone impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Zapteltonezone Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeZapteltonezone(StringBuffer strB, Zapteltonezone impl) {
        writeZapteltonezoneFields(strB, impl);
        writeZapteltonezoneAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Zaptelchannels
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelchannelsFields(StringBuffer strB,
            Zaptelchannels impl) {

        // felder schreiben
        theZaptelchannelswriteHelper.writedevice(strB, impl);
        theZaptelchannelswriteHelper.writechannellist(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Zaptelchannels
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelchannelsAggregates(StringBuffer strB,
            Zaptelchannels impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Zaptelchannels Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelchannels(StringBuffer strB, Zaptelchannels impl) {
        writeZaptelchannelsFields(strB, impl);
        writeZaptelchannelsAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Zaptelconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelconfFields(StringBuffer strB, Zaptelconf impl) {

        // felder schreiben
        theZaptelconfwriteHelper.writedefaultzone(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Zaptelconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelconfAggregates(StringBuffer strB, Zaptelconf impl) {

        // aggregate schreiben
        // maps schreiben
        // ZaptelchannelsMap
        for (Iterator iter = impl.getZaptelchannelsMap().iterator(); iter
                .hasNext();) {
            Zaptelchannels mobj = (Zaptelchannels) iter.next();
            writeZaptelchannels(strB, mobj);
        }
        // ZapteldynamicspanMap
        for (Iterator iter = impl.getZapteldynamicspanMap().iterator(); iter
                .hasNext();) {
            Zapteldynamicspan mobj = (Zapteldynamicspan) iter.next();
            writeZapteldynamicspan(strB, mobj);
        }
        // ZaptelspanMap
        for (Iterator iter = impl.getZaptelspanMap().iterator(); iter.hasNext();) {
            Zaptelspan mobj = (Zaptelspan) iter.next();
            writeZaptelspan(strB, mobj);
        }
        // ZapteltonezoneMap
        for (Iterator iter = impl.getZapteltonezoneMap().iterator(); iter
                .hasNext();) {
            Zapteltonezone mobj = (Zapteltonezone) iter.next();
            writeZapteltonezone(strB, mobj);
        }

    }

    /**
     * schreibt ein Zaptelconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelconf(StringBuffer strB, Zaptelconf impl) {
        writeZaptelconfFields(strB, impl);
        writeZaptelconfAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Zapteldynamicspan
     * 
     * @param strB
     * @param msec
     */
    protected void writeZapteldynamicspanFields(StringBuffer strB,
            Zapteldynamicspan impl) {

        // felder schreiben
        theZapteldynamicspanwriteHelper.writedriver(strB, impl);
        theZapteldynamicspanwriteHelper.writeaddress(strB, impl);
        theZapteldynamicspanwriteHelper.writenumchans(strB, impl);
        theZapteldynamicspanwriteHelper.writetiming(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Zapteldynamicspan
     * 
     * @param strB
     * @param msec
     */
    protected void writeZapteldynamicspanAggregates(StringBuffer strB,
            Zapteldynamicspan impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Zapteldynamicspan Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeZapteldynamicspan(StringBuffer strB,
            Zapteldynamicspan impl) {
        writeZapteldynamicspanFields(strB, impl);
        writeZapteldynamicspanAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Zaptelspan
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelspanFields(StringBuffer strB, Zaptelspan impl) {

        // felder schreiben
        theZaptelspanwriteHelper.writespan_num(strB, impl);
        theZaptelspanwriteHelper.writetiming(strB, impl);
        theZaptelspanwriteHelper.writelbo(strB, impl);
        theZaptelspanwriteHelper.writeframing(strB, impl);
        theZaptelspanwriteHelper.writecoding(strB, impl);
        theZaptelspanwriteHelper.writeyellow(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Zaptelspan
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelspanAggregates(StringBuffer strB, Zaptelspan impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Zaptelspan Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelspan(StringBuffer strB, Zaptelspan impl) {
        writeZaptelspanFields(strB, impl);
        writeZaptelspanAggregates(strB, impl);

    }

    protected void initHelper() {
        theZapteltonezonewriteHelper = new ZapteltonezonewriteHelper();
        theZapteltonezonewriteHelper.zonename_StartToken = "zonename=";
        theZapteltonezonewriteHelper.zonename_StopToken = "\n";

        theZaptelchannelswriteHelper = new ZaptelchannelswriteHelper();
        theZaptelchannelswriteHelper.device_StartToken = "device=";
        theZaptelchannelswriteHelper.device_StopToken = "\n";
        theZaptelchannelswriteHelper.channellist_StartToken = "channellist=";
        theZaptelchannelswriteHelper.channellist_StopToken = "\n";

        theZaptelconfwriteHelper = new ZaptelconfwriteHelper();
        theZaptelconfwriteHelper.defaultzone_StartToken = "defaultzone=";
        theZaptelconfwriteHelper.defaultzone_StopToken = "\n";

        theZapteldynamicspanwriteHelper = new ZapteldynamicspanwriteHelper();
        theZapteldynamicspanwriteHelper.driver_StartToken = "driver=";
        theZapteldynamicspanwriteHelper.driver_StopToken = "\n";
        theZapteldynamicspanwriteHelper.address_StartToken = "address=";
        theZapteldynamicspanwriteHelper.address_StopToken = "\n";
        theZapteldynamicspanwriteHelper.numchans_StartToken = "numchans=";
        theZapteldynamicspanwriteHelper.numchans_StopToken = "\n";
        theZapteldynamicspanwriteHelper.timing_StartToken = "timing=";
        theZapteldynamicspanwriteHelper.timing_StopToken = "\n";

        theZaptelspanwriteHelper = new ZaptelspanwriteHelper();
        theZaptelspanwriteHelper.span_num_StartToken = "span_num=";
        theZaptelspanwriteHelper.span_num_StopToken = "\n";
        theZaptelspanwriteHelper.timing_StartToken = "timing=";
        theZaptelspanwriteHelper.timing_StopToken = "\n";
        theZaptelspanwriteHelper.lbo_StartToken = "lbo=";
        theZaptelspanwriteHelper.lbo_StopToken = "\n";
        theZaptelspanwriteHelper.framing_StartToken = "framing=";
        theZaptelspanwriteHelper.framing_StopToken = "\n";
        theZaptelspanwriteHelper.coding_StartToken = "coding=";
        theZaptelspanwriteHelper.coding_StopToken = "\n";
        theZaptelspanwriteHelper.yellow_StartToken = "yellow=";
        theZaptelspanwriteHelper.yellow_StopToken = "\n";

    }

}
