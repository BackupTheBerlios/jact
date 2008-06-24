/*
 * (c) urs zeidler
 */
package com.useit.jact.io.iaxconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.model.iaxconf.Iaxdeny;
import com.useit.jact.model.iaxconf.IaxdenyImpl;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.Iaxjitter;
import com.useit.jact.model.iaxconf.Iaxpeer;
import com.useit.jact.model.iaxconf.Iaxpermit;
import com.useit.jact.model.iaxconf.IaxpermitImpl;
import com.useit.jact.model.iaxconf.Iaxregister;
import com.useit.jact.model.iaxconf.IaxregisterImpl;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;

/**
 * <p>
 * ConfReaderImpl
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.2 2005/12/25 18:10:03
 *          urs Exp $
 */
public class ConfReaderImpl extends ConfReader {

    public static final String IAXJITTER = "iaxjitter";

    public static final String REGISTER = "register";

    public static final String GENERAL = "general";

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
        Iaxpeer peer = null;
        Iaxgeneral driverConf = null;
        Iaxjitter iaxjitter = null;

        String content = UseFileHelper.readStringFromFile(selectedFile, 400);

        buildEntryList(content);
        ConfSecHeader header = findConfHeader(GENERAL);
        if (header != null)
            driverConf = buildIaxgeneralModelElement(header.val);

        List list = getWorkingIaxjitterEntryList();
        if (list != null) {
            iaxjitter = buildIaxjitterModelElement(list);
            if (driverConf != null)
                driverConf.setIaxjitter(iaxjitter);
        }

        list = getWorkingIaxpeerEntryList();
        for (int i = 0; i < list.size(); i++) {
            ConfSecHeader csh = (ConfSecHeader) list.get(i);
            peer = buildIaxpeerModelElement(csh.val);
            peer.setIaxpeername(csh.content);
            if (driverConf != null)
                driverConf.addIaxpeer(peer);
        }// end of for i to list

        list = getWorkingIaxregisterEntryList();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                Iaxregister reg = createregister((Confvalue) list.get(i));
                if (driverConf != null)
                    driverConf.addIaxregister(reg);
            }
        }

        if (driverConf == null) {
            if (iaxjitter != null)
                return iaxjitter;
            if (peer != null)
                return peer;
        }
        return driverConf;

    }

    private Iaxregister createregister(Confvalue confvalue) {
        IaxregisterImpl impl = new IaxregisterImpl();
        String str = confvalue.value;
        if(str==null)
            str = confvalue.key;
        int npos = str.indexOf(">") + 1;
        str = str.substring(npos);

        int nposU = str.indexOf("[");
        int nposAU = str.indexOf("]");
        int nposSec = str.indexOf(":");

        int nposHost = str.indexOf("@");
        int nposport = str.indexOf(":", nposHost);
        int nposext = str.indexOf("\\", nposHost);
        int last = str.length();
        if (nposext != -1) {
            impl.setExtension(str.substring(nposext + 1).trim());
            last = nposext;
        }
        if (nposport != -1) {
            impl.setPort(new Integer(str.substring(nposport + 1, last)));
            last = nposport;
        }
        if (nposHost != -1) {
            impl.setHost(str.substring(nposHost + 1, last));
            last = nposHost;
        }
        if (nposSec != -1) {
            impl.setSecret(str.substring(nposSec + 1, last));
            last = nposSec;
        }
        if (nposAU != -1) {
            impl.setAuthuser(str.substring(nposAU, last));
            last = nposAU;
        }
        if (last != -1) {
            impl.setUser(str.substring(0, last));
        }

        // if(nposU==-1)
        // impl.setAuthuser(null);
        // else{
        // String u = str.substring(0,npos).trim();
        // impl.setUser(u);
        // }
        return impl;
    }

    @Override
    protected List getWorkingIaxgeneralEntryList() {
        ConfSecHeader sec = findConfHeader(GENERAL);
        if (sec == null)
            return null;
        return sec.val;
    }

    @Override
    protected List getWorkingIaxpeerEntryList() {
        ArrayList list = new ArrayList();
        for (Iterator iter = headerList.iterator(); iter.hasNext();) {
            ConfSecHeader h = (ConfSecHeader) iter.next();
            if (!h.content.equals(GENERAL) && !h.content.equals(REGISTER)
                    && !h.content.equals(IAXJITTER))
                list.add(h);
        }

        return list;
    }

    @Override
    protected List getWorkingIaxregisterEntryList() {
        ConfSecHeader sec = findConfHeader(REGISTER);
        if (sec == null)
            return null;
        return sec.val;
    }

    @Override
    protected List getWorkingIaxjitterEntryList() {
        ConfSecHeader sec = findConfHeader(IAXJITTER);
        if (sec == null)
            return null;
        return sec.val;
        // return findConfHeader().val;
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildIaxpeerModelVaues(List entryList, Iaxpeer impl) {
        String val = null;
        val = findConfValue("iaxpeername", entryList);
        if (val != null)
            impl.setIaxpeername(val);

        val = findConfValue("type", entryList);
        if (val != null)
            impl.setPeertype(new PeerType(val));

        val = findConfValue("callerid", entryList);
        if (val != null)
            impl.setCallerid(val);

        val = findConfValue("auth", entryList);
        if (val != null)
            impl.setAuth(val);

        val = findConfValue("secret", entryList);
        if (val != null)
            impl.setSecret(val);

        val = findConfValue("inkeys", entryList);
        if (val != null)
            impl.setInkeys(val);

        val = findConfValue("host", entryList);
        if (val != null)
            impl.setHost(val);

        val = findConfValue("defaultip", entryList);
        if (val != null)
            impl.setDefaultip(val);

        val = findConfValue("context", entryList);
        if (val != null)
            impl.setContext(new PbxContext(val));

        val = findConfValue("dbsecret", entryList);
        if (val != null)
            impl.setDbsecret(val);

        val = findConfValue("setvar", entryList);
        if (val != null)
            impl.setSetvar(val);

        val = findConfValue("peercontext", entryList);
        if (val != null)
            impl.setPeercontext(new PbxContext(val));

        val = findConfValue("qualify", entryList);
        if (val != null)
            impl.setQualify(new Integer(val));

        val = findConfValue("trunk", entryList);
        if (val != null)
            impl.setTrunk(new Boolean(val));

        val = findConfValue("timezone", entryList);
        if (val != null)
            impl.setTimezone(val);

        val = findConfValue("regexten", entryList);
        if (val != null)
            impl.setRegexten(val);

        val = findConfValue("disallow", entryList);
        if (val != null)
            impl.setDisallow(new CodecsSet(val));

        val = findConfValue("allow", entryList);
        if (val != null)
            impl.setAllow(new CodecsSet(val));

        val = findConfValue("mailbox", entryList);
        if (val != null)
            impl.setMailbox(val);

        val = findConfValue("accountcode", entryList);
        if (val != null)
            impl.setAccountcode(val);

        val = findConfValue("outkey", entryList);
        if (val != null)
            impl.setOutkey(val);

        val = findConfValue("notransfer", entryList);
        if (val != null)
            impl.setNotransfer(new Boolean(val));

        val = findConfValue("qualifysmoothing", entryList);
        if (val != null)
            impl.setQualifysmoothing(new Boolean(val));

        val = findConfValue("qualifyfreqok", entryList);
        if (val != null)
            impl.setQualifyfreqok(new Integer(val));

        val = findConfValue("qualifyfreqnotok", entryList);
        if (val != null)
            impl.setQualifyfreqnotok(new Integer(val));

    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildIaxpeerModelAgg(List entryList, Iaxpeer impl) {
        String val = null;
        // aggregate schreiben
        // maps schreiben
        // IaxdenyMap
        val = findConfValue("deny", entryList);
        if (val != null) {
            String[] values = val.split(",");
            for (int i = 0; i < values.length; i++) {
                String value = values[i].trim();
                if (!value.equals("")) {
                    Iaxdeny aIaxdenyM = new IaxdenyImpl(value);
                    impl.addIaxdeny(aIaxdenyM);
                }
            }
        }
        val = findConfValue("permit", entryList);
        if (val != null) {
            String[] values = val.split(",");
            for (int i = 0; i < values.length; i++) {
                String value = values[i].trim();
                if (!value.equals("")) {
                    Iaxpermit aIaxpermitM = new IaxpermitImpl(value);
                    impl.addIaxpermit(aIaxpermitM);
                }
            }
        }
        // for (Iterator iter = impl.getIaxdenyMap().iterator();
        // iter.hasNext();) {
        // Iaxdeny aIaxdenyM = buildIaxdenyModelElement(entryList);
        // impl.addIaxdeny(aIaxdenyM);
        // // Iaxdeny mobj = (Iaxdeny) iter.next();
        // // writeIaxdeny(strB,mobj);
        // }
        // // IaxpermitMap
        // for (Iterator iter = impl.getIaxpermitMap().iterator();
        // iter.hasNext();) {
        // Iaxpermit aIaxpermitM = buildIaxpermitModelElement(entryList);
        // impl.addIaxpermit(aIaxpermitM);
        // // Iaxpermit mobj = (Iaxpermit) iter.next();
        // // writeIaxpermit(strB,mobj);
        // }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildIaxregisterModelVaues(List entryList, Iaxregister impl) {

        String val = null;
        val = findConfValue("user", entryList);
        if (val != null)
            impl.setUser(val);

        val = findConfValue("authuser", entryList);
        if (val != null)
            impl.setAuthuser(val);

        val = findConfValue("secret", entryList);
        if (val != null)
            impl.setSecret(val);

        val = findConfValue("host", entryList);
        if (val != null)
            impl.setHost(val);

        val = findConfValue("port", entryList);
        if (val != null)
            impl.setPort(new Integer(val));

        val = findConfValue("extension", entryList);
        if (val != null)
            impl.setExtension(val);

    }

}
