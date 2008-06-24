package com.useit.jact.gui.zaptelconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.zaptelconf.Zaptelspan;

/**
 * <p>
 * ZaptelspanDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:00 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelspanDataPanel.java,v 1.5 2005/12/29
 *          19:14:24 urs Exp $
 */
public class ZaptelspanDataPanel extends SimpleDataObjectPanel {
    protected Zaptelspan dataObject;

    // protected ZaptelspanChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZaptelspanDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZaptelspanResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZaptelspanResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZaptelspanResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * ZaptelspanCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fIntegerTextFieldspan_num, fIntegerTextFieldtiming,
     * fIntegerTextFieldlbo, fStringTextFieldframing, fStringTextFieldcoding,
     * fStringTextFieldyellow, }; dataChecker.initChecker(array); }
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
        this.add(getJPanelspan_num(), null); // Generated
        this.add(getJPaneltiming(), null); // Generated
        this.add(getJPanellbo(), null); // Generated
        this.add(getJPanelframing(), null); // Generated
        this.add(getJPanelcoding(), null); // Generated
        this.add(getJPanelyellow(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fIntegerTextFieldspan_num.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldtiming.getDocument()
                .addDocumentListener(textChangeAct);
        fIntegerTextFieldlbo.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldframing.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldcoding.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldyellow.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fIntegerTextFieldspan_num.setValue(dataObject.getSpan_num());
        fIntegerTextFieldtiming.setValue(dataObject.getTiming());
        fIntegerTextFieldlbo.setValue(dataObject.getLbo());
        fStringTextFieldframing.setValue(dataObject.getFraming());
        fStringTextFieldcoding.setValue(dataObject.getCoding());
        fStringTextFieldyellow.setValue(dataObject.getYellow());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setSpan_num(fIntegerTextFieldspan_num.getValue());
        dataObject.setTiming(fIntegerTextFieldtiming.getValue());
        dataObject.setLbo(fIntegerTextFieldlbo.getValue());
        dataObject.setFraming(fStringTextFieldframing.getValue());
        dataObject.setCoding(fStringTextFieldcoding.getValue());
        dataObject.setYellow(fStringTextFieldyellow.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zaptelspan
     */
    public void setDataObject(Object aZaptelspan) {
        // abstractdataObject = (AbstractConfigObject) aZaptelspan;
        setDataObject((Zaptelspan) aZaptelspan);
        // dataObject = aZaptelspan;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Zaptelspan
     */
    public void setDataObject(Zaptelspan aZaptelspan) {
        // abstractdataObject = (AbstractConfigObject) aZaptelspan;
        dataObject = aZaptelspan;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected IntegerTextField fIntegerTextFieldspan_num;

    protected javax.swing.JLabel fJLabelspan_num;

    protected javax.swing.JPanel fJPanelspan_num;

    protected IntegerTextField fIntegerTextFieldtiming;

    protected javax.swing.JLabel fJLabeltiming;

    protected javax.swing.JPanel fJPaneltiming;

    protected IntegerTextField fIntegerTextFieldlbo;

    protected javax.swing.JLabel fJLabellbo;

    protected javax.swing.JPanel fJPanellbo;

    protected StringTextField fStringTextFieldframing;

    protected javax.swing.JLabel fJLabelframing;

    protected javax.swing.JPanel fJPanelframing;

    protected StringTextField fStringTextFieldcoding;

    protected javax.swing.JLabel fJLabelcoding;

    protected javax.swing.JPanel fJPanelcoding;

    protected StringTextField fStringTextFieldyellow;

    protected javax.swing.JLabel fJLabelyellow;

    protected javax.swing.JPanel fJPanelyellow;

    // start DB field span_num
    /**
     * This method initializes fIntegerTextFieldspan_num
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldspan_num() {
        if (fIntegerTextFieldspan_num == null) {
            try {
                fIntegerTextFieldspan_num = new IntegerTextField(); // Generated
                fIntegerTextFieldspan_num
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldspan_num;
    }

    /**
     * This method initializes fJLabelspan_num
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelspan_num() {
        if (fJLabelspan_num == null) {
            try {
                fJLabelspan_num = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelspan_num.setText(resBundel
                        .getString("res_strspan_numDisplayName")); // Generated
                fJLabelspan_num.setToolTipText(resBundel
                        .getString("res_strspan_numDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelspan_num;
    }

    /**
     * This method initializes fJPanelspan_num
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelspan_num() {
        if (fJPanelspan_num == null) {
            try {
                fJPanelspan_num = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelspan_num.setLayout(layFlowLayout); // Generated
                fJPanelspan_num.add(getJLabelspan_num(), null); // Generated
                fJPanelspan_num.add(getIntegerTextFieldspan_num(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelspan_num;
    }

    // end DB field span_num
    // start DB field timing
    /**
     * This method initializes fIntegerTextFieldtiming
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldtiming() {
        if (fIntegerTextFieldtiming == null) {
            try {
                fIntegerTextFieldtiming = new IntegerTextField(); // Generated
                fIntegerTextFieldtiming
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldtiming;
    }

    /**
     * This method initializes fJLabeltiming
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltiming() {
        if (fJLabeltiming == null) {
            try {
                fJLabeltiming = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltiming.setText(resBundel
                        .getString("res_strtimingDisplayName")); // Generated
                fJLabeltiming.setToolTipText(resBundel
                        .getString("res_strtimingDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltiming;
    }

    /**
     * This method initializes fJPaneltiming
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltiming() {
        if (fJPaneltiming == null) {
            try {
                fJPaneltiming = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltiming.setLayout(layFlowLayout); // Generated
                fJPaneltiming.add(getJLabeltiming(), null); // Generated
                fJPaneltiming.add(getIntegerTextFieldtiming(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltiming;
    }

    // end DB field timing
    // start DB field lbo
    /**
     * This method initializes fIntegerTextFieldlbo
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldlbo() {
        if (fIntegerTextFieldlbo == null) {
            try {
                fIntegerTextFieldlbo = new IntegerTextField(); // Generated
                fIntegerTextFieldlbo.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldlbo;
    }

    /**
     * This method initializes fJLabellbo
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellbo() {
        if (fJLabellbo == null) {
            try {
                fJLabellbo = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabellbo
                        .setText(resBundel.getString("res_strlboDisplayName")); // Generated
                fJLabellbo.setToolTipText(resBundel
                        .getString("res_strlboDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabellbo;
    }

    /**
     * This method initializes fJPanellbo
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellbo() {
        if (fJPanellbo == null) {
            try {
                fJPanellbo = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellbo.setLayout(layFlowLayout); // Generated
                fJPanellbo.add(getJLabellbo(), null); // Generated
                fJPanellbo.add(getIntegerTextFieldlbo(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellbo;
    }

    // end DB field lbo
    // start DB field framing
    /**
     * This method initializes fStringTextFieldframing
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldframing() {
        if (fStringTextFieldframing == null) {
            try {
                fStringTextFieldframing = new StringTextField(); // Generated
                fStringTextFieldframing
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldframing;
    }

    /**
     * This method initializes fJLabelframing
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelframing() {
        if (fJLabelframing == null) {
            try {
                fJLabelframing = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelframing.setText(resBundel
                        .getString("res_strframingDisplayName")); // Generated
                fJLabelframing.setToolTipText(resBundel
                        .getString("res_strframingDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelframing;
    }

    /**
     * This method initializes fJPanelframing
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelframing() {
        if (fJPanelframing == null) {
            try {
                fJPanelframing = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelframing.setLayout(layFlowLayout); // Generated
                fJPanelframing.add(getJLabelframing(), null); // Generated
                fJPanelframing.add(getStringTextFieldframing(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelframing;
    }

    // end DB field framing
    // start DB field coding
    /**
     * This method initializes fStringTextFieldcoding
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcoding() {
        if (fStringTextFieldcoding == null) {
            try {
                fStringTextFieldcoding = new StringTextField(); // Generated
                fStringTextFieldcoding.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcoding;
    }

    /**
     * This method initializes fJLabelcoding
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcoding() {
        if (fJLabelcoding == null) {
            try {
                fJLabelcoding = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcoding.setText(resBundel
                        .getString("res_strcodingDisplayName")); // Generated
                fJLabelcoding.setToolTipText(resBundel
                        .getString("res_strcodingDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcoding;
    }

    /**
     * This method initializes fJPanelcoding
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcoding() {
        if (fJPanelcoding == null) {
            try {
                fJPanelcoding = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcoding.setLayout(layFlowLayout); // Generated
                fJPanelcoding.add(getJLabelcoding(), null); // Generated
                fJPanelcoding.add(getStringTextFieldcoding(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcoding;
    }

    // end DB field coding
    // start DB field yellow
    /**
     * This method initializes fStringTextFieldyellow
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldyellow() {
        if (fStringTextFieldyellow == null) {
            try {
                fStringTextFieldyellow = new StringTextField(); // Generated
                fStringTextFieldyellow.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldyellow;
    }

    /**
     * This method initializes fJLabelyellow
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelyellow() {
        if (fJLabelyellow == null) {
            try {
                fJLabelyellow = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelyellow.setText(resBundel
                        .getString("res_stryellowDisplayName")); // Generated
                fJLabelyellow.setToolTipText(resBundel
                        .getString("res_stryellowDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelyellow;
    }

    /**
     * This method initializes fJPanelyellow
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelyellow() {
        if (fJPanelyellow == null) {
            try {
                fJPanelyellow = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelyellow.setLayout(layFlowLayout); // Generated
                fJPanelyellow.add(getJLabelyellow(), null); // Generated
                fJPanelyellow.add(getStringTextFieldyellow(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelyellow;
    }
    // end DB field yellow

}
