/*
 * (c) urs zeidler
 */
package com.useit.jact.io.iaxconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.iaxconf.Iaxdeny;
import com.useit.jact.model.iaxconf.IaxdenyImpl;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.IaxgeneralImpl;
import com.useit.jact.model.iaxconf.Iaxjitter;
import com.useit.jact.model.iaxconf.IaxjitterImpl;
import com.useit.jact.model.iaxconf.Iaxpeer;
import com.useit.jact.model.iaxconf.IaxpeerImpl;
import com.useit.jact.model.iaxconf.Iaxpermit;
import com.useit.jact.model.iaxconf.IaxpermitImpl;
import com.useit.jact.model.iaxconf.Iaxregister;
import com.useit.jact.model.iaxconf.IaxregisterImpl;
import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;

/**
 * <p>
 * ConfReader , die Abstract Confreader klasse, zerlegt per tokenieser den
 * Stringstream in entrys
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReader.java,v 1.9 2006/03/17 10:42:51 urs
 *          Exp $
 */
public class ConfReader extends AbstractConfReader {

    /**
     * 
     */
    public ConfReader() {
        super();
    }

    /**
     * ließt den file und bildet die Entrylist
     * 
     * @param file
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void readConfFile(String file) throws FileNotFoundException,
            IOException {
        String content = readStringFromFile(new File(file), 500);
        buildEntryList(content);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingIaxregisterEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Iaxregister objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Iaxregister buildIaxregisterModelElement(List aEntryList) {
        Iaxregister impl = new IaxregisterImpl();
        buildIaxregisterModelVaues(aEntryList, impl);
        buildIaxregisterModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildIaxregisterModelAgg(List entryList, Iaxregister impl) {

        // aggregate schreiben
        // maps schreiben
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

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingIaxdenyEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Iaxdeny objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Iaxdeny buildIaxdenyModelElement(List aEntryList) {
        Iaxdeny impl = new IaxdenyImpl();
        buildIaxdenyModelVaues(aEntryList, impl);
        buildIaxdenyModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildIaxdenyModelAgg(List entryList, Iaxdeny impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildIaxdenyModelVaues(List entryList, Iaxdeny impl) {
        String val = null;
        val = findConfValue("value", entryList);
        if (val != null)
            impl.setValue(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingIaxpermitEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Iaxpermit objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Iaxpermit buildIaxpermitModelElement(List aEntryList) {
        Iaxpermit impl = new IaxpermitImpl();
        buildIaxpermitModelVaues(aEntryList, impl);
        buildIaxpermitModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildIaxpermitModelAgg(List entryList, Iaxpermit impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildIaxpermitModelVaues(List entryList, Iaxpermit impl) {
        String val = null;
        val = findConfValue("value", entryList);
        if (val != null)
            impl.setValue(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingIaxgeneralEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Iaxgeneral objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Iaxgeneral buildIaxgeneralModelElement(List aEntryList) {
        Iaxgeneral impl = new IaxgeneralImpl();
        buildIaxgeneralModelVaues(aEntryList, impl);
        buildIaxgeneralModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildIaxgeneralModelAgg(List entryList, Iaxgeneral impl) {

        // aggregate schreiben
        // Iaxjitter
        Iaxjitter aIaxjitter = buildIaxjitterModelElement(entryList);
        impl.setIaxjitter(aIaxjitter);
        // writeIaxjitter(strB, impl.getIaxjitter());
        // maps schreiben
        // IaxpeerMap
        for (Iterator iter = impl.getIaxpeerMap().iterator(); iter.hasNext();) {
            Iaxpeer aIaxpeerM = buildIaxpeerModelElement(entryList);
            impl.addIaxpeer(aIaxpeerM);
            // Iaxpeer mobj = (Iaxpeer) iter.next();
            // writeIaxpeer(strB,mobj);
        }
        // IaxregisterMap
        for (Iterator iter = impl.getIaxregisterMap().iterator(); iter
                .hasNext();) {
            Iaxregister aIaxregisterM = buildIaxregisterModelElement(entryList);
            impl.addIaxregister(aIaxregisterM);
            // Iaxregister mobj = (Iaxregister) iter.next();
            // writeIaxregister(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildIaxgeneralModelVaues(List entryList, Iaxgeneral impl) {
        String val = null;
        val = findConfValue("bindport", entryList);
        if (val != null)
            impl.setBindport(new Integer(val));

        val = findConfValue("bindaddr", entryList);
        if (val != null)
            impl.setBindaddr(val);

        val = findConfValue("iaxcompat", entryList);
        if (val != null)
            impl.setIaxcompat(val);

        val = findConfValue("nochecksums", entryList);
        if (val != null)
            impl.setNochecksums(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("delayreject", entryList);
        if (val != null)
            impl.setDelayreject(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("amaflags", entryList);
        if (val != null)
            impl.setAmaflags(new Amaflags(val));

        val = findConfValue("accountcode", entryList);
        if (val != null)
            impl.setAccountcode(val);

        val = findConfValue("language", entryList);
        if (val != null)
            impl.setLanguage(val);

        val = findConfValue("bandwidth", entryList);
        if (val != null)
            impl.setBandwidth(val);

        val = findConfValue("trunktimestamps", entryList);
        if (val != null)
            impl.setTrunktimestamps(new Integer(val));

        val = findConfValue("authdebug", entryList);
        if (val != null)
            impl.setAuthdebug(val);

        val = findConfValue("tos", entryList);
        if (val != null)
            impl.setTos(val);

        val = findConfValue("mailboxdetail", entryList);
        if (val != null)
            impl
                    .setMailboxdetail(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("regcontext", entryList);
        if (val != null)
            impl.setRegcontext(val);

        val = findConfValue("autokill", entryList);
        if (val != null)
            impl.setAutokill(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("codecpriority", entryList);
        if (val != null)
            impl.setCodecpriority(val);

        val = findConfValue("rtcachefriends", entryList);
        if (val != null)
            impl.setRtcachefriends(new Integer(val));

        val = findConfValue("rtupdate", entryList);
        if (val != null)
            impl.setRtupdate(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("rtautoclear", entryList);
        if (val != null)
            impl.setRtautoclear(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("rtignoreexpire", entryList);
        if (val != null)
            impl
                    .setRtignoreexpire(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("trunkfreq", entryList);
        if (val != null)
            impl.setTrunkfreq(new Integer(val));

        val = findConfValue("disallow", entryList);
        if (val != null)
            impl.setDisallow(new CodecsSet(val));

        val = findConfValue("allow", entryList);
        if (val != null)
            impl.setAllow(new CodecsSet(val));

        val = findConfValue("minregexpire", entryList);
        if (val != null)
            impl.setMinregexpire(new Integer(val));

        val = findConfValue("maxregexpire", entryList);
        if (val != null)
            impl.setMaxregexpire(new Integer(val));

        val = findConfValue("notransfer", entryList);
        if (val != null)
            impl.setNotransfer(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingIaxpeerEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Iaxpeer objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Iaxpeer buildIaxpeerModelElement(List aEntryList) {
        Iaxpeer impl = new IaxpeerImpl();
        buildIaxpeerModelVaues(aEntryList, impl);
        buildIaxpeerModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildIaxpeerModelAgg(List entryList, Iaxpeer impl) {

        // aggregate schreiben
        // maps schreiben
        // IaxdenyMap
        for (Iterator iter = impl.getIaxdenyMap().iterator(); iter.hasNext();) {
            Iaxdeny aIaxdenyM = buildIaxdenyModelElement(entryList);
            impl.addIaxdeny(aIaxdenyM);
            // Iaxdeny mobj = (Iaxdeny) iter.next();
            // writeIaxdeny(strB,mobj);
        }
        // IaxpermitMap
        for (Iterator iter = impl.getIaxpermitMap().iterator(); iter.hasNext();) {
            Iaxpermit aIaxpermitM = buildIaxpermitModelElement(entryList);
            impl.addIaxpermit(aIaxpermitM);
            // Iaxpermit mobj = (Iaxpermit) iter.next();
            // writeIaxpermit(strB,mobj);
        }
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

        val = findConfValue("peertype", entryList);
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
            impl.setTrunk(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

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
            impl.setNotransfer(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("qualifysmoothing", entryList);
        if (val != null)
            impl
                    .setQualifysmoothing(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("qualifyfreqok", entryList);
        if (val != null)
            impl.setQualifyfreqok(new Integer(val));

        val = findConfValue("qualifyfreqnotok", entryList);
        if (val != null)
            impl.setQualifyfreqnotok(new Integer(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingIaxjitterEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Iaxjitter objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Iaxjitter buildIaxjitterModelElement(List aEntryList) {
        Iaxjitter impl = new IaxjitterImpl();
        buildIaxjitterModelVaues(aEntryList, impl);
        buildIaxjitterModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildIaxjitterModelAgg(List entryList, Iaxjitter impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildIaxjitterModelVaues(List entryList, Iaxjitter impl) {
        String val = null;
        val = findConfValue("jitterbuffer", entryList);
        if (val != null)
            impl.setJitterbuffer(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("forcejitterbuffer", entryList);
        if (val != null)
            impl
                    .setForcejitterbuffer(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("dropcount", entryList);
        if (val != null)
            impl.setDropcount(new Integer(val));

        val = findConfValue("maxjitterbuffer", entryList);
        if (val != null)
            impl.setMaxjitterbuffer(new Integer(val));

        val = findConfValue("resyncthreshold", entryList);
        if (val != null)
            impl.setResyncthreshold(new Integer(val));

        val = findConfValue("maxjitterinterps", entryList);
        if (val != null)
            impl.setMaxjitterinterps(new Integer(val));

        val = findConfValue("maxexcessbuffer", entryList);
        if (val != null)
            impl.setMaxexcessbuffer(new Integer(val));

        val = findConfValue("minexcessbuffer", entryList);
        if (val != null)
            impl.setMinexcessbuffer(new Integer(val));

        val = findConfValue("jittershrinkrate", entryList);
        if (val != null)
            impl.setJittershrinkrate(new Integer(val));

    }

}
