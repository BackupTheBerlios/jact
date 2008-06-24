package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.VoiceMailMain;

/**
 * <p>
 * VoiceMailMainDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:42 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoiceMailMainDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class VoiceMailMainDataPanel extends SimpleDataObjectPanel{
	protected VoiceMailMain dataObject;
	//protected VoiceMailMainChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public VoiceMailMainDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getVoiceMailMainResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getVoiceMailMainResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/VoiceMailMainResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new VoiceMailMainCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFields,		
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
		this.setSize(400,(3)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanels(), null); // Generated
        this.add(getJPanelmailbox(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFields.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmailbox.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcontext.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFields.setValue(dataObject.getS());
        fStringTextFieldmailbox.setValue(dataObject.getMailbox());
        fStringTextFieldcontext.setValue(dataObject.getContext());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setS(fStringTextFields.getValue());
        dataObject.setMailbox(fStringTextFieldmailbox.getValue());
        dataObject.setContext(fStringTextFieldcontext.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param VoiceMailMain
	 */
	public void setDataObject(Object aVoiceMailMain) {
	    //abstractdataObject = (AbstractConfigObject) aVoiceMailMain;
		setDataObject((VoiceMailMain) aVoiceMailMain);
		//dataObject = aVoiceMailMain;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param VoiceMailMain
	 */
	public void setDataObject(VoiceMailMain aVoiceMailMain) {
	    //abstractdataObject = (AbstractConfigObject) aVoiceMailMain;
		dataObject = aVoiceMailMain;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFields;
    protected javax.swing.JLabel fJLabels;
	protected javax.swing.JPanel fJPanels;
    protected StringTextField fStringTextFieldmailbox;
    protected javax.swing.JLabel fJLabelmailbox;
	protected javax.swing.JPanel fJPanelmailbox;
    protected StringTextField fStringTextFieldcontext;
    protected javax.swing.JLabel fJLabelcontext;
	protected javax.swing.JPanel fJPanelcontext;
    

//start DB field s
    /**
     * This method initializes fStringTextFields
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFields() {
        if (fStringTextFields == null) {
            try {
                fStringTextFields = new StringTextField(); // Generated
                fStringTextFields.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFields;
    }
        
    /**
     * This method initializes  fJLabels
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabels() {
        if (fJLabels == null) {
            try {
                 fJLabels = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabels.setText(resBundel.getString("res_strsDisplayName")); // Generated
                 fJLabels.setToolTipText(resBundel.getString("res_strsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabels;
    }


    /**
     * This method initializes  fJPanels
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanels() {
        if (fJPanels == null) {
            try {
                fJPanels = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanels.setLayout(layFlowLayout); // Generated
                fJPanels.add(getJLabels(), null); // Generated
                fJPanels.add(getStringTextFields(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanels;
    }
//end DB field s
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

	