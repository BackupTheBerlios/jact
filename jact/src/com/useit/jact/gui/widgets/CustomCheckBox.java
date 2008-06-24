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

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.JCheckBox;

/**
 * 
 * <p>
 * CustomCheckBox, eine Checkbox die alles enthält um mit den Templates zu
 * laufen.
 * </p>
 * Created : 25.02.2004
 * 
 * @author nn
 * @version $Revision: 1.1 $, $Id: CustomCheckBox.java,v 1.4 2005/09/20 14:01:44
 *          urs Exp $
 */
public class CustomCheckBox extends JCheckBox {
    private checkboxDummyDocument document;

    private static final String NULL = "[null]";

    private boolean isNull;

    /**
     * 
     */
    public CustomCheckBox() {
        super();
        document = new checkboxDummyDocument();
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     */
    public CustomCheckBox(String arg0, Icon arg1, boolean arg2) {
        super(arg0, arg1, arg2);
    }

    /**
     * setz das Boolean Value
     * 
     * @param data
     */
    public void setValue(Boolean data) {
        if (data == null) {
            setText(NULL);
            isNull = true;
            return;
        }
        // setSelected(false);
        // else

        setSelected(data.booleanValue());
        isNull = false;
    }

    public Boolean getValue() {
        if (isNull)
            return null;

        return new Boolean(isSelected());
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.AbstractButton#fireItemStateChanged(java.awt.event.ItemEvent)
     */
    protected void fireItemStateChanged(ItemEvent event) {
        super.fireItemStateChanged(event);
        isNull = false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.JComponent#processKeyEvent(java.awt.event.KeyEvent)
     */
    protected void processKeyEvent(KeyEvent e) {
        if (e.isShiftDown())
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                setText(NULL);
                isNull = true;
                // doClick();
                return;
            }

        super.processKeyEvent(e);
    }

    /*
     * (Kein Javadoc)
     * 
     * @see javax.swing.AbstractButton#getText()
     */
    public String getText() {
        if (isSelected())
            return "true"; // ApplicationConfig.getInstance().getDefaultRes().getString("chTrue");
        if (isNull)
            return NULL;

        return "false";// ApplicationConfig.getInstance().getDefaultRes().getString("chFalse");
    }

    /**
     * @return
     */
    public checkboxDummyDocument getDocument() {
        return document;
    }

    // public void itemStateChanged(ItemEvent e) {
    // //******* Debug Code
    // System.out.println(e);
    // }

    /**
     * 
     * <p>
     * checkboxDocument, das document um über die staus änderung auf dem
     * laufenden zu sein.
     * </p>
     * Created : 25.02.2004
     * 
     * @author nn
     * @version $Revision: 1.1 $, $Id: CustomCheckBox.java,v 1.4 2005/09/20
     *          14:01:44 urs Exp $
     */
    public class checkboxDummyDocument {
        public void addDocumentListener(Object itemListener) {
            addItemListener((ItemListener) itemListener);
        }
    }

}
