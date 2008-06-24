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

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.managerconf.GeneralSection;

/**
 * <p>
 * GeneralSectionDataPanel
 * </p>
 * Created : Wed Aug 17 01:27:23 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GeneralSectionDataPanel.java,v 1.5 2005/09/20
 *          14:02:04 urs Exp $
 */
public class GeneralSectionDataPanel extends SimpleDataObjectPanel {
    protected GeneralSection dataObject;

    // protected GeneralSectionChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public GeneralSectionDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getGeneralSectionResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getGeneralSectionResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/GeneralSectionResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * GeneralSectionCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fCustomCheckBoxEnabled, fIntegerTextFieldPortno,
     * fStringTextFieldBindaddr, fIntegerTextFieldPort, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (5) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(5); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelGeneralid(), null); // Generated
        this.add(getJPanelEnabled(), null); // Generated
        this.add(getJPanelPortno(), null); // Generated
        this.add(getJPanelBindaddr(), null); // Generated
        this.add(getJPanelPort(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldGeneralid.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxEnabled.getDocument().addDocumentListener(textChangeAct);
        fIntegerTextFieldPortno.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldBindaddr.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldPort.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldGeneralid.setValue(dataObject.getGeneralid());
        fCustomCheckBoxEnabled.setValue(dataObject.getEnabled());
        fIntegerTextFieldPortno.setValue(dataObject.getPortno());
        fStringTextFieldBindaddr.setValue(dataObject.getBindaddr());
        fIntegerTextFieldPort.setValue(dataObject.getPort());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setGeneralid(fStringTextFieldGeneralid.getValue());
        dataObject.setEnabled(fCustomCheckBoxEnabled.getValue());
        dataObject.setPortno(fIntegerTextFieldPortno.getValue());
        dataObject.setBindaddr(fStringTextFieldBindaddr.getValue());
        dataObject.setPort(fIntegerTextFieldPort.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param GeneralSection
     */
    public void setDataObject(Object aGeneralSection) {
        // abstractdataObject = (AbstractConfigObject) aGeneralSection;
        setDataObject((GeneralSection) aGeneralSection);
        // dataObject = aGeneralSection;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param GeneralSection
     */
    public void setDataObject(GeneralSection aGeneralSection) {
        // abstractdataObject = (AbstractConfigObject) aGeneralSection;
        dataObject = aGeneralSection;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldGeneralid;

    private javax.swing.JLabel fJLabelGeneralid;

    protected javax.swing.JPanel fJPanelGeneralid;

    protected CustomCheckBox fCustomCheckBoxEnabled;

    private javax.swing.JLabel fJLabelEnabled;

    protected javax.swing.JPanel fJPanelEnabled;

    protected IntegerTextField fIntegerTextFieldPortno;

    private javax.swing.JLabel fJLabelPortno;

    protected javax.swing.JPanel fJPanelPortno;

    protected StringTextField fStringTextFieldBindaddr;

    private javax.swing.JLabel fJLabelBindaddr;

    protected javax.swing.JPanel fJPanelBindaddr;

    protected IntegerTextField fIntegerTextFieldPort;

    private javax.swing.JLabel fJLabelPort;

    protected javax.swing.JPanel fJPanelPort;

    // start DB field Generalid
    /**
     * This method initializes fStringTextFieldGeneralid
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldGeneralid() {
        if (fStringTextFieldGeneralid == null) {
            try {
                fStringTextFieldGeneralid = new StringTextField(); // Generated
                fStringTextFieldGeneralid
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldGeneralid;
    }

    /**
     * This method initializes fJLabelGeneralid
     * 
     * @return javax.swing.JLabel
     */
    private javax.swing.JLabel getJLabelGeneralid() {
        if (fJLabelGeneralid == null) {
            try {
                fJLabelGeneralid = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelGeneralid.setText(resBundel
                        .getString("res_strGeneralidDisplayName")); // Generated
                fJLabelGeneralid.setToolTipText(resBundel
                        .getString("res_strGeneralidDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelGeneralid;
    }

    /**
     * This method initializes fJPanelGeneralid
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelGeneralid() {
        if (fJPanelGeneralid == null) {
            try {
                fJPanelGeneralid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelGeneralid.setLayout(layFlowLayout); // Generated
                fJPanelGeneralid.add(getJLabelGeneralid(), null); // Generated
                fJPanelGeneralid.add(getStringTextFieldGeneralid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelGeneralid;
    }

    // end DB field Generalid
    // start DB field Enabled
    /**
     * This method initializes fCustomCheckBoxEnabled
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxEnabled() {
        if (fCustomCheckBoxEnabled == null) {
            try {
                fCustomCheckBoxEnabled = new CustomCheckBox(); // Generated
                fCustomCheckBoxEnabled.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxEnabled;
    }

    /**
     * This method initializes fJLabelEnabled
     * 
     * @return javax.swing.JLabel
     */
    private javax.swing.JLabel getJLabelEnabled() {
        if (fJLabelEnabled == null) {
            try {
                fJLabelEnabled = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelEnabled.setText(resBundel
                        .getString("res_strEnabledDisplayName")); // Generated
                fJLabelEnabled.setToolTipText(resBundel
                        .getString("res_strEnabledDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelEnabled;
    }

    /**
     * This method initializes fJPanelEnabled
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelEnabled() {
        if (fJPanelEnabled == null) {
            try {
                fJPanelEnabled = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelEnabled.setLayout(layFlowLayout); // Generated
                fJPanelEnabled.add(getJLabelEnabled(), null); // Generated
                fJPanelEnabled.add(getCustomCheckBoxEnabled(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelEnabled;
    }

    // end DB field Enabled
    // start DB field Portno
    /**
     * This method initializes fIntegerTextFieldPortno
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldPortno() {
        if (fIntegerTextFieldPortno == null) {
            try {
                fIntegerTextFieldPortno = new IntegerTextField(); // Generated
                fIntegerTextFieldPortno
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldPortno;
    }

    /**
     * This method initializes fJLabelPortno
     * 
     * @return javax.swing.JLabel
     */
    private javax.swing.JLabel getJLabelPortno() {
        if (fJLabelPortno == null) {
            try {
                fJLabelPortno = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelPortno.setText(resBundel
                        .getString("res_strPortnoDisplayName")); // Generated
                fJLabelPortno.setToolTipText(resBundel
                        .getString("res_strPortnoDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelPortno;
    }

    /**
     * This method initializes fJPanelPortno
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelPortno() {
        if (fJPanelPortno == null) {
            try {
                fJPanelPortno = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelPortno.setLayout(layFlowLayout); // Generated
                fJPanelPortno.add(getJLabelPortno(), null); // Generated
                fJPanelPortno.add(getIntegerTextFieldPortno(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelPortno;
    }

    // end DB field Portno
    // start DB field Bindaddr
    /**
     * This method initializes fStringTextFieldBindaddr
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldBindaddr() {
        if (fStringTextFieldBindaddr == null) {
            try {
                fStringTextFieldBindaddr = new StringTextField(); // Generated
                fStringTextFieldBindaddr
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldBindaddr;
    }

    /**
     * This method initializes fJLabelBindaddr
     * 
     * @return javax.swing.JLabel
     */
    private javax.swing.JLabel getJLabelBindaddr() {
        if (fJLabelBindaddr == null) {
            try {
                fJLabelBindaddr = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelBindaddr.setText(resBundel
                        .getString("res_strBindaddrDisplayName")); // Generated
                fJLabelBindaddr.setToolTipText(resBundel
                        .getString("res_strBindaddrDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelBindaddr;
    }

    /**
     * This method initializes fJPanelBindaddr
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelBindaddr() {
        if (fJPanelBindaddr == null) {
            try {
                fJPanelBindaddr = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelBindaddr.setLayout(layFlowLayout); // Generated
                fJPanelBindaddr.add(getJLabelBindaddr(), null); // Generated
                fJPanelBindaddr.add(getStringTextFieldBindaddr(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelBindaddr;
    }

    // end DB field Bindaddr
    // start DB field Port
    /**
     * This method initializes fIntegerTextFieldPort
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldPort() {
        if (fIntegerTextFieldPort == null) {
            try {
                fIntegerTextFieldPort = new IntegerTextField(); // Generated
                fIntegerTextFieldPort.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldPort;
    }

    /**
     * This method initializes fJLabelPort
     * 
     * @return javax.swing.JLabel
     */
    private javax.swing.JLabel getJLabelPort() {
        if (fJLabelPort == null) {
            try {
                fJLabelPort = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelPort.setText(resBundel
                        .getString("res_strPortDisplayName")); // Generated
                fJLabelPort.setToolTipText(resBundel
                        .getString("res_strPortDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelPort;
    }

    /**
     * This method initializes fJPanelPort
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelPort() {
        if (fJPanelPort == null) {
            try {
                fJPanelPort = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelPort.setLayout(layFlowLayout); // Generated
                fJPanelPort.add(getJLabelPort(), null); // Generated
                fJPanelPort.add(getIntegerTextFieldPort(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelPort;
    }
    // end DB field Port

}
