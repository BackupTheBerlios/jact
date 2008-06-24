/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.AbstractEnumSetTextField;
import com.useit.app.framework.model.types.AbstractSimpleEnumSet;
import com.useit.jact.model.types.SwitchtypeSet;

/**
 * <p>
 * EnumSetTextFieldSwitchtype
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: EnumSetTextFieldSwitchtype.java,v 1.2
 *          2005/12/25 18:09:57 urs Exp $
 */
public class EnumSetTextFieldSwitchtype extends AbstractEnumSetTextField {

    /**
     * 
     */
    public EnumSetTextFieldSwitchtype() {
        super();
    }

    // public void setValue(Switchtype data){
    // senum = data;
    // if(senum==null) senum = new Switchtype("");
    // setSelectedIndex(senum.getEnumInt());
    // }
    public SwitchtypeSet getValue() {
        if (aEnumSet == null)
            return null;
        // senum.setEnumint(getSelectedIndex());
        // if(senum.getEnumInt()==-1)return null;

        return (SwitchtypeSet) aEnumSet;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.widgets.AbstractEnumSetTextField#createEnum()
     */
    protected AbstractSimpleEnumSet createEnum() {
        return new SwitchtypeSet();
    }

}
