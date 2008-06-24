package com.useit.jact.gui.managerconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.managerconf.ManagerSection;

/**
 * <p>
 * ManagerSectionDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:16 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagerSectionDataPanel.java,v 1.7 2005/12/29
 *          19:14:20 urs Exp $
 */
public class ManagerSectionDataPanel extends SimpleDataObjectPanel {
    protected ManagerSection dataObject;

    // protected ManagerSectionChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ManagerSectionDataPanel() {
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

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * ManagerSectionCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFieldsecret, fStringTextFieldread,
     * fStringTextFieldwrite, }; dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (4) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelusername(), null); // Generated
        this.add(getJPanelsecret(), null); // Generated
        this.add(getJPanelread(), null); // Generated
        this.add(getJPanelwrite(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldusername.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldsecret.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldread.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldwrite.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldusername.setValue(dataObject.getUsername());
        fStringTextFieldsecret.setValue(dataObject.getSecret());
        fStringTextFieldread.setValue(dataObject.getRead());
        fStringTextFieldwrite.setValue(dataObject.getWrite());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setUsername(fStringTextFieldusername.getValue());
        dataObject.setSecret(fStringTextFieldsecret.getValue());
        dataObject.setRead(fStringTextFieldread.getValue());
        dataObject.setWrite(fStringTextFieldwrite.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param ManagerSection
     */
    public void setDataObject(Object aManagerSection) {
        // abstractdataObject = (AbstractConfigObject) aManagerSection;
        setDataObject((ManagerSection) aManagerSection);
        // dataObject = aManagerSection;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param ManagerSection
     */
    public void setDataObject(ManagerSection aManagerSection) {
        // abstractdataObject = (AbstractConfigObject) aManagerSection;
        dataObject = aManagerSection;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldusername;

    protected javax.swing.JLabel fJLabelusername;

    protected javax.swing.JPanel fJPanelusername;

    protected StringTextField fStringTextFieldsecret;

    protected javax.swing.JLabel fJLabelsecret;

    protected javax.swing.JPanel fJPanelsecret;

    protected StringTextField fStringTextFieldread;

    protected javax.swing.JLabel fJLabelread;

    protected javax.swing.JPanel fJPanelread;

    protected StringTextField fStringTextFieldwrite;

    protected javax.swing.JLabel fJLabelwrite;

    protected javax.swing.JPanel fJPanelwrite;

    // start DB field username
    /**
     * This method initializes fStringTextFieldusername
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldusername() {
        if (fStringTextFieldusername == null) {
            try {
                fStringTextFieldusername = new StringTextField(); // Generated
                fStringTextFieldusername
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldusername;
    }

    /**
     * This method initializes fJLabelusername
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelusername() {
        if (fJLabelusername == null) {
            try {
                fJLabelusername = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelusername.setText(resBundel
                        .getString("res_strusernameDisplayName")); // Generated
                fJLabelusername.setToolTipText(resBundel
                        .getString("res_strusernameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelusername;
    }

    /**
     * This method initializes fJPanelusername
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelusername() {
        if (fJPanelusername == null) {
            try {
                fJPanelusername = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelusername.setLayout(layFlowLayout); // Generated
                fJPanelusername.add(getJLabelusername(), null); // Generated
                fJPanelusername.add(getStringTextFieldusername(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelusername;
    }

    // end DB field username
    // start DB field secret
    /**
     * This method initializes fStringTextFieldsecret
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsecret() {
        if (fStringTextFieldsecret == null) {
            try {
                fStringTextFieldsecret = new StringTextField(); // Generated
                fStringTextFieldsecret.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsecret;
    }

    /**
     * This method initializes fJLabelsecret
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsecret() {
        if (fJLabelsecret == null) {
            try {
                fJLabelsecret = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelsecret.setText(resBundel
                        .getString("res_strsecretDisplayName")); // Generated
                fJLabelsecret.setToolTipText(resBundel
                        .getString("res_strsecretDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelsecret;
    }

    /**
     * This method initializes fJPanelsecret
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsecret() {
        if (fJPanelsecret == null) {
            try {
                fJPanelsecret = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsecret.setLayout(layFlowLayout); // Generated
                fJPanelsecret.add(getJLabelsecret(), null); // Generated
                fJPanelsecret.add(getStringTextFieldsecret(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsecret;
    }

    // end DB field secret
    // start DB field read
    /**
     * This method initializes fStringTextFieldread
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldread() {
        if (fStringTextFieldread == null) {
            try {
                fStringTextFieldread = new StringTextField(); // Generated
                fStringTextFieldread.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldread;
    }

    /**
     * This method initializes fJLabelread
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelread() {
        if (fJLabelread == null) {
            try {
                fJLabelread = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelread.setText(resBundel
                        .getString("res_strreadDisplayName")); // Generated
                fJLabelread.setToolTipText(resBundel
                        .getString("res_strreadDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelread;
    }

    /**
     * This method initializes fJPanelread
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelread() {
        if (fJPanelread == null) {
            try {
                fJPanelread = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelread.setLayout(layFlowLayout); // Generated
                fJPanelread.add(getJLabelread(), null); // Generated
                fJPanelread.add(getStringTextFieldread(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelread;
    }

    // end DB field read
    // start DB field write
    /**
     * This method initializes fStringTextFieldwrite
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldwrite() {
        if (fStringTextFieldwrite == null) {
            try {
                fStringTextFieldwrite = new StringTextField(); // Generated
                fStringTextFieldwrite.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldwrite;
    }

    /**
     * This method initializes fJLabelwrite
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelwrite() {
        if (fJLabelwrite == null) {
            try {
                fJLabelwrite = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelwrite.setText(resBundel
                        .getString("res_strwriteDisplayName")); // Generated
                fJLabelwrite.setToolTipText(resBundel
                        .getString("res_strwriteDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelwrite;
    }

    /**
     * This method initializes fJPanelwrite
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelwrite() {
        if (fJPanelwrite == null) {
            try {
                fJPanelwrite = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelwrite.setLayout(layFlowLayout); // Generated
                fJPanelwrite.add(getJLabelwrite(), null); // Generated
                fJPanelwrite.add(getStringTextFieldwrite(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelwrite;
    }
    // end DB field write

}
