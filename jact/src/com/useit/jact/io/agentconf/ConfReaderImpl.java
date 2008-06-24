/*
 * (c) urs zeidler
 */
package com.useit.jact.io.agentconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.model.agentconf.AgentsImpl;
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.Agentsrecording;

/**
 * <p>
 * ConfReaderImpl
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.6 2006/01/14 15:00:12
 *          urs Exp $
 */
public class ConfReaderImpl extends ConfReader {

    public static final String GENERAL = "general";

    public static final Pattern agentsPattern = Pattern
            .compile("[ ]*agent[ ]*=>[ ]*(.+)[ ]*,[ ]*(.+)[ ]*,[ ]*(.[^;]+)[ ]*");

    /**
     * 
     */
    public ConfReaderImpl() {
        super();
        COMMENTTOK = ";";
        SECHEADERTOK = "[";
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
        driverConf = buildAgentsconfModelElement(entrylist);

        return driverConf;
    }

    @Override
    protected void buildAgentsconfModelAgg(List entryList, Agentsconf impl) {
        // aggregate schreiben
        // Agentsrecording
        Agentsrecording aAgentsrecording = buildAgentsrecordingModelElement(entryList);
        impl.setAgentsrecording(aAgentsrecording);
        // writeAgentsrecording(strB, impl.getAgentsrecording());
        // maps schreiben
        // AgentsMap
        for (Iterator iter = entryList.iterator(); iter.hasNext();) {
            Object object = iter.next();
            if (object instanceof Confvalue) {
                Confvalue cv = (Confvalue) object;
                Matcher matcher = agentsPattern.matcher(cv.content);
                if (matcher.find()) {
                    AgentsImpl agentsImpl = new AgentsImpl();
                    agentsImpl.setAgentid(matcher.group(1));
                    agentsImpl.setAgentpassword(matcher.group(2));
                    agentsImpl.setName(matcher.group(3));
                    impl.addAgents(agentsImpl);
                }
            }// end of if (object instanceof Confvalue)
        }
    }
}
