package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Authenticate;

/**
 * <p>
 * AuthenticateDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:25 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AuthenticateDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class AuthenticateDataPanel extends SimpleDataObjectPanel{
	protected Authenticate dataObject;
	//protected AuthenticateChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public AuthenticateDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getAuthenticateResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getAuthenticateResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/AuthenticateResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new AuthenticateCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldpassword,		
			fStringTextFieldoptions,		
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
		this.setSize(400,(2)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelpassword(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldpassword.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoptions.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldpassword.setValue(dataObject.getPassword());
        fStringTextFieldoptions.setValue(dataObject.getOptions());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setPassword(fStringTextFieldpassword.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Authenticate
	 */
	public void setDataObject(Object aAuthenticate) {
	    //abstractdataObject = (AbstractConfigObject) aAuthenticate;
		setDataObject((Authenticate) aAuthenticate);
		//dataObject = aAuthenticate;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Authenticate
	 */
	public void setDataObject(Authenticate aAuthenticate) {
	    //abstractdataObject = (AbstractConfigObject) aAuthenticate;
		dataObject = aAuthenticate;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldpassword;
    protected javax.swing.JLabel fJLabelpassword;
	protected javax.swing.JPanel fJPanelpassword;
    protected StringTextField fStringTextFieldoptions;
    protected javax.swing.JLabel fJLabeloptions;
	protected javax.swing.JPanel fJPaneloptions;
    

//start DB field password
    /**
     * This method initializes fStringTextFieldpassword
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpassword() {
        if (fStringTextFieldpassword == null) {
            try {
                fStringTextFieldpassword = new StringTextField(); // Generated
                fStringTextFieldpassword.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpassword;
    }
        
    /**
     * This method initializes  fJLabelpassword
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpassword() {
        if (fJLabelpassword == null) {
            try {
                 fJLabelpassword = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelpassword.setText(resBundel.getString("res_strpasswordDisplayName")); // Generated
                 fJLabelpassword.setToolTipText(resBundel.getString("res_strpasswordDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelpassword;
    }


    /**
     * This method initializes  fJPanelpassword
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpassword() {
        if (fJPanelpassword == null) {
            try {
                fJPanelpassword = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpassword.setLayout(layFlowLayout); // Generated
                fJPanelpassword.add(getJLabelpassword(), null); // Generated
                fJPanelpassword.add(getStringTextFieldpassword(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpassword;
    }
//end DB field password
//start DB field options
    /**
     * This method initializes fStringTextFieldoptions
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldoptions() {
        if (fStringTextFieldoptions == null) {
            try {
                fStringTextFieldoptions = new StringTextField(); // Generated
                fStringTextFieldoptions.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldoptions;
    }
        
    /**
     * This method initializes  fJLabeloptions
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeloptions() {
        if (fJLabeloptions == null) {
            try {
                 fJLabeloptions = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeloptions.setText(resBundel.getString("res_stroptionsDisplayName")); // Generated
                 fJLabeloptions.setToolTipText(resBundel.getString("res_stroptionsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeloptions;
    }


    /**
     * This method initializes  fJPaneloptions
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneloptions() {
        if (fJPaneloptions == null) {
            try {
                fJPaneloptions = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneloptions.setLayout(layFlowLayout); // Generated
                fJPaneloptions.add(getJLabeloptions(), null); // Generated
                fJPaneloptions.add(getStringTextFieldoptions(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneloptions;
    }
//end DB field options

}

	