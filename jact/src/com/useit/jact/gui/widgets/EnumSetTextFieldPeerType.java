/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.AbstractEnumSetTextField;
import com.useit.app.framework.model.types.AbstractSimpleEnumSet;
import com.useit.jact.model.types.PeerTypeSet;

/**
 * <p>
 * EnumSetTextFieldPeerType
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: EnumSetTextFieldPeerType.java,v 1.4
 *          2005/12/25 18:09:56 urs Exp $
 */
public class EnumSetTextFieldPeerType extends AbstractEnumSetTextField {

    /**
     * 
     */
    public EnumSetTextFieldPeerType() {
        super();
    }

    // public void setValue(PeerType data){
    // senum = data;
    // if(senum==null) senum = new PeerType("");
    // setSelectedIndex(senum.getEnumInt());
    // }
    public PeerTypeSet getValue() {
        if (aEnumSet == null)
            return null;
        // senum.setEnumint(getSelectedIndex());
        // if(senum.getEnumInt()==-1)return null;

        return (PeerTypeSet) aEnumSet;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.widgets.AbstractEnumSetTextField#createEnum()
     */
    protected AbstractSimpleEnumSet createEnum() {
        return new PeerTypeSet();
    }

}
