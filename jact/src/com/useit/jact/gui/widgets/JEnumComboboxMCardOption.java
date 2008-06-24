/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.SimpleEnumCombobox;
import com.useit.jact.model.types.MCardOption;

/**
 * <p>
 * JEnumComboboxMCardOption
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: JEnumComboboxMCardOption.java,v 1.3
 *          2005/12/19 13:02:39 urs Exp $
 */
public class JEnumComboboxMCardOption extends SimpleEnumCombobox {

    /**
     * 
     */
    public JEnumComboboxMCardOption() {
        super(MCardOption.ENAMES);
    }

    public void setValue(MCardOption data) {
        senum = data;
        if (senum == null)
            senum = new MCardOption("");
        setSelectedIndex(senum.getEnumInt());
    }

    public MCardOption getValue() {
        if (senum == null)
            return null;
        senum.setEnumint(getSelectedIndex());
        if (senum.getEnumInt() == -1)
            return null;

        return (MCardOption) senum;
    }

}
