package com.useit.jact.gui.voicemailconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.voicemailconf.Voicemailcontextentry;

/**
 * <p>
 * VoicemailcontextentryDataPanel
 * </p>
 * Created : Fri Jan 13 20:29:30 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailcontextentryDataPanel.java,v 1.6
 *          2006/01/14 15:00:13 urs Exp $
 */
public class VoicemailcontextentryDataPanel extends SimpleDataObjectPanel {
    protected Voicemailcontextentry dataObject;

    // protected VoicemailcontextentryChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public VoicemailcontextentryDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getVoicemailcontextentryResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getVoicemailcontextentryResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/VoicemailcontextentryResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * VoicemailcontextentryCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fStringTextFieldmailbox,
     * fStringTextFieldvoicemail_password, fStringTextFielduser_name,
     * fStringTextFielduser_email_address, fStringTextFieldpager_email_address,
     * fStringTextFielduser_options, }; dataChecker.initChecker(array); }
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
        this.add(getJPanelmailbox(), null); // Generated
        this.add(getJPanelvoicemail_password(), null); // Generated
        this.add(getJPaneluser_name(), null); // Generated
        this.add(getJPaneluser_email_address(), null); // Generated
        this.add(getJPanelpager_email_address(), null); // Generated
        this.add(getJPaneluser_options(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldmailbox.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldvoicemail_password.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielduser_name.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielduser_email_address.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldpager_email_address.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielduser_options.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldmailbox.setValue(dataObject.getMailbox());
        fStringTextFieldvoicemail_password.setValue(dataObject
                .getVoicemail_password());
        fStringTextFielduser_name.setValue(dataObject.getUser_name());
        fStringTextFielduser_email_address.setValue(dataObject
                .getUser_email_address());
        fStringTextFieldpager_email_address.setValue(dataObject
                .getPager_email_address());
        fStringTextFielduser_options.setValue(dataObject.getUser_options());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setMailbox(fStringTextFieldmailbox.getValue());
        dataObject.setVoicemail_password(fStringTextFieldvoicemail_password
                .getValue());
        dataObject.setUser_name(fStringTextFielduser_name.getValue());
        dataObject.setUser_email_address(fStringTextFielduser_email_address
                .getValue());
        dataObject.setPager_email_address(fStringTextFieldpager_email_address
                .getValue());
        dataObject.setUser_options(fStringTextFielduser_options.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Voicemailcontextentry
     */
    public void setDataObject(Object aVoicemailcontextentry) {
        // abstractdataObject = (AbstractConfigObject) aVoicemailcontextentry;
        setDataObject((Voicemailcontextentry) aVoicemailcontextentry);
        // dataObject = aVoicemailcontextentry;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Voicemailcontextentry
     */
    public void setDataObject(Voicemailcontextentry aVoicemailcontextentry) {
        // abstractdataObject = (AbstractConfigObject) aVoicemailcontextentry;
        dataObject = aVoicemailcontextentry;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldmailbox;

    protected javax.swing.JLabel fJLabelmailbox;

    protected javax.swing.JPanel fJPanelmailbox;

    protected StringTextField fStringTextFieldvoicemail_password;

    protected javax.swing.JLabel fJLabelvoicemail_password;

    protected javax.swing.JPanel fJPanelvoicemail_password;

    protected StringTextField fStringTextFielduser_name;

    protected javax.swing.JLabel fJLabeluser_name;

    protected javax.swing.JPanel fJPaneluser_name;

    protected StringTextField fStringTextFielduser_email_address;

    protected javax.swing.JLabel fJLabeluser_email_address;

    protected javax.swing.JPanel fJPaneluser_email_address;

    protected StringTextField fStringTextFieldpager_email_address;

    protected javax.swing.JLabel fJLabelpager_email_address;

    protected javax.swing.JPanel fJPanelpager_email_address;

    protected StringTextField fStringTextFielduser_options;

    protected javax.swing.JLabel fJLabeluser_options;

    protected javax.swing.JPanel fJPaneluser_options;

    // start DB field mailbox
    /**
     * This method initializes fStringTextFieldmailbox
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmailbox() {
        if (fStringTextFieldmailbox == null) {
            try {
                fStringTextFieldmailbox = new StringTextField(); // Generated
                fStringTextFieldmailbox
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmailbox;
    }

    /**
     * This method initializes fJLabelmailbox
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmailbox() {
        if (fJLabelmailbox == null) {
            try {
                fJLabelmailbox = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmailbox.setText(resBundel
                        .getString("res_strmailboxDisplayName")); // Generated
                fJLabelmailbox.setToolTipText(resBundel
                        .getString("res_strmailboxDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmailbox;
    }

    /**
     * This method initializes fJPanelmailbox
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmailbox() {
        if (fJPanelmailbox == null) {
            try {
                fJPanelmailbox = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmailbox.setLayout(layFlowLayout); // Generated
                fJPanelmailbox.add(getJLabelmailbox(), null); // Generated
                fJPanelmailbox.add(getStringTextFieldmailbox(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmailbox;
    }

    // end DB field mailbox
    // start DB field voicemail_password
    /**
     * This method initializes fStringTextFieldvoicemail_password
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvoicemail_password() {
        if (fStringTextFieldvoicemail_password == null) {
            try {
                fStringTextFieldvoicemail_password = new StringTextField(); // Generated
                fStringTextFieldvoicemail_password
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvoicemail_password;
    }

    /**
     * This method initializes fJLabelvoicemail_password
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvoicemail_password() {
        if (fJLabelvoicemail_password == null) {
            try {
                fJLabelvoicemail_password = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelvoicemail_password.setText(resBundel
                        .getString("res_strvoicemail_passwordDisplayName")); // Generated
                fJLabelvoicemail_password.setToolTipText(resBundel
                        .getString("res_strvoicemail_passwordDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelvoicemail_password;
    }

    /**
     * This method initializes fJPanelvoicemail_password
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvoicemail_password() {
        if (fJPanelvoicemail_password == null) {
            try {
                fJPanelvoicemail_password = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvoicemail_password.setLayout(layFlowLayout); // Generated
                fJPanelvoicemail_password.add(getJLabelvoicemail_password(),
                        null); // Generated
                fJPanelvoicemail_password.add(
                        getStringTextFieldvoicemail_password(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvoicemail_password;
    }

    // end DB field voicemail_password
    // start DB field user_name
    /**
     * This method initializes fStringTextFielduser_name
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielduser_name() {
        if (fStringTextFielduser_name == null) {
            try {
                fStringTextFielduser_name = new StringTextField(); // Generated
                fStringTextFielduser_name
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielduser_name;
    }

    /**
     * This method initializes fJLabeluser_name
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeluser_name() {
        if (fJLabeluser_name == null) {
            try {
                fJLabeluser_name = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeluser_name.setText(resBundel
                        .getString("res_struser_nameDisplayName")); // Generated
                fJLabeluser_name.setToolTipText(resBundel
                        .getString("res_struser_nameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeluser_name;
    }

    /**
     * This method initializes fJPaneluser_name
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneluser_name() {
        if (fJPaneluser_name == null) {
            try {
                fJPaneluser_name = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneluser_name.setLayout(layFlowLayout); // Generated
                fJPaneluser_name.add(getJLabeluser_name(), null); // Generated
                fJPaneluser_name.add(getStringTextFielduser_name(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneluser_name;
    }

    // end DB field user_name
    // start DB field user_email_address
    /**
     * This method initializes fStringTextFielduser_email_address
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielduser_email_address() {
        if (fStringTextFielduser_email_address == null) {
            try {
                fStringTextFielduser_email_address = new StringTextField(); // Generated
                fStringTextFielduser_email_address
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielduser_email_address;
    }

    /**
     * This method initializes fJLabeluser_email_address
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeluser_email_address() {
        if (fJLabeluser_email_address == null) {
            try {
                fJLabeluser_email_address = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeluser_email_address.setText(resBundel
                        .getString("res_struser_email_addressDisplayName")); // Generated
                fJLabeluser_email_address.setToolTipText(resBundel
                        .getString("res_struser_email_addressDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeluser_email_address;
    }

    /**
     * This method initializes fJPaneluser_email_address
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneluser_email_address() {
        if (fJPaneluser_email_address == null) {
            try {
                fJPaneluser_email_address = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneluser_email_address.setLayout(layFlowLayout); // Generated
                fJPaneluser_email_address.add(getJLabeluser_email_address(),
                        null); // Generated
                fJPaneluser_email_address.add(
                        getStringTextFielduser_email_address(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneluser_email_address;
    }

    // end DB field user_email_address
    // start DB field pager_email_address
    /**
     * This method initializes fStringTextFieldpager_email_address
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpager_email_address() {
        if (fStringTextFieldpager_email_address == null) {
            try {
                fStringTextFieldpager_email_address = new StringTextField(); // Generated
                fStringTextFieldpager_email_address
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpager_email_address;
    }

    /**
     * This method initializes fJLabelpager_email_address
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpager_email_address() {
        if (fJLabelpager_email_address == null) {
            try {
                fJLabelpager_email_address = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpager_email_address.setText(resBundel
                        .getString("res_strpager_email_addressDisplayName")); // Generated
                fJLabelpager_email_address.setToolTipText(resBundel
                        .getString("res_strpager_email_addressDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpager_email_address;
    }

    /**
     * This method initializes fJPanelpager_email_address
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpager_email_address() {
        if (fJPanelpager_email_address == null) {
            try {
                fJPanelpager_email_address = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpager_email_address.setLayout(layFlowLayout); // Generated
                fJPanelpager_email_address.add(getJLabelpager_email_address(),
                        null); // Generated
                fJPanelpager_email_address.add(
                        getStringTextFieldpager_email_address(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpager_email_address;
    }

    // end DB field pager_email_address
    // start DB field user_options
    /**
     * This method initializes fStringTextFielduser_options
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielduser_options() {
        if (fStringTextFielduser_options == null) {
            try {
                fStringTextFielduser_options = new StringTextField(); // Generated
                fStringTextFielduser_options
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielduser_options;
    }

    /**
     * This method initializes fJLabeluser_options
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeluser_options() {
        if (fJLabeluser_options == null) {
            try {
                fJLabeluser_options = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeluser_options.setText(resBundel
                        .getString("res_struser_optionsDisplayName")); // Generated
                fJLabeluser_options.setToolTipText(resBundel
                        .getString("res_struser_optionsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeluser_options;
    }

    /**
     * This method initializes fJPaneluser_options
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneluser_options() {
        if (fJPaneluser_options == null) {
            try {
                fJPaneluser_options = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneluser_options.setLayout(layFlowLayout); // Generated
                fJPaneluser_options.add(getJLabeluser_options(), null); // Generated
                fJPaneluser_options.add(getStringTextFielduser_options(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneluser_options;
    }
    // end DB field user_options

}
