/*******************************************************************************
 * Copyright (c) 2005 Urs Zeidler
 * This program is free software, distributed under the terms of 
 * the GNU General Public License Version 2. See the LICENSE file 
 * at the top of the source tree.
 * 
 *
 * Contributors:
 *     Urs Zeidler
 *******************************************************************************/
package com.useit.jact.gui.widgets;

/**
 * <p>
 * StringTextField
 * </p>
 * Created : 12.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: StringTextField.java,v 1.4 2005/09/20
 *          14:01:44 urs Exp $
 */
public class StringTextField extends CustomTextField {
    public void setValue(String data) {
        setValue((Object) data);
        // setText(data);
    }

    public String getValue() {
        if (isNull)
            return null;
        return getText();
    }

}
