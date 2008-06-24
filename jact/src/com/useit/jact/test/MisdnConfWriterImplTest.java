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

import com.useit.jact.io.misdnconf.ConfWriterImpl;
import com.useit.jact.io.misdnconf.XmlHandlerImpl;
import com.useit.jact.model.misdnconf.MisdnconfImpl;

/**
 * <p>
 * MisdnConfWriterImplTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnConfWriterImplTest.java,v 1.2 2005/09/20
 *          14:02:21 urs Exp $
 */
public class MisdnConfWriterImplTest extends TestCase {

    private ConfWriterImpl writer;

    private MisdnconfImpl impl;

    private String filename = "C:/Dokumente und Einstellungen/urs/Eigene Dateien/jact/misdnconf.xml";

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(MisdnConfWriterImplTest.class);
    }

    /*
     * @see
     */
    protected void setUp() throws Exception {
        super.setUp();
        writer = new ConfWriterImpl();
        impl = new MisdnconfImpl();

    }

    /*
     * @see
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public final void testWritetoString() {
        impl = (MisdnconfImpl) XmlHandlerImpl.readConf(filename);

        String str = writer.writetoString(impl);

        System.out.println(str);
    }

}
