package com.useit.jact.gui.iaxconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.model.iaxconf.Iaxjitter;

/**
 * <p>
 * IaxjitterDataPanel
 * </p>
 * Created : Thu Dec 29 11:59:31 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxjitterDataPanel.java,v 1.4 2005/12/29
 *          19:14:16 urs Exp $
 */
public class IaxjitterDataPanel extends SimpleDataObjectPanel {
    protected Iaxjitter dataObject;

    // protected IaxjitterChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IaxjitterDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIaxjitterResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIaxjitterResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/IaxjitterResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * IaxjitterCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fCustomCheckBoxjitterbuffer,
     * fCustomCheckBoxforcejitterbuffer, fIntegerTextFielddropcount,
     * fIntegerTextFieldmaxjitterbuffer, fIntegerTextFieldresyncthreshold,
     * fIntegerTextFieldmaxjitterinterps, fIntegerTextFieldmaxexcessbuffer,
     * fIntegerTextFieldminexcessbuffer, fIntegerTextFieldjittershrinkrate, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (9) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(9); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneljitterbuffer(), null); // Generated
        this.add(getJPanelforcejitterbuffer(), null); // Generated
        this.add(getJPaneldropcount(), null); // Generated
        this.add(getJPanelmaxjitterbuffer(), null); // Generated
        this.add(getJPanelresyncthreshold(), null); // Generated
        this.add(getJPanelmaxjitterinterps(), null); // Generated
        this.add(getJPanelmaxexcessbuffer(), null); // Generated
        this.add(getJPanelminexcessbuffer(), null); // Generated
        this.add(getJPaneljittershrinkrate(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fCustomCheckBoxjitterbuffer.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxforcejitterbuffer.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFielddropcount.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldmaxjitterbuffer.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldresyncthreshold.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldmaxjitterinterps.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldmaxexcessbuffer.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldminexcessbuffer.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldjittershrinkrate.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fCustomCheckBoxjitterbuffer.setValue(dataObject.getJitterbuffer());
        fCustomCheckBoxforcejitterbuffer.setValue(dataObject
                .getForcejitterbuffer());
        fIntegerTextFielddropcount.setValue(dataObject.getDropcount());
        fIntegerTextFieldmaxjitterbuffer.setValue(dataObject
                .getMaxjitterbuffer());
        fIntegerTextFieldresyncthreshold.setValue(dataObject
                .getResyncthreshold());
        fIntegerTextFieldmaxjitterinterps.setValue(dataObject
                .getMaxjitterinterps());
        fIntegerTextFieldmaxexcessbuffer.setValue(dataObject
                .getMaxexcessbuffer());
        fIntegerTextFieldminexcessbuffer.setValue(dataObject
                .getMinexcessbuffer());
        fIntegerTextFieldjittershrinkrate.setValue(dataObject
                .getJittershrinkrate());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setJitterbuffer(fCustomCheckBoxjitterbuffer.getValue());
        dataObject.setForcejitterbuffer(fCustomCheckBoxforcejitterbuffer
                .getValue());
        dataObject.setDropcount(fIntegerTextFielddropcount.getValue());
        dataObject.setMaxjitterbuffer(fIntegerTextFieldmaxjitterbuffer
                .getValue());
        dataObject.setResyncthreshold(fIntegerTextFieldresyncthreshold
                .getValue());
        dataObject.setMaxjitterinterps(fIntegerTextFieldmaxjitterinterps
                .getValue());
        dataObject.setMaxexcessbuffer(fIntegerTextFieldmaxexcessbuffer
                .getValue());
        dataObject.setMinexcessbuffer(fIntegerTextFieldminexcessbuffer
                .getValue());
        dataObject.setJittershrinkrate(fIntegerTextFieldjittershrinkrate
                .getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Iaxjitter
     */
    public void setDataObject(Object aIaxjitter) {
        // abstractdataObject = (AbstractConfigObject) aIaxjitter;
        setDataObject((Iaxjitter) aIaxjitter);
        // dataObject = aIaxjitter;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Iaxjitter
     */
    public void setDataObject(Iaxjitter aIaxjitter) {
        // abstractdataObject = (AbstractConfigObject) aIaxjitter;
        dataObject = aIaxjitter;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected CustomCheckBox fCustomCheckBoxjitterbuffer;

    protected javax.swing.JLabel fJLabeljitterbuffer;

    protected javax.swing.JPanel fJPaneljitterbuffer;

    protected CustomCheckBox fCustomCheckBoxforcejitterbuffer;

    protected javax.swing.JLabel fJLabelforcejitterbuffer;

    protected javax.swing.JPanel fJPanelforcejitterbuffer;

    protected IntegerTextField fIntegerTextFielddropcount;

    protected javax.swing.JLabel fJLabeldropcount;

    protected javax.swing.JPanel fJPaneldropcount;

    protected IntegerTextField fIntegerTextFieldmaxjitterbuffer;

    protected javax.swing.JLabel fJLabelmaxjitterbuffer;

    protected javax.swing.JPanel fJPanelmaxjitterbuffer;

    protected IntegerTextField fIntegerTextFieldresyncthreshold;

    protected javax.swing.JLabel fJLabelresyncthreshold;

    protected javax.swing.JPanel fJPanelresyncthreshold;

    protected IntegerTextField fIntegerTextFieldmaxjitterinterps;

    protected javax.swing.JLabel fJLabelmaxjitterinterps;

    protected javax.swing.JPanel fJPanelmaxjitterinterps;

    protected IntegerTextField fIntegerTextFieldmaxexcessbuffer;

    protected javax.swing.JLabel fJLabelmaxexcessbuffer;

    protected javax.swing.JPanel fJPanelmaxexcessbuffer;

    protected IntegerTextField fIntegerTextFieldminexcessbuffer;

    protected javax.swing.JLabel fJLabelminexcessbuffer;

    protected javax.swing.JPanel fJPanelminexcessbuffer;

    protected IntegerTextField fIntegerTextFieldjittershrinkrate;

    protected javax.swing.JLabel fJLabeljittershrinkrate;

    protected javax.swing.JPanel fJPaneljittershrinkrate;

    // start DB field jitterbuffer
    /**
     * This method initializes fCustomCheckBoxjitterbuffer
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxjitterbuffer() {
        if (fCustomCheckBoxjitterbuffer == null) {
            try {
                fCustomCheckBoxjitterbuffer = new CustomCheckBox(); // Generated
                fCustomCheckBoxjitterbuffer
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxjitterbuffer;
    }

    /**
     * This method initializes fJLabeljitterbuffer
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeljitterbuffer() {
        if (fJLabeljitterbuffer == null) {
            try {
                fJLabeljitterbuffer = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeljitterbuffer.setText(resBundel
                        .getString("res_strjitterbufferDisplayName")); // Generated
                fJLabeljitterbuffer.setToolTipText(resBundel
                        .getString("res_strjitterbufferDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeljitterbuffer;
    }

    /**
     * This method initializes fJPaneljitterbuffer
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneljitterbuffer() {
        if (fJPaneljitterbuffer == null) {
            try {
                fJPaneljitterbuffer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneljitterbuffer.setLayout(layFlowLayout); // Generated
                fJPaneljitterbuffer.add(getJLabeljitterbuffer(), null); // Generated
                fJPaneljitterbuffer.add(getCustomCheckBoxjitterbuffer(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneljitterbuffer;
    }

    // end DB field jitterbuffer
    // start DB field forcejitterbuffer
    /**
     * This method initializes fCustomCheckBoxforcejitterbuffer
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxforcejitterbuffer() {
        if (fCustomCheckBoxforcejitterbuffer == null) {
            try {
                fCustomCheckBoxforcejitterbuffer = new CustomCheckBox(); // Generated
                fCustomCheckBoxforcejitterbuffer
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxforcejitterbuffer;
    }

    /**
     * This method initializes fJLabelforcejitterbuffer
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelforcejitterbuffer() {
        if (fJLabelforcejitterbuffer == null) {
            try {
                fJLabelforcejitterbuffer = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelforcejitterbuffer.setText(resBundel
                        .getString("res_strforcejitterbufferDisplayName")); // Generated
                fJLabelforcejitterbuffer.setToolTipText(resBundel
                        .getString("res_strforcejitterbufferDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelforcejitterbuffer;
    }

    /**
     * This method initializes fJPanelforcejitterbuffer
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelforcejitterbuffer() {
        if (fJPanelforcejitterbuffer == null) {
            try {
                fJPanelforcejitterbuffer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelforcejitterbuffer.setLayout(layFlowLayout); // Generated
                fJPanelforcejitterbuffer
                        .add(getJLabelforcejitterbuffer(), null); // Generated
                fJPanelforcejitterbuffer.add(
                        getCustomCheckBoxforcejitterbuffer(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelforcejitterbuffer;
    }

    // end DB field forcejitterbuffer
    // start DB field dropcount
    /**
     * This method initializes fIntegerTextFielddropcount
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFielddropcount() {
        if (fIntegerTextFielddropcount == null) {
            try {
                fIntegerTextFielddropcount = new IntegerTextField(); // Generated
                fIntegerTextFielddropcount
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFielddropcount;
    }

    /**
     * This method initializes fJLabeldropcount
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldropcount() {
        if (fJLabeldropcount == null) {
            try {
                fJLabeldropcount = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldropcount.setText(resBundel
                        .getString("res_strdropcountDisplayName")); // Generated
                fJLabeldropcount.setToolTipText(resBundel
                        .getString("res_strdropcountDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldropcount;
    }

    /**
     * This method initializes fJPaneldropcount
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldropcount() {
        if (fJPaneldropcount == null) {
            try {
                fJPaneldropcount = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldropcount.setLayout(layFlowLayout); // Generated
                fJPaneldropcount.add(getJLabeldropcount(), null); // Generated
                fJPaneldropcount.add(getIntegerTextFielddropcount(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldropcount;
    }

    // end DB field dropcount
    // start DB field maxjitterbuffer
    /**
     * This method initializes fIntegerTextFieldmaxjitterbuffer
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldmaxjitterbuffer() {
        if (fIntegerTextFieldmaxjitterbuffer == null) {
            try {
                fIntegerTextFieldmaxjitterbuffer = new IntegerTextField(); // Generated
                fIntegerTextFieldmaxjitterbuffer
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldmaxjitterbuffer;
    }

    /**
     * This method initializes fJLabelmaxjitterbuffer
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmaxjitterbuffer() {
        if (fJLabelmaxjitterbuffer == null) {
            try {
                fJLabelmaxjitterbuffer = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmaxjitterbuffer.setText(resBundel
                        .getString("res_strmaxjitterbufferDisplayName")); // Generated
                fJLabelmaxjitterbuffer.setToolTipText(resBundel
                        .getString("res_strmaxjitterbufferDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmaxjitterbuffer;
    }

    /**
     * This method initializes fJPanelmaxjitterbuffer
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmaxjitterbuffer() {
        if (fJPanelmaxjitterbuffer == null) {
            try {
                fJPanelmaxjitterbuffer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmaxjitterbuffer.setLayout(layFlowLayout); // Generated
                fJPanelmaxjitterbuffer.add(getJLabelmaxjitterbuffer(), null); // Generated
                fJPanelmaxjitterbuffer.add(
                        getIntegerTextFieldmaxjitterbuffer(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmaxjitterbuffer;
    }

    // end DB field maxjitterbuffer
    // start DB field resyncthreshold
    /**
     * This method initializes fIntegerTextFieldresyncthreshold
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldresyncthreshold() {
        if (fIntegerTextFieldresyncthreshold == null) {
            try {
                fIntegerTextFieldresyncthreshold = new IntegerTextField(); // Generated
                fIntegerTextFieldresyncthreshold
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldresyncthreshold;
    }

    /**
     * This method initializes fJLabelresyncthreshold
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelresyncthreshold() {
        if (fJLabelresyncthreshold == null) {
            try {
                fJLabelresyncthreshold = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelresyncthreshold.setText(resBundel
                        .getString("res_strresyncthresholdDisplayName")); // Generated
                fJLabelresyncthreshold.setToolTipText(resBundel
                        .getString("res_strresyncthresholdDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelresyncthreshold;
    }

    /**
     * This method initializes fJPanelresyncthreshold
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelresyncthreshold() {
        if (fJPanelresyncthreshold == null) {
            try {
                fJPanelresyncthreshold = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelresyncthreshold.setLayout(layFlowLayout); // Generated
                fJPanelresyncthreshold.add(getJLabelresyncthreshold(), null); // Generated
                fJPanelresyncthreshold.add(
                        getIntegerTextFieldresyncthreshold(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelresyncthreshold;
    }

    // end DB field resyncthreshold
    // start DB field maxjitterinterps
    /**
     * This method initializes fIntegerTextFieldmaxjitterinterps
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldmaxjitterinterps() {
        if (fIntegerTextFieldmaxjitterinterps == null) {
            try {
                fIntegerTextFieldmaxjitterinterps = new IntegerTextField(); // Generated
                fIntegerTextFieldmaxjitterinterps
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldmaxjitterinterps;
    }

    /**
     * This method initializes fJLabelmaxjitterinterps
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmaxjitterinterps() {
        if (fJLabelmaxjitterinterps == null) {
            try {
                fJLabelmaxjitterinterps = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmaxjitterinterps.setText(resBundel
                        .getString("res_strmaxjitterinterpsDisplayName")); // Generated
                fJLabelmaxjitterinterps.setToolTipText(resBundel
                        .getString("res_strmaxjitterinterpsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmaxjitterinterps;
    }

    /**
     * This method initializes fJPanelmaxjitterinterps
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmaxjitterinterps() {
        if (fJPanelmaxjitterinterps == null) {
            try {
                fJPanelmaxjitterinterps = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmaxjitterinterps.setLayout(layFlowLayout); // Generated
                fJPanelmaxjitterinterps.add(getJLabelmaxjitterinterps(), null); // Generated
                fJPanelmaxjitterinterps.add(
                        getIntegerTextFieldmaxjitterinterps(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmaxjitterinterps;
    }

    // end DB field maxjitterinterps
    // start DB field maxexcessbuffer
    /**
     * This method initializes fIntegerTextFieldmaxexcessbuffer
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldmaxexcessbuffer() {
        if (fIntegerTextFieldmaxexcessbuffer == null) {
            try {
                fIntegerTextFieldmaxexcessbuffer = new IntegerTextField(); // Generated
                fIntegerTextFieldmaxexcessbuffer
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldmaxexcessbuffer;
    }

    /**
     * This method initializes fJLabelmaxexcessbuffer
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmaxexcessbuffer() {
        if (fJLabelmaxexcessbuffer == null) {
            try {
                fJLabelmaxexcessbuffer = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmaxexcessbuffer.setText(resBundel
                        .getString("res_strmaxexcessbufferDisplayName")); // Generated
                fJLabelmaxexcessbuffer.setToolTipText(resBundel
                        .getString("res_strmaxexcessbufferDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmaxexcessbuffer;
    }

    /**
     * This method initializes fJPanelmaxexcessbuffer
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmaxexcessbuffer() {
        if (fJPanelmaxexcessbuffer == null) {
            try {
                fJPanelmaxexcessbuffer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmaxexcessbuffer.setLayout(layFlowLayout); // Generated
                fJPanelmaxexcessbuffer.add(getJLabelmaxexcessbuffer(), null); // Generated
                fJPanelmaxexcessbuffer.add(
                        getIntegerTextFieldmaxexcessbuffer(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmaxexcessbuffer;
    }

    // end DB field maxexcessbuffer
    // start DB field minexcessbuffer
    /**
     * This method initializes fIntegerTextFieldminexcessbuffer
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldminexcessbuffer() {
        if (fIntegerTextFieldminexcessbuffer == null) {
            try {
                fIntegerTextFieldminexcessbuffer = new IntegerTextField(); // Generated
                fIntegerTextFieldminexcessbuffer
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldminexcessbuffer;
    }

    /**
     * This method initializes fJLabelminexcessbuffer
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelminexcessbuffer() {
        if (fJLabelminexcessbuffer == null) {
            try {
                fJLabelminexcessbuffer = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelminexcessbuffer.setText(resBundel
                        .getString("res_strminexcessbufferDisplayName")); // Generated
                fJLabelminexcessbuffer.setToolTipText(resBundel
                        .getString("res_strminexcessbufferDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelminexcessbuffer;
    }

    /**
     * This method initializes fJPanelminexcessbuffer
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelminexcessbuffer() {
        if (fJPanelminexcessbuffer == null) {
            try {
                fJPanelminexcessbuffer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelminexcessbuffer.setLayout(layFlowLayout); // Generated
                fJPanelminexcessbuffer.add(getJLabelminexcessbuffer(), null); // Generated
                fJPanelminexcessbuffer.add(
                        getIntegerTextFieldminexcessbuffer(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelminexcessbuffer;
    }

    // end DB field minexcessbuffer
    // start DB field jittershrinkrate
    /**
     * This method initializes fIntegerTextFieldjittershrinkrate
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldjittershrinkrate() {
        if (fIntegerTextFieldjittershrinkrate == null) {
            try {
                fIntegerTextFieldjittershrinkrate = new IntegerTextField(); // Generated
                fIntegerTextFieldjittershrinkrate
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldjittershrinkrate;
    }

    /**
     * This method initializes fJLabeljittershrinkrate
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeljittershrinkrate() {
        if (fJLabeljittershrinkrate == null) {
            try {
                fJLabeljittershrinkrate = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeljittershrinkrate.setText(resBundel
                        .getString("res_strjittershrinkrateDisplayName")); // Generated
                fJLabeljittershrinkrate.setToolTipText(resBundel
                        .getString("res_strjittershrinkrateDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeljittershrinkrate;
    }

    /**
     * This method initializes fJPaneljittershrinkrate
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneljittershrinkrate() {
        if (fJPaneljittershrinkrate == null) {
            try {
                fJPaneljittershrinkrate = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneljittershrinkrate.setLayout(layFlowLayout); // Generated
                fJPaneljittershrinkrate.add(getJLabeljittershrinkrate(), null); // Generated
                fJPaneljittershrinkrate.add(
                        getIntegerTextFieldjittershrinkrate(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneljittershrinkrate;
    }
    // end DB field jittershrinkrate

}
