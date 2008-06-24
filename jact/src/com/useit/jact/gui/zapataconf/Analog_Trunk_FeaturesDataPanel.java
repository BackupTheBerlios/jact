package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zapataconf.Analog_Trunk_Features;

/**
 * <p>
 * Analog_Trunk_FeaturesDataPanel
 * </p>
 * Created : Thu Dec 29 12:22:59 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Analog_Trunk_FeaturesDataPanel.java,v 1.5
 *          2005/12/29 19:14:06 urs Exp $
 */
public class Analog_Trunk_FeaturesDataPanel extends SimpleDataObjectPanel {
    protected Analog_Trunk_Features dataObject;

    // protected Analog_Trunk_FeaturesChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Analog_Trunk_FeaturesDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAnalog_Trunk_FeaturesResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAnalog_Trunk_FeaturesResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Analog_Trunk_FeaturesResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * Analog_Trunk_FeaturesCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fCustomCheckBoxusedistinctiveringdetection,
     * fStringTextFielddring1, fStringTextFielddring2, fStringTextFielddring3,
     * fStringTextFielddring1context, fStringTextFielddring2context,
     * fStringTextFielddring3context, fCustomCheckBoxbusydetect,
     * fIntegerTextFieldbusycount, fCustomCheckBoxcallprogress,
     * fCustomCheckBoxpulse, }; dataChecker.initChecker(array); }
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
        this.add(getJPanelusedistinctiveringdetection(), null); // Generated
        this.add(getJPaneldring1(), null); // Generated
        this.add(getJPaneldring2(), null); // Generated
        this.add(getJPaneldring3(), null); // Generated
        this.add(getJPaneldring1context(), null); // Generated
        this.add(getJPaneldring2context(), null); // Generated
        this.add(getJPaneldring3context(), null); // Generated
        this.add(getJPanelbusydetect(), null); // Generated
        this.add(getJPanelbusycount(), null); // Generated
        this.add(getJPanelcallprogress(), null); // Generated
        this.add(getJPanelpulse(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fCustomCheckBoxusedistinctiveringdetection.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFielddring1.getDocument().addDocumentListener(textChangeAct);
        fStringTextFielddring2.getDocument().addDocumentListener(textChangeAct);
        fStringTextFielddring3.getDocument().addDocumentListener(textChangeAct);
        fStringTextFielddring1context.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielddring2context.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielddring3context.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxbusydetect.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldbusycount.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxcallprogress.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxpulse.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fCustomCheckBoxusedistinctiveringdetection.setValue(dataObject
                .getUsedistinctiveringdetection());
        fStringTextFielddring1.setValue(dataObject.getDring1());
        fStringTextFielddring2.setValue(dataObject.getDring2());
        fStringTextFielddring3.setValue(dataObject.getDring3());
        fStringTextFielddring1context.setValue(dataObject.getDring1context());
        fStringTextFielddring2context.setValue(dataObject.getDring2context());
        fStringTextFielddring3context.setValue(dataObject.getDring3context());
        fCustomCheckBoxbusydetect.setValue(dataObject.getBusydetect());
        fIntegerTextFieldbusycount.setValue(dataObject.getBusycount());
        fCustomCheckBoxcallprogress.setValue(dataObject.getCallprogress());
        fCustomCheckBoxpulse.setValue(dataObject.getPulse());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject
                .setUsedistinctiveringdetection(fCustomCheckBoxusedistinctiveringdetection
                        .getValue());
        dataObject.setDring1(fStringTextFielddring1.getValue());
        dataObject.setDring2(fStringTextFielddring2.getValue());
        dataObject.setDring3(fStringTextFielddring3.getValue());
        dataObject.setDring1context(fStringTextFielddring1context.getValue());
        dataObject.setDring2context(fStringTextFielddring2context.getValue());
        dataObject.setDring3context(fStringTextFielddring3context.getValue());
        dataObject.setBusydetect(fCustomCheckBoxbusydetect.getValue());
        dataObject.setBusycount(fIntegerTextFieldbusycount.getValue());
        dataObject.setCallprogress(fCustomCheckBoxcallprogress.getValue());
        dataObject.setPulse(fCustomCheckBoxpulse.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Analog_Trunk_Features
     */
    public void setDataObject(Object aAnalog_Trunk_Features) {
        // abstractdataObject = (AbstractConfigObject) aAnalog_Trunk_Features;
        setDataObject((Analog_Trunk_Features) aAnalog_Trunk_Features);
        // dataObject = aAnalog_Trunk_Features;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Analog_Trunk_Features
     */
    public void setDataObject(Analog_Trunk_Features aAnalog_Trunk_Features) {
        // abstractdataObject = (AbstractConfigObject) aAnalog_Trunk_Features;
        dataObject = aAnalog_Trunk_Features;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected CustomCheckBox fCustomCheckBoxusedistinctiveringdetection;

    protected javax.swing.JLabel fJLabelusedistinctiveringdetection;

    protected javax.swing.JPanel fJPanelusedistinctiveringdetection;

    protected StringTextField fStringTextFielddring1;

    protected javax.swing.JLabel fJLabeldring1;

    protected javax.swing.JPanel fJPaneldring1;

    protected StringTextField fStringTextFielddring2;

    protected javax.swing.JLabel fJLabeldring2;

    protected javax.swing.JPanel fJPaneldring2;

    protected StringTextField fStringTextFielddring3;

    protected javax.swing.JLabel fJLabeldring3;

    protected javax.swing.JPanel fJPaneldring3;

    protected StringTextField fStringTextFielddring1context;

    protected javax.swing.JLabel fJLabeldring1context;

    protected javax.swing.JPanel fJPaneldring1context;

    protected StringTextField fStringTextFielddring2context;

    protected javax.swing.JLabel fJLabeldring2context;

    protected javax.swing.JPanel fJPaneldring2context;

    protected StringTextField fStringTextFielddring3context;

    protected javax.swing.JLabel fJLabeldring3context;

    protected javax.swing.JPanel fJPaneldring3context;

    protected CustomCheckBox fCustomCheckBoxbusydetect;

    protected javax.swing.JLabel fJLabelbusydetect;

    protected javax.swing.JPanel fJPanelbusydetect;

    protected IntegerTextField fIntegerTextFieldbusycount;

    protected javax.swing.JLabel fJLabelbusycount;

    protected javax.swing.JPanel fJPanelbusycount;

    protected CustomCheckBox fCustomCheckBoxcallprogress;

    protected javax.swing.JLabel fJLabelcallprogress;

    protected javax.swing.JPanel fJPanelcallprogress;

    protected CustomCheckBox fCustomCheckBoxpulse;

    protected javax.swing.JLabel fJLabelpulse;

    protected javax.swing.JPanel fJPanelpulse;

    // start DB field usedistinctiveringdetection
    /**
     * This method initializes fCustomCheckBoxusedistinctiveringdetection
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxusedistinctiveringdetection() {
        if (fCustomCheckBoxusedistinctiveringdetection == null) {
            try {
                fCustomCheckBoxusedistinctiveringdetection = new CustomCheckBox(); // Generated
                fCustomCheckBoxusedistinctiveringdetection
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxusedistinctiveringdetection;
    }

    /**
     * This method initializes fJLabelusedistinctiveringdetection
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelusedistinctiveringdetection() {
        if (fJLabelusedistinctiveringdetection == null) {
            try {
                fJLabelusedistinctiveringdetection = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelusedistinctiveringdetection
                        .setText(resBundel
                                .getString("res_strusedistinctiveringdetectionDisplayName")); // Generated
                fJLabelusedistinctiveringdetection
                        .setToolTipText(resBundel
                                .getString("res_strusedistinctiveringdetectionDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelusedistinctiveringdetection;
    }

    /**
     * This method initializes fJPanelusedistinctiveringdetection
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelusedistinctiveringdetection() {
        if (fJPanelusedistinctiveringdetection == null) {
            try {
                fJPanelusedistinctiveringdetection = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelusedistinctiveringdetection.setLayout(layFlowLayout); // Generated
                fJPanelusedistinctiveringdetection.add(
                        getJLabelusedistinctiveringdetection(), null); // Generated
                fJPanelusedistinctiveringdetection.add(
                        getCustomCheckBoxusedistinctiveringdetection(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelusedistinctiveringdetection;
    }

    // end DB field usedistinctiveringdetection
    // start DB field dring1
    /**
     * This method initializes fStringTextFielddring1
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddring1() {
        if (fStringTextFielddring1 == null) {
            try {
                fStringTextFielddring1 = new StringTextField(); // Generated
                fStringTextFielddring1.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddring1;
    }

    /**
     * This method initializes fJLabeldring1
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldring1() {
        if (fJLabeldring1 == null) {
            try {
                fJLabeldring1 = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldring1.setText(resBundel
                        .getString("res_strdring1DisplayName")); // Generated
                fJLabeldring1.setToolTipText(resBundel
                        .getString("res_strdring1Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldring1;
    }

    /**
     * This method initializes fJPaneldring1
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldring1() {
        if (fJPaneldring1 == null) {
            try {
                fJPaneldring1 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldring1.setLayout(layFlowLayout); // Generated
                fJPaneldring1.add(getJLabeldring1(), null); // Generated
                fJPaneldring1.add(getStringTextFielddring1(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldring1;
    }

    // end DB field dring1
    // start DB field dring2
    /**
     * This method initializes fStringTextFielddring2
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddring2() {
        if (fStringTextFielddring2 == null) {
            try {
                fStringTextFielddring2 = new StringTextField(); // Generated
                fStringTextFielddring2.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddring2;
    }

    /**
     * This method initializes fJLabeldring2
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldring2() {
        if (fJLabeldring2 == null) {
            try {
                fJLabeldring2 = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldring2.setText(resBundel
                        .getString("res_strdring2DisplayName")); // Generated
                fJLabeldring2.setToolTipText(resBundel
                        .getString("res_strdring2Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldring2;
    }

    /**
     * This method initializes fJPaneldring2
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldring2() {
        if (fJPaneldring2 == null) {
            try {
                fJPaneldring2 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldring2.setLayout(layFlowLayout); // Generated
                fJPaneldring2.add(getJLabeldring2(), null); // Generated
                fJPaneldring2.add(getStringTextFielddring2(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldring2;
    }

    // end DB field dring2
    // start DB field dring3
    /**
     * This method initializes fStringTextFielddring3
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddring3() {
        if (fStringTextFielddring3 == null) {
            try {
                fStringTextFielddring3 = new StringTextField(); // Generated
                fStringTextFielddring3.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddring3;
    }

    /**
     * This method initializes fJLabeldring3
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldring3() {
        if (fJLabeldring3 == null) {
            try {
                fJLabeldring3 = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldring3.setText(resBundel
                        .getString("res_strdring3DisplayName")); // Generated
                fJLabeldring3.setToolTipText(resBundel
                        .getString("res_strdring3Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldring3;
    }

    /**
     * This method initializes fJPaneldring3
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldring3() {
        if (fJPaneldring3 == null) {
            try {
                fJPaneldring3 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldring3.setLayout(layFlowLayout); // Generated
                fJPaneldring3.add(getJLabeldring3(), null); // Generated
                fJPaneldring3.add(getStringTextFielddring3(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldring3;
    }

    // end DB field dring3
    // start DB field dring1context
    /**
     * This method initializes fStringTextFielddring1context
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddring1context() {
        if (fStringTextFielddring1context == null) {
            try {
                fStringTextFielddring1context = new StringTextField(); // Generated
                fStringTextFielddring1context
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddring1context;
    }

    /**
     * This method initializes fJLabeldring1context
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldring1context() {
        if (fJLabeldring1context == null) {
            try {
                fJLabeldring1context = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldring1context.setText(resBundel
                        .getString("res_strdring1contextDisplayName")); // Generated
                fJLabeldring1context.setToolTipText(resBundel
                        .getString("res_strdring1contextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldring1context;
    }

    /**
     * This method initializes fJPaneldring1context
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldring1context() {
        if (fJPaneldring1context == null) {
            try {
                fJPaneldring1context = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldring1context.setLayout(layFlowLayout); // Generated
                fJPaneldring1context.add(getJLabeldring1context(), null); // Generated
                fJPaneldring1context.add(getStringTextFielddring1context(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldring1context;
    }

    // end DB field dring1context
    // start DB field dring2context
    /**
     * This method initializes fStringTextFielddring2context
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddring2context() {
        if (fStringTextFielddring2context == null) {
            try {
                fStringTextFielddring2context = new StringTextField(); // Generated
                fStringTextFielddring2context
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddring2context;
    }

    /**
     * This method initializes fJLabeldring2context
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldring2context() {
        if (fJLabeldring2context == null) {
            try {
                fJLabeldring2context = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldring2context.setText(resBundel
                        .getString("res_strdring2contextDisplayName")); // Generated
                fJLabeldring2context.setToolTipText(resBundel
                        .getString("res_strdring2contextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldring2context;
    }

    /**
     * This method initializes fJPaneldring2context
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldring2context() {
        if (fJPaneldring2context == null) {
            try {
                fJPaneldring2context = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldring2context.setLayout(layFlowLayout); // Generated
                fJPaneldring2context.add(getJLabeldring2context(), null); // Generated
                fJPaneldring2context.add(getStringTextFielddring2context(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldring2context;
    }

    // end DB field dring2context
    // start DB field dring3context
    /**
     * This method initializes fStringTextFielddring3context
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddring3context() {
        if (fStringTextFielddring3context == null) {
            try {
                fStringTextFielddring3context = new StringTextField(); // Generated
                fStringTextFielddring3context
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddring3context;
    }

    /**
     * This method initializes fJLabeldring3context
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldring3context() {
        if (fJLabeldring3context == null) {
            try {
                fJLabeldring3context = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldring3context.setText(resBundel
                        .getString("res_strdring3contextDisplayName")); // Generated
                fJLabeldring3context.setToolTipText(resBundel
                        .getString("res_strdring3contextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldring3context;
    }

    /**
     * This method initializes fJPaneldring3context
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldring3context() {
        if (fJPaneldring3context == null) {
            try {
                fJPaneldring3context = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldring3context.setLayout(layFlowLayout); // Generated
                fJPaneldring3context.add(getJLabeldring3context(), null); // Generated
                fJPaneldring3context.add(getStringTextFielddring3context(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldring3context;
    }

    // end DB field dring3context
    // start DB field busydetect
    /**
     * This method initializes fCustomCheckBoxbusydetect
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxbusydetect() {
        if (fCustomCheckBoxbusydetect == null) {
            try {
                fCustomCheckBoxbusydetect = new CustomCheckBox(); // Generated
                fCustomCheckBoxbusydetect
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxbusydetect;
    }

    /**
     * This method initializes fJLabelbusydetect
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelbusydetect() {
        if (fJLabelbusydetect == null) {
            try {
                fJLabelbusydetect = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelbusydetect.setText(resBundel
                        .getString("res_strbusydetectDisplayName")); // Generated
                fJLabelbusydetect.setToolTipText(resBundel
                        .getString("res_strbusydetectDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelbusydetect;
    }

    /**
     * This method initializes fJPanelbusydetect
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelbusydetect() {
        if (fJPanelbusydetect == null) {
            try {
                fJPanelbusydetect = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelbusydetect.setLayout(layFlowLayout); // Generated
                fJPanelbusydetect.add(getJLabelbusydetect(), null); // Generated
                fJPanelbusydetect.add(getCustomCheckBoxbusydetect(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelbusydetect;
    }

    // end DB field busydetect
    // start DB field busycount
    /**
     * This method initializes fIntegerTextFieldbusycount
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldbusycount() {
        if (fIntegerTextFieldbusycount == null) {
            try {
                fIntegerTextFieldbusycount = new IntegerTextField(); // Generated
                fIntegerTextFieldbusycount
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldbusycount;
    }

    /**
     * This method initializes fJLabelbusycount
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelbusycount() {
        if (fJLabelbusycount == null) {
            try {
                fJLabelbusycount = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelbusycount.setText(resBundel
                        .getString("res_strbusycountDisplayName")); // Generated
                fJLabelbusycount.setToolTipText(resBundel
                        .getString("res_strbusycountDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelbusycount;
    }

    /**
     * This method initializes fJPanelbusycount
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelbusycount() {
        if (fJPanelbusycount == null) {
            try {
                fJPanelbusycount = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelbusycount.setLayout(layFlowLayout); // Generated
                fJPanelbusycount.add(getJLabelbusycount(), null); // Generated
                fJPanelbusycount.add(getIntegerTextFieldbusycount(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelbusycount;
    }

    // end DB field busycount
    // start DB field callprogress
    /**
     * This method initializes fCustomCheckBoxcallprogress
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxcallprogress() {
        if (fCustomCheckBoxcallprogress == null) {
            try {
                fCustomCheckBoxcallprogress = new CustomCheckBox(); // Generated
                fCustomCheckBoxcallprogress
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxcallprogress;
    }

    /**
     * This method initializes fJLabelcallprogress
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcallprogress() {
        if (fJLabelcallprogress == null) {
            try {
                fJLabelcallprogress = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcallprogress.setText(resBundel
                        .getString("res_strcallprogressDisplayName")); // Generated
                fJLabelcallprogress.setToolTipText(resBundel
                        .getString("res_strcallprogressDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcallprogress;
    }

    /**
     * This method initializes fJPanelcallprogress
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcallprogress() {
        if (fJPanelcallprogress == null) {
            try {
                fJPanelcallprogress = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcallprogress.setLayout(layFlowLayout); // Generated
                fJPanelcallprogress.add(getJLabelcallprogress(), null); // Generated
                fJPanelcallprogress.add(getCustomCheckBoxcallprogress(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcallprogress;
    }

    // end DB field callprogress
    // start DB field pulse
    /**
     * This method initializes fCustomCheckBoxpulse
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxpulse() {
        if (fCustomCheckBoxpulse == null) {
            try {
                fCustomCheckBoxpulse = new CustomCheckBox(); // Generated
                fCustomCheckBoxpulse.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxpulse;
    }

    /**
     * This method initializes fJLabelpulse
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpulse() {
        if (fJLabelpulse == null) {
            try {
                fJLabelpulse = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpulse.setText(resBundel
                        .getString("res_strpulseDisplayName")); // Generated
                fJLabelpulse.setToolTipText(resBundel
                        .getString("res_strpulseDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpulse;
    }

    /**
     * This method initializes fJPanelpulse
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpulse() {
        if (fJPanelpulse == null) {
            try {
                fJPanelpulse = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpulse.setLayout(layFlowLayout); // Generated
                fJPanelpulse.add(getJLabelpulse(), null); // Generated
                fJPanelpulse.add(getCustomCheckBoxpulse(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpulse;
    }
    // end DB field pulse

}
