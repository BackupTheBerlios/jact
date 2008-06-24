/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.SimpleEnumCombobox;
import com.useit.jact.model.types.Dialplan;

/**
 * <p>
 * JEnumComboboxDialplan
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: JEnumComboboxDialplan.java,v 1.3 2005/12/19
 *          13:02:39 urs Exp $
 */
public class JEnumComboboxDialplan extends SimpleEnumCombobox {

    /**
     * 
     */
    public JEnumComboboxDialplan() {
        super(Dialplan.ENAMES);
    }

    public void setValue(Dialplan data) {
        senum = data;
        if (senum == null)
            senum = new Dialplan("");
        setSelectedIndex(senum.getEnumInt());
    }

    public Dialplan getValue() {
        if (senum == null)
            return null;
        senum.setEnumint(getSelectedIndex());
        if (senum.getEnumInt() == -1)
            return null;

        return (Dialplan) senum;
    }

}
