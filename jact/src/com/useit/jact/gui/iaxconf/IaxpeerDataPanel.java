package com.useit.jact.gui.iaxconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.EnumSetTextFieldCodecs;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.JEnumComboboxPeerType;
import com.useit.jact.gui.widgets.PbxContextTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.iaxconf.Iaxpeer;

/**
 * <p>
 * IaxpeerDataPanel
 * </p>
 * Created : Thu Dec 29 11:59:38 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxpeerDataPanel.java,v 1.4 2005/12/29
 *          19:14:15 urs Exp $
 */
public class IaxpeerDataPanel extends SimpleDataObjectPanel {
    protected Iaxpeer dataObject;

    // protected IaxpeerChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IaxpeerDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIaxpeerResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIaxpeerResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/IaxpeerResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * IaxpeerCheckerImpl(resBundel); //abstractDataChecker = dataChecker;
     * 
     * Object[] array = { fJEnumComboboxPeerTypepeertype,
     * fStringTextFieldcallerid, fStringTextFieldauth, fStringTextFieldsecret,
     * fStringTextFieldinkeys, fStringTextFieldhost, fStringTextFielddefaultip,
     * fPbxContextTextFieldcontext, fStringTextFielddbsecret,
     * fStringTextFieldsetvar, fPbxContextTextFieldpeercontext,
     * fIntegerTextFieldqualify, fCustomCheckBoxtrunk, fStringTextFieldtimezone,
     * fStringTextFieldregexten, fEnumSetTextFieldCodecsdisallow,
     * fEnumSetTextFieldCodecsallow, fStringTextFieldmailbox,
     * fStringTextFieldaccountcode, fStringTextFieldoutkey,
     * fCustomCheckBoxnotransfer, fCustomCheckBoxqualifysmoothing,
     * fIntegerTextFieldqualifyfreqok, fIntegerTextFieldqualifyfreqnotok, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (25) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(25); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneliaxpeername(), null); // Generated
        this.add(getJPanelpeertype(), null); // Generated
        this.add(getJPanelcallerid(), null); // Generated
        this.add(getJPanelauth(), null); // Generated
        this.add(getJPanelsecret(), null); // Generated
        this.add(getJPanelinkeys(), null); // Generated
        this.add(getJPanelhost(), null); // Generated
        this.add(getJPaneldefaultip(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPaneldbsecret(), null); // Generated
        this.add(getJPanelsetvar(), null); // Generated
        this.add(getJPanelpeercontext(), null); // Generated
        this.add(getJPanelqualify(), null); // Generated
        this.add(getJPaneltrunk(), null); // Generated
        this.add(getJPaneltimezone(), null); // Generated
        this.add(getJPanelregexten(), null); // Generated
        this.add(getJPaneldisallow(), null); // Generated
        this.add(getJPanelallow(), null); // Generated
        this.add(getJPanelmailbox(), null); // Generated
        this.add(getJPanelaccountcode(), null); // Generated
        this.add(getJPaneloutkey(), null); // Generated
        this.add(getJPanelnotransfer(), null); // Generated
        this.add(getJPanelqualifysmoothing(), null); // Generated
        this.add(getJPanelqualifyfreqok(), null); // Generated
        this.add(getJPanelqualifyfreqnotok(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fStringTextFieldiaxpeername.getDocument().addDocumentListener(
                textChangeAct);
        fJEnumComboboxPeerTypepeertype.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldcallerid.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldauth.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldsecret.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldinkeys.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldhost.getDocument().addDocumentListener(textChangeAct);
        fStringTextFielddefaultip.getDocument().addDocumentListener(
                textChangeAct);
        fPbxContextTextFieldcontext.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielddbsecret.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldsetvar.getDocument().addDocumentListener(textChangeAct);
        fPbxContextTextFieldpeercontext.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldqualify.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxtrunk.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldtimezone.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldregexten.getDocument().addDocumentListener(
                textChangeAct);
        fEnumSetTextFieldCodecsdisallow.getDocument().addDocumentListener(
                textChangeAct);
        fEnumSetTextFieldCodecsallow.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldmailbox.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldaccountcode.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldoutkey.getDocument().addDocumentListener(textChangeAct);
        fCustomCheckBoxnotransfer.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxqualifysmoothing.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldqualifyfreqok.getDocument().addDocumentListener(
                textChangeAct);
        fIntegerTextFieldqualifyfreqnotok.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fStringTextFieldiaxpeername.setValue(dataObject.getIaxpeername());
        fJEnumComboboxPeerTypepeertype.setValue(dataObject.getPeertype());
        fStringTextFieldcallerid.setValue(dataObject.getCallerid());
        fStringTextFieldauth.setValue(dataObject.getAuth());
        fStringTextFieldsecret.setValue(dataObject.getSecret());
        fStringTextFieldinkeys.setValue(dataObject.getInkeys());
        fStringTextFieldhost.setValue(dataObject.getHost());
        fStringTextFielddefaultip.setValue(dataObject.getDefaultip());
        fPbxContextTextFieldcontext.setValue(dataObject.getContext());
        fStringTextFielddbsecret.setValue(dataObject.getDbsecret());
        fStringTextFieldsetvar.setValue(dataObject.getSetvar());
        fPbxContextTextFieldpeercontext.setValue(dataObject.getPeercontext());
        fIntegerTextFieldqualify.setValue(dataObject.getQualify());
        fCustomCheckBoxtrunk.setValue(dataObject.getTrunk());
        fStringTextFieldtimezone.setValue(dataObject.getTimezone());
        fStringTextFieldregexten.setValue(dataObject.getRegexten());
        fEnumSetTextFieldCodecsdisallow.setValue(dataObject.getDisallow());
        fEnumSetTextFieldCodecsallow.setValue(dataObject.getAllow());
        fStringTextFieldmailbox.setValue(dataObject.getMailbox());
        fStringTextFieldaccountcode.setValue(dataObject.getAccountcode());
        fStringTextFieldoutkey.setValue(dataObject.getOutkey());
        fCustomCheckBoxnotransfer.setValue(dataObject.getNotransfer());
        fCustomCheckBoxqualifysmoothing.setValue(dataObject
                .getQualifysmoothing());
        fIntegerTextFieldqualifyfreqok.setValue(dataObject.getQualifyfreqok());
        fIntegerTextFieldqualifyfreqnotok.setValue(dataObject
                .getQualifyfreqnotok());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setIaxpeername(fStringTextFieldiaxpeername.getValue());
        dataObject.setPeertype(fJEnumComboboxPeerTypepeertype.getValue());
        dataObject.setCallerid(fStringTextFieldcallerid.getValue());
        dataObject.setAuth(fStringTextFieldauth.getValue());
        dataObject.setSecret(fStringTextFieldsecret.getValue());
        dataObject.setInkeys(fStringTextFieldinkeys.getValue());
        dataObject.setHost(fStringTextFieldhost.getValue());
        dataObject.setDefaultip(fStringTextFielddefaultip.getValue());
        dataObject.setContext(fPbxContextTextFieldcontext.getValue());
        dataObject.setDbsecret(fStringTextFielddbsecret.getValue());
        dataObject.setSetvar(fStringTextFieldsetvar.getValue());
        dataObject.setPeercontext(fPbxContextTextFieldpeercontext.getValue());
        dataObject.setQualify(fIntegerTextFieldqualify.getValue());
        dataObject.setTrunk(fCustomCheckBoxtrunk.getValue());
        dataObject.setTimezone(fStringTextFieldtimezone.getValue());
        dataObject.setRegexten(fStringTextFieldregexten.getValue());
        dataObject.setDisallow(fEnumSetTextFieldCodecsdisallow.getValue());
        dataObject.setAllow(fEnumSetTextFieldCodecsallow.getValue());
        dataObject.setMailbox(fStringTextFieldmailbox.getValue());
        dataObject.setAccountcode(fStringTextFieldaccountcode.getValue());
        dataObject.setOutkey(fStringTextFieldoutkey.getValue());
        dataObject.setNotransfer(fCustomCheckBoxnotransfer.getValue());
        dataObject.setQualifysmoothing(fCustomCheckBoxqualifysmoothing
                .getValue());
        dataObject.setQualifyfreqok(fIntegerTextFieldqualifyfreqok.getValue());
        dataObject.setQualifyfreqnotok(fIntegerTextFieldqualifyfreqnotok
                .getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Iaxpeer
     */
    public void setDataObject(Object aIaxpeer) {
        // abstractdataObject = (AbstractConfigObject) aIaxpeer;
        setDataObject((Iaxpeer) aIaxpeer);
        // dataObject = aIaxpeer;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Iaxpeer
     */
    public void setDataObject(Iaxpeer aIaxpeer) {
        // abstractdataObject = (AbstractConfigObject) aIaxpeer;
        dataObject = aIaxpeer;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldiaxpeername;

    protected javax.swing.JLabel fJLabeliaxpeername;

    protected javax.swing.JPanel fJPaneliaxpeername;

    protected JEnumComboboxPeerType fJEnumComboboxPeerTypepeertype;

    protected javax.swing.JLabel fJLabelpeertype;

    protected javax.swing.JPanel fJPanelpeertype;

    protected StringTextField fStringTextFieldcallerid;

    protected javax.swing.JLabel fJLabelcallerid;

    protected javax.swing.JPanel fJPanelcallerid;

    protected StringTextField fStringTextFieldauth;

    protected javax.swing.JLabel fJLabelauth;

    protected javax.swing.JPanel fJPanelauth;

    protected StringTextField fStringTextFieldsecret;

    protected javax.swing.JLabel fJLabelsecret;

    protected javax.swing.JPanel fJPanelsecret;

    protected StringTextField fStringTextFieldinkeys;

    protected javax.swing.JLabel fJLabelinkeys;

    protected javax.swing.JPanel fJPanelinkeys;

    protected StringTextField fStringTextFieldhost;

    protected javax.swing.JLabel fJLabelhost;

    protected javax.swing.JPanel fJPanelhost;

    protected StringTextField fStringTextFielddefaultip;

    protected javax.swing.JLabel fJLabeldefaultip;

    protected javax.swing.JPanel fJPaneldefaultip;

    protected PbxContextTextField fPbxContextTextFieldcontext;

    protected javax.swing.JLabel fJLabelcontext;

    protected javax.swing.JPanel fJPanelcontext;

    protected StringTextField fStringTextFielddbsecret;

    protected javax.swing.JLabel fJLabeldbsecret;

    protected javax.swing.JPanel fJPaneldbsecret;

    protected StringTextField fStringTextFieldsetvar;

    protected javax.swing.JLabel fJLabelsetvar;

    protected javax.swing.JPanel fJPanelsetvar;

    protected PbxContextTextField fPbxContextTextFieldpeercontext;

    protected javax.swing.JLabel fJLabelpeercontext;

    protected javax.swing.JPanel fJPanelpeercontext;

    protected IntegerTextField fIntegerTextFieldqualify;

    protected javax.swing.JLabel fJLabelqualify;

    protected javax.swing.JPanel fJPanelqualify;

    protected CustomCheckBox fCustomCheckBoxtrunk;

    protected javax.swing.JLabel fJLabeltrunk;

    protected javax.swing.JPanel fJPaneltrunk;

    protected StringTextField fStringTextFieldtimezone;

    protected javax.swing.JLabel fJLabeltimezone;

    protected javax.swing.JPanel fJPaneltimezone;

    protected StringTextField fStringTextFieldregexten;

    protected javax.swing.JLabel fJLabelregexten;

    protected javax.swing.JPanel fJPanelregexten;

    protected EnumSetTextFieldCodecs fEnumSetTextFieldCodecsdisallow;

    protected javax.swing.JLabel fJLabeldisallow;

    protected javax.swing.JPanel fJPaneldisallow;

    protected EnumSetTextFieldCodecs fEnumSetTextFieldCodecsallow;

    protected javax.swing.JLabel fJLabelallow;

    protected javax.swing.JPanel fJPanelallow;

    protected StringTextField fStringTextFieldmailbox;

    protected javax.swing.JLabel fJLabelmailbox;

    protected javax.swing.JPanel fJPanelmailbox;

    protected StringTextField fStringTextFieldaccountcode;

    protected javax.swing.JLabel fJLabelaccountcode;

    protected javax.swing.JPanel fJPanelaccountcode;

    protected StringTextField fStringTextFieldoutkey;

    protected javax.swing.JLabel fJLabeloutkey;

    protected javax.swing.JPanel fJPaneloutkey;

    protected CustomCheckBox fCustomCheckBoxnotransfer;

    protected javax.swing.JLabel fJLabelnotransfer;

    protected javax.swing.JPanel fJPanelnotransfer;

    protected CustomCheckBox fCustomCheckBoxqualifysmoothing;

    protected javax.swing.JLabel fJLabelqualifysmoothing;

    protected javax.swing.JPanel fJPanelqualifysmoothing;

    protected IntegerTextField fIntegerTextFieldqualifyfreqok;

    protected javax.swing.JLabel fJLabelqualifyfreqok;

    protected javax.swing.JPanel fJPanelqualifyfreqok;

    protected IntegerTextField fIntegerTextFieldqualifyfreqnotok;

    protected javax.swing.JLabel fJLabelqualifyfreqnotok;

    protected javax.swing.JPanel fJPanelqualifyfreqnotok;

    // start DB field iaxpeername
    /**
     * This method initializes fStringTextFieldiaxpeername
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldiaxpeername() {
        if (fStringTextFieldiaxpeername == null) {
            try {
                fStringTextFieldiaxpeername = new StringTextField(); // Generated
                fStringTextFieldiaxpeername
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldiaxpeername;
    }

    /**
     * This method initializes fJLabeliaxpeername
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeliaxpeername() {
        if (fJLabeliaxpeername == null) {
            try {
                fJLabeliaxpeername = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeliaxpeername.setText(resBundel
                        .getString("res_striaxpeernameDisplayName")); // Generated
                fJLabeliaxpeername.setToolTipText(resBundel
                        .getString("res_striaxpeernameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeliaxpeername;
    }

    /**
     * This method initializes fJPaneliaxpeername
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneliaxpeername() {
        if (fJPaneliaxpeername == null) {
            try {
                fJPaneliaxpeername = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneliaxpeername.setLayout(layFlowLayout); // Generated
                fJPaneliaxpeername.add(getJLabeliaxpeername(), null); // Generated
                fJPaneliaxpeername.add(getStringTextFieldiaxpeername(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneliaxpeername;
    }

    // end DB field iaxpeername
    // start DB field peertype
    /**
     * This method initializes fJEnumComboboxPeerTypepeertype
     * 
     * @return JEnumComboboxPeerType
     */
    public JEnumComboboxPeerType getJEnumComboboxPeerTypepeertype() {
        if (fJEnumComboboxPeerTypepeertype == null) {
            try {
                fJEnumComboboxPeerTypepeertype = new JEnumComboboxPeerType(); // Generated
                fJEnumComboboxPeerTypepeertype
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJEnumComboboxPeerTypepeertype;
    }

    /**
     * This method initializes fJLabelpeertype
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpeertype() {
        if (fJLabelpeertype == null) {
            try {
                fJLabelpeertype = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpeertype.setText(resBundel
                        .getString("res_strpeertypeDisplayName")); // Generated
                fJLabelpeertype.setToolTipText(resBundel
                        .getString("res_strpeertypeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpeertype;
    }

    /**
     * This method initializes fJPanelpeertype
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpeertype() {
        if (fJPanelpeertype == null) {
            try {
                fJPanelpeertype = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpeertype.setLayout(layFlowLayout); // Generated
                fJPanelpeertype.add(getJLabelpeertype(), null); // Generated
                fJPanelpeertype.add(getJEnumComboboxPeerTypepeertype(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpeertype;
    }

    // end DB field peertype
    // start DB field callerid
    /**
     * This method initializes fStringTextFieldcallerid
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcallerid() {
        if (fStringTextFieldcallerid == null) {
            try {
                fStringTextFieldcallerid = new StringTextField(); // Generated
                fStringTextFieldcallerid
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcallerid;
    }

    /**
     * This method initializes fJLabelcallerid
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcallerid() {
        if (fJLabelcallerid == null) {
            try {
                fJLabelcallerid = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcallerid.setText(resBundel
                        .getString("res_strcalleridDisplayName")); // Generated
                fJLabelcallerid.setToolTipText(resBundel
                        .getString("res_strcalleridDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcallerid;
    }

    /**
     * This method initializes fJPanelcallerid
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcallerid() {
        if (fJPanelcallerid == null) {
            try {
                fJPanelcallerid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcallerid.setLayout(layFlowLayout); // Generated
                fJPanelcallerid.add(getJLabelcallerid(), null); // Generated
                fJPanelcallerid.add(getStringTextFieldcallerid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcallerid;
    }

    // end DB field callerid
    // start DB field auth
    /**
     * This method initializes fStringTextFieldauth
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldauth() {
        if (fStringTextFieldauth == null) {
            try {
                fStringTextFieldauth = new StringTextField(); // Generated
                fStringTextFieldauth.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldauth;
    }

    /**
     * This method initializes fJLabelauth
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelauth() {
        if (fJLabelauth == null) {
            try {
                fJLabelauth = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelauth.setText(resBundel
                        .getString("res_strauthDisplayName")); // Generated
                fJLabelauth.setToolTipText(resBundel
                        .getString("res_strauthDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelauth;
    }

    /**
     * This method initializes fJPanelauth
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelauth() {
        if (fJPanelauth == null) {
            try {
                fJPanelauth = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelauth.setLayout(layFlowLayout); // Generated
                fJPanelauth.add(getJLabelauth(), null); // Generated
                fJPanelauth.add(getStringTextFieldauth(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelauth;
    }

    // end DB field auth
    // start DB field secret
    /**
     * This method initializes fStringTextFieldsecret
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsecret() {
        if (fStringTextFieldsecret == null) {
            try {
                fStringTextFieldsecret = new StringTextField(); // Generated
                fStringTextFieldsecret.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsecret;
    }

    /**
     * This method initializes fJLabelsecret
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsecret() {
        if (fJLabelsecret == null) {
            try {
                fJLabelsecret = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelsecret.setText(resBundel
                        .getString("res_strsecretDisplayName")); // Generated
                fJLabelsecret.setToolTipText(resBundel
                        .getString("res_strsecretDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelsecret;
    }

    /**
     * This method initializes fJPanelsecret
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsecret() {
        if (fJPanelsecret == null) {
            try {
                fJPanelsecret = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsecret.setLayout(layFlowLayout); // Generated
                fJPanelsecret.add(getJLabelsecret(), null); // Generated
                fJPanelsecret.add(getStringTextFieldsecret(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsecret;
    }

    // end DB field secret
    // start DB field inkeys
    /**
     * This method initializes fStringTextFieldinkeys
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldinkeys() {
        if (fStringTextFieldinkeys == null) {
            try {
                fStringTextFieldinkeys = new StringTextField(); // Generated
                fStringTextFieldinkeys.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldinkeys;
    }

    /**
     * This method initializes fJLabelinkeys
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelinkeys() {
        if (fJLabelinkeys == null) {
            try {
                fJLabelinkeys = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelinkeys.setText(resBundel
                        .getString("res_strinkeysDisplayName")); // Generated
                fJLabelinkeys.setToolTipText(resBundel
                        .getString("res_strinkeysDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelinkeys;
    }

    /**
     * This method initializes fJPanelinkeys
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelinkeys() {
        if (fJPanelinkeys == null) {
            try {
                fJPanelinkeys = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelinkeys.setLayout(layFlowLayout); // Generated
                fJPanelinkeys.add(getJLabelinkeys(), null); // Generated
                fJPanelinkeys.add(getStringTextFieldinkeys(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelinkeys;
    }

    // end DB field inkeys
    // start DB field host
    /**
     * This method initializes fStringTextFieldhost
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldhost() {
        if (fStringTextFieldhost == null) {
            try {
                fStringTextFieldhost = new StringTextField(); // Generated
                fStringTextFieldhost.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldhost;
    }

    /**
     * This method initializes fJLabelhost
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelhost() {
        if (fJLabelhost == null) {
            try {
                fJLabelhost = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelhost.setText(resBundel
                        .getString("res_strhostDisplayName")); // Generated
                fJLabelhost.setToolTipText(resBundel
                        .getString("res_strhostDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelhost;
    }

    /**
     * This method initializes fJPanelhost
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelhost() {
        if (fJPanelhost == null) {
            try {
                fJPanelhost = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelhost.setLayout(layFlowLayout); // Generated
                fJPanelhost.add(getJLabelhost(), null); // Generated
                fJPanelhost.add(getStringTextFieldhost(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelhost;
    }

    // end DB field host
    // start DB field defaultip
    /**
     * This method initializes fStringTextFielddefaultip
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddefaultip() {
        if (fStringTextFielddefaultip == null) {
            try {
                fStringTextFielddefaultip = new StringTextField(); // Generated
                fStringTextFielddefaultip
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddefaultip;
    }

    /**
     * This method initializes fJLabeldefaultip
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldefaultip() {
        if (fJLabeldefaultip == null) {
            try {
                fJLabeldefaultip = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldefaultip.setText(resBundel
                        .getString("res_strdefaultipDisplayName")); // Generated
                fJLabeldefaultip.setToolTipText(resBundel
                        .getString("res_strdefaultipDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldefaultip;
    }

    /**
     * This method initializes fJPaneldefaultip
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldefaultip() {
        if (fJPaneldefaultip == null) {
            try {
                fJPaneldefaultip = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldefaultip.setLayout(layFlowLayout); // Generated
                fJPaneldefaultip.add(getJLabeldefaultip(), null); // Generated
                fJPaneldefaultip.add(getStringTextFielddefaultip(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldefaultip;
    }

    // end DB field defaultip
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
    // start DB field dbsecret
    /**
     * This method initializes fStringTextFielddbsecret
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddbsecret() {
        if (fStringTextFielddbsecret == null) {
            try {
                fStringTextFielddbsecret = new StringTextField(); // Generated
                fStringTextFielddbsecret
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddbsecret;
    }

    /**
     * This method initializes fJLabeldbsecret
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldbsecret() {
        if (fJLabeldbsecret == null) {
            try {
                fJLabeldbsecret = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldbsecret.setText(resBundel
                        .getString("res_strdbsecretDisplayName")); // Generated
                fJLabeldbsecret.setToolTipText(resBundel
                        .getString("res_strdbsecretDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldbsecret;
    }

    /**
     * This method initializes fJPaneldbsecret
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldbsecret() {
        if (fJPaneldbsecret == null) {
            try {
                fJPaneldbsecret = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldbsecret.setLayout(layFlowLayout); // Generated
                fJPaneldbsecret.add(getJLabeldbsecret(), null); // Generated
                fJPaneldbsecret.add(getStringTextFielddbsecret(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldbsecret;
    }

    // end DB field dbsecret
    // start DB field setvar
    /**
     * This method initializes fStringTextFieldsetvar
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsetvar() {
        if (fStringTextFieldsetvar == null) {
            try {
                fStringTextFieldsetvar = new StringTextField(); // Generated
                fStringTextFieldsetvar.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsetvar;
    }

    /**
     * This method initializes fJLabelsetvar
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsetvar() {
        if (fJLabelsetvar == null) {
            try {
                fJLabelsetvar = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelsetvar.setText(resBundel
                        .getString("res_strsetvarDisplayName")); // Generated
                fJLabelsetvar.setToolTipText(resBundel
                        .getString("res_strsetvarDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelsetvar;
    }

    /**
     * This method initializes fJPanelsetvar
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsetvar() {
        if (fJPanelsetvar == null) {
            try {
                fJPanelsetvar = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsetvar.setLayout(layFlowLayout); // Generated
                fJPanelsetvar.add(getJLabelsetvar(), null); // Generated
                fJPanelsetvar.add(getStringTextFieldsetvar(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsetvar;
    }

    // end DB field setvar
    // start DB field peercontext
    /**
     * This method initializes fPbxContextTextFieldpeercontext
     * 
     * @return PbxContextTextField
     */
    public PbxContextTextField getPbxContextTextFieldpeercontext() {
        if (fPbxContextTextFieldpeercontext == null) {
            try {
                fPbxContextTextFieldpeercontext = new PbxContextTextField(); // Generated
                fPbxContextTextFieldpeercontext
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fPbxContextTextFieldpeercontext;
    }

    /**
     * This method initializes fJLabelpeercontext
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpeercontext() {
        if (fJLabelpeercontext == null) {
            try {
                fJLabelpeercontext = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpeercontext.setText(resBundel
                        .getString("res_strpeercontextDisplayName")); // Generated
                fJLabelpeercontext.setToolTipText(resBundel
                        .getString("res_strpeercontextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpeercontext;
    }

    /**
     * This method initializes fJPanelpeercontext
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpeercontext() {
        if (fJPanelpeercontext == null) {
            try {
                fJPanelpeercontext = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpeercontext.setLayout(layFlowLayout); // Generated
                fJPanelpeercontext.add(getJLabelpeercontext(), null); // Generated
                fJPanelpeercontext.add(getPbxContextTextFieldpeercontext(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpeercontext;
    }

    // end DB field peercontext
    // start DB field qualify
    /**
     * This method initializes fIntegerTextFieldqualify
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldqualify() {
        if (fIntegerTextFieldqualify == null) {
            try {
                fIntegerTextFieldqualify = new IntegerTextField(); // Generated
                fIntegerTextFieldqualify
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldqualify;
    }

    /**
     * This method initializes fJLabelqualify
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelqualify() {
        if (fJLabelqualify == null) {
            try {
                fJLabelqualify = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelqualify.setText(resBundel
                        .getString("res_strqualifyDisplayName")); // Generated
                fJLabelqualify.setToolTipText(resBundel
                        .getString("res_strqualifyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelqualify;
    }

    /**
     * This method initializes fJPanelqualify
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelqualify() {
        if (fJPanelqualify == null) {
            try {
                fJPanelqualify = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelqualify.setLayout(layFlowLayout); // Generated
                fJPanelqualify.add(getJLabelqualify(), null); // Generated
                fJPanelqualify.add(getIntegerTextFieldqualify(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelqualify;
    }

    // end DB field qualify
    // start DB field trunk
    /**
     * This method initializes fCustomCheckBoxtrunk
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxtrunk() {
        if (fCustomCheckBoxtrunk == null) {
            try {
                fCustomCheckBoxtrunk = new CustomCheckBox(); // Generated
                fCustomCheckBoxtrunk.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxtrunk;
    }

    /**
     * This method initializes fJLabeltrunk
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltrunk() {
        if (fJLabeltrunk == null) {
            try {
                fJLabeltrunk = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltrunk.setText(resBundel
                        .getString("res_strtrunkDisplayName")); // Generated
                fJLabeltrunk.setToolTipText(resBundel
                        .getString("res_strtrunkDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltrunk;
    }

    /**
     * This method initializes fJPaneltrunk
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltrunk() {
        if (fJPaneltrunk == null) {
            try {
                fJPaneltrunk = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltrunk.setLayout(layFlowLayout); // Generated
                fJPaneltrunk.add(getJLabeltrunk(), null); // Generated
                fJPaneltrunk.add(getCustomCheckBoxtrunk(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltrunk;
    }

    // end DB field trunk
    // start DB field timezone
    /**
     * This method initializes fStringTextFieldtimezone
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtimezone() {
        if (fStringTextFieldtimezone == null) {
            try {
                fStringTextFieldtimezone = new StringTextField(); // Generated
                fStringTextFieldtimezone
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtimezone;
    }

    /**
     * This method initializes fJLabeltimezone
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltimezone() {
        if (fJLabeltimezone == null) {
            try {
                fJLabeltimezone = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeltimezone.setText(resBundel
                        .getString("res_strtimezoneDisplayName")); // Generated
                fJLabeltimezone.setToolTipText(resBundel
                        .getString("res_strtimezoneDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeltimezone;
    }

    /**
     * This method initializes fJPaneltimezone
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltimezone() {
        if (fJPaneltimezone == null) {
            try {
                fJPaneltimezone = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltimezone.setLayout(layFlowLayout); // Generated
                fJPaneltimezone.add(getJLabeltimezone(), null); // Generated
                fJPaneltimezone.add(getStringTextFieldtimezone(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltimezone;
    }

    // end DB field timezone
    // start DB field regexten
    /**
     * This method initializes fStringTextFieldregexten
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldregexten() {
        if (fStringTextFieldregexten == null) {
            try {
                fStringTextFieldregexten = new StringTextField(); // Generated
                fStringTextFieldregexten
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldregexten;
    }

    /**
     * This method initializes fJLabelregexten
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelregexten() {
        if (fJLabelregexten == null) {
            try {
                fJLabelregexten = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelregexten.setText(resBundel
                        .getString("res_strregextenDisplayName")); // Generated
                fJLabelregexten.setToolTipText(resBundel
                        .getString("res_strregextenDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelregexten;
    }

    /**
     * This method initializes fJPanelregexten
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelregexten() {
        if (fJPanelregexten == null) {
            try {
                fJPanelregexten = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelregexten.setLayout(layFlowLayout); // Generated
                fJPanelregexten.add(getJLabelregexten(), null); // Generated
                fJPanelregexten.add(getStringTextFieldregexten(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelregexten;
    }

    // end DB field regexten
    // start DB field disallow
    /**
     * This method initializes fEnumSetTextFieldCodecsdisallow
     * 
     * @return EnumSetTextFieldCodecs
     */
    public EnumSetTextFieldCodecs getEnumSetTextFieldCodecsdisallow() {
        if (fEnumSetTextFieldCodecsdisallow == null) {
            try {
                fEnumSetTextFieldCodecsdisallow = new EnumSetTextFieldCodecs(); // Generated
                fEnumSetTextFieldCodecsdisallow
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fEnumSetTextFieldCodecsdisallow;
    }

    /**
     * This method initializes fJLabeldisallow
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldisallow() {
        if (fJLabeldisallow == null) {
            try {
                fJLabeldisallow = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldisallow.setText(resBundel
                        .getString("res_strdisallowDisplayName")); // Generated
                fJLabeldisallow.setToolTipText(resBundel
                        .getString("res_strdisallowDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldisallow;
    }

    /**
     * This method initializes fJPaneldisallow
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldisallow() {
        if (fJPaneldisallow == null) {
            try {
                fJPaneldisallow = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldisallow.setLayout(layFlowLayout); // Generated
                fJPaneldisallow.add(getJLabeldisallow(), null); // Generated
                fJPaneldisallow.add(getEnumSetTextFieldCodecsdisallow(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldisallow;
    }

    // end DB field disallow
    // start DB field allow
    /**
     * This method initializes fEnumSetTextFieldCodecsallow
     * 
     * @return EnumSetTextFieldCodecs
     */
    public EnumSetTextFieldCodecs getEnumSetTextFieldCodecsallow() {
        if (fEnumSetTextFieldCodecsallow == null) {
            try {
                fEnumSetTextFieldCodecsallow = new EnumSetTextFieldCodecs(); // Generated
                fEnumSetTextFieldCodecsallow
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fEnumSetTextFieldCodecsallow;
    }

    /**
     * This method initializes fJLabelallow
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelallow() {
        if (fJLabelallow == null) {
            try {
                fJLabelallow = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelallow.setText(resBundel
                        .getString("res_strallowDisplayName")); // Generated
                fJLabelallow.setToolTipText(resBundel
                        .getString("res_strallowDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelallow;
    }

    /**
     * This method initializes fJPanelallow
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelallow() {
        if (fJPanelallow == null) {
            try {
                fJPanelallow = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelallow.setLayout(layFlowLayout); // Generated
                fJPanelallow.add(getJLabelallow(), null); // Generated
                fJPanelallow.add(getEnumSetTextFieldCodecsallow(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelallow;
    }

    // end DB field allow
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
    // start DB field accountcode
    /**
     * This method initializes fStringTextFieldaccountcode
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldaccountcode() {
        if (fStringTextFieldaccountcode == null) {
            try {
                fStringTextFieldaccountcode = new StringTextField(); // Generated
                fStringTextFieldaccountcode
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldaccountcode;
    }

    /**
     * This method initializes fJLabelaccountcode
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelaccountcode() {
        if (fJLabelaccountcode == null) {
            try {
                fJLabelaccountcode = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelaccountcode.setText(resBundel
                        .getString("res_straccountcodeDisplayName")); // Generated
                fJLabelaccountcode.setToolTipText(resBundel
                        .getString("res_straccountcodeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelaccountcode;
    }

    /**
     * This method initializes fJPanelaccountcode
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelaccountcode() {
        if (fJPanelaccountcode == null) {
            try {
                fJPanelaccountcode = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelaccountcode.setLayout(layFlowLayout); // Generated
                fJPanelaccountcode.add(getJLabelaccountcode(), null); // Generated
                fJPanelaccountcode.add(getStringTextFieldaccountcode(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelaccountcode;
    }

    // end DB field accountcode
    // start DB field outkey
    /**
     * This method initializes fStringTextFieldoutkey
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldoutkey() {
        if (fStringTextFieldoutkey == null) {
            try {
                fStringTextFieldoutkey = new StringTextField(); // Generated
                fStringTextFieldoutkey.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldoutkey;
    }

    /**
     * This method initializes fJLabeloutkey
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeloutkey() {
        if (fJLabeloutkey == null) {
            try {
                fJLabeloutkey = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeloutkey.setText(resBundel
                        .getString("res_stroutkeyDisplayName")); // Generated
                fJLabeloutkey.setToolTipText(resBundel
                        .getString("res_stroutkeyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeloutkey;
    }

    /**
     * This method initializes fJPaneloutkey
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneloutkey() {
        if (fJPaneloutkey == null) {
            try {
                fJPaneloutkey = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneloutkey.setLayout(layFlowLayout); // Generated
                fJPaneloutkey.add(getJLabeloutkey(), null); // Generated
                fJPaneloutkey.add(getStringTextFieldoutkey(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneloutkey;
    }

    // end DB field outkey
    // start DB field notransfer
    /**
     * This method initializes fCustomCheckBoxnotransfer
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxnotransfer() {
        if (fCustomCheckBoxnotransfer == null) {
            try {
                fCustomCheckBoxnotransfer = new CustomCheckBox(); // Generated
                fCustomCheckBoxnotransfer
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxnotransfer;
    }

    /**
     * This method initializes fJLabelnotransfer
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelnotransfer() {
        if (fJLabelnotransfer == null) {
            try {
                fJLabelnotransfer = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelnotransfer.setText(resBundel
                        .getString("res_strnotransferDisplayName")); // Generated
                fJLabelnotransfer.setToolTipText(resBundel
                        .getString("res_strnotransferDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelnotransfer;
    }

    /**
     * This method initializes fJPanelnotransfer
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelnotransfer() {
        if (fJPanelnotransfer == null) {
            try {
                fJPanelnotransfer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelnotransfer.setLayout(layFlowLayout); // Generated
                fJPanelnotransfer.add(getJLabelnotransfer(), null); // Generated
                fJPanelnotransfer.add(getCustomCheckBoxnotransfer(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelnotransfer;
    }

    // end DB field notransfer
    // start DB field qualifysmoothing
    /**
     * This method initializes fCustomCheckBoxqualifysmoothing
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxqualifysmoothing() {
        if (fCustomCheckBoxqualifysmoothing == null) {
            try {
                fCustomCheckBoxqualifysmoothing = new CustomCheckBox(); // Generated
                fCustomCheckBoxqualifysmoothing
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxqualifysmoothing;
    }

    /**
     * This method initializes fJLabelqualifysmoothing
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelqualifysmoothing() {
        if (fJLabelqualifysmoothing == null) {
            try {
                fJLabelqualifysmoothing = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelqualifysmoothing.setText(resBundel
                        .getString("res_strqualifysmoothingDisplayName")); // Generated
                fJLabelqualifysmoothing.setToolTipText(resBundel
                        .getString("res_strqualifysmoothingDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelqualifysmoothing;
    }

    /**
     * This method initializes fJPanelqualifysmoothing
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelqualifysmoothing() {
        if (fJPanelqualifysmoothing == null) {
            try {
                fJPanelqualifysmoothing = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelqualifysmoothing.setLayout(layFlowLayout); // Generated
                fJPanelqualifysmoothing.add(getJLabelqualifysmoothing(), null); // Generated
                fJPanelqualifysmoothing.add(
                        getCustomCheckBoxqualifysmoothing(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelqualifysmoothing;
    }

    // end DB field qualifysmoothing
    // start DB field qualifyfreqok
    /**
     * This method initializes fIntegerTextFieldqualifyfreqok
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldqualifyfreqok() {
        if (fIntegerTextFieldqualifyfreqok == null) {
            try {
                fIntegerTextFieldqualifyfreqok = new IntegerTextField(); // Generated
                fIntegerTextFieldqualifyfreqok
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldqualifyfreqok;
    }

    /**
     * This method initializes fJLabelqualifyfreqok
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelqualifyfreqok() {
        if (fJLabelqualifyfreqok == null) {
            try {
                fJLabelqualifyfreqok = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelqualifyfreqok.setText(resBundel
                        .getString("res_strqualifyfreqokDisplayName")); // Generated
                fJLabelqualifyfreqok.setToolTipText(resBundel
                        .getString("res_strqualifyfreqokDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelqualifyfreqok;
    }

    /**
     * This method initializes fJPanelqualifyfreqok
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelqualifyfreqok() {
        if (fJPanelqualifyfreqok == null) {
            try {
                fJPanelqualifyfreqok = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelqualifyfreqok.setLayout(layFlowLayout); // Generated
                fJPanelqualifyfreqok.add(getJLabelqualifyfreqok(), null); // Generated
                fJPanelqualifyfreqok.add(getIntegerTextFieldqualifyfreqok(),
                        null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelqualifyfreqok;
    }

    // end DB field qualifyfreqok
    // start DB field qualifyfreqnotok
    /**
     * This method initializes fIntegerTextFieldqualifyfreqnotok
     * 
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldqualifyfreqnotok() {
        if (fIntegerTextFieldqualifyfreqnotok == null) {
            try {
                fIntegerTextFieldqualifyfreqnotok = new IntegerTextField(); // Generated
                fIntegerTextFieldqualifyfreqnotok
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldqualifyfreqnotok;
    }

    /**
     * This method initializes fJLabelqualifyfreqnotok
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelqualifyfreqnotok() {
        if (fJLabelqualifyfreqnotok == null) {
            try {
                fJLabelqualifyfreqnotok = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelqualifyfreqnotok.setText(resBundel
                        .getString("res_strqualifyfreqnotokDisplayName")); // Generated
                fJLabelqualifyfreqnotok.setToolTipText(resBundel
                        .getString("res_strqualifyfreqnotokDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelqualifyfreqnotok;
    }

    /**
     * This method initializes fJPanelqualifyfreqnotok
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelqualifyfreqnotok() {
        if (fJPanelqualifyfreqnotok == null) {
            try {
                fJPanelqualifyfreqnotok = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelqualifyfreqnotok.setLayout(layFlowLayout); // Generated
                fJPanelqualifyfreqnotok.add(getJLabelqualifyfreqnotok(), null); // Generated
                fJPanelqualifyfreqnotok.add(
                        getIntegerTextFieldqualifyfreqnotok(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelqualifyfreqnotok;
    }
    // end DB field qualifyfreqnotok

}
