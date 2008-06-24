/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.SimpleEnumCombobox;
import com.useit.jact.model.types.MPortOption;

/**
 * <p>
 * JEnumComboboxMPortOption
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: JEnumComboboxMPortOption.java,v 1.3
 *          2005/12/19 13:02:39 urs Exp $
 */
public class JEnumComboboxMPortOption extends SimpleEnumCombobox {

    /**
     * 
     */
    public JEnumComboboxMPortOption() {
        super(MPortOption.ENAMES);
    }

    public void setValue(MPortOption data) {
        senum = data;
        if (senum == null)
            senum = new MPortOption("");
        setSelectedIndex(senum.getEnumInt());
    }

    public MPortOption getValue() {
        if (senum == null)
            return null;
        senum.setEnumint(getSelectedIndex());
        if (senum.getEnumInt() == -1)
            return null;

        return (MPortOption) senum;
    }

}
