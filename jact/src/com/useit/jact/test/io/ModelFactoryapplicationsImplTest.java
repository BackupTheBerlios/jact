/*
 * (c) urs zeidler
 */
package com.useit.jact.test.io;

import java.io.PushbackReader;
import java.io.StringReader;

import junit.framework.TestCase;

import com.useit.jact.model.applications.AGIImpl;
import com.useit.jact.model.applications.DialImpl;
import com.useit.jact.model.applications.DigitTimeoutImpl;
import com.useit.jact.model.applications.ModelFactoryapplicationsImpl;

import de.urszeidler.jact.model.applicationParser.lexer.Lexer;
import de.urszeidler.jact.model.applicationParser.node.Start;
import de.urszeidler.jact.model.applicationParser.parser.Parser;

public class ModelFactoryapplicationsImplTest extends TestCase {
    public void testparser()  {
        try {
            String testString = "Playback";
            Parser parser = parseIntern(testString);
            Start tree = parser.parse();
            System.out.println(tree);
            
            
            testString = "Playback(agi,skip)";
            parser = parseIntern(testString);
            tree = parser.parse();
            System.out.println(tree);
            
            testString = "testServer(fff://a1.gg)";
            parser = parseIntern(testString);
            tree = parser.parse();
            System.out.println(tree);
            
            testString = "testServer(1,db,'gh')";
            parser = parseIntern(testString);
            tree = parser.parse();
            System.out.println(tree);
            
            testString = "testServer,1,db,'gh'";
            parser = parseIntern(testString);
            tree = parser.parse();
            System.out.println(tree);
        } catch (Exception e) {
            e.printStackTrace();
           // System.out.println(e);
        }
             
                
        
    }
    
    /**
     * @param testString
     * @return
     */
    private Parser parseIntern(String testString) {
        Parser p = new Parser(new Lexer(new PushbackReader(new StringReader(
                testString), 1024)));
        return p;
    }
 
    /*
     * Methode für 'com.useit.jact.model.applications.ModelFactoryapplicationsImpl.createAppFromString(String)' testen
     */
    public void testCreateAppFromString() {
       ModelFactoryapplicationsImpl mf = (ModelFactoryapplicationsImpl) ModelFactoryapplicationsImpl.defaultModelFactory;
       
       Object application = mf.createAppFromString("DigitTimeout,5");
       assertEquals("sollte digittimeout sein", DigitTimeoutImpl.class, application.getClass());        
       System.out.println(application);
       
       application = mf.createAppFromString("Dial(SIP/urs,20,tr)");
       assertEquals("sollte dial sein", DialImpl.class, application.getClass());        
       System.out.println(application);
      
//       application = mf.createAppFromString("agi://192.168.10.1");
//       assertEquals("sollte agi sein", AGIImpl.class, application.getClass());        
//       System.out.println(application);
       application = mf.createAppFromString("agi(ttttt://192.168.10.1)");
       assertEquals("sollte agi sein", AGIImpl.class, application.getClass());        
       System.out.println(application);
      
    }

}
