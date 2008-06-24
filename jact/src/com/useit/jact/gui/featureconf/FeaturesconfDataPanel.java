package com.useit.jact.gui.featureconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.PbxContextTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.featureconf.Featuresconf;

/**
 * <p>
 * FeaturesconfDataPanel
 * </p>
 * Created : Thu Dec 29 11:59:56 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: FeaturesconfDataPanel.java,v 1.4 2005/12/29
 *          19:14:24 urs Exp $
 */
public class FeaturesconfDataPanel extends SimpleDataObjectPanel {
    protected Featuresconf dataObject;

    // protected FeaturesconfChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public FeaturesconfDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getFeaturesconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getFeaturesconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/FeaturesconfResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * FeaturesconfCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldparkext, fStringTextFieldparkpos,
     * fPbxContextTextFieldcontext, fIntegerTextFieldparkingtime,
     * fIntegerTextFieldtransferdigittimeout, fStringTextFieldcourtesytone,
     * fStringTextFieldxfersound, fStringTextFieldxferfailsound,
     * fCustomCheckBoxadsipark, fStringTextFieldpickupexten,
     * fIntegerTextFieldfeaturedigittimeout, }; dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (12) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(12); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelparkext(), null); // Generated
        this.add(getJPanelparkpos(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPanelparkingtime(), null); // Generated
        this.add(getJPaneltransferdigittimeout(), null); // Generated
        this.add(getJPanelcourtesytone(), null); // Generated
        this.add(getJPanelxfersound(), null); // Generated
        this.add(getJPanelxferfailsound(), null); // Generated
        this.add(getJPaneladsipark(), null); // Generated
        this.add(getJPanelpickupexten(), null); // Generated
        this.add(getJPanelfeaturedigittimeout(), null); // Generated
        // this.add(getJPanelfeaturemap(),null);
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldparkext.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldparkpos.getDocument()
                .addDocumentListener(textChangeAct);
        fPbxContextTextFieldcontext.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldparkingtime.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldtransferdigittimeout.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldcourtesytone.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldxfersound.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldxferfailsound.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxadsipark.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldpickupexten.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldfeaturedigittimeout.getDocument().addDocumentListener(
                textChangeAct);

        // fJComboBoxfeaturemap.addActionListener(textChangeAct);
    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldparkext.setValue(dataObject.getParkext());
        fStringTextFieldparkpos.setValue(dataObject.getParkpos());
        fPbxContextTextFieldcontext.setValue(dataObject.getContext());
        fIntegerTextFieldparkingtime.setValue(dataObject.getParkingtime());
        fIntegerTextFieldtransferdigittimeout.setValue(dataObject
                .getTransferdigittimeout());
        fStringTextFieldcourtesytone.setValue(dataObject.getCourtesytone());
        fStringTextFieldxfersound.setValue(dataObject.getXfersound());
        fStringTextFieldxferfailsound.setValue(dataObject.getXferfailsound());
        fCustomCheckBoxadsipark.setValue(dataObject.getAdsipark());
        fStringTextFieldpickupexten.setValue(dataObject.getPickupexten());
        fIntegerTextFieldfeaturedigittimeout.setValue(dataObject
                .getFeaturedigittimeout());

        // fJComboBoxfeaturemap.setSelectedItem(dataObject.getFeaturemap());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setParkext(fStringTextFieldparkext.getValue());
        dataObject.setParkpos(fStringTextFieldparkpos.getValue());
        dataObject.setContext(fPbxContextTextFieldcontext.getValue());
        dataObject.setParkingtime(fIntegerTextFieldparkingtime.getValue());
        dataObject
                .setTransferdigittimeout(fIntegerTextFieldtransferdigittimeout
                        .getValue());
        dataObject.setCourtesytone(fStringTextFieldcourtesytone.getValue());
        dataObject.setXfersound(fStringTextFieldxfersound.getValue());
        dataObject.setXferfailsound(fStringTextFieldxferfailsound.getValue());
        dataObject.setAdsipark(fCustomCheckBoxadsipark.getValue());
        dataObject.setPickupexten(fStringTextFieldpickupexten.getValue());
        dataObject.setFeaturedigittimeout(fIntegerTextFieldfeaturedigittimeout
                .getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Featuresconf
     */
    public void setDataObject(Object aFeaturesconf) {
        // abstractdataObject = (AbstractConfigObject) aFeaturesconf;
        setDataObject((Featuresconf) aFeaturesconf);
        // dataObject = aFeaturesconf;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Featuresconf
     */
    public void setDataObject(Featuresconf aFeaturesconf) {
        // abstractdataObject = (AbstractConfigObject) aFeaturesconf;
        dataObject = aFeaturesconf;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldparkext;

    protected javax.swing.JLabel fJLabelparkext;

    protected javax.swing.JPanel fJPanelparkext;

    protected StringTextField fStringTextFieldparkpos;

    protected javax.swing.JLabel fJLabelparkpos;

    protected javax.swing.JPanel fJPanelparkpos;

    protected PbxContextTextField fPbxContextTextFieldcontext;

    protected javax.swing.JLabel fJLabelcontext;

    protected javax.swing.JPanel fJPanelcontext;

    protected IntegerTextField fIntegerTextFieldparkingtime;

    protected javax.swing.JLabel fJLabelparkingtime;

    protected javax.swing.JPanel fJPanelparkingtime;

    protected IntegerTextField fIntegerTextFieldtransferdigittimeout;

    protected javax.swing.JLabel fJLabeltransferdigittimeout;

    protected javax.swing.JPanel fJPaneltransferdigittimeout;

    protected StringTextField fStringTextFieldcourtesytone;

    protected javax.swing.JLabel fJLabelcourtesytone;

    protected javax.swing.JPanel fJPanelcourtesytone;

    protected StringTextField fStringTextFieldxfersound;

    protected javax.swing.JLabel fJLabelxfersound;

    protected javax.swing.JPanel fJPanelxfersound;

    protected StringTextField fStringTextFieldxferfailsound;

    protected javax.swing.JLabel fJLabelxferfailsound;

    protected javax.swing.JPanel fJPanelxferfailsound;

    protected CustomCheckBox fCustomCheckBoxadsipark;

    protected javax.swing.JLabel fJLabeladsipark;

    protected javax.swing.JPanel fJPaneladsipark;

    protected StringTextField fStringTextFieldpickupexten;

    protected javax.swing.JLabel fJLabelpickupexten;

    protected javax.swing.JPanel fJPanelpickupexten;

    protected IntegerTextField fIntegerTextFieldfeaturedigittimeout;

    protected javax.swing.JLabel fJLabelfeaturedigittimeout;

    protected javax.swing.JPanel fJPanelfeaturedigittimeout;

    // start DB field parkext
    /**
     * This method initializes fStringTextFieldparkext
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldparkext() {
        if (fStringTextFieldparkext == null) {
            try {
                fStringTextFieldparkext = new StringTextField(); // Generated
                fStringTextFieldparkext
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldparkext;
    }

    /**
     * This method initializes fJLabelparkext
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelparkext() {
        if (fJLabelparkext == null) {
            try {
                fJLabelparkext = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelparkext.setText(resBundel
                        .getString("res_strparkextDisplayName")); // Generated
                fJLabelparkext.setToolTipText(resBundel
                        .getString("res_strparkextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelparkext;
    }

    /**
     * This method initializes fJPanelparkext
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelparkext() {
        if (fJPanelparkext == null) {
            try {
                fJPanelparkext = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelparkext.setLayout(layFlowLayout); // Generated
                fJPanelparkext.add(getJLabelparkext(), null); // Generated
                fJPanelparkext.add(getStringTextFieldparkext(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelparkext;
    }

    // end DB field parkext
    // start DB field parkpos
    /**
     * This method initializes fStringTextFieldparkpos
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldparkpos() {
        if (fStringTextFieldparkpos == null) {
            try {
                fStringTextFieldparkpos = new StringTextField(); // Generated
                fStringTextFieldparkpos
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldparkpos;
    }

    /**
     * This method initializes fJLabelparkpos
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelparkpos() {
        if (fJLabelparkpos == null) {
            try {
                fJLabelparkpos = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelparkpos.setText(resBundel
                        .getString("res_strparkposDisplayName")); // Generated
                fJLabelparkpos.setToolTipText(resBundel
                        .getString("res_strparkposDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelparkpos;
    }

    /**
     * This method initializes fJPanelparkpos
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelparkpos() {
        if (fJPanelparkpos == null) {
            try {
                fJPanelparkpos = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelparkpos.setLayout(layFlowLayout); // Generated
                fJPanelparkpos.add(getJLabelparkpos(), null); // Generated
                fJPanelparkpos.add(getStringTextFieldparkpos(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelparkpos;
    }

    // end DB field parkpos
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
    // start DB field parkingtime
    /**
     * This method initializes fIntegerTextFieldparkingtime
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldparkingtime() {
        if (fIntegerTextFieldparkingtime == null) {
            try {
                fIntegerTextFieldparkingtime = new IntegerTextField(); // Generated
                fIntegerTextFieldparkingtime
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldparkingtime;
    }

    /**
     * This method initializes fJLabelparkingtime
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelparkingtime() {
        if (fJLabelparkingtime == null) {
            try {
                fJLabelparkingtime = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelparkingtime.setText(resBundel
                        .getString("res_strparkingtimeDisplayName")); // Generated
                fJLabelparkingtime.setToolTipText(resBundel
                        .getString("res_strparkingtimeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelparkingtime;
    }

    /**
     * This method initializes fJPanelparkingtime
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelparkingtime() {
        if (fJPanelparkingtime == null) {
            try {
                fJPanelparkingtime = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelparkingtime.setLayout(layFlowLayout); // Generated
                fJPanelparkingtime.add(getJLabelparkingtime(), null); // Generated
                fJPanelparkingtime.add(getIntegerTextFieldparkingtime(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelparkingtime;
    }

    // end DB field parkingtime
    // start DB field transferdigittimeout
    /**
     * This method initializes fIntegerTextFieldtransferdigittimeout
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldtransferdigittimeout() {
        if (fIntegerTextFieldtransferdigittimeout == null) {
            try {
                fIntegerTextFieldtransferdigittimeout = new IntegerTextField(); // Generated
                fIntegerTextFieldtransferdigittimeout
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldtransferdigittimeout;
    }

    /**
     * This method initializes fJLabeltransferdigittimeout
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltransferdigittimeout() {
        if (fJLabeltransferdigittimeout == null) {
            try {
                fJLabeltransferdigittimeout = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltransferdigittimeout.setText(resBundel
                        .getString("res_strtransferdigittimeoutDisplayName")); // Generated
                fJLabeltransferdigittimeout.setToolTipText(resBundel
                        .getString("res_strtransferdigittimeoutDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltransferdigittimeout;
    }

    /**
     * This method initializes fJPaneltransferdigittimeout
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltransferdigittimeout() {
        if (fJPaneltransferdigittimeout == null) {
            try {
                fJPaneltransferdigittimeout = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltransferdigittimeout.setLayout(layFlowLayout); // Generated
                fJPaneltransferdigittimeout.add(
                        getJLabeltransferdigittimeout(), null); // Generated
                fJPaneltransferdigittimeout.add(
                        getIntegerTextFieldtransferdigittimeout(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltransferdigittimeout;
    }

    // end DB field transferdigittimeout
    // start DB field courtesytone
    /**
     * This method initializes fStringTextFieldcourtesytone
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcourtesytone() {
        if (fStringTextFieldcourtesytone == null) {
            try {
                fStringTextFieldcourtesytone = new StringTextField(); // Generated
                fStringTextFieldcourtesytone
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcourtesytone;
    }

    /**
     * This method initializes fJLabelcourtesytone
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcourtesytone() {
        if (fJLabelcourtesytone == null) {
            try {
                fJLabelcourtesytone = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcourtesytone.setText(resBundel
                        .getString("res_strcourtesytoneDisplayName")); // Generated
                fJLabelcourtesytone.setToolTipText(resBundel
                        .getString("res_strcourtesytoneDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcourtesytone;
    }

    /**
     * This method initializes fJPanelcourtesytone
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcourtesytone() {
        if (fJPanelcourtesytone == null) {
            try {
                fJPanelcourtesytone = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcourtesytone.setLayout(layFlowLayout); // Generated
                fJPanelcourtesytone.add(getJLabelcourtesytone(), null); // Generated
                fJPanelcourtesytone.add(getStringTextFieldcourtesytone(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcourtesytone;
    }

    // end DB field courtesytone
    // start DB field xfersound
    /**
     * This method initializes fStringTextFieldxfersound
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldxfersound() {
        if (fStringTextFieldxfersound == null) {
            try {
                fStringTextFieldxfersound = new StringTextField(); // Generated
                fStringTextFieldxfersound
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldxfersound;
    }

    /**
     * This method initializes fJLabelxfersound
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelxfersound() {
        if (fJLabelxfersound == null) {
            try {
                fJLabelxfersound = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelxfersound.setText(resBundel
                        .getString("res_strxfersoundDisplayName")); // Generated
                fJLabelxfersound.setToolTipText(resBundel
                        .getString("res_strxfersoundDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelxfersound;
    }

    /**
     * This method initializes fJPanelxfersound
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelxfersound() {
        if (fJPanelxfersound == null) {
            try {
                fJPanelxfersound = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelxfersound.setLayout(layFlowLayout); // Generated
                fJPanelxfersound.add(getJLabelxfersound(), null); // Generated
                fJPanelxfersound.add(getStringTextFieldxfersound(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelxfersound;
    }

    // end DB field xfersound
    // start DB field xferfailsound
    /**
     * This method initializes fStringTextFieldxferfailsound
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldxferfailsound() {
        if (fStringTextFieldxferfailsound == null) {
            try {
                fStringTextFieldxferfailsound = new StringTextField(); // Generated
                fStringTextFieldxferfailsound
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldxferfailsound;
    }

    /**
     * This method initializes fJLabelxferfailsound
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelxferfailsound() {
        if (fJLabelxferfailsound == null) {
            try {
                fJLabelxferfailsound = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelxferfailsound.setText(resBundel
                        .getString("res_strxferfailsoundDisplayName")); // Generated
                fJLabelxferfailsound.setToolTipText(resBundel
                        .getString("res_strxferfailsoundDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelxferfailsound;
    }

    /**
     * This method initializes fJPanelxferfailsound
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelxferfailsound() {
        if (fJPanelxferfailsound == null) {
            try {
                fJPanelxferfailsound = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelxferfailsound.setLayout(layFlowLayout); // Generated
                fJPanelxferfailsound.add(getJLabelxferfailsound(), null); // Generated
                fJPanelxferfailsound.add(getStringTextFieldxferfailsound(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelxferfailsound;
    }

    // end DB field xferfailsound
    // start DB field adsipark
    /**
     * This method initializes fCustomCheckBoxadsipark
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxadsipark() {
        if (fCustomCheckBoxadsipark == null) {
            try {
                fCustomCheckBoxadsipark = new CustomCheckBox(); // Generated
                fCustomCheckBoxadsipark
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxadsipark;
    }

    /**
     * This method initializes fJLabeladsipark
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeladsipark() {
        if (fJLabeladsipark == null) {
            try {
                fJLabeladsipark = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeladsipark.setText(resBundel
                        .getString("res_stradsiparkDisplayName")); // Generated
                fJLabeladsipark.setToolTipText(resBundel
                        .getString("res_stradsiparkDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeladsipark;
    }

    /**
     * This method initializes fJPaneladsipark
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneladsipark() {
        if (fJPaneladsipark == null) {
            try {
                fJPaneladsipark = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneladsipark.setLayout(layFlowLayout); // Generated
                fJPaneladsipark.add(getJLabeladsipark(), null); // Generated
                fJPaneladsipark.add(getCustomCheckBoxadsipark(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneladsipark;
    }

    // end DB field adsipark
    // start DB field pickupexten
    /**
     * This method initializes fStringTextFieldpickupexten
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpickupexten() {
        if (fStringTextFieldpickupexten == null) {
            try {
                fStringTextFieldpickupexten = new StringTextField(); // Generated
                fStringTextFieldpickupexten
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpickupexten;
    }

    /**
     * This method initializes fJLabelpickupexten
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpickupexten() {
        if (fJLabelpickupexten == null) {
            try {
                fJLabelpickupexten = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpickupexten.setText(resBundel
                        .getString("res_strpickupextenDisplayName")); // Generated
                fJLabelpickupexten.setToolTipText(resBundel
                        .getString("res_strpickupextenDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpickupexten;
    }

    /**
     * This method initializes fJPanelpickupexten
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpickupexten() {
        if (fJPanelpickupexten == null) {
            try {
                fJPanelpickupexten = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpickupexten.setLayout(layFlowLayout); // Generated
                fJPanelpickupexten.add(getJLabelpickupexten(), null); // Generated
                fJPanelpickupexten.add(getStringTextFieldpickupexten(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpickupexten;
    }

    // end DB field pickupexten
    // start DB field featuredigittimeout
    /**
     * This method initializes fIntegerTextFieldfeaturedigittimeout
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldfeaturedigittimeout() {
        if (fIntegerTextFieldfeaturedigittimeout == null) {
            try {
                fIntegerTextFieldfeaturedigittimeout = new IntegerTextField(); // Generated
                fIntegerTextFieldfeaturedigittimeout
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldfeaturedigittimeout;
    }

    /**
     * This method initializes fJLabelfeaturedigittimeout
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfeaturedigittimeout() {
        if (fJLabelfeaturedigittimeout == null) {
            try {
                fJLabelfeaturedigittimeout = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelfeaturedigittimeout.setText(resBundel
                        .getString("res_strfeaturedigittimeoutDisplayName")); // Generated
                fJLabelfeaturedigittimeout.setToolTipText(resBundel
                        .getString("res_strfeaturedigittimeoutDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelfeaturedigittimeout;
    }

    /**
     * This method initializes fJPanelfeaturedigittimeout
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfeaturedigittimeout() {
        if (fJPanelfeaturedigittimeout == null) {
            try {
                fJPanelfeaturedigittimeout = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfeaturedigittimeout.setLayout(layFlowLayout); // Generated
                fJPanelfeaturedigittimeout.add(getJLabelfeaturedigittimeout(),
                        null); // Generated
                fJPanelfeaturedigittimeout.add(
                        getIntegerTextFieldfeaturedigittimeout(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfeaturedigittimeout;
    }
    // end DB field featuredigittimeout

}
