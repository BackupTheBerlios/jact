package com.useit.jact.gui.agentconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.agentconf.Agentsconf;

/**
 * <p>
 * AgentsconfDataPanel
 * </p>
 * Created : Tue Dec 27 16:21:48 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentsconfDataPanel.java,v 1.4 2005/12/29
 *          19:14:24 urs Exp $
 */
public class AgentsconfDataPanel extends SimpleDataObjectPanel {
    protected Agentsconf dataObject;

    // protected AgentsconfChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public AgentsconfDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAgentsconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAgentsconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/AgentsconfResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * AgentsconfCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fStringTextFieldautologoff, fStringTextFieldackcall,
     * fStringTextFieldwrapuptime, fStringTextFieldmusic_class,
     * fStringTextFieldcustom_beep, fStringTextFieldgroup, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (7) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(7); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelautologoff(), null); // Generated
        this.add(getJPanelackcall(), null); // Generated
        this.add(getJPanelwrapuptime(), null); // Generated
        this.add(getJPanelmusic_class(), null); // Generated
        this.add(getJPanelcustom_beep(), null); // Generated
        this.add(getJPanelgroup(), null); // Generated
        // this.add(getJPanelagentsrecording(),null);
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldautologoff.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldackcall.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldwrapuptime.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldmusic_class.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldcustom_beep.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldgroup.getDocument().addDocumentListener(textChangeAct);

        // fJComboBoxagentsrecording.addActionListener(textChangeAct);
    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldautologoff.setValue(dataObject.getAutologoff());
        fStringTextFieldackcall.setValue(dataObject.getAckcall());
        fStringTextFieldwrapuptime.setValue(dataObject.getWrapuptime());
        fStringTextFieldmusic_class.setValue(dataObject.getMusic_class());
        fStringTextFieldcustom_beep.setValue(dataObject.getCustom_beep());
        fStringTextFieldgroup.setValue(dataObject.getGroup());

        // fJComboBoxagentsrecording.setSelectedItem(dataObject.getAgentsrecording());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setAutologoff(fStringTextFieldautologoff.getValue());
        dataObject.setAckcall(fStringTextFieldackcall.getValue());
        dataObject.setWrapuptime(fStringTextFieldwrapuptime.getValue());
        dataObject.setMusic_class(fStringTextFieldmusic_class.getValue());
        dataObject.setCustom_beep(fStringTextFieldcustom_beep.getValue());
        dataObject.setGroup(fStringTextFieldgroup.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Agentsconf
     */
    public void setDataObject(Object aAgentsconf) {
        // abstractdataObject = (AbstractConfigObject) aAgentsconf;
        setDataObject((Agentsconf) aAgentsconf);
        // dataObject = aAgentsconf;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Agentsconf
     */
    public void setDataObject(Agentsconf aAgentsconf) {
        // abstractdataObject = (AbstractConfigObject) aAgentsconf;
        dataObject = aAgentsconf;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldautologoff;

    protected javax.swing.JLabel fJLabelautologoff;

    protected javax.swing.JPanel fJPanelautologoff;

    protected StringTextField fStringTextFieldackcall;

    protected javax.swing.JLabel fJLabelackcall;

    protected javax.swing.JPanel fJPanelackcall;

    protected StringTextField fStringTextFieldwrapuptime;

    protected javax.swing.JLabel fJLabelwrapuptime;

    protected javax.swing.JPanel fJPanelwrapuptime;

    protected StringTextField fStringTextFieldmusic_class;

    protected javax.swing.JLabel fJLabelmusic_class;

    protected javax.swing.JPanel fJPanelmusic_class;

    protected StringTextField fStringTextFieldcustom_beep;

    protected javax.swing.JLabel fJLabelcustom_beep;

    protected javax.swing.JPanel fJPanelcustom_beep;

    protected StringTextField fStringTextFieldgroup;

    protected javax.swing.JLabel fJLabelgroup;

    protected javax.swing.JPanel fJPanelgroup;

    // start DB field autologoff
    /**
     * This method initializes fStringTextFieldautologoff
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldautologoff() {
        if (fStringTextFieldautologoff == null) {
            try {
                fStringTextFieldautologoff = new StringTextField(); // Generated
                fStringTextFieldautologoff
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldautologoff;
    }

    /**
     * This method initializes fJLabelautologoff
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelautologoff() {
        if (fJLabelautologoff == null) {
            try {
                fJLabelautologoff = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelautologoff.setText(resBundel
                        .getString("res_strautologoffDisplayName")); // Generated
                fJLabelautologoff.setToolTipText(resBundel
                        .getString("res_strautologoffDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelautologoff;
    }

    /**
     * This method initializes fJPanelautologoff
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelautologoff() {
        if (fJPanelautologoff == null) {
            try {
                fJPanelautologoff = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelautologoff.setLayout(layFlowLayout); // Generated
                fJPanelautologoff.add(getJLabelautologoff(), null); // Generated
                fJPanelautologoff.add(getStringTextFieldautologoff(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelautologoff;
    }

    // end DB field autologoff
    // start DB field ackcall
    /**
     * This method initializes fStringTextFieldackcall
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldackcall() {
        if (fStringTextFieldackcall == null) {
            try {
                fStringTextFieldackcall = new StringTextField(); // Generated
                fStringTextFieldackcall
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldackcall;
    }

    /**
     * This method initializes fJLabelackcall
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelackcall() {
        if (fJLabelackcall == null) {
            try {
                fJLabelackcall = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelackcall.setText(resBundel
                        .getString("res_strackcallDisplayName")); // Generated
                fJLabelackcall.setToolTipText(resBundel
                        .getString("res_strackcallDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelackcall;
    }

    /**
     * This method initializes fJPanelackcall
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelackcall() {
        if (fJPanelackcall == null) {
            try {
                fJPanelackcall = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelackcall.setLayout(layFlowLayout); // Generated
                fJPanelackcall.add(getJLabelackcall(), null); // Generated
                fJPanelackcall.add(getStringTextFieldackcall(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelackcall;
    }

    // end DB field ackcall
    // start DB field wrapuptime
    /**
     * This method initializes fStringTextFieldwrapuptime
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldwrapuptime() {
        if (fStringTextFieldwrapuptime == null) {
            try {
                fStringTextFieldwrapuptime = new StringTextField(); // Generated
                fStringTextFieldwrapuptime
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldwrapuptime;
    }

    /**
     * This method initializes fJLabelwrapuptime
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelwrapuptime() {
        if (fJLabelwrapuptime == null) {
            try {
                fJLabelwrapuptime = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelwrapuptime.setText(resBundel
                        .getString("res_strwrapuptimeDisplayName")); // Generated
                fJLabelwrapuptime.setToolTipText(resBundel
                        .getString("res_strwrapuptimeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelwrapuptime;
    }

    /**
     * This method initializes fJPanelwrapuptime
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelwrapuptime() {
        if (fJPanelwrapuptime == null) {
            try {
                fJPanelwrapuptime = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelwrapuptime.setLayout(layFlowLayout); // Generated
                fJPanelwrapuptime.add(getJLabelwrapuptime(), null); // Generated
                fJPanelwrapuptime.add(getStringTextFieldwrapuptime(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelwrapuptime;
    }

    // end DB field wrapuptime
    // start DB field music_class
    /**
     * This method initializes fStringTextFieldmusic_class
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmusic_class() {
        if (fStringTextFieldmusic_class == null) {
            try {
                fStringTextFieldmusic_class = new StringTextField(); // Generated
                fStringTextFieldmusic_class
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmusic_class;
    }

    /**
     * This method initializes fJLabelmusic_class
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmusic_class() {
        if (fJLabelmusic_class == null) {
            try {
                fJLabelmusic_class = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmusic_class.setText(resBundel
                        .getString("res_strmusic_classDisplayName")); // Generated
                fJLabelmusic_class.setToolTipText(resBundel
                        .getString("res_strmusic_classDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmusic_class;
    }

    /**
     * This method initializes fJPanelmusic_class
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmusic_class() {
        if (fJPanelmusic_class == null) {
            try {
                fJPanelmusic_class = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmusic_class.setLayout(layFlowLayout); // Generated
                fJPanelmusic_class.add(getJLabelmusic_class(), null); // Generated
                fJPanelmusic_class.add(getStringTextFieldmusic_class(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmusic_class;
    }

    // end DB field music_class
    // start DB field custom_beep
    /**
     * This method initializes fStringTextFieldcustom_beep
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcustom_beep() {
        if (fStringTextFieldcustom_beep == null) {
            try {
                fStringTextFieldcustom_beep = new StringTextField(); // Generated
                fStringTextFieldcustom_beep
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcustom_beep;
    }

    /**
     * This method initializes fJLabelcustom_beep
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcustom_beep() {
        if (fJLabelcustom_beep == null) {
            try {
                fJLabelcustom_beep = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcustom_beep.setText(resBundel
                        .getString("res_strcustom_beepDisplayName")); // Generated
                fJLabelcustom_beep.setToolTipText(resBundel
                        .getString("res_strcustom_beepDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcustom_beep;
    }

    /**
     * This method initializes fJPanelcustom_beep
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcustom_beep() {
        if (fJPanelcustom_beep == null) {
            try {
                fJPanelcustom_beep = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcustom_beep.setLayout(layFlowLayout); // Generated
                fJPanelcustom_beep.add(getJLabelcustom_beep(), null); // Generated
                fJPanelcustom_beep.add(getStringTextFieldcustom_beep(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcustom_beep;
    }

    // end DB field custom_beep
    // start DB field group
    /**
     * This method initializes fStringTextFieldgroup
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldgroup() {
        if (fStringTextFieldgroup == null) {
            try {
                fStringTextFieldgroup = new StringTextField(); // Generated
                fStringTextFieldgroup.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldgroup;
    }

    /**
     * This method initializes fJLabelgroup
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelgroup() {
        if (fJLabelgroup == null) {
            try {
                fJLabelgroup = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelgroup.setText(resBundel
                        .getString("res_strgroupDisplayName")); // Generated
                fJLabelgroup.setToolTipText(resBundel
                        .getString("res_strgroupDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelgroup;
    }

    /**
     * This method initializes fJPanelgroup
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelgroup() {
        if (fJPanelgroup == null) {
            try {
                fJPanelgroup = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelgroup.setLayout(layFlowLayout); // Generated
                fJPanelgroup.add(getJLabelgroup(), null); // Generated
                fJPanelgroup.add(getStringTextFieldgroup(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelgroup;
    }
    // end DB field group

}
