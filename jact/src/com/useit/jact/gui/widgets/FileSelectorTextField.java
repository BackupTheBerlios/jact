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

import java.awt.event.ActionEvent;
import java.net.MalformedURLException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.text.Document;

/**
 * <p>
 * DirectorySelectorTextField
 * </p>
 * Created : 13.10.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: FileSelectorTextField.java,v 1.3 2005/09/20
 *          14:01:44 urs Exp $
 */
public class FileSelectorTextField extends JPanel {
    private javax.swing.JButton jButton = null;

    private javax.swing.JTextField jTextField = null;

    /**
     * This is the default constructor
     */
    public FileSelectorTextField() {
        super();
        initialize();
        initActions();
    }

    /**
     * 
     */
    private void initActions() {
        jButton.setAction(new ActionSelectFile());

    }

    /**
     * zeigt den dialog an
     * 
     */
    void chooseFile() {
        JFileChooser chooser = new JFileChooser();
        int ret = chooser.showOpenDialog(null);

        if (ret != JFileChooser.CANCEL_OPTION) {
            try {
                if (chooser.getSelectedFile() != null)
                    jTextField.setText(chooser.getSelectedFile().toURL()
                            .toString());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } // end of if
    }

    /**
     * abstarkte methode, wird von den unterklassen overloaded, mit den
     * richtigen typen
     * 
     * @param data
     */
    public void setValue(Object data) {
        jTextField.setText((String) data);
    }

    /**
     * gibt die datei als url zurück
     * 
     * @return
     */
    public String getValue() {
        return jTextField.getText();
    }

    /**
     * 
     * <p>
     * ActionSelectFile
     * </p>
     * Created : 13.10.2004
     * 
     * @author urs
     */
    private class ActionSelectFile extends AbstractAction {
        public ActionSelectFile() {
            super();
            putValue(NAME, "...");
            putValue(ACTION_COMMAND_KEY, "ActionSelectFile");

        }

        public void actionPerformed(ActionEvent arg0) {
            chooseFile();

        }

    }; // end of ActionSelectFile Declaration

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
     * @return
     */
    public String getText() {
        return jTextField.getText();
    }

    /**
     * @param arg0
     */
    public void setText(String arg0) {
        jTextField.setText(arg0);
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

} // @jve:visual-info decl-index=0 visual-constraint="10,10"
