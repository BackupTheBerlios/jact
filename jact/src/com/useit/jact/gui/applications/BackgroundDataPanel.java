package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Background;

/**
 * <p>
 * BackgroundDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:23 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: BackgroundDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class BackgroundDataPanel extends SimpleDataObjectPanel{
	protected Background dataObject;
	//protected BackgroundChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public BackgroundDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getBackgroundResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getBackgroundResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/BackgroundResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new BackgroundCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldfilename1,		
			fStringTextFieldfilename2,		
			fStringTextFieldoptions,		
			fStringTextFieldlangoverride,		
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
        this.add(getJPanelfilename1(), null); // Generated
        this.add(getJPanelfilename2(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
        this.add(getJPanellangoverride(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldfilename1.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldfilename2.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoptions.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldlangoverride.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldfilename1.setValue(dataObject.getFilename1());
        fStringTextFieldfilename2.setValue(dataObject.getFilename2());
        fStringTextFieldoptions.setValue(dataObject.getOptions());
        fStringTextFieldlangoverride.setValue(dataObject.getLangoverride());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFilename1(fStringTextFieldfilename1.getValue());
        dataObject.setFilename2(fStringTextFieldfilename2.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
        dataObject.setLangoverride(fStringTextFieldlangoverride.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Background
	 */
	public void setDataObject(Object aBackground) {
	    //abstractdataObject = (AbstractConfigObject) aBackground;
		setDataObject((Background) aBackground);
		//dataObject = aBackground;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Background
	 */
	public void setDataObject(Background aBackground) {
	    //abstractdataObject = (AbstractConfigObject) aBackground;
		dataObject = aBackground;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldfilename1;
    protected javax.swing.JLabel fJLabelfilename1;
	protected javax.swing.JPanel fJPanelfilename1;
    protected StringTextField fStringTextFieldfilename2;
    protected javax.swing.JLabel fJLabelfilename2;
	protected javax.swing.JPanel fJPanelfilename2;
    protected StringTextField fStringTextFieldoptions;
    protected javax.swing.JLabel fJLabeloptions;
	protected javax.swing.JPanel fJPaneloptions;
    protected StringTextField fStringTextFieldlangoverride;
    protected javax.swing.JLabel fJLabellangoverride;
	protected javax.swing.JPanel fJPanellangoverride;
    

//start DB field filename1
    /**
     * This method initializes fStringTextFieldfilename1
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfilename1() {
        if (fStringTextFieldfilename1 == null) {
            try {
                fStringTextFieldfilename1 = new StringTextField(); // Generated
                fStringTextFieldfilename1.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfilename1;
    }
        
    /**
     * This method initializes  fJLabelfilename1
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfilename1() {
        if (fJLabelfilename1 == null) {
            try {
                 fJLabelfilename1 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfilename1.setText(resBundel.getString("res_strfilename1DisplayName")); // Generated
                 fJLabelfilename1.setToolTipText(resBundel.getString("res_strfilename1Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfilename1;
    }


    /**
     * This method initializes  fJPanelfilename1
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfilename1() {
        if (fJPanelfilename1 == null) {
            try {
                fJPanelfilename1 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfilename1.setLayout(layFlowLayout); // Generated
                fJPanelfilename1.add(getJLabelfilename1(), null); // Generated
                fJPanelfilename1.add(getStringTextFieldfilename1(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfilename1;
    }
//end DB field filename1
//start DB field filename2
    /**
     * This method initializes fStringTextFieldfilename2
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfilename2() {
        if (fStringTextFieldfilename2 == null) {
            try {
                fStringTextFieldfilename2 = new StringTextField(); // Generated
                fStringTextFieldfilename2.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfilename2;
    }
        
    /**
     * This method initializes  fJLabelfilename2
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfilename2() {
        if (fJLabelfilename2 == null) {
            try {
                 fJLabelfilename2 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfilename2.setText(resBundel.getString("res_strfilename2DisplayName")); // Generated
                 fJLabelfilename2.setToolTipText(resBundel.getString("res_strfilename2Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfilename2;
    }


    /**
     * This method initializes  fJPanelfilename2
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfilename2() {
        if (fJPanelfilename2 == null) {
            try {
                fJPanelfilename2 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfilename2.setLayout(layFlowLayout); // Generated
                fJPanelfilename2.add(getJLabelfilename2(), null); // Generated
                fJPanelfilename2.add(getStringTextFieldfilename2(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfilename2;
    }
//end DB field filename2
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
//start DB field langoverride
    /**
     * This method initializes fStringTextFieldlangoverride
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldlangoverride() {
        if (fStringTextFieldlangoverride == null) {
            try {
                fStringTextFieldlangoverride = new StringTextField(); // Generated
                fStringTextFieldlangoverride.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldlangoverride;
    }
        
    /**
     * This method initializes  fJLabellangoverride
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellangoverride() {
        if (fJLabellangoverride == null) {
            try {
                 fJLabellangoverride = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabellangoverride.setText(resBundel.getString("res_strlangoverrideDisplayName")); // Generated
                 fJLabellangoverride.setToolTipText(resBundel.getString("res_strlangoverrideDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabellangoverride;
    }


    /**
     * This method initializes  fJPanellangoverride
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellangoverride() {
        if (fJPanellangoverride == null) {
            try {
                fJPanellangoverride = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellangoverride.setLayout(layFlowLayout); // Generated
                fJPanellangoverride.add(getJLabellangoverride(), null); // Generated
                fJPanellangoverride.add(getStringTextFieldlangoverride(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellangoverride;
    }
//end DB field langoverride

}

	