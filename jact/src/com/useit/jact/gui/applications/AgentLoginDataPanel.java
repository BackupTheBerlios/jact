package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.AgentLogin;

/**
 * <p>
 * AgentLoginDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:34 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentLoginDataPanel.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class AgentLoginDataPanel extends SimpleDataObjectPanel{
	protected AgentLogin dataObject;
	//protected AgentLoginChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public AgentLoginDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getAgentLoginResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getAgentLoginResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/AgentLoginResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new AgentLoginCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldagentNo,		
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
        this.add(getJPanelagentNo(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldagentNo.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoptions.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldagentNo.setValue(dataObject.getAgentNo());
        fStringTextFieldoptions.setValue(dataObject.getOptions());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setAgentNo(fStringTextFieldagentNo.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param AgentLogin
	 */
	public void setDataObject(Object aAgentLogin) {
	    //abstractdataObject = (AbstractConfigObject) aAgentLogin;
		setDataObject((AgentLogin) aAgentLogin);
		//dataObject = aAgentLogin;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param AgentLogin
	 */
	public void setDataObject(AgentLogin aAgentLogin) {
	    //abstractdataObject = (AbstractConfigObject) aAgentLogin;
		dataObject = aAgentLogin;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldagentNo;
    protected javax.swing.JLabel fJLabelagentNo;
	protected javax.swing.JPanel fJPanelagentNo;
    protected StringTextField fStringTextFieldoptions;
    protected javax.swing.JLabel fJLabeloptions;
	protected javax.swing.JPanel fJPaneloptions;
    

//start DB field agentNo
    /**
     * This method initializes fStringTextFieldagentNo
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldagentNo() {
        if (fStringTextFieldagentNo == null) {
            try {
                fStringTextFieldagentNo = new StringTextField(); // Generated
                fStringTextFieldagentNo.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldagentNo;
    }
        
    /**
     * This method initializes  fJLabelagentNo
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelagentNo() {
        if (fJLabelagentNo == null) {
            try {
                 fJLabelagentNo = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelagentNo.setText(resBundel.getString("res_stragentNoDisplayName")); // Generated
                 fJLabelagentNo.setToolTipText(resBundel.getString("res_stragentNoDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelagentNo;
    }


    /**
     * This method initializes  fJPanelagentNo
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelagentNo() {
        if (fJPanelagentNo == null) {
            try {
                fJPanelagentNo = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelagentNo.setLayout(layFlowLayout); // Generated
                fJPanelagentNo.add(getJLabelagentNo(), null); // Generated
                fJPanelagentNo.add(getStringTextFieldagentNo(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelagentNo;
    }
//end DB field agentNo
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

	