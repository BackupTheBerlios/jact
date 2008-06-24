/*
 * (c) urs zeidler
 */
package com.useit.jact.io.agentconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.agentconf.Agents;
import com.useit.jact.model.agentconf.AgentsImpl;
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.AgentsconfImpl;
import com.useit.jact.model.agentconf.Agentsrecording;
import com.useit.jact.model.agentconf.AgentsrecordingImpl;

/**
 * <p>
 * ConfReader , die Abstract Confreader klasse, zerlegt per tokenieser den
 * Stringstream in entrys
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReader.java,v 1.7 2006/03/17 10:42:52 urs
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
    protected List getWorkingAgentsconfEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Agentsconf objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Agentsconf buildAgentsconfModelElement(List aEntryList) {
        Agentsconf impl = new AgentsconfImpl();
        buildAgentsconfModelVaues(aEntryList, impl);
        buildAgentsconfModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildAgentsconfModelAgg(List entryList, Agentsconf impl) {

        // aggregate schreiben
        // Agentsrecording
        Agentsrecording aAgentsrecording = buildAgentsrecordingModelElement(entryList);
        impl.setAgentsrecording(aAgentsrecording);
        // writeAgentsrecording(strB, impl.getAgentsrecording());
        // maps schreiben
        // AgentsMap
        for (Iterator iter = impl.getAgentsMap().iterator(); iter.hasNext();) {
            Agents aAgentsM = buildAgentsModelElement(entryList);
            impl.addAgents(aAgentsM);
            // Agents mobj = (Agents) iter.next();
            // writeAgents(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildAgentsconfModelVaues(List entryList, Agentsconf impl) {
        String val = null;
        val = findConfValue("autologoff", entryList);
        if (val != null)
            impl.setAutologoff(val);

        val = findConfValue("ackcall", entryList);
        if (val != null)
            impl.setAckcall(val);

        val = findConfValue("wrapuptime", entryList);
        if (val != null)
            impl.setWrapuptime(val);

        val = findConfValue("music_class", entryList);
        if (val != null)
            impl.setMusic_class(val);

        val = findConfValue("custom_beep", entryList);
        if (val != null)
            impl.setCustom_beep(val);

        val = findConfValue("group", entryList);
        if (val != null)
            impl.setGroup(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingAgentsEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Agents objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Agents buildAgentsModelElement(List aEntryList) {
        Agents impl = new AgentsImpl();
        buildAgentsModelVaues(aEntryList, impl);
        buildAgentsModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildAgentsModelAgg(List entryList, Agents impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildAgentsModelVaues(List entryList, Agents impl) {
        String val = null;
        val = findConfValue("agentid", entryList);
        if (val != null)
            impl.setAgentid(val);

        val = findConfValue("agentpassword", entryList);
        if (val != null)
            impl.setAgentpassword(val);

        val = findConfValue("name", entryList);
        if (val != null)
            impl.setName(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingAgentsrecordingEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Agentsrecording objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Agentsrecording buildAgentsrecordingModelElement(List aEntryList) {
        Agentsrecording impl = new AgentsrecordingImpl();
        buildAgentsrecordingModelVaues(aEntryList, impl);
        buildAgentsrecordingModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildAgentsrecordingModelAgg(List entryList,
            Agentsrecording impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildAgentsrecordingModelVaues(List entryList,
            Agentsrecording impl) {
        String val = null;
        val = findConfValue("recordagentcalls", entryList);
        if (val != null)
            impl
                    .setRecordagentcalls(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("recordformat", entryList);
        if (val != null)
            impl.setRecordformat(val);

        val = findConfValue("createlink", entryList);
        if (val != null)
            impl.setCreatelink(val);

        val = findConfValue("urlprefix", entryList);
        if (val != null)
            impl.setUrlprefix(val);

        val = findConfValue("savecallsin", entryList);
        if (val != null)
            impl.setSavecallsin(val);

    }

}
