package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.VMAuthenticate;

/**
 * <p>
 * VMAuthenticateDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:10 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VMAuthenticateDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class VMAuthenticateDataPanel extends SimpleDataObjectPanel{
	protected VMAuthenticate dataObject;
	//protected VMAuthenticateChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public VMAuthenticateDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getVMAuthenticateResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getVMAuthenticateResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/VMAuthenticateResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new VMAuthenticateCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldmailbox,		
			fStringTextFieldcontext,		
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
        this.add(getJPanelmailbox(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldmailbox.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcontext.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldmailbox.setValue(dataObject.getMailbox());
        fStringTextFieldcontext.setValue(dataObject.getContext());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setMailbox(fStringTextFieldmailbox.getValue());
        dataObject.setContext(fStringTextFieldcontext.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param VMAuthenticate
	 */
	public void setDataObject(Object aVMAuthenticate) {
	    //abstractdataObject = (AbstractConfigObject) aVMAuthenticate;
		setDataObject((VMAuthenticate) aVMAuthenticate);
		//dataObject = aVMAuthenticate;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param VMAuthenticate
	 */
	public void setDataObject(VMAuthenticate aVMAuthenticate) {
	    //abstractdataObject = (AbstractConfigObject) aVMAuthenticate;
		dataObject = aVMAuthenticate;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldmailbox;
    protected javax.swing.JLabel fJLabelmailbox;
	protected javax.swing.JPanel fJPanelmailbox;
    protected StringTextField fStringTextFieldcontext;
    protected javax.swing.JLabel fJLabelcontext;
	protected javax.swing.JPanel fJPanelcontext;
    

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
//start DB field context
    /**
     * This method initializes fStringTextFieldcontext
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcontext() {
        if (fStringTextFieldcontext == null) {
            try {
                fStringTextFieldcontext = new StringTextField(); // Generated
                fStringTextFieldcontext.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcontext;
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
                fJPanelcontext.add(getStringTextFieldcontext(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcontext;
    }
//end DB field context

}

	