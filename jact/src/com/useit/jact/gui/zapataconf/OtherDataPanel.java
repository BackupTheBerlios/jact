package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zapataconf.Other;

/**
 * <p>
 * OtherDataPanel
 * </p>
 * Created : Thu Dec 29 12:22:53 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: OtherDataPanel.java,v 1.5 2005/12/29 19:14:06
 *          urs Exp $
 */
public class OtherDataPanel extends SimpleDataObjectPanel {
    protected Other dataObject;

    // protected OtherChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public OtherDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getOtherResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getOtherResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/OtherResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * OtherCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldmailbox, fStringTextFieldgroup,
     * fStringTextFieldlanguage, }; dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (3) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelmailbox(), null); // Generated
        this.add(getJPanelgroup(), null); // Generated
        this.add(getJPanellanguage(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldmailbox.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldgroup.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldlanguage.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldmailbox.setValue(dataObject.getMailbox());
        fStringTextFieldgroup.setValue(dataObject.getGroup());
        fStringTextFieldlanguage.setValue(dataObject.getLanguage());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setMailbox(fStringTextFieldmailbox.getValue());
        dataObject.setGroup(fStringTextFieldgroup.getValue());
        dataObject.setLanguage(fStringTextFieldlanguage.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Other
     */
    public void setDataObject(Object aOther) {
        // abstractdataObject = (AbstractConfigObject) aOther;
        setDataObject((Other) aOther);
        // dataObject = aOther;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Other
     */
    public void setDataObject(Other aOther) {
        // abstractdataObject = (AbstractConfigObject) aOther;
        dataObject = aOther;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldmailbox;

    protected javax.swing.JLabel fJLabelmailbox;

    protected javax.swing.JPanel fJPanelmailbox;

    protected StringTextField fStringTextFieldgroup;

    protected javax.swing.JLabel fJLabelgroup;

    protected javax.swing.JPanel fJPanelgroup;

    protected StringTextField fStringTextFieldlanguage;

    protected javax.swing.JLabel fJLabellanguage;

    protected javax.swing.JPanel fJPanellanguage;

    // start DB field mailbox
    /**
     * This method initializes fStringTextFieldmailbox
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmailbox() {
        if (fStringTextFieldmailbox == null) {
            try {
                fStringTextFieldmailbox = new StringTextField(); // Generated
                fStringTextFieldmailbox
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmailbox;
    }

    /**
     * This method initializes fJLabelmailbox
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmailbox() {
        if (fJLabelmailbox == null) {
            try {
                fJLabelmailbox = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmailbox.setText(resBundel
                        .getString("res_strmailboxDisplayName")); // Generated
                fJLabelmailbox.setToolTipText(resBundel
                        .getString("res_strmailboxDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmailbox;
    }

    /**
     * This method initializes fJPanelmailbox
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmailbox() {
        if (fJPanelmailbox == null) {
            try {
                fJPanelmailbox = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmailbox.setLayout(layFlowLayout); // Generated
                fJPanelmailbox.add(getJLabelmailbox(), null); // Generated
                fJPanelmailbox.add(getStringTextFieldmailbox(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmailbox;
    }

    // end DB field mailbox
    // start DB field group
    /**
     * This method initializes fStringTextFieldgroup
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldgroup() {
        if (fStringTextFieldgroup == null) {
            try {
                fStringTextFieldgroup = new StringTextField(); // Generated
                fStringTextFieldgroup.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldgroup;
    }

    /**
     * This method initializes fJLabelgroup
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelgroup() {
        if (fJLabelgroup == null) {
            try {
                fJLabelgroup = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelgroup.setText(resBundel
                        .getString("res_strgroupDisplayName")); // Generated
                fJLabelgroup.setToolTipText(resBundel
                        .getString("res_strgroupDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelgroup;
    }

    /**
     * This method initializes fJPanelgroup
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelgroup() {
        if (fJPanelgroup == null) {
            try {
                fJPanelgroup = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelgroup.setLayout(layFlowLayout); // Generated
                fJPanelgroup.add(getJLabelgroup(), null); // Generated
                fJPanelgroup.add(getStringTextFieldgroup(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelgroup;
    }

    // end DB field group
    // start DB field language
    /**
     * This method initializes fStringTextFieldlanguage
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldlanguage() {
        if (fStringTextFieldlanguage == null) {
            try {
                fStringTextFieldlanguage = new StringTextField(); // Generated
                fStringTextFieldlanguage
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldlanguage;
    }

    /**
     * This method initializes fJLabellanguage
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellanguage() {
        if (fJLabellanguage == null) {
            try {
                fJLabellanguage = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabellanguage.setText(resBundel
                        .getString("res_strlanguageDisplayName")); // Generated
                fJLabellanguage.setToolTipText(resBundel
                        .getString("res_strlanguageDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabellanguage;
    }

    /**
     * This method initializes fJPanellanguage
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellanguage() {
        if (fJPanellanguage == null) {
            try {
                fJPanellanguage = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellanguage.setLayout(layFlowLayout); // Generated
                fJPanellanguage.add(getJLabellanguage(), null); // Generated
                fJPanellanguage.add(getStringTextFieldlanguage(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellanguage;
    }
    // end DB field language

}
