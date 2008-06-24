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

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.text.Document;

import com.useit.jact.model.types.PbxContext;

/**
 * <p>
 * StringTextField
 * </p>
 * Created : 12.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: PbxContextTextField.java,v 1.6 2005/12/29
 *          19:14:29 urs Exp $
 */
public class PbxContextTextField extends JPanel {
    private javax.swing.JButton jButton = null;

    private javax.swing.JTextField jTextField = null;

    public PbxContextTextField() {
        super();
        initialize();
    }

    public PbxContextTextField(boolean arg0) {
        super(arg0);
        initialize();
    }

    public PbxContextTextField(LayoutManager arg0, boolean arg1) {
        super(arg0, arg1);
        initialize();
    }

    public PbxContextTextField(LayoutManager arg0) {
        super(arg0);
        initialize();
    }

    public void setValue(PbxContext data) {
        if (data == null)
            jTextField.setText("none");
        else
            jTextField.setText(data.toString());
    }

    public PbxContext getValue() {
        return new PbxContext(jTextField.getText());
    }

    /**
     * 
     */
    private void initActions() {
        jButton.setAction(new ActionEditContext());

    }

    /**
     * 
     * <p>
     * ActionEditContext
     * </p>
     * Created : 13.10.2004
     * 
     * @author urs
     */
    private class ActionEditContext extends AbstractAction {
        public ActionEditContext() {
            super();
            putValue(NAME, "...");
            putValue(ACTION_COMMAND_KEY, "ActionEditContext");

        }

        public void actionPerformed(ActionEvent arg0) {
            editContextList();

        }

    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        java.awt.BorderLayout layBorderLayout1 = new java.awt.BorderLayout(); // Generated
        layBorderLayout1.setVgap(0); // Generated
        layBorderLayout1.setHgap(5); // Generated
        this.setLayout(layBorderLayout1); // Generated
        this.add(getJButton(), java.awt.BorderLayout.EAST); // Generated
        this.add(getJTextField(), java.awt.BorderLayout.CENTER); // Generated
        this.setSize(180, 20); // Generated
        this.setPreferredSize(new java.awt.Dimension(180, 20)); // Generated
    }

    public void editContextList() {
        // TODO Automatisch erstellter Methoden-Stub

    }

    /**
     * This method initializes jButton
     * 
     * @return javax.swing.JButton
     */
    private javax.swing.JButton getJButton() {
        if (jButton == null) {
            try {
                jButton = new javax.swing.JButton(); // Generated
                jButton.setText("..."); // Generated
                jButton.setPreferredSize(new java.awt.Dimension(30, 20));
            } catch (java.lang.Throwable e) {
                // Do Something
            }
        }
        return jButton;
    }

    /**
     * This method initializes jTextField
     * 
     * @return javax.swing.JTextField
     */
    private javax.swing.JTextField getJTextField() {
        if (jTextField == null) {
            try {
                jTextField = new javax.swing.JTextField(); // Generated
                jTextField.setPreferredSize(new java.awt.Dimension(80, 20)); // Generated
            } catch (java.lang.Throwable e) {
                // Do Something
            }
        }
        return jTextField;
    }

    /**
     * @param a
     */
    public void setAction(Action a) {
        jButton.setAction(a);
    }

    /**
     * 
     */
    public Document getDocument() {
        return jTextField.getDocument();

    }

}
