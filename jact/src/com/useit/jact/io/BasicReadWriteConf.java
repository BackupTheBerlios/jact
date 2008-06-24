/*
 * (c) urs zeidler
 */
package com.useit.jact.io;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

public abstract class BasicReadWriteConf {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(BasicReadWriteConf.class);

    public String COMMENTTOK = "#";

    public String SECHEADERTOK = "[";

    public String SECHEADEADERSTOP = "]";

    public char keyValueDelmiter = '=';

    public char inlinecomment = ';';

    protected class ConfSecHeader extends Confentry {
        /** die liste der entrys */
        public List val = new ArrayList();

        /**
         * ist der section header
         * 
         * @param content
         */
        public ConfSecHeader(String content) {
            super(content);
        }

        /**
         * 
         */
        public ConfSecHeader() {
            super();
        }

        public void readyEntry() {
            int i = buffer.indexOf(SECHEADEADERSTOP);
            if (i != -1)
                buffer.deleteCharAt(i);

            content = buffer.toString().trim();
            buffer = null;
        }

        public boolean add(Confentry obj) {
            return val.add(obj);
        }

        public void clear() {
            val.clear();
        }

        public Confentry get(int index) {
            return (Confentry) val.get(index);
        }

        public Iterator iterator() {
            return val.iterator();
        }

        public int size() {
            return val.size();
        }

        public String toString() {
            return getClass() + " : " + content + "  " + val.toString();
        }

    }

    protected class ConfsecSplitter extends Confentry {

        /**
         * 
         */
        public ConfsecSplitter() {
            super();
        }

        /**
         * @param content
         */
        public ConfsecSplitter(String content) {
            super(content);
        }

    }

    protected class Confvalue extends Confentry {
        /**
         * Logger for this class
         */
        private final Logger LOGGER = Logger.getLogger(Confvalue.class);

        /** der Schlüssel */
        public String key;

        /** das zugehörige value */
        public String value;

        /**
         * 
         */
        public Confvalue() {
            super();
        }

        /**
         * @param content
         */
        public Confvalue(String content) {
            super(content);
            parseContent(content);
        }

        /**
         * @param content
         */
        private void parseContent(String content) {
            int indexOfKeySplitter = content.indexOf(keyValueDelmiter, 0);
            if (indexOfKeySplitter == -1)
                return;

            int end = content.indexOf(inlinecomment, indexOfKeySplitter);
            if (end == -1)
                end = content.length() ;

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("parseContent(String) -  : content=" + content
                        + ", indexOfKeySplitter=" + indexOfKeySplitter
                        + ", end=" + end);
            }
            if (end < 0  ){
                LOGGER.debug("stop reading");
                return;
            }
            // only then we have a value
            if( end-indexOfKeySplitter>0){
                value = content.substring(indexOfKeySplitter +1, end).trim();
            }else
                LOGGER.debug("noval");
            
            
            key = content.substring(0, indexOfKeySplitter).trim();
        }

        public void readyEntry() {
            content = buffer.toString().trim();
            parseContent(content);
            buffer = null;
        }

    }

    protected class Confcomment extends Confentry {

        /**
         * @param content
         */
        public Confcomment(String content) {
            super(content);
        }

        /**
         * 
         */
        public Confcomment() {
        }

    }

    protected class Confentry {
        /** im schnitt der gesamt inhalt, bei Sec header der SectioHeader */
        public String content;

        protected StringBuffer buffer = null;

        /**
         * 
         */
        public Confentry() {
            super();
            buffer = new StringBuffer();
        }

        /**
         * 
         */
        public Confentry(String content) {
            super();
            this.content = content.trim();
        }

        public String toString() {
            return getClass() + " : " + content;
        }

        public StringBuffer getBuffer() {
            return buffer;
        }

        public void readyEntry() {
            content = buffer.toString().trim();
            buffer = null;
        }

        public boolean isReady() {
            return (buffer == null);
        }
    }

    public BasicReadWriteConf() {
        super();
    }

}
