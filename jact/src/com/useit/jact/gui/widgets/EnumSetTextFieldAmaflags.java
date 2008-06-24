/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.AbstractEnumSetTextField;
import com.useit.app.framework.model.types.AbstractSimpleEnumSet;
import com.useit.jact.model.types.AmaflagsSet;

/**
 * <p>
 * EnumSetTextFieldAmaflags
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: EnumSetTextFieldAmaflags.java,v 1.2
 *          2005/12/25 18:09:57 urs Exp $
 */
public class EnumSetTextFieldAmaflags extends AbstractEnumSetTextField {

    /**
     * 
     */
    public EnumSetTextFieldAmaflags() {
        super();
    }

    // public void setValue(Amaflags data){
    // senum = data;
    // if(senum==null) senum = new Amaflags("");
    // setSelectedIndex(senum.getEnumInt());
    // }
    public AmaflagsSet getValue() {
        if (aEnumSet == null)
            return null;
        // senum.setEnumint(getSelectedIndex());
        // if(senum.getEnumInt()==-1)return null;

        return (AmaflagsSet) aEnumSet;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.widgets.AbstractEnumSetTextField#createEnum()
     */
    protected AbstractSimpleEnumSet createEnum() {
        return new AmaflagsSet();
    }

}
