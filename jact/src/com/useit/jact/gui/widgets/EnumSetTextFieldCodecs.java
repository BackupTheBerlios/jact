/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import com.useit.app.framework.gui.widgets.AbstractEnumSetTextField;
import com.useit.app.framework.model.types.AbstractSimpleEnumSet;
import com.useit.jact.model.types.CodecsSet;

/**
 * <p>
 * EnumSetTextFieldCodecs
 * </p>
 * Created : 05.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: EnumSetTextFieldCodecs.java,v 1.4 2005/12/25
 *          18:09:57 urs Exp $
 */
public class EnumSetTextFieldCodecs extends AbstractEnumSetTextField {

    /**
     * 
     */
    public EnumSetTextFieldCodecs() {
        super();
    }

    // public void setValue(Codecs data){
    // senum = data;
    // if(senum==null) senum = new Codecs("");
    // setSelectedIndex(senum.getEnumInt());
    // }
    public CodecsSet getValue() {
        if (aEnumSet == null)
            return null;
        // senum.setEnumint(getSelectedIndex());
        // if(senum.getEnumInt()==-1)return null;

        return (CodecsSet) aEnumSet;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.gui.widgets.AbstractEnumSetTextField#createEnum()
     */
    protected AbstractSimpleEnumSet createEnum() {
        return new CodecsSet();
    }

}
