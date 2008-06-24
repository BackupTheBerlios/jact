/*
 * (c) urs zeidler
 */
package com.useit.jact.test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.TestCase;

import com.useit.jact.gui.extensionconf.DefaultextensionconfTreeDialog;
import com.useit.jact.io.extensionconf.ConfReaderImpl;
import com.useit.jact.io.extensionconf.XmlHandlerImpl;

public class IOExtensionConfReaderImplTest extends TestCase {

    /*
     * Methode für 'com.useit.jact.io.extensionconf.ConfReaderImpl.readConf(File)' testen
     */
    public void testReadConf() {
ConfReaderImpl reader = new ConfReaderImpl();
try {
    Object obj = reader.readConf(new File("testEnv/extensions.conf"));
    DefaultextensionconfTreeDialog dialog = new DefaultextensionconfTreeDialog(obj);
    dialog.setVisible(true);
    
    
    XmlHandlerImpl.writeConf("testExtensionConf.xml", obj);
    //System.out.println(obj);
    
    
    
} catch (FileNotFoundException e) {
    // TODO Automatisch erstellter Catch-Block
    e.printStackTrace();
} catch (IOException e) {
    // TODO Automatisch erstellter Catch-Block
    e.printStackTrace();
}
    }

}
