package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.VoiceMail;

/**
 * <p>
 * VoiceMailDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:32 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoiceMailDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class VoiceMailDataPanel extends SimpleDataObjectPanel{
	protected VoiceMail dataObject;
	//protected VoiceMailChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public VoiceMailDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getVoiceMailResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getVoiceMailResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/VoiceMailResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new VoiceMailCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFields,		
			fStringTextFieldu,		
			fStringTextFieldb,		
			fStringTextFieldextension,		
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
        this.add(getJPanels(), null); // Generated
        this.add(getJPanelu(), null); // Generated
        this.add(getJPanelb(), null); // Generated
        this.add(getJPanelextension(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFields.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldu.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldb.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldextension.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcontext.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFields.setValue(dataObject.getS());
        fStringTextFieldu.setValue(dataObject.getU());
        fStringTextFieldb.setValue(dataObject.getB());
        fStringTextFieldextension.setValue(dataObject.getExtension());
        fStringTextFieldcontext.setValue(dataObject.getContext());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setS(fStringTextFields.getValue());
        dataObject.setU(fStringTextFieldu.getValue());
        dataObject.setB(fStringTextFieldb.getValue());
        dataObject.setExtension(fStringTextFieldextension.getValue());
        dataObject.setContext(fStringTextFieldcontext.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param VoiceMail
	 */
	public void setDataObject(Object aVoiceMail) {
	    //abstractdataObject = (AbstractConfigObject) aVoiceMail;
		setDataObject((VoiceMail) aVoiceMail);
		//dataObject = aVoiceMail;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param VoiceMail
	 */
	public void setDataObject(VoiceMail aVoiceMail) {
	    //abstractdataObject = (AbstractConfigObject) aVoiceMail;
		dataObject = aVoiceMail;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFields;
    protected javax.swing.JLabel fJLabels;
	protected javax.swing.JPanel fJPanels;
    protected StringTextField fStringTextFieldu;
    protected javax.swing.JLabel fJLabelu;
	protected javax.swing.JPanel fJPanelu;
    protected StringTextField fStringTextFieldb;
    protected javax.swing.JLabel fJLabelb;
	protected javax.swing.JPanel fJPanelb;
    protected StringTextField fStringTextFieldextension;
    protected javax.swing.JLabel fJLabelextension;
	protected javax.swing.JPanel fJPanelextension;
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
//start DB field u
    /**
     * This method initializes fStringTextFieldu
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldu() {
        if (fStringTextFieldu == null) {
            try {
                fStringTextFieldu = new StringTextField(); // Generated
                fStringTextFieldu.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldu;
    }
        
    /**
     * This method initializes  fJLabelu
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelu() {
        if (fJLabelu == null) {
            try {
                 fJLabelu = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelu.setText(resBundel.getString("res_struDisplayName")); // Generated
                 fJLabelu.setToolTipText(resBundel.getString("res_struDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelu;
    }


    /**
     * This method initializes  fJPanelu
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelu() {
        if (fJPanelu == null) {
            try {
                fJPanelu = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelu.setLayout(layFlowLayout); // Generated
                fJPanelu.add(getJLabelu(), null); // Generated
                fJPanelu.add(getStringTextFieldu(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelu;
    }
//end DB field u
//start DB field b
    /**
     * This method initializes fStringTextFieldb
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldb() {
        if (fStringTextFieldb == null) {
            try {
                fStringTextFieldb = new StringTextField(); // Generated
                fStringTextFieldb.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldb;
    }
        
    /**
     * This method initializes  fJLabelb
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelb() {
        if (fJLabelb == null) {
            try {
                 fJLabelb = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelb.setText(resBundel.getString("res_strbDisplayName")); // Generated
                 fJLabelb.setToolTipText(resBundel.getString("res_strbDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelb;
    }


    /**
     * This method initializes  fJPanelb
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelb() {
        if (fJPanelb == null) {
            try {
                fJPanelb = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelb.setLayout(layFlowLayout); // Generated
                fJPanelb.add(getJLabelb(), null); // Generated
                fJPanelb.add(getStringTextFieldb(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelb;
    }
//end DB field b
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

	