/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.SimpleEnumCombobox;
import com.useit.jact.model.types.Signalling;

/**
 * <p>
 * JEnumComboboxSignalling
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: JEnumComboboxSignalling.java,v 1.1 2005/12/19
 *          13:02:38 urs Exp $
 */
public class JEnumComboboxSignalling extends SimpleEnumCombobox {

    /**
     * 
     */
    public JEnumComboboxSignalling() {
        super(Signalling.ENAMES);
    }

    public void setValue(Signalling data) {
        senum = data;
        if (senum == null)
            senum = new Signalling("");
        setSelectedIndex(senum.getEnumInt());
    }

    public Signalling getValue() {
        if (senum == null)
            return null;
        senum.setEnumint(getSelectedIndex());
        if (senum.getEnumInt() == -1)
            return null;

        return (Signalling) senum;
    }

}
