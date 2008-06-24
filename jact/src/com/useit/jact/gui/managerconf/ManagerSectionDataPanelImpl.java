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
package com.useit.jact.gui.managerconf;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ResourceBundle;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.useit.jact.model.managerconf.ManagerSection;

/**
 * <p>
 * ManagerSectionDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Aug 09 10:28:34 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagerSectionDataPanelImpl.java,v 1.5
 *          2006/01/05 12:57:43 urs Exp $
 */
public class ManagerSectionDataPanelImpl extends ManagerSectionDataPanel {

    private JTable jTableDeny = null; // @jve:decl-index=0:visual-constraint="36,-324"

    private JScrollPane jScrollPaneDeny = null;

    private JTable jTableAllow = null;

    private JScrollPane jScrollPaneAllow = null;

    private JPanel jPanel = null;

    private JPanel jPanel1 = null;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ManagerSectionDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getManagerSectionResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getManagerSectionResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ManagerSectionResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        initialize();
        initActions();
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(new java.awt.Dimension(224, 170));
        this.setLayout(new BorderLayout()); // Generated
        // this.setSize(84, 84);
        this.add(getJPanel1(), java.awt.BorderLayout.NORTH);
        // this.add(getJPanel(), java.awt.BorderLayout.SOUTH);
        // this.add(getJPanelUsername(), null); // Generated
        // this.add(getJPanelSecret(), null); // Generated
        // this.add(getJPanelRead(), null); // Generated
        // this.add(getJPanelWrite(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    /**
     * This method initializes jTable
     * 
     * @return javax.swing.JTable
     */
    private JTable getJTableDeny() {
        if (jTableDeny == null) {
            try {
                jTableDeny = new JTable();
            } catch (java.lang.Throwable e) {
                // TODO: Something
            }
        }
        return jTableDeny;
    }

    /**
     * This method initializes jScrollPane
     * 
     * @return javax.swing.JScrollPane
     */
    private JScrollPane getJScrollPaneDeny() {
        if (jScrollPaneDeny == null) {
            try {
                jScrollPaneDeny = new JScrollPane();
                jScrollPaneDeny
                        .setPreferredSize(new java.awt.Dimension(60, 60));
                jScrollPaneDeny.setViewportView(getJTableDeny());
            } catch (java.lang.Throwable e) {
                // TODO: Something
            }
        }
        return jScrollPaneDeny;
    }

    /**
     * This method initializes jTable
     * 
     * @return javax.swing.JTable
     */
    private JTable getJTableAllow() {
        if (jTableAllow == null) {
            try {
                jTableAllow = new JTable();
            } catch (java.lang.Throwable e) {
                // TODO: Something
            }
        }
        return jTableAllow;
    }

    /**
     * This method initializes jScrollPane
     * 
     * @return javax.swing.JScrollPane
     */
    private JScrollPane getJScrollPaneAllow() {
        if (jScrollPaneAllow == null) {
            try {
                jScrollPaneAllow = new JScrollPane();
                jScrollPaneAllow.setViewportView(getJTableAllow());
                jScrollPaneAllow
                        .setPreferredSize(new java.awt.Dimension(60, 60));
            } catch (java.lang.Throwable e) {
                // TODO: Something
            }
        }
        return jScrollPaneAllow;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.gui.managerconf.ManagerSectionDataPanel#setDataObject(com.useit.jact.model.managerconf.ManagerSection)
     */
    public void setDataObject(ManagerSection aManagerSection) {
        super.setDataObject(aManagerSection);
        DenyTableModel dtm = new DenyTableModel(new String[] { "deny", "" });
        dtm.setNewList(aManagerSection.getManagerdenyMap());

        PermitTableModel atm = new PermitTableModel(
                new String[] { "permit", "" });
        atm.setNewList(aManagerSection.getManagerpermitMap());

        getJTableDeny().setModel(dtm);
        getJTableAllow().setModel(atm);
    }

    /**
     * This method initializes jPanel
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel() {
        if (jPanel == null) {
            try {
                GridLayout gridLayout1 = new GridLayout();
                jPanel = new JPanel();
                jPanel1.setSize(10, 10);
                jPanel.setLayout(gridLayout1);
                gridLayout1.setRows(2);
                gridLayout1.setColumns(1);
                jPanel.add(getJScrollPaneAllow(), null);
                jPanel.add(getJScrollPaneDeny(), null);
            } catch (java.lang.Throwable e) {
                // TODO: Something
            }
        }
        return jPanel;
    }

    /**
     * This method initializes jPanel1
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel1() {
        if (jPanel1 == null) {
            try {
                GridLayout gridLayout1 = new GridLayout();
                jPanel1 = new JPanel();
                jPanel1.setLayout(gridLayout1); // Generated
                gridLayout1.setRows(4);
                gridLayout1.setColumns(1);
                jPanel1.add(getJPanelusername(), null); // Generated
                jPanel1.add(getJPanelsecret(), null); // Generated
                jPanel1.add(getJPanelread(), null); // Generated
                jPanel1.add(getJPanelwrite(), null); // Generated
            } catch (java.lang.Throwable e) {
                // TODO: Something
            }
        }
        return jPanel1;
    }
} // @jve:decl-index=0:visual-constraint="10,41"
