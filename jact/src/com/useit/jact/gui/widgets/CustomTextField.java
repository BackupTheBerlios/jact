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

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 * <p>
 * CustomTextField
 * </p>
 * Created : 12.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: CustomTextField.java,v 1.4 2005/09/20
 *          14:01:44 urs Exp $
 */
public class CustomTextField extends JTextField {

    protected boolean isNull = true;

    protected static final String NULL = "[null]";

    /**
     * 
     */
    public CustomTextField() {
        super();
        addFokusL();
    }

    /**
     * 
     */
    private void addFokusL() {
        this.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent e) {
                CustomTextField.this.setBackground(Color.yellow);

            }

            public void focusLost(FocusEvent e) {
                CustomTextField.this.setBackground(Color.WHITE);

            }

        });

        getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e) {
                isNull = false;

            }

            public void removeUpdate(DocumentEvent e) {
                isNull = false;

            }

            public void changedUpdate(DocumentEvent e) {
                isNull = false;

            }

        });

    }

    /**
     * @param columns
     */
    public CustomTextField(int columns) {
        super(columns);
        addFokusL();
    }

    /**
     * @param text
     */
    public CustomTextField(String text) {
        super(text);
        addFokusL();
    }

    /**
     * @param text
     * @param columns
     */
    public CustomTextField(String text, int columns) {
        super(text, columns);
        addFokusL();
    }

    /**
     * @param doc
     * @param text
     * @param columns
     */
    public CustomTextField(Document doc, String text, int columns) {
        super(doc, text, columns);
        addFokusL();
    }

    /**
     * abstarkte methode, wird von den unterklassen overloaded, mit den
     * richtigen typen
     * 
     * @param data
     */
    public void setValue(Object data) {
        if (data == null) {
            setText(NULL);
            isNull = true;
        } else {
            setText((String) data);
            isNull = false;
        }
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
                return;
            }

        super.processKeyEvent(e);
    }

}
