/*
 * (c) urs zeidler
 */
package com.useit.jact.io.misdnconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.model.misdnconf.MisdnCryptkeyImpl;
import com.useit.jact.model.misdnconf.MisdnPorts;
import com.useit.jact.model.misdnconf.MisdnSections;
import com.useit.jact.model.misdnconf.Misdnconf;
import com.useit.jact.model.types.MisdnPortOptionsSet;

/**
 * <p>
 * ConfReaderImpl
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.6 2006/01/13 16:54:44
 *          urs Exp $
 */
public class ConfReaderImpl extends ConfReader {

    private static final String GENERAL = "general";

    private static final String DEFAULTSEC = "default";

    /**
     * 
     */
    public ConfReaderImpl() {
        super();
        COMMENTTOK = ";";
        SECHEADERTOK = "[";
        entryStops = new String[] { "\n", "\r" };
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

        Misdnconf misdnconf = buildMisdnconfModelElement(getWorkingMisdnconfEntryList());
        // driverConf = null;//buildCardConf();

        return misdnconf;

    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMisdnconfModelAgg(List entryList, Misdnconf impl) {
        for (int i = 0; i < entryList.size(); i++) {
            Confvalue cv = (Confvalue) entryList.get(i);
            if (cv.key.equals("crypt_keys")) {
                try {
                    String[] ar = cv.value.split(",");
                    MisdnCryptkeyImpl cryptkeyImpl = new MisdnCryptkeyImpl(
                            ar[0], ar[1]);
                    impl.addMisdnCryptkey(cryptkeyImpl);

                } catch (Exception e) {
                    System.out.println("no key " + cv.key);
                }
            }
        }// end of for i to entryList

        // aggregate lesen
        ConfSecHeader header = findConfHeader(DEFAULTSEC);

        if (header != null) {
            buildMisdnSectionsModelVaues(header.val, impl.getMisdnSections());
            impl.getMisdnSections().setSectionname(DEFAULTSEC);
            // MisdnSections default
            // MisdnSections aMisdnSections =
            // buildMisdnSectionsModelElement(header.val);
            // impl.setMisdnSections(aMisdnSections);

        }
        // writeMisdnSections(strB, impl.getMisdnSections());
        // //maps schreiben
        // // MisdnCryptkeyMap
        // for (Iterator iter = impl.getMisdnCryptkeyMap().values().iterator();
        // iter.hasNext();) {
        // MisdnCryptkey aMisdnCryptkeyM =
        // buildMisdnCryptkeyModelElement(entryList);
        // impl.getMisdnCryptkeyMap().putMisdnCryptkey( aMisdnCryptkeyM);
        // //MisdnCryptkey mobj = (MisdnCryptkey) iter.next();
        // //writeMisdnCryptkey(strB,mobj);
        // }
        // MisdnSectionsMap

        for (Iterator iter = headerList.iterator(); iter.hasNext();) {
            header = (ConfSecHeader) iter.next();
            if (!header.content.equals(DEFAULTSEC)
                    && !header.content.equals(GENERAL)) {

                MisdnSections aMisdnSectionsM = buildMisdnSectionsModelElement(header.val);
                aMisdnSectionsM.setSectionname(header.content);
                impl.addMisdnSections(aMisdnSectionsM);

                for (int i = 0; i < header.val.size(); i++) {
                    Confvalue cv = (Confvalue) header.val.get(i);
                    if (cv.key.equalsIgnoreCase("ports")) {
                        try {
                            String[] ar = cv.value.split(",");
                            for (int j = 0; j < ar.length; j++) {
                                String pnr = ar[j];
                                MisdnPorts port = new MisdnPorts();
                                if (pnr.endsWith("ptp")) {
                                    port
                                            .setPortOption(MisdnPortOptionsSet.E_NT_PTP);
                                    pnr = pnr.substring(0, pnr.length() - 3);
                                }
                                port.setPortN(new Integer(pnr));
                                aMisdnSectionsM.addMisdnPorts(port);
                            }
                        } catch (Exception e) {
                            System.out.println("no port ");
                        }
                    }
                }// end of for i to header.val

            }
            // MisdnSections mobj = (MisdnSections) iter.next();
            // writeMisdnSections(strB,mobj);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.io.misdnconf.ConfReader#getWorkingMisdnconfEntryList()
     */
    protected List getWorkingMisdnconfEntryList() {
        ConfSecHeader header = findConfHeader("general");
        if (header == null)
            return null;
        return header.val;
    }

    protected List getWorkingEntryList() {

        return entrylist;

    }
}
