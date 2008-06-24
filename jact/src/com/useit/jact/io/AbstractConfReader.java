/*
 * (c) urs zeidler
 */
package com.useit.jact.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;

/**
 * <p>
 * AbstractConfReader
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AbstractConfReader.java,v 1.8 2006/01/14
 *          15:00:13 urs Exp $
 */
public abstract class AbstractConfReader extends BasicReadWriteConf {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(AbstractConfReader.class);

    /**
     * 
     */
    public AbstractConfReader() {
        super();
    }

    /**
     * lieﬂt einen File in einen String
     * 
     * @param file
     * @param bufsize
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String readStringFromFile(File file, int bufsize)
            throws FileNotFoundException, IOException {
        StringBuffer strb = new StringBuffer();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        char[] cb = new char[bufsize];
        int len = 0;
        try {
            while ((len = reader.read(cb)) == cb.length) {
                strb.append(cb, 0, cb.length);
            }
            strb.append(cb, 0, len);
        } finally {
            reader.close();
        }// end of try catch

        return strb.toString();
    }

    protected String[] entryStops = { "\n", "\r" };

    protected List entrylist = new ArrayList();

    protected ArrayList headerList = new ArrayList();

    public List getEntrylist() {
        return entrylist;
    }

    /**
     * erstellt die entrylist mit hile eines Tokenisers.
     * 
     * @param content
     */
    protected void buildEntryList(String content) {
        // StringBuffer actualComment = null;
        // StringBuffer actualLine = null;
        Confentry entry = null;
        String lastTok;
        StringTokenizer tokenizer = new StringTokenizer(content, "\n\r\t= ",
                true);

        while (tokenizer.hasMoreTokens()) {
            String tok = tokenizer.nextToken();

            // if (LOGGER.isDebugEnabled()) {
            // LOGGER.debug("buildEntryList() - tok :" + tok);
            // }

            if (entry == null) {
                if (tok.startsWith(COMMENTTOK)) {
                    entry = new Confcomment();
                    // actualComment = entry.getBuffer();
                    entry.getBuffer().append(tok.substring(1));
                    continue;
                    // actualComment.append(tok);

                }
                if (tok.startsWith(SECHEADERTOK)) {
                    entry = new ConfSecHeader();
                    entry.getBuffer().append(tok.substring(1));
                    continue;
                }

                entry = new Confvalue();

            }

            if (isStop(tok)) {
                if (entry == null) {
                    entrylist.add(new ConfsecSplitter(""));
                }

                if (entry instanceof Confcomment) {
                    if (!isEmpty(entry.getBuffer())) {
                        entry.readyEntry();
                        entrylist.add(entry);

                    }
                    entry = null;
                    continue;
                }

                if (entry instanceof ConfSecHeader) {
                    if (!isEmpty(entry.getBuffer())) {
                        entry.readyEntry();
                        entrylist.add(entry);
                    }
                    entry = null;

                    continue;
                }

                if (entry instanceof Confvalue) {
                    if (!isEmpty(entry.getBuffer())) {
                        entry.readyEntry();
                        entrylist.add(entry);
                    }
                    entry = null;
                    continue;

                }
            }
            if (entry != null)
                entry.getBuffer().append(tok);

            lastTok = tok;

        }// end of while
        // perhapse there is an entry
        if (entry != null)
            if (entry instanceof Confvalue) {
                if (!entry.isReady())
                    if (!isEmpty(entry.getBuffer())) {
                        entry.readyEntry();
                        entrylist.add(entry);
                    }
                entry = null;

            }

        buildSections();
    }

    /**
     * 
     */
    private void buildSections() {
        ConfSecHeader header = null;
        for (int i = 0; i < entrylist.size(); i++) {
            Confentry e = (Confentry) entrylist.get(i);
            if (e instanceof ConfSecHeader) {
                header = (ConfSecHeader) e;
                headerList.add(e);

            }
            if (e instanceof Confvalue)
                if (header != null)
                    header.add(e);

        }// end of for i to entrylist

    }

    /**
     * @param tok
     * @return
     */
    protected boolean isStop(String tok) {
        for (int i = 0; i < entryStops.length; i++) {
            String c = entryStops[i];
            if (tok.startsWith(c))
                return true;
        }
        return false;
    }

    /**
     * schaut ob eine line nur aus whitspaces besteht
     * 
     * @param actualLine2
     * @return
     */
    protected boolean isEmpty(StringBuffer line) {
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t')
                return false;

        }// end of for i to line
        return true;
    }

    /**
     * findet ein Confvalue by keyname
     * 
     * @param string
     * @param entryList
     * @return das value
     */
    protected String findConfValue(String key, List entryList) {
        for (int i = 0; i < entryList.size(); i++) {
            Confentry entry = (Confentry) entryList.get(i);
            if (entry instanceof Confvalue) {
                Confvalue val = (Confvalue) entry;
                if (val == null)
                    continue;//return null;
                if (val.key == null)
                    continue;//return null;

                if (val.key.toLowerCase().equals(key.toLowerCase()))
                    return val.value;
            }
        }// end of for i to entryList
        return null;
    }

    /**
     * findet ein Confvalue by keyname
     * 
     * @param string
     * @param entryList
     * @return das value
     */
    protected Confvalue findConfEntry(String key, List entryList) {
        for (int i = 0; i < entryList.size(); i++) {
            Confentry entry = (Confentry) entryList.get(i);
            if (entry instanceof Confvalue) {
                Confvalue val = (Confvalue) entry;
                if (val == null)
                    return null;
                if (val.key == null)
                    return null;

                if (val.key.toLowerCase().equals(key.toLowerCase()))
                    return val;
            }
        }// end of for i to entryList
        return null;
    }

    /**
     * findet eine section und gibt sie zur¸ck
     * 
     * @param hname
     * @return
     */
    protected ConfSecHeader findConfHeader(String hname) {
        for (int i = 0; i < headerList.size(); i++) {
            ConfSecHeader sh = (ConfSecHeader) headerList.get(i);
            if (sh.content.toLowerCase().equals(hname.toLowerCase())) {
                return sh;
            }
        }// end of for i to headerList
        return null;
    }

    /**
     * gibt eine liste zu¸r¸ck aller Header die nicht in Headernames sind
     * 
     * @param headernames
     * @return
     */
    protected List<ConfSecHeader> excludeHeader(String[] headernames) {
        ArrayList<ConfSecHeader> l = new ArrayList<ConfSecHeader>();
        for (int i = 0; i < headerList.size(); i++) {
            ConfSecHeader csv = (ConfSecHeader) headerList.get(i);
            boolean test = false;
            for (int j = 0; j < headernames.length; j++) {
                test = test | csv.content.equalsIgnoreCase(headernames[j]);

            }
            if (!test)
                l.add(csv);
        }// end of for i to headerList

        return l;
    }
}
