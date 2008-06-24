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

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * <p>
 * TimeTextField
 * </p>
 * Created : 09.04.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: TimeTextField.java,v 1.3 2005/09/20 14:01:44
 *          urs Exp $
 */
public class TimeTextField extends CustomTextField {
    private SimpleDateFormat timeFormater = new SimpleDateFormat("HH:mm:ss");

    public void setValue(Time data) {
        setText(data.toString());
        // ******* Debug Code
        // System.out.println("Time als Long : " + data.getTime()+"
        // "+java.text.SimpleDateFormat.getDateInstance().getTimeZone().getRawOffset()
        // );
    }

    public Time getValue() {

        long lg = 0;
        try {
            lg = timeFormater.parse(getText()).getTime();
            // ******* Debug Code
            // System.out.println("Time als Long : " + new Time(lg).getTime()+"
            // "+java.text.SimpleDateFormat.getDateInstance().getTimeZone().getRawOffset());

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new Time(lg);
    }

}
