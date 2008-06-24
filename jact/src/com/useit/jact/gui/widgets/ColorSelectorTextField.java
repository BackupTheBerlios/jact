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
/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.widgets;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Document;

/**
 * <p>
 * ColorSelectorTextField
 * </p>
 * Created : 18.05.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ColorSelectorTextField.java,v 1.3 2005/09/20
 *          14:01:44 urs Exp $
 */
public class ColorSelectorTextField extends JPanel {
    private Color color = Color.BLUE;

    private JButton jButton = null;

    private JTextField jTextField = null;

    /**
     * @param layout
     * @param isDoubleBuffered
     */
    public ColorSelectorTextField(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);

        initialize();
    }

    /**
     * @param layout
     */
    public ColorSelectorTextField(LayoutManager layout) {
        super(layout);

        initialize();
    }

    /**
     * @param isDoubleBuffered
     */
    public ColorSelectorTextField(boolean isDoubleBuffered) {
        super(isDoubleBuffered);

        initialize();
    }

    /**
     * 
     */
    public ColorSelectorTextField() {
        super();

        initialize();
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        BorderLayout borderLayout1 = new BorderLayout();
        this.setLayout(borderLayout1);
        this.setSize(388, 162);
        borderLayout1.setVgap(0);
        borderLayout1.setHgap(5);
        this.add(getJButton(), java.awt.BorderLayout.EAST);
        this.add(getJTextField(), java.awt.BorderLayout.CENTER);

        getJButton().setAction(new ActionSelectColor());
    }

    /**
     * abstarkte methode, wird von den unterklassen overloaded, mit den
     * richtigen typen
     * 
     * @param data
     */
    public void setValue(Object data) {
        color = new Color(((Integer) data).intValue());
        jTextField.setText(color.toString());
        jTextField.setBackground(color);
    }

    /**
     * gibt die datei als url zurück
     * 
     * @return
     */
    public Integer getValue() {
        return new Integer(color.getRGB());
    }

    /**
     * 
     */
    public Document getDocument() {
        return jTextField.getDocument();

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
    private class ActionSelectColor extends AbstractAction {
        public ActionSelectColor() {
            super();
            putValue(NAME, "...");
            putValue(ACTION_COMMAND_KEY, "ActionSelectColor");

        }

        public void actionPerformed(ActionEvent arg0) {
            Color newColor = JColorChooser.showDialog(
                    ColorSelectorTextField.this, "Choose Background Color",
                    color);
            if (newColor != null)
                if (!color.equals(newColor)) {
                    setValue(new Integer(newColor.getRGB()));
                }
        }

    }

    // /**
    // *
    // */
    // void selectColor() {
    // Color newColor = JColorChooser.showDialog(
    // this,
    // "Choose Background Color",
    // color);
    //        
    // if(!color.equals(newColor)){
    // setValue(new Integer(newColor.getRGB()));
    // }
    // }
    /**
     * This method initializes jButton
     * 
     * @return javax.swing.JButton
     */
    private JButton getJButton() {
        if (jButton == null) {
            jButton = new JButton();
        }
        return jButton;
    }

    /**
     * This method initializes jTextField
     * 
     * @return javax.swing.JTextField
     */
    private JTextField getJTextField() {
        if (jTextField == null) {
            jTextField = new JTextField();
            jTextField.setPreferredSize(new java.awt.Dimension(80, 20));
            jTextField.setBackground(color);
        }
        return jTextField;
    }

    /**
     * @return
     */
    public String getText() {
        return " ";
    }
} // @jve:decl-index=0:visual-constraint="10,10"
