package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.ExtensionWidget;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.AgentCallbackLogin;

/**
 * <p>
 * AgentCallbackLoginDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:25 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentCallbackLoginDataPanel.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class AgentCallbackLoginDataPanel extends SimpleDataObjectPanel{
	protected AgentCallbackLogin dataObject;
	//protected AgentCallbackLoginChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public AgentCallbackLoginDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getAgentCallbackLoginResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getAgentCallbackLoginResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/AgentCallbackLoginResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new AgentCallbackLoginCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldagentNo,		
			fExtensionWidgetextension,		
			fStringTextFieldoptions,		
			fStringTextFieldexten,		
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
		this.setSize(400,(5)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(5); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelagentNo(), null); // Generated
        this.add(getJPanelextension(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
        this.add(getJPanelexten(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldagentNo.getDocument().addDocumentListener(textChangeAct);
		fExtensionWidgetextension.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoptions.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldexten.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcontext.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldagentNo.setValue(dataObject.getAgentNo());
        fExtensionWidgetextension.setValue(dataObject.getExtension());
        fStringTextFieldoptions.setValue(dataObject.getOptions());
        fStringTextFieldexten.setValue(dataObject.getExten());
        fStringTextFieldcontext.setValue(dataObject.getContext());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setAgentNo(fStringTextFieldagentNo.getValue());
        dataObject.setExtension(fExtensionWidgetextension.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
        dataObject.setExten(fStringTextFieldexten.getValue());
        dataObject.setContext(fStringTextFieldcontext.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param AgentCallbackLogin
	 */
	public void setDataObject(Object aAgentCallbackLogin) {
	    //abstractdataObject = (AbstractConfigObject) aAgentCallbackLogin;
		setDataObject((AgentCallbackLogin) aAgentCallbackLogin);
		//dataObject = aAgentCallbackLogin;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param AgentCallbackLogin
	 */
	public void setDataObject(AgentCallbackLogin aAgentCallbackLogin) {
	    //abstractdataObject = (AbstractConfigObject) aAgentCallbackLogin;
		dataObject = aAgentCallbackLogin;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldagentNo;
    protected javax.swing.JLabel fJLabelagentNo;
	protected javax.swing.JPanel fJPanelagentNo;
    protected ExtensionWidget fExtensionWidgetextension;
    protected javax.swing.JLabel fJLabelextension;
	protected javax.swing.JPanel fJPanelextension;
    protected StringTextField fStringTextFieldoptions;
    protected javax.swing.JLabel fJLabeloptions;
	protected javax.swing.JPanel fJPaneloptions;
    protected StringTextField fStringTextFieldexten;
    protected javax.swing.JLabel fJLabelexten;
	protected javax.swing.JPanel fJPanelexten;
    protected StringTextField fStringTextFieldcontext;
    protected javax.swing.JLabel fJLabelcontext;
	protected javax.swing.JPanel fJPanelcontext;
    

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
//start DB field extension
    /**
     * This method initializes fExtensionWidgetextension
     *
     * @return ExtensionWidget
     */
    public ExtensionWidget getExtensionWidgetextension() {
        if (fExtensionWidgetextension == null) {
            try {
                fExtensionWidgetextension = new ExtensionWidget(); // Generated
                fExtensionWidgetextension.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fExtensionWidgetextension;
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
                fJPanelextension.add(getExtensionWidgetextension(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelextension;
    }
//end DB field extension
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
//start DB field exten
    /**
     * This method initializes fStringTextFieldexten
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldexten() {
        if (fStringTextFieldexten == null) {
            try {
                fStringTextFieldexten = new StringTextField(); // Generated
                fStringTextFieldexten.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldexten;
    }
        
    /**
     * This method initializes  fJLabelexten
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelexten() {
        if (fJLabelexten == null) {
            try {
                 fJLabelexten = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelexten.setText(resBundel.getString("res_strextenDisplayName")); // Generated
                 fJLabelexten.setToolTipText(resBundel.getString("res_strextenDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelexten;
    }


    /**
     * This method initializes  fJPanelexten
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelexten() {
        if (fJPanelexten == null) {
            try {
                fJPanelexten = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelexten.setLayout(layFlowLayout); // Generated
                fJPanelexten.add(getJLabelexten(), null); // Generated
                fJPanelexten.add(getStringTextFieldexten(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelexten;
    }
//end DB field exten
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

	