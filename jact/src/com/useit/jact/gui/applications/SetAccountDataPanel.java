package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SetAccount;

/**
 * <p>
 * SetAccountDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:46 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetAccountDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SetAccountDataPanel extends SimpleDataObjectPanel{
	protected SetAccount dataObject;
	//protected SetAccountChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetAccountDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetAccountResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetAccountResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetAccountResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SetAccountCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldaccount,		
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
        this.add(getJPanelaccount(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldaccount.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldaccount.setValue(dataObject.getAccount());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setAccount(fStringTextFieldaccount.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SetAccount
	 */
	public void setDataObject(Object aSetAccount) {
	    //abstractdataObject = (AbstractConfigObject) aSetAccount;
		setDataObject((SetAccount) aSetAccount);
		//dataObject = aSetAccount;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SetAccount
	 */
	public void setDataObject(SetAccount aSetAccount) {
	    //abstractdataObject = (AbstractConfigObject) aSetAccount;
		dataObject = aSetAccount;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldaccount;
    protected javax.swing.JLabel fJLabelaccount;
	protected javax.swing.JPanel fJPanelaccount;
    

//start DB field account
    /**
     * This method initializes fStringTextFieldaccount
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldaccount() {
        if (fStringTextFieldaccount == null) {
            try {
                fStringTextFieldaccount = new StringTextField(); // Generated
                fStringTextFieldaccount.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldaccount;
    }
        
    /**
     * This method initializes  fJLabelaccount
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelaccount() {
        if (fJLabelaccount == null) {
            try {
                 fJLabelaccount = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelaccount.setText(resBundel.getString("res_straccountDisplayName")); // Generated
                 fJLabelaccount.setToolTipText(resBundel.getString("res_straccountDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelaccount;
    }


    /**
     * This method initializes  fJPanelaccount
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelaccount() {
        if (fJPanelaccount == null) {
            try {
                fJPanelaccount = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelaccount.setLayout(layFlowLayout); // Generated
                fJPanelaccount.add(getJLabelaccount(), null); // Generated
                fJPanelaccount.add(getStringTextFieldaccount(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelaccount;
    }
//end DB field account

}

	