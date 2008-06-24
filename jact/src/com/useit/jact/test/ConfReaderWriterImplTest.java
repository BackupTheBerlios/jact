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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.TestCase;

import com.useit.jact.io.misdnconf.ConfReaderImpl;
import com.useit.jact.io.misdnconf.ConfWriterImpl;
import com.useit.jact.model.misdnconf.MisdnconfImpl;

/**
 * <p>
 * ConfWriterImplTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderWriterImplTest.java,v 1.3
 *          2005/12/27 13:22:04 urs Exp $
 */
public class ConfReaderWriterImplTest extends TestCase {

    private ConfReaderImpl reader;

    private ConfWriterImpl writer;

    private MisdnconfImpl impl;

    private String filename = "C:/Dokumente und Einstellungen/urs/Eigene Dateien/jact/sipconfig.xml";

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(ConfReaderWriterImplTest.class);
    }

    /*
     * @see
     */
    protected void setUp() throws Exception {
        super.setUp();
        writer = new ConfWriterImpl();
        // impl = new SipConfImpl();
        reader = new ConfReaderImpl();

    }

    /*
     * @see
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public final void testReadFromString() {
        try {
            reader.readConf(new File("../asterisk/configs/misdn.conf"));

            for (int i = 0; i < reader.getEntrylist().size(); i++) {
                Object el = reader.getEntrylist().get(i);
                System.out.println(el);
            }// end of for i to reader.getEntrylist()

            // DefaultMisdncardconf_TreeDialog dlg = new
            // DefaultMisdncardconf_TreeDialog(impl.getDriverConf());
            // dlg.setVisible(true);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public final void testWritetoString() {
        // impl = (MisdnconfImpl) XmlHandlerImpl.readConf(filename);
        //
        //        
        // String str = writer.writetoString(impl);
        //        
        // System.out.println(str);
    }

}
