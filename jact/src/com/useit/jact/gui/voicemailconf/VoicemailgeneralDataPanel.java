package com.useit.jact.gui.voicemailconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.voicemailconf.Voicemailgeneral;

/**
 * <p>
 * VoicemailgeneralDataPanel
 * </p>
 * Created : Fri Jan 13 20:29:26 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailgeneralDataPanel.java,v 1.6
 *          2006/01/14 15:00:13 urs Exp $
 */
public class VoicemailgeneralDataPanel extends SimpleDataObjectPanel {
    protected Voicemailgeneral dataObject;

    // protected VoicemailgeneralChecker dataChecker;

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public VoicemailgeneralDataPanel() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getVoicemailgeneralResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getVoicemailgeneralResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/VoicemailgeneralResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        // initialize();
    }

    /**
     * private void initDatachecker() { //dataChecker = new
     * VoicemailgeneralCheckerImpl(resBundel); //abstractDataChecker =
     * dataChecker;
     * 
     * Object[] array = { fCustomCheckBoxattach, fCustomCheckBoxdelete,
     * fStringTextFieldmailcmd, fStringTextFieldmaxsilence,
     * fStringTextFieldenvelope, fStringTextFieldexternnotify,
     * fStringTextFieldsilencethreshold, fStringTextFieldserveremail,
     * fStringTextFieldmaxmessage, fStringTextFieldminmessage,
     * fStringTextFieldformat, fStringTextFieldmaxgreet, fStringTextFieldskipms,
     * fStringTextFieldmaxlogins, fStringTextFieldcidinternalcontexts,
     * fCustomCheckBoxreview, fCustomCheckBoxoperator, fCustomCheckBoxsaycid,
     * fStringTextFielddialout, fStringTextFieldcallback,
     * fStringTextFielddbuser, fStringTextFielddbpass, fStringTextFielddbhost,
     * fStringTextFielddbname, fStringTextFielddboption,
     * fStringTextFieldpbxskip, fStringTextFieldfromstring,
     * fStringTextFieldemailsubject, fStringTextFieldemailbody,
     * fStringTextFieldexitcontext, fStringTextFieldnextaftercmd, };
     * dataChecker.initChecker(array); }
     * 
     */

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (31) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(31); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelattach(), null); // Generated
        this.add(getJPaneldelete(), null); // Generated
        this.add(getJPanelmailcmd(), null); // Generated
        this.add(getJPanelmaxsilence(), null); // Generated
        this.add(getJPanelenvelope(), null); // Generated
        this.add(getJPanelexternnotify(), null); // Generated
        this.add(getJPanelsilencethreshold(), null); // Generated
        this.add(getJPanelserveremail(), null); // Generated
        this.add(getJPanelmaxmessage(), null); // Generated
        this.add(getJPanelminmessage(), null); // Generated
        this.add(getJPanelformat(), null); // Generated
        this.add(getJPanelmaxgreet(), null); // Generated
        this.add(getJPanelskipms(), null); // Generated
        this.add(getJPanelmaxlogins(), null); // Generated
        this.add(getJPanelcidinternalcontexts(), null); // Generated
        this.add(getJPanelreview(), null); // Generated
        this.add(getJPaneloperator(), null); // Generated
        this.add(getJPanelsaycid(), null); // Generated
        this.add(getJPaneldialout(), null); // Generated
        this.add(getJPanelcallback(), null); // Generated
        this.add(getJPaneldbuser(), null); // Generated
        this.add(getJPaneldbpass(), null); // Generated
        this.add(getJPaneldbhost(), null); // Generated
        this.add(getJPaneldbname(), null); // Generated
        this.add(getJPaneldboption(), null); // Generated
        this.add(getJPanelpbxskip(), null); // Generated
        this.add(getJPanelfromstring(), null); // Generated
        this.add(getJPanelemailsubject(), null); // Generated
        this.add(getJPanelemailbody(), null); // Generated
        this.add(getJPanelexitcontext(), null); // Generated
        this.add(getJPanelnextaftercmd(), null); // Generated
        initActions();
    }

    // -----------------------------
    public void initActions() {
        super.initActions();
        fCustomCheckBoxattach.getDocument().addDocumentListener(textChangeAct);
        fCustomCheckBoxdelete.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldmailcmd.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldmaxsilence.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldenvelope.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldexternnotify.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldsilencethreshold.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldserveremail.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldmaxmessage.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldminmessage.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldformat.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldmaxgreet.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldskipms.getDocument().addDocumentListener(textChangeAct);
        fStringTextFieldmaxlogins.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldcidinternalcontexts.getDocument().addDocumentListener(
                textChangeAct);
        fCustomCheckBoxreview.getDocument().addDocumentListener(textChangeAct);
        fCustomCheckBoxoperator.getDocument()
                .addDocumentListener(textChangeAct);
        fCustomCheckBoxsaycid.getDocument().addDocumentListener(textChangeAct);
        fStringTextFielddialout.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldcallback.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFielddbuser.getDocument().addDocumentListener(textChangeAct);
        fStringTextFielddbpass.getDocument().addDocumentListener(textChangeAct);
        fStringTextFielddbhost.getDocument().addDocumentListener(textChangeAct);
        fStringTextFielddbname.getDocument().addDocumentListener(textChangeAct);
        fStringTextFielddboption.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldpbxskip.getDocument()
                .addDocumentListener(textChangeAct);
        fStringTextFieldfromstring.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldemailsubject.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldemailbody.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldexitcontext.getDocument().addDocumentListener(
                textChangeAct);
        fStringTextFieldnextaftercmd.getDocument().addDocumentListener(
                textChangeAct);

    }

    // ------------------------------
    // set the data
    protected void setConfigToWidget() {
        textChangeAct.setEnabled(false);
        fCustomCheckBoxattach.setValue(dataObject.getAttach());
        fCustomCheckBoxdelete.setValue(dataObject.getDelete());
        fStringTextFieldmailcmd.setValue(dataObject.getMailcmd());
        fStringTextFieldmaxsilence.setValue(dataObject.getMaxsilence());
        fStringTextFieldenvelope.setValue(dataObject.getEnvelope());
        fStringTextFieldexternnotify.setValue(dataObject.getExternnotify());
        fStringTextFieldsilencethreshold.setValue(dataObject
                .getSilencethreshold());
        fStringTextFieldserveremail.setValue(dataObject.getServeremail());
        fStringTextFieldmaxmessage.setValue(dataObject.getMaxmessage());
        fStringTextFieldminmessage.setValue(dataObject.getMinmessage());
        fStringTextFieldformat.setValue(dataObject.getFormat());
        fStringTextFieldmaxgreet.setValue(dataObject.getMaxgreet());
        fStringTextFieldskipms.setValue(dataObject.getSkipms());
        fStringTextFieldmaxlogins.setValue(dataObject.getMaxlogins());
        fStringTextFieldcidinternalcontexts.setValue(dataObject
                .getCidinternalcontexts());
        fCustomCheckBoxreview.setValue(dataObject.getReview());
        fCustomCheckBoxoperator.setValue(dataObject.getOperator());
        fCustomCheckBoxsaycid.setValue(dataObject.getSaycid());
        fStringTextFielddialout.setValue(dataObject.getDialout());
        fStringTextFieldcallback.setValue(dataObject.getCallback());
        fStringTextFielddbuser.setValue(dataObject.getDbuser());
        fStringTextFielddbpass.setValue(dataObject.getDbpass());
        fStringTextFielddbhost.setValue(dataObject.getDbhost());
        fStringTextFielddbname.setValue(dataObject.getDbname());
        fStringTextFielddboption.setValue(dataObject.getDboption());
        fStringTextFieldpbxskip.setValue(dataObject.getPbxskip());
        fStringTextFieldfromstring.setValue(dataObject.getFromstring());
        fStringTextFieldemailsubject.setValue(dataObject.getEmailsubject());
        fStringTextFieldemailbody.setValue(dataObject.getEmailbody());
        fStringTextFieldexitcontext.setValue(dataObject.getExitcontext());
        fStringTextFieldnextaftercmd.setValue(dataObject.getNextaftercmd());

        textChangeAct.setEnabled(true);
    }

    // get the Data
    protected void getConfigFromWidget() {
        dataObject.setAttach(fCustomCheckBoxattach.getValue());
        dataObject.setDelete(fCustomCheckBoxdelete.getValue());
        dataObject.setMailcmd(fStringTextFieldmailcmd.getValue());
        dataObject.setMaxsilence(fStringTextFieldmaxsilence.getValue());
        dataObject.setEnvelope(fStringTextFieldenvelope.getValue());
        dataObject.setExternnotify(fStringTextFieldexternnotify.getValue());
        dataObject.setSilencethreshold(fStringTextFieldsilencethreshold
                .getValue());
        dataObject.setServeremail(fStringTextFieldserveremail.getValue());
        dataObject.setMaxmessage(fStringTextFieldmaxmessage.getValue());
        dataObject.setMinmessage(fStringTextFieldminmessage.getValue());
        dataObject.setFormat(fStringTextFieldformat.getValue());
        dataObject.setMaxgreet(fStringTextFieldmaxgreet.getValue());
        dataObject.setSkipms(fStringTextFieldskipms.getValue());
        dataObject.setMaxlogins(fStringTextFieldmaxlogins.getValue());
        dataObject.setCidinternalcontexts(fStringTextFieldcidinternalcontexts
                .getValue());
        dataObject.setReview(fCustomCheckBoxreview.getValue());
        dataObject.setOperator(fCustomCheckBoxoperator.getValue());
        dataObject.setSaycid(fCustomCheckBoxsaycid.getValue());
        dataObject.setDialout(fStringTextFielddialout.getValue());
        dataObject.setCallback(fStringTextFieldcallback.getValue());
        dataObject.setDbuser(fStringTextFielddbuser.getValue());
        dataObject.setDbpass(fStringTextFielddbpass.getValue());
        dataObject.setDbhost(fStringTextFielddbhost.getValue());
        dataObject.setDbname(fStringTextFielddbname.getValue());
        dataObject.setDboption(fStringTextFielddboption.getValue());
        dataObject.setPbxskip(fStringTextFieldpbxskip.getValue());
        dataObject.setFromstring(fStringTextFieldfromstring.getValue());
        dataObject.setEmailsubject(fStringTextFieldemailsubject.getValue());
        dataObject.setEmailbody(fStringTextFieldemailbody.getValue());
        dataObject.setExitcontext(fStringTextFieldexitcontext.getValue());
        dataObject.setNextaftercmd(fStringTextFieldnextaftercmd.getValue());
    }

    /**
     * setzt das DatenObject
     * 
     * @param Voicemailgeneral
     */
    public void setDataObject(Object aVoicemailgeneral) {
        // abstractdataObject = (AbstractConfigObject) aVoicemailgeneral;
        setDataObject((Voicemailgeneral) aVoicemailgeneral);
        // dataObject = aVoicemailgeneral;
        // setConfigToWidget();
    }

    /**
     * setzt das DatenObject
     * 
     * @param Voicemailgeneral
     */
    public void setDataObject(Voicemailgeneral aVoicemailgeneral) {
        // abstractdataObject = (AbstractConfigObject) aVoicemailgeneral;
        dataObject = aVoicemailgeneral;
        setConfigToWidget();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

    protected CustomCheckBox fCustomCheckBoxattach;

    protected javax.swing.JLabel fJLabelattach;

    protected javax.swing.JPanel fJPanelattach;

    protected CustomCheckBox fCustomCheckBoxdelete;

    protected javax.swing.JLabel fJLabeldelete;

    protected javax.swing.JPanel fJPaneldelete;

    protected StringTextField fStringTextFieldmailcmd;

    protected javax.swing.JLabel fJLabelmailcmd;

    protected javax.swing.JPanel fJPanelmailcmd;

    protected StringTextField fStringTextFieldmaxsilence;

    protected javax.swing.JLabel fJLabelmaxsilence;

    protected javax.swing.JPanel fJPanelmaxsilence;

    protected StringTextField fStringTextFieldenvelope;

    protected javax.swing.JLabel fJLabelenvelope;

    protected javax.swing.JPanel fJPanelenvelope;

    protected StringTextField fStringTextFieldexternnotify;

    protected javax.swing.JLabel fJLabelexternnotify;

    protected javax.swing.JPanel fJPanelexternnotify;

    protected StringTextField fStringTextFieldsilencethreshold;

    protected javax.swing.JLabel fJLabelsilencethreshold;

    protected javax.swing.JPanel fJPanelsilencethreshold;

    protected StringTextField fStringTextFieldserveremail;

    protected javax.swing.JLabel fJLabelserveremail;

    protected javax.swing.JPanel fJPanelserveremail;

    protected StringTextField fStringTextFieldmaxmessage;

    protected javax.swing.JLabel fJLabelmaxmessage;

    protected javax.swing.JPanel fJPanelmaxmessage;

    protected StringTextField fStringTextFieldminmessage;

    protected javax.swing.JLabel fJLabelminmessage;

    protected javax.swing.JPanel fJPanelminmessage;

    protected StringTextField fStringTextFieldformat;

    protected javax.swing.JLabel fJLabelformat;

    protected javax.swing.JPanel fJPanelformat;

    protected StringTextField fStringTextFieldmaxgreet;

    protected javax.swing.JLabel fJLabelmaxgreet;

    protected javax.swing.JPanel fJPanelmaxgreet;

    protected StringTextField fStringTextFieldskipms;

    protected javax.swing.JLabel fJLabelskipms;

    protected javax.swing.JPanel fJPanelskipms;

    protected StringTextField fStringTextFieldmaxlogins;

    protected javax.swing.JLabel fJLabelmaxlogins;

    protected javax.swing.JPanel fJPanelmaxlogins;

    protected StringTextField fStringTextFieldcidinternalcontexts;

    protected javax.swing.JLabel fJLabelcidinternalcontexts;

    protected javax.swing.JPanel fJPanelcidinternalcontexts;

    protected CustomCheckBox fCustomCheckBoxreview;

    protected javax.swing.JLabel fJLabelreview;

    protected javax.swing.JPanel fJPanelreview;

    protected CustomCheckBox fCustomCheckBoxoperator;

    protected javax.swing.JLabel fJLabeloperator;

    protected javax.swing.JPanel fJPaneloperator;

    protected CustomCheckBox fCustomCheckBoxsaycid;

    protected javax.swing.JLabel fJLabelsaycid;

    protected javax.swing.JPanel fJPanelsaycid;

    protected StringTextField fStringTextFielddialout;

    protected javax.swing.JLabel fJLabeldialout;

    protected javax.swing.JPanel fJPaneldialout;

    protected StringTextField fStringTextFieldcallback;

    protected javax.swing.JLabel fJLabelcallback;

    protected javax.swing.JPanel fJPanelcallback;

    protected StringTextField fStringTextFielddbuser;

    protected javax.swing.JLabel fJLabeldbuser;

    protected javax.swing.JPanel fJPaneldbuser;

    protected StringTextField fStringTextFielddbpass;

    protected javax.swing.JLabel fJLabeldbpass;

    protected javax.swing.JPanel fJPaneldbpass;

    protected StringTextField fStringTextFielddbhost;

    protected javax.swing.JLabel fJLabeldbhost;

    protected javax.swing.JPanel fJPaneldbhost;

    protected StringTextField fStringTextFielddbname;

    protected javax.swing.JLabel fJLabeldbname;

    protected javax.swing.JPanel fJPaneldbname;

    protected StringTextField fStringTextFielddboption;

    protected javax.swing.JLabel fJLabeldboption;

    protected javax.swing.JPanel fJPaneldboption;

    protected StringTextField fStringTextFieldpbxskip;

    protected javax.swing.JLabel fJLabelpbxskip;

    protected javax.swing.JPanel fJPanelpbxskip;

    protected StringTextField fStringTextFieldfromstring;

    protected javax.swing.JLabel fJLabelfromstring;

    protected javax.swing.JPanel fJPanelfromstring;

    protected StringTextField fStringTextFieldemailsubject;

    protected javax.swing.JLabel fJLabelemailsubject;

    protected javax.swing.JPanel fJPanelemailsubject;

    protected StringTextField fStringTextFieldemailbody;

    protected javax.swing.JLabel fJLabelemailbody;

    protected javax.swing.JPanel fJPanelemailbody;

    protected StringTextField fStringTextFieldexitcontext;

    protected javax.swing.JLabel fJLabelexitcontext;

    protected javax.swing.JPanel fJPanelexitcontext;

    protected StringTextField fStringTextFieldnextaftercmd;

    protected javax.swing.JLabel fJLabelnextaftercmd;

    protected javax.swing.JPanel fJPanelnextaftercmd;

    // start DB field attach
    /**
     * This method initializes fCustomCheckBoxattach
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxattach() {
        if (fCustomCheckBoxattach == null) {
            try {
                fCustomCheckBoxattach = new CustomCheckBox(); // Generated
                fCustomCheckBoxattach.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxattach;
    }

    /**
     * This method initializes fJLabelattach
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelattach() {
        if (fJLabelattach == null) {
            try {
                fJLabelattach = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelattach.setText(resBundel
                        .getString("res_strattachDisplayName")); // Generated
                fJLabelattach.setToolTipText(resBundel
                        .getString("res_strattachDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelattach;
    }

    /**
     * This method initializes fJPanelattach
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelattach() {
        if (fJPanelattach == null) {
            try {
                fJPanelattach = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelattach.setLayout(layFlowLayout); // Generated
                fJPanelattach.add(getJLabelattach(), null); // Generated
                fJPanelattach.add(getCustomCheckBoxattach(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelattach;
    }

    // end DB field attach
    // start DB field delete
    /**
     * This method initializes fCustomCheckBoxdelete
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxdelete() {
        if (fCustomCheckBoxdelete == null) {
            try {
                fCustomCheckBoxdelete = new CustomCheckBox(); // Generated
                fCustomCheckBoxdelete.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxdelete;
    }

    /**
     * This method initializes fJLabeldelete
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldelete() {
        if (fJLabeldelete == null) {
            try {
                fJLabeldelete = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldelete.setText(resBundel
                        .getString("res_strdeleteDisplayName")); // Generated
                fJLabeldelete.setToolTipText(resBundel
                        .getString("res_strdeleteDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldelete;
    }

    /**
     * This method initializes fJPaneldelete
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldelete() {
        if (fJPaneldelete == null) {
            try {
                fJPaneldelete = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldelete.setLayout(layFlowLayout); // Generated
                fJPaneldelete.add(getJLabeldelete(), null); // Generated
                fJPaneldelete.add(getCustomCheckBoxdelete(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldelete;
    }

    // end DB field delete
    // start DB field mailcmd
    /**
     * This method initializes fStringTextFieldmailcmd
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmailcmd() {
        if (fStringTextFieldmailcmd == null) {
            try {
                fStringTextFieldmailcmd = new StringTextField(); // Generated
                fStringTextFieldmailcmd
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmailcmd;
    }

    /**
     * This method initializes fJLabelmailcmd
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmailcmd() {
        if (fJLabelmailcmd == null) {
            try {
                fJLabelmailcmd = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmailcmd.setText(resBundel
                        .getString("res_strmailcmdDisplayName")); // Generated
                fJLabelmailcmd.setToolTipText(resBundel
                        .getString("res_strmailcmdDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmailcmd;
    }

    /**
     * This method initializes fJPanelmailcmd
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmailcmd() {
        if (fJPanelmailcmd == null) {
            try {
                fJPanelmailcmd = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmailcmd.setLayout(layFlowLayout); // Generated
                fJPanelmailcmd.add(getJLabelmailcmd(), null); // Generated
                fJPanelmailcmd.add(getStringTextFieldmailcmd(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmailcmd;
    }

    // end DB field mailcmd
    // start DB field maxsilence
    /**
     * This method initializes fStringTextFieldmaxsilence
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmaxsilence() {
        if (fStringTextFieldmaxsilence == null) {
            try {
                fStringTextFieldmaxsilence = new StringTextField(); // Generated
                fStringTextFieldmaxsilence
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmaxsilence;
    }

    /**
     * This method initializes fJLabelmaxsilence
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmaxsilence() {
        if (fJLabelmaxsilence == null) {
            try {
                fJLabelmaxsilence = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmaxsilence.setText(resBundel
                        .getString("res_strmaxsilenceDisplayName")); // Generated
                fJLabelmaxsilence.setToolTipText(resBundel
                        .getString("res_strmaxsilenceDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmaxsilence;
    }

    /**
     * This method initializes fJPanelmaxsilence
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmaxsilence() {
        if (fJPanelmaxsilence == null) {
            try {
                fJPanelmaxsilence = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmaxsilence.setLayout(layFlowLayout); // Generated
                fJPanelmaxsilence.add(getJLabelmaxsilence(), null); // Generated
                fJPanelmaxsilence.add(getStringTextFieldmaxsilence(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmaxsilence;
    }

    // end DB field maxsilence
    // start DB field envelope
    /**
     * This method initializes fStringTextFieldenvelope
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldenvelope() {
        if (fStringTextFieldenvelope == null) {
            try {
                fStringTextFieldenvelope = new StringTextField(); // Generated
                fStringTextFieldenvelope
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldenvelope;
    }

    /**
     * This method initializes fJLabelenvelope
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelenvelope() {
        if (fJLabelenvelope == null) {
            try {
                fJLabelenvelope = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelenvelope.setText(resBundel
                        .getString("res_strenvelopeDisplayName")); // Generated
                fJLabelenvelope.setToolTipText(resBundel
                        .getString("res_strenvelopeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelenvelope;
    }

    /**
     * This method initializes fJPanelenvelope
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelenvelope() {
        if (fJPanelenvelope == null) {
            try {
                fJPanelenvelope = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelenvelope.setLayout(layFlowLayout); // Generated
                fJPanelenvelope.add(getJLabelenvelope(), null); // Generated
                fJPanelenvelope.add(getStringTextFieldenvelope(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelenvelope;
    }

    // end DB field envelope
    // start DB field externnotify
    /**
     * This method initializes fStringTextFieldexternnotify
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldexternnotify() {
        if (fStringTextFieldexternnotify == null) {
            try {
                fStringTextFieldexternnotify = new StringTextField(); // Generated
                fStringTextFieldexternnotify
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldexternnotify;
    }

    /**
     * This method initializes fJLabelexternnotify
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelexternnotify() {
        if (fJLabelexternnotify == null) {
            try {
                fJLabelexternnotify = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelexternnotify.setText(resBundel
                        .getString("res_strexternnotifyDisplayName")); // Generated
                fJLabelexternnotify.setToolTipText(resBundel
                        .getString("res_strexternnotifyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelexternnotify;
    }

    /**
     * This method initializes fJPanelexternnotify
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelexternnotify() {
        if (fJPanelexternnotify == null) {
            try {
                fJPanelexternnotify = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelexternnotify.setLayout(layFlowLayout); // Generated
                fJPanelexternnotify.add(getJLabelexternnotify(), null); // Generated
                fJPanelexternnotify.add(getStringTextFieldexternnotify(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelexternnotify;
    }

    // end DB field externnotify
    // start DB field silencethreshold
    /**
     * This method initializes fStringTextFieldsilencethreshold
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsilencethreshold() {
        if (fStringTextFieldsilencethreshold == null) {
            try {
                fStringTextFieldsilencethreshold = new StringTextField(); // Generated
                fStringTextFieldsilencethreshold
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsilencethreshold;
    }

    /**
     * This method initializes fJLabelsilencethreshold
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsilencethreshold() {
        if (fJLabelsilencethreshold == null) {
            try {
                fJLabelsilencethreshold = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelsilencethreshold.setText(resBundel
                        .getString("res_strsilencethresholdDisplayName")); // Generated
                fJLabelsilencethreshold.setToolTipText(resBundel
                        .getString("res_strsilencethresholdDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelsilencethreshold;
    }

    /**
     * This method initializes fJPanelsilencethreshold
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsilencethreshold() {
        if (fJPanelsilencethreshold == null) {
            try {
                fJPanelsilencethreshold = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsilencethreshold.setLayout(layFlowLayout); // Generated
                fJPanelsilencethreshold.add(getJLabelsilencethreshold(), null); // Generated
                fJPanelsilencethreshold.add(
                        getStringTextFieldsilencethreshold(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsilencethreshold;
    }

    // end DB field silencethreshold
    // start DB field serveremail
    /**
     * This method initializes fStringTextFieldserveremail
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldserveremail() {
        if (fStringTextFieldserveremail == null) {
            try {
                fStringTextFieldserveremail = new StringTextField(); // Generated
                fStringTextFieldserveremail
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldserveremail;
    }

    /**
     * This method initializes fJLabelserveremail
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelserveremail() {
        if (fJLabelserveremail == null) {
            try {
                fJLabelserveremail = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelserveremail.setText(resBundel
                        .getString("res_strserveremailDisplayName")); // Generated
                fJLabelserveremail.setToolTipText(resBundel
                        .getString("res_strserveremailDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelserveremail;
    }

    /**
     * This method initializes fJPanelserveremail
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelserveremail() {
        if (fJPanelserveremail == null) {
            try {
                fJPanelserveremail = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelserveremail.setLayout(layFlowLayout); // Generated
                fJPanelserveremail.add(getJLabelserveremail(), null); // Generated
                fJPanelserveremail.add(getStringTextFieldserveremail(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelserveremail;
    }

    // end DB field serveremail
    // start DB field maxmessage
    /**
     * This method initializes fStringTextFieldmaxmessage
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmaxmessage() {
        if (fStringTextFieldmaxmessage == null) {
            try {
                fStringTextFieldmaxmessage = new StringTextField(); // Generated
                fStringTextFieldmaxmessage
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmaxmessage;
    }

    /**
     * This method initializes fJLabelmaxmessage
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmaxmessage() {
        if (fJLabelmaxmessage == null) {
            try {
                fJLabelmaxmessage = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmaxmessage.setText(resBundel
                        .getString("res_strmaxmessageDisplayName")); // Generated
                fJLabelmaxmessage.setToolTipText(resBundel
                        .getString("res_strmaxmessageDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmaxmessage;
    }

    /**
     * This method initializes fJPanelmaxmessage
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmaxmessage() {
        if (fJPanelmaxmessage == null) {
            try {
                fJPanelmaxmessage = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmaxmessage.setLayout(layFlowLayout); // Generated
                fJPanelmaxmessage.add(getJLabelmaxmessage(), null); // Generated
                fJPanelmaxmessage.add(getStringTextFieldmaxmessage(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmaxmessage;
    }

    // end DB field maxmessage
    // start DB field minmessage
    /**
     * This method initializes fStringTextFieldminmessage
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldminmessage() {
        if (fStringTextFieldminmessage == null) {
            try {
                fStringTextFieldminmessage = new StringTextField(); // Generated
                fStringTextFieldminmessage
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldminmessage;
    }

    /**
     * This method initializes fJLabelminmessage
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelminmessage() {
        if (fJLabelminmessage == null) {
            try {
                fJLabelminmessage = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelminmessage.setText(resBundel
                        .getString("res_strminmessageDisplayName")); // Generated
                fJLabelminmessage.setToolTipText(resBundel
                        .getString("res_strminmessageDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelminmessage;
    }

    /**
     * This method initializes fJPanelminmessage
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelminmessage() {
        if (fJPanelminmessage == null) {
            try {
                fJPanelminmessage = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelminmessage.setLayout(layFlowLayout); // Generated
                fJPanelminmessage.add(getJLabelminmessage(), null); // Generated
                fJPanelminmessage.add(getStringTextFieldminmessage(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelminmessage;
    }

    // end DB field minmessage
    // start DB field format
    /**
     * This method initializes fStringTextFieldformat
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldformat() {
        if (fStringTextFieldformat == null) {
            try {
                fStringTextFieldformat = new StringTextField(); // Generated
                fStringTextFieldformat.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldformat;
    }

    /**
     * This method initializes fJLabelformat
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelformat() {
        if (fJLabelformat == null) {
            try {
                fJLabelformat = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelformat.setText(resBundel
                        .getString("res_strformatDisplayName")); // Generated
                fJLabelformat.setToolTipText(resBundel
                        .getString("res_strformatDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelformat;
    }

    /**
     * This method initializes fJPanelformat
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelformat() {
        if (fJPanelformat == null) {
            try {
                fJPanelformat = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelformat.setLayout(layFlowLayout); // Generated
                fJPanelformat.add(getJLabelformat(), null); // Generated
                fJPanelformat.add(getStringTextFieldformat(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelformat;
    }

    // end DB field format
    // start DB field maxgreet
    /**
     * This method initializes fStringTextFieldmaxgreet
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmaxgreet() {
        if (fStringTextFieldmaxgreet == null) {
            try {
                fStringTextFieldmaxgreet = new StringTextField(); // Generated
                fStringTextFieldmaxgreet
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmaxgreet;
    }

    /**
     * This method initializes fJLabelmaxgreet
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmaxgreet() {
        if (fJLabelmaxgreet == null) {
            try {
                fJLabelmaxgreet = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmaxgreet.setText(resBundel
                        .getString("res_strmaxgreetDisplayName")); // Generated
                fJLabelmaxgreet.setToolTipText(resBundel
                        .getString("res_strmaxgreetDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmaxgreet;
    }

    /**
     * This method initializes fJPanelmaxgreet
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmaxgreet() {
        if (fJPanelmaxgreet == null) {
            try {
                fJPanelmaxgreet = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmaxgreet.setLayout(layFlowLayout); // Generated
                fJPanelmaxgreet.add(getJLabelmaxgreet(), null); // Generated
                fJPanelmaxgreet.add(getStringTextFieldmaxgreet(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmaxgreet;
    }

    // end DB field maxgreet
    // start DB field skipms
    /**
     * This method initializes fStringTextFieldskipms
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldskipms() {
        if (fStringTextFieldskipms == null) {
            try {
                fStringTextFieldskipms = new StringTextField(); // Generated
                fStringTextFieldskipms.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldskipms;
    }

    /**
     * This method initializes fJLabelskipms
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelskipms() {
        if (fJLabelskipms == null) {
            try {
                fJLabelskipms = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelskipms.setText(resBundel
                        .getString("res_strskipmsDisplayName")); // Generated
                fJLabelskipms.setToolTipText(resBundel
                        .getString("res_strskipmsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelskipms;
    }

    /**
     * This method initializes fJPanelskipms
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelskipms() {
        if (fJPanelskipms == null) {
            try {
                fJPanelskipms = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelskipms.setLayout(layFlowLayout); // Generated
                fJPanelskipms.add(getJLabelskipms(), null); // Generated
                fJPanelskipms.add(getStringTextFieldskipms(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelskipms;
    }

    // end DB field skipms
    // start DB field maxlogins
    /**
     * This method initializes fStringTextFieldmaxlogins
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmaxlogins() {
        if (fStringTextFieldmaxlogins == null) {
            try {
                fStringTextFieldmaxlogins = new StringTextField(); // Generated
                fStringTextFieldmaxlogins
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmaxlogins;
    }

    /**
     * This method initializes fJLabelmaxlogins
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmaxlogins() {
        if (fJLabelmaxlogins == null) {
            try {
                fJLabelmaxlogins = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelmaxlogins.setText(resBundel
                        .getString("res_strmaxloginsDisplayName")); // Generated
                fJLabelmaxlogins.setToolTipText(resBundel
                        .getString("res_strmaxloginsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelmaxlogins;
    }

    /**
     * This method initializes fJPanelmaxlogins
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmaxlogins() {
        if (fJPanelmaxlogins == null) {
            try {
                fJPanelmaxlogins = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmaxlogins.setLayout(layFlowLayout); // Generated
                fJPanelmaxlogins.add(getJLabelmaxlogins(), null); // Generated
                fJPanelmaxlogins.add(getStringTextFieldmaxlogins(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmaxlogins;
    }

    // end DB field maxlogins
    // start DB field cidinternalcontexts
    /**
     * This method initializes fStringTextFieldcidinternalcontexts
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcidinternalcontexts() {
        if (fStringTextFieldcidinternalcontexts == null) {
            try {
                fStringTextFieldcidinternalcontexts = new StringTextField(); // Generated
                fStringTextFieldcidinternalcontexts
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcidinternalcontexts;
    }

    /**
     * This method initializes fJLabelcidinternalcontexts
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcidinternalcontexts() {
        if (fJLabelcidinternalcontexts == null) {
            try {
                fJLabelcidinternalcontexts = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcidinternalcontexts.setText(resBundel
                        .getString("res_strcidinternalcontextsDisplayName")); // Generated
                fJLabelcidinternalcontexts.setToolTipText(resBundel
                        .getString("res_strcidinternalcontextsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcidinternalcontexts;
    }

    /**
     * This method initializes fJPanelcidinternalcontexts
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcidinternalcontexts() {
        if (fJPanelcidinternalcontexts == null) {
            try {
                fJPanelcidinternalcontexts = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcidinternalcontexts.setLayout(layFlowLayout); // Generated
                fJPanelcidinternalcontexts.add(getJLabelcidinternalcontexts(),
                        null); // Generated
                fJPanelcidinternalcontexts.add(
                        getStringTextFieldcidinternalcontexts(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcidinternalcontexts;
    }

    // end DB field cidinternalcontexts
    // start DB field review
    /**
     * This method initializes fCustomCheckBoxreview
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxreview() {
        if (fCustomCheckBoxreview == null) {
            try {
                fCustomCheckBoxreview = new CustomCheckBox(); // Generated
                fCustomCheckBoxreview.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxreview;
    }

    /**
     * This method initializes fJLabelreview
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelreview() {
        if (fJLabelreview == null) {
            try {
                fJLabelreview = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelreview.setText(resBundel
                        .getString("res_strreviewDisplayName")); // Generated
                fJLabelreview.setToolTipText(resBundel
                        .getString("res_strreviewDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelreview;
    }

    /**
     * This method initializes fJPanelreview
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelreview() {
        if (fJPanelreview == null) {
            try {
                fJPanelreview = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelreview.setLayout(layFlowLayout); // Generated
                fJPanelreview.add(getJLabelreview(), null); // Generated
                fJPanelreview.add(getCustomCheckBoxreview(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelreview;
    }

    // end DB field review
    // start DB field operator
    /**
     * This method initializes fCustomCheckBoxoperator
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxoperator() {
        if (fCustomCheckBoxoperator == null) {
            try {
                fCustomCheckBoxoperator = new CustomCheckBox(); // Generated
                fCustomCheckBoxoperator
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxoperator;
    }

    /**
     * This method initializes fJLabeloperator
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeloperator() {
        if (fJLabeloperator == null) {
            try {
                fJLabeloperator = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeloperator.setText(resBundel
                        .getString("res_stroperatorDisplayName")); // Generated
                fJLabeloperator.setToolTipText(resBundel
                        .getString("res_stroperatorDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeloperator;
    }

    /**
     * This method initializes fJPaneloperator
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneloperator() {
        if (fJPaneloperator == null) {
            try {
                fJPaneloperator = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneloperator.setLayout(layFlowLayout); // Generated
                fJPaneloperator.add(getJLabeloperator(), null); // Generated
                fJPaneloperator.add(getCustomCheckBoxoperator(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneloperator;
    }

    // end DB field operator
    // start DB field saycid
    /**
     * This method initializes fCustomCheckBoxsaycid
     * 
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxsaycid() {
        if (fCustomCheckBoxsaycid == null) {
            try {
                fCustomCheckBoxsaycid = new CustomCheckBox(); // Generated
                fCustomCheckBoxsaycid.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxsaycid;
    }

    /**
     * This method initializes fJLabelsaycid
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsaycid() {
        if (fJLabelsaycid == null) {
            try {
                fJLabelsaycid = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelsaycid.setText(resBundel
                        .getString("res_strsaycidDisplayName")); // Generated
                fJLabelsaycid.setToolTipText(resBundel
                        .getString("res_strsaycidDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelsaycid;
    }

    /**
     * This method initializes fJPanelsaycid
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsaycid() {
        if (fJPanelsaycid == null) {
            try {
                fJPanelsaycid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsaycid.setLayout(layFlowLayout); // Generated
                fJPanelsaycid.add(getJLabelsaycid(), null); // Generated
                fJPanelsaycid.add(getCustomCheckBoxsaycid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsaycid;
    }

    // end DB field saycid
    // start DB field dialout
    /**
     * This method initializes fStringTextFielddialout
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddialout() {
        if (fStringTextFielddialout == null) {
            try {
                fStringTextFielddialout = new StringTextField(); // Generated
                fStringTextFielddialout
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddialout;
    }

    /**
     * This method initializes fJLabeldialout
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldialout() {
        if (fJLabeldialout == null) {
            try {
                fJLabeldialout = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldialout.setText(resBundel
                        .getString("res_strdialoutDisplayName")); // Generated
                fJLabeldialout.setToolTipText(resBundel
                        .getString("res_strdialoutDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldialout;
    }

    /**
     * This method initializes fJPaneldialout
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldialout() {
        if (fJPaneldialout == null) {
            try {
                fJPaneldialout = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldialout.setLayout(layFlowLayout); // Generated
                fJPaneldialout.add(getJLabeldialout(), null); // Generated
                fJPaneldialout.add(getStringTextFielddialout(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldialout;
    }

    // end DB field dialout
    // start DB field callback
    /**
     * This method initializes fStringTextFieldcallback
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcallback() {
        if (fStringTextFieldcallback == null) {
            try {
                fStringTextFieldcallback = new StringTextField(); // Generated
                fStringTextFieldcallback
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcallback;
    }

    /**
     * This method initializes fJLabelcallback
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcallback() {
        if (fJLabelcallback == null) {
            try {
                fJLabelcallback = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelcallback.setText(resBundel
                        .getString("res_strcallbackDisplayName")); // Generated
                fJLabelcallback.setToolTipText(resBundel
                        .getString("res_strcallbackDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelcallback;
    }

    /**
     * This method initializes fJPanelcallback
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcallback() {
        if (fJPanelcallback == null) {
            try {
                fJPanelcallback = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcallback.setLayout(layFlowLayout); // Generated
                fJPanelcallback.add(getJLabelcallback(), null); // Generated
                fJPanelcallback.add(getStringTextFieldcallback(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcallback;
    }

    // end DB field callback
    // start DB field dbuser
    /**
     * This method initializes fStringTextFielddbuser
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddbuser() {
        if (fStringTextFielddbuser == null) {
            try {
                fStringTextFielddbuser = new StringTextField(); // Generated
                fStringTextFielddbuser.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddbuser;
    }

    /**
     * This method initializes fJLabeldbuser
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldbuser() {
        if (fJLabeldbuser == null) {
            try {
                fJLabeldbuser = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldbuser.setText(resBundel
                        .getString("res_strdbuserDisplayName")); // Generated
                fJLabeldbuser.setToolTipText(resBundel
                        .getString("res_strdbuserDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldbuser;
    }

    /**
     * This method initializes fJPaneldbuser
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldbuser() {
        if (fJPaneldbuser == null) {
            try {
                fJPaneldbuser = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldbuser.setLayout(layFlowLayout); // Generated
                fJPaneldbuser.add(getJLabeldbuser(), null); // Generated
                fJPaneldbuser.add(getStringTextFielddbuser(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldbuser;
    }

    // end DB field dbuser
    // start DB field dbpass
    /**
     * This method initializes fStringTextFielddbpass
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddbpass() {
        if (fStringTextFielddbpass == null) {
            try {
                fStringTextFielddbpass = new StringTextField(); // Generated
                fStringTextFielddbpass.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddbpass;
    }

    /**
     * This method initializes fJLabeldbpass
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldbpass() {
        if (fJLabeldbpass == null) {
            try {
                fJLabeldbpass = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldbpass.setText(resBundel
                        .getString("res_strdbpassDisplayName")); // Generated
                fJLabeldbpass.setToolTipText(resBundel
                        .getString("res_strdbpassDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldbpass;
    }

    /**
     * This method initializes fJPaneldbpass
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldbpass() {
        if (fJPaneldbpass == null) {
            try {
                fJPaneldbpass = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldbpass.setLayout(layFlowLayout); // Generated
                fJPaneldbpass.add(getJLabeldbpass(), null); // Generated
                fJPaneldbpass.add(getStringTextFielddbpass(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldbpass;
    }

    // end DB field dbpass
    // start DB field dbhost
    /**
     * This method initializes fStringTextFielddbhost
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddbhost() {
        if (fStringTextFielddbhost == null) {
            try {
                fStringTextFielddbhost = new StringTextField(); // Generated
                fStringTextFielddbhost.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddbhost;
    }

    /**
     * This method initializes fJLabeldbhost
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldbhost() {
        if (fJLabeldbhost == null) {
            try {
                fJLabeldbhost = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldbhost.setText(resBundel
                        .getString("res_strdbhostDisplayName")); // Generated
                fJLabeldbhost.setToolTipText(resBundel
                        .getString("res_strdbhostDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldbhost;
    }

    /**
     * This method initializes fJPaneldbhost
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldbhost() {
        if (fJPaneldbhost == null) {
            try {
                fJPaneldbhost = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldbhost.setLayout(layFlowLayout); // Generated
                fJPaneldbhost.add(getJLabeldbhost(), null); // Generated
                fJPaneldbhost.add(getStringTextFielddbhost(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldbhost;
    }

    // end DB field dbhost
    // start DB field dbname
    /**
     * This method initializes fStringTextFielddbname
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddbname() {
        if (fStringTextFielddbname == null) {
            try {
                fStringTextFielddbname = new StringTextField(); // Generated
                fStringTextFielddbname.setPreferredSize(new java.awt.Dimension(
                        150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddbname;
    }

    /**
     * This method initializes fJLabeldbname
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldbname() {
        if (fJLabeldbname == null) {
            try {
                fJLabeldbname = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldbname.setText(resBundel
                        .getString("res_strdbnameDisplayName")); // Generated
                fJLabeldbname.setToolTipText(resBundel
                        .getString("res_strdbnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldbname;
    }

    /**
     * This method initializes fJPaneldbname
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldbname() {
        if (fJPaneldbname == null) {
            try {
                fJPaneldbname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldbname.setLayout(layFlowLayout); // Generated
                fJPaneldbname.add(getJLabeldbname(), null); // Generated
                fJPaneldbname.add(getStringTextFielddbname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldbname;
    }

    // end DB field dbname
    // start DB field dboption
    /**
     * This method initializes fStringTextFielddboption
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFielddboption() {
        if (fStringTextFielddboption == null) {
            try {
                fStringTextFielddboption = new StringTextField(); // Generated
                fStringTextFielddboption
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddboption;
    }

    /**
     * This method initializes fJLabeldboption
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldboption() {
        if (fJLabeldboption == null) {
            try {
                fJLabeldboption = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabeldboption.setText(resBundel
                        .getString("res_strdboptionDisplayName")); // Generated
                fJLabeldboption.setToolTipText(resBundel
                        .getString("res_strdboptionDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabeldboption;
    }

    /**
     * This method initializes fJPaneldboption
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldboption() {
        if (fJPaneldboption == null) {
            try {
                fJPaneldboption = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldboption.setLayout(layFlowLayout); // Generated
                fJPaneldboption.add(getJLabeldboption(), null); // Generated
                fJPaneldboption.add(getStringTextFielddboption(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldboption;
    }

    // end DB field dboption
    // start DB field pbxskip
    /**
     * This method initializes fStringTextFieldpbxskip
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpbxskip() {
        if (fStringTextFieldpbxskip == null) {
            try {
                fStringTextFieldpbxskip = new StringTextField(); // Generated
                fStringTextFieldpbxskip
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpbxskip;
    }

    /**
     * This method initializes fJLabelpbxskip
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpbxskip() {
        if (fJLabelpbxskip == null) {
            try {
                fJLabelpbxskip = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelpbxskip.setText(resBundel
                        .getString("res_strpbxskipDisplayName")); // Generated
                fJLabelpbxskip.setToolTipText(resBundel
                        .getString("res_strpbxskipDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelpbxskip;
    }

    /**
     * This method initializes fJPanelpbxskip
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpbxskip() {
        if (fJPanelpbxskip == null) {
            try {
                fJPanelpbxskip = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpbxskip.setLayout(layFlowLayout); // Generated
                fJPanelpbxskip.add(getJLabelpbxskip(), null); // Generated
                fJPanelpbxskip.add(getStringTextFieldpbxskip(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpbxskip;
    }

    // end DB field pbxskip
    // start DB field fromstring
    /**
     * This method initializes fStringTextFieldfromstring
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfromstring() {
        if (fStringTextFieldfromstring == null) {
            try {
                fStringTextFieldfromstring = new StringTextField(); // Generated
                fStringTextFieldfromstring
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfromstring;
    }

    /**
     * This method initializes fJLabelfromstring
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfromstring() {
        if (fJLabelfromstring == null) {
            try {
                fJLabelfromstring = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelfromstring.setText(resBundel
                        .getString("res_strfromstringDisplayName")); // Generated
                fJLabelfromstring.setToolTipText(resBundel
                        .getString("res_strfromstringDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelfromstring;
    }

    /**
     * This method initializes fJPanelfromstring
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfromstring() {
        if (fJPanelfromstring == null) {
            try {
                fJPanelfromstring = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfromstring.setLayout(layFlowLayout); // Generated
                fJPanelfromstring.add(getJLabelfromstring(), null); // Generated
                fJPanelfromstring.add(getStringTextFieldfromstring(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfromstring;
    }

    // end DB field fromstring
    // start DB field emailsubject
    /**
     * This method initializes fStringTextFieldemailsubject
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldemailsubject() {
        if (fStringTextFieldemailsubject == null) {
            try {
                fStringTextFieldemailsubject = new StringTextField(); // Generated
                fStringTextFieldemailsubject
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldemailsubject;
    }

    /**
     * This method initializes fJLabelemailsubject
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelemailsubject() {
        if (fJLabelemailsubject == null) {
            try {
                fJLabelemailsubject = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelemailsubject.setText(resBundel
                        .getString("res_stremailsubjectDisplayName")); // Generated
                fJLabelemailsubject.setToolTipText(resBundel
                        .getString("res_stremailsubjectDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelemailsubject;
    }

    /**
     * This method initializes fJPanelemailsubject
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelemailsubject() {
        if (fJPanelemailsubject == null) {
            try {
                fJPanelemailsubject = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelemailsubject.setLayout(layFlowLayout); // Generated
                fJPanelemailsubject.add(getJLabelemailsubject(), null); // Generated
                fJPanelemailsubject.add(getStringTextFieldemailsubject(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelemailsubject;
    }

    // end DB field emailsubject
    // start DB field emailbody
    /**
     * This method initializes fStringTextFieldemailbody
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldemailbody() {
        if (fStringTextFieldemailbody == null) {
            try {
                fStringTextFieldemailbody = new StringTextField(); // Generated
                fStringTextFieldemailbody
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldemailbody;
    }

    /**
     * This method initializes fJLabelemailbody
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelemailbody() {
        if (fJLabelemailbody == null) {
            try {
                fJLabelemailbody = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelemailbody.setText(resBundel
                        .getString("res_stremailbodyDisplayName")); // Generated
                fJLabelemailbody.setToolTipText(resBundel
                        .getString("res_stremailbodyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelemailbody;
    }

    /**
     * This method initializes fJPanelemailbody
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelemailbody() {
        if (fJPanelemailbody == null) {
            try {
                fJPanelemailbody = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelemailbody.setLayout(layFlowLayout); // Generated
                fJPanelemailbody.add(getJLabelemailbody(), null); // Generated
                fJPanelemailbody.add(getStringTextFieldemailbody(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelemailbody;
    }

    // end DB field emailbody
    // start DB field exitcontext
    /**
     * This method initializes fStringTextFieldexitcontext
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldexitcontext() {
        if (fStringTextFieldexitcontext == null) {
            try {
                fStringTextFieldexitcontext = new StringTextField(); // Generated
                fStringTextFieldexitcontext
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldexitcontext;
    }

    /**
     * This method initializes fJLabelexitcontext
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelexitcontext() {
        if (fJLabelexitcontext == null) {
            try {
                fJLabelexitcontext = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelexitcontext.setText(resBundel
                        .getString("res_strexitcontextDisplayName")); // Generated
                fJLabelexitcontext.setToolTipText(resBundel
                        .getString("res_strexitcontextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelexitcontext;
    }

    /**
     * This method initializes fJPanelexitcontext
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelexitcontext() {
        if (fJPanelexitcontext == null) {
            try {
                fJPanelexitcontext = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelexitcontext.setLayout(layFlowLayout); // Generated
                fJPanelexitcontext.add(getJLabelexitcontext(), null); // Generated
                fJPanelexitcontext.add(getStringTextFieldexitcontext(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelexitcontext;
    }

    // end DB field exitcontext
    // start DB field nextaftercmd
    /**
     * This method initializes fStringTextFieldnextaftercmd
     * 
     * @return StringTextField
     */
    public StringTextField getStringTextFieldnextaftercmd() {
        if (fStringTextFieldnextaftercmd == null) {
            try {
                fStringTextFieldnextaftercmd = new StringTextField(); // Generated
                fStringTextFieldnextaftercmd
                        .setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldnextaftercmd;
    }

    /**
     * This method initializes fJLabelnextaftercmd
     * 
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelnextaftercmd() {
        if (fJLabelnextaftercmd == null) {
            try {
                fJLabelnextaftercmd = new javax.swing.JLabel() {
                    public JToolTip createToolTip() {
                        return new JMultiLineToolTip();
                    }
                }; // Generated
                fJLabelnextaftercmd.setText(resBundel
                        .getString("res_strnextaftercmdDisplayName")); // Generated
                fJLabelnextaftercmd.setToolTipText(resBundel
                        .getString("res_strnextaftercmdDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return fJLabelnextaftercmd;
    }

    /**
     * This method initializes fJPanelnextaftercmd
     * 
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelnextaftercmd() {
        if (fJPanelnextaftercmd == null) {
            try {
                fJPanelnextaftercmd = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelnextaftercmd.setLayout(layFlowLayout); // Generated
                fJPanelnextaftercmd.add(getJLabelnextaftercmd(), null); // Generated
                fJPanelnextaftercmd.add(getStringTextFieldnextaftercmd(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelnextaftercmd;
    }
    // end DB field nextaftercmd

}
