/*
 * (c) urs zeidler
 */
package com.useit.jact.io.sipconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.Sipgeneral;
import com.useit.jact.model.sipconf.Sippeers;
import com.useit.jact.model.sipconf.SipregisterImpl;

/**
 * <p>
 * ConfReaderImpl
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.4 2006/01/09 10:17:35
 *          urs Exp $
 */
public class ConfReaderImpl extends ConfReader {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfReaderImpl.class);

    public static final String GENERAL = "general";

    public static final String AUTHENTICATION = "authentication";

    public static final Pattern registerPattern = Pattern
            .compile("[ ]*register[ ]*=>[ ]*(.[^;]+)@(.[^;]+)");

    public static final Pattern reguserPattern = Pattern
            .compile("[ ]*(\\w+):(\\w+):(\\w+)|(\\w+):(\\w+)|(\\w+)");

    public static final Pattern reghostPattern = Pattern
            .compile("[ ]*(\\w+):(\\w+)/(\\w+)|(\\w+):(\\w+)|(\\w[^:]+)/(\\w[^/]+)|(\\w[^/:]+)");

    public static final Pattern authPattern = Pattern
            .compile("[ ]*(\\w+):(\\w+)/(\\w+)|(\\w+):(\\w+)|(\\w[^:]+)/(\\w[^/]+)|(\\w[^/:]+)");

    /**
     * 
     */
    public ConfReaderImpl() {
        super();
        COMMENTTOK = ";";
        SECHEADERTOK = "[";
        // String[] entryStops ={"\n","\r"};
    }

    /**
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        String content = UseFileHelper.readStringFromFile(selectedFile, 400);

        buildEntryList(content);

        Object driverConf;
        driverConf = buildSipConfModelElement(entrylist);

        return driverConf;
    }

    @Override
    protected void buildSippeersModelAgg(List entryList, Sippeers impl) {
        // aggregate schreiben
        // maps schreiben
        // SipauthMap
        // for (Iterator iter = impl.getSipauthMap().iterator();
        // iter.hasNext();) {
        // Sipauth aSipauthM = buildSipauthModelElement(entryList);
        // impl.addSipauth( aSipauthM);
        // //Sipauth mobj = (Sipauth) iter.next();
        // //writeSipauth(strB,mobj);
        // }
        // super.buildSippeersModelAgg(entryList, impl);
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildSipConfModelAgg(List entryList, SipConf impl) {

        // aggregate schreiben
        // Sipgeneral
        ConfSecHeader header = findConfHeader(GENERAL);
        if (header != null) {
            Sipgeneral aSipgeneral = buildSipgeneralModelElement(header.val);
            impl.setSipgeneral(aSipgeneral);
            // maps schreiben
            // register
            for (int i = 0; i < header.val.size(); i++) {
                Confentry ce = (Confentry) header.val.get(i);
                if (ce.content == null)
                    continue;

                Matcher matcher = registerPattern.matcher(ce.content);
                if (matcher.matches()) {
                    buildRegister(matcher.group(1), matcher.group(2),
                            aSipgeneral);
                }

            }// end of for i to header.val

            // header = findConfHeader(AUTHENTICATION);
            // for (int i = 0; i < header.val.size(); i++) {
            // Confentry ce = (Confentry) header.val.get(i);
            // if (ce instanceof Confvalue) {
            // Confvalue cv = (Confvalue) ce;
            // buildAuth(cv,aSipgeneral);
            //                    
            //                    
            // }//end of if (ce instanceof Confvalue)
            // }//end of for i to header.val
        }

        // writeSipgeneral(strB, impl.getSipgeneral());
        // SippeersMap
        for (int i = 0; i < headerList.size(); i++) {
            ConfSecHeader csh = (ConfSecHeader) headerList.get(i);
            if (!csh.content.equals(GENERAL)
                    && !csh.content.equals(AUTHENTICATION)) {
                Sippeers aSippeersM = buildSippeersModelElement(csh.val);
                aSippeersM.setSectionname(csh.content);
                impl.addSippeers(aSippeersM);

            }
        }// end of for i to headerList
    }

    // private void buildAuth(Confvalue cv, Sipgeneral impl) {
    //        
    //        
    // }

    @Override
    protected void buildSipgeneralModelVaues(List entryList, Sipgeneral impl) {
        super.buildSipgeneralModelVaues(entryList, impl);

        
        for (int i = 0; i < entryList.size(); i++) {
            Confentry ce = (Confentry) entryList.get(i);
            if (ce instanceof Confvalue) {
                Confvalue cv = (Confvalue) ce;
                if (cv.key != null) {
                    if (cv.key.equals("allow"))
                        impl.getAllow().add(cv.value);
                    if (cv.key.equals("disallow"))
                        impl.getDisallow().add(cv.value);
                }
                
            }// end of if (ce instanceof Confvalue)
        }// end of for i to entryList

    }

    @Override
    protected void buildSippeersModelVaues(List entryList, Sippeers impl) {
        super.buildSippeersModelVaues(entryList, impl);
        for (int i = 0; i < entryList.size(); i++) {
            Confentry ce = (Confentry) entryList.get(i);
            if (ce instanceof Confvalue) {
                Confvalue cv = (Confvalue) ce;
                if (cv.key != null) {
                    if (cv.key.equals("allow"))
                        impl.getAllow().add(cv.value);
                    if (cv.key.equals("disallow"))
                        impl.getDisallow().add(cv.value);
                }
            }// end of if (ce instanceof Confvalue)
        }// end of for i to entryList

    }

    private void buildRegister(String user, String host, Sipgeneral sipgeneral) {
        SipregisterImpl sipregisterImpl = new SipregisterImpl();
        try {
            String[] u = user.split(":");
            sipregisterImpl.setUser(u[0]);
            if (u.length == 3) {
                sipregisterImpl.setAuthuser(u[1]);
                sipregisterImpl.setSecret(u[2]);

            } else if (u.length == 2)
                sipregisterImpl.setSecret(u[1]);

            Matcher matcher = reghostPattern.matcher(host);
            if (matcher.find()) {
                if (matcher.group(1) != null) {
                    sipregisterImpl.setHost(matcher.group(1));
                    sipregisterImpl.setPort(new Integer(matcher.group(2)));
                    sipregisterImpl.setExtension(matcher.group(3));

                } else if (matcher.group(4) != null) {
                    sipregisterImpl.setHost(matcher.group(4));
                    sipregisterImpl.setPort(new Integer(matcher.group(5)));

                } else if (matcher.group(6) != null) {
                    sipregisterImpl.setHost(matcher.group(6));
                    sipregisterImpl.setExtension(matcher.group(3).substring(7));

                } else if (matcher.group(8) != null)
                    sipregisterImpl.setHost(matcher.group(8));

            }
            sipgeneral.addSipregister(sipregisterImpl);

        } catch (Exception e) {
            LOGGER.error(
                    "buildRegister(String, String, Sipgeneral) -  : sipgeneral="
                            + sipgeneral + ", sipregisterImpl="
                            + sipregisterImpl, e);
        }
    }

}
