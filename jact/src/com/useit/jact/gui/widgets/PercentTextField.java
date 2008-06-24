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

import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.JOptionPane;

/**
 * <p>
 * PercentTextField, ein textfield für Prozent darstellung.
 * </p>
 * Created : 10.09.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: PercentTextField.java,v 1.4 2005/12/25
 *          13:42:28 urs Exp $
 */
public class PercentTextField extends CustomTextField {
    public void setValue(Float data) {
        if (data == null)
            return;
        setText(NumberFormat.getPercentInstance().format(data));

        // setText(data.toString());
    }

    public Float getValue() {
        // TODO: hier kommt der parse teil rein
        if (!getText().equals("")) {
            Number num = null;
            String temptex = getText().trim();
            try {
                num = NumberFormat.getPercentInstance().parse(temptex);
                setText(NumberFormat.getPercentInstance().format(num));

                return new Float(num.floatValue());
            } catch (ParseException e) {
                // der zweite anlauf
                try {
                    num = (NumberFormat.getInstance().parse(temptex));
                    float fl = num.floatValue() / 100;
                    setText(NumberFormat.getPercentInstance().format(fl));
                    return new Float(fl);
                } catch (ParseException e1) {
                    e1.printStackTrace();
                }
                // return new Float(e.getLocalizedMessage()); //getValue();
                JOptionPane.showMessageDialog(null, e.getLocalizedMessage(),
                        "number format", JOptionPane.ERROR_MESSAGE);

                return null;
            }
            // return new Float(num.doubleValue());

        } else
            return null;
    }

}
