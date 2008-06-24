package com.useit.jact.gui.sipconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.EnumSetTextFieldCodecs;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.JEnumComboboxAmaflags;
import com.useit.jact.gui.widgets.JEnumComboboxDtmfmode;
import com.useit.jact.gui.widgets.JEnumComboboxPeerType;
import com.useit.jact.gui.widgets.PbxContextTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.sipconf.Sippeers;

/**
 * <p>
 * SippeersDataPanel
 * </p>
 * Created : Fri May 26 14:16:14 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SippeersDataPanel.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
public class SippeersDataPanel extends SimpleDataObjectPanel{
	protected Sippeers dataObject;
	//protected SippeersChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SippeersDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSippeersResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSippeersResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SippeersResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SippeersCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldaccountcode,		
			fJEnumComboboxAmaflagsamaflags,		
			fStringTextFieldcallgroup,		
			fStringTextFieldcanreinvite,		
			fPbxContextTextFieldcontext,		
			fStringTextFielddefaultip,		
			fJEnumComboboxDtmfmodedtmfmode,		
			fStringTextFieldfromuser,		
			fStringTextFieldfromdomain,		
			fStringTextFieldhost,		
			fIntegerTextFieldincominglimit,		
			fIntegerTextFieldoutgoinglimit,		
			fStringTextFieldinsecure,		
			fStringTextFieldlanguage,		
			fStringTextFieldmailbox,		
			fStringTextFieldmd5secret,		
			fCustomCheckBoxnat,		
			fStringTextFieldpickupgroup,		
			fIntegerTextFieldport,		
			fStringTextFieldqualify,		
			fCustomCheckBoxrestrictcid,		
			fIntegerTextFieldrtptimeout,		
			fIntegerTextFieldrtpholdtimeout,		
			fStringTextFieldsecret,		
			fJEnumComboboxPeerTypetype,		
			fStringTextFieldusername,		
			fStringTextFieldmusiconhold,		
			fStringTextFieldcallerid,		
			fEnumSetTextFieldCodecsdisallow,		
			fEnumSetTextFieldCodecsallow,		
		};
		dataChecker.initChecker(array);
	}

*/

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(400,(31)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(31); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelsectionname(), null); // Generated
        this.add(getJPanelaccountcode(), null); // Generated
        this.add(getJPanelamaflags(), null); // Generated
        this.add(getJPanelcallgroup(), null); // Generated
        this.add(getJPanelcanreinvite(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPaneldefaultip(), null); // Generated
        this.add(getJPaneldtmfmode(), null); // Generated
        this.add(getJPanelfromuser(), null); // Generated
        this.add(getJPanelfromdomain(), null); // Generated
        this.add(getJPanelhost(), null); // Generated
        this.add(getJPanelincominglimit(), null); // Generated
        this.add(getJPaneloutgoinglimit(), null); // Generated
        this.add(getJPanelinsecure(), null); // Generated
        this.add(getJPanellanguage(), null); // Generated
        this.add(getJPanelmailbox(), null); // Generated
        this.add(getJPanelmd5secret(), null); // Generated
        this.add(getJPanelnat(), null); // Generated
        this.add(getJPanelpickupgroup(), null); // Generated
        this.add(getJPanelport(), null); // Generated
        this.add(getJPanelqualify(), null); // Generated
        this.add(getJPanelrestrictcid(), null); // Generated
        this.add(getJPanelrtptimeout(), null); // Generated
        this.add(getJPanelrtpholdtimeout(), null); // Generated
        this.add(getJPanelsecret(), null); // Generated
        this.add(getJPaneltype(), null); // Generated
        this.add(getJPanelusername(), null); // Generated
        this.add(getJPanelmusiconhold(), null); // Generated
        this.add(getJPanelcallerid(), null); // Generated
        this.add(getJPaneldisallow(), null); // Generated
        this.add(getJPanelallow(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldsectionname.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldaccountcode.getDocument().addDocumentListener(textChangeAct);
		fJEnumComboboxAmaflagsamaflags.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcallgroup.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcanreinvite.getDocument().addDocumentListener(textChangeAct);
		fPbxContextTextFieldcontext.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielddefaultip.getDocument().addDocumentListener(textChangeAct);
		fJEnumComboboxDtmfmodedtmfmode.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldfromuser.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldfromdomain.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldhost.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldincominglimit.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldoutgoinglimit.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldinsecure.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldlanguage.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmailbox.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmd5secret.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxnat.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldpickupgroup.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldport.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldqualify.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxrestrictcid.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldrtptimeout.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldrtpholdtimeout.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldsecret.getDocument().addDocumentListener(textChangeAct);
		fJEnumComboboxPeerTypetype.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldusername.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmusiconhold.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcallerid.getDocument().addDocumentListener(textChangeAct);
		fEnumSetTextFieldCodecsdisallow.getDocument().addDocumentListener(textChangeAct);
		fEnumSetTextFieldCodecsallow.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldsectionname.setValue(dataObject.getSectionname());
        fStringTextFieldaccountcode.setValue(dataObject.getAccountcode());
        fJEnumComboboxAmaflagsamaflags.setValue(dataObject.getAmaflags());
        fStringTextFieldcallgroup.setValue(dataObject.getCallgroup());
        fStringTextFieldcanreinvite.setValue(dataObject.getCanreinvite());
        fPbxContextTextFieldcontext.setValue(dataObject.getContext());
        fStringTextFielddefaultip.setValue(dataObject.getDefaultip());
        fJEnumComboboxDtmfmodedtmfmode.setValue(dataObject.getDtmfmode());
        fStringTextFieldfromuser.setValue(dataObject.getFromuser());
        fStringTextFieldfromdomain.setValue(dataObject.getFromdomain());
        fStringTextFieldhost.setValue(dataObject.getHost());
        fIntegerTextFieldincominglimit.setValue(dataObject.getIncominglimit());
        fIntegerTextFieldoutgoinglimit.setValue(dataObject.getOutgoinglimit());
        fStringTextFieldinsecure.setValue(dataObject.getInsecure());
        fStringTextFieldlanguage.setValue(dataObject.getLanguage());
        fStringTextFieldmailbox.setValue(dataObject.getMailbox());
        fStringTextFieldmd5secret.setValue(dataObject.getMd5secret());
        fCustomCheckBoxnat.setValue(dataObject.getNat());
        fStringTextFieldpickupgroup.setValue(dataObject.getPickupgroup());
        fIntegerTextFieldport.setValue(dataObject.getPort());
        fStringTextFieldqualify.setValue(dataObject.getQualify());
        fCustomCheckBoxrestrictcid.setValue(dataObject.getRestrictcid());
        fIntegerTextFieldrtptimeout.setValue(dataObject.getRtptimeout());
        fIntegerTextFieldrtpholdtimeout.setValue(dataObject.getRtpholdtimeout());
        fStringTextFieldsecret.setValue(dataObject.getSecret());
        fJEnumComboboxPeerTypetype.setValue(dataObject.getType());
        fStringTextFieldusername.setValue(dataObject.getUsername());
        fStringTextFieldmusiconhold.setValue(dataObject.getMusiconhold());
        fStringTextFieldcallerid.setValue(dataObject.getCallerid());
        fEnumSetTextFieldCodecsdisallow.setValue(dataObject.getDisallow());
        fEnumSetTextFieldCodecsallow.setValue(dataObject.getAllow());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setSectionname(fStringTextFieldsectionname.getValue());
        dataObject.setAccountcode(fStringTextFieldaccountcode.getValue());
        dataObject.setAmaflags(fJEnumComboboxAmaflagsamaflags.getValue());
        dataObject.setCallgroup(fStringTextFieldcallgroup.getValue());
        dataObject.setCanreinvite(fStringTextFieldcanreinvite.getValue());
        dataObject.setContext(fPbxContextTextFieldcontext.getValue());
        dataObject.setDefaultip(fStringTextFielddefaultip.getValue());
        dataObject.setDtmfmode(fJEnumComboboxDtmfmodedtmfmode.getValue());
        dataObject.setFromuser(fStringTextFieldfromuser.getValue());
        dataObject.setFromdomain(fStringTextFieldfromdomain.getValue());
        dataObject.setHost(fStringTextFieldhost.getValue());
        dataObject.setIncominglimit(fIntegerTextFieldincominglimit.getValue());
        dataObject.setOutgoinglimit(fIntegerTextFieldoutgoinglimit.getValue());
        dataObject.setInsecure(fStringTextFieldinsecure.getValue());
        dataObject.setLanguage(fStringTextFieldlanguage.getValue());
        dataObject.setMailbox(fStringTextFieldmailbox.getValue());
        dataObject.setMd5secret(fStringTextFieldmd5secret.getValue());
        dataObject.setNat(fCustomCheckBoxnat.getValue());
        dataObject.setPickupgroup(fStringTextFieldpickupgroup.getValue());
        dataObject.setPort(fIntegerTextFieldport.getValue());
        dataObject.setQualify(fStringTextFieldqualify.getValue());
        dataObject.setRestrictcid(fCustomCheckBoxrestrictcid.getValue());
        dataObject.setRtptimeout(fIntegerTextFieldrtptimeout.getValue());
        dataObject.setRtpholdtimeout(fIntegerTextFieldrtpholdtimeout.getValue());
        dataObject.setSecret(fStringTextFieldsecret.getValue());
        dataObject.setType(fJEnumComboboxPeerTypetype.getValue());
        dataObject.setUsername(fStringTextFieldusername.getValue());
        dataObject.setMusiconhold(fStringTextFieldmusiconhold.getValue());
        dataObject.setCallerid(fStringTextFieldcallerid.getValue());
        dataObject.setDisallow(fEnumSetTextFieldCodecsdisallow.getValue());
        dataObject.setAllow(fEnumSetTextFieldCodecsallow.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Sippeers
	 */
	public void setDataObject(Object aSippeers) {
	    //abstractdataObject = (AbstractConfigObject) aSippeers;
		setDataObject((Sippeers) aSippeers);
		//dataObject = aSippeers;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Sippeers
	 */
	public void setDataObject(Sippeers aSippeers) {
	    //abstractdataObject = (AbstractConfigObject) aSippeers;
		dataObject = aSippeers;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldsectionname;
    protected javax.swing.JLabel fJLabelsectionname;
	protected javax.swing.JPanel fJPanelsectionname;
    protected StringTextField fStringTextFieldaccountcode;
    protected javax.swing.JLabel fJLabelaccountcode;
	protected javax.swing.JPanel fJPanelaccountcode;
    protected JEnumComboboxAmaflags fJEnumComboboxAmaflagsamaflags;
    protected javax.swing.JLabel fJLabelamaflags;
	protected javax.swing.JPanel fJPanelamaflags;
    protected StringTextField fStringTextFieldcallgroup;
    protected javax.swing.JLabel fJLabelcallgroup;
	protected javax.swing.JPanel fJPanelcallgroup;
    protected StringTextField fStringTextFieldcanreinvite;
    protected javax.swing.JLabel fJLabelcanreinvite;
	protected javax.swing.JPanel fJPanelcanreinvite;
    protected PbxContextTextField fPbxContextTextFieldcontext;
    protected javax.swing.JLabel fJLabelcontext;
	protected javax.swing.JPanel fJPanelcontext;
    protected StringTextField fStringTextFielddefaultip;
    protected javax.swing.JLabel fJLabeldefaultip;
	protected javax.swing.JPanel fJPaneldefaultip;
    protected JEnumComboboxDtmfmode fJEnumComboboxDtmfmodedtmfmode;
    protected javax.swing.JLabel fJLabeldtmfmode;
	protected javax.swing.JPanel fJPaneldtmfmode;
    protected StringTextField fStringTextFieldfromuser;
    protected javax.swing.JLabel fJLabelfromuser;
	protected javax.swing.JPanel fJPanelfromuser;
    protected StringTextField fStringTextFieldfromdomain;
    protected javax.swing.JLabel fJLabelfromdomain;
	protected javax.swing.JPanel fJPanelfromdomain;
    protected StringTextField fStringTextFieldhost;
    protected javax.swing.JLabel fJLabelhost;
	protected javax.swing.JPanel fJPanelhost;
    protected IntegerTextField fIntegerTextFieldincominglimit;
    protected javax.swing.JLabel fJLabelincominglimit;
	protected javax.swing.JPanel fJPanelincominglimit;
    protected IntegerTextField fIntegerTextFieldoutgoinglimit;
    protected javax.swing.JLabel fJLabeloutgoinglimit;
	protected javax.swing.JPanel fJPaneloutgoinglimit;
    protected StringTextField fStringTextFieldinsecure;
    protected javax.swing.JLabel fJLabelinsecure;
	protected javax.swing.JPanel fJPanelinsecure;
    protected StringTextField fStringTextFieldlanguage;
    protected javax.swing.JLabel fJLabellanguage;
	protected javax.swing.JPanel fJPanellanguage;
    protected StringTextField fStringTextFieldmailbox;
    protected javax.swing.JLabel fJLabelmailbox;
	protected javax.swing.JPanel fJPanelmailbox;
    protected StringTextField fStringTextFieldmd5secret;
    protected javax.swing.JLabel fJLabelmd5secret;
	protected javax.swing.JPanel fJPanelmd5secret;
    protected CustomCheckBox fCustomCheckBoxnat;
    protected javax.swing.JLabel fJLabelnat;
	protected javax.swing.JPanel fJPanelnat;
    protected StringTextField fStringTextFieldpickupgroup;
    protected javax.swing.JLabel fJLabelpickupgroup;
	protected javax.swing.JPanel fJPanelpickupgroup;
    protected IntegerTextField fIntegerTextFieldport;
    protected javax.swing.JLabel fJLabelport;
	protected javax.swing.JPanel fJPanelport;
    protected StringTextField fStringTextFieldqualify;
    protected javax.swing.JLabel fJLabelqualify;
	protected javax.swing.JPanel fJPanelqualify;
    protected CustomCheckBox fCustomCheckBoxrestrictcid;
    protected javax.swing.JLabel fJLabelrestrictcid;
	protected javax.swing.JPanel fJPanelrestrictcid;
    protected IntegerTextField fIntegerTextFieldrtptimeout;
    protected javax.swing.JLabel fJLabelrtptimeout;
	protected javax.swing.JPanel fJPanelrtptimeout;
    protected IntegerTextField fIntegerTextFieldrtpholdtimeout;
    protected javax.swing.JLabel fJLabelrtpholdtimeout;
	protected javax.swing.JPanel fJPanelrtpholdtimeout;
    protected StringTextField fStringTextFieldsecret;
    protected javax.swing.JLabel fJLabelsecret;
	protected javax.swing.JPanel fJPanelsecret;
    protected JEnumComboboxPeerType fJEnumComboboxPeerTypetype;
    protected javax.swing.JLabel fJLabeltype;
	protected javax.swing.JPanel fJPaneltype;
    protected StringTextField fStringTextFieldusername;
    protected javax.swing.JLabel fJLabelusername;
	protected javax.swing.JPanel fJPanelusername;
    protected StringTextField fStringTextFieldmusiconhold;
    protected javax.swing.JLabel fJLabelmusiconhold;
	protected javax.swing.JPanel fJPanelmusiconhold;
    protected StringTextField fStringTextFieldcallerid;
    protected javax.swing.JLabel fJLabelcallerid;
	protected javax.swing.JPanel fJPanelcallerid;
    protected EnumSetTextFieldCodecs fEnumSetTextFieldCodecsdisallow;
    protected javax.swing.JLabel fJLabeldisallow;
	protected javax.swing.JPanel fJPaneldisallow;
    protected EnumSetTextFieldCodecs fEnumSetTextFieldCodecsallow;
    protected javax.swing.JLabel fJLabelallow;
	protected javax.swing.JPanel fJPanelallow;
    

//start DB field sectionname
    /**
     * This method initializes fStringTextFieldsectionname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsectionname() {
        if (fStringTextFieldsectionname == null) {
            try {
                fStringTextFieldsectionname = new StringTextField(); // Generated
                fStringTextFieldsectionname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsectionname;
    }
        
    /**
     * This method initializes  fJLabelsectionname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsectionname() {
        if (fJLabelsectionname == null) {
            try {
                 fJLabelsectionname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelsectionname.setText(resBundel.getString("res_strsectionnameDisplayName")); // Generated
                 fJLabelsectionname.setToolTipText(resBundel.getString("res_strsectionnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelsectionname;
    }


    /**
     * This method initializes  fJPanelsectionname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsectionname() {
        if (fJPanelsectionname == null) {
            try {
                fJPanelsectionname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsectionname.setLayout(layFlowLayout); // Generated
                fJPanelsectionname.add(getJLabelsectionname(), null); // Generated
                fJPanelsectionname.add(getStringTextFieldsectionname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsectionname;
    }
//end DB field sectionname
//start DB field accountcode
    /**
     * This method initializes fStringTextFieldaccountcode
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldaccountcode() {
        if (fStringTextFieldaccountcode == null) {
            try {
                fStringTextFieldaccountcode = new StringTextField(); // Generated
                fStringTextFieldaccountcode.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldaccountcode;
    }
        
    /**
     * This method initializes  fJLabelaccountcode
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelaccountcode() {
        if (fJLabelaccountcode == null) {
            try {
                 fJLabelaccountcode = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelaccountcode.setText(resBundel.getString("res_straccountcodeDisplayName")); // Generated
                 fJLabelaccountcode.setToolTipText(resBundel.getString("res_straccountcodeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelaccountcode;
    }


    /**
     * This method initializes  fJPanelaccountcode
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
//end DB field accountcode
//start DB field amaflags
    /**
     * This method initializes fJEnumComboboxAmaflagsamaflags
     *
     * @return JEnumComboboxAmaflags
     */
    public JEnumComboboxAmaflags getJEnumComboboxAmaflagsamaflags() {
        if (fJEnumComboboxAmaflagsamaflags == null) {
            try {
                fJEnumComboboxAmaflagsamaflags = new JEnumComboboxAmaflags(); // Generated
                fJEnumComboboxAmaflagsamaflags.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJEnumComboboxAmaflagsamaflags;
    }
        
    /**
     * This method initializes  fJLabelamaflags
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelamaflags() {
        if (fJLabelamaflags == null) {
            try {
                 fJLabelamaflags = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelamaflags.setText(resBundel.getString("res_stramaflagsDisplayName")); // Generated
                 fJLabelamaflags.setToolTipText(resBundel.getString("res_stramaflagsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelamaflags;
    }


    /**
     * This method initializes  fJPanelamaflags
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelamaflags() {
        if (fJPanelamaflags == null) {
            try {
                fJPanelamaflags = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelamaflags.setLayout(layFlowLayout); // Generated
                fJPanelamaflags.add(getJLabelamaflags(), null); // Generated
                fJPanelamaflags.add(getJEnumComboboxAmaflagsamaflags(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelamaflags;
    }
//end DB field amaflags
//start DB field callgroup
    /**
     * This method initializes fStringTextFieldcallgroup
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcallgroup() {
        if (fStringTextFieldcallgroup == null) {
            try {
                fStringTextFieldcallgroup = new StringTextField(); // Generated
                fStringTextFieldcallgroup.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcallgroup;
    }
        
    /**
     * This method initializes  fJLabelcallgroup
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcallgroup() {
        if (fJLabelcallgroup == null) {
            try {
                 fJLabelcallgroup = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcallgroup.setText(resBundel.getString("res_strcallgroupDisplayName")); // Generated
                 fJLabelcallgroup.setToolTipText(resBundel.getString("res_strcallgroupDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcallgroup;
    }


    /**
     * This method initializes  fJPanelcallgroup
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcallgroup() {
        if (fJPanelcallgroup == null) {
            try {
                fJPanelcallgroup = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcallgroup.setLayout(layFlowLayout); // Generated
                fJPanelcallgroup.add(getJLabelcallgroup(), null); // Generated
                fJPanelcallgroup.add(getStringTextFieldcallgroup(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcallgroup;
    }
//end DB field callgroup
//start DB field canreinvite
    /**
     * This method initializes fStringTextFieldcanreinvite
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcanreinvite() {
        if (fStringTextFieldcanreinvite == null) {
            try {
                fStringTextFieldcanreinvite = new StringTextField(); // Generated
                fStringTextFieldcanreinvite.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcanreinvite;
    }
        
    /**
     * This method initializes  fJLabelcanreinvite
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcanreinvite() {
        if (fJLabelcanreinvite == null) {
            try {
                 fJLabelcanreinvite = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcanreinvite.setText(resBundel.getString("res_strcanreinviteDisplayName")); // Generated
                 fJLabelcanreinvite.setToolTipText(resBundel.getString("res_strcanreinviteDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcanreinvite;
    }


    /**
     * This method initializes  fJPanelcanreinvite
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcanreinvite() {
        if (fJPanelcanreinvite == null) {
            try {
                fJPanelcanreinvite = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcanreinvite.setLayout(layFlowLayout); // Generated
                fJPanelcanreinvite.add(getJLabelcanreinvite(), null); // Generated
                fJPanelcanreinvite.add(getStringTextFieldcanreinvite(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcanreinvite;
    }
//end DB field canreinvite
//start DB field context
    /**
     * This method initializes fPbxContextTextFieldcontext
     *
     * @return PbxContextTextField
     */
    public PbxContextTextField getPbxContextTextFieldcontext() {
        if (fPbxContextTextFieldcontext == null) {
            try {
                fPbxContextTextFieldcontext = new PbxContextTextField(); // Generated
                fPbxContextTextFieldcontext.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fPbxContextTextFieldcontext;
    }
        
    /**
     * This method initializes  fJLabelcontext
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcontext() {
        if (fJLabelcontext == null) {
            try {
                 fJLabelcontext = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcontext.setText(resBundel.getString("res_strcontextDisplayName")); // Generated
                 fJLabelcontext.setToolTipText(resBundel.getString("res_strcontextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcontext;
    }


    /**
     * This method initializes  fJPanelcontext
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
//end DB field context
//start DB field defaultip
    /**
     * This method initializes fStringTextFielddefaultip
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielddefaultip() {
        if (fStringTextFielddefaultip == null) {
            try {
                fStringTextFielddefaultip = new StringTextField(); // Generated
                fStringTextFielddefaultip.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddefaultip;
    }
        
    /**
     * This method initializes  fJLabeldefaultip
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldefaultip() {
        if (fJLabeldefaultip == null) {
            try {
                 fJLabeldefaultip = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeldefaultip.setText(resBundel.getString("res_strdefaultipDisplayName")); // Generated
                 fJLabeldefaultip.setToolTipText(resBundel.getString("res_strdefaultipDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeldefaultip;
    }


    /**
     * This method initializes  fJPaneldefaultip
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
//end DB field defaultip
//start DB field dtmfmode
    /**
     * This method initializes fJEnumComboboxDtmfmodedtmfmode
     *
     * @return JEnumComboboxDtmfmode
     */
    public JEnumComboboxDtmfmode getJEnumComboboxDtmfmodedtmfmode() {
        if (fJEnumComboboxDtmfmodedtmfmode == null) {
            try {
                fJEnumComboboxDtmfmodedtmfmode = new JEnumComboboxDtmfmode(); // Generated
                fJEnumComboboxDtmfmodedtmfmode.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJEnumComboboxDtmfmodedtmfmode;
    }
        
    /**
     * This method initializes  fJLabeldtmfmode
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldtmfmode() {
        if (fJLabeldtmfmode == null) {
            try {
                 fJLabeldtmfmode = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeldtmfmode.setText(resBundel.getString("res_strdtmfmodeDisplayName")); // Generated
                 fJLabeldtmfmode.setToolTipText(resBundel.getString("res_strdtmfmodeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeldtmfmode;
    }


    /**
     * This method initializes  fJPaneldtmfmode
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldtmfmode() {
        if (fJPaneldtmfmode == null) {
            try {
                fJPaneldtmfmode = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldtmfmode.setLayout(layFlowLayout); // Generated
                fJPaneldtmfmode.add(getJLabeldtmfmode(), null); // Generated
                fJPaneldtmfmode.add(getJEnumComboboxDtmfmodedtmfmode(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldtmfmode;
    }
//end DB field dtmfmode
//start DB field fromuser
    /**
     * This method initializes fStringTextFieldfromuser
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfromuser() {
        if (fStringTextFieldfromuser == null) {
            try {
                fStringTextFieldfromuser = new StringTextField(); // Generated
                fStringTextFieldfromuser.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfromuser;
    }
        
    /**
     * This method initializes  fJLabelfromuser
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfromuser() {
        if (fJLabelfromuser == null) {
            try {
                 fJLabelfromuser = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfromuser.setText(resBundel.getString("res_strfromuserDisplayName")); // Generated
                 fJLabelfromuser.setToolTipText(resBundel.getString("res_strfromuserDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfromuser;
    }


    /**
     * This method initializes  fJPanelfromuser
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfromuser() {
        if (fJPanelfromuser == null) {
            try {
                fJPanelfromuser = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfromuser.setLayout(layFlowLayout); // Generated
                fJPanelfromuser.add(getJLabelfromuser(), null); // Generated
                fJPanelfromuser.add(getStringTextFieldfromuser(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfromuser;
    }
//end DB field fromuser
//start DB field fromdomain
    /**
     * This method initializes fStringTextFieldfromdomain
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfromdomain() {
        if (fStringTextFieldfromdomain == null) {
            try {
                fStringTextFieldfromdomain = new StringTextField(); // Generated
                fStringTextFieldfromdomain.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfromdomain;
    }
        
    /**
     * This method initializes  fJLabelfromdomain
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfromdomain() {
        if (fJLabelfromdomain == null) {
            try {
                 fJLabelfromdomain = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfromdomain.setText(resBundel.getString("res_strfromdomainDisplayName")); // Generated
                 fJLabelfromdomain.setToolTipText(resBundel.getString("res_strfromdomainDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfromdomain;
    }


    /**
     * This method initializes  fJPanelfromdomain
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfromdomain() {
        if (fJPanelfromdomain == null) {
            try {
                fJPanelfromdomain = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfromdomain.setLayout(layFlowLayout); // Generated
                fJPanelfromdomain.add(getJLabelfromdomain(), null); // Generated
                fJPanelfromdomain.add(getStringTextFieldfromdomain(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfromdomain;
    }
//end DB field fromdomain
//start DB field host
    /**
     * This method initializes fStringTextFieldhost
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldhost() {
        if (fStringTextFieldhost == null) {
            try {
                fStringTextFieldhost = new StringTextField(); // Generated
                fStringTextFieldhost.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldhost;
    }
        
    /**
     * This method initializes  fJLabelhost
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelhost() {
        if (fJLabelhost == null) {
            try {
                 fJLabelhost = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelhost.setText(resBundel.getString("res_strhostDisplayName")); // Generated
                 fJLabelhost.setToolTipText(resBundel.getString("res_strhostDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelhost;
    }


    /**
     * This method initializes  fJPanelhost
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
//end DB field host
//start DB field incominglimit
    /**
     * This method initializes fIntegerTextFieldincominglimit
     *
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldincominglimit() {
        if (fIntegerTextFieldincominglimit == null) {
            try {
                fIntegerTextFieldincominglimit = new IntegerTextField(); // Generated
                fIntegerTextFieldincominglimit.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldincominglimit;
    }
        
    /**
     * This method initializes  fJLabelincominglimit
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelincominglimit() {
        if (fJLabelincominglimit == null) {
            try {
                 fJLabelincominglimit = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelincominglimit.setText(resBundel.getString("res_strincominglimitDisplayName")); // Generated
                 fJLabelincominglimit.setToolTipText(resBundel.getString("res_strincominglimitDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelincominglimit;
    }


    /**
     * This method initializes  fJPanelincominglimit
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelincominglimit() {
        if (fJPanelincominglimit == null) {
            try {
                fJPanelincominglimit = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelincominglimit.setLayout(layFlowLayout); // Generated
                fJPanelincominglimit.add(getJLabelincominglimit(), null); // Generated
                fJPanelincominglimit.add(getIntegerTextFieldincominglimit(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelincominglimit;
    }
//end DB field incominglimit
//start DB field outgoinglimit
    /**
     * This method initializes fIntegerTextFieldoutgoinglimit
     *
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldoutgoinglimit() {
        if (fIntegerTextFieldoutgoinglimit == null) {
            try {
                fIntegerTextFieldoutgoinglimit = new IntegerTextField(); // Generated
                fIntegerTextFieldoutgoinglimit.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldoutgoinglimit;
    }
        
    /**
     * This method initializes  fJLabeloutgoinglimit
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeloutgoinglimit() {
        if (fJLabeloutgoinglimit == null) {
            try {
                 fJLabeloutgoinglimit = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeloutgoinglimit.setText(resBundel.getString("res_stroutgoinglimitDisplayName")); // Generated
                 fJLabeloutgoinglimit.setToolTipText(resBundel.getString("res_stroutgoinglimitDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeloutgoinglimit;
    }


    /**
     * This method initializes  fJPaneloutgoinglimit
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneloutgoinglimit() {
        if (fJPaneloutgoinglimit == null) {
            try {
                fJPaneloutgoinglimit = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneloutgoinglimit.setLayout(layFlowLayout); // Generated
                fJPaneloutgoinglimit.add(getJLabeloutgoinglimit(), null); // Generated
                fJPaneloutgoinglimit.add(getIntegerTextFieldoutgoinglimit(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneloutgoinglimit;
    }
//end DB field outgoinglimit
//start DB field insecure
    /**
     * This method initializes fStringTextFieldinsecure
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldinsecure() {
        if (fStringTextFieldinsecure == null) {
            try {
                fStringTextFieldinsecure = new StringTextField(); // Generated
                fStringTextFieldinsecure.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldinsecure;
    }
        
    /**
     * This method initializes  fJLabelinsecure
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelinsecure() {
        if (fJLabelinsecure == null) {
            try {
                 fJLabelinsecure = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelinsecure.setText(resBundel.getString("res_strinsecureDisplayName")); // Generated
                 fJLabelinsecure.setToolTipText(resBundel.getString("res_strinsecureDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelinsecure;
    }


    /**
     * This method initializes  fJPanelinsecure
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelinsecure() {
        if (fJPanelinsecure == null) {
            try {
                fJPanelinsecure = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelinsecure.setLayout(layFlowLayout); // Generated
                fJPanelinsecure.add(getJLabelinsecure(), null); // Generated
                fJPanelinsecure.add(getStringTextFieldinsecure(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelinsecure;
    }
//end DB field insecure
//start DB field language
    /**
     * This method initializes fStringTextFieldlanguage
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldlanguage() {
        if (fStringTextFieldlanguage == null) {
            try {
                fStringTextFieldlanguage = new StringTextField(); // Generated
                fStringTextFieldlanguage.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldlanguage;
    }
        
    /**
     * This method initializes  fJLabellanguage
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellanguage() {
        if (fJLabellanguage == null) {
            try {
                 fJLabellanguage = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabellanguage.setText(resBundel.getString("res_strlanguageDisplayName")); // Generated
                 fJLabellanguage.setToolTipText(resBundel.getString("res_strlanguageDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabellanguage;
    }


    /**
     * This method initializes  fJPanellanguage
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellanguage() {
        if (fJPanellanguage == null) {
            try {
                fJPanellanguage = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellanguage.setLayout(layFlowLayout); // Generated
                fJPanellanguage.add(getJLabellanguage(), null); // Generated
                fJPanellanguage.add(getStringTextFieldlanguage(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellanguage;
    }
//end DB field language
//start DB field mailbox
    /**
     * This method initializes fStringTextFieldmailbox
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmailbox() {
        if (fStringTextFieldmailbox == null) {
            try {
                fStringTextFieldmailbox = new StringTextField(); // Generated
                fStringTextFieldmailbox.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmailbox;
    }
        
    /**
     * This method initializes  fJLabelmailbox
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmailbox() {
        if (fJLabelmailbox == null) {
            try {
                 fJLabelmailbox = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmailbox.setText(resBundel.getString("res_strmailboxDisplayName")); // Generated
                 fJLabelmailbox.setToolTipText(resBundel.getString("res_strmailboxDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmailbox;
    }


    /**
     * This method initializes  fJPanelmailbox
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
//end DB field mailbox
//start DB field md5secret
    /**
     * This method initializes fStringTextFieldmd5secret
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmd5secret() {
        if (fStringTextFieldmd5secret == null) {
            try {
                fStringTextFieldmd5secret = new StringTextField(); // Generated
                fStringTextFieldmd5secret.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmd5secret;
    }
        
    /**
     * This method initializes  fJLabelmd5secret
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmd5secret() {
        if (fJLabelmd5secret == null) {
            try {
                 fJLabelmd5secret = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmd5secret.setText(resBundel.getString("res_strmd5secretDisplayName")); // Generated
                 fJLabelmd5secret.setToolTipText(resBundel.getString("res_strmd5secretDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmd5secret;
    }


    /**
     * This method initializes  fJPanelmd5secret
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmd5secret() {
        if (fJPanelmd5secret == null) {
            try {
                fJPanelmd5secret = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmd5secret.setLayout(layFlowLayout); // Generated
                fJPanelmd5secret.add(getJLabelmd5secret(), null); // Generated
                fJPanelmd5secret.add(getStringTextFieldmd5secret(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmd5secret;
    }
//end DB field md5secret
//start DB field nat
    /**
     * This method initializes fCustomCheckBoxnat
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxnat() {
        if (fCustomCheckBoxnat == null) {
            try {
                fCustomCheckBoxnat = new CustomCheckBox(); // Generated
                fCustomCheckBoxnat.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxnat;
    }
        
    /**
     * This method initializes  fJLabelnat
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelnat() {
        if (fJLabelnat == null) {
            try {
                 fJLabelnat = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelnat.setText(resBundel.getString("res_strnatDisplayName")); // Generated
                 fJLabelnat.setToolTipText(resBundel.getString("res_strnatDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelnat;
    }


    /**
     * This method initializes  fJPanelnat
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelnat() {
        if (fJPanelnat == null) {
            try {
                fJPanelnat = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelnat.setLayout(layFlowLayout); // Generated
                fJPanelnat.add(getJLabelnat(), null); // Generated
                fJPanelnat.add(getCustomCheckBoxnat(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelnat;
    }
//end DB field nat
//start DB field pickupgroup
    /**
     * This method initializes fStringTextFieldpickupgroup
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpickupgroup() {
        if (fStringTextFieldpickupgroup == null) {
            try {
                fStringTextFieldpickupgroup = new StringTextField(); // Generated
                fStringTextFieldpickupgroup.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpickupgroup;
    }
        
    /**
     * This method initializes  fJLabelpickupgroup
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpickupgroup() {
        if (fJLabelpickupgroup == null) {
            try {
                 fJLabelpickupgroup = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelpickupgroup.setText(resBundel.getString("res_strpickupgroupDisplayName")); // Generated
                 fJLabelpickupgroup.setToolTipText(resBundel.getString("res_strpickupgroupDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelpickupgroup;
    }


    /**
     * This method initializes  fJPanelpickupgroup
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpickupgroup() {
        if (fJPanelpickupgroup == null) {
            try {
                fJPanelpickupgroup = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpickupgroup.setLayout(layFlowLayout); // Generated
                fJPanelpickupgroup.add(getJLabelpickupgroup(), null); // Generated
                fJPanelpickupgroup.add(getStringTextFieldpickupgroup(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpickupgroup;
    }
//end DB field pickupgroup
//start DB field port
    /**
     * This method initializes fIntegerTextFieldport
     *
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldport() {
        if (fIntegerTextFieldport == null) {
            try {
                fIntegerTextFieldport = new IntegerTextField(); // Generated
                fIntegerTextFieldport.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldport;
    }
        
    /**
     * This method initializes  fJLabelport
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelport() {
        if (fJLabelport == null) {
            try {
                 fJLabelport = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelport.setText(resBundel.getString("res_strportDisplayName")); // Generated
                 fJLabelport.setToolTipText(resBundel.getString("res_strportDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelport;
    }


    /**
     * This method initializes  fJPanelport
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelport() {
        if (fJPanelport == null) {
            try {
                fJPanelport = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelport.setLayout(layFlowLayout); // Generated
                fJPanelport.add(getJLabelport(), null); // Generated
                fJPanelport.add(getIntegerTextFieldport(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelport;
    }
//end DB field port
//start DB field qualify
    /**
     * This method initializes fStringTextFieldqualify
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldqualify() {
        if (fStringTextFieldqualify == null) {
            try {
                fStringTextFieldqualify = new StringTextField(); // Generated
                fStringTextFieldqualify.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldqualify;
    }
        
    /**
     * This method initializes  fJLabelqualify
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelqualify() {
        if (fJLabelqualify == null) {
            try {
                 fJLabelqualify = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelqualify.setText(resBundel.getString("res_strqualifyDisplayName")); // Generated
                 fJLabelqualify.setToolTipText(resBundel.getString("res_strqualifyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelqualify;
    }


    /**
     * This method initializes  fJPanelqualify
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
                fJPanelqualify.add(getStringTextFieldqualify(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelqualify;
    }
//end DB field qualify
//start DB field restrictcid
    /**
     * This method initializes fCustomCheckBoxrestrictcid
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxrestrictcid() {
        if (fCustomCheckBoxrestrictcid == null) {
            try {
                fCustomCheckBoxrestrictcid = new CustomCheckBox(); // Generated
                fCustomCheckBoxrestrictcid.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxrestrictcid;
    }
        
    /**
     * This method initializes  fJLabelrestrictcid
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrestrictcid() {
        if (fJLabelrestrictcid == null) {
            try {
                 fJLabelrestrictcid = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelrestrictcid.setText(resBundel.getString("res_strrestrictcidDisplayName")); // Generated
                 fJLabelrestrictcid.setToolTipText(resBundel.getString("res_strrestrictcidDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelrestrictcid;
    }


    /**
     * This method initializes  fJPanelrestrictcid
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrestrictcid() {
        if (fJPanelrestrictcid == null) {
            try {
                fJPanelrestrictcid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrestrictcid.setLayout(layFlowLayout); // Generated
                fJPanelrestrictcid.add(getJLabelrestrictcid(), null); // Generated
                fJPanelrestrictcid.add(getCustomCheckBoxrestrictcid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrestrictcid;
    }
//end DB field restrictcid
//start DB field rtptimeout
    /**
     * This method initializes fIntegerTextFieldrtptimeout
     *
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldrtptimeout() {
        if (fIntegerTextFieldrtptimeout == null) {
            try {
                fIntegerTextFieldrtptimeout = new IntegerTextField(); // Generated
                fIntegerTextFieldrtptimeout.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldrtptimeout;
    }
        
    /**
     * This method initializes  fJLabelrtptimeout
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrtptimeout() {
        if (fJLabelrtptimeout == null) {
            try {
                 fJLabelrtptimeout = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelrtptimeout.setText(resBundel.getString("res_strrtptimeoutDisplayName")); // Generated
                 fJLabelrtptimeout.setToolTipText(resBundel.getString("res_strrtptimeoutDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelrtptimeout;
    }


    /**
     * This method initializes  fJPanelrtptimeout
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrtptimeout() {
        if (fJPanelrtptimeout == null) {
            try {
                fJPanelrtptimeout = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrtptimeout.setLayout(layFlowLayout); // Generated
                fJPanelrtptimeout.add(getJLabelrtptimeout(), null); // Generated
                fJPanelrtptimeout.add(getIntegerTextFieldrtptimeout(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrtptimeout;
    }
//end DB field rtptimeout
//start DB field rtpholdtimeout
    /**
     * This method initializes fIntegerTextFieldrtpholdtimeout
     *
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldrtpholdtimeout() {
        if (fIntegerTextFieldrtpholdtimeout == null) {
            try {
                fIntegerTextFieldrtpholdtimeout = new IntegerTextField(); // Generated
                fIntegerTextFieldrtpholdtimeout.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldrtpholdtimeout;
    }
        
    /**
     * This method initializes  fJLabelrtpholdtimeout
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrtpholdtimeout() {
        if (fJLabelrtpholdtimeout == null) {
            try {
                 fJLabelrtpholdtimeout = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelrtpholdtimeout.setText(resBundel.getString("res_strrtpholdtimeoutDisplayName")); // Generated
                 fJLabelrtpholdtimeout.setToolTipText(resBundel.getString("res_strrtpholdtimeoutDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelrtpholdtimeout;
    }


    /**
     * This method initializes  fJPanelrtpholdtimeout
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrtpholdtimeout() {
        if (fJPanelrtpholdtimeout == null) {
            try {
                fJPanelrtpholdtimeout = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrtpholdtimeout.setLayout(layFlowLayout); // Generated
                fJPanelrtpholdtimeout.add(getJLabelrtpholdtimeout(), null); // Generated
                fJPanelrtpholdtimeout.add(getIntegerTextFieldrtpholdtimeout(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrtpholdtimeout;
    }
//end DB field rtpholdtimeout
//start DB field secret
    /**
     * This method initializes fStringTextFieldsecret
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsecret() {
        if (fStringTextFieldsecret == null) {
            try {
                fStringTextFieldsecret = new StringTextField(); // Generated
                fStringTextFieldsecret.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsecret;
    }
        
    /**
     * This method initializes  fJLabelsecret
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsecret() {
        if (fJLabelsecret == null) {
            try {
                 fJLabelsecret = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelsecret.setText(resBundel.getString("res_strsecretDisplayName")); // Generated
                 fJLabelsecret.setToolTipText(resBundel.getString("res_strsecretDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelsecret;
    }


    /**
     * This method initializes  fJPanelsecret
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
//end DB field secret
//start DB field type
    /**
     * This method initializes fJEnumComboboxPeerTypetype
     *
     * @return JEnumComboboxPeerType
     */
    public JEnumComboboxPeerType getJEnumComboboxPeerTypetype() {
        if (fJEnumComboboxPeerTypetype == null) {
            try {
                fJEnumComboboxPeerTypetype = new JEnumComboboxPeerType(); // Generated
                fJEnumComboboxPeerTypetype.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJEnumComboboxPeerTypetype;
    }
        
    /**
     * This method initializes  fJLabeltype
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltype() {
        if (fJLabeltype == null) {
            try {
                 fJLabeltype = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltype.setText(resBundel.getString("res_strtypeDisplayName")); // Generated
                 fJLabeltype.setToolTipText(resBundel.getString("res_strtypeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltype;
    }


    /**
     * This method initializes  fJPaneltype
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltype() {
        if (fJPaneltype == null) {
            try {
                fJPaneltype = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltype.setLayout(layFlowLayout); // Generated
                fJPaneltype.add(getJLabeltype(), null); // Generated
                fJPaneltype.add(getJEnumComboboxPeerTypetype(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltype;
    }
//end DB field type
//start DB field username
    /**
     * This method initializes fStringTextFieldusername
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldusername() {
        if (fStringTextFieldusername == null) {
            try {
                fStringTextFieldusername = new StringTextField(); // Generated
                fStringTextFieldusername.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldusername;
    }
        
    /**
     * This method initializes  fJLabelusername
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelusername() {
        if (fJLabelusername == null) {
            try {
                 fJLabelusername = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelusername.setText(resBundel.getString("res_strusernameDisplayName")); // Generated
                 fJLabelusername.setToolTipText(resBundel.getString("res_strusernameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelusername;
    }


    /**
     * This method initializes  fJPanelusername
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelusername() {
        if (fJPanelusername == null) {
            try {
                fJPanelusername = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelusername.setLayout(layFlowLayout); // Generated
                fJPanelusername.add(getJLabelusername(), null); // Generated
                fJPanelusername.add(getStringTextFieldusername(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelusername;
    }
//end DB field username
//start DB field musiconhold
    /**
     * This method initializes fStringTextFieldmusiconhold
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmusiconhold() {
        if (fStringTextFieldmusiconhold == null) {
            try {
                fStringTextFieldmusiconhold = new StringTextField(); // Generated
                fStringTextFieldmusiconhold.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmusiconhold;
    }
        
    /**
     * This method initializes  fJLabelmusiconhold
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmusiconhold() {
        if (fJLabelmusiconhold == null) {
            try {
                 fJLabelmusiconhold = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmusiconhold.setText(resBundel.getString("res_strmusiconholdDisplayName")); // Generated
                 fJLabelmusiconhold.setToolTipText(resBundel.getString("res_strmusiconholdDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmusiconhold;
    }


    /**
     * This method initializes  fJPanelmusiconhold
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmusiconhold() {
        if (fJPanelmusiconhold == null) {
            try {
                fJPanelmusiconhold = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmusiconhold.setLayout(layFlowLayout); // Generated
                fJPanelmusiconhold.add(getJLabelmusiconhold(), null); // Generated
                fJPanelmusiconhold.add(getStringTextFieldmusiconhold(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmusiconhold;
    }
//end DB field musiconhold
//start DB field callerid
    /**
     * This method initializes fStringTextFieldcallerid
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcallerid() {
        if (fStringTextFieldcallerid == null) {
            try {
                fStringTextFieldcallerid = new StringTextField(); // Generated
                fStringTextFieldcallerid.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcallerid;
    }
        
    /**
     * This method initializes  fJLabelcallerid
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcallerid() {
        if (fJLabelcallerid == null) {
            try {
                 fJLabelcallerid = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcallerid.setText(resBundel.getString("res_strcalleridDisplayName")); // Generated
                 fJLabelcallerid.setToolTipText(resBundel.getString("res_strcalleridDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcallerid;
    }


    /**
     * This method initializes  fJPanelcallerid
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
//end DB field callerid
//start DB field disallow
    /**
     * This method initializes fEnumSetTextFieldCodecsdisallow
     *
     * @return EnumSetTextFieldCodecs
     */
    public EnumSetTextFieldCodecs getEnumSetTextFieldCodecsdisallow() {
        if (fEnumSetTextFieldCodecsdisallow == null) {
            try {
                fEnumSetTextFieldCodecsdisallow = new EnumSetTextFieldCodecs(); // Generated
                fEnumSetTextFieldCodecsdisallow.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fEnumSetTextFieldCodecsdisallow;
    }
        
    /**
     * This method initializes  fJLabeldisallow
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldisallow() {
        if (fJLabeldisallow == null) {
            try {
                 fJLabeldisallow = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeldisallow.setText(resBundel.getString("res_strdisallowDisplayName")); // Generated
                 fJLabeldisallow.setToolTipText(resBundel.getString("res_strdisallowDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeldisallow;
    }


    /**
     * This method initializes  fJPaneldisallow
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
//end DB field disallow
//start DB field allow
    /**
     * This method initializes fEnumSetTextFieldCodecsallow
     *
     * @return EnumSetTextFieldCodecs
     */
    public EnumSetTextFieldCodecs getEnumSetTextFieldCodecsallow() {
        if (fEnumSetTextFieldCodecsallow == null) {
            try {
                fEnumSetTextFieldCodecsallow = new EnumSetTextFieldCodecs(); // Generated
                fEnumSetTextFieldCodecsallow.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fEnumSetTextFieldCodecsallow;
    }
        
    /**
     * This method initializes  fJLabelallow
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelallow() {
        if (fJLabelallow == null) {
            try {
                 fJLabelallow = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelallow.setText(resBundel.getString("res_strallowDisplayName")); // Generated
                 fJLabelallow.setToolTipText(resBundel.getString("res_strallowDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelallow;
    }


    /**
     * This method initializes  fJPanelallow
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
//end DB field allow

}

	