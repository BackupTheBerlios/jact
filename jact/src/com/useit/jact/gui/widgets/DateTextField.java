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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * DateTextField
 * </p>
 * Created : 12.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DateTextField.java,v 1.3 2005/09/20 14:01:44
 *          urs Exp $
 */
public class DateTextField extends CustomTextField {

    private SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy");

    public void setValue(Date data) {
        if (data != null) {
            setText(formater.format(data));

        } else {
            setText(null);
        }
    }

    public Date getValue() {
        Date date = null;

        try {
            date = formater.parse(getText());
        } catch (ParseException e) {
            // TODO Automatisch erstellter Catch-Block
            e.printStackTrace();
        }
        return date;
    }
}
