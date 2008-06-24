package com.useit.jact.gui.misdnconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.JEnumComboboxDialplan;
import com.useit.jact.gui.widgets.JEnumComboboxPresentation;
import com.useit.jact.gui.widgets.PbxContextTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.misdnconf.MisdnSections;

/**
 * <p>
 * MisdnSectionsDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:06 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnSectionsDataPanel.java,v 1.7 2005/12/29
 *          19:14:19 urs Exp $
 */
public class MisdnSectionsDataPanel extends SimpleDataObjectPanel {
    protected MisdnSections dataObject;

    // protected MisdnSectionsChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdnSectionsDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdnSectionsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdnSectionsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdnSectionsResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * MisdnSectionsCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fPbxContextTextFieldcontext, fStringTextFieldlanguage,
     * fStringTextFieldnationalprefix, fStringTextFieldinternationalprefix,
     * fIntegerTextFieldrxgain, fIntegerTextFieldtxgain,
     * fCustomCheckBoxte_choose_channel, fCustomCheckBoxearly_bconnect,
     * fJEnumComboboxDialplandialplan, fCustomCheckBoxuse_callingpres,
     * fCustomCheckBoxalways_immediate, fCustomCheckBoximmediate,
     * fCustomCheckBoxhold_allowed, fStringTextFieldpickgroup,
     * fStringTextFieldcallgroup, fJEnumComboboxPresentationpresentation,
     * fCustomCheckBoxechocancel, fCustomCheckBoxechocancelwhenbridged,
     * fStringTextFieldechotraining, }; dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (20) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(20); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPanellanguage(), null); // Generated
        this.add(getJPanelnationalprefix(), null); // Generated
        this.add(getJPanelinternationalprefix(), null); // Generated
        this.add(getJPanelrxgain(), null); // Generated
        this.add(getJPaneltxgain(), null); // Generated
        this.add(getJPanelte_choose_channel(), null); // Generated
        this.add(getJPanelearly_bconnect(), null); // Generated
        this.add(getJPaneldialplan(), null); // Generated
        this.add(getJPaneluse_callingpres(), null); // Generated
        this.add(getJPanelalways_immediate(), null); // Generated
        this.add(getJPanelimmediate(), null); // Generated
        this.add(getJPanelhold_allowed(), null); // Generated
        this.add(getJPanelpickgroup(), null); // Generated
        this.add(getJPanelcallgroup(), null); // Generated
        this.add(getJPanelpresentation(), null); // Generated
        this.add(getJPanelechocancel(), null); // Generated
        this.add(getJPanelechocancelwhenbridged(), null); // Generated
        this.add(getJPanelechotraining(), null); // Generated
        this.add(getJPanelsectionname(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fPbxContextTextFieldcontext.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldlanguage.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldnationalprefix.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldinternationalprefix.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldrxgain.getDocument()
                .addDocumentListener(textChangeAct);
        fIntegerTextFieldtxgain.getDocument()
                .addDocumentListener(textChangeAct);
        fCustomCheckBoxte_choose_channel.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxearly_bconnect.getDocument().addDocumentListener(
                textChangeAct);
        fJEnumComboboxDialplandialplan.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxuse_callingpres.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxalways_immediate.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoximmediate.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxhold_allowed.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldpickgroup.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldcallgroup.getDocument().addDocumentListener(
                textChangeAct);
        fJEnumComboboxPresentationpresentation.getDocument()
                .addDocumentListener(textChangeAct);
        fCustomCheckBoxechocancel.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxechocancelwhenbridged.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldechotraining.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldsectionname.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fPbxContextTextFieldcontext.setValue(dataObject.getContext());
        fStringTextFieldlanguage.setValue(dataObject.getLanguage());
        fStringTextFieldnationalprefix.setValue(dataObject.getNationalprefix());
        fStringTextFieldinternationalprefix.setValue(dataObject
                .getInternationalprefix());
        fIntegerTextFieldrxgain.setValue(dataObject.getRxgain());
        fIntegerTextFieldtxgain.setValue(dataObject.getTxgain());
        fCustomCheckBoxte_choose_channel.setValue(dataObject
                .getTe_choose_channel());
        fCustomCheckBoxearly_bconnect.setValue(dataObject.getEarly_bconnect());
        fJEnumComboboxDialplandialplan.setValue(dataObject.getDialplan());
        fCustomCheckBoxuse_callingpres
                .setValue(dataObject.getUse_callingpres());
        fCustomCheckBoxalways_immediate.setValue(dataObject
                .getAlways_immediate());
        fCustomCheckBoximmediate.setValue(dataObject.getImmediate());
        fCustomCheckBoxhold_allowed.setValue(dataObject.getHold_allowed());
        fStringTextFieldpickgroup.setValue(dataObject.getPickgroup());
        fStringTextFieldcallgroup.setValue(dataObject.getCallgroup());
        fJEnumComboboxPresentationpresentation.setValue(dataObject
                .getPresentation());
        fCustomCheckBoxechocancel.setValue(dataObject.getEchocancel());
        fCustomCheckBoxechocancelwhenbridged.setValue(dataObject
                .getEchocancelwhenbridged());
        fStringTextFieldechotraining.setValue(dataObject.getEchotraining());
        fStringTextFieldsectionname.setValue(dataObject.getSectionname());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setContext(fPbxContextTextFieldcontext.getValue());
        dataObject.setLanguage(fStringTextFieldlanguage.getValue());
        dataObject.setNationalprefix(fStringTextFieldnationalprefix.getValue());
        dataObject.setInternationalprefix(fStringTextFieldinternationalprefix
                .getValue());
        dataObject.setRxgain(fIntegerTextFieldrxgain.getValue());
        dataObject.setTxgain(fIntegerTextFieldtxgain.getValue());
        dataObject.setTe_choose_channel(fCustomCheckBoxte_choose_channel
                .getValue());
        dataObject.setEarly_bconnect(fCustomCheckBoxearly_bconnect.getValue());
        dataObject.setDialplan(fJEnumComboboxDialplandialplan.getValue());
        dataObject
                .setUse_callingpres(fCustomCheckBoxuse_callingpres.getValue());
        dataObject.setAlways_immediate(fCustomCheckBoxalways_immediate
                .getValue());
        dataObject.setImmediate(fCustomCheckBoximmediate.getValue());
        dataObject.setHold_allowed(fCustomCheckBoxhold_allowed.getValue());
        dataObject.setPickgroup(fStringTextFieldpickgroup.getValue());
        dataObject.setCallgroup(fStringTextFieldcallgroup.getValue());
        dataObject.setPresentation(fJEnumComboboxPresentationpresentation
                .getValue());
        dataObject.setEchocancel(fCustomCheckBoxechocancel.getValue());
        dataObject
                .setEchocancelwhenbridged(fCustomCheckBoxechocancelwhenbridged
                        .getValue());
        dataObject.setEchotraining(fStringTextFieldechotraining.getValue());
        dataObject.setSectionname(fStringTextFieldsectionname.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param MisdnSections
     */
    public void setDataObject(Object aMisdnSections) {
        // abstractdataObject = (AbstractConfigObject) aMisdnSections;
        setDataObject((MisdnSections) aMisdnSections);
        // dataObject = aMisdnSections;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param MisdnSections
     */
    public void setDataObject(MisdnSections aMisdnSections) {
        // abstractdataObject = (AbstractConfigObject) aMisdnSections;
        dataObject = aMisdnSections;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected PbxContextTextField fPbxContextTextFieldcontext;

    protected javax.swing.JLabel fJLabelcontext;

    protected javax.swing.JPanel fJPanelcontext;

    protected StringTextField fStringTextFieldlanguage;

    protected javax.swing.JLabel fJLabellanguage;

    protected javax.swing.JPanel fJPanellanguage;

    protected StringTextField fStringTextFieldnationalprefix;

    protected javax.swing.JLabel fJLabelnationalprefix;

    protected javax.swing.JPanel fJPanelnationalprefix;

    protected StringTextField fStringTextFieldinternationalprefix;

    protected javax.swing.JLabel fJLabelinternationalprefix;

    protected javax.swing.JPanel fJPanelinternationalprefix;

    protected IntegerTextField fIntegerTextFieldrxgain;

    protected javax.swing.JLabel fJLabelrxgain;

    protected javax.swing.JPanel fJPanelrxgain;

    protected IntegerTextField fIntegerTextFieldtxgain;

    protected javax.swing.JLabel fJLabeltxgain;

    protected javax.swing.JPanel fJPaneltxgain;

    protected CustomCheckBox fCustomCheckBoxte_choose_channel;

    protected javax.swing.JLabel fJLabelte_choose_channel;

    protected javax.swing.JPanel fJPanelte_choose_channel;

    protected CustomCheckBox fCustomCheckBoxearly_bconnect;

    protected javax.swing.JLabel fJLabelearly_bconnect;

    protected javax.swing.JPanel fJPanelearly_bconnect;

    protected JEnumComboboxDialplan fJEnumComboboxDialplandialplan;

    protected javax.swing.JLabel fJLabeldialplan;

    protected javax.swing.JPanel fJPaneldialplan;

    protected CustomCheckBox fCustomCheckBoxuse_callingpres;

    protected javax.swing.JLabel fJLabeluse_callingpres;

    protected javax.swing.JPanel fJPaneluse_callingpres;

    protected CustomCheckBox fCustomCheckBoxalways_immediate;

    protected javax.swing.JLabel fJLabelalways_immediate;

    protected javax.swing.JPanel fJPanelalways_immediate;

    protected CustomCheckBox fCustomCheckBoximmediate;

    protected javax.swing.JLabel fJLabelimmediate;

    protected javax.swing.JPanel fJPanelimmediate;

    protected CustomCheckBox fCustomCheckBoxhold_allowed;

    protected javax.swing.JLabel fJLabelhold_allowed;

    protected javax.swing.JPanel fJPanelhold_allowed;

    protected StringTextField fStringTextFieldpickgroup;

    protected javax.swing.JLabel fJLabelpickgroup;

    protected javax.swing.JPanel fJPanelpickgroup;

    protected StringTextField fStringTextFieldcallgroup;

    protected javax.swing.JLabel fJLabelcallgroup;

    protected javax.swing.JPanel fJPanelcallgroup;

    protected JEnumComboboxPresentation fJEnumComboboxPresentationpresentation;

    protected javax.swing.JLabel fJLabelpresentation;

    protected javax.swing.JPanel fJPanelpresentation;

    protected CustomCheckBox fCustomCheckBoxechocancel;

    protected javax.swing.JLabel fJLabelechocancel;

    protected javax.swing.JPanel fJPanelechocancel;

    protected CustomCheckBox fCustomCheckBoxechocancelwhenbridged;

    protected javax.swing.JLabel fJLabelechocancelwhenbridged;

    protected javax.swing.JPanel fJPanelechocancelwhenbridged;

    protected StringTextField fStringTextFieldechotraining;

    protected javax.swing.JLabel fJLabelechotraining;

    protected javax.swing.JPanel fJPanelechotraining;

    protected StringTextField fStringTextFieldsectionname;

    protected javax.swing.JLabel fJLabelsectionname;

    protected javax.swing.JPanel fJPanelsectionname;

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
    // start DB field nationalprefix
    /**
     * This method initializes fStringTextFieldnationalprefix
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldnationalprefix() {
        if (fStringTextFieldnationalprefix == null) {
            try {
                fStringTextFieldnationalprefix = new StringTextField(); // Generated
                fStringTextFieldnationalprefix
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldnationalprefix;
    }

    /**
     * This method initializes fJLabelnationalprefix
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelnationalprefix() {
        if (fJLabelnationalprefix == null) {
            try {
                fJLabelnationalprefix = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelnationalprefix.setText(resBundel
                        .getString("res_strnationalprefixDisplayName")); // Generated
                fJLabelnationalprefix.setToolTipText(resBundel
                        .getString("res_strnationalprefixDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelnationalprefix;
    }

    /**
     * This method initializes fJPanelnationalprefix
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelnationalprefix() {
        if (fJPanelnationalprefix == null) {
            try {
                fJPanelnationalprefix = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelnationalprefix.setLayout(layFlowLayout); // Generated
                fJPanelnationalprefix.add(getJLabelnationalprefix(), null); // Generated
                fJPanelnationalprefix.add(getStringTextFieldnationalprefix(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelnationalprefix;
    }

    // end DB field nationalprefix
    // start DB field internationalprefix
    /**
     * This method initializes fStringTextFieldinternationalprefix
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldinternationalprefix() {
        if (fStringTextFieldinternationalprefix == null) {
            try {
                fStringTextFieldinternationalprefix = new StringTextField(); // Generated
                fStringTextFieldinternationalprefix
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldinternationalprefix;
    }

    /**
     * This method initializes fJLabelinternationalprefix
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelinternationalprefix() {
        if (fJLabelinternationalprefix == null) {
            try {
                fJLabelinternationalprefix = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelinternationalprefix.setText(resBundel
                        .getString("res_strinternationalprefixDisplayName")); // Generated
                fJLabelinternationalprefix.setToolTipText(resBundel
                        .getString("res_strinternationalprefixDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelinternationalprefix;
    }

    /**
     * This method initializes fJPanelinternationalprefix
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelinternationalprefix() {
        if (fJPanelinternationalprefix == null) {
            try {
                fJPanelinternationalprefix = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelinternationalprefix.setLayout(layFlowLayout); // Generated
                fJPanelinternationalprefix.add(getJLabelinternationalprefix(),
                        null); // Generated
                fJPanelinternationalprefix.add(
                        getStringTextFieldinternationalprefix(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelinternationalprefix;
    }

    // end DB field internationalprefix
    // start DB field rxgain
    /**
     * This method initializes fIntegerTextFieldrxgain
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldrxgain() {
        if (fIntegerTextFieldrxgain == null) {
            try {
                fIntegerTextFieldrxgain = new IntegerTextField(); // Generated
                fIntegerTextFieldrxgain
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldrxgain;
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
                fJPanelrxgain.add(getIntegerTextFieldrxgain(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrxgain;
    }

    // end DB field rxgain
    // start DB field txgain
    /**
     * This method initializes fIntegerTextFieldtxgain
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldtxgain() {
        if (fIntegerTextFieldtxgain == null) {
            try {
                fIntegerTextFieldtxgain = new IntegerTextField(); // Generated
                fIntegerTextFieldtxgain
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldtxgain;
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
                fJPaneltxgain.add(getIntegerTextFieldtxgain(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltxgain;
    }

    // end DB field txgain
    // start DB field te_choose_channel
    /**
     * This method initializes fCustomCheckBoxte_choose_channel
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxte_choose_channel() {
        if (fCustomCheckBoxte_choose_channel == null) {
            try {
                fCustomCheckBoxte_choose_channel = new CustomCheckBox(); // Generated
                fCustomCheckBoxte_choose_channel
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxte_choose_channel;
    }

    /**
     * This method initializes fJLabelte_choose_channel
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelte_choose_channel() {
        if (fJLabelte_choose_channel == null) {
            try {
                fJLabelte_choose_channel = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelte_choose_channel.setText(resBundel
                        .getString("res_strte_choose_channelDisplayName")); // Generated
                fJLabelte_choose_channel.setToolTipText(resBundel
                        .getString("res_strte_choose_channelDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelte_choose_channel;
    }

    /**
     * This method initializes fJPanelte_choose_channel
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelte_choose_channel() {
        if (fJPanelte_choose_channel == null) {
            try {
                fJPanelte_choose_channel = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelte_choose_channel.setLayout(layFlowLayout); // Generated
                fJPanelte_choose_channel
                        .add(getJLabelte_choose_channel(), null); // Generated
                fJPanelte_choose_channel.add(
                        getCustomCheckBoxte_choose_channel(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelte_choose_channel;
    }

    // end DB field te_choose_channel
    // start DB field early_bconnect
    /**
     * This method initializes fCustomCheckBoxearly_bconnect
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxearly_bconnect() {
        if (fCustomCheckBoxearly_bconnect == null) {
            try {
                fCustomCheckBoxearly_bconnect = new CustomCheckBox(); // Generated
                fCustomCheckBoxearly_bconnect
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxearly_bconnect;
    }

    /**
     * This method initializes fJLabelearly_bconnect
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelearly_bconnect() {
        if (fJLabelearly_bconnect == null) {
            try {
                fJLabelearly_bconnect = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelearly_bconnect.setText(resBundel
                        .getString("res_strearly_bconnectDisplayName")); // Generated
                fJLabelearly_bconnect.setToolTipText(resBundel
                        .getString("res_strearly_bconnectDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelearly_bconnect;
    }

    /**
     * This method initializes fJPanelearly_bconnect
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelearly_bconnect() {
        if (fJPanelearly_bconnect == null) {
            try {
                fJPanelearly_bconnect = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelearly_bconnect.setLayout(layFlowLayout); // Generated
                fJPanelearly_bconnect.add(getJLabelearly_bconnect(), null); // Generated
                fJPanelearly_bconnect.add(getCustomCheckBoxearly_bconnect(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelearly_bconnect;
    }

    // end DB field early_bconnect
    // start DB field dialplan
    /**
     * This method initializes fJEnumComboboxDialplandialplan
     * 
     * @return JEnumComboboxDialplan
     */
    public JEnumComboboxDialplan getJEnumComboboxDialplandialplan() {
        if (fJEnumComboboxDialplandialplan == null) {
            try {
                fJEnumComboboxDialplandialplan = new JEnumComboboxDialplan(); // Generated
                fJEnumComboboxDialplandialplan
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJEnumComboboxDialplandialplan;
    }

    /**
     * This method initializes fJLabeldialplan
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldialplan() {
        if (fJLabeldialplan == null) {
            try {
                fJLabeldialplan = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldialplan.setText(resBundel
                        .getString("res_strdialplanDisplayName")); // Generated
                fJLabeldialplan.setToolTipText(resBundel
                        .getString("res_strdialplanDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldialplan;
    }

    /**
     * This method initializes fJPaneldialplan
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldialplan() {
        if (fJPaneldialplan == null) {
            try {
                fJPaneldialplan = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldialplan.setLayout(layFlowLayout); // Generated
                fJPaneldialplan.add(getJLabeldialplan(), null); // Generated
                fJPaneldialplan.add(getJEnumComboboxDialplandialplan(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldialplan;
    }

    // end DB field dialplan
    // start DB field use_callingpres
    /**
     * This method initializes fCustomCheckBoxuse_callingpres
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxuse_callingpres() {
        if (fCustomCheckBoxuse_callingpres == null) {
            try {
                fCustomCheckBoxuse_callingpres = new CustomCheckBox(); // Generated
                fCustomCheckBoxuse_callingpres
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxuse_callingpres;
    }

    /**
     * This method initializes fJLabeluse_callingpres
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeluse_callingpres() {
        if (fJLabeluse_callingpres == null) {
            try {
                fJLabeluse_callingpres = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeluse_callingpres.setText(resBundel
                        .getString("res_struse_callingpresDisplayName")); // Generated
                fJLabeluse_callingpres.setToolTipText(resBundel
                        .getString("res_struse_callingpresDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeluse_callingpres;
    }

    /**
     * This method initializes fJPaneluse_callingpres
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneluse_callingpres() {
        if (fJPaneluse_callingpres == null) {
            try {
                fJPaneluse_callingpres = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneluse_callingpres.setLayout(layFlowLayout); // Generated
                fJPaneluse_callingpres.add(getJLabeluse_callingpres(), null); // Generated
                fJPaneluse_callingpres.add(getCustomCheckBoxuse_callingpres(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneluse_callingpres;
    }

    // end DB field use_callingpres
    // start DB field always_immediate
    /**
     * This method initializes fCustomCheckBoxalways_immediate
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxalways_immediate() {
        if (fCustomCheckBoxalways_immediate == null) {
            try {
                fCustomCheckBoxalways_immediate = new CustomCheckBox(); // Generated
                fCustomCheckBoxalways_immediate
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxalways_immediate;
    }

    /**
     * This method initializes fJLabelalways_immediate
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelalways_immediate() {
        if (fJLabelalways_immediate == null) {
            try {
                fJLabelalways_immediate = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelalways_immediate.setText(resBundel
                        .getString("res_stralways_immediateDisplayName")); // Generated
                fJLabelalways_immediate.setToolTipText(resBundel
                        .getString("res_stralways_immediateDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelalways_immediate;
    }

    /**
     * This method initializes fJPanelalways_immediate
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelalways_immediate() {
        if (fJPanelalways_immediate == null) {
            try {
                fJPanelalways_immediate = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelalways_immediate.setLayout(layFlowLayout); // Generated
                fJPanelalways_immediate.add(getJLabelalways_immediate(), null); // Generated
                fJPanelalways_immediate.add(
                        getCustomCheckBoxalways_immediate(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelalways_immediate;
    }

    // end DB field always_immediate
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
    // start DB field hold_allowed
    /**
     * This method initializes fCustomCheckBoxhold_allowed
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxhold_allowed() {
        if (fCustomCheckBoxhold_allowed == null) {
            try {
                fCustomCheckBoxhold_allowed = new CustomCheckBox(); // Generated
                fCustomCheckBoxhold_allowed
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxhold_allowed;
    }

    /**
     * This method initializes fJLabelhold_allowed
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelhold_allowed() {
        if (fJLabelhold_allowed == null) {
            try {
                fJLabelhold_allowed = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelhold_allowed.setText(resBundel
                        .getString("res_strhold_allowedDisplayName")); // Generated
                fJLabelhold_allowed.setToolTipText(resBundel
                        .getString("res_strhold_allowedDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelhold_allowed;
    }

    /**
     * This method initializes fJPanelhold_allowed
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelhold_allowed() {
        if (fJPanelhold_allowed == null) {
            try {
                fJPanelhold_allowed = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelhold_allowed.setLayout(layFlowLayout); // Generated
                fJPanelhold_allowed.add(getJLabelhold_allowed(), null); // Generated
                fJPanelhold_allowed.add(getCustomCheckBoxhold_allowed(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelhold_allowed;
    }

    // end DB field hold_allowed
    // start DB field pickgroup
    /**
     * This method initializes fStringTextFieldpickgroup
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpickgroup() {
        if (fStringTextFieldpickgroup == null) {
            try {
                fStringTextFieldpickgroup = new StringTextField(); // Generated
                fStringTextFieldpickgroup
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpickgroup;
    }

    /**
     * This method initializes fJLabelpickgroup
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpickgroup() {
        if (fJLabelpickgroup == null) {
            try {
                fJLabelpickgroup = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpickgroup.setText(resBundel
                        .getString("res_strpickgroupDisplayName")); // Generated
                fJLabelpickgroup.setToolTipText(resBundel
                        .getString("res_strpickgroupDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpickgroup;
    }

    /**
     * This method initializes fJPanelpickgroup
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpickgroup() {
        if (fJPanelpickgroup == null) {
            try {
                fJPanelpickgroup = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpickgroup.setLayout(layFlowLayout); // Generated
                fJPanelpickgroup.add(getJLabelpickgroup(), null); // Generated
                fJPanelpickgroup.add(getStringTextFieldpickgroup(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpickgroup;
    }

    // end DB field pickgroup
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
    // start DB field presentation
    /**
     * This method initializes fJEnumComboboxPresentationpresentation
     * 
     * @return JEnumComboboxPresentation
     */
    public JEnumComboboxPresentation getJEnumComboboxPresentationpresentation() {
        if (fJEnumComboboxPresentationpresentation == null) {
            try {
                fJEnumComboboxPresentationpresentation = new JEnumComboboxPresentation(); // Generated
                fJEnumComboboxPresentationpresentation
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJEnumComboboxPresentationpresentation;
    }

    /**
     * This method initializes fJLabelpresentation
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpresentation() {
        if (fJLabelpresentation == null) {
            try {
                fJLabelpresentation = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpresentation.setText(resBundel
                        .getString("res_strpresentationDisplayName")); // Generated
                fJLabelpresentation.setToolTipText(resBundel
                        .getString("res_strpresentationDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpresentation;
    }

    /**
     * This method initializes fJPanelpresentation
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpresentation() {
        if (fJPanelpresentation == null) {
            try {
                fJPanelpresentation = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpresentation.setLayout(layFlowLayout); // Generated
                fJPanelpresentation.add(getJLabelpresentation(), null); // Generated
                fJPanelpresentation.add(
                        getJEnumComboboxPresentationpresentation(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpresentation;
    }

    // end DB field presentation
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
     * This method initializes fStringTextFieldechotraining
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldechotraining() {
        if (fStringTextFieldechotraining == null) {
            try {
                fStringTextFieldechotraining = new StringTextField(); // Generated
                fStringTextFieldechotraining
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldechotraining;
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
                fJPanelechotraining.add(getStringTextFieldechotraining(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelechotraining;
    }

    // end DB field echotraining
    // start DB field sectionname
    /**
     * This method initializes fStringTextFieldsectionname
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsectionname() {
        if (fStringTextFieldsectionname == null) {
            try {
                fStringTextFieldsectionname = new StringTextField(); // Generated
                fStringTextFieldsectionname
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsectionname;
    }

    /**
     * This method initializes fJLabelsectionname
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsectionname() {
        if (fJLabelsectionname == null) {
            try {
                fJLabelsectionname = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelsectionname.setText(resBundel
                        .getString("res_strsectionnameDisplayName")); // Generated
                fJLabelsectionname.setToolTipText(resBundel
                        .getString("res_strsectionnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelsectionname;
    }

    /**
     * This method initializes fJPanelsectionname
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsectionname() {
        if (fJPanelsectionname == null) {
            try {
                fJPanelsectionname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsectionname.setLayout(layFlowLayout); // Generated
                fJPanelsectionname.add(getJLabelsectionname(), null); // Generated
                fJPanelsectionname.add(getStringTextFieldsectionname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsectionname;
    }
    // end DB field sectionname

}
