/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.SimpleEnumCombobox;
import com.useit.jact.model.types.MisdnPortOptions;

/**
 * <p>
 * JEnumComboboxMisdnPortOptions
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: JEnumComboboxMisdnPortOptions.java,v 1.7
 *          2005/12/19 13:02:38 urs Exp $
 */
public class JEnumComboboxMisdnPortOptions extends SimpleEnumCombobox {

    /**
     * 
     */
    public JEnumComboboxMisdnPortOptions() {
        super(MisdnPortOptions.ENAMES);
    }

    public void setValue(MisdnPortOptions data) {
        senum = data;
        if (senum == null)
            senum = new MisdnPortOptions("");
        setSelectedIndex(senum.getEnumInt());
    }

    public MisdnPortOptions getValue() {
        if (senum == null)
            return null;
        senum.setEnumint(getSelectedIndex());
        if (senum.getEnumInt() == -1)
            return null;

        return (MisdnPortOptions) senum;
    }

}
