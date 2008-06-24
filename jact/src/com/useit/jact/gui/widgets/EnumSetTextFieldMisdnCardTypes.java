/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.AbstractEnumSetTextField;
import com.useit.app.framework.model.types.AbstractSimpleEnumSet;
import com.useit.jact.model.types.MisdnCardTypesSet;

/**
 * <p>
 * EnumSetTextFieldMisdnCardTypes
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: EnumSetTextFieldMisdnCardTypes.java,v 1.4
 *          2005/12/25 18:09:56 urs Exp $
 */
public class EnumSetTextFieldMisdnCardTypes extends AbstractEnumSetTextField {

    /**
     * 
     */
    public EnumSetTextFieldMisdnCardTypes() {
        super();
    }

    // public void setValue(MisdnCardTypes data){
    // senum = data;
    // if(senum==null) senum = new MisdnCardTypes("");
    // setSelectedIndex(senum.getEnumInt());
    // }
    public MisdnCardTypesSet getValue() {
        if (aEnumSet == null)
            return null;
        // senum.setEnumint(getSelectedIndex());
        // if(senum.getEnumInt()==-1)return null;

        return (MisdnCardTypesSet) aEnumSet;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.widgets.AbstractEnumSetTextField#createEnum()
     */
    protected AbstractSimpleEnumSet createEnum() {
        return new MisdnCardTypesSet();
    }

}
