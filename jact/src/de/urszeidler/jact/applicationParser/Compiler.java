/*
 * (c) urs zeidler
 */
package de.urszeidler.jact.applicationParser;

import java.io.PushbackReader;
import java.io.StringReader;

import de.urszeidler.jact.model.applicationParser.lexer.Lexer;
import de.urszeidler.jact.model.applicationParser.node.PApp;
import de.urszeidler.jact.model.applicationParser.node.Start;
import de.urszeidler.jact.model.applicationParser.parser.Parser;

public class Compiler {
    public static void main(String[] arguments) {
        testParseing("DigitTimeout,5");
        
        testParseing("Goto(6236|1)");
        
        testParseing("Dial, SIP/urs,20,tr");
        
        testParseing("Playback(invalid)");
        
        testParseing("Macro(stdexten,6275,${MARK})");
        
        testParseing("Goto(6236|1)");
        
        
        
    }

    /**
     * @param testString
     */
    private static void testParseing(String testString) {
        System.out.println("doing :"+testString);
        
        try {

            // Create a Parser instance.
            Parser p = parseIntern(testString);

            // Parse the input.
            Start tree = p.parse();
            PApp app = tree.getPApp();
            
            app.toString();
            
            // Apply the translation.
            tree.apply(new Translation());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param testString
     * @return
     */
    private static Parser parseIntern(String testString) {
        Parser p = new Parser(new Lexer(new PushbackReader(
                new StringReader(testString), 1024)));
        return p;
    }
}
