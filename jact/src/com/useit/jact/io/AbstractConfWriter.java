/*
 * (c) urs zeidler
 */
package com.useit.jact.io;

import java.util.Iterator;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.app.framework.model.types.AbstractSimpleEnum;
import com.useit.app.framework.model.types.AbstractSimpleEnumSet;

public abstract class AbstractConfWriter extends BasicReadWriteConf {
    // protected String commend=";";
    protected String eol = "\n";

    // protected String headerStart="[";
    // protected String headerStop="]";
    public AbstractConfWriter() {
        super();
    }

    /**
     * @param strB
     * @param impl
     */
    protected void writeComment(StringBuffer strB, AbstractSimpleDataClass impl) {
        if (impl.getElement_description() == null)
            return;

        strB.append(COMMENTTOK);
        strB.append(impl.getElement_description());
        strB.append(eol);
    }

    protected void writeEmtypLine(StringBuffer strB) {
        strB.append(eol);

    }

    protected void writeSecHeader(StringBuffer strB, String headername) {
        strB.append(SECHEADERTOK);
        strB.append(headername);
        strB.append(SECHEADEADERSTOP);
        strB.append(eol);

    }

    protected void writeEnumSet(String startTok, String stopTok,
            AbstractSimpleEnumSet eset, StringBuffer strB) {
        for (Iterator<AbstractSimpleEnum> iter = eset.iterator(); iter
                .hasNext();) {
            AbstractSimpleEnum en = iter.next();
            strB.append(startTok).append(en.toString());
            if (iter.hasNext())
                strB.append(stopTok);
        }
    }

    protected void writeBooleanValue(StringBuffer strB, String startTok,
            String stopTok, Boolean bool) {
        if (bool.booleanValue())
            strB.append(startTok).append("yes").append(startTok);
        else
            strB.append(startTok).append("no").append(startTok);

    }
}
