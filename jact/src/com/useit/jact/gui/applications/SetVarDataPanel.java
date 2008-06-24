package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SetVar;

/**
 * <p>
 * SetVarDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:49 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetVarDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SetVarDataPanel extends SimpleDataObjectPanel{
	protected SetVar dataObject;
	//protected SetVarChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetVarDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetVarResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetVarResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetVarResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SetVarCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldn1,		
			fStringTextFieldn2,		
			fStringTextFieldvalue,		
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
		this.setSize(400,(4)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneln1(), null); // Generated
        this.add(getJPaneln2(), null); // Generated
        this.add(getJPanelvalue(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldn1.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldn2.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldvalue.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoptions.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldn1.setValue(dataObject.getN1());
        fStringTextFieldn2.setValue(dataObject.getN2());
        fStringTextFieldvalue.setValue(dataObject.getValue());
        fStringTextFieldoptions.setValue(dataObject.getOptions());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setN1(fStringTextFieldn1.getValue());
        dataObject.setN2(fStringTextFieldn2.getValue());
        dataObject.setValue(fStringTextFieldvalue.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SetVar
	 */
	public void setDataObject(Object aSetVar) {
	    //abstractdataObject = (AbstractConfigObject) aSetVar;
		setDataObject((SetVar) aSetVar);
		//dataObject = aSetVar;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SetVar
	 */
	public void setDataObject(SetVar aSetVar) {
	    //abstractdataObject = (AbstractConfigObject) aSetVar;
		dataObject = aSetVar;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldn1;
    protected javax.swing.JLabel fJLabeln1;
	protected javax.swing.JPanel fJPaneln1;
    protected StringTextField fStringTextFieldn2;
    protected javax.swing.JLabel fJLabeln2;
	protected javax.swing.JPanel fJPaneln2;
    protected StringTextField fStringTextFieldvalue;
    protected javax.swing.JLabel fJLabelvalue;
	protected javax.swing.JPanel fJPanelvalue;
    protected StringTextField fStringTextFieldoptions;
    protected javax.swing.JLabel fJLabeloptions;
	protected javax.swing.JPanel fJPaneloptions;
    

//start DB field n1
    /**
     * This method initializes fStringTextFieldn1
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldn1() {
        if (fStringTextFieldn1 == null) {
            try {
                fStringTextFieldn1 = new StringTextField(); // Generated
                fStringTextFieldn1.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldn1;
    }
        
    /**
     * This method initializes  fJLabeln1
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeln1() {
        if (fJLabeln1 == null) {
            try {
                 fJLabeln1 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeln1.setText(resBundel.getString("res_strn1DisplayName")); // Generated
                 fJLabeln1.setToolTipText(resBundel.getString("res_strn1Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeln1;
    }


    /**
     * This method initializes  fJPaneln1
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneln1() {
        if (fJPaneln1 == null) {
            try {
                fJPaneln1 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneln1.setLayout(layFlowLayout); // Generated
                fJPaneln1.add(getJLabeln1(), null); // Generated
                fJPaneln1.add(getStringTextFieldn1(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneln1;
    }
//end DB field n1
//start DB field n2
    /**
     * This method initializes fStringTextFieldn2
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldn2() {
        if (fStringTextFieldn2 == null) {
            try {
                fStringTextFieldn2 = new StringTextField(); // Generated
                fStringTextFieldn2.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldn2;
    }
        
    /**
     * This method initializes  fJLabeln2
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeln2() {
        if (fJLabeln2 == null) {
            try {
                 fJLabeln2 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeln2.setText(resBundel.getString("res_strn2DisplayName")); // Generated
                 fJLabeln2.setToolTipText(resBundel.getString("res_strn2Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeln2;
    }


    /**
     * This method initializes  fJPaneln2
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneln2() {
        if (fJPaneln2 == null) {
            try {
                fJPaneln2 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneln2.setLayout(layFlowLayout); // Generated
                fJPaneln2.add(getJLabeln2(), null); // Generated
                fJPaneln2.add(getStringTextFieldn2(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneln2;
    }
//end DB field n2
//start DB field value
    /**
     * This method initializes fStringTextFieldvalue
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvalue() {
        if (fStringTextFieldvalue == null) {
            try {
                fStringTextFieldvalue = new StringTextField(); // Generated
                fStringTextFieldvalue.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvalue;
    }
        
    /**
     * This method initializes  fJLabelvalue
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvalue() {
        if (fJLabelvalue == null) {
            try {
                 fJLabelvalue = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvalue.setText(resBundel.getString("res_strvalueDisplayName")); // Generated
                 fJLabelvalue.setToolTipText(resBundel.getString("res_strvalueDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvalue;
    }


    /**
     * This method initializes  fJPanelvalue
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvalue() {
        if (fJPanelvalue == null) {
            try {
                fJPanelvalue = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvalue.setLayout(layFlowLayout); // Generated
                fJPanelvalue.add(getJLabelvalue(), null); // Generated
                fJPanelvalue.add(getStringTextFieldvalue(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvalue;
    }
//end DB field value
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

	