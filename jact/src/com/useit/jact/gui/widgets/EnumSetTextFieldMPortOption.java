/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.AbstractEnumSetTextField;
import com.useit.app.framework.model.types.AbstractSimpleEnumSet;
import com.useit.jact.model.types.MPortOptionSet;

/**
 * <p>
 * EnumSetTextFieldMPortOption
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: EnumSetTextFieldMPortOption.java,v 1.4
 *          2005/12/25 18:09:57 urs Exp $
 */
public class EnumSetTextFieldMPortOption extends AbstractEnumSetTextField {

    /**
     * 
     */
    public EnumSetTextFieldMPortOption() {
        super();
    }

    // public void setValue(MPortOption data){
    // senum = data;
    // if(senum==null) senum = new MPortOption("");
    // setSelectedIndex(senum.getEnumInt());
    // }
    public MPortOptionSet getValue() {
        if (aEnumSet == null)
            return null;
        // senum.setEnumint(getSelectedIndex());
        // if(senum.getEnumInt()==-1)return null;

        return (MPortOptionSet) aEnumSet;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.widgets.AbstractEnumSetTextField#createEnum()
     */
    protected AbstractSimpleEnumSet createEnum() {
        return new MPortOptionSet();
    }

}
