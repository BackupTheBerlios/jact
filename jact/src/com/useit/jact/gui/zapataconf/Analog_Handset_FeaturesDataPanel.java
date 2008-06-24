package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zapataconf.Analog_Handset_Features;

/**
 * <p>
 * Analog_Handset_FeaturesDataPanel
 * </p>
 * Created : Thu Dec 29 12:22:55 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Analog_Handset_FeaturesDataPanel.java,v 1.5
 *          2005/12/29 19:14:06 urs Exp $
 */
public class Analog_Handset_FeaturesDataPanel extends SimpleDataObjectPanel {
    protected Analog_Handset_Features dataObject;

    // protected Analog_Handset_FeaturesChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Analog_Handset_FeaturesDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAnalog_Handset_FeaturesResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAnalog_Handset_FeaturesResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Analog_Handset_FeaturesResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * Analog_Handset_FeaturesCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFieldadsi, fCustomCheckBoximmediate,
     * fCustomCheckBoxcallwaiting, fCustomCheckBoxcallwaitingcallerid,
     * fCustomCheckBoxthreewaycalling, fCustomCheckBoxtransfer,
     * fCustomCheckBoxcancallforward, fCustomCheckBoxcallreturn,
     * fStringTextFieldcallgroup, fStringTextFieldpickupgroup,
     * fStringTextFielduseincomingcalleridonzaptransfer, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (11) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(11); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneladsi(), null); // Generated
        this.add(getJPanelimmediate(), null); // Generated
        this.add(getJPanelcallwaiting(), null); // Generated
        this.add(getJPanelcallwaitingcallerid(), null); // Generated
        this.add(getJPanelthreewaycalling(), null); // Generated
        this.add(getJPaneltransfer(), null); // Generated
        this.add(getJPanelcancallforward(), null); // Generated
        this.add(getJPanelcallreturn(), null); // Generated
        this.add(getJPanelcallgroup(), null); // Generated
        this.add(getJPanelpickupgroup(), null); // Generated
        this.add(getJPaneluseincomingcalleridonzaptransfer(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldadsi.getDocument().addDocumentListener(textChangeAct);
        fCustomCheckBoximmediate.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxcallwaiting.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxcallwaitingcallerid.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxthreewaycalling.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxtransfer.getDocument()
                .addDocumentListener(textChangeAct);
        fCustomCheckBoxcancallforward.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxcallreturn.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldcallgroup.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldpickupgroup.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielduseincomingcalleridonzaptransfer.getDocument()
                .addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldadsi.setValue(dataObject.getAdsi());
        fCustomCheckBoximmediate.setValue(dataObject.getImmediate());
        fCustomCheckBoxcallwaiting.setValue(dataObject.getCallwaiting());
        fCustomCheckBoxcallwaitingcallerid.setValue(dataObject
                .getCallwaitingcallerid());
        fCustomCheckBoxthreewaycalling
                .setValue(dataObject.getThreewaycalling());
        fCustomCheckBoxtransfer.setValue(dataObject.getTransfer());
        fCustomCheckBoxcancallforward.setValue(dataObject.getCancallforward());
        fCustomCheckBoxcallreturn.setValue(dataObject.getCallreturn());
        fStringTextFieldcallgroup.setValue(dataObject.getCallgroup());
        fStringTextFieldpickupgroup.setValue(dataObject.getPickupgroup());
        fStringTextFielduseincomingcalleridonzaptransfer.setValue(dataObject
                .getUseincomingcalleridonzaptransfer());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setAdsi(fStringTextFieldadsi.getValue());
        dataObject.setImmediate(fCustomCheckBoximmediate.getValue());
        dataObject.setCallwaiting(fCustomCheckBoxcallwaiting.getValue());
        dataObject.setCallwaitingcallerid(fCustomCheckBoxcallwaitingcallerid
                .getValue());
        dataObject
                .setThreewaycalling(fCustomCheckBoxthreewaycalling.getValue());
        dataObject.setTransfer(fCustomCheckBoxtransfer.getValue());
        dataObject.setCancallforward(fCustomCheckBoxcancallforward.getValue());
        dataObject.setCallreturn(fCustomCheckBoxcallreturn.getValue());
        dataObject.setCallgroup(fStringTextFieldcallgroup.getValue());
        dataObject.setPickupgroup(fStringTextFieldpickupgroup.getValue());
        dataObject
                .setUseincomingcalleridonzaptransfer(fStringTextFielduseincomingcalleridonzaptransfer
                        .getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Analog_Handset_Features
     */
    public void setDataObject(Object aAnalog_Handset_Features) {
        // abstractdataObject = (AbstractConfigObject) aAnalog_Handset_Features;
        setDataObject((Analog_Handset_Features) aAnalog_Handset_Features);
        // dataObject = aAnalog_Handset_Features;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Analog_Handset_Features
     */
    public void setDataObject(Analog_Handset_Features aAnalog_Handset_Features) {
        // abstractdataObject = (AbstractConfigObject) aAnalog_Handset_Features;
        dataObject = aAnalog_Handset_Features;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldadsi;

    protected javax.swing.JLabel fJLabeladsi;

    protected javax.swing.JPanel fJPaneladsi;

    protected CustomCheckBox fCustomCheckBoximmediate;

    protected javax.swing.JLabel fJLabelimmediate;

    protected javax.swing.JPanel fJPanelimmediate;

    protected CustomCheckBox fCustomCheckBoxcallwaiting;

    protected javax.swing.JLabel fJLabelcallwaiting;

    protected javax.swing.JPanel fJPanelcallwaiting;

    protected CustomCheckBox fCustomCheckBoxcallwaitingcallerid;

    protected javax.swing.JLabel fJLabelcallwaitingcallerid;

    protected javax.swing.JPanel fJPanelcallwaitingcallerid;

    protected CustomCheckBox fCustomCheckBoxthreewaycalling;

    protected javax.swing.JLabel fJLabelthreewaycalling;

    protected javax.swing.JPanel fJPanelthreewaycalling;

    protected CustomCheckBox fCustomCheckBoxtransfer;

    protected javax.swing.JLabel fJLabeltransfer;

    protected javax.swing.JPanel fJPaneltransfer;

    protected CustomCheckBox fCustomCheckBoxcancallforward;

    protected javax.swing.JLabel fJLabelcancallforward;

    protected javax.swing.JPanel fJPanelcancallforward;

    protected CustomCheckBox fCustomCheckBoxcallreturn;

    protected javax.swing.JLabel fJLabelcallreturn;

    protected javax.swing.JPanel fJPanelcallreturn;

    protected StringTextField fStringTextFieldcallgroup;

    protected javax.swing.JLabel fJLabelcallgroup;

    protected javax.swing.JPanel fJPanelcallgroup;

    protected StringTextField fStringTextFieldpickupgroup;

    protected javax.swing.JLabel fJLabelpickupgroup;

    protected javax.swing.JPanel fJPanelpickupgroup;

    protected StringTextField fStringTextFielduseincomingcalleridonzaptransfer;

    protected javax.swing.JLabel fJLabeluseincomingcalleridonzaptransfer;

    protected javax.swing.JPanel fJPaneluseincomingcalleridonzaptransfer;

    // start DB field adsi
    /**
     * This method initializes fStringTextFieldadsi
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldadsi() {
        if (fStringTextFieldadsi == null) {
            try {
                fStringTextFieldadsi = new StringTextField(); // Generated
                fStringTextFieldadsi.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldadsi;
    }

    /**
     * This method initializes fJLabeladsi
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeladsi() {
        if (fJLabeladsi == null) {
            try {
                fJLabeladsi = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeladsi.setText(resBundel
                        .getString("res_stradsiDisplayName")); // Generated
                fJLabeladsi.setToolTipText(resBundel
                        .getString("res_stradsiDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeladsi;
    }

    /**
     * This method initializes fJPaneladsi
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneladsi() {
        if (fJPaneladsi == null) {
            try {
                fJPaneladsi = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneladsi.setLayout(layFlowLayout); // Generated
                fJPaneladsi.add(getJLabeladsi(), null); // Generated
                fJPaneladsi.add(getStringTextFieldadsi(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneladsi;
    }

    // end DB field adsi
    // start DB field immediate
    /**
     * This method initializes fCustomCheckBoximmediate
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoximmediate() {
        if (fCustomCheckBoximmediate == null) {
            try {
                fCustomCheckBoximmediate = new CustomCheckBox(); // Generated
                fCustomCheckBoximmediate
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoximmediate;
    }

    /**
     * This method initializes fJLabelimmediate
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelimmediate() {
        if (fJLabelimmediate == null) {
            try {
                fJLabelimmediate = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelimmediate.setText(resBundel
                        .getString("res_strimmediateDisplayName")); // Generated
                fJLabelimmediate.setToolTipText(resBundel
                        .getString("res_strimmediateDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelimmediate;
    }

    /**
     * This method initializes fJPanelimmediate
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelimmediate() {
        if (fJPanelimmediate == null) {
            try {
                fJPanelimmediate = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelimmediate.setLayout(layFlowLayout); // Generated
                fJPanelimmediate.add(getJLabelimmediate(), null); // Generated
                fJPanelimmediate.add(getCustomCheckBoximmediate(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelimmediate;
    }

    // end DB field immediate
    // start DB field callwaiting
    /**
     * This method initializes fCustomCheckBoxcallwaiting
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxcallwaiting() {
        if (fCustomCheckBoxcallwaiting == null) {
            try {
                fCustomCheckBoxcallwaiting = new CustomCheckBox(); // Generated
                fCustomCheckBoxcallwaiting
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxcallwaiting;
    }

    /**
     * This method initializes fJLabelcallwaiting
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcallwaiting() {
        if (fJLabelcallwaiting == null) {
            try {
                fJLabelcallwaiting = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcallwaiting.setText(resBundel
                        .getString("res_strcallwaitingDisplayName")); // Generated
                fJLabelcallwaiting.setToolTipText(resBundel
                        .getString("res_strcallwaitingDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcallwaiting;
    }

    /**
     * This method initializes fJPanelcallwaiting
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcallwaiting() {
        if (fJPanelcallwaiting == null) {
            try {
                fJPanelcallwaiting = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcallwaiting.setLayout(layFlowLayout); // Generated
                fJPanelcallwaiting.add(getJLabelcallwaiting(), null); // Generated
                fJPanelcallwaiting.add(getCustomCheckBoxcallwaiting(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcallwaiting;
    }

    // end DB field callwaiting
    // start DB field callwaitingcallerid
    /**
     * This method initializes fCustomCheckBoxcallwaitingcallerid
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxcallwaitingcallerid() {
        if (fCustomCheckBoxcallwaitingcallerid == null) {
            try {
                fCustomCheckBoxcallwaitingcallerid = new CustomCheckBox(); // Generated
                fCustomCheckBoxcallwaitingcallerid
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxcallwaitingcallerid;
    }

    /**
     * This method initializes fJLabelcallwaitingcallerid
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcallwaitingcallerid() {
        if (fJLabelcallwaitingcallerid == null) {
            try {
                fJLabelcallwaitingcallerid = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcallwaitingcallerid.setText(resBundel
                        .getString("res_strcallwaitingcalleridDisplayName")); // Generated
                fJLabelcallwaitingcallerid.setToolTipText(resBundel
                        .getString("res_strcallwaitingcalleridDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcallwaitingcallerid;
    }

    /**
     * This method initializes fJPanelcallwaitingcallerid
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcallwaitingcallerid() {
        if (fJPanelcallwaitingcallerid == null) {
            try {
                fJPanelcallwaitingcallerid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcallwaitingcallerid.setLayout(layFlowLayout); // Generated
                fJPanelcallwaitingcallerid.add(getJLabelcallwaitingcallerid(),
                        null); // Generated
                fJPanelcallwaitingcallerid.add(
                        getCustomCheckBoxcallwaitingcallerid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcallwaitingcallerid;
    }

    // end DB field callwaitingcallerid
    // start DB field threewaycalling
    /**
     * This method initializes fCustomCheckBoxthreewaycalling
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxthreewaycalling() {
        if (fCustomCheckBoxthreewaycalling == null) {
            try {
                fCustomCheckBoxthreewaycalling = new CustomCheckBox(); // Generated
                fCustomCheckBoxthreewaycalling
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxthreewaycalling;
    }

    /**
     * This method initializes fJLabelthreewaycalling
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelthreewaycalling() {
        if (fJLabelthreewaycalling == null) {
            try {
                fJLabelthreewaycalling = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelthreewaycalling.setText(resBundel
                        .getString("res_strthreewaycallingDisplayName")); // Generated
                fJLabelthreewaycalling.setToolTipText(resBundel
                        .getString("res_strthreewaycallingDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelthreewaycalling;
    }

    /**
     * This method initializes fJPanelthreewaycalling
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelthreewaycalling() {
        if (fJPanelthreewaycalling == null) {
            try {
                fJPanelthreewaycalling = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelthreewaycalling.setLayout(layFlowLayout); // Generated
                fJPanelthreewaycalling.add(getJLabelthreewaycalling(), null); // Generated
                fJPanelthreewaycalling.add(getCustomCheckBoxthreewaycalling(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelthreewaycalling;
    }

    // end DB field threewaycalling
    // start DB field transfer
    /**
     * This method initializes fCustomCheckBoxtransfer
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxtransfer() {
        if (fCustomCheckBoxtransfer == null) {
            try {
                fCustomCheckBoxtransfer = new CustomCheckBox(); // Generated
                fCustomCheckBoxtransfer
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxtransfer;
    }

    /**
     * This method initializes fJLabeltransfer
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltransfer() {
        if (fJLabeltransfer == null) {
            try {
                fJLabeltransfer = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltransfer.setText(resBundel
                        .getString("res_strtransferDisplayName")); // Generated
                fJLabeltransfer.setToolTipText(resBundel
                        .getString("res_strtransferDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltransfer;
    }

    /**
     * This method initializes fJPaneltransfer
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltransfer() {
        if (fJPaneltransfer == null) {
            try {
                fJPaneltransfer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltransfer.setLayout(layFlowLayout); // Generated
                fJPaneltransfer.add(getJLabeltransfer(), null); // Generated
                fJPaneltransfer.add(getCustomCheckBoxtransfer(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltransfer;
    }

    // end DB field transfer
    // start DB field cancallforward
    /**
     * This method initializes fCustomCheckBoxcancallforward
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxcancallforward() {
        if (fCustomCheckBoxcancallforward == null) {
            try {
                fCustomCheckBoxcancallforward = new CustomCheckBox(); // Generated
                fCustomCheckBoxcancallforward
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxcancallforward;
    }

    /**
     * This method initializes fJLabelcancallforward
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcancallforward() {
        if (fJLabelcancallforward == null) {
            try {
                fJLabelcancallforward = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcancallforward.setText(resBundel
                        .getString("res_strcancallforwardDisplayName")); // Generated
                fJLabelcancallforward.setToolTipText(resBundel
                        .getString("res_strcancallforwardDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcancallforward;
    }

    /**
     * This method initializes fJPanelcancallforward
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcancallforward() {
        if (fJPanelcancallforward == null) {
            try {
                fJPanelcancallforward = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcancallforward.setLayout(layFlowLayout); // Generated
                fJPanelcancallforward.add(getJLabelcancallforward(), null); // Generated
                fJPanelcancallforward.add(getCustomCheckBoxcancallforward(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcancallforward;
    }

    // end DB field cancallforward
    // start DB field callreturn
    /**
     * This method initializes fCustomCheckBoxcallreturn
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxcallreturn() {
        if (fCustomCheckBoxcallreturn == null) {
            try {
                fCustomCheckBoxcallreturn = new CustomCheckBox(); // Generated
                fCustomCheckBoxcallreturn
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxcallreturn;
    }

    /**
     * This method initializes fJLabelcallreturn
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcallreturn() {
        if (fJLabelcallreturn == null) {
            try {
                fJLabelcallreturn = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcallreturn.setText(resBundel
                        .getString("res_strcallreturnDisplayName")); // Generated
                fJLabelcallreturn.setToolTipText(resBundel
                        .getString("res_strcallreturnDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcallreturn;
    }

    /**
     * This method initializes fJPanelcallreturn
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcallreturn() {
        if (fJPanelcallreturn == null) {
            try {
                fJPanelcallreturn = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcallreturn.setLayout(layFlowLayout); // Generated
                fJPanelcallreturn.add(getJLabelcallreturn(), null); // Generated
                fJPanelcallreturn.add(getCustomCheckBoxcallreturn(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcallreturn;
    }

    // end DB field callreturn
    // start DB field callgroup
    /**
     * This method initializes fStringTextFieldcallgroup
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcallgroup() {
        if (fStringTextFieldcallgroup == null) {
            try {
                fStringTextFieldcallgroup = new StringTextField(); // Generated
                fStringTextFieldcallgroup
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcallgroup;
    }

    /**
     * This method initializes fJLabelcallgroup
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcallgroup() {
        if (fJLabelcallgroup == null) {
            try {
                fJLabelcallgroup = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcallgroup.setText(resBundel
                        .getString("res_strcallgroupDisplayName")); // Generated
                fJLabelcallgroup.setToolTipText(resBundel
                        .getString("res_strcallgroupDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcallgroup;
    }

    /**
     * This method initializes fJPanelcallgroup
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcallgroup() {
        if (fJPanelcallgroup == null) {
            try {
                fJPanelcallgroup = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcallgroup.setLayout(layFlowLayout); // Generated
                fJPanelcallgroup.add(getJLabelcallgroup(), null); // Generated
                fJPanelcallgroup.add(getStringTextFieldcallgroup(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcallgroup;
    }

    // end DB field callgroup
    // start DB field pickupgroup
    /**
     * This method initializes fStringTextFieldpickupgroup
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpickupgroup() {
        if (fStringTextFieldpickupgroup == null) {
            try {
                fStringTextFieldpickupgroup = new StringTextField(); // Generated
                fStringTextFieldpickupgroup
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpickupgroup;
    }

    /**
     * This method initializes fJLabelpickupgroup
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpickupgroup() {
        if (fJLabelpickupgroup == null) {
            try {
                fJLabelpickupgroup = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpickupgroup.setText(resBundel
                        .getString("res_strpickupgroupDisplayName")); // Generated
                fJLabelpickupgroup.setToolTipText(resBundel
                        .getString("res_strpickupgroupDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpickupgroup;
    }

    /**
     * This method initializes fJPanelpickupgroup
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpickupgroup() {
        if (fJPanelpickupgroup == null) {
            try {
                fJPanelpickupgroup = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpickupgroup.setLayout(layFlowLayout); // Generated
                fJPanelpickupgroup.add(getJLabelpickupgroup(), null); // Generated
                fJPanelpickupgroup.add(getStringTextFieldpickupgroup(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpickupgroup;
    }

    // end DB field pickupgroup
    // start DB field useincomingcalleridonzaptransfer
    /**
     * This method initializes fStringTextFielduseincomingcalleridonzaptransfer
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielduseincomingcalleridonzaptransfer() {
        if (fStringTextFielduseincomingcalleridonzaptransfer == null) {
            try {
                fStringTextFielduseincomingcalleridonzaptransfer = new StringTextField(); // Generated
                fStringTextFielduseincomingcalleridonzaptransfer
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielduseincomingcalleridonzaptransfer;
    }

    /**
     * This method initializes fJLabeluseincomingcalleridonzaptransfer
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeluseincomingcalleridonzaptransfer() {
        if (fJLabeluseincomingcalleridonzaptransfer == null) {
            try {
                fJLabeluseincomingcalleridonzaptransfer = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeluseincomingcalleridonzaptransfer
                        .setText(resBundel
                                .getString("res_struseincomingcalleridonzaptransferDisplayName")); // Generated
                fJLabeluseincomingcalleridonzaptransfer
                        .setToolTipText(resBundel
                                .getString("res_struseincomingcalleridonzaptransferDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeluseincomingcalleridonzaptransfer;
    }

    /**
     * This method initializes fJPaneluseincomingcalleridonzaptransfer
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneluseincomingcalleridonzaptransfer() {
        if (fJPaneluseincomingcalleridonzaptransfer == null) {
            try {
                fJPaneluseincomingcalleridonzaptransfer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneluseincomingcalleridonzaptransfer
                        .setLayout(layFlowLayout); // Generated
                fJPaneluseincomingcalleridonzaptransfer.add(
                        getJLabeluseincomingcalleridonzaptransfer(), null); // Generated
                fJPaneluseincomingcalleridonzaptransfer.add(
                        getStringTextFielduseincomingcalleridonzaptransfer(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneluseincomingcalleridonzaptransfer;
    }
    // end DB field useincomingcalleridonzaptransfer

}
