package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SIPDtmfMode;

/**
 * <p>
 * SIPDtmfModeDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:29 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SIPDtmfModeDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class SIPDtmfModeDataPanel extends SimpleDataObjectPanel{
	protected SIPDtmfMode dataObject;
	//protected SIPDtmfModeChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SIPDtmfModeDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSIPDtmfModeResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSIPDtmfModeResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SIPDtmfModeResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SIPDtmfModeCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldinband,		
			fStringTextFieldinfo,		
			fStringTextFieldrfc2833,		
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
        this.add(getJPanelinband(), null); // Generated
        this.add(getJPanelinfo(), null); // Generated
        this.add(getJPanelrfc2833(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldinband.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldinfo.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldrfc2833.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldinband.setValue(dataObject.getInband());
        fStringTextFieldinfo.setValue(dataObject.getInfo());
        fStringTextFieldrfc2833.setValue(dataObject.getRfc2833());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setInband(fStringTextFieldinband.getValue());
        dataObject.setInfo(fStringTextFieldinfo.getValue());
        dataObject.setRfc2833(fStringTextFieldrfc2833.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SIPDtmfMode
	 */
	public void setDataObject(Object aSIPDtmfMode) {
	    //abstractdataObject = (AbstractConfigObject) aSIPDtmfMode;
		setDataObject((SIPDtmfMode) aSIPDtmfMode);
		//dataObject = aSIPDtmfMode;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SIPDtmfMode
	 */
	public void setDataObject(SIPDtmfMode aSIPDtmfMode) {
	    //abstractdataObject = (AbstractConfigObject) aSIPDtmfMode;
		dataObject = aSIPDtmfMode;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldinband;
    protected javax.swing.JLabel fJLabelinband;
	protected javax.swing.JPanel fJPanelinband;
    protected StringTextField fStringTextFieldinfo;
    protected javax.swing.JLabel fJLabelinfo;
	protected javax.swing.JPanel fJPanelinfo;
    protected StringTextField fStringTextFieldrfc2833;
    protected javax.swing.JLabel fJLabelrfc2833;
	protected javax.swing.JPanel fJPanelrfc2833;
    

//start DB field inband
    /**
     * This method initializes fStringTextFieldinband
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldinband() {
        if (fStringTextFieldinband == null) {
            try {
                fStringTextFieldinband = new StringTextField(); // Generated
                fStringTextFieldinband.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldinband;
    }
        
    /**
     * This method initializes  fJLabelinband
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelinband() {
        if (fJLabelinband == null) {
            try {
                 fJLabelinband = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelinband.setText(resBundel.getString("res_strinbandDisplayName")); // Generated
                 fJLabelinband.setToolTipText(resBundel.getString("res_strinbandDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelinband;
    }


    /**
     * This method initializes  fJPanelinband
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelinband() {
        if (fJPanelinband == null) {
            try {
                fJPanelinband = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelinband.setLayout(layFlowLayout); // Generated
                fJPanelinband.add(getJLabelinband(), null); // Generated
                fJPanelinband.add(getStringTextFieldinband(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelinband;
    }
//end DB field inband
//start DB field info
    /**
     * This method initializes fStringTextFieldinfo
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldinfo() {
        if (fStringTextFieldinfo == null) {
            try {
                fStringTextFieldinfo = new StringTextField(); // Generated
                fStringTextFieldinfo.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldinfo;
    }
        
    /**
     * This method initializes  fJLabelinfo
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelinfo() {
        if (fJLabelinfo == null) {
            try {
                 fJLabelinfo = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelinfo.setText(resBundel.getString("res_strinfoDisplayName")); // Generated
                 fJLabelinfo.setToolTipText(resBundel.getString("res_strinfoDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelinfo;
    }


    /**
     * This method initializes  fJPanelinfo
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelinfo() {
        if (fJPanelinfo == null) {
            try {
                fJPanelinfo = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelinfo.setLayout(layFlowLayout); // Generated
                fJPanelinfo.add(getJLabelinfo(), null); // Generated
                fJPanelinfo.add(getStringTextFieldinfo(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelinfo;
    }
//end DB field info
//start DB field rfc2833
    /**
     * This method initializes fStringTextFieldrfc2833
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldrfc2833() {
        if (fStringTextFieldrfc2833 == null) {
            try {
                fStringTextFieldrfc2833 = new StringTextField(); // Generated
                fStringTextFieldrfc2833.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldrfc2833;
    }
        
    /**
     * This method initializes  fJLabelrfc2833
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrfc2833() {
        if (fJLabelrfc2833 == null) {
            try {
                 fJLabelrfc2833 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelrfc2833.setText(resBundel.getString("res_strrfc2833DisplayName")); // Generated
                 fJLabelrfc2833.setToolTipText(resBundel.getString("res_strrfc2833Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelrfc2833;
    }


    /**
     * This method initializes  fJPanelrfc2833
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrfc2833() {
        if (fJPanelrfc2833 == null) {
            try {
                fJPanelrfc2833 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrfc2833.setLayout(layFlowLayout); // Generated
                fJPanelrfc2833.add(getJLabelrfc2833(), null); // Generated
                fJPanelrfc2833.add(getStringTextFieldrfc2833(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrfc2833;
    }
//end DB field rfc2833

}

	