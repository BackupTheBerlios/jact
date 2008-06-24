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

import java.awt.Panel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * DateSelector
 * </p>
 * Created : 14.05.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DateSelector.java,v 1.3 2005/09/20 14:01:44
 *          urs Exp $
 */
public class DateSelector extends Panel {
    private SimpleDateFormat mformater = new SimpleDateFormat("MM");

    private SimpleDateFormat yformater = new SimpleDateFormat("yyyy");

    private javax.swing.JButton jButton = null;

    public static final int YEAR = 0;

    public static final int MONTH = 1;

    private int modus = 0;

    private Date selectedDate = new Date();

    private javax.swing.JButton jButton1 = null;

    private javax.swing.JPanel jPanel = null;

    private javax.swing.JLabel jLabel = null;

    /**
     * This is the default constructor
     */
    public DateSelector() {
        super();
        initialize();
    }

    /**
     * This is the default constructor
     */
    public DateSelector(int modus) {
        super();
        this.modus = modus;
        initialize();
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setLayout(new java.awt.BorderLayout()); // Generated
        this.add(getJButton(), java.awt.BorderLayout.WEST); // Generated
        this.add(getJButton1(), java.awt.BorderLayout.EAST); // Generated
        this.add(getJPanel(), java.awt.BorderLayout.CENTER); // Generated
        this.setSize(186, 35);

        repaint();
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
                jButton.setText("<"); // Generated
                jButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        dec();
                    }
                });
            } catch (java.lang.Throwable e) {
                // Do Something
            }
        }
        return jButton;
    }

    /**
     * This method initializes jButton1
     * 
     * @return javax.swing.JButton
     */
    private javax.swing.JButton getJButton1() {
        if (jButton1 == null) {
            try {
                jButton1 = new javax.swing.JButton(); // Generated
                jButton1.setText(">"); // Generated
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        inc();
                    }
                });
            } catch (java.lang.Throwable e) {
                // Do Something
            }
        }
        return jButton1;
    }

    /**
     * This method initializes jPanel
     * 
     * @return javax.swing.JPanel
     */
    private javax.swing.JPanel getJPanel() {
        if (jPanel == null) {
            try {
                jPanel = new javax.swing.JPanel(); // Generated
                jPanel.add(getJLabel(), null); // Generated
            } catch (java.lang.Throwable e) {
                // Do Something
            }
        }
        return jPanel;
    }

    /**
     * This method initializes jLabel
     * 
     * @return javax.swing.JLabel
     */
    private javax.swing.JLabel getJLabel() {
        if (jLabel == null) {
            try {
                jLabel = new javax.swing.JLabel(); // Generated
                jLabel.setText("JLabel"); // Generated
            } catch (java.lang.Throwable e) {
                // Do Something
            }
        }
        return jLabel;
    }

    void inc() {
        String old = null;
        switch (modus) {
        case YEAR:
            old = getValue();
            selectedDate.setYear(selectedDate.getYear() + 1);
            this.firePropertyChange("selectedDate", old, getValue());

        case MONTH:
            old = getValue();
            selectedDate.setMonth(selectedDate.getMonth() + 1);
            this.firePropertyChange("selectedDate", old, getValue());
        }
        repaint();
    }

    void dec() {
        String old = null;
        switch (modus) {
        case YEAR:
            old = getValue();
            selectedDate.setYear(selectedDate.getYear() - 1);
            this.firePropertyChange("selectedDate", old, getValue());
        case MONTH:
            old = getValue();
            selectedDate.setMonth(selectedDate.getMonth() - 1);
            this.firePropertyChange("selectedDate", old, getValue());
        }
        repaint();

    }

    /*
     * (Kein Javadoc)
     * 
     * @see java.awt.Component#repaint()
     */
    public void repaint() {
        jLabel.setText(getValue());
        super.repaint();
    }

    public String getValue() {

        DateFormat.getDateInstance().format(selectedDate);
        switch (modus) {
        case YEAR:
            return yformater.format(selectedDate);
        case MONTH:
            return mformater.format(selectedDate);
        default:
            return "";
        } // end of switch

    }

    /*
     * (Kein Javadoc)
     * 
     * @see java.awt.Component#repaint(int, int, int, int)
     */
    public void repaint(int arg0, int arg1, int arg2, int arg3) {
        jLabel.setText(getValue());
        super.repaint(arg0, arg1, arg2, arg3);
    }

    /*
     * (Kein Javadoc)
     * 
     * @see java.awt.Component#repaint(long, int, int, int, int)
     */
    public void repaint(long arg0, int arg1, int arg2, int arg3, int arg4) {
        jLabel.setText(getValue());
        super.repaint(arg0, arg1, arg2, arg3, arg4);
    }

    /*
     * (Kein Javadoc)
     * 
     * @see java.awt.Component#repaint(long)
     */
    public void repaint(long arg0) {
        jLabel.setText(getValue());
        super.repaint(arg0);
    }

    /**
     * @return
     */
    public int getModus() {
        return modus;
    }

    /**
     * @return
     */
    public Date getSelectedDate() {
        return selectedDate;
    }

    /**
     * @param i
     */
    public void setModus(int i) {
        modus = i;
    }

} // @jve:visual-info decl-index=0 visual-constraint="10,10"
