/*******************************************************************************
 * Copyright (c) 2005 Urs Zeidler
 * This program is free software, distributed under the terms of 
 * the GNU General Public License Version 2. See the LICENSE file 
 * at the top of the source tree.
 * 
 *
 * Contributors:
 *     Urs Zeidler
 *******************************************************************************/
/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zaptelconf;

import java.util.Iterator;

import com.useit.jact.model.zaptelconf.Zaptelchannels;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.Zapteldynamicspan;
import com.useit.jact.model.zaptelconf.Zaptelspan;
import com.useit.jact.model.zaptelconf.Zapteltonezone;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.6 2006/03/17 10:42:52
 *          urs Exp $
 */
public class ConfWriterImpl extends ConfWriter {

    /**
     * 
     */
    public ConfWriterImpl() {
        super();
        COMMENTTOK = "#";

        theZapteltonezonewriteHelper = new ZapteltonezonewriteHelper();
        theZapteltonezonewriteHelper.zonename_StartToken = "zonename=";
        theZapteltonezonewriteHelper.zonename_StopToken = "\n";

        theZaptelchannelswriteHelper = new ZaptelchannelswriteHelper();
        theZaptelchannelswriteHelper.device_StartToken = "";
        theZaptelchannelswriteHelper.device_StopToken = "=";
        theZaptelchannelswriteHelper.channellist_StartToken = "";
        theZaptelchannelswriteHelper.channellist_StopToken = "\n";

        theZaptelconfwriteHelper = new ZaptelconfwriteHelper();
        theZaptelconfwriteHelper.defaultzone_StartToken = "defaultzone=";
        theZaptelconfwriteHelper.defaultzone_StopToken = "\n";

        theZapteldynamicspanwriteHelper = new ZapteldynamicspanwriteHelper();
        theZapteldynamicspanwriteHelper.driver_StartToken = "dynamic=";
        theZapteldynamicspanwriteHelper.driver_StopToken = "";
        theZapteldynamicspanwriteHelper.address_StartToken = ",";
        theZapteldynamicspanwriteHelper.address_StopToken = "";
        theZapteldynamicspanwriteHelper.numchans_StartToken = ",";
        theZapteldynamicspanwriteHelper.numchans_StopToken = "";
        theZapteldynamicspanwriteHelper.timing_StartToken = ",";
        theZapteldynamicspanwriteHelper.timing_StopToken = "\n";

        theZaptelspanwriteHelper = new ZaptelspanwriteHelper();
        theZaptelspanwriteHelper.span_num_StartToken = "span=";
        theZaptelspanwriteHelper.span_num_StopToken = "";
        theZaptelspanwriteHelper.timing_StartToken = ",";
        theZaptelspanwriteHelper.timing_StopToken = "";
        theZaptelspanwriteHelper.lbo_StartToken = ",";
        theZaptelspanwriteHelper.lbo_StopToken = "";
        theZaptelspanwriteHelper.framing_StartToken = ",";
        theZaptelspanwriteHelper.framing_StopToken = "";
        theZaptelspanwriteHelper.coding_StartToken = ",";
        theZaptelspanwriteHelper.coding_StopToken = "";
        theZaptelspanwriteHelper.yellow_StartToken = ",";
        theZaptelspanwriteHelper.yellow_StopToken = "";

    }

    @Override
    protected void writeZaptelconf(StringBuffer strB, Zaptelconf impl) {
        strB.append("#Zaptel config config generated by jact\n");
        writeComment(strB, impl);
        writeZaptelconfAggregates(strB, impl);
        writeZaptelconfFields(strB, impl);
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
        strB.append("#spawn\n");
        // ZaptelspanMap
        for (Iterator iter = impl.getZaptelspanMap().iterator(); iter.hasNext();) {
            Zaptelspan mobj = (Zaptelspan) iter.next();
            writeZaptelspan(strB, mobj);
        }
        strB.append("#dynamic spawn\n");
        // ZapteldynamicspanMap
        for (Iterator iter = impl.getZapteldynamicspanMap().iterator(); iter
                .hasNext();) {
            Zapteldynamicspan mobj = (Zapteldynamicspan) iter.next();
            writeZapteldynamicspan(strB, mobj);
        }
        strB.append("#channel spawn\n");
        // ZaptelchannelsMap
        for (Iterator iter = impl.getZaptelchannelsMap().iterator(); iter
                .hasNext();) {
            Zaptelchannels mobj = (Zaptelchannels) iter.next();
            writeZaptelchannels(strB, mobj);
        }
        // ZapteltonezoneMap
        for (Iterator iter = impl.getZapteltonezoneMap().iterator(); iter
                .hasNext();) {
            Zapteltonezone mobj = (Zapteltonezone) iter.next();
            writeZapteltonezone(strB, mobj);
        }

    }

    @Override
    protected void writeZaptelspan(StringBuffer strB, Zaptelspan impl) {
        super.writeZaptelspan(strB, impl);
        writeEmtypLine(strB);
    }
}