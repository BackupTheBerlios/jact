/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.SimpleEnumCombobox;
import com.useit.jact.model.types.MisdnCardTypes;

/**
 * <p>
 * JEnumComboboxMisdnCardTypes
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: JEnumComboboxMisdnCardTypes.java,v 1.7
 *          2005/12/19 13:02:39 urs Exp $
 */
public class JEnumComboboxMisdnCardTypes extends SimpleEnumCombobox {

    /**
     * 
     */
    public JEnumComboboxMisdnCardTypes() {
        super(MisdnCardTypes.ENAMES);
    }

    public void setValue(MisdnCardTypes data) {
        senum = data;
        if (senum == null)
            senum = new MisdnCardTypes("");
        setSelectedIndex(senum.getEnumInt());
    }

    public MisdnCardTypes getValue() {
        if (senum == null)
            return null;
        senum.setEnumint(getSelectedIndex());
        if (senum.getEnumInt() == -1)
            return null;

        return (MisdnCardTypes) senum;
    }

}
