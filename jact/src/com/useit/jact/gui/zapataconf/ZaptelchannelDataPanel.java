package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.JEnumComboboxSignalling;
import com.useit.jact.gui.widgets.PbxContextTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zapataconf.Zaptelchannel;

/**
 * <p>
 * ZaptelchannelDataPanel
 * </p>
 * Created : Thu Dec 29 12:23:09 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelchannelDataPanel.java,v 1.5 2005/12/29
 *          19:14:06 urs Exp $
 */
public class ZaptelchannelDataPanel extends SimpleDataObjectPanel {
    protected Zaptelchannel dataObject;

    // protected ZaptelchannelChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZaptelchannelDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZaptelchannelResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZaptelchannelResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZaptelchannelResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * ZaptelchannelCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fJEnumComboboxSignallingsignalling,
     * fPbxContextTextFieldcontext, fStringTextFieldchannel, };
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
        this.add(getJPanelsignalling(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPanelchannel(), null); // Generated
        // this.add(getJPanelanalog_Handset_Features(),null);
        // this.add(getJPanelanalog_Trunk_Features(),null);
        // this.add(getJPanelaudio_Quality_Tuning_Options(),null);
        // this.add(getJPanelcall_Logging_Options(),null);
        // this.add(getJPanelcaller_ID_Options(),null);
        // this.add(getJPaneliSDN_PRI_Switch(),null);
        // this.add(getJPanelother(),null);
        // this.add(getJPaneltiming_Parameters(),null);
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fJEnumComboboxSignallingsignalling.getDocument().addDocumentListener(
                textChangeAct);
        fPbxContextTextFieldcontext.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldchannel.getDocument()
                .addDocumentListener(textChangeAct);

        // fJComboBoxanalog_Handset_Features.addActionListener(textChangeAct);
        // fJComboBoxanalog_Trunk_Features.addActionListener(textChangeAct);
        // fJComboBoxaudio_Quality_Tuning_Options.addActionListener(textChangeAct);
        // fJComboBoxcall_Logging_Options.addActionListener(textChangeAct);
        // fJComboBoxcaller_ID_Options.addActionListener(textChangeAct);
        // fJComboBoxiSDN_PRI_Switch.addActionListener(textChangeAct);
        // fJComboBoxother.addActionListener(textChangeAct);
        // fJComboBoxtiming_Parameters.addActionListener(textChangeAct);
    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fJEnumComboboxSignallingsignalling.setValue(dataObject.getSignalling());
        fPbxContextTextFieldcontext.setValue(dataObject.getContext());
        fStringTextFieldchannel.setValue(dataObject.getChannel());

        // fJComboBoxanalog_Handset_Features.setSelectedItem(dataObject.getAnalog_Handset_Features());
        // fJComboBoxanalog_Trunk_Features.setSelectedItem(dataObject.getAnalog_Trunk_Features());
        // fJComboBoxaudio_Quality_Tuning_Options.setSelectedItem(dataObject.getAudio_Quality_Tuning_Options());
        // fJComboBoxcall_Logging_Options.setSelectedItem(dataObject.getCall_Logging_Options());
        // fJComboBoxcaller_ID_Options.setSelectedItem(dataObject.getCaller_ID_Options());
        // fJComboBoxiSDN_PRI_Switch.setSelectedItem(dataObject.getISDN_PRI_Switch());
        // fJComboBoxother.setSelectedItem(dataObject.getOther());
        // fJComboBoxtiming_Parameters.setSelectedItem(dataObject.getTiming_Parameters());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setSignalling(fJEnumComboboxSignallingsignalling.getValue());
        dataObject.setContext(fPbxContextTextFieldcontext.getValue());
        dataObject.setChannel(fStringTextFieldchannel.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zaptelchannel
     */
    public void setDataObject(Object aZaptelchannel) {
        // abstractdataObject = (AbstractConfigObject) aZaptelchannel;
        setDataObject((Zaptelchannel) aZaptelchannel);
        // dataObject = aZaptelchannel;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zaptelchannel
     */
    public void setDataObject(Zaptelchannel aZaptelchannel) {
        // abstractdataObject = (AbstractConfigObject) aZaptelchannel;
        dataObject = aZaptelchannel;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected JEnumComboboxSignalling fJEnumComboboxSignallingsignalling;

    protected javax.swing.JLabel fJLabelsignalling;

    protected javax.swing.JPanel fJPanelsignalling;

    protected PbxContextTextField fPbxContextTextFieldcontext;

    protected javax.swing.JLabel fJLabelcontext;

    protected javax.swing.JPanel fJPanelcontext;

    protected StringTextField fStringTextFieldchannel;

    protected javax.swing.JLabel fJLabelchannel;

    protected javax.swing.JPanel fJPanelchannel;

    // start DB field signalling
    /**
     * This method initializes fJEnumComboboxSignallingsignalling
     * 
     * @return JEnumComboboxSignalling
     */
    public JEnumComboboxSignalling getJEnumComboboxSignallingsignalling() {
        if (fJEnumComboboxSignallingsignalling == null) {
            try {
                fJEnumComboboxSignallingsignalling = new JEnumComboboxSignalling(); // Generated
                fJEnumComboboxSignallingsignalling
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJEnumComboboxSignallingsignalling;
    }

    /**
     * This method initializes fJLabelsignalling
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsignalling() {
        if (fJLabelsignalling == null) {
            try {
                fJLabelsignalling = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelsignalling.setText(resBundel
                        .getString("res_strsignallingDisplayName")); // Generated
                fJLabelsignalling.setToolTipText(resBundel
                        .getString("res_strsignallingDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelsignalling;
    }

    /**
     * This method initializes fJPanelsignalling
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsignalling() {
        if (fJPanelsignalling == null) {
            try {
                fJPanelsignalling = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsignalling.setLayout(layFlowLayout); // Generated
                fJPanelsignalling.add(getJLabelsignalling(), null); // Generated
                fJPanelsignalling.add(getJEnumComboboxSignallingsignalling(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsignalling;
    }

    // end DB field signalling
    // start DB field context
    /**
     * This method initializes fPbxContextTextFieldcontext
     * 
     * @return PbxContextTextField
     */
    public PbxContextTextField getPbxContextTextFieldcontext() {
        if (fPbxContextTextFieldcontext == null) {
            try {
                fPbxContextTextFieldcontext = new PbxContextTextField(); // Generated
                fPbxContextTextFieldcontext
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fPbxContextTextFieldcontext;
    }

    /**
     * This method initializes fJLabelcontext
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcontext() {
        if (fJLabelcontext == null) {
            try {
                fJLabelcontext = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcontext.setText(resBundel
                        .getString("res_strcontextDisplayName")); // Generated
                fJLabelcontext.setToolTipText(resBundel
                        .getString("res_strcontextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcontext;
    }

    /**
     * This method initializes fJPanelcontext
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcontext() {
        if (fJPanelcontext == null) {
            try {
                fJPanelcontext = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcontext.setLayout(layFlowLayout); // Generated
                fJPanelcontext.add(getJLabelcontext(), null); // Generated
                fJPanelcontext.add(getPbxContextTextFieldcontext(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcontext;
    }

    // end DB field context
    // start DB field channel
    /**
     * This method initializes fStringTextFieldchannel
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldchannel() {
        if (fStringTextFieldchannel == null) {
            try {
                fStringTextFieldchannel = new StringTextField(); // Generated
                fStringTextFieldchannel
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldchannel;
    }

    /**
     * This method initializes fJLabelchannel
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelchannel() {
        if (fJLabelchannel == null) {
            try {
                fJLabelchannel = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelchannel.setText(resBundel
                        .getString("res_strchannelDisplayName")); // Generated
                fJLabelchannel.setToolTipText(resBundel
                        .getString("res_strchannelDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelchannel;
    }

    /**
     * This method initializes fJPanelchannel
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelchannel() {
        if (fJPanelchannel == null) {
            try {
                fJPanelchannel = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelchannel.setLayout(layFlowLayout); // Generated
                fJPanelchannel.add(getJLabelchannel(), null); // Generated
                fJPanelchannel.add(getStringTextFieldchannel(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelchannel;
    }
    // end DB field channel

}
