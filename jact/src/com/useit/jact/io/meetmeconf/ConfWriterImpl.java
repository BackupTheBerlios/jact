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
package com.useit.jact.io.meetmeconf;

import com.useit.jact.model.meetmeconf.Meetmeconf;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.5 2006/01/12 19:44:45
 *          urs Exp $
 */
public class ConfWriterImpl extends ConfWriter {

    /**
     * 
     */
    public ConfWriterImpl() {
        super();
        COMMENTTOK = ";";

        theMeetmeroomswriteHelper = new MeetmeroomswriteHelper();
        theMeetmeroomswriteHelper.confno_StartToken = "conf => ";
        theMeetmeroomswriteHelper.confno_StopToken = "";
        theMeetmeroomswriteHelper.pincode_StartToken = ",";
        theMeetmeroomswriteHelper.pincode_StopToken = "";
        theMeetmeroomswriteHelper.adminpin_StartToken = ",";
        theMeetmeroomswriteHelper.adminpin_StopToken = "";

        theMeetmeconfwriteHelper = new MeetmeconfwriteHelper();
        theMeetmeconfwriteHelper.fileid_StartToken = null;
        theMeetmeconfwriteHelper.fileid_StopToken = "\n";

    }

    @Override
    protected void writeMeetmeconf(StringBuffer strB, Meetmeconf impl) {
        strB.append(";Meetme config generated by jact\n");
        writeComment(strB, impl);
        writeSecHeader(strB, ConfReaderImpl.ROOMS);

        super.writeMeetmeconf(strB, impl);
    }
}
