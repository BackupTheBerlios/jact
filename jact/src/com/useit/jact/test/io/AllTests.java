/*
 * (c) urs zeidler
 */
package com.useit.jact.test.io;

import java.io.File;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.useit.app.framework.db.HibernateUtil;
import com.useit.app.framework.helper.UseFileHelper;

public class AllTests {
    static {
        File file = UseFileHelper.findFileInList(new String[] {
                "testEnv/hibernate.cfg.xml", "../testEnv/hibernate.cfg.xml",
                "jact/testEnv/hibernate.cfg.xml"

        });
        HibernateUtil.reinitConntection(file);

    }

    public static void main(String[] args) {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for com.useit.jact.test.io");
        // $JUnit-BEGIN$
        suite.addTestSuite(IOiaxconfTest.class);
        suite.addTestSuite(IOqueueconfTest.class);
        suite.addTestSuite(IOmisdndriverconfTest.class);
        suite.addTestSuite(IOvoicemailconfTest.class);
        suite.addTestSuite(IOfeatureconfTest.class);
        suite.addTestSuite(IOmusiconholdconfTest.class);
        suite.addTestSuite(IOzaptelconfTest.class);
        suite.addTestSuite(IOmisdnconfTest.class);
        suite.addTestSuite(IOagentconfTest.class);
        suite.addTestSuite(IOextensionconfTest.class);
        suite.addTestSuite(IOmanagerconfTest.class);
        suite.addTestSuite(IOindicationsconfTest.class);
        suite.addTestSuite(IOmeetmeconfTest.class);
        suite.addTestSuite(IOalarmreciverconfTest.class);
        suite.addTestSuite(IOsipconfTest.class);
        suite.addTestSuite(IOzapataconfTest.class);
        suite.addTestSuite(IOconfReadingTest.class);
        // $JUnit-END$
        return suite;
    }

}
