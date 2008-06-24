/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.AbstractEnumSetTextField;
import com.useit.app.framework.model.types.AbstractSimpleEnumSet;
import com.useit.jact.model.types.SignallingSet;

/**
 * <p>
 * EnumSetTextFieldSignalling
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: EnumSetTextFieldSignalling.java,v 1.2
 *          2005/12/25 18:09:56 urs Exp $
 */
public class EnumSetTextFieldSignalling extends AbstractEnumSetTextField {

    /**
     * 
     */
    public EnumSetTextFieldSignalling() {
        super();
    }

    // public void setValue(Signalling data){
    // senum = data;
    // if(senum==null) senum = new Signalling("");
    // setSelectedIndex(senum.getEnumInt());
    // }
    public SignallingSet getValue() {
        if (aEnumSet == null)
            return null;
        // senum.setEnumint(getSelectedIndex());
        // if(senum.getEnumInt()==-1)return null;

        return (SignallingSet) aEnumSet;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.widgets.AbstractEnumSetTextField#createEnum()
     */
    protected AbstractSimpleEnumSet createEnum() {
        return new SignallingSet();
    }

}
