package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.model.zapataconf.Timing_Parameters;

/**
 * <p>
 * Timing_ParametersDataPanel
 * </p>
 * Created : Thu Dec 29 12:22:57 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Timing_ParametersDataPanel.java,v 1.5
 *          2005/12/29 19:14:06 urs Exp $
 */
public class Timing_ParametersDataPanel extends SimpleDataObjectPanel {
    protected Timing_Parameters dataObject;

    // protected Timing_ParametersChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Timing_ParametersDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getTiming_ParametersResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getTiming_ParametersResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Timing_ParametersResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * Timing_ParametersCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fIntegerTextFieldprewink, fIntegerTextFieldpreflash,
     * fIntegerTextFieldwink, fIntegerTextFieldrxwink, fIntegerTextFieldrxflash,
     * fIntegerTextFieldflash, fIntegerTextFieldstart,
     * fIntegerTextFielddebounce, }; dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (8) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(8); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelprewink(), null); // Generated
        this.add(getJPanelpreflash(), null); // Generated
        this.add(getJPanelwink(), null); // Generated
        this.add(getJPanelrxwink(), null); // Generated
        this.add(getJPanelrxflash(), null); // Generated
        this.add(getJPanelflash(), null); // Generated
        this.add(getJPanelstart(), null); // Generated
        this.add(getJPaneldebounce(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fIntegerTextFieldprewink.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldpreflash.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldwink.getDocument().addDocumentListener(textChangeAct);
        fIntegerTextFieldrxwink.getDocument()
                .addDocumentListener(textChangeAct);
        fIntegerTextFieldrxflash.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldflash.getDocument().addDocumentListener(textChangeAct);
        fIntegerTextFieldstart.getDocument().addDocumentListener(textChangeAct);
        fIntegerTextFielddebounce.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fIntegerTextFieldprewink.setValue(dataObject.getPrewink());
        fIntegerTextFieldpreflash.setValue(dataObject.getPreflash());
        fIntegerTextFieldwink.setValue(dataObject.getWink());
        fIntegerTextFieldrxwink.setValue(dataObject.getRxwink());
        fIntegerTextFieldrxflash.setValue(dataObject.getRxflash());
        fIntegerTextFieldflash.setValue(dataObject.getFlash());
        fIntegerTextFieldstart.setValue(dataObject.getStart());
        fIntegerTextFielddebounce.setValue(dataObject.getDebounce());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setPrewink(fIntegerTextFieldprewink.getValue());
        dataObject.setPreflash(fIntegerTextFieldpreflash.getValue());
        dataObject.setWink(fIntegerTextFieldwink.getValue());
        dataObject.setRxwink(fIntegerTextFieldrxwink.getValue());
        dataObject.setRxflash(fIntegerTextFieldrxflash.getValue());
        dataObject.setFlash(fIntegerTextFieldflash.getValue());
        dataObject.setStart(fIntegerTextFieldstart.getValue());
        dataObject.setDebounce(fIntegerTextFielddebounce.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Timing_Parameters
     */
    public void setDataObject(Object aTiming_Parameters) {
        // abstractdataObject = (AbstractConfigObject) aTiming_Parameters;
        setDataObject((Timing_Parameters) aTiming_Parameters);
        // dataObject = aTiming_Parameters;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Timing_Parameters
     */
    public void setDataObject(Timing_Parameters aTiming_Parameters) {
        // abstractdataObject = (AbstractConfigObject) aTiming_Parameters;
        dataObject = aTiming_Parameters;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected IntegerTextField fIntegerTextFieldprewink;

    protected javax.swing.JLabel fJLabelprewink;

    protected javax.swing.JPanel fJPanelprewink;

    protected IntegerTextField fIntegerTextFieldpreflash;

    protected javax.swing.JLabel fJLabelpreflash;

    protected javax.swing.JPanel fJPanelpreflash;

    protected IntegerTextField fIntegerTextFieldwink;

    protected javax.swing.JLabel fJLabelwink;

    protected javax.swing.JPanel fJPanelwink;

    protected IntegerTextField fIntegerTextFieldrxwink;

    protected javax.swing.JLabel fJLabelrxwink;

    protected javax.swing.JPanel fJPanelrxwink;

    protected IntegerTextField fIntegerTextFieldrxflash;

    protected javax.swing.JLabel fJLabelrxflash;

    protected javax.swing.JPanel fJPanelrxflash;

    protected IntegerTextField fIntegerTextFieldflash;

    protected javax.swing.JLabel fJLabelflash;

    protected javax.swing.JPanel fJPanelflash;

    protected IntegerTextField fIntegerTextFieldstart;

    protected javax.swing.JLabel fJLabelstart;

    protected javax.swing.JPanel fJPanelstart;

    protected IntegerTextField fIntegerTextFielddebounce;

    protected javax.swing.JLabel fJLabeldebounce;

    protected javax.swing.JPanel fJPaneldebounce;

    // start DB field prewink
    /**
     * This method initializes fIntegerTextFieldprewink
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldprewink() {
        if (fIntegerTextFieldprewink == null) {
            try {
                fIntegerTextFieldprewink = new IntegerTextField(); // Generated
                fIntegerTextFieldprewink
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldprewink;
    }

    /**
     * This method initializes fJLabelprewink
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelprewink() {
        if (fJLabelprewink == null) {
            try {
                fJLabelprewink = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelprewink.setText(resBundel
                        .getString("res_strprewinkDisplayName")); // Generated
                fJLabelprewink.setToolTipText(resBundel
                        .getString("res_strprewinkDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelprewink;
    }

    /**
     * This method initializes fJPanelprewink
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelprewink() {
        if (fJPanelprewink == null) {
            try {
                fJPanelprewink = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelprewink.setLayout(layFlowLayout); // Generated
                fJPanelprewink.add(getJLabelprewink(), null); // Generated
                fJPanelprewink.add(getIntegerTextFieldprewink(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelprewink;
    }

    // end DB field prewink
    // start DB field preflash
    /**
     * This method initializes fIntegerTextFieldpreflash
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldpreflash() {
        if (fIntegerTextFieldpreflash == null) {
            try {
                fIntegerTextFieldpreflash = new IntegerTextField(); // Generated
                fIntegerTextFieldpreflash
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldpreflash;
    }

    /**
     * This method initializes fJLabelpreflash
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpreflash() {
        if (fJLabelpreflash == null) {
            try {
                fJLabelpreflash = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpreflash.setText(resBundel
                        .getString("res_strpreflashDisplayName")); // Generated
                fJLabelpreflash.setToolTipText(resBundel
                        .getString("res_strpreflashDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpreflash;
    }

    /**
     * This method initializes fJPanelpreflash
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpreflash() {
        if (fJPanelpreflash == null) {
            try {
                fJPanelpreflash = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpreflash.setLayout(layFlowLayout); // Generated
                fJPanelpreflash.add(getJLabelpreflash(), null); // Generated
                fJPanelpreflash.add(getIntegerTextFieldpreflash(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpreflash;
    }

    // end DB field preflash
    // start DB field wink
    /**
     * This method initializes fIntegerTextFieldwink
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldwink() {
        if (fIntegerTextFieldwink == null) {
            try {
                fIntegerTextFieldwink = new IntegerTextField(); // Generated
                fIntegerTextFieldwink.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldwink;
    }

    /**
     * This method initializes fJLabelwink
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelwink() {
        if (fJLabelwink == null) {
            try {
                fJLabelwink = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelwink.setText(resBundel
                        .getString("res_strwinkDisplayName")); // Generated
                fJLabelwink.setToolTipText(resBundel
                        .getString("res_strwinkDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelwink;
    }

    /**
     * This method initializes fJPanelwink
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelwink() {
        if (fJPanelwink == null) {
            try {
                fJPanelwink = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelwink.setLayout(layFlowLayout); // Generated
                fJPanelwink.add(getJLabelwink(), null); // Generated
                fJPanelwink.add(getIntegerTextFieldwink(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelwink;
    }

    // end DB field wink
    // start DB field rxwink
    /**
     * This method initializes fIntegerTextFieldrxwink
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldrxwink() {
        if (fIntegerTextFieldrxwink == null) {
            try {
                fIntegerTextFieldrxwink = new IntegerTextField(); // Generated
                fIntegerTextFieldrxwink
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldrxwink;
    }

    /**
     * This method initializes fJLabelrxwink
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrxwink() {
        if (fJLabelrxwink == null) {
            try {
                fJLabelrxwink = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelrxwink.setText(resBundel
                        .getString("res_strrxwinkDisplayName")); // Generated
                fJLabelrxwink.setToolTipText(resBundel
                        .getString("res_strrxwinkDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelrxwink;
    }

    /**
     * This method initializes fJPanelrxwink
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrxwink() {
        if (fJPanelrxwink == null) {
            try {
                fJPanelrxwink = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrxwink.setLayout(layFlowLayout); // Generated
                fJPanelrxwink.add(getJLabelrxwink(), null); // Generated
                fJPanelrxwink.add(getIntegerTextFieldrxwink(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrxwink;
    }

    // end DB field rxwink
    // start DB field rxflash
    /**
     * This method initializes fIntegerTextFieldrxflash
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldrxflash() {
        if (fIntegerTextFieldrxflash == null) {
            try {
                fIntegerTextFieldrxflash = new IntegerTextField(); // Generated
                fIntegerTextFieldrxflash
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldrxflash;
    }

    /**
     * This method initializes fJLabelrxflash
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrxflash() {
        if (fJLabelrxflash == null) {
            try {
                fJLabelrxflash = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelrxflash.setText(resBundel
                        .getString("res_strrxflashDisplayName")); // Generated
                fJLabelrxflash.setToolTipText(resBundel
                        .getString("res_strrxflashDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelrxflash;
    }

    /**
     * This method initializes fJPanelrxflash
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrxflash() {
        if (fJPanelrxflash == null) {
            try {
                fJPanelrxflash = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrxflash.setLayout(layFlowLayout); // Generated
                fJPanelrxflash.add(getJLabelrxflash(), null); // Generated
                fJPanelrxflash.add(getIntegerTextFieldrxflash(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrxflash;
    }

    // end DB field rxflash
    // start DB field flash
    /**
     * This method initializes fIntegerTextFieldflash
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldflash() {
        if (fIntegerTextFieldflash == null) {
            try {
                fIntegerTextFieldflash = new IntegerTextField(); // Generated
                fIntegerTextFieldflash.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldflash;
    }

    /**
     * This method initializes fJLabelflash
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelflash() {
        if (fJLabelflash == null) {
            try {
                fJLabelflash = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelflash.setText(resBundel
                        .getString("res_strflashDisplayName")); // Generated
                fJLabelflash.setToolTipText(resBundel
                        .getString("res_strflashDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelflash;
    }

    /**
     * This method initializes fJPanelflash
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelflash() {
        if (fJPanelflash == null) {
            try {
                fJPanelflash = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelflash.setLayout(layFlowLayout); // Generated
                fJPanelflash.add(getJLabelflash(), null); // Generated
                fJPanelflash.add(getIntegerTextFieldflash(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelflash;
    }

    // end DB field flash
    // start DB field start
    /**
     * This method initializes fIntegerTextFieldstart
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldstart() {
        if (fIntegerTextFieldstart == null) {
            try {
                fIntegerTextFieldstart = new IntegerTextField(); // Generated
                fIntegerTextFieldstart.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldstart;
    }

    /**
     * This method initializes fJLabelstart
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelstart() {
        if (fJLabelstart == null) {
            try {
                fJLabelstart = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelstart.setText(resBundel
                        .getString("res_strstartDisplayName")); // Generated
                fJLabelstart.setToolTipText(resBundel
                        .getString("res_strstartDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelstart;
    }

    /**
     * This method initializes fJPanelstart
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelstart() {
        if (fJPanelstart == null) {
            try {
                fJPanelstart = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelstart.setLayout(layFlowLayout); // Generated
                fJPanelstart.add(getJLabelstart(), null); // Generated
                fJPanelstart.add(getIntegerTextFieldstart(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelstart;
    }

    // end DB field start
    // start DB field debounce
    /**
     * This method initializes fIntegerTextFielddebounce
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFielddebounce() {
        if (fIntegerTextFielddebounce == null) {
            try {
                fIntegerTextFielddebounce = new IntegerTextField(); // Generated
                fIntegerTextFielddebounce
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFielddebounce;
    }

    /**
     * This method initializes fJLabeldebounce
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldebounce() {
        if (fJLabeldebounce == null) {
            try {
                fJLabeldebounce = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldebounce.setText(resBundel
                        .getString("res_strdebounceDisplayName")); // Generated
                fJLabeldebounce.setToolTipText(resBundel
                        .getString("res_strdebounceDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldebounce;
    }

    /**
     * This method initializes fJPaneldebounce
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldebounce() {
        if (fJPaneldebounce == null) {
            try {
                fJPaneldebounce = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldebounce.setLayout(layFlowLayout); // Generated
                fJPaneldebounce.add(getJLabeldebounce(), null); // Generated
                fJPaneldebounce.add(getIntegerTextFielddebounce(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldebounce;
    }
    // end DB field debounce

}
