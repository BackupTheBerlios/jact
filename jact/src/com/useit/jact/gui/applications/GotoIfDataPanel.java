package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.ExtensionWidget;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.GotoIf;

/**
 * <p>
 * GotoIfDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GotoIfDataPanel.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class GotoIfDataPanel extends SimpleDataObjectPanel{
	protected GotoIf dataObject;
	//protected GotoIfChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public GotoIfDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getGotoIfResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getGotoIfResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/GotoIfResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new GotoIfCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldcondition,		
			fStringTextFieldlabel1,		
			fExtensionWidgetextension1,		
			fExtensionWidgetextension2,		
			fStringTextFieldlabel2,		
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
        this.add(getJPanelcondition(), null); // Generated
        this.add(getJPanellabel1(), null); // Generated
        this.add(getJPanelextension1(), null); // Generated
        this.add(getJPanelextension2(), null); // Generated
        this.add(getJPanellabel2(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldcondition.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldlabel1.getDocument().addDocumentListener(textChangeAct);
		fExtensionWidgetextension1.getDocument().addDocumentListener(textChangeAct);
		fExtensionWidgetextension2.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldlabel2.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldcondition.setValue(dataObject.getCondition());
        fStringTextFieldlabel1.setValue(dataObject.getLabel1());
        fExtensionWidgetextension1.setValue(dataObject.getExtension1());
        fExtensionWidgetextension2.setValue(dataObject.getExtension2());
        fStringTextFieldlabel2.setValue(dataObject.getLabel2());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setCondition(fStringTextFieldcondition.getValue());
        dataObject.setLabel1(fStringTextFieldlabel1.getValue());
        dataObject.setExtension1(fExtensionWidgetextension1.getValue());
        dataObject.setExtension2(fExtensionWidgetextension2.getValue());
        dataObject.setLabel2(fStringTextFieldlabel2.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param GotoIf
	 */
	public void setDataObject(Object aGotoIf) {
	    //abstractdataObject = (AbstractConfigObject) aGotoIf;
		setDataObject((GotoIf) aGotoIf);
		//dataObject = aGotoIf;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param GotoIf
	 */
	public void setDataObject(GotoIf aGotoIf) {
	    //abstractdataObject = (AbstractConfigObject) aGotoIf;
		dataObject = aGotoIf;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldcondition;
    protected javax.swing.JLabel fJLabelcondition;
	protected javax.swing.JPanel fJPanelcondition;
    protected StringTextField fStringTextFieldlabel1;
    protected javax.swing.JLabel fJLabellabel1;
	protected javax.swing.JPanel fJPanellabel1;
    protected ExtensionWidget fExtensionWidgetextension1;
    protected javax.swing.JLabel fJLabelextension1;
	protected javax.swing.JPanel fJPanelextension1;
    protected ExtensionWidget fExtensionWidgetextension2;
    protected javax.swing.JLabel fJLabelextension2;
	protected javax.swing.JPanel fJPanelextension2;
    protected StringTextField fStringTextFieldlabel2;
    protected javax.swing.JLabel fJLabellabel2;
	protected javax.swing.JPanel fJPanellabel2;
    

//start DB field condition
    /**
     * This method initializes fStringTextFieldcondition
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcondition() {
        if (fStringTextFieldcondition == null) {
            try {
                fStringTextFieldcondition = new StringTextField(); // Generated
                fStringTextFieldcondition.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcondition;
    }
        
    /**
     * This method initializes  fJLabelcondition
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcondition() {
        if (fJLabelcondition == null) {
            try {
                 fJLabelcondition = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcondition.setText(resBundel.getString("res_strconditionDisplayName")); // Generated
                 fJLabelcondition.setToolTipText(resBundel.getString("res_strconditionDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcondition;
    }


    /**
     * This method initializes  fJPanelcondition
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcondition() {
        if (fJPanelcondition == null) {
            try {
                fJPanelcondition = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcondition.setLayout(layFlowLayout); // Generated
                fJPanelcondition.add(getJLabelcondition(), null); // Generated
                fJPanelcondition.add(getStringTextFieldcondition(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcondition;
    }
//end DB field condition
//start DB field label1
    /**
     * This method initializes fStringTextFieldlabel1
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldlabel1() {
        if (fStringTextFieldlabel1 == null) {
            try {
                fStringTextFieldlabel1 = new StringTextField(); // Generated
                fStringTextFieldlabel1.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldlabel1;
    }
        
    /**
     * This method initializes  fJLabellabel1
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellabel1() {
        if (fJLabellabel1 == null) {
            try {
                 fJLabellabel1 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabellabel1.setText(resBundel.getString("res_strlabel1DisplayName")); // Generated
                 fJLabellabel1.setToolTipText(resBundel.getString("res_strlabel1Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabellabel1;
    }


    /**
     * This method initializes  fJPanellabel1
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellabel1() {
        if (fJPanellabel1 == null) {
            try {
                fJPanellabel1 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellabel1.setLayout(layFlowLayout); // Generated
                fJPanellabel1.add(getJLabellabel1(), null); // Generated
                fJPanellabel1.add(getStringTextFieldlabel1(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellabel1;
    }
//end DB field label1
//start DB field extension1
    /**
     * This method initializes fExtensionWidgetextension1
     *
     * @return ExtensionWidget
     */
    public ExtensionWidget getExtensionWidgetextension1() {
        if (fExtensionWidgetextension1 == null) {
            try {
                fExtensionWidgetextension1 = new ExtensionWidget(); // Generated
                fExtensionWidgetextension1.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fExtensionWidgetextension1;
    }
        
    /**
     * This method initializes  fJLabelextension1
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelextension1() {
        if (fJLabelextension1 == null) {
            try {
                 fJLabelextension1 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelextension1.setText(resBundel.getString("res_strextension1DisplayName")); // Generated
                 fJLabelextension1.setToolTipText(resBundel.getString("res_strextension1Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelextension1;
    }


    /**
     * This method initializes  fJPanelextension1
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelextension1() {
        if (fJPanelextension1 == null) {
            try {
                fJPanelextension1 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelextension1.setLayout(layFlowLayout); // Generated
                fJPanelextension1.add(getJLabelextension1(), null); // Generated
                fJPanelextension1.add(getExtensionWidgetextension1(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelextension1;
    }
//end DB field extension1
//start DB field extension2
    /**
     * This method initializes fExtensionWidgetextension2
     *
     * @return ExtensionWidget
     */
    public ExtensionWidget getExtensionWidgetextension2() {
        if (fExtensionWidgetextension2 == null) {
            try {
                fExtensionWidgetextension2 = new ExtensionWidget(); // Generated
                fExtensionWidgetextension2.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fExtensionWidgetextension2;
    }
        
    /**
     * This method initializes  fJLabelextension2
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelextension2() {
        if (fJLabelextension2 == null) {
            try {
                 fJLabelextension2 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelextension2.setText(resBundel.getString("res_strextension2DisplayName")); // Generated
                 fJLabelextension2.setToolTipText(resBundel.getString("res_strextension2Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelextension2;
    }


    /**
     * This method initializes  fJPanelextension2
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelextension2() {
        if (fJPanelextension2 == null) {
            try {
                fJPanelextension2 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelextension2.setLayout(layFlowLayout); // Generated
                fJPanelextension2.add(getJLabelextension2(), null); // Generated
                fJPanelextension2.add(getExtensionWidgetextension2(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelextension2;
    }
//end DB field extension2
//start DB field label2
    /**
     * This method initializes fStringTextFieldlabel2
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldlabel2() {
        if (fStringTextFieldlabel2 == null) {
            try {
                fStringTextFieldlabel2 = new StringTextField(); // Generated
                fStringTextFieldlabel2.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldlabel2;
    }
        
    /**
     * This method initializes  fJLabellabel2
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabellabel2() {
        if (fJLabellabel2 == null) {
            try {
                 fJLabellabel2 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabellabel2.setText(resBundel.getString("res_strlabel2DisplayName")); // Generated
                 fJLabellabel2.setToolTipText(resBundel.getString("res_strlabel2Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabellabel2;
    }


    /**
     * This method initializes  fJPanellabel2
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanellabel2() {
        if (fJPanellabel2 == null) {
            try {
                fJPanellabel2 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanellabel2.setLayout(layFlowLayout); // Generated
                fJPanellabel2.add(getJLabellabel2(), null); // Generated
                fJPanellabel2.add(getStringTextFieldlabel2(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanellabel2;
    }
//end DB field label2

}

	