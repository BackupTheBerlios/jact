package com.useit.jact.gui.sipconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.sipconf.Sipauth;

/**
 * <p>
 * SipauthDataPanel
 * </p>
 * Created : Fri May 26 14:16:14 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipauthDataPanel.java,v 1.1 2008/06/24 20:45:12 urszeidler Exp $
 */
public class SipauthDataPanel extends SimpleDataObjectPanel{
	protected Sipauth dataObject;
	//protected SipauthChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SipauthDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSipauthResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSipauthResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SipauthResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SipauthCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFielduser,		
			fStringTextFieldsecret,		
			fStringTextFieldmd5secret,		
			fStringTextFieldrealm,		
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
		this.setSize(400,(4)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneluser(), null); // Generated
        this.add(getJPanelsecret(), null); // Generated
        this.add(getJPanelmd5secret(), null); // Generated
        this.add(getJPanelrealm(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFielduser.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldsecret.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmd5secret.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldrealm.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFielduser.setValue(dataObject.getUser());
        fStringTextFieldsecret.setValue(dataObject.getSecret());
        fStringTextFieldmd5secret.setValue(dataObject.getMd5secret());
        fStringTextFieldrealm.setValue(dataObject.getRealm());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setUser(fStringTextFielduser.getValue());
        dataObject.setSecret(fStringTextFieldsecret.getValue());
        dataObject.setMd5secret(fStringTextFieldmd5secret.getValue());
        dataObject.setRealm(fStringTextFieldrealm.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Sipauth
	 */
	public void setDataObject(Object aSipauth) {
	    //abstractdataObject = (AbstractConfigObject) aSipauth;
		setDataObject((Sipauth) aSipauth);
		//dataObject = aSipauth;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Sipauth
	 */
	public void setDataObject(Sipauth aSipauth) {
	    //abstractdataObject = (AbstractConfigObject) aSipauth;
		dataObject = aSipauth;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFielduser;
    protected javax.swing.JLabel fJLabeluser;
	protected javax.swing.JPanel fJPaneluser;
    protected StringTextField fStringTextFieldsecret;
    protected javax.swing.JLabel fJLabelsecret;
	protected javax.swing.JPanel fJPanelsecret;
    protected StringTextField fStringTextFieldmd5secret;
    protected javax.swing.JLabel fJLabelmd5secret;
	protected javax.swing.JPanel fJPanelmd5secret;
    protected StringTextField fStringTextFieldrealm;
    protected javax.swing.JLabel fJLabelrealm;
	protected javax.swing.JPanel fJPanelrealm;
    

//start DB field user
    /**
     * This method initializes fStringTextFielduser
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielduser() {
        if (fStringTextFielduser == null) {
            try {
                fStringTextFielduser = new StringTextField(); // Generated
                fStringTextFielduser.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielduser;
    }
        
    /**
     * This method initializes  fJLabeluser
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeluser() {
        if (fJLabeluser == null) {
            try {
                 fJLabeluser = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeluser.setText(resBundel.getString("res_struserDisplayName")); // Generated
                 fJLabeluser.setToolTipText(resBundel.getString("res_struserDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeluser;
    }


    /**
     * This method initializes  fJPaneluser
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneluser() {
        if (fJPaneluser == null) {
            try {
                fJPaneluser = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneluser.setLayout(layFlowLayout); // Generated
                fJPaneluser.add(getJLabeluser(), null); // Generated
                fJPaneluser.add(getStringTextFielduser(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneluser;
    }
//end DB field user
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

}

	