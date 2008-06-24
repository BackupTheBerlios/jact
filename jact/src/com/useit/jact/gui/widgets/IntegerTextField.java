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
 * IntegerTextField
 * </p>
 * Created : 12.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IntegerTextField.java,v 1.4 2005/09/20
 *          14:01:44 urs Exp $
 */
public class IntegerTextField extends CustomTextField {
    public void setValue(Integer data) {
        if (data == null) {
            setText(NULL);
            isNull = true;
            return;
        }
        setText(data.toString());
    }

    public Integer getValue() {
        if (isNull)
            return null;

        Integer i;
        try {
            i = new Integer(getText());
        } catch (Exception e) {
            i = new Integer(0);
        } // end of try catch
        return i;
    }

}
