/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.SimpleEnumCombobox;
import com.useit.jact.model.types.Dtmfmode;

/**
 * <p>
 * JEnumComboboxDtmfmode
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: JEnumComboboxDtmfmode.java,v 1.6 2005/12/19
 *          13:02:39 urs Exp $
 */
public class JEnumComboboxDtmfmode extends SimpleEnumCombobox {

    /**
     * 
     */
    public JEnumComboboxDtmfmode() {
        super(Dtmfmode.ENAMES);
    }

    public void setValue(Dtmfmode data) {
        senum = data;
        if (senum == null)
            senum = new Dtmfmode("");
        setSelectedIndex(senum.getEnumInt());
    }

    public Dtmfmode getValue() {
        if (senum == null)
            return null;
        senum.setEnumint(getSelectedIndex());
        if (senum.getEnumInt() == -1)
            return null;

        return (Dtmfmode) senum;
    }

}
