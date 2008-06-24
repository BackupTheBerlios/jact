package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.IAX2Provision;

/**
 * <p>
 * IAX2ProvisionDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAX2ProvisionDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class IAX2ProvisionDataPanel extends SimpleDataObjectPanel{
	protected IAX2Provision dataObject;
	//protected IAX2ProvisionChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public IAX2ProvisionDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getIAX2ProvisionResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getIAX2ProvisionResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/IAX2ProvisionResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new IAX2ProvisionCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldtemplate,		
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
		this.setSize(400,(1)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(1); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneltemplate(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldtemplate.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldtemplate.setValue(dataObject.getTemplate());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setTemplate(fStringTextFieldtemplate.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param IAX2Provision
	 */
	public void setDataObject(Object aIAX2Provision) {
	    //abstractdataObject = (AbstractConfigObject) aIAX2Provision;
		setDataObject((IAX2Provision) aIAX2Provision);
		//dataObject = aIAX2Provision;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param IAX2Provision
	 */
	public void setDataObject(IAX2Provision aIAX2Provision) {
	    //abstractdataObject = (AbstractConfigObject) aIAX2Provision;
		dataObject = aIAX2Provision;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldtemplate;
    protected javax.swing.JLabel fJLabeltemplate;
	protected javax.swing.JPanel fJPaneltemplate;
    

//start DB field template
    /**
     * This method initializes fStringTextFieldtemplate
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtemplate() {
        if (fStringTextFieldtemplate == null) {
            try {
                fStringTextFieldtemplate = new StringTextField(); // Generated
                fStringTextFieldtemplate.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtemplate;
    }
        
    /**
     * This method initializes  fJLabeltemplate
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltemplate() {
        if (fJLabeltemplate == null) {
            try {
                 fJLabeltemplate = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltemplate.setText(resBundel.getString("res_strtemplateDisplayName")); // Generated
                 fJLabeltemplate.setToolTipText(resBundel.getString("res_strtemplateDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltemplate;
    }


    /**
     * This method initializes  fJPaneltemplate
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltemplate() {
        if (fJPaneltemplate == null) {
            try {
                fJPaneltemplate = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltemplate.setLayout(layFlowLayout); // Generated
                fJPaneltemplate.add(getJLabeltemplate(), null); // Generated
                fJPaneltemplate.add(getStringTextFieldtemplate(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltemplate;
    }
//end DB field template

}

	