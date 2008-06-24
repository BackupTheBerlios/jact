package com.useit.jact.gui.sipconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.gui.widgets.EnumSetTextFieldCodecs;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.JEnumComboboxDtmfmode;
import com.useit.jact.gui.widgets.PbxContextTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.sipconf.Sipgeneral;

/**
 * <p>
 * SipgeneralDataPanel
 * </p>
 * Created : Fri May 26 14:16:15 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipgeneralDataPanel.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
public class SipgeneralDataPanel extends SimpleDataObjectPanel{
	protected Sipgeneral dataObject;
	//protected SipgeneralChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SipgeneralDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSipgeneralResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSipgeneralResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SipgeneralResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SipgeneralCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fCustomCheckBoxautocreatepeer,		
			fIntegerTextFieldbindport,		
			fStringTextFieldcanreinvite,		
			fPbxContextTextFieldcontext,		
			fIntegerTextFielddefaultexpirey,		
			fJEnumComboboxDtmfmodedtmfmode,		
			fStringTextFieldexternip,		
			fStringTextFieldexternhost,		
			fStringTextFieldexternrefresh,		
			fStringTextFieldlocalnet,		
			fStringTextFieldfromdomain,		
			fIntegerTextFieldmaxexpirey,		
			fCustomCheckBoxnat,		
			fStringTextFieldnotifymimetype,		
			fCustomCheckBoxpedantic,		
			fIntegerTextFieldport,		
			fCustomCheckBoxpromiscredir,		
			fCustomCheckBoxsrvlookup,		
			fStringTextFieldtos,		
			fCustomCheckBoxvideosupport,		
			fStringTextFielduseragent,		
			fCustomCheckBoxtrustrpid,		
			fStringTextFieldrealm,		
			fIntegerTextFieldrtptimeout,		
			fCustomCheckBoxrelaxdtmf,		
			fIntegerTextFieldrtpholdtimeout,		
			fStringTextFieldprogressinband,		
			fCustomCheckBoxusereqphone,		
			fCustomCheckBoxcompactheaders,		
			fCustomCheckBoxsipdebug,		
			fIntegerTextFieldcheckmwi,		
			fCustomCheckBoxrecordhistory,		
			fEnumSetTextFieldCodecsallow,		
			fEnumSetTextFieldCodecsdisallow,		
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
		this.setSize(400,(35)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(35); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelautocreatepeer(), null); // Generated
        this.add(getJPanelbindaddr(), null); // Generated
        this.add(getJPanelbindport(), null); // Generated
        this.add(getJPanelcanreinvite(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPaneldefaultexpirey(), null); // Generated
        this.add(getJPaneldtmfmode(), null); // Generated
        this.add(getJPanelexternip(), null); // Generated
        this.add(getJPanelexternhost(), null); // Generated
        this.add(getJPanelexternrefresh(), null); // Generated
        this.add(getJPanellocalnet(), null); // Generated
        this.add(getJPanelfromdomain(), null); // Generated
        this.add(getJPanelmaxexpirey(), null); // Generated
        this.add(getJPanelnat(), null); // Generated
        this.add(getJPanelnotifymimetype(), null); // Generated
        this.add(getJPanelpedantic(), null); // Generated
        this.add(getJPanelport(), null); // Generated
        this.add(getJPanelpromiscredir(), null); // Generated
        this.add(getJPanelsrvlookup(), null); // Generated
        this.add(getJPaneltos(), null); // Generated
        this.add(getJPanelvideosupport(), null); // Generated
        this.add(getJPaneluseragent(), null); // Generated
        this.add(getJPaneltrustrpid(), null); // Generated
        this.add(getJPanelrealm(), null); // Generated
        this.add(getJPanelrtptimeout(), null); // Generated
        this.add(getJPanelrelaxdtmf(), null); // Generated
        this.add(getJPanelrtpholdtimeout(), null); // Generated
        this.add(getJPanelprogressinband(), null); // Generated
        this.add(getJPanelusereqphone(), null); // Generated
        this.add(getJPanelcompactheaders(), null); // Generated
        this.add(getJPanelsipdebug(), null); // Generated
        this.add(getJPanelcheckmwi(), null); // Generated
        this.add(getJPanelrecordhistory(), null); // Generated
        this.add(getJPanelallow(), null); // Generated
        this.add(getJPaneldisallow(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fCustomCheckBoxautocreatepeer.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldbindaddr.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldbindport.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcanreinvite.getDocument().addDocumentListener(textChangeAct);
		fPbxContextTextFieldcontext.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFielddefaultexpirey.getDocument().addDocumentListener(textChangeAct);
		fJEnumComboboxDtmfmodedtmfmode.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldexternip.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldexternhost.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldexternrefresh.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldlocalnet.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldfromdomain.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldmaxexpirey.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxnat.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldnotifymimetype.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxpedantic.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldport.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxpromiscredir.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxsrvlookup.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtos.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxvideosupport.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielduseragent.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxtrustrpid.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldrealm.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldrtptimeout.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxrelaxdtmf.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldrtpholdtimeout.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldprogressinband.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxusereqphone.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxcompactheaders.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxsipdebug.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldcheckmwi.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxrecordhistory.getDocument().addDocumentListener(textChangeAct);
		fEnumSetTextFieldCodecsallow.getDocument().addDocumentListener(textChangeAct);
		fEnumSetTextFieldCodecsdisallow.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fCustomCheckBoxautocreatepeer.setValue(dataObject.getAutocreatepeer());
        fStringTextFieldbindaddr.setValue(dataObject.getBindaddr());
        fIntegerTextFieldbindport.setValue(dataObject.getBindport());
        fStringTextFieldcanreinvite.setValue(dataObject.getCanreinvite());
        fPbxContextTextFieldcontext.setValue(dataObject.getContext());
        fIntegerTextFielddefaultexpirey.setValue(dataObject.getDefaultexpirey());
        fJEnumComboboxDtmfmodedtmfmode.setValue(dataObject.getDtmfmode());
        fStringTextFieldexternip.setValue(dataObject.getExternip());
        fStringTextFieldexternhost.setValue(dataObject.getExternhost());
        fStringTextFieldexternrefresh.setValue(dataObject.getExternrefresh());
        fStringTextFieldlocalnet.setValue(dataObject.getLocalnet());
        fStringTextFieldfromdomain.setValue(dataObject.getFromdomain());
        fIntegerTextFieldmaxexpirey.setValue(dataObject.getMaxexpirey());
        fCustomCheckBoxnat.setValue(dataObject.getNat());
        fStringTextFieldnotifymimetype.setValue(dataObject.getNotifymimetype());
        fCustomCheckBoxpedantic.setValue(dataObject.getPedantic());
        fIntegerTextFieldport.setValue(dataObject.getPort());
        fCustomCheckBoxpromiscredir.setValue(dataObject.getPromiscredir());
        fCustomCheckBoxsrvlookup.setValue(dataObject.getSrvlookup());
        fStringTextFieldtos.setValue(dataObject.getTos());
        fCustomCheckBoxvideosupport.setValue(dataObject.getVideosupport());
        fStringTextFielduseragent.setValue(dataObject.getUseragent());
        fCustomCheckBoxtrustrpid.setValue(dataObject.getTrustrpid());
        fStringTextFieldrealm.setValue(dataObject.getRealm());
        fIntegerTextFieldrtptimeout.setValue(dataObject.getRtptimeout());
        fCustomCheckBoxrelaxdtmf.setValue(dataObject.getRelaxdtmf());
        fIntegerTextFieldrtpholdtimeout.setValue(dataObject.getRtpholdtimeout());
        fStringTextFieldprogressinband.setValue(dataObject.getProgressinband());
        fCustomCheckBoxusereqphone.setValue(dataObject.getUsereqphone());
        fCustomCheckBoxcompactheaders.setValue(dataObject.getCompactheaders());
        fCustomCheckBoxsipdebug.setValue(dataObject.getSipdebug());
        fIntegerTextFieldcheckmwi.setValue(dataObject.getCheckmwi());
        fCustomCheckBoxrecordhistory.setValue(dataObject.getRecordhistory());
        fEnumSetTextFieldCodecsallow.setValue(dataObject.getAllow());
        fEnumSetTextFieldCodecsdisallow.setValue(dataObject.getDisallow());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setAutocreatepeer(fCustomCheckBoxautocreatepeer.getValue());
        dataObject.setBindaddr(fStringTextFieldbindaddr.getValue());
        dataObject.setBindport(fIntegerTextFieldbindport.getValue());
        dataObject.setCanreinvite(fStringTextFieldcanreinvite.getValue());
        dataObject.setContext(fPbxContextTextFieldcontext.getValue());
        dataObject.setDefaultexpirey(fIntegerTextFielddefaultexpirey.getValue());
        dataObject.setDtmfmode(fJEnumComboboxDtmfmodedtmfmode.getValue());
        dataObject.setExternip(fStringTextFieldexternip.getValue());
        dataObject.setExternhost(fStringTextFieldexternhost.getValue());
        dataObject.setExternrefresh(fStringTextFieldexternrefresh.getValue());
        dataObject.setLocalnet(fStringTextFieldlocalnet.getValue());
        dataObject.setFromdomain(fStringTextFieldfromdomain.getValue());
        dataObject.setMaxexpirey(fIntegerTextFieldmaxexpirey.getValue());
        dataObject.setNat(fCustomCheckBoxnat.getValue());
        dataObject.setNotifymimetype(fStringTextFieldnotifymimetype.getValue());
        dataObject.setPedantic(fCustomCheckBoxpedantic.getValue());
        dataObject.setPort(fIntegerTextFieldport.getValue());
        dataObject.setPromiscredir(fCustomCheckBoxpromiscredir.getValue());
        dataObject.setSrvlookup(fCustomCheckBoxsrvlookup.getValue());
        dataObject.setTos(fStringTextFieldtos.getValue());
        dataObject.setVideosupport(fCustomCheckBoxvideosupport.getValue());
        dataObject.setUseragent(fStringTextFielduseragent.getValue());
        dataObject.setTrustrpid(fCustomCheckBoxtrustrpid.getValue());
        dataObject.setRealm(fStringTextFieldrealm.getValue());
        dataObject.setRtptimeout(fIntegerTextFieldrtptimeout.getValue());
        dataObject.setRelaxdtmf(fCustomCheckBoxrelaxdtmf.getValue());
        dataObject.setRtpholdtimeout(fIntegerTextFieldrtpholdtimeout.getValue());
        dataObject.setProgressinband(fStringTextFieldprogressinband.getValue());
        dataObject.setUsereqphone(fCustomCheckBoxusereqphone.getValue());
        dataObject.setCompactheaders(fCustomCheckBoxcompactheaders.getValue());
        dataObject.setSipdebug(fCustomCheckBoxsipdebug.getValue());
        dataObject.setCheckmwi(fIntegerTextFieldcheckmwi.getValue());
        dataObject.setRecordhistory(fCustomCheckBoxrecordhistory.getValue());
        dataObject.setAllow(fEnumSetTextFieldCodecsallow.getValue());
        dataObject.setDisallow(fEnumSetTextFieldCodecsdisallow.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Sipgeneral
	 */
	public void setDataObject(Object aSipgeneral) {
	    //abstractdataObject = (AbstractConfigObject) aSipgeneral;
		setDataObject((Sipgeneral) aSipgeneral);
		//dataObject = aSipgeneral;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Sipgeneral
	 */
	public void setDataObject(Sipgeneral aSipgeneral) {
	    //abstractdataObject = (AbstractConfigObject) aSipgeneral;
		dataObject = aSipgeneral;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected CustomCheckBox fCustomCheckBoxautocreatepeer;
    protected javax.swing.JLabel fJLabelautocreatepeer;
	protected javax.swing.JPanel fJPanelautocreatepeer;
    protected StringTextField fStringTextFieldbindaddr;
    protected javax.swing.JLabel fJLabelbindaddr;
	protected javax.swing.JPanel fJPanelbindaddr;
    protected IntegerTextField fIntegerTextFieldbindport;
    protected javax.swing.JLabel fJLabelbindport;
	protected javax.swing.JPanel fJPanelbindport;
    protected StringTextField fStringTextFieldcanreinvite;
    protected javax.swing.JLabel fJLabelcanreinvite;
	protected javax.swing.JPanel fJPanelcanreinvite;
    protected PbxContextTextField fPbxContextTextFieldcontext;
    protected javax.swing.JLabel fJLabelcontext;
	protected javax.swing.JPanel fJPanelcontext;
    protected IntegerTextField fIntegerTextFielddefaultexpirey;
    protected javax.swing.JLabel fJLabeldefaultexpirey;
	protected javax.swing.JPanel fJPaneldefaultexpirey;
    protected JEnumComboboxDtmfmode fJEnumComboboxDtmfmodedtmfmode;
    protected javax.swing.JLabel fJLabeldtmfmode;
	protected javax.swing.JPanel fJPaneldtmfmode;
    protected StringTextField fStringTextFieldexternip;
    protected javax.swing.JLabel fJLabelexternip;
	protected javax.swing.JPanel fJPanelexternip;
    protected StringTextField fStringTextFieldexternhost;
    protected javax.swing.JLabel fJLabelexternhost;
	protected javax.swing.JPanel fJPanelexternhost;
    protected StringTextField fStringTextFieldexternrefresh;
    protected javax.swing.JLabel fJLabelexternrefresh;
	protected javax.swing.JPanel fJPanelexternrefresh;
    protected StringTextField fStringTextFieldlocalnet;
    protected javax.swing.JLabel fJLabellocalnet;
	protected javax.swing.JPanel fJPanellocalnet;
    protected StringTextField fStringTextFieldfromdomain;
    protected javax.swing.JLabel fJLabelfromdomain;
	protected javax.swing.JPanel fJPanelfromdomain;
    protected IntegerTextField fIntegerTextFieldmaxexpirey;
    protected javax.swing.JLabel fJLabelmaxexpirey;
	protected javax.swing.JPanel fJPanelmaxexpirey;
    protected CustomCheckBox fCustomCheckBoxnat;
    protected javax.swing.JLabel fJLabelnat;
	protected javax.swing.JPanel fJPanelnat;
    protected StringTextField fStringTextFieldnotifymimetype;
    protected javax.swing.JLabel fJLabelnotifymimetype;
	protected javax.swing.JPanel fJPanelnotifymimetype;
    protected CustomCheckBox fCustomCheckBoxpedantic;
    protected javax.swing.JLabel fJLabelpedantic;
	protected javax.swing.JPanel fJPanelpedantic;
    protected IntegerTextField fIntegerTextFieldport;
    protected javax.swing.JLabel fJLabelport;
	protected javax.swing.JPanel fJPanelport;
    protected CustomCheckBox fCustomCheckBoxpromiscredir;
    protected javax.swing.JLabel fJLabelpromiscredir;
	protected javax.swing.JPanel fJPanelpromiscredir;
    protected CustomCheckBox fCustomCheckBoxsrvlookup;
    protected javax.swing.JLabel fJLabelsrvlookup;
	protected javax.swing.JPanel fJPanelsrvlookup;
    protected StringTextField fStringTextFieldtos;
    protected javax.swing.JLabel fJLabeltos;
	protected javax.swing.JPanel fJPaneltos;
    protected CustomCheckBox fCustomCheckBoxvideosupport;
    protected javax.swing.JLabel fJLabelvideosupport;
	protected javax.swing.JPanel fJPanelvideosupport;
    protected StringTextField fStringTextFielduseragent;
    protected javax.swing.JLabel fJLabeluseragent;
	protected javax.swing.JPanel fJPaneluseragent;
    protected CustomCheckBox fCustomCheckBoxtrustrpid;
    protected javax.swing.JLabel fJLabeltrustrpid;
	protected javax.swing.JPanel fJPaneltrustrpid;
    protected StringTextField fStringTextFieldrealm;
    protected javax.swing.JLabel fJLabelrealm;
	protected javax.swing.JPanel fJPanelrealm;
    protected IntegerTextField fIntegerTextFieldrtptimeout;
    protected javax.swing.JLabel fJLabelrtptimeout;
	protected javax.swing.JPanel fJPanelrtptimeout;
    protected CustomCheckBox fCustomCheckBoxrelaxdtmf;
    protected javax.swing.JLabel fJLabelrelaxdtmf;
	protected javax.swing.JPanel fJPanelrelaxdtmf;
    protected IntegerTextField fIntegerTextFieldrtpholdtimeout;
    protected javax.swing.JLabel fJLabelrtpholdtimeout;
	protected javax.swing.JPanel fJPanelrtpholdtimeout;
    protected StringTextField fStringTextFieldprogressinband;
    protected javax.swing.JLabel fJLabelprogressinband;
	protected javax.swing.JPanel fJPanelprogressinband;
    protected CustomCheckBox fCustomCheckBoxusereqphone;
    protected javax.swing.JLabel fJLabelusereqphone;
	protected javax.swing.JPanel fJPanelusereqphone;
    protected CustomCheckBox fCustomCheckBoxcompactheaders;
    protected javax.swing.JLabel fJLabelcompactheaders;
	protected javax.swing.JPanel fJPanelcompactheaders;
    protected CustomCheckBox fCustomCheckBoxsipdebug;
    protected javax.swing.JLabel fJLabelsipdebug;
	protected javax.swing.JPanel fJPanelsipdebug;
    protected IntegerTextField fIntegerTextFieldcheckmwi;
    protected javax.swing.JLabel fJLabelcheckmwi;
	protected javax.swing.JPanel fJPanelcheckmwi;
    protected CustomCheckBox fCustomCheckBoxrecordhistory;
    protected javax.swing.JLabel fJLabelrecordhistory;
	protected javax.swing.JPanel fJPanelrecordhistory;
    protected EnumSetTextFieldCodecs fEnumSetTextFieldCodecsallow;
    protected javax.swing.JLabel fJLabelallow;
	protected javax.swing.JPanel fJPanelallow;
    protected EnumSetTextFieldCodecs fEnumSetTextFieldCodecsdisallow;
    protected javax.swing.JLabel fJLabeldisallow;
	protected javax.swing.JPanel fJPaneldisallow;
    

//start DB field autocreatepeer
    /**
     * This method initializes fCustomCheckBoxautocreatepeer
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxautocreatepeer() {
        if (fCustomCheckBoxautocreatepeer == null) {
            try {
                fCustomCheckBoxautocreatepeer = new CustomCheckBox(); // Generated
                fCustomCheckBoxautocreatepeer.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxautocreatepeer;
    }
        
    /**
     * This method initializes  fJLabelautocreatepeer
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelautocreatepeer() {
        if (fJLabelautocreatepeer == null) {
            try {
                 fJLabelautocreatepeer = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelautocreatepeer.setText(resBundel.getString("res_strautocreatepeerDisplayName")); // Generated
                 fJLabelautocreatepeer.setToolTipText(resBundel.getString("res_strautocreatepeerDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelautocreatepeer;
    }


    /**
     * This method initializes  fJPanelautocreatepeer
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelautocreatepeer() {
        if (fJPanelautocreatepeer == null) {
            try {
                fJPanelautocreatepeer = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelautocreatepeer.setLayout(layFlowLayout); // Generated
                fJPanelautocreatepeer.add(getJLabelautocreatepeer(), null); // Generated
                fJPanelautocreatepeer.add(getCustomCheckBoxautocreatepeer(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelautocreatepeer;
    }
//end DB field autocreatepeer
//start DB field bindaddr
    /**
     * This method initializes fStringTextFieldbindaddr
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldbindaddr() {
        if (fStringTextFieldbindaddr == null) {
            try {
                fStringTextFieldbindaddr = new StringTextField(); // Generated
                fStringTextFieldbindaddr.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldbindaddr;
    }
        
    /**
     * This method initializes  fJLabelbindaddr
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelbindaddr() {
        if (fJLabelbindaddr == null) {
            try {
                 fJLabelbindaddr = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelbindaddr.setText(resBundel.getString("res_strbindaddrDisplayName")); // Generated
                 fJLabelbindaddr.setToolTipText(resBundel.getString("res_strbindaddrDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelbindaddr;
    }


    /**
     * This method initializes  fJPanelbindaddr
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelbindaddr() {
        if (fJPanelbindaddr == null) {
            try {
                fJPanelbindaddr = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelbindaddr.setLayout(layFlowLayout); // Generated
                fJPanelbindaddr.add(getJLabelbindaddr(), null); // Generated
                fJPanelbindaddr.add(getStringTextFieldbindaddr(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelbindaddr;
    }
//end DB field bindaddr
//start DB field bindport
    /**
     * This method initializes fIntegerTextFieldbindport
     *
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldbindport() {
        if (fIntegerTextFieldbindport == null) {
            try {
                fIntegerTextFieldbindport = new IntegerTextField(); // Generated
                fIntegerTextFieldbindport.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldbindport;
    }
        
    /**
     * This method initializes  fJLabelbindport
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelbindport() {
        if (fJLabelbindport == null) {
            try {
                 fJLabelbindport = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelbindport.setText(resBundel.getString("res_strbindportDisplayName")); // Generated
                 fJLabelbindport.setToolTipText(resBundel.getString("res_strbindportDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelbindport;
    }


    /**
     * This method initializes  fJPanelbindport
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelbindport() {
        if (fJPanelbindport == null) {
            try {
                fJPanelbindport = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelbindport.setLayout(layFlowLayout); // Generated
                fJPanelbindport.add(getJLabelbindport(), null); // Generated
                fJPanelbindport.add(getIntegerTextFieldbindport(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelbindport;
    }
//end DB field bindport
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
//start DB field defaultexpirey
    /**
     * This method initializes fIntegerTextFielddefaultexpirey
     *
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFielddefaultexpirey() {
        if (fIntegerTextFielddefaultexpirey == null) {
            try {
                fIntegerTextFielddefaultexpirey = new IntegerTextField(); // Generated
                fIntegerTextFielddefaultexpirey.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFielddefaultexpirey;
    }
        
    /**
     * This method initializes  fJLabeldefaultexpirey
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldefaultexpirey() {
        if (fJLabeldefaultexpirey == null) {
            try {
                 fJLabeldefaultexpirey = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeldefaultexpirey.setText(resBundel.getString("res_strdefaultexpireyDisplayName")); // Generated
                 fJLabeldefaultexpirey.setToolTipText(resBundel.getString("res_strdefaultexpireyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeldefaultexpirey;
    }


    /**
     * This method initializes  fJPaneldefaultexpirey
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldefaultexpirey() {
        if (fJPaneldefaultexpirey == null) {
            try {
                fJPaneldefaultexpirey = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldefaultexpirey.setLayout(layFlowLayout); // Generated
                fJPaneldefaultexpirey.add(getJLabeldefaultexpirey(), null); // Generated
                fJPaneldefaultexpirey.add(getIntegerTextFielddefaultexpirey(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldefaultexpirey;
    }
//end DB field defaultexpirey
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
//start DB field externip
    /**
     * This method initializes fStringTextFieldexternip
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldexternip() {
        if (fStringTextFieldexternip == null) {
            try {
                fStringTextFieldexternip = new StringTextField(); // Generated
                fStringTextFieldexternip.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldexternip;
    }
        
    /**
     * This method initializes  fJLabelexternip
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelexternip() {
        if (fJLabelexternip == null) {
            try {
                 fJLabelexternip = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelexternip.setText(resBundel.getString("res_strexternipDisplayName")); // Generated
                 fJLabelexternip.setToolTipText(resBundel.getString("res_strexternipDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelexternip;
    }


    /**
     * This method initializes  fJPanelexternip
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelexternip() {
        if (fJPanelexternip == null) {
            try {
                fJPanelexternip = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelexternip.setLayout(layFlowLayout); // Generated
                fJPanelexternip.add(getJLabelexternip(), null); // Generated
                fJPanelexternip.add(getStringTextFieldexternip(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelexternip;
    }
//end DB field externip
//start DB field externhost
    /**
     * This method initializes fStringTextFieldexternhost
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldexternhost() {
        if (fStringTextFieldexternhost == null) {
            try {
                fStringTextFieldexternhost = new StringTextField(); // Generated
                fStringTextFieldexternhost.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldexternhost;
    }
        
    /**
     * This method initializes  fJLabelexternhost
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelexternhost() {
        if (fJLabelexternhost == null) {
            try {
                 fJLabelexternhost = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelexternhost.setText(resBundel.getString("res_strexternhostDisplayName")); // Generated
                 fJLabelexternhost.setToolTipText(resBundel.getString("res_strexternhostDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelexternhost;
    }


    /**
     * This method initializes  fJPanelexternhost
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelexternhost() {
        if (fJPanelexternhost == null) {
            try {
                fJPanelexternhost = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelexternhost.setLayout(layFlowLayout); // Generated
                fJPanelexternhost.add(getJLabelexternhost(), null); // Generated
                fJPanelexternhost.add(getStringTextFieldexternhost(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelexternhost;
    }
//end DB field externhost
//start DB field externrefresh
    /**
     * This method initializes fStringTextFieldexternrefresh
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldexternrefresh() {
        if (fStringTextFieldexternrefresh == null) {
            try {
                fStringTextFieldexternrefresh = new StringTextField(); // Generated
                fStringTextFieldexternrefresh.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldexternrefresh;
    }
        
    /**
     * This method initializes  fJLabelexternrefresh
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelexternrefresh() {
        if (fJLabelexternrefresh == null) {
            try {
                 fJLabelexternrefresh = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelexternrefresh.setText(resBundel.getString("res_strexternrefreshDisplayName")); // Generated
                 fJLabelexternrefresh.setToolTipText(resBundel.getString("res_strexternrefreshDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelexternrefresh;
    }


    /**
     * This method initializes  fJPanelexternrefresh
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelexternrefresh() {
        if (fJPanelexternrefresh == null) {
            try {
                fJPanelexternrefresh = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelexternrefresh.setLayout(layFlowLayout); // Generated
                fJPanelexternrefresh.add(getJLabelexternrefresh(), null); // Generated
                fJPanelexternrefresh.add(getStringTextFieldexternrefresh(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelexternrefresh;
    }
//end DB field externrefresh
//start DB field localnet
    /**
     * This method initializes fStringTextFieldlocalnet
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldlocalnet() {
        if (fStringTextFieldlocalnet == null) {
            try {
                fStringTextFieldlocalnet = new StringTextField(); // Generated
                fStringTextFieldlocalnet.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldlocalnet;
    }
        
    /**
     * This method initializes  fJLabellocalnet
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellocalnet() {
        if (fJLabellocalnet == null) {
            try {
                 fJLabellocalnet = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabellocalnet.setText(resBundel.getString("res_strlocalnetDisplayName")); // Generated
                 fJLabellocalnet.setToolTipText(resBundel.getString("res_strlocalnetDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabellocalnet;
    }


    /**
     * This method initializes  fJPanellocalnet
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellocalnet() {
        if (fJPanellocalnet == null) {
            try {
                fJPanellocalnet = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellocalnet.setLayout(layFlowLayout); // Generated
                fJPanellocalnet.add(getJLabellocalnet(), null); // Generated
                fJPanellocalnet.add(getStringTextFieldlocalnet(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellocalnet;
    }
//end DB field localnet
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
//start DB field maxexpirey
    /**
     * This method initializes fIntegerTextFieldmaxexpirey
     *
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldmaxexpirey() {
        if (fIntegerTextFieldmaxexpirey == null) {
            try {
                fIntegerTextFieldmaxexpirey = new IntegerTextField(); // Generated
                fIntegerTextFieldmaxexpirey.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldmaxexpirey;
    }
        
    /**
     * This method initializes  fJLabelmaxexpirey
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmaxexpirey() {
        if (fJLabelmaxexpirey == null) {
            try {
                 fJLabelmaxexpirey = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmaxexpirey.setText(resBundel.getString("res_strmaxexpireyDisplayName")); // Generated
                 fJLabelmaxexpirey.setToolTipText(resBundel.getString("res_strmaxexpireyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmaxexpirey;
    }


    /**
     * This method initializes  fJPanelmaxexpirey
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmaxexpirey() {
        if (fJPanelmaxexpirey == null) {
            try {
                fJPanelmaxexpirey = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmaxexpirey.setLayout(layFlowLayout); // Generated
                fJPanelmaxexpirey.add(getJLabelmaxexpirey(), null); // Generated
                fJPanelmaxexpirey.add(getIntegerTextFieldmaxexpirey(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmaxexpirey;
    }
//end DB field maxexpirey
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
//start DB field notifymimetype
    /**
     * This method initializes fStringTextFieldnotifymimetype
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldnotifymimetype() {
        if (fStringTextFieldnotifymimetype == null) {
            try {
                fStringTextFieldnotifymimetype = new StringTextField(); // Generated
                fStringTextFieldnotifymimetype.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldnotifymimetype;
    }
        
    /**
     * This method initializes  fJLabelnotifymimetype
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelnotifymimetype() {
        if (fJLabelnotifymimetype == null) {
            try {
                 fJLabelnotifymimetype = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelnotifymimetype.setText(resBundel.getString("res_strnotifymimetypeDisplayName")); // Generated
                 fJLabelnotifymimetype.setToolTipText(resBundel.getString("res_strnotifymimetypeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelnotifymimetype;
    }


    /**
     * This method initializes  fJPanelnotifymimetype
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelnotifymimetype() {
        if (fJPanelnotifymimetype == null) {
            try {
                fJPanelnotifymimetype = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelnotifymimetype.setLayout(layFlowLayout); // Generated
                fJPanelnotifymimetype.add(getJLabelnotifymimetype(), null); // Generated
                fJPanelnotifymimetype.add(getStringTextFieldnotifymimetype(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelnotifymimetype;
    }
//end DB field notifymimetype
//start DB field pedantic
    /**
     * This method initializes fCustomCheckBoxpedantic
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxpedantic() {
        if (fCustomCheckBoxpedantic == null) {
            try {
                fCustomCheckBoxpedantic = new CustomCheckBox(); // Generated
                fCustomCheckBoxpedantic.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxpedantic;
    }
        
    /**
     * This method initializes  fJLabelpedantic
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpedantic() {
        if (fJLabelpedantic == null) {
            try {
                 fJLabelpedantic = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelpedantic.setText(resBundel.getString("res_strpedanticDisplayName")); // Generated
                 fJLabelpedantic.setToolTipText(resBundel.getString("res_strpedanticDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelpedantic;
    }


    /**
     * This method initializes  fJPanelpedantic
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpedantic() {
        if (fJPanelpedantic == null) {
            try {
                fJPanelpedantic = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpedantic.setLayout(layFlowLayout); // Generated
                fJPanelpedantic.add(getJLabelpedantic(), null); // Generated
                fJPanelpedantic.add(getCustomCheckBoxpedantic(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpedantic;
    }
//end DB field pedantic
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
//start DB field promiscredir
    /**
     * This method initializes fCustomCheckBoxpromiscredir
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxpromiscredir() {
        if (fCustomCheckBoxpromiscredir == null) {
            try {
                fCustomCheckBoxpromiscredir = new CustomCheckBox(); // Generated
                fCustomCheckBoxpromiscredir.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxpromiscredir;
    }
        
    /**
     * This method initializes  fJLabelpromiscredir
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpromiscredir() {
        if (fJLabelpromiscredir == null) {
            try {
                 fJLabelpromiscredir = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelpromiscredir.setText(resBundel.getString("res_strpromiscredirDisplayName")); // Generated
                 fJLabelpromiscredir.setToolTipText(resBundel.getString("res_strpromiscredirDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelpromiscredir;
    }


    /**
     * This method initializes  fJPanelpromiscredir
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpromiscredir() {
        if (fJPanelpromiscredir == null) {
            try {
                fJPanelpromiscredir = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpromiscredir.setLayout(layFlowLayout); // Generated
                fJPanelpromiscredir.add(getJLabelpromiscredir(), null); // Generated
                fJPanelpromiscredir.add(getCustomCheckBoxpromiscredir(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpromiscredir;
    }
//end DB field promiscredir
//start DB field srvlookup
    /**
     * This method initializes fCustomCheckBoxsrvlookup
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxsrvlookup() {
        if (fCustomCheckBoxsrvlookup == null) {
            try {
                fCustomCheckBoxsrvlookup = new CustomCheckBox(); // Generated
                fCustomCheckBoxsrvlookup.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxsrvlookup;
    }
        
    /**
     * This method initializes  fJLabelsrvlookup
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsrvlookup() {
        if (fJLabelsrvlookup == null) {
            try {
                 fJLabelsrvlookup = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelsrvlookup.setText(resBundel.getString("res_strsrvlookupDisplayName")); // Generated
                 fJLabelsrvlookup.setToolTipText(resBundel.getString("res_strsrvlookupDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelsrvlookup;
    }


    /**
     * This method initializes  fJPanelsrvlookup
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsrvlookup() {
        if (fJPanelsrvlookup == null) {
            try {
                fJPanelsrvlookup = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsrvlookup.setLayout(layFlowLayout); // Generated
                fJPanelsrvlookup.add(getJLabelsrvlookup(), null); // Generated
                fJPanelsrvlookup.add(getCustomCheckBoxsrvlookup(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsrvlookup;
    }
//end DB field srvlookup
//start DB field tos
    /**
     * This method initializes fStringTextFieldtos
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtos() {
        if (fStringTextFieldtos == null) {
            try {
                fStringTextFieldtos = new StringTextField(); // Generated
                fStringTextFieldtos.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtos;
    }
        
    /**
     * This method initializes  fJLabeltos
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltos() {
        if (fJLabeltos == null) {
            try {
                 fJLabeltos = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltos.setText(resBundel.getString("res_strtosDisplayName")); // Generated
                 fJLabeltos.setToolTipText(resBundel.getString("res_strtosDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltos;
    }


    /**
     * This method initializes  fJPaneltos
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltos() {
        if (fJPaneltos == null) {
            try {
                fJPaneltos = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltos.setLayout(layFlowLayout); // Generated
                fJPaneltos.add(getJLabeltos(), null); // Generated
                fJPaneltos.add(getStringTextFieldtos(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltos;
    }
//end DB field tos
//start DB field videosupport
    /**
     * This method initializes fCustomCheckBoxvideosupport
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxvideosupport() {
        if (fCustomCheckBoxvideosupport == null) {
            try {
                fCustomCheckBoxvideosupport = new CustomCheckBox(); // Generated
                fCustomCheckBoxvideosupport.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxvideosupport;
    }
        
    /**
     * This method initializes  fJLabelvideosupport
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvideosupport() {
        if (fJLabelvideosupport == null) {
            try {
                 fJLabelvideosupport = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvideosupport.setText(resBundel.getString("res_strvideosupportDisplayName")); // Generated
                 fJLabelvideosupport.setToolTipText(resBundel.getString("res_strvideosupportDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvideosupport;
    }


    /**
     * This method initializes  fJPanelvideosupport
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvideosupport() {
        if (fJPanelvideosupport == null) {
            try {
                fJPanelvideosupport = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvideosupport.setLayout(layFlowLayout); // Generated
                fJPanelvideosupport.add(getJLabelvideosupport(), null); // Generated
                fJPanelvideosupport.add(getCustomCheckBoxvideosupport(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvideosupport;
    }
//end DB field videosupport
//start DB field useragent
    /**
     * This method initializes fStringTextFielduseragent
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielduseragent() {
        if (fStringTextFielduseragent == null) {
            try {
                fStringTextFielduseragent = new StringTextField(); // Generated
                fStringTextFielduseragent.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielduseragent;
    }
        
    /**
     * This method initializes  fJLabeluseragent
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeluseragent() {
        if (fJLabeluseragent == null) {
            try {
                 fJLabeluseragent = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeluseragent.setText(resBundel.getString("res_struseragentDisplayName")); // Generated
                 fJLabeluseragent.setToolTipText(resBundel.getString("res_struseragentDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeluseragent;
    }


    /**
     * This method initializes  fJPaneluseragent
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneluseragent() {
        if (fJPaneluseragent == null) {
            try {
                fJPaneluseragent = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneluseragent.setLayout(layFlowLayout); // Generated
                fJPaneluseragent.add(getJLabeluseragent(), null); // Generated
                fJPaneluseragent.add(getStringTextFielduseragent(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneluseragent;
    }
//end DB field useragent
//start DB field trustrpid
    /**
     * This method initializes fCustomCheckBoxtrustrpid
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxtrustrpid() {
        if (fCustomCheckBoxtrustrpid == null) {
            try {
                fCustomCheckBoxtrustrpid = new CustomCheckBox(); // Generated
                fCustomCheckBoxtrustrpid.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxtrustrpid;
    }
        
    /**
     * This method initializes  fJLabeltrustrpid
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltrustrpid() {
        if (fJLabeltrustrpid == null) {
            try {
                 fJLabeltrustrpid = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltrustrpid.setText(resBundel.getString("res_strtrustrpidDisplayName")); // Generated
                 fJLabeltrustrpid.setToolTipText(resBundel.getString("res_strtrustrpidDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltrustrpid;
    }


    /**
     * This method initializes  fJPaneltrustrpid
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltrustrpid() {
        if (fJPaneltrustrpid == null) {
            try {
                fJPaneltrustrpid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltrustrpid.setLayout(layFlowLayout); // Generated
                fJPaneltrustrpid.add(getJLabeltrustrpid(), null); // Generated
                fJPaneltrustrpid.add(getCustomCheckBoxtrustrpid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltrustrpid;
    }
//end DB field trustrpid
//start DB field realm
    /**
     * This method initializes fStringTextFieldrealm
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldrealm() {
        if (fStringTextFieldrealm == null) {
            try {
                fStringTextFieldrealm = new StringTextField(); // Generated
                fStringTextFieldrealm.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldrealm;
    }
        
    /**
     * This method initializes  fJLabelrealm
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrealm() {
        if (fJLabelrealm == null) {
            try {
                 fJLabelrealm = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelrealm.setText(resBundel.getString("res_strrealmDisplayName")); // Generated
                 fJLabelrealm.setToolTipText(resBundel.getString("res_strrealmDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelrealm;
    }


    /**
     * This method initializes  fJPanelrealm
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrealm() {
        if (fJPanelrealm == null) {
            try {
                fJPanelrealm = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrealm.setLayout(layFlowLayout); // Generated
                fJPanelrealm.add(getJLabelrealm(), null); // Generated
                fJPanelrealm.add(getStringTextFieldrealm(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrealm;
    }
//end DB field realm
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
//start DB field relaxdtmf
    /**
     * This method initializes fCustomCheckBoxrelaxdtmf
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxrelaxdtmf() {
        if (fCustomCheckBoxrelaxdtmf == null) {
            try {
                fCustomCheckBoxrelaxdtmf = new CustomCheckBox(); // Generated
                fCustomCheckBoxrelaxdtmf.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxrelaxdtmf;
    }
        
    /**
     * This method initializes  fJLabelrelaxdtmf
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrelaxdtmf() {
        if (fJLabelrelaxdtmf == null) {
            try {
                 fJLabelrelaxdtmf = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelrelaxdtmf.setText(resBundel.getString("res_strrelaxdtmfDisplayName")); // Generated
                 fJLabelrelaxdtmf.setToolTipText(resBundel.getString("res_strrelaxdtmfDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelrelaxdtmf;
    }


    /**
     * This method initializes  fJPanelrelaxdtmf
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrelaxdtmf() {
        if (fJPanelrelaxdtmf == null) {
            try {
                fJPanelrelaxdtmf = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrelaxdtmf.setLayout(layFlowLayout); // Generated
                fJPanelrelaxdtmf.add(getJLabelrelaxdtmf(), null); // Generated
                fJPanelrelaxdtmf.add(getCustomCheckBoxrelaxdtmf(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrelaxdtmf;
    }
//end DB field relaxdtmf
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
//start DB field progressinband
    /**
     * This method initializes fStringTextFieldprogressinband
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldprogressinband() {
        if (fStringTextFieldprogressinband == null) {
            try {
                fStringTextFieldprogressinband = new StringTextField(); // Generated
                fStringTextFieldprogressinband.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldprogressinband;
    }
        
    /**
     * This method initializes  fJLabelprogressinband
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelprogressinband() {
        if (fJLabelprogressinband == null) {
            try {
                 fJLabelprogressinband = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelprogressinband.setText(resBundel.getString("res_strprogressinbandDisplayName")); // Generated
                 fJLabelprogressinband.setToolTipText(resBundel.getString("res_strprogressinbandDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelprogressinband;
    }


    /**
     * This method initializes  fJPanelprogressinband
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelprogressinband() {
        if (fJPanelprogressinband == null) {
            try {
                fJPanelprogressinband = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelprogressinband.setLayout(layFlowLayout); // Generated
                fJPanelprogressinband.add(getJLabelprogressinband(), null); // Generated
                fJPanelprogressinband.add(getStringTextFieldprogressinband(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelprogressinband;
    }
//end DB field progressinband
//start DB field usereqphone
    /**
     * This method initializes fCustomCheckBoxusereqphone
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxusereqphone() {
        if (fCustomCheckBoxusereqphone == null) {
            try {
                fCustomCheckBoxusereqphone = new CustomCheckBox(); // Generated
                fCustomCheckBoxusereqphone.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxusereqphone;
    }
        
    /**
     * This method initializes  fJLabelusereqphone
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelusereqphone() {
        if (fJLabelusereqphone == null) {
            try {
                 fJLabelusereqphone = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelusereqphone.setText(resBundel.getString("res_strusereqphoneDisplayName")); // Generated
                 fJLabelusereqphone.setToolTipText(resBundel.getString("res_strusereqphoneDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelusereqphone;
    }


    /**
     * This method initializes  fJPanelusereqphone
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelusereqphone() {
        if (fJPanelusereqphone == null) {
            try {
                fJPanelusereqphone = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelusereqphone.setLayout(layFlowLayout); // Generated
                fJPanelusereqphone.add(getJLabelusereqphone(), null); // Generated
                fJPanelusereqphone.add(getCustomCheckBoxusereqphone(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelusereqphone;
    }
//end DB field usereqphone
//start DB field compactheaders
    /**
     * This method initializes fCustomCheckBoxcompactheaders
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxcompactheaders() {
        if (fCustomCheckBoxcompactheaders == null) {
            try {
                fCustomCheckBoxcompactheaders = new CustomCheckBox(); // Generated
                fCustomCheckBoxcompactheaders.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxcompactheaders;
    }
        
    /**
     * This method initializes  fJLabelcompactheaders
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcompactheaders() {
        if (fJLabelcompactheaders == null) {
            try {
                 fJLabelcompactheaders = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcompactheaders.setText(resBundel.getString("res_strcompactheadersDisplayName")); // Generated
                 fJLabelcompactheaders.setToolTipText(resBundel.getString("res_strcompactheadersDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcompactheaders;
    }


    /**
     * This method initializes  fJPanelcompactheaders
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcompactheaders() {
        if (fJPanelcompactheaders == null) {
            try {
                fJPanelcompactheaders = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcompactheaders.setLayout(layFlowLayout); // Generated
                fJPanelcompactheaders.add(getJLabelcompactheaders(), null); // Generated
                fJPanelcompactheaders.add(getCustomCheckBoxcompactheaders(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcompactheaders;
    }
//end DB field compactheaders
//start DB field sipdebug
    /**
     * This method initializes fCustomCheckBoxsipdebug
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxsipdebug() {
        if (fCustomCheckBoxsipdebug == null) {
            try {
                fCustomCheckBoxsipdebug = new CustomCheckBox(); // Generated
                fCustomCheckBoxsipdebug.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxsipdebug;
    }
        
    /**
     * This method initializes  fJLabelsipdebug
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsipdebug() {
        if (fJLabelsipdebug == null) {
            try {
                 fJLabelsipdebug = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelsipdebug.setText(resBundel.getString("res_strsipdebugDisplayName")); // Generated
                 fJLabelsipdebug.setToolTipText(resBundel.getString("res_strsipdebugDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelsipdebug;
    }


    /**
     * This method initializes  fJPanelsipdebug
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsipdebug() {
        if (fJPanelsipdebug == null) {
            try {
                fJPanelsipdebug = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsipdebug.setLayout(layFlowLayout); // Generated
                fJPanelsipdebug.add(getJLabelsipdebug(), null); // Generated
                fJPanelsipdebug.add(getCustomCheckBoxsipdebug(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsipdebug;
    }
//end DB field sipdebug
//start DB field checkmwi
    /**
     * This method initializes fIntegerTextFieldcheckmwi
     *
     * @return IntegerTextField
     */
    public IntegerTextField getIntegerTextFieldcheckmwi() {
        if (fIntegerTextFieldcheckmwi == null) {
            try {
                fIntegerTextFieldcheckmwi = new IntegerTextField(); // Generated
                fIntegerTextFieldcheckmwi.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fIntegerTextFieldcheckmwi;
    }
        
    /**
     * This method initializes  fJLabelcheckmwi
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcheckmwi() {
        if (fJLabelcheckmwi == null) {
            try {
                 fJLabelcheckmwi = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcheckmwi.setText(resBundel.getString("res_strcheckmwiDisplayName")); // Generated
                 fJLabelcheckmwi.setToolTipText(resBundel.getString("res_strcheckmwiDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcheckmwi;
    }


    /**
     * This method initializes  fJPanelcheckmwi
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcheckmwi() {
        if (fJPanelcheckmwi == null) {
            try {
                fJPanelcheckmwi = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcheckmwi.setLayout(layFlowLayout); // Generated
                fJPanelcheckmwi.add(getJLabelcheckmwi(), null); // Generated
                fJPanelcheckmwi.add(getIntegerTextFieldcheckmwi(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcheckmwi;
    }
//end DB field checkmwi
//start DB field recordhistory
    /**
     * This method initializes fCustomCheckBoxrecordhistory
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxrecordhistory() {
        if (fCustomCheckBoxrecordhistory == null) {
            try {
                fCustomCheckBoxrecordhistory = new CustomCheckBox(); // Generated
                fCustomCheckBoxrecordhistory.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxrecordhistory;
    }
        
    /**
     * This method initializes  fJLabelrecordhistory
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrecordhistory() {
        if (fJLabelrecordhistory == null) {
            try {
                 fJLabelrecordhistory = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelrecordhistory.setText(resBundel.getString("res_strrecordhistoryDisplayName")); // Generated
                 fJLabelrecordhistory.setToolTipText(resBundel.getString("res_strrecordhistoryDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelrecordhistory;
    }


    /**
     * This method initializes  fJPanelrecordhistory
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrecordhistory() {
        if (fJPanelrecordhistory == null) {
            try {
                fJPanelrecordhistory = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrecordhistory.setLayout(layFlowLayout); // Generated
                fJPanelrecordhistory.add(getJLabelrecordhistory(), null); // Generated
                fJPanelrecordhistory.add(getCustomCheckBoxrecordhistory(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrecordhistory;
    }
//end DB field recordhistory
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

}

	