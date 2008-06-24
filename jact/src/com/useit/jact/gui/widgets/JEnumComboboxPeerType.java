/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.SimpleEnumCombobox;
import com.useit.jact.model.types.PeerType;

/**
 * <p>
 * JEnumComboboxPeerType
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: JEnumComboboxPeerType.java,v 1.6 2005/12/19
 *          13:02:38 urs Exp $
 */
public class JEnumComboboxPeerType extends SimpleEnumCombobox {

    /**
     * 
     */
    public JEnumComboboxPeerType() {
        super(PeerType.ENAMES);
    }

    public void setValue(PeerType data) {
        senum = data;
        if (senum == null)
            senum = new PeerType("");
        setSelectedIndex(senum.getEnumInt());
    }

    public PeerType getValue() {
        if (senum == null)
            return null;
        senum.setEnumint(getSelectedIndex());
        if (senum.getEnumInt() == -1)
            return null;

        return (PeerType) senum;
    }

}
