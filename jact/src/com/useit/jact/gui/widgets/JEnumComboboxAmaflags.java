/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.SimpleEnumCombobox;
import com.useit.jact.model.types.Amaflags;

/**
 * <p>
 * JEnumComboboxAmaflags
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: JEnumComboboxAmaflags.java,v 1.1 2005/12/19
 *          13:02:39 urs Exp $
 */
public class JEnumComboboxAmaflags extends SimpleEnumCombobox {

    /**
     * 
     */
    public JEnumComboboxAmaflags() {
        super(Amaflags.ENAMES);
    }

    public void setValue(Amaflags data) {
        senum = data;
        if (senum == null)
            senum = new Amaflags("");
        setSelectedIndex(senum.getEnumInt());
    }

    public Amaflags getValue() {
        if (senum == null)
            return null;
        senum.setEnumint(getSelectedIndex());
        if (senum.getEnumInt() == -1)
            return null;

        return (Amaflags) senum;
    }

}
