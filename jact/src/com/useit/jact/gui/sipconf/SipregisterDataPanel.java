package com.useit.jact.gui.sipconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.IntegerTextField;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.sipconf.Sipregister;

/**
 * <p>
 * SipregisterDataPanel
 * </p>
 * Created : Fri May 26 14:16:13 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipregisterDataPanel.java,v 1.1 2008/06/24 20:45:12 urszeidler Exp $
 */
public class SipregisterDataPanel extends SimpleDataObjectPanel{
	protected Sipregister dataObject;
	//protected SipregisterChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SipregisterDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSipregisterResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSipregisterResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SipregisterResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SipregisterCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFielduser,		
			fStringTextFieldauthuser,		
			fStringTextFieldsecret,		
			fStringTextFieldhost,		
			fIntegerTextFieldport,		
			fStringTextFieldextension,		
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
		this.setSize(400,(6)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(6); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneluser(), null); // Generated
        this.add(getJPanelauthuser(), null); // Generated
        this.add(getJPanelsecret(), null); // Generated
        this.add(getJPanelhost(), null); // Generated
        this.add(getJPanelport(), null); // Generated
        this.add(getJPanelextension(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFielduser.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldauthuser.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldsecret.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldhost.getDocument().addDocumentListener(textChangeAct);
		fIntegerTextFieldport.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldextension.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFielduser.setValue(dataObject.getUser());
        fStringTextFieldauthuser.setValue(dataObject.getAuthuser());
        fStringTextFieldsecret.setValue(dataObject.getSecret());
        fStringTextFieldhost.setValue(dataObject.getHost());
        fIntegerTextFieldport.setValue(dataObject.getPort());
        fStringTextFieldextension.setValue(dataObject.getExtension());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setUser(fStringTextFielduser.getValue());
        dataObject.setAuthuser(fStringTextFieldauthuser.getValue());
        dataObject.setSecret(fStringTextFieldsecret.getValue());
        dataObject.setHost(fStringTextFieldhost.getValue());
        dataObject.setPort(fIntegerTextFieldport.getValue());
        dataObject.setExtension(fStringTextFieldextension.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Sipregister
	 */
	public void setDataObject(Object aSipregister) {
	    //abstractdataObject = (AbstractConfigObject) aSipregister;
		setDataObject((Sipregister) aSipregister);
		//dataObject = aSipregister;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Sipregister
	 */
	public void setDataObject(Sipregister aSipregister) {
	    //abstractdataObject = (AbstractConfigObject) aSipregister;
		dataObject = aSipregister;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFielduser;
    protected javax.swing.JLabel fJLabeluser;
	protected javax.swing.JPanel fJPaneluser;
    protected StringTextField fStringTextFieldauthuser;
    protected javax.swing.JLabel fJLabelauthuser;
	protected javax.swing.JPanel fJPanelauthuser;
    protected StringTextField fStringTextFieldsecret;
    protected javax.swing.JLabel fJLabelsecret;
	protected javax.swing.JPanel fJPanelsecret;
    protected StringTextField fStringTextFieldhost;
    protected javax.swing.JLabel fJLabelhost;
	protected javax.swing.JPanel fJPanelhost;
    protected IntegerTextField fIntegerTextFieldport;
    protected javax.swing.JLabel fJLabelport;
	protected javax.swing.JPanel fJPanelport;
    protected StringTextField fStringTextFieldextension;
    protected javax.swing.JLabel fJLabelextension;
	protected javax.swing.JPanel fJPanelextension;
    

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
//start DB field authuser
    /**
     * This method initializes fStringTextFieldauthuser
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldauthuser() {
        if (fStringTextFieldauthuser == null) {
            try {
                fStringTextFieldauthuser = new StringTextField(); // Generated
                fStringTextFieldauthuser.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldauthuser;
    }
        
    /**
     * This method initializes  fJLabelauthuser
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelauthuser() {
        if (fJLabelauthuser == null) {
            try {
                 fJLabelauthuser = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelauthuser.setText(resBundel.getString("res_strauthuserDisplayName")); // Generated
                 fJLabelauthuser.setToolTipText(resBundel.getString("res_strauthuserDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelauthuser;
    }


    /**
     * This method initializes  fJPanelauthuser
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelauthuser() {
        if (fJPanelauthuser == null) {
            try {
                fJPanelauthuser = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelauthuser.setLayout(layFlowLayout); // Generated
                fJPanelauthuser.add(getJLabelauthuser(), null); // Generated
                fJPanelauthuser.add(getStringTextFieldauthuser(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelauthuser;
    }
//end DB field authuser
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
//start DB field extension
    /**
     * This method initializes fStringTextFieldextension
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldextension() {
        if (fStringTextFieldextension == null) {
            try {
                fStringTextFieldextension = new StringTextField(); // Generated
                fStringTextFieldextension.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldextension;
    }
        
    /**
     * This method initializes  fJLabelextension
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelextension() {
        if (fJLabelextension == null) {
            try {
                 fJLabelextension = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelextension.setText(resBundel.getString("res_strextensionDisplayName")); // Generated
                 fJLabelextension.setToolTipText(resBundel.getString("res_strextensionDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelextension;
    }


    /**
     * This method initializes  fJPanelextension
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelextension() {
        if (fJPanelextension == null) {
            try {
                fJPanelextension = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelextension.setLayout(layFlowLayout); // Generated
                fJPanelextension.add(getJLabelextension(), null); // Generated
                fJPanelextension.add(getStringTextFieldextension(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelextension;
    }
//end DB field extension

}

	