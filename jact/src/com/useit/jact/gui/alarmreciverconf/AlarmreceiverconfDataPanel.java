package com.useit.jact.gui.alarmreciverconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.alarmreciverconf.Alarmreceiverconf;

/**
 * <p>
 * AlarmreceiverconfDataPanel
 * </p>
 * Created : Thu Dec 29 12:00:25 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AlarmreceiverconfDataPanel.java,v 1.2
 *          2005/12/29 19:14:23 urs Exp $
 */
public class AlarmreceiverconfDataPanel extends SimpleDataObjectPanel {
    protected Alarmreceiverconf dataObject;

    // protected AlarmreceiverconfChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public AlarmreceiverconfDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAlarmreceiverconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAlarmreceiverconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/AlarmreceiverconfResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * AlarmreceiverconfCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFieldtimestampformat,
     * fStringTextFieldeventcmd, fStringTextFieldeventspooldir,
     * fStringTextFieldlogindividualevents, fIntegerTextFieldfdtimeout,
     * fIntegerTextFieldsdtimeout, fIntegerTextFieldloudness,
     * fStringTextFielddbfamily, }; dataChecker.initChecker(array); }
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
        this.add(getJPaneltimestampformat(), null); // Generated
        this.add(getJPaneleventcmd(), null); // Generated
        this.add(getJPaneleventspooldir(), null); // Generated
        this.add(getJPanellogindividualevents(), null); // Generated
        this.add(getJPanelfdtimeout(), null); // Generated
        this.add(getJPanelsdtimeout(), null); // Generated
        this.add(getJPanelloudness(), null); // Generated
        this.add(getJPaneldbfamily(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldtimestampformat.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldeventcmd.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldeventspooldir.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldlogindividualevents.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldfdtimeout.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldsdtimeout.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldloudness.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielddbfamily.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldtimestampformat.setValue(dataObject
                .getTimestampformat());
        fStringTextFieldeventcmd.setValue(dataObject.getEventcmd());
        fStringTextFieldeventspooldir.setValue(dataObject.getEventspooldir());
        fStringTextFieldlogindividualevents.setValue(dataObject
                .getLogindividualevents());
        fIntegerTextFieldfdtimeout.setValue(dataObject.getFdtimeout());
        fIntegerTextFieldsdtimeout.setValue(dataObject.getSdtimeout());
        fIntegerTextFieldloudness.setValue(dataObject.getLoudness());
        fStringTextFielddbfamily.setValue(dataObject.getDbfamily());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setTimestampformat(fStringTextFieldtimestampformat
                .getValue());
        dataObject.setEventcmd(fStringTextFieldeventcmd.getValue());
        dataObject.setEventspooldir(fStringTextFieldeventspooldir.getValue());
        dataObject.setLogindividualevents(fStringTextFieldlogindividualevents
                .getValue());
        dataObject.setFdtimeout(fIntegerTextFieldfdtimeout.getValue());
        dataObject.setSdtimeout(fIntegerTextFieldsdtimeout.getValue());
        dataObject.setLoudness(fIntegerTextFieldloudness.getValue());
        dataObject.setDbfamily(fStringTextFielddbfamily.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Alarmreceiverconf
     */
    public void setDataObject(Object aAlarmreceiverconf) {
        // abstractdataObject = (AbstractConfigObject) aAlarmreceiverconf;
        setDataObject((Alarmreceiverconf) aAlarmreceiverconf);
        // dataObject = aAlarmreceiverconf;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Alarmreceiverconf
     */
    public void setDataObject(Alarmreceiverconf aAlarmreceiverconf) {
        // abstractdataObject = (AbstractConfigObject) aAlarmreceiverconf;
        dataObject = aAlarmreceiverconf;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldtimestampformat;

    protected javax.swing.JLabel fJLabeltimestampformat;

    protected javax.swing.JPanel fJPaneltimestampformat;

    protected StringTextField fStringTextFieldeventcmd;

    protected javax.swing.JLabel fJLabeleventcmd;

    protected javax.swing.JPanel fJPaneleventcmd;

    protected StringTextField fStringTextFieldeventspooldir;

    protected javax.swing.JLabel fJLabeleventspooldir;

    protected javax.swing.JPanel fJPaneleventspooldir;

    protected StringTextField fStringTextFieldlogindividualevents;

    protected javax.swing.JLabel fJLabellogindividualevents;

    protected javax.swing.JPanel fJPanellogindividualevents;

    protected IntegerTextField fIntegerTextFieldfdtimeout;

    protected javax.swing.JLabel fJLabelfdtimeout;

    protected javax.swing.JPanel fJPanelfdtimeout;

    protected IntegerTextField fIntegerTextFieldsdtimeout;

    protected javax.swing.JLabel fJLabelsdtimeout;

    protected javax.swing.JPanel fJPanelsdtimeout;

    protected IntegerTextField fIntegerTextFieldloudness;

    protected javax.swing.JLabel fJLabelloudness;

    protected javax.swing.JPanel fJPanelloudness;

    protected StringTextField fStringTextFielddbfamily;

    protected javax.swing.JLabel fJLabeldbfamily;

    protected javax.swing.JPanel fJPaneldbfamily;

    // start DB field timestampformat
    /**
     * This method initializes fStringTextFieldtimestampformat
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtimestampformat() {
        if (fStringTextFieldtimestampformat == null) {
            try {
                fStringTextFieldtimestampformat = new StringTextField(); // Generated
                fStringTextFieldtimestampformat
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtimestampformat;
    }

    /**
     * This method initializes fJLabeltimestampformat
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltimestampformat() {
        if (fJLabeltimestampformat == null) {
            try {
                fJLabeltimestampformat = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltimestampformat.setText(resBundel
                        .getString("res_strtimestampformatDisplayName")); // Generated
                fJLabeltimestampformat.setToolTipText(resBundel
                        .getString("res_strtimestampformatDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltimestampformat;
    }

    /**
     * This method initializes fJPaneltimestampformat
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltimestampformat() {
        if (fJPaneltimestampformat == null) {
            try {
                fJPaneltimestampformat = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltimestampformat.setLayout(layFlowLayout); // Generated
                fJPaneltimestampformat.add(getJLabeltimestampformat(), null); // Generated
                fJPaneltimestampformat.add(getStringTextFieldtimestampformat(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltimestampformat;
    }

    // end DB field timestampformat
    // start DB field eventcmd
    /**
     * This method initializes fStringTextFieldeventcmd
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldeventcmd() {
        if (fStringTextFieldeventcmd == null) {
            try {
                fStringTextFieldeventcmd = new StringTextField(); // Generated
                fStringTextFieldeventcmd
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldeventcmd;
    }

    /**
     * This method initializes fJLabeleventcmd
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeleventcmd() {
        if (fJLabeleventcmd == null) {
            try {
                fJLabeleventcmd = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeleventcmd.setText(resBundel
                        .getString("res_streventcmdDisplayName")); // Generated
                fJLabeleventcmd.setToolTipText(resBundel
                        .getString("res_streventcmdDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeleventcmd;
    }

    /**
     * This method initializes fJPaneleventcmd
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneleventcmd() {
        if (fJPaneleventcmd == null) {
            try {
                fJPaneleventcmd = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneleventcmd.setLayout(layFlowLayout); // Generated
                fJPaneleventcmd.add(getJLabeleventcmd(), null); // Generated
                fJPaneleventcmd.add(getStringTextFieldeventcmd(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneleventcmd;
    }

    // end DB field eventcmd
    // start DB field eventspooldir
    /**
     * This method initializes fStringTextFieldeventspooldir
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldeventspooldir() {
        if (fStringTextFieldeventspooldir == null) {
            try {
                fStringTextFieldeventspooldir = new StringTextField(); // Generated
                fStringTextFieldeventspooldir
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldeventspooldir;
    }

    /**
     * This method initializes fJLabeleventspooldir
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeleventspooldir() {
        if (fJLabeleventspooldir == null) {
            try {
                fJLabeleventspooldir = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeleventspooldir.setText(resBundel
                        .getString("res_streventspooldirDisplayName")); // Generated
                fJLabeleventspooldir.setToolTipText(resBundel
                        .getString("res_streventspooldirDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeleventspooldir;
    }

    /**
     * This method initializes fJPaneleventspooldir
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneleventspooldir() {
        if (fJPaneleventspooldir == null) {
            try {
                fJPaneleventspooldir = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneleventspooldir.setLayout(layFlowLayout); // Generated
                fJPaneleventspooldir.add(getJLabeleventspooldir(), null); // Generated
                fJPaneleventspooldir.add(getStringTextFieldeventspooldir(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneleventspooldir;
    }

    // end DB field eventspooldir
    // start DB field logindividualevents
    /**
     * This method initializes fStringTextFieldlogindividualevents
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldlogindividualevents() {
        if (fStringTextFieldlogindividualevents == null) {
            try {
                fStringTextFieldlogindividualevents = new StringTextField(); // Generated
                fStringTextFieldlogindividualevents
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldlogindividualevents;
    }

    /**
     * This method initializes fJLabellogindividualevents
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellogindividualevents() {
        if (fJLabellogindividualevents == null) {
            try {
                fJLabellogindividualevents = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabellogindividualevents.setText(resBundel
                        .getString("res_strlogindividualeventsDisplayName")); // Generated
                fJLabellogindividualevents.setToolTipText(resBundel
                        .getString("res_strlogindividualeventsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabellogindividualevents;
    }

    /**
     * This method initializes fJPanellogindividualevents
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellogindividualevents() {
        if (fJPanellogindividualevents == null) {
            try {
                fJPanellogindividualevents = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellogindividualevents.setLayout(layFlowLayout); // Generated
                fJPanellogindividualevents.add(getJLabellogindividualevents(),
                        null); // Generated
                fJPanellogindividualevents.add(
                        getStringTextFieldlogindividualevents(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellogindividualevents;
    }

    // end DB field logindividualevents
    // start DB field fdtimeout
    /**
     * This method initializes fIntegerTextFieldfdtimeout
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldfdtimeout() {
        if (fIntegerTextFieldfdtimeout == null) {
            try {
                fIntegerTextFieldfdtimeout = new IntegerTextField(); // Generated
                fIntegerTextFieldfdtimeout
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldfdtimeout;
    }

    /**
     * This method initializes fJLabelfdtimeout
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfdtimeout() {
        if (fJLabelfdtimeout == null) {
            try {
                fJLabelfdtimeout = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelfdtimeout.setText(resBundel
                        .getString("res_strfdtimeoutDisplayName")); // Generated
                fJLabelfdtimeout.setToolTipText(resBundel
                        .getString("res_strfdtimeoutDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelfdtimeout;
    }

    /**
     * This method initializes fJPanelfdtimeout
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfdtimeout() {
        if (fJPanelfdtimeout == null) {
            try {
                fJPanelfdtimeout = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfdtimeout.setLayout(layFlowLayout); // Generated
                fJPanelfdtimeout.add(getJLabelfdtimeout(), null); // Generated
                fJPanelfdtimeout.add(getIntegerTextFieldfdtimeout(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfdtimeout;
    }

    // end DB field fdtimeout
    // start DB field sdtimeout
    /**
     * This method initializes fIntegerTextFieldsdtimeout
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldsdtimeout() {
        if (fIntegerTextFieldsdtimeout == null) {
            try {
                fIntegerTextFieldsdtimeout = new IntegerTextField(); // Generated
                fIntegerTextFieldsdtimeout
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldsdtimeout;
    }

    /**
     * This method initializes fJLabelsdtimeout
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsdtimeout() {
        if (fJLabelsdtimeout == null) {
            try {
                fJLabelsdtimeout = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelsdtimeout.setText(resBundel
                        .getString("res_strsdtimeoutDisplayName")); // Generated
                fJLabelsdtimeout.setToolTipText(resBundel
                        .getString("res_strsdtimeoutDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelsdtimeout;
    }

    /**
     * This method initializes fJPanelsdtimeout
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsdtimeout() {
        if (fJPanelsdtimeout == null) {
            try {
                fJPanelsdtimeout = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsdtimeout.setLayout(layFlowLayout); // Generated
                fJPanelsdtimeout.add(getJLabelsdtimeout(), null); // Generated
                fJPanelsdtimeout.add(getIntegerTextFieldsdtimeout(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsdtimeout;
    }

    // end DB field sdtimeout
    // start DB field loudness
    /**
     * This method initializes fIntegerTextFieldloudness
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldloudness() {
        if (fIntegerTextFieldloudness == null) {
            try {
                fIntegerTextFieldloudness = new IntegerTextField(); // Generated
                fIntegerTextFieldloudness
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldloudness;
    }

    /**
     * This method initializes fJLabelloudness
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelloudness() {
        if (fJLabelloudness == null) {
            try {
                fJLabelloudness = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelloudness.setText(resBundel
                        .getString("res_strloudnessDisplayName")); // Generated
                fJLabelloudness.setToolTipText(resBundel
                        .getString("res_strloudnessDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelloudness;
    }

    /**
     * This method initializes fJPanelloudness
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelloudness() {
        if (fJPanelloudness == null) {
            try {
                fJPanelloudness = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelloudness.setLayout(layFlowLayout); // Generated
                fJPanelloudness.add(getJLabelloudness(), null); // Generated
                fJPanelloudness.add(getIntegerTextFieldloudness(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelloudness;
    }

    // end DB field loudness
    // start DB field dbfamily
    /**
     * This method initializes fStringTextFielddbfamily
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddbfamily() {
        if (fStringTextFielddbfamily == null) {
            try {
                fStringTextFielddbfamily = new StringTextField(); // Generated
                fStringTextFielddbfamily
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddbfamily;
    }

    /**
     * This method initializes fJLabeldbfamily
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldbfamily() {
        if (fJLabeldbfamily == null) {
            try {
                fJLabeldbfamily = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldbfamily.setText(resBundel
                        .getString("res_strdbfamilyDisplayName")); // Generated
                fJLabeldbfamily.setToolTipText(resBundel
                        .getString("res_strdbfamilyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldbfamily;
    }

    /**
     * This method initializes fJPaneldbfamily
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldbfamily() {
        if (fJPaneldbfamily == null) {
            try {
                fJPaneldbfamily = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldbfamily.setLayout(layFlowLayout); // Generated
                fJPaneldbfamily.add(getJLabeldbfamily(), null); // Generated
                fJPaneldbfamily.add(getStringTextFielddbfamily(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldbfamily;
    }
    // end DB field dbfamily

}
