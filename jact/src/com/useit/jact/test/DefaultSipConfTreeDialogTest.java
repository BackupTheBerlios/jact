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

import com.useit.app.framework.io.BasicSax;
import com.useit.jact.gui.sipconf.DefaultsipconfTreeDialog;
import com.useit.jact.io.sipconf.XmlHandlerImpl;

/**
 * <p>
 * DefaultSipConfTreeDialogTest
 * </p>
 * Created : 12.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DefaultSipConfTreeDialogTest.java,v 1.10
 *          2006/01/09 10:17:42 urs Exp $
 */
public class DefaultSipConfTreeDialogTest extends TestCase {

    private DefaultsipconfTreeDialog dlg;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(DefaultSipConfTreeDialogTest.class);
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

    /*
     * Zu testende Klasse für void DefaultSipConfTree_Dialog(Object)
     */
    public final void testDefaultSipConfTreeDialogObject() {

        // SipConfImpl model = new SipConfImpl();
        //        
        // dlg = new DefaultSipConfTree_Dialog(model);
        // dlg.setVisible(true);
        //        
        // ConfWriterImpl writer = new ConfWriterImpl();
        // String test = writer.writeSipConf(model);
        // System.out.println(test);
        //        
        // new SipConfXMLwriter(model);

        XmlHandlerImpl hnd = new XmlHandlerImpl();
        BasicSax.parseXmlFile("test1.xml", hnd, false);

        dlg = new DefaultsipconfTreeDialog(hnd.getSipConf());
        dlg.setVisible(true);
    }

}
