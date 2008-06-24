/*
 * (c) urs zeidler
 */
package com.useit.jact.test.io;

import java.io.File;

import junit.framework.TestCase;

import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.MMFextensionconf;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.MMFiaxconf;
import com.useit.jact.model.managerconf.MMFmanagerconf;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.sipconf.MMFsipconf;
import com.useit.jact.model.sipconf.SipConf;

public class IOconfReadingTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
    public void testExtensionConf() throws Exception {
        Extensionconf ec =  (Extensionconf) MMFextensionconf.getInstance().readConf(new File("testEnv/extensions.conf"));
        ec.toString();
        
//        assertEquals("sollten drei Mananger sein",3, mg.getManagerSectionMap().size());
//        assertEquals("sollte port 5038 sein" ,5038, mg.getPort().intValue());
    }
    
    public void testManagerConf() throws Exception {
        ManagergeneralSection mg = (ManagergeneralSection) MMFmanagerconf.getInstance().readConf(new File("testEnv/manager.conf"));
        assertEquals("sollten drei Mananger sein",3, mg.getManagerSectionMap().size());
        assertEquals("sollte port 5038 sein" ,5038, mg.getPort().intValue());
    }
    
    public void testsipConf() throws Exception {
        SipConf sc = (SipConf) MMFsipconf.getInstance().readConf(new File("testEnv/sip.conf"));
        
        assertEquals("sollte 1200 sein",1200, sc.getSipgeneral().getDefaultexpirey().intValue());
        assertEquals("sollte 192.168.10.0/255.255.255.0 sein","192.168.10.0/255.255.255.0", sc.getSipgeneral().getLocalnet());
        assertEquals("sollten 12 sein",12, sc.getSippeersMap().size());
        
    }
    
    public void testIAXConf() throws Exception {
        Iaxgeneral ic = (Iaxgeneral) MMFiaxconf.getInstance().readConf(new File("testEnv/iax.conf"));
        
        assertEquals("sollte de sein", "de",ic.getLanguage());
        assertEquals("sollte low sein", "low",ic.getBandwidth());
        assertEquals("sollten 9 sein",9, ic.getIaxpeerMap().size());
        
    }
}
