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
package com.useit.jact.io.musiconholdconf;

import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.6 2006/01/13 18:01:41
 *          urs Exp $
 */
public class ConfWriterImpl extends ConfWriter {

    /**
     * 
     */
    public ConfWriterImpl() {
        super();
        // TODO: die tokens anpassen

        theMohClasseswriteHelper = new MohClasseswriteHelper();
        theMohClasseswriteHelper.name_StartToken = "";
        theMohClasseswriteHelper.name_StopToken = "=>";
        theMohClasseswriteHelper.player_StartToken = "";
        theMohClasseswriteHelper.player_StopToken = "";
        theMohClasseswriteHelper.mohdir_StartToken = ":";
        theMohClasseswriteHelper.mohdir_StopToken = "";
        theMohClasseswriteHelper.mohpara_StartToken = ",";
        theMohClasseswriteHelper.mohpara_StopToken = "\n";

        theMusic_on_HoldConfwriteHelper = new Music_on_HoldConfwriteHelper();
        // theMusic_on_HoldConfwriteHelper.fileid_StartToken="fileid=";
        // theMusic_on_HoldConfwriteHelper.fileid_StopToken="\n";

    }

    @Override
    protected void writeMusic_on_HoldConf(StringBuffer strB,
            Music_on_HoldConf impl) {
        strB.append(";Music_on_HoldConf generated by jact\n");
        writeComment(strB, impl);
        writeSecHeader(strB, "classes");

        super.writeMusic_on_HoldConf(strB, impl);
    }
}
