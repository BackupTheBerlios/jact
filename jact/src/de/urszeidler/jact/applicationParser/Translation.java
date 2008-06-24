package de.urszeidler.jact.applicationParser;

import de.urszeidler.jact.model.applicationParser.analysis.DepthFirstAdapter;
import de.urszeidler.jact.model.applicationParser.node.ACommaparalist;
import de.urszeidler.jact.model.applicationParser.node.ANumberPara;
import de.urszeidler.jact.model.applicationParser.node.APara;
import de.urszeidler.jact.model.applicationParser.node.Start;

/*
 * (c) urs zeidler
 */

public class Translation extends DepthFirstAdapter { 
    
//    @Override
//    public void caseADigittimeoutAppApp(ADigittimeoutAppApp node) {
//        // TODO Automatisch erstellter Methoden-Stub
//        super.caseADigittimeoutAppApp(node);
//    }
    
    
    @Override
    public void caseStart(Start node) {
        System.out.println("node "+node);
        super.caseStart(node);
    }
    @Override
    public void caseAPara(APara node) {
        System.out.println("para "+ node);
        super.caseAPara(node);
    }
    
//    @Override
//    public void caseADigittimeoutApp(ADigittimeoutApp node) {
//        // TODO Automatisch erstellter Methoden-Stub
//        super.caseADigittimeoutApp(node);
//    }
    
    
    @Override
    public void caseACommaparalist(ACommaparalist node) {
        System.out.println("commalist "+ node);
        super.caseACommaparalist(node);
    }
//    @Override
//    public void caseAParalist(AParalist node) {
//        System.out.println("AParalist " +node);
//        super.caseAParalist(node);
//    }
    @Override
    public void caseANumberPara(ANumberPara node) {
        System.out.println("NumberPara " +node);
        super.caseANumberPara(node);
    }
    
}
