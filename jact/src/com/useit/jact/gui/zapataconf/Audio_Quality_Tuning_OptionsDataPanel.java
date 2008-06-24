package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.FloatTextField;
import com.useit.jact.model.zapataconf.Audio_Quality_Tuning_Options;

/**
 * <p>
 * Audio_Quality_Tuning_OptionsDataPanel
 * </p>
 * Created : Thu Dec 29 12:23:07 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Audio_Quality_Tuning_OptionsDataPanel.java,v
 *          1.5 2005/12/29 19:14:06 urs Exp $
 */
public class Audio_Quality_Tuning_OptionsDataPanel extends
        SimpleDataObjectPanel {
    protected Audio_Quality_Tuning_Options dataObject;

    // protected Audio_Quality_Tuning_OptionsChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Audio_Quality_Tuning_OptionsDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAudio_Quality_Tuning_OptionsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAudio_Quality_Tuning_OptionsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Audio_Quality_Tuning_OptionsResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * Audio_Quality_Tuning_OptionsCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fCustomCheckBoxrelaxdtmf, fCustomCheckBoxechocancel,
     * fCustomCheckBoxechocancelwhenbridged, fCustomCheckBoxechotraining,
     * fFloatTextFieldrxgain, fFloatTextFieldtxgain, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (6) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(6); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelrelaxdtmf(), null); // Generated
        this.add(getJPanelechocancel(), null); // Generated
        this.add(getJPanelechocancelwhenbridged(), null); // Generated
        this.add(getJPanelechotraining(), null); // Generated
        this.add(getJPanelrxgain(), null); // Generated
        this.add(getJPaneltxgain(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fCustomCheckBoxrelaxdtmf.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxechocancel.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxechocancelwhenbridged.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxechotraining.getDocument().addDocumentListener(
                textChangeAct);
        fFloatTextFieldrxgain.getDocument().addDocumentListener(textChangeAct);
        fFloatTextFieldtxgain.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fCustomCheckBoxrelaxdtmf.setValue(dataObject.getRelaxdtmf());
        fCustomCheckBoxechocancel.setValue(dataObject.getEchocancel());
        fCustomCheckBoxechocancelwhenbridged.setValue(dataObject
                .getEchocancelwhenbridged());
        fCustomCheckBoxechotraining.setValue(dataObject.getEchotraining());
        fFloatTextFieldrxgain.setValue(dataObject.getRxgain());
        fFloatTextFieldtxgain.setValue(dataObject.getTxgain());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setRelaxdtmf(fCustomCheckBoxrelaxdtmf.getValue());
        dataObject.setEchocancel(fCustomCheckBoxechocancel.getValue());
        dataObject
                .setEchocancelwhenbridged(fCustomCheckBoxechocancelwhenbridged
                        .getValue());
        dataObject.setEchotraining(fCustomCheckBoxechotraining.getValue());
        dataObject.setRxgain(fFloatTextFieldrxgain.getValue());
        dataObject.setTxgain(fFloatTextFieldtxgain.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Audio_Quality_Tuning_Options
     */
    public void setDataObject(Object aAudio_Quality_Tuning_Options) {
        // abstractdataObject = (AbstractConfigObject)
        // aAudio_Quality_Tuning_Options;
        setDataObject((Audio_Quality_Tuning_Options) aAudio_Quality_Tuning_Options);
        // dataObject = aAudio_Quality_Tuning_Options;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Audio_Quality_Tuning_Options
     */
    public void setDataObject(
            Audio_Quality_Tuning_Options aAudio_Quality_Tuning_Options) {
        // abstractdataObject = (AbstractConfigObject)
        // aAudio_Quality_Tuning_Options;
        dataObject = aAudio_Quality_Tuning_Options;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected CustomCheckBox fCustomCheckBoxrelaxdtmf;

    protected javax.swing.JLabel fJLabelrelaxdtmf;

    protected javax.swing.JPanel fJPanelrelaxdtmf;

    protected CustomCheckBox fCustomCheckBoxechocancel;

    protected javax.swing.JLabel fJLabelechocancel;

    protected javax.swing.JPanel fJPanelechocancel;

    protected CustomCheckBox fCustomCheckBoxechocancelwhenbridged;

    protected javax.swing.JLabel fJLabelechocancelwhenbridged;

    protected javax.swing.JPanel fJPanelechocancelwhenbridged;

    protected CustomCheckBox fCustomCheckBoxechotraining;

    protected javax.swing.JLabel fJLabelechotraining;

    protected javax.swing.JPanel fJPanelechotraining;

    protected FloatTextField fFloatTextFieldrxgain;

    protected javax.swing.JLabel fJLabelrxgain;

    protected javax.swing.JPanel fJPanelrxgain;

    protected FloatTextField fFloatTextFieldtxgain;

    protected javax.swing.JLabel fJLabeltxgain;

    protected javax.swing.JPanel fJPaneltxgain;

    // start DB field relaxdtmf
    /**
     * This method initializes fCustomCheckBoxrelaxdtmf
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxrelaxdtmf() {
        if (fCustomCheckBoxrelaxdtmf == null) {
            try {
                fCustomCheckBoxrelaxdtmf = new CustomCheckBox(); // Generated
                fCustomCheckBoxrelaxdtmf
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxrelaxdtmf;
    }

    /**
     * This method initializes fJLabelrelaxdtmf
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrelaxdtmf() {
        if (fJLabelrelaxdtmf == null) {
            try {
                fJLabelrelaxdtmf = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelrelaxdtmf.setText(resBundel
                        .getString("res_strrelaxdtmfDisplayName")); // Generated
                fJLabelrelaxdtmf.setToolTipText(resBundel
                        .getString("res_strrelaxdtmfDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelrelaxdtmf;
    }

    /**
     * This method initializes fJPanelrelaxdtmf
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrelaxdtmf() {
        if (fJPanelrelaxdtmf == null) {
            try {
                fJPanelrelaxdtmf = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrelaxdtmf.setLayout(layFlowLayout); // Generated
                fJPanelrelaxdtmf.add(getJLabelrelaxdtmf(), null); // Generated
                fJPanelrelaxdtmf.add(getCustomCheckBoxrelaxdtmf(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrelaxdtmf;
    }

    // end DB field relaxdtmf
    // start DB field echocancel
    /**
     * This method initializes fCustomCheckBoxechocancel
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxechocancel() {
        if (fCustomCheckBoxechocancel == null) {
            try {
                fCustomCheckBoxechocancel = new CustomCheckBox(); // Generated
                fCustomCheckBoxechocancel
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxechocancel;
    }

    /**
     * This method initializes fJLabelechocancel
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelechocancel() {
        if (fJLabelechocancel == null) {
            try {
                fJLabelechocancel = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelechocancel.setText(resBundel
                        .getString("res_strechocancelDisplayName")); // Generated
                fJLabelechocancel.setToolTipText(resBundel
                        .getString("res_strechocancelDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelechocancel;
    }

    /**
     * This method initializes fJPanelechocancel
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelechocancel() {
        if (fJPanelechocancel == null) {
            try {
                fJPanelechocancel = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelechocancel.setLayout(layFlowLayout); // Generated
                fJPanelechocancel.add(getJLabelechocancel(), null); // Generated
                fJPanelechocancel.add(getCustomCheckBoxechocancel(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelechocancel;
    }

    // end DB field echocancel
    // start DB field echocancelwhenbridged
    /**
     * This method initializes fCustomCheckBoxechocancelwhenbridged
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxechocancelwhenbridged() {
        if (fCustomCheckBoxechocancelwhenbridged == null) {
            try {
                fCustomCheckBoxechocancelwhenbridged = new CustomCheckBox(); // Generated
                fCustomCheckBoxechocancelwhenbridged
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxechocancelwhenbridged;
    }

    /**
     * This method initializes fJLabelechocancelwhenbridged
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelechocancelwhenbridged() {
        if (fJLabelechocancelwhenbridged == null) {
            try {
                fJLabelechocancelwhenbridged = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelechocancelwhenbridged.setText(resBundel
                        .getString("res_strechocancelwhenbridgedDisplayName")); // Generated
                fJLabelechocancelwhenbridged.setToolTipText(resBundel
                        .getString("res_strechocancelwhenbridgedDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelechocancelwhenbridged;
    }

    /**
     * This method initializes fJPanelechocancelwhenbridged
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelechocancelwhenbridged() {
        if (fJPanelechocancelwhenbridged == null) {
            try {
                fJPanelechocancelwhenbridged = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelechocancelwhenbridged.setLayout(layFlowLayout); // Generated
                fJPanelechocancelwhenbridged.add(
                        getJLabelechocancelwhenbridged(), null); // Generated
                fJPanelechocancelwhenbridged.add(
                        getCustomCheckBoxechocancelwhenbridged(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelechocancelwhenbridged;
    }

    // end DB field echocancelwhenbridged
    // start DB field echotraining
    /**
     * This method initializes fCustomCheckBoxechotraining
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxechotraining() {
        if (fCustomCheckBoxechotraining == null) {
            try {
                fCustomCheckBoxechotraining = new CustomCheckBox(); // Generated
                fCustomCheckBoxechotraining
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxechotraining;
    }

    /**
     * This method initializes fJLabelechotraining
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelechotraining() {
        if (fJLabelechotraining == null) {
            try {
                fJLabelechotraining = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelechotraining.setText(resBundel
                        .getString("res_strechotrainingDisplayName")); // Generated
                fJLabelechotraining.setToolTipText(resBundel
                        .getString("res_strechotrainingDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelechotraining;
    }

    /**
     * This method initializes fJPanelechotraining
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelechotraining() {
        if (fJPanelechotraining == null) {
            try {
                fJPanelechotraining = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelechotraining.setLayout(layFlowLayout); // Generated
                fJPanelechotraining.add(getJLabelechotraining(), null); // Generated
                fJPanelechotraining.add(getCustomCheckBoxechotraining(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelechotraining;
    }

    // end DB field echotraining
    // start DB field rxgain
    /**
     * This method initializes fFloatTextFieldrxgain
     * 
     * @return FloatTextField
     */
    public FloatTextField getFloatTextFieldrxgain() {
        if (fFloatTextFieldrxgain == null) {
            try {
                fFloatTextFieldrxgain = new FloatTextField(); // Generated
                fFloatTextFieldrxgain.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fFloatTextFieldrxgain;
    }

    /**
     * This method initializes fJLabelrxgain
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrxgain() {
        if (fJLabelrxgain == null) {
            try {
                fJLabelrxgain = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelrxgain.setText(resBundel
                        .getString("res_strrxgainDisplayName")); // Generated
                fJLabelrxgain.setToolTipText(resBundel
                        .getString("res_strrxgainDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelrxgain;
    }

    /**
     * This method initializes fJPanelrxgain
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrxgain() {
        if (fJPanelrxgain == null) {
            try {
                fJPanelrxgain = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrxgain.setLayout(layFlowLayout); // Generated
                fJPanelrxgain.add(getJLabelrxgain(), null); // Generated
                fJPanelrxgain.add(getFloatTextFieldrxgain(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrxgain;
    }

    // end DB field rxgain
    // start DB field txgain
    /**
     * This method initializes fFloatTextFieldtxgain
     * 
     * @return FloatTextField
     */
    public FloatTextField getFloatTextFieldtxgain() {
        if (fFloatTextFieldtxgain == null) {
            try {
                fFloatTextFieldtxgain = new FloatTextField(); // Generated
                fFloatTextFieldtxgain.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fFloatTextFieldtxgain;
    }

    /**
     * This method initializes fJLabeltxgain
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltxgain() {
        if (fJLabeltxgain == null) {
            try {
                fJLabeltxgain = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltxgain.setText(resBundel
                        .getString("res_strtxgainDisplayName")); // Generated
                fJLabeltxgain.setToolTipText(resBundel
                        .getString("res_strtxgainDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltxgain;
    }

    /**
     * This method initializes fJPaneltxgain
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltxgain() {
        if (fJPaneltxgain == null) {
            try {
                fJPaneltxgain = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltxgain.setLayout(layFlowLayout); // Generated
                fJPaneltxgain.add(getJLabeltxgain(), null); // Generated
                fJPaneltxgain.add(getFloatTextFieldtxgain(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltxgain;
    }
    // end DB field txgain

}
