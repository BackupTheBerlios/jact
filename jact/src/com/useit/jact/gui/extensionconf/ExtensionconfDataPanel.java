package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.CustomCheckBox;
import com.useit.jact.model.extensionconf.Extensionconf;

/**
 * <p>
 * ExtensionconfDataPanel
 * </p>
 * Created : Fri May 26 17:18:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExtensionconfDataPanel.java,v 1.1 2008/06/24 20:45:19 urszeidler Exp $
 */
public class ExtensionconfDataPanel extends SimpleDataObjectPanel{
	protected Extensionconf dataObject;
	//protected ExtensionconfChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ExtensionconfDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getExtensionconfResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getExtensionconfResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ExtensionconfResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ExtensionconfCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fCustomCheckBoxstatic_,		
			fCustomCheckBoxwriteprotect,		
			fCustomCheckBoxautofallthrough,		
			fCustomCheckBoxclearglobalvars,		
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
        this.add(getJPanelstatic_(), null); // Generated
        this.add(getJPanelwriteprotect(), null); // Generated
        this.add(getJPanelautofallthrough(), null); // Generated
        this.add(getJPanelclearglobalvars(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fCustomCheckBoxstatic_.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxwriteprotect.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxautofallthrough.getDocument().addDocumentListener(textChangeAct);
		fCustomCheckBoxclearglobalvars.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fCustomCheckBoxstatic_.setValue(dataObject.getStatic_());
        fCustomCheckBoxwriteprotect.setValue(dataObject.getWriteprotect());
        fCustomCheckBoxautofallthrough.setValue(dataObject.getAutofallthrough());
        fCustomCheckBoxclearglobalvars.setValue(dataObject.getClearglobalvars());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setStatic_(fCustomCheckBoxstatic_.getValue());
        dataObject.setWriteprotect(fCustomCheckBoxwriteprotect.getValue());
        dataObject.setAutofallthrough(fCustomCheckBoxautofallthrough.getValue());
        dataObject.setClearglobalvars(fCustomCheckBoxclearglobalvars.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Extensionconf
	 */
	public void setDataObject(Object aExtensionconf) {
	    //abstractdataObject = (AbstractConfigObject) aExtensionconf;
		setDataObject((Extensionconf) aExtensionconf);
		//dataObject = aExtensionconf;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Extensionconf
	 */
	public void setDataObject(Extensionconf aExtensionconf) {
	    //abstractdataObject = (AbstractConfigObject) aExtensionconf;
		dataObject = aExtensionconf;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected CustomCheckBox fCustomCheckBoxstatic_;
    protected javax.swing.JLabel fJLabelstatic_;
	protected javax.swing.JPanel fJPanelstatic_;
    protected CustomCheckBox fCustomCheckBoxwriteprotect;
    protected javax.swing.JLabel fJLabelwriteprotect;
	protected javax.swing.JPanel fJPanelwriteprotect;
    protected CustomCheckBox fCustomCheckBoxautofallthrough;
    protected javax.swing.JLabel fJLabelautofallthrough;
	protected javax.swing.JPanel fJPanelautofallthrough;
    protected CustomCheckBox fCustomCheckBoxclearglobalvars;
    protected javax.swing.JLabel fJLabelclearglobalvars;
	protected javax.swing.JPanel fJPanelclearglobalvars;
    

//start DB field static_
    /**
     * This method initializes fCustomCheckBoxstatic_
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxstatic_() {
        if (fCustomCheckBoxstatic_ == null) {
            try {
                fCustomCheckBoxstatic_ = new CustomCheckBox(); // Generated
                fCustomCheckBoxstatic_.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxstatic_;
    }
        
    /**
     * This method initializes  fJLabelstatic_
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelstatic_() {
        if (fJLabelstatic_ == null) {
            try {
                 fJLabelstatic_ = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelstatic_.setText(resBundel.getString("res_strstatic_DisplayName")); // Generated
                 fJLabelstatic_.setToolTipText(resBundel.getString("res_strstatic_Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelstatic_;
    }


    /**
     * This method initializes  fJPanelstatic_
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelstatic_() {
        if (fJPanelstatic_ == null) {
            try {
                fJPanelstatic_ = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelstatic_.setLayout(layFlowLayout); // Generated
                fJPanelstatic_.add(getJLabelstatic_(), null); // Generated
                fJPanelstatic_.add(getCustomCheckBoxstatic_(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelstatic_;
    }
//end DB field static_
//start DB field writeprotect
    /**
     * This method initializes fCustomCheckBoxwriteprotect
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxwriteprotect() {
        if (fCustomCheckBoxwriteprotect == null) {
            try {
                fCustomCheckBoxwriteprotect = new CustomCheckBox(); // Generated
                fCustomCheckBoxwriteprotect.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxwriteprotect;
    }
        
    /**
     * This method initializes  fJLabelwriteprotect
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelwriteprotect() {
        if (fJLabelwriteprotect == null) {
            try {
                 fJLabelwriteprotect = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelwriteprotect.setText(resBundel.getString("res_strwriteprotectDisplayName")); // Generated
                 fJLabelwriteprotect.setToolTipText(resBundel.getString("res_strwriteprotectDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelwriteprotect;
    }


    /**
     * This method initializes  fJPanelwriteprotect
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelwriteprotect() {
        if (fJPanelwriteprotect == null) {
            try {
                fJPanelwriteprotect = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelwriteprotect.setLayout(layFlowLayout); // Generated
                fJPanelwriteprotect.add(getJLabelwriteprotect(), null); // Generated
                fJPanelwriteprotect.add(getCustomCheckBoxwriteprotect(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelwriteprotect;
    }
//end DB field writeprotect
//start DB field autofallthrough
    /**
     * This method initializes fCustomCheckBoxautofallthrough
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxautofallthrough() {
        if (fCustomCheckBoxautofallthrough == null) {
            try {
                fCustomCheckBoxautofallthrough = new CustomCheckBox(); // Generated
                fCustomCheckBoxautofallthrough.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxautofallthrough;
    }
        
    /**
     * This method initializes  fJLabelautofallthrough
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelautofallthrough() {
        if (fJLabelautofallthrough == null) {
            try {
                 fJLabelautofallthrough = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelautofallthrough.setText(resBundel.getString("res_strautofallthroughDisplayName")); // Generated
                 fJLabelautofallthrough.setToolTipText(resBundel.getString("res_strautofallthroughDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelautofallthrough;
    }


    /**
     * This method initializes  fJPanelautofallthrough
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelautofallthrough() {
        if (fJPanelautofallthrough == null) {
            try {
                fJPanelautofallthrough = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelautofallthrough.setLayout(layFlowLayout); // Generated
                fJPanelautofallthrough.add(getJLabelautofallthrough(), null); // Generated
                fJPanelautofallthrough.add(getCustomCheckBoxautofallthrough(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelautofallthrough;
    }
//end DB field autofallthrough
//start DB field clearglobalvars
    /**
     * This method initializes fCustomCheckBoxclearglobalvars
     *
     * @return CustomCheckBox
     */
    public CustomCheckBox getCustomCheckBoxclearglobalvars() {
        if (fCustomCheckBoxclearglobalvars == null) {
            try {
                fCustomCheckBoxclearglobalvars = new CustomCheckBox(); // Generated
                fCustomCheckBoxclearglobalvars.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fCustomCheckBoxclearglobalvars;
    }
        
    /**
     * This method initializes  fJLabelclearglobalvars
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelclearglobalvars() {
        if (fJLabelclearglobalvars == null) {
            try {
                 fJLabelclearglobalvars = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelclearglobalvars.setText(resBundel.getString("res_strclearglobalvarsDisplayName")); // Generated
                 fJLabelclearglobalvars.setToolTipText(resBundel.getString("res_strclearglobalvarsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelclearglobalvars;
    }


    /**
     * This method initializes  fJPanelclearglobalvars
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelclearglobalvars() {
        if (fJPanelclearglobalvars == null) {
            try {
                fJPanelclearglobalvars = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelclearglobalvars.setLayout(layFlowLayout); // Generated
                fJPanelclearglobalvars.add(getJLabelclearglobalvars(), null); // Generated
                fJPanelclearglobalvars.add(getCustomCheckBoxclearglobalvars(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelclearglobalvars;
    }
//end DB field clearglobalvars

}

	