/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.AbstractEnumSetTextField;
import com.useit.app.framework.model.types.AbstractSimpleEnumSet;
import com.useit.jact.model.types.DialplanSet;

/**
 * <p>
 * EnumSetTextFieldDialplan
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: EnumSetTextFieldDialplan.java,v 1.4
 *          2005/12/25 18:09:56 urs Exp $
 */
public class EnumSetTextFieldDialplan extends AbstractEnumSetTextField {

    /**
     * 
     */
    public EnumSetTextFieldDialplan() {
        super();
    }

    // public void setValue(Dialplan data){
    // senum = data;
    // if(senum==null) senum = new Dialplan("");
    // setSelectedIndex(senum.getEnumInt());
    // }
    public DialplanSet getValue() {
        if (aEnumSet == null)
            return null;
        // senum.setEnumint(getSelectedIndex());
        // if(senum.getEnumInt()==-1)return null;

        return (DialplanSet) aEnumSet;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.widgets.AbstractEnumSetTextField#createEnum()
     */
    protected AbstractSimpleEnumSet createEnum() {
        return new DialplanSet();
    }

}
