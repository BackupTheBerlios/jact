package com.useit.jact.gui.indicationsconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.indicationsconf.ToneDefinitions;

/**
 * <p>
 * ToneDefinitionsDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:20 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ToneDefinitionsDataPanel.java,v 1.4
 *          2005/12/29 19:14:12 urs Exp $
 */
public class ToneDefinitionsDataPanel extends SimpleDataObjectPanel {
    protected ToneDefinitions dataObject;

    // protected ToneDefinitionsChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ToneDefinitionsDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getToneDefinitionsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getToneDefinitionsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ToneDefinitionsResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * ToneDefinitionsCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFieldcountrycode,
     * fStringTextFielddescription, fStringTextFieldalias,
     * fStringTextFieldringcadence, fStringTextFielddial, fStringTextFieldbusy,
     * fStringTextFieldring, fStringTextFieldcongestion,
     * fStringTextFieldcallwaiting, fStringTextFielddialrecall,
     * fStringTextFieldrecord, fStringTextFieldinfo, };
     * dataChecker.initChecker(array); }
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
        this.add(getJPanelcountrycode(), null); // Generated
        this.add(getJPaneldescription(), null); // Generated
        this.add(getJPanelalias(), null); // Generated
        this.add(getJPanelringcadence(), null); // Generated
        this.add(getJPaneldial(), null); // Generated
        this.add(getJPanelbusy(), null); // Generated
        this.add(getJPanelring(), null); // Generated
        this.add(getJPanelcongestion(), null); // Generated
        this.add(getJPanelcallwaiting(), null); // Generated
        this.add(getJPaneldialrecall(), null); // Generated
        this.add(getJPanelrecord(), null); // Generated
        this.add(getJPanelinfo(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldcountrycode.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielddescription.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldalias.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldringcadence.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielddial.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldbusy.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldring.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldcongestion.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldcallwaiting.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielddialrecall.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldrecord.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldinfo.getDocument().addDocumentListener(textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldcountrycode.setValue(dataObject.getCountrycode());
        fStringTextFielddescription.setValue(dataObject.getDescription());
        fStringTextFieldalias.setValue(dataObject.getAlias());
        fStringTextFieldringcadence.setValue(dataObject.getRingcadence());
        fStringTextFielddial.setValue(dataObject.getDial());
        fStringTextFieldbusy.setValue(dataObject.getBusy());
        fStringTextFieldring.setValue(dataObject.getRing());
        fStringTextFieldcongestion.setValue(dataObject.getCongestion());
        fStringTextFieldcallwaiting.setValue(dataObject.getCallwaiting());
        fStringTextFielddialrecall.setValue(dataObject.getDialrecall());
        fStringTextFieldrecord.setValue(dataObject.getRecord());
        fStringTextFieldinfo.setValue(dataObject.getInfo());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setCountrycode(fStringTextFieldcountrycode.getValue());
        dataObject.setDescription(fStringTextFielddescription.getValue());
        dataObject.setAlias(fStringTextFieldalias.getValue());
        dataObject.setRingcadence(fStringTextFieldringcadence.getValue());
        dataObject.setDial(fStringTextFielddial.getValue());
        dataObject.setBusy(fStringTextFieldbusy.getValue());
        dataObject.setRing(fStringTextFieldring.getValue());
        dataObject.setCongestion(fStringTextFieldcongestion.getValue());
        dataObject.setCallwaiting(fStringTextFieldcallwaiting.getValue());
        dataObject.setDialrecall(fStringTextFielddialrecall.getValue());
        dataObject.setRecord(fStringTextFieldrecord.getValue());
        dataObject.setInfo(fStringTextFieldinfo.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param ToneDefinitions
     */
    public void setDataObject(Object aToneDefinitions) {
        // abstractdataObject = (AbstractConfigObject) aToneDefinitions;
        setDataObject((ToneDefinitions) aToneDefinitions);
        // dataObject = aToneDefinitions;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param ToneDefinitions
     */
    public void setDataObject(ToneDefinitions aToneDefinitions) {
        // abstractdataObject = (AbstractConfigObject) aToneDefinitions;
        dataObject = aToneDefinitions;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldcountrycode;

    protected javax.swing.JLabel fJLabelcountrycode;

    protected javax.swing.JPanel fJPanelcountrycode;

    protected StringTextField fStringTextFielddescription;

    protected javax.swing.JLabel fJLabeldescription;

    protected javax.swing.JPanel fJPaneldescription;

    protected StringTextField fStringTextFieldalias;

    protected javax.swing.JLabel fJLabelalias;

    protected javax.swing.JPanel fJPanelalias;

    protected StringTextField fStringTextFieldringcadence;

    protected javax.swing.JLabel fJLabelringcadence;

    protected javax.swing.JPanel fJPanelringcadence;

    protected StringTextField fStringTextFielddial;

    protected javax.swing.JLabel fJLabeldial;

    protected javax.swing.JPanel fJPaneldial;

    protected StringTextField fStringTextFieldbusy;

    protected javax.swing.JLabel fJLabelbusy;

    protected javax.swing.JPanel fJPanelbusy;

    protected StringTextField fStringTextFieldring;

    protected javax.swing.JLabel fJLabelring;

    protected javax.swing.JPanel fJPanelring;

    protected StringTextField fStringTextFieldcongestion;

    protected javax.swing.JLabel fJLabelcongestion;

    protected javax.swing.JPanel fJPanelcongestion;

    protected StringTextField fStringTextFieldcallwaiting;

    protected javax.swing.JLabel fJLabelcallwaiting;

    protected javax.swing.JPanel fJPanelcallwaiting;

    protected StringTextField fStringTextFielddialrecall;

    protected javax.swing.JLabel fJLabeldialrecall;

    protected javax.swing.JPanel fJPaneldialrecall;

    protected StringTextField fStringTextFieldrecord;

    protected javax.swing.JLabel fJLabelrecord;

    protected javax.swing.JPanel fJPanelrecord;

    protected StringTextField fStringTextFieldinfo;

    protected javax.swing.JLabel fJLabelinfo;

    protected javax.swing.JPanel fJPanelinfo;

    // start DB field countrycode
    /**
     * This method initializes fStringTextFieldcountrycode
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcountrycode() {
        if (fStringTextFieldcountrycode == null) {
            try {
                fStringTextFieldcountrycode = new StringTextField(); // Generated
                fStringTextFieldcountrycode
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcountrycode;
    }

    /**
     * This method initializes fJLabelcountrycode
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcountrycode() {
        if (fJLabelcountrycode == null) {
            try {
                fJLabelcountrycode = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcountrycode.setText(resBundel
                        .getString("res_strcountrycodeDisplayName")); // Generated
                fJLabelcountrycode.setToolTipText(resBundel
                        .getString("res_strcountrycodeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcountrycode;
    }

    /**
     * This method initializes fJPanelcountrycode
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcountrycode() {
        if (fJPanelcountrycode == null) {
            try {
                fJPanelcountrycode = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcountrycode.setLayout(layFlowLayout); // Generated
                fJPanelcountrycode.add(getJLabelcountrycode(), null); // Generated
                fJPanelcountrycode.add(getStringTextFieldcountrycode(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcountrycode;
    }

    // end DB field countrycode
    // start DB field description
    /**
     * This method initializes fStringTextFielddescription
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddescription() {
        if (fStringTextFielddescription == null) {
            try {
                fStringTextFielddescription = new StringTextField(); // Generated
                fStringTextFielddescription
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddescription;
    }

    /**
     * This method initializes fJLabeldescription
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldescription() {
        if (fJLabeldescription == null) {
            try {
                fJLabeldescription = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldescription.setText(resBundel
                        .getString("res_strdescriptionDisplayName")); // Generated
                fJLabeldescription.setToolTipText(resBundel
                        .getString("res_strdescriptionDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldescription;
    }

    /**
     * This method initializes fJPaneldescription
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldescription() {
        if (fJPaneldescription == null) {
            try {
                fJPaneldescription = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldescription.setLayout(layFlowLayout); // Generated
                fJPaneldescription.add(getJLabeldescription(), null); // Generated
                fJPaneldescription.add(getStringTextFielddescription(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldescription;
    }

    // end DB field description
    // start DB field alias
    /**
     * This method initializes fStringTextFieldalias
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldalias() {
        if (fStringTextFieldalias == null) {
            try {
                fStringTextFieldalias = new StringTextField(); // Generated
                fStringTextFieldalias.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldalias;
    }

    /**
     * This method initializes fJLabelalias
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelalias() {
        if (fJLabelalias == null) {
            try {
                fJLabelalias = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelalias.setText(resBundel
                        .getString("res_straliasDisplayName")); // Generated
                fJLabelalias.setToolTipText(resBundel
                        .getString("res_straliasDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelalias;
    }

    /**
     * This method initializes fJPanelalias
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelalias() {
        if (fJPanelalias == null) {
            try {
                fJPanelalias = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelalias.setLayout(layFlowLayout); // Generated
                fJPanelalias.add(getJLabelalias(), null); // Generated
                fJPanelalias.add(getStringTextFieldalias(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelalias;
    }

    // end DB field alias
    // start DB field ringcadence
    /**
     * This method initializes fStringTextFieldringcadence
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldringcadence() {
        if (fStringTextFieldringcadence == null) {
            try {
                fStringTextFieldringcadence = new StringTextField(); // Generated
                fStringTextFieldringcadence
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldringcadence;
    }

    /**
     * This method initializes fJLabelringcadence
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelringcadence() {
        if (fJLabelringcadence == null) {
            try {
                fJLabelringcadence = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelringcadence.setText(resBundel
                        .getString("res_strringcadenceDisplayName")); // Generated
                fJLabelringcadence.setToolTipText(resBundel
                        .getString("res_strringcadenceDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelringcadence;
    }

    /**
     * This method initializes fJPanelringcadence
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelringcadence() {
        if (fJPanelringcadence == null) {
            try {
                fJPanelringcadence = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelringcadence.setLayout(layFlowLayout); // Generated
                fJPanelringcadence.add(getJLabelringcadence(), null); // Generated
                fJPanelringcadence.add(getStringTextFieldringcadence(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelringcadence;
    }

    // end DB field ringcadence
    // start DB field dial
    /**
     * This method initializes fStringTextFielddial
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddial() {
        if (fStringTextFielddial == null) {
            try {
                fStringTextFielddial = new StringTextField(); // Generated
                fStringTextFielddial.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddial;
    }

    /**
     * This method initializes fJLabeldial
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldial() {
        if (fJLabeldial == null) {
            try {
                fJLabeldial = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldial.setText(resBundel
                        .getString("res_strdialDisplayName")); // Generated
                fJLabeldial.setToolTipText(resBundel
                        .getString("res_strdialDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldial;
    }

    /**
     * This method initializes fJPaneldial
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldial() {
        if (fJPaneldial == null) {
            try {
                fJPaneldial = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldial.setLayout(layFlowLayout); // Generated
                fJPaneldial.add(getJLabeldial(), null); // Generated
                fJPaneldial.add(getStringTextFielddial(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldial;
    }

    // end DB field dial
    // start DB field busy
    /**
     * This method initializes fStringTextFieldbusy
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldbusy() {
        if (fStringTextFieldbusy == null) {
            try {
                fStringTextFieldbusy = new StringTextField(); // Generated
                fStringTextFieldbusy.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldbusy;
    }

    /**
     * This method initializes fJLabelbusy
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelbusy() {
        if (fJLabelbusy == null) {
            try {
                fJLabelbusy = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelbusy.setText(resBundel
                        .getString("res_strbusyDisplayName")); // Generated
                fJLabelbusy.setToolTipText(resBundel
                        .getString("res_strbusyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelbusy;
    }

    /**
     * This method initializes fJPanelbusy
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelbusy() {
        if (fJPanelbusy == null) {
            try {
                fJPanelbusy = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelbusy.setLayout(layFlowLayout); // Generated
                fJPanelbusy.add(getJLabelbusy(), null); // Generated
                fJPanelbusy.add(getStringTextFieldbusy(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelbusy;
    }

    // end DB field busy
    // start DB field ring
    /**
     * This method initializes fStringTextFieldring
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldring() {
        if (fStringTextFieldring == null) {
            try {
                fStringTextFieldring = new StringTextField(); // Generated
                fStringTextFieldring.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldring;
    }

    /**
     * This method initializes fJLabelring
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelring() {
        if (fJLabelring == null) {
            try {
                fJLabelring = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelring.setText(resBundel
                        .getString("res_strringDisplayName")); // Generated
                fJLabelring.setToolTipText(resBundel
                        .getString("res_strringDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelring;
    }

    /**
     * This method initializes fJPanelring
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelring() {
        if (fJPanelring == null) {
            try {
                fJPanelring = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelring.setLayout(layFlowLayout); // Generated
                fJPanelring.add(getJLabelring(), null); // Generated
                fJPanelring.add(getStringTextFieldring(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelring;
    }

    // end DB field ring
    // start DB field congestion
    /**
     * This method initializes fStringTextFieldcongestion
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcongestion() {
        if (fStringTextFieldcongestion == null) {
            try {
                fStringTextFieldcongestion = new StringTextField(); // Generated
                fStringTextFieldcongestion
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcongestion;
    }

    /**
     * This method initializes fJLabelcongestion
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcongestion() {
        if (fJLabelcongestion == null) {
            try {
                fJLabelcongestion = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcongestion.setText(resBundel
                        .getString("res_strcongestionDisplayName")); // Generated
                fJLabelcongestion.setToolTipText(resBundel
                        .getString("res_strcongestionDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcongestion;
    }

    /**
     * This method initializes fJPanelcongestion
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcongestion() {
        if (fJPanelcongestion == null) {
            try {
                fJPanelcongestion = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcongestion.setLayout(layFlowLayout); // Generated
                fJPanelcongestion.add(getJLabelcongestion(), null); // Generated
                fJPanelcongestion.add(getStringTextFieldcongestion(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcongestion;
    }

    // end DB field congestion
    // start DB field callwaiting
    /**
     * This method initializes fStringTextFieldcallwaiting
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcallwaiting() {
        if (fStringTextFieldcallwaiting == null) {
            try {
                fStringTextFieldcallwaiting = new StringTextField(); // Generated
                fStringTextFieldcallwaiting
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcallwaiting;
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
                fJPanelcallwaiting.add(getStringTextFieldcallwaiting(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcallwaiting;
    }

    // end DB field callwaiting
    // start DB field dialrecall
    /**
     * This method initializes fStringTextFielddialrecall
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddialrecall() {
        if (fStringTextFielddialrecall == null) {
            try {
                fStringTextFielddialrecall = new StringTextField(); // Generated
                fStringTextFielddialrecall
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddialrecall;
    }

    /**
     * This method initializes fJLabeldialrecall
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldialrecall() {
        if (fJLabeldialrecall == null) {
            try {
                fJLabeldialrecall = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldialrecall.setText(resBundel
                        .getString("res_strdialrecallDisplayName")); // Generated
                fJLabeldialrecall.setToolTipText(resBundel
                        .getString("res_strdialrecallDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldialrecall;
    }

    /**
     * This method initializes fJPaneldialrecall
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldialrecall() {
        if (fJPaneldialrecall == null) {
            try {
                fJPaneldialrecall = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldialrecall.setLayout(layFlowLayout); // Generated
                fJPaneldialrecall.add(getJLabeldialrecall(), null); // Generated
                fJPaneldialrecall.add(getStringTextFielddialrecall(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldialrecall;
    }

    // end DB field dialrecall
    // start DB field record
    /**
     * This method initializes fStringTextFieldrecord
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldrecord() {
        if (fStringTextFieldrecord == null) {
            try {
                fStringTextFieldrecord = new StringTextField(); // Generated
                fStringTextFieldrecord.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldrecord;
    }

    /**
     * This method initializes fJLabelrecord
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrecord() {
        if (fJLabelrecord == null) {
            try {
                fJLabelrecord = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelrecord.setText(resBundel
                        .getString("res_strrecordDisplayName")); // Generated
                fJLabelrecord.setToolTipText(resBundel
                        .getString("res_strrecordDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelrecord;
    }

    /**
     * This method initializes fJPanelrecord
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrecord() {
        if (fJPanelrecord == null) {
            try {
                fJPanelrecord = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrecord.setLayout(layFlowLayout); // Generated
                fJPanelrecord.add(getJLabelrecord(), null); // Generated
                fJPanelrecord.add(getStringTextFieldrecord(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrecord;
    }

    // end DB field record
    // start DB field info
    /**
     * This method initializes fStringTextFieldinfo
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldinfo() {
        if (fStringTextFieldinfo == null) {
            try {
                fStringTextFieldinfo = new StringTextField(); // Generated
                fStringTextFieldinfo.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldinfo;
    }

    /**
     * This method initializes fJLabelinfo
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelinfo() {
        if (fJLabelinfo == null) {
            try {
                fJLabelinfo = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelinfo.setText(resBundel
                        .getString("res_strinfoDisplayName")); // Generated
                fJLabelinfo.setToolTipText(resBundel
                        .getString("res_strinfoDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelinfo;
    }

    /**
     * This method initializes fJPanelinfo
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelinfo() {
        if (fJPanelinfo == null) {
            try {
                fJPanelinfo = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelinfo.setLayout(layFlowLayout); // Generated
                fJPanelinfo.add(getJLabelinfo(), null); // Generated
                fJPanelinfo.add(getStringTextFieldinfo(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelinfo;
    }
    // end DB field info

}
