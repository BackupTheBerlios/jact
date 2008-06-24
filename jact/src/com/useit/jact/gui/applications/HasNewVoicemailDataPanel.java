package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.HasNewVoicemail;

/**
 * <p>
 * HasNewVoicemailDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:25 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: HasNewVoicemailDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class HasNewVoicemailDataPanel extends SimpleDataObjectPanel{
	protected HasNewVoicemail dataObject;
	//protected HasNewVoicemailChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public HasNewVoicemailDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getHasNewVoicemailResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getHasNewVoicemailResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/HasNewVoicemailResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new HasNewVoicemailCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldvmbox,		
			fStringTextFieldfolder,		
			fStringTextFieldcontext,		
			fStringTextFieldvarname,		
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
        this.add(getJPanelvmbox(), null); // Generated
        this.add(getJPanelfolder(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPanelvarname(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldvmbox.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldfolder.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcontext.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldvarname.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldvmbox.setValue(dataObject.getVmbox());
        fStringTextFieldfolder.setValue(dataObject.getFolder());
        fStringTextFieldcontext.setValue(dataObject.getContext());
        fStringTextFieldvarname.setValue(dataObject.getVarname());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setVmbox(fStringTextFieldvmbox.getValue());
        dataObject.setFolder(fStringTextFieldfolder.getValue());
        dataObject.setContext(fStringTextFieldcontext.getValue());
        dataObject.setVarname(fStringTextFieldvarname.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param HasNewVoicemail
	 */
	public void setDataObject(Object aHasNewVoicemail) {
	    //abstractdataObject = (AbstractConfigObject) aHasNewVoicemail;
		setDataObject((HasNewVoicemail) aHasNewVoicemail);
		//dataObject = aHasNewVoicemail;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param HasNewVoicemail
	 */
	public void setDataObject(HasNewVoicemail aHasNewVoicemail) {
	    //abstractdataObject = (AbstractConfigObject) aHasNewVoicemail;
		dataObject = aHasNewVoicemail;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldvmbox;
    protected javax.swing.JLabel fJLabelvmbox;
	protected javax.swing.JPanel fJPanelvmbox;
    protected StringTextField fStringTextFieldfolder;
    protected javax.swing.JLabel fJLabelfolder;
	protected javax.swing.JPanel fJPanelfolder;
    protected StringTextField fStringTextFieldcontext;
    protected javax.swing.JLabel fJLabelcontext;
	protected javax.swing.JPanel fJPanelcontext;
    protected StringTextField fStringTextFieldvarname;
    protected javax.swing.JLabel fJLabelvarname;
	protected javax.swing.JPanel fJPanelvarname;
    

//start DB field vmbox
    /**
     * This method initializes fStringTextFieldvmbox
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvmbox() {
        if (fStringTextFieldvmbox == null) {
            try {
                fStringTextFieldvmbox = new StringTextField(); // Generated
                fStringTextFieldvmbox.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvmbox;
    }
        
    /**
     * This method initializes  fJLabelvmbox
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvmbox() {
        if (fJLabelvmbox == null) {
            try {
                 fJLabelvmbox = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvmbox.setText(resBundel.getString("res_strvmboxDisplayName")); // Generated
                 fJLabelvmbox.setToolTipText(resBundel.getString("res_strvmboxDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvmbox;
    }


    /**
     * This method initializes  fJPanelvmbox
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvmbox() {
        if (fJPanelvmbox == null) {
            try {
                fJPanelvmbox = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvmbox.setLayout(layFlowLayout); // Generated
                fJPanelvmbox.add(getJLabelvmbox(), null); // Generated
                fJPanelvmbox.add(getStringTextFieldvmbox(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvmbox;
    }
//end DB field vmbox
//start DB field folder
    /**
     * This method initializes fStringTextFieldfolder
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfolder() {
        if (fStringTextFieldfolder == null) {
            try {
                fStringTextFieldfolder = new StringTextField(); // Generated
                fStringTextFieldfolder.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfolder;
    }
        
    /**
     * This method initializes  fJLabelfolder
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfolder() {
        if (fJLabelfolder == null) {
            try {
                 fJLabelfolder = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfolder.setText(resBundel.getString("res_strfolderDisplayName")); // Generated
                 fJLabelfolder.setToolTipText(resBundel.getString("res_strfolderDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfolder;
    }


    /**
     * This method initializes  fJPanelfolder
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfolder() {
        if (fJPanelfolder == null) {
            try {
                fJPanelfolder = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfolder.setLayout(layFlowLayout); // Generated
                fJPanelfolder.add(getJLabelfolder(), null); // Generated
                fJPanelfolder.add(getStringTextFieldfolder(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfolder;
    }
//end DB field folder
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
//start DB field varname
    /**
     * This method initializes fStringTextFieldvarname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvarname() {
        if (fStringTextFieldvarname == null) {
            try {
                fStringTextFieldvarname = new StringTextField(); // Generated
                fStringTextFieldvarname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvarname;
    }
        
    /**
     * This method initializes  fJLabelvarname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvarname() {
        if (fJLabelvarname == null) {
            try {
                 fJLabelvarname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvarname.setText(resBundel.getString("res_strvarnameDisplayName")); // Generated
                 fJLabelvarname.setToolTipText(resBundel.getString("res_strvarnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvarname;
    }


    /**
     * This method initializes  fJPanelvarname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvarname() {
        if (fJPanelvarname == null) {
            try {
                fJPanelvarname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvarname.setLayout(layFlowLayout); // Generated
                fJPanelvarname.add(getJLabelvarname(), null); // Generated
                fJPanelvarname.add(getStringTextFieldvarname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvarname;
    }
//end DB field varname

}

	