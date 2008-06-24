/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.SimpleEnumCombobox;
import com.useit.jact.model.types.Presentation;

/**
 * <p>
 * JEnumComboboxPresentation
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: JEnumComboboxPresentation.java,v 1.3
 *          2005/12/19 13:02:39 urs Exp $
 */
public class JEnumComboboxPresentation extends SimpleEnumCombobox {

    /**
     * 
     */
    public JEnumComboboxPresentation() {
        super(Presentation.ENAMES);
    }

    public void setValue(Presentation data) {
        senum = data;
        if (senum == null)
            senum = new Presentation("");
        setSelectedIndex(senum.getEnumInt());
    }

    public Presentation getValue() {
        if (senum == null)
            return null;
        senum.setEnumint(getSelectedIndex());
        if (senum.getEnumInt() == -1)
            return null;

        return (Presentation) senum;
    }

}
