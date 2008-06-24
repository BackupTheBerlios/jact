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
 * FloatTextField
 * </p>
 * Created : 12.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: FloatTextField.java,v 1.4 2005/09/20 14:01:44
 *          urs Exp $
 */
public class FloatTextField extends CustomTextField {

    public void setValue(Float data) {
        if (data == null) {
            setText(NULL);
            isNull = true;
            return;
        }

        // if(data==null) return;
        setText(data.toString());
    }

    public Float getValue() {
        if (isNull)
            return null;

        Float i;
        try {
            i = new Float(getText());
        } catch (Exception e) {
            i = new Float(0);
        } // end of try catch
        return i;
    }

}
