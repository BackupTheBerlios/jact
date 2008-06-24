/*
 * (c) urs zeidler
 */
package com.useit.jact.io.musiconholdconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.model.musiconholdconf.MohClassesImpl;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;

/**
 * <p>
 * ConfReaderImpl
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.3 2006/01/09 10:17:42
 *          urs Exp $
 */
public class ConfReaderImpl extends ConfReader {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfReaderImpl.class);

    public static final Pattern classPattern = Pattern
            .compile("[ ]*(.+)[ ]*=>[ ]*(.[^;]+)[ ]*");

    public static final Pattern defPattern = Pattern
            .compile("[ ]*(.+)[ ]*:[ ]*(.[^,]*)[,]*(.*)");

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
        driverConf = buildMusic_on_HoldConfModelElement(entrylist);

        return driverConf;
    }

    @Override
    protected void buildMusic_on_HoldConfModelAgg(List entryList,
            Music_on_HoldConf impl) {

        for (int i = 0; i < entryList.size(); i++) {
            Confentry ce = (Confentry) entryList.get(i);
            if (ce instanceof Confvalue) {
                Confvalue cv = (Confvalue) ce;
                Matcher matcher = classPattern.matcher(cv.content);
                if (matcher.find()) {
                    MohClassesImpl mohClassesImpl = new MohClassesImpl();
                    mohClassesImpl.setName(matcher.group(i));
                    Matcher matcher2 = defPattern.matcher(matcher.group(2));
                    if (matcher2.find()) {
                        mohClassesImpl.setPlayer(matcher2.group(1));
                        mohClassesImpl.setMohdir(matcher2.group(2));
                        if (!matcher2.group(3).equals(""))
                            mohClassesImpl.setMohpara(matcher2.group(3));

                        impl.addMohClasses(mohClassesImpl);

                    } else if (LOGGER
                            .isEnabledFor(org.apache.log4j.Priority.WARN)) {
                        LOGGER
                                .warn(
                                        "buildMusic_on_HoldConfModelAgg(List, Music_on_HoldConf) - no match in class def",
                                        null);
                    }
                }

            }// end of if (ce instanceof Confvalue)
        }// end of for i to entryList
        // TODO Automatisch erstellter Methoden-Stub
        // super.buildMusic_on_HoldConfModelAgg(entryList, impl);
    }
}
