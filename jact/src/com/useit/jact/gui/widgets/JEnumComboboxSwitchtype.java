/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.SimpleEnumCombobox;
import com.useit.jact.model.types.Switchtype;

/**
 * <p>
 * JEnumComboboxSwitchtype
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: JEnumComboboxSwitchtype.java,v 1.1 2005/12/19
 *          13:02:39 urs Exp $
 */
public class JEnumComboboxSwitchtype extends SimpleEnumCombobox {

    /**
     * 
     */
    public JEnumComboboxSwitchtype() {
        super(Switchtype.ENAMES);
    }

    public void setValue(Switchtype data) {
        senum = data;
        if (senum == null)
            senum = new Switchtype("");
        setSelectedIndex(senum.getEnumInt());
    }

    public Switchtype getValue() {
        if (senum == null)
            return null;
        senum.setEnumint(getSelectedIndex());
        if (senum.getEnumInt() == -1)
            return null;

        return (Switchtype) senum;
    }

}
