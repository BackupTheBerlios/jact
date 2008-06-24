/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.AbstractEnumSetTextField;
import com.useit.app.framework.model.types.AbstractSimpleEnumSet;
import com.useit.jact.model.types.DtmfmodeSet;

/**
 * <p>
 * EnumSetTextFieldDtmfmode
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: EnumSetTextFieldDtmfmode.java,v 1.4
 *          2005/12/25 18:09:57 urs Exp $
 */
public class EnumSetTextFieldDtmfmode extends AbstractEnumSetTextField {

    /**
     * 
     */
    public EnumSetTextFieldDtmfmode() {
        super();
    }

    // public void setValue(Dtmfmode data){
    // senum = data;
    // if(senum==null) senum = new Dtmfmode("");
    // setSelectedIndex(senum.getEnumInt());
    // }
    public DtmfmodeSet getValue() {
        if (aEnumSet == null)
            return null;
        // senum.setEnumint(getSelectedIndex());
        // if(senum.getEnumInt()==-1)return null;

        return (DtmfmodeSet) aEnumSet;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.widgets.AbstractEnumSetTextField#createEnum()
     */
    protected AbstractSimpleEnumSet createEnum() {
        return new DtmfmodeSet();
    }

}
