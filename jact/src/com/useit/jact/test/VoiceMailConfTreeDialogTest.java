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
package com.useit.jact.test;

import junit.framework.TestCase;

import com.useit.jact.gui.voicemailconf.DefaultvoicemailconfTreeDialog;
import com.useit.jact.gui.voicemailconf.GuiClassFactory;
import com.useit.jact.gui.voicemailconf.SimpleTreeModelImpl;
import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.VoicemailConfImpl;
import com.useit.jact.model.voicemailconf.VoicemailcontextImpl;
import com.useit.jact.model.voicemailconf.VoicemailcontextentryImpl;

/**
 * <p>
 * VoiceMailConfTreeDialogTest
 * </p>
 * Created : 12.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoiceMailConfTreeDialogTest.java,v 1.6
 *          2006/01/09 10:17:42 urs Exp $
 */
public class VoiceMailConfTreeDialogTest extends TestCase {

    private DefaultvoicemailconfTreeDialog dlg;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(VoiceMailConfTreeDialogTest.class);
    }

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testVoicemailConfDialog() {
        VoicemailConf voiceconf = new VoicemailConfImpl();

        VoicemailcontextImpl voicemailcontextImpl = new VoicemailcontextImpl();
        voicemailcontextImpl.setContextname("test context");
        voiceconf.addVoicemailcontext(voicemailcontextImpl);
        VoicemailcontextentryImpl voicemailcontextentryImpl = new VoicemailcontextentryImpl();
        voicemailcontextImpl
                .addVoicemailcontextentry(voicemailcontextentryImpl);

        dlg = new DefaultvoicemailconfTreeDialog(voiceconf);

        // dlg.setTreeModel(new SimpleTreeModelImpl(voiceconf));
        SimpleTreeModelImpl m = new SimpleTreeModelImpl();
        m.setRoot(voiceconf);
        dlg.setTreeModel(m);
        dlg.setTreeCellRenderer(GuiClassFactory.simpleTreeRendere());

        dlg.setVisible(true);

    }
}
