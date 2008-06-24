/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.SimpleEnumCombobox;
import com.useit.jact.model.types.Codecs;

/**
 * <p>
 * JEnumComboboxCodecs
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: JEnumComboboxCodecs.java,v 1.5 2005/12/19
 *          13:02:39 urs Exp $
 */
public class JEnumComboboxCodecs extends SimpleEnumCombobox {

    /**
     * 
     */
    public JEnumComboboxCodecs() {
        super(Codecs.ENAMES);
    }

    public void setValue(Codecs data) {
        senum = data;
        if (senum == null)
            senum = new Codecs("");
        setSelectedIndex(senum.getEnumInt());
    }

    public Codecs getValue() {
        if (senum == null)
            return null;
        senum.setEnumint(getSelectedIndex());
        if (senum.getEnumInt() == -1)
            return null;

        return (Codecs) senum;
    }

}
