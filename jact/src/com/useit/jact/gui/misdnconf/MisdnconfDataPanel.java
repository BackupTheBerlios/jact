package com.useit.jact.gui.misdnconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.PbxContextTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.misdnconf.Misdnconf;

/**
 * <p>
 * MisdnconfDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:03 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnconfDataPanel.java,v 1.7 2005/12/29
 *          19:14:19 urs Exp $
 */
public class MisdnconfDataPanel extends SimpleDataObjectPanel {
    protected Misdnconf dataObject;

    // protected MisdnconfChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdnconfDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdnconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdnconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdnconfResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * MisdnconfCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fIntegerTextFielddebug, fStringTextFieldtracefile,
     * fCustomCheckBoxtrace_calls, fStringTextFieldtrace_dir,
     * fCustomCheckBoxbridging, fCustomCheckBoxstop_tone_after_first_digit,
     * fCustomCheckBoxappend_digits2exten, fCustomCheckBoxl1_info_ok,
     * fCustomCheckBoxclear_l3, fCustomCheckBoxdynamic_crypt,
     * fStringTextFieldcrypt_prefix, fPbxContextTextFieldcontext, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (14) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(14); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneldebug(), null); // Generated
        this.add(getJPaneltracefile(), null); // Generated
        this.add(getJPaneltrace_calls(), null); // Generated
        this.add(getJPaneltrace_dir(), null); // Generated
        this.add(getJPanelbridging(), null); // Generated
        this.add(getJPanelstop_tone_after_first_digit(), null); // Generated
        this.add(getJPanelappend_digits2exten(), null); // Generated
        this.add(getJPanell1_info_ok(), null); // Generated
        this.add(getJPanelclear_l3(), null); // Generated
        this.add(getJPaneldynamic_crypt(), null); // Generated
        this.add(getJPanelcrypt_prefix(), null); // Generated
        this.add(getJPanelfileid(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        // this.add(getJPanelmisdnSections(),null);
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fIntegerTextFielddebug.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldtracefile.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxtrace_calls.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldtrace_dir.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxbridging.getDocument()
                .addDocumentListener(textChangeAct);
        fCustomCheckBoxstop_tone_after_first_digit.getDocument()
                .addDocumentListener(textChangeAct);
        fCustomCheckBoxappend_digits2exten.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxl1_info_ok.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxclear_l3.getDocument()
                .addDocumentListener(textChangeAct);
        fCustomCheckBoxdynamic_crypt.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldcrypt_prefix.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldfileid.getDocument().addDocumentListener(textChangeAct);
        fPbxContextTextFieldcontext.getDocument().addDocumentListener(
                textChangeAct);

        // fJComboBoxmisdnSections.addActionListener(textChangeAct);
    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fIntegerTextFielddebug.setValue(dataObject.getDebug());
        fStringTextFieldtracefile.setValue(dataObject.getTracefile());
        fCustomCheckBoxtrace_calls.setValue(dataObject.getTrace_calls());
        fStringTextFieldtrace_dir.setValue(dataObject.getTrace_dir());
        fCustomCheckBoxbridging.setValue(dataObject.getBridging());
        fCustomCheckBoxstop_tone_after_first_digit.setValue(dataObject
                .getStop_tone_after_first_digit());
        fCustomCheckBoxappend_digits2exten.setValue(dataObject
                .getAppend_digits2exten());
        fCustomCheckBoxl1_info_ok.setValue(dataObject.getL1_info_ok());
        fCustomCheckBoxclear_l3.setValue(dataObject.getClear_l3());
        fCustomCheckBoxdynamic_crypt.setValue(dataObject.getDynamic_crypt());
        fStringTextFieldcrypt_prefix.setValue(dataObject.getCrypt_prefix());
        fStringTextFieldfileid.setValue(dataObject.getFileid());
        fPbxContextTextFieldcontext.setValue(dataObject.getContext());

        // fJComboBoxmisdnSections.setSelectedItem(dataObject.getMisdnSections());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setDebug(fIntegerTextFielddebug.getValue());
        dataObject.setTracefile(fStringTextFieldtracefile.getValue());
        dataObject.setTrace_calls(fCustomCheckBoxtrace_calls.getValue());
        dataObject.setTrace_dir(fStringTextFieldtrace_dir.getValue());
        dataObject.setBridging(fCustomCheckBoxbridging.getValue());
        dataObject
                .setStop_tone_after_first_digit(fCustomCheckBoxstop_tone_after_first_digit
                        .getValue());
        dataObject.setAppend_digits2exten(fCustomCheckBoxappend_digits2exten
                .getValue());
        dataObject.setL1_info_ok(fCustomCheckBoxl1_info_ok.getValue());
        dataObject.setClear_l3(fCustomCheckBoxclear_l3.getValue());
        dataObject.setDynamic_crypt(fCustomCheckBoxdynamic_crypt.getValue());
        dataObject.setCrypt_prefix(fStringTextFieldcrypt_prefix.getValue());
        dataObject.setFileid(fStringTextFieldfileid.getValue());
        dataObject.setContext(fPbxContextTextFieldcontext.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Misdnconf
     */
    public void setDataObject(Object aMisdnconf) {
        // abstractdataObject = (AbstractConfigObject) aMisdnconf;
        setDataObject((Misdnconf) aMisdnconf);
        // dataObject = aMisdnconf;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Misdnconf
     */
    public void setDataObject(Misdnconf aMisdnconf) {
        // abstractdataObject = (AbstractConfigObject) aMisdnconf;
        dataObject = aMisdnconf;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected IntegerTextField fIntegerTextFielddebug;

    protected javax.swing.JLabel fJLabeldebug;

    protected javax.swing.JPanel fJPaneldebug;

    protected StringTextField fStringTextFieldtracefile;

    protected javax.swing.JLabel fJLabeltracefile;

    protected javax.swing.JPanel fJPaneltracefile;

    protected CustomCheckBox fCustomCheckBoxtrace_calls;

    protected javax.swing.JLabel fJLabeltrace_calls;

    protected javax.swing.JPanel fJPaneltrace_calls;

    protected StringTextField fStringTextFieldtrace_dir;

    protected javax.swing.JLabel fJLabeltrace_dir;

    protected javax.swing.JPanel fJPaneltrace_dir;

    protected CustomCheckBox fCustomCheckBoxbridging;

    protected javax.swing.JLabel fJLabelbridging;

    protected javax.swing.JPanel fJPanelbridging;

    protected CustomCheckBox fCustomCheckBoxstop_tone_after_first_digit;

    protected javax.swing.JLabel fJLabelstop_tone_after_first_digit;

    protected javax.swing.JPanel fJPanelstop_tone_after_first_digit;

    protected CustomCheckBox fCustomCheckBoxappend_digits2exten;

    protected javax.swing.JLabel fJLabelappend_digits2exten;

    protected javax.swing.JPanel fJPanelappend_digits2exten;

    protected CustomCheckBox fCustomCheckBoxl1_info_ok;

    protected javax.swing.JLabel fJLabell1_info_ok;

    protected javax.swing.JPanel fJPanell1_info_ok;

    protected CustomCheckBox fCustomCheckBoxclear_l3;

    protected javax.swing.JLabel fJLabelclear_l3;

    protected javax.swing.JPanel fJPanelclear_l3;

    protected CustomCheckBox fCustomCheckBoxdynamic_crypt;

    protected javax.swing.JLabel fJLabeldynamic_crypt;

    protected javax.swing.JPanel fJPaneldynamic_crypt;

    protected StringTextField fStringTextFieldcrypt_prefix;

    protected javax.swing.JLabel fJLabelcrypt_prefix;

    protected javax.swing.JPanel fJPanelcrypt_prefix;

    protected StringTextField fStringTextFieldfileid;

    protected javax.swing.JLabel fJLabelfileid;

    protected javax.swing.JPanel fJPanelfileid;

    protected PbxContextTextField fPbxContextTextFieldcontext;

    protected javax.swing.JLabel fJLabelcontext;

    protected javax.swing.JPanel fJPanelcontext;

    // start DB field debug
    /**
     * This method initializes fIntegerTextFielddebug
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFielddebug() {
        if (fIntegerTextFielddebug == null) {
            try {
                fIntegerTextFielddebug = new IntegerTextField(); // Generated
                fIntegerTextFielddebug.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFielddebug;
    }

    /**
     * This method initializes fJLabeldebug
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldebug() {
        if (fJLabeldebug == null) {
            try {
                fJLabeldebug = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldebug.setText(resBundel
                        .getString("res_strdebugDisplayName")); // Generated
                fJLabeldebug.setToolTipText(resBundel
                        .getString("res_strdebugDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldebug;
    }

    /**
     * This method initializes fJPaneldebug
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldebug() {
        if (fJPaneldebug == null) {
            try {
                fJPaneldebug = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldebug.setLayout(layFlowLayout); // Generated
                fJPaneldebug.add(getJLabeldebug(), null); // Generated
                fJPaneldebug.add(getIntegerTextFielddebug(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldebug;
    }

    // end DB field debug
    // start DB field tracefile
    /**
     * This method initializes fStringTextFieldtracefile
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtracefile() {
        if (fStringTextFieldtracefile == null) {
            try {
                fStringTextFieldtracefile = new StringTextField(); // Generated
                fStringTextFieldtracefile
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtracefile;
    }

    /**
     * This method initializes fJLabeltracefile
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltracefile() {
        if (fJLabeltracefile == null) {
            try {
                fJLabeltracefile = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltracefile.setText(resBundel
                        .getString("res_strtracefileDisplayName")); // Generated
                fJLabeltracefile.setToolTipText(resBundel
                        .getString("res_strtracefileDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltracefile;
    }

    /**
     * This method initializes fJPaneltracefile
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltracefile() {
        if (fJPaneltracefile == null) {
            try {
                fJPaneltracefile = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltracefile.setLayout(layFlowLayout); // Generated
                fJPaneltracefile.add(getJLabeltracefile(), null); // Generated
                fJPaneltracefile.add(getStringTextFieldtracefile(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltracefile;
    }

    // end DB field tracefile
    // start DB field trace_calls
    /**
     * This method initializes fCustomCheckBoxtrace_calls
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxtrace_calls() {
        if (fCustomCheckBoxtrace_calls == null) {
            try {
                fCustomCheckBoxtrace_calls = new CustomCheckBox(); // Generated
                fCustomCheckBoxtrace_calls
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxtrace_calls;
    }

    /**
     * This method initializes fJLabeltrace_calls
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltrace_calls() {
        if (fJLabeltrace_calls == null) {
            try {
                fJLabeltrace_calls = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltrace_calls.setText(resBundel
                        .getString("res_strtrace_callsDisplayName")); // Generated
                fJLabeltrace_calls.setToolTipText(resBundel
                        .getString("res_strtrace_callsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltrace_calls;
    }

    /**
     * This method initializes fJPaneltrace_calls
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltrace_calls() {
        if (fJPaneltrace_calls == null) {
            try {
                fJPaneltrace_calls = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltrace_calls.setLayout(layFlowLayout); // Generated
                fJPaneltrace_calls.add(getJLabeltrace_calls(), null); // Generated
                fJPaneltrace_calls.add(getCustomCheckBoxtrace_calls(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltrace_calls;
    }

    // end DB field trace_calls
    // start DB field trace_dir
    /**
     * This method initializes fStringTextFieldtrace_dir
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtrace_dir() {
        if (fStringTextFieldtrace_dir == null) {
            try {
                fStringTextFieldtrace_dir = new StringTextField(); // Generated
                fStringTextFieldtrace_dir
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtrace_dir;
    }

    /**
     * This method initializes fJLabeltrace_dir
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltrace_dir() {
        if (fJLabeltrace_dir == null) {
            try {
                fJLabeltrace_dir = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltrace_dir.setText(resBundel
                        .getString("res_strtrace_dirDisplayName")); // Generated
                fJLabeltrace_dir.setToolTipText(resBundel
                        .getString("res_strtrace_dirDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltrace_dir;
    }

    /**
     * This method initializes fJPaneltrace_dir
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltrace_dir() {
        if (fJPaneltrace_dir == null) {
            try {
                fJPaneltrace_dir = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltrace_dir.setLayout(layFlowLayout); // Generated
                fJPaneltrace_dir.add(getJLabeltrace_dir(), null); // Generated
                fJPaneltrace_dir.add(getStringTextFieldtrace_dir(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltrace_dir;
    }

    // end DB field trace_dir
    // start DB field bridging
    /**
     * This method initializes fCustomCheckBoxbridging
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxbridging() {
        if (fCustomCheckBoxbridging == null) {
            try {
                fCustomCheckBoxbridging = new CustomCheckBox(); // Generated
                fCustomCheckBoxbridging
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxbridging;
    }

    /**
     * This method initializes fJLabelbridging
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelbridging() {
        if (fJLabelbridging == null) {
            try {
                fJLabelbridging = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelbridging.setText(resBundel
                        .getString("res_strbridgingDisplayName")); // Generated
                fJLabelbridging.setToolTipText(resBundel
                        .getString("res_strbridgingDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelbridging;
    }

    /**
     * This method initializes fJPanelbridging
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelbridging() {
        if (fJPanelbridging == null) {
            try {
                fJPanelbridging = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelbridging.setLayout(layFlowLayout); // Generated
                fJPanelbridging.add(getJLabelbridging(), null); // Generated
                fJPanelbridging.add(getCustomCheckBoxbridging(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelbridging;
    }

    // end DB field bridging
    // start DB field stop_tone_after_first_digit
    /**
     * This method initializes fCustomCheckBoxstop_tone_after_first_digit
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxstop_tone_after_first_digit() {
        if (fCustomCheckBoxstop_tone_after_first_digit == null) {
            try {
                fCustomCheckBoxstop_tone_after_first_digit = new CustomCheckBox(); // Generated
                fCustomCheckBoxstop_tone_after_first_digit
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxstop_tone_after_first_digit;
    }

    /**
     * This method initializes fJLabelstop_tone_after_first_digit
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelstop_tone_after_first_digit() {
        if (fJLabelstop_tone_after_first_digit == null) {
            try {
                fJLabelstop_tone_after_first_digit = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelstop_tone_after_first_digit
                        .setText(resBundel
                                .getString("res_strstop_tone_after_first_digitDisplayName")); // Generated
                fJLabelstop_tone_after_first_digit
                        .setToolTipText(resBundel
                                .getString("res_strstop_tone_after_first_digitDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelstop_tone_after_first_digit;
    }

    /**
     * This method initializes fJPanelstop_tone_after_first_digit
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelstop_tone_after_first_digit() {
        if (fJPanelstop_tone_after_first_digit == null) {
            try {
                fJPanelstop_tone_after_first_digit = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelstop_tone_after_first_digit.setLayout(layFlowLayout); // Generated
                fJPanelstop_tone_after_first_digit.add(
                        getJLabelstop_tone_after_first_digit(), null); // Generated
                fJPanelstop_tone_after_first_digit.add(
                        getCustomCheckBoxstop_tone_after_first_digit(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelstop_tone_after_first_digit;
    }

    // end DB field stop_tone_after_first_digit
    // start DB field append_digits2exten
    /**
     * This method initializes fCustomCheckBoxappend_digits2exten
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxappend_digits2exten() {
        if (fCustomCheckBoxappend_digits2exten == null) {
            try {
                fCustomCheckBoxappend_digits2exten = new CustomCheckBox(); // Generated
                fCustomCheckBoxappend_digits2exten
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxappend_digits2exten;
    }

    /**
     * This method initializes fJLabelappend_digits2exten
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelappend_digits2exten() {
        if (fJLabelappend_digits2exten == null) {
            try {
                fJLabelappend_digits2exten = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelappend_digits2exten.setText(resBundel
                        .getString("res_strappend_digits2extenDisplayName")); // Generated
                fJLabelappend_digits2exten.setToolTipText(resBundel
                        .getString("res_strappend_digits2extenDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelappend_digits2exten;
    }

    /**
     * This method initializes fJPanelappend_digits2exten
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelappend_digits2exten() {
        if (fJPanelappend_digits2exten == null) {
            try {
                fJPanelappend_digits2exten = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelappend_digits2exten.setLayout(layFlowLayout); // Generated
                fJPanelappend_digits2exten.add(getJLabelappend_digits2exten(),
                        null); // Generated
                fJPanelappend_digits2exten.add(
                        getCustomCheckBoxappend_digits2exten(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelappend_digits2exten;
    }

    // end DB field append_digits2exten
    // start DB field l1_info_ok
    /**
     * This method initializes fCustomCheckBoxl1_info_ok
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxl1_info_ok() {
        if (fCustomCheckBoxl1_info_ok == null) {
            try {
                fCustomCheckBoxl1_info_ok = new CustomCheckBox(); // Generated
                fCustomCheckBoxl1_info_ok
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxl1_info_ok;
    }

    /**
     * This method initializes fJLabell1_info_ok
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabell1_info_ok() {
        if (fJLabell1_info_ok == null) {
            try {
                fJLabell1_info_ok = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabell1_info_ok.setText(resBundel
                        .getString("res_strl1_info_okDisplayName")); // Generated
                fJLabell1_info_ok.setToolTipText(resBundel
                        .getString("res_strl1_info_okDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabell1_info_ok;
    }

    /**
     * This method initializes fJPanell1_info_ok
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanell1_info_ok() {
        if (fJPanell1_info_ok == null) {
            try {
                fJPanell1_info_ok = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanell1_info_ok.setLayout(layFlowLayout); // Generated
                fJPanell1_info_ok.add(getJLabell1_info_ok(), null); // Generated
                fJPanell1_info_ok.add(getCustomCheckBoxl1_info_ok(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanell1_info_ok;
    }

    // end DB field l1_info_ok
    // start DB field clear_l3
    /**
     * This method initializes fCustomCheckBoxclear_l3
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxclear_l3() {
        if (fCustomCheckBoxclear_l3 == null) {
            try {
                fCustomCheckBoxclear_l3 = new CustomCheckBox(); // Generated
                fCustomCheckBoxclear_l3
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxclear_l3;
    }

    /**
     * This method initializes fJLabelclear_l3
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelclear_l3() {
        if (fJLabelclear_l3 == null) {
            try {
                fJLabelclear_l3 = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelclear_l3.setText(resBundel
                        .getString("res_strclear_l3DisplayName")); // Generated
                fJLabelclear_l3.setToolTipText(resBundel
                        .getString("res_strclear_l3Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelclear_l3;
    }

    /**
     * This method initializes fJPanelclear_l3
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelclear_l3() {
        if (fJPanelclear_l3 == null) {
            try {
                fJPanelclear_l3 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelclear_l3.setLayout(layFlowLayout); // Generated
                fJPanelclear_l3.add(getJLabelclear_l3(), null); // Generated
                fJPanelclear_l3.add(getCustomCheckBoxclear_l3(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelclear_l3;
    }

    // end DB field clear_l3
    // start DB field dynamic_crypt
    /**
     * This method initializes fCustomCheckBoxdynamic_crypt
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxdynamic_crypt() {
        if (fCustomCheckBoxdynamic_crypt == null) {
            try {
                fCustomCheckBoxdynamic_crypt = new CustomCheckBox(); // Generated
                fCustomCheckBoxdynamic_crypt
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxdynamic_crypt;
    }

    /**
     * This method initializes fJLabeldynamic_crypt
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldynamic_crypt() {
        if (fJLabeldynamic_crypt == null) {
            try {
                fJLabeldynamic_crypt = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldynamic_crypt.setText(resBundel
                        .getString("res_strdynamic_cryptDisplayName")); // Generated
                fJLabeldynamic_crypt.setToolTipText(resBundel
                        .getString("res_strdynamic_cryptDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldynamic_crypt;
    }

    /**
     * This method initializes fJPaneldynamic_crypt
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldynamic_crypt() {
        if (fJPaneldynamic_crypt == null) {
            try {
                fJPaneldynamic_crypt = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldynamic_crypt.setLayout(layFlowLayout); // Generated
                fJPaneldynamic_crypt.add(getJLabeldynamic_crypt(), null); // Generated
                fJPaneldynamic_crypt
                        .add(getCustomCheckBoxdynamic_crypt(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldynamic_crypt;
    }

    // end DB field dynamic_crypt
    // start DB field crypt_prefix
    /**
     * This method initializes fStringTextFieldcrypt_prefix
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcrypt_prefix() {
        if (fStringTextFieldcrypt_prefix == null) {
            try {
                fStringTextFieldcrypt_prefix = new StringTextField(); // Generated
                fStringTextFieldcrypt_prefix
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcrypt_prefix;
    }

    /**
     * This method initializes fJLabelcrypt_prefix
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcrypt_prefix() {
        if (fJLabelcrypt_prefix == null) {
            try {
                fJLabelcrypt_prefix = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcrypt_prefix.setText(resBundel
                        .getString("res_strcrypt_prefixDisplayName")); // Generated
                fJLabelcrypt_prefix.setToolTipText(resBundel
                        .getString("res_strcrypt_prefixDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcrypt_prefix;
    }

    /**
     * This method initializes fJPanelcrypt_prefix
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcrypt_prefix() {
        if (fJPanelcrypt_prefix == null) {
            try {
                fJPanelcrypt_prefix = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcrypt_prefix.setLayout(layFlowLayout); // Generated
                fJPanelcrypt_prefix.add(getJLabelcrypt_prefix(), null); // Generated
                fJPanelcrypt_prefix.add(getStringTextFieldcrypt_prefix(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcrypt_prefix;
    }

    // end DB field crypt_prefix
    // start DB field fileid
    /**
     * This method initializes fStringTextFieldfileid
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfileid() {
        if (fStringTextFieldfileid == null) {
            try {
                fStringTextFieldfileid = new StringTextField(); // Generated
                fStringTextFieldfileid.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfileid;
    }

    /**
     * This method initializes fJLabelfileid
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfileid() {
        if (fJLabelfileid == null) {
            try {
                fJLabelfileid = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelfileid.setText(resBundel
                        .getString("res_strfileidDisplayName")); // Generated
                fJLabelfileid.setToolTipText(resBundel
                        .getString("res_strfileidDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelfileid;
    }

    /**
     * This method initializes fJPanelfileid
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfileid() {
        if (fJPanelfileid == null) {
            try {
                fJPanelfileid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfileid.setLayout(layFlowLayout); // Generated
                fJPanelfileid.add(getJLabelfileid(), null); // Generated
                fJPanelfileid.add(getStringTextFieldfileid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfileid;
    }

    // end DB field fileid
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

}
