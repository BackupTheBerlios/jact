/*
 * (c) urs zeidler
 */
package com.useit.jact.model.applications;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.useit.app.framework.model.dataModel.IModelFactory;
import com.useit.jact.model.types.AbstractExtension;
import com.useit.jact.model.types.PbxApplication;

import de.urszeidler.jact.model.applicationParser.analysis.DepthFirstAdapter;
import de.urszeidler.jact.model.applicationParser.lexer.Lexer;
import de.urszeidler.jact.model.applicationParser.lexer.LexerException;
import de.urszeidler.jact.model.applicationParser.node.AApp;
import de.urszeidler.jact.model.applicationParser.node.ACparaSpara;
import de.urszeidler.jact.model.applicationParser.node.ADialstrPara;
import de.urszeidler.jact.model.applicationParser.node.ADpara;
import de.urszeidler.jact.model.applicationParser.node.ADparaSpara;
import de.urszeidler.jact.model.applicationParser.node.AStringLitPara;
import de.urszeidler.jact.model.applicationParser.node.AUrlPara;
import de.urszeidler.jact.model.applicationParser.node.PParalist;
import de.urszeidler.jact.model.applicationParser.node.Start;
import de.urszeidler.jact.model.applicationParser.node.TDialstr;
import de.urszeidler.jact.model.applicationParser.node.TDoublep;
import de.urszeidler.jact.model.applicationParser.node.TIdentifier;
import de.urszeidler.jact.model.applicationParser.node.TNumber;
import de.urszeidler.jact.model.applicationParser.node.TStringLit;
import de.urszeidler.jact.model.applicationParser.node.TStsep;
import de.urszeidler.jact.model.applicationParser.node.TUrl;
import de.urszeidler.jact.model.applicationParser.parser.Parser;
import de.urszeidler.jact.model.applicationParser.parser.ParserException;

/**
 * <p>
 * ModelFactoryapplicationsImpl
 * </p>
 * Created : 22.05.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ModelFactoryPOJOImpl.vm,v 1.1 2006/05/26
 *          09:15:04 urs Exp $
 */
public class ModelFactoryapplicationsImpl extends ModelFactoryapplications {
    private final class ParaBuilder extends DepthFirstAdapter {
        /**
         * Logger for this class
         */
        private final Logger LOGGER = Logger.getLogger(ParaBuilder.class);

        private final List<String> fList;

        private ParaBuilder(List<String> list) {
            super();
            this.fList = list;
        }
                    @Override
                    public void caseTNumber(TNumber node) {
                         this.fList.add(node.getText());
                    }

        @Override
        public void caseTIdentifier(TIdentifier node) {
            this.fList.add(node.getText());
        }
        @Override
        public void caseTUrl(TUrl node) {
            this.fList.add(node.getText());
        }
        
        @Override
        public void caseTDialstr(TDialstr node) {
            String text = node.getText();
            int i = text.indexOf('/');
            if(i!=-1){
                this.fList.add(text.substring(0, i));
                this.fList.add(text.substring(i+1, text.length()));
                
            }
            //this.fList.add(node.getText());
        }
    }

    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(ModelFactoryapplicationsImpl.class);

    public static final ModelFactoryapplicationsImpl defaultModelFactory = new ModelFactoryapplicationsImpl();
    //private Object theApp;

    /**
     * @param testString
     * @return
     */
    private Parser parseIntern(String testString) {
        Parser p = new Parser(new Lexer(new PushbackReader(new StringReader(
                testString), 1024)));
        return p;
    }

    public PbxApplication createAppFromString(String app) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("createAppFromString(String) -  : app=" + app);
        }
        
        Parser parser = parseIntern(app);
        //TODO : all application have inherited from PbxApplication
        try {
            Start tree = parser.parse();

            tree.apply(this);
            if (theApp!=null){
                PbxApplication t = (PbxApplication) theApp;
                theApp = null;
                return t;
            }
                
        } catch (ParserException e) {
            LOGGER.error("createAppFromString(String) "+app, e);
        } catch (LexerException e) {
            LOGGER.error("createAppFromString(String) "+app, e);
        } catch (IOException e) {
            LOGGER.error("createAppFromString(String) "+app, e);
        }

        return null;
    }

    @Override
    protected void setParas_Dial(List typedList, IDial anApp) {
        // we don't handle optional parameters here
        if(typedList.size()==7){
            anApp.setTechnology(typedList.get(0).toString());
            anApp.setResource(typedList.get(1).toString());
            anApp.setTechnology2(typedList.get(2).toString());
            anApp.setResource2(typedList.get(3).toString());
            anApp.setTimeout(typedList.get(4).toString());
            anApp.setOptions(typedList.get(5).toString());
            anApp.setURL(typedList.get(6).toString());
        }
        if(typedList.size()==5){
            anApp.setTechnology(typedList.get(0).toString());
            anApp.setResource(typedList.get(1).toString());
            anApp.setTimeout(typedList.get(2).toString());
            anApp.setOptions(typedList.get(3).toString());
            anApp.setURL(typedList.get(4).toString());
        }
        if(typedList.size()==4){
            anApp.setTechnology(typedList.get(0).toString());
            anApp.setResource(typedList.get(1).toString());
            anApp.setTimeout(typedList.get(2).toString());
            anApp.setOptions(typedList.get(3).toString());
        }
        if(typedList.size()==2){
            anApp.setTechnology(typedList.get(0).toString());
            anApp.setResource(typedList.get(1).toString());
         }

    }
    
    @Override
    protected void setParas_Goto(List typedList, IGoto anApp) {
       // super.setParas_Goto(typedList, anApp);
        if(typedList.size()==3){
            anApp.setContext(typedEntryToString(typedList.get(0)));
            anApp.setExtension(new AbstractExtension(typedList.get(1).toString()));
            anApp.setPriority(typedList.get(2).toString());
        }

        if(typedList.size()==2){
            //anApp.setContext(typedList.get(0).toString());
            anApp.setExtension(new AbstractExtension(typedList.get(0).toString()));
            anApp.setPriority(typedList.get(1).toString());
        }
  
        
    }
// 
//    @Override
//    public void caseADigittimeoutAppApp(ADigittimeoutAppApp node) {
//         super.caseADigittimeoutAppApp(node);
//        //Object obj = node;
//        PDigittimeoutApp digittimeoutApp = node.getDigittimeoutApp();
//        if (digittimeoutApp instanceof ADigittimeoutApp) {
//            ADigittimeoutApp app = (ADigittimeoutApp) digittimeoutApp;
//
//            DigitTimeout dt = (DigitTimeout) createModelElement_DigitTimeout();
//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            //if()
//            if(typedList.size()==1)
//                dt.setSeconds(typedList.get(0).toString());
//
//            theApp = dt;
//        }// end of if (node instanceof ADigittimeoutApp)
//        // dt.setSeconds(node.getParalist());
//    }
//
//    protected List getTypedList(PParalist paralist) {
//        if (paralist instanceof ACommaparalistParalist) {
//            ACommaparalistParalist cop = (ACommaparalistParalist) paralist;
//            ACommaparalist commaparalist = (ACommaparalist) cop.getCommaparalist();
//            return commaparalist.getSpara();
//            //commaparalist.toString();
//
//        }// end of if (paralist instanceof ACommaparalistParalist)
//        
//        
//        if (paralist instanceof ACurrparalistParalist) {
//            ACurrparalistParalist cup = (ACurrparalistParalist) paralist;
//            ACurrparalist currparalist = (ACurrparalist) cup.getCurrparalist();
//            return currparalist.getSpara();
//            
//        }//end of if (paralist instanceof ACurrparalistParalist)
//        
//        return Collections.EMPTY_LIST;
//    }

    protected List getTypedList(PParalist paralist) {
        final List<String> paraList = new ArrayList<String>();
        
        paralist.apply(new ParaBuilder(paraList));
        
        return paraList;
     }

    
    private String typedEntryToString(Object entry) {
        if (entry instanceof ACparaSpara) {
            ACparaSpara cp = (ACparaSpara) entry;
            //cp.getCpara().
        }//end of if (entry instanceof ACparaSpara)
        return entry.toString();
    }

//    public void caseAMd5AppApp(AMd5AppApp node) {
//        // TODO Automatisch erstellter Methoden-Stub
//
//    }
//
//    public void caseAMd5App(AMd5App node) {
//        // TODO Automatisch erstellter Methoden-Stub
//
//    }
//
//    public void caseTMd5(TMd5 node) {
//        // TODO Automatisch erstellter Methoden-Stub
//
//    }

    public void caseTStsep(TStsep node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }

    public void caseAStringLitPara(AStringLitPara node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }

    public void caseTStringLit(TStringLit node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }

    public void caseAUrlPara(AUrlPara node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }

    public void caseTUrl(TUrl node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }

    public void caseADparaSpara(ADparaSpara node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }

    public void caseADpara(ADpara node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }

    public void caseTDoublep(TDoublep node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }

    public void caseTDialstr(TDialstr node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }

    public void caseADialstrPara(ADialstrPara node) {
      
        
    }

    public void caseAApp(AApp node) {
        String text = node.getIdentifier().getText();
        theApp = createModelElement(text);
        List typedList = getTypedList(node.getParalist());
        setParas(typedList, theApp);
        
    }


}
