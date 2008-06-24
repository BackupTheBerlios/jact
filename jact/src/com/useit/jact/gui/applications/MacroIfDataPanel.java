package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.MacroIf;

/**
 * <p>
 * MacroIfDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MacroIfDataPanel.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class MacroIfDataPanel extends SimpleDataObjectPanel{
	protected MacroIf dataObject;
	//protected MacroIfChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MacroIfDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMacroIfResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMacroIfResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MacroIfResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MacroIfCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldexpr,		
			fStringTextFieldmacroname_a,		
			fStringTextFieldmacroname_b,		
			fStringTextFieldarg1,		
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
        this.add(getJPanelexpr(), null); // Generated
        this.add(getJPanelmacroname_a(), null); // Generated
        this.add(getJPanelmacroname_b(), null); // Generated
        this.add(getJPanelarg1(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldexpr.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmacroname_a.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmacroname_b.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldarg1.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldexpr.setValue(dataObject.getExpr());
        fStringTextFieldmacroname_a.setValue(dataObject.getMacroname_a());
        fStringTextFieldmacroname_b.setValue(dataObject.getMacroname_b());
        fStringTextFieldarg1.setValue(dataObject.getArg1());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setExpr(fStringTextFieldexpr.getValue());
        dataObject.setMacroname_a(fStringTextFieldmacroname_a.getValue());
        dataObject.setMacroname_b(fStringTextFieldmacroname_b.getValue());
        dataObject.setArg1(fStringTextFieldarg1.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param MacroIf
	 */
	public void setDataObject(Object aMacroIf) {
	    //abstractdataObject = (AbstractConfigObject) aMacroIf;
		setDataObject((MacroIf) aMacroIf);
		//dataObject = aMacroIf;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param MacroIf
	 */
	public void setDataObject(MacroIf aMacroIf) {
	    //abstractdataObject = (AbstractConfigObject) aMacroIf;
		dataObject = aMacroIf;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldexpr;
    protected javax.swing.JLabel fJLabelexpr;
	protected javax.swing.JPanel fJPanelexpr;
    protected StringTextField fStringTextFieldmacroname_a;
    protected javax.swing.JLabel fJLabelmacroname_a;
	protected javax.swing.JPanel fJPanelmacroname_a;
    protected StringTextField fStringTextFieldmacroname_b;
    protected javax.swing.JLabel fJLabelmacroname_b;
	protected javax.swing.JPanel fJPanelmacroname_b;
    protected StringTextField fStringTextFieldarg1;
    protected javax.swing.JLabel fJLabelarg1;
	protected javax.swing.JPanel fJPanelarg1;
    

//start DB field expr
    /**
     * This method initializes fStringTextFieldexpr
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldexpr() {
        if (fStringTextFieldexpr == null) {
            try {
                fStringTextFieldexpr = new StringTextField(); // Generated
                fStringTextFieldexpr.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldexpr;
    }
        
    /**
     * This method initializes  fJLabelexpr
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelexpr() {
        if (fJLabelexpr == null) {
            try {
                 fJLabelexpr = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelexpr.setText(resBundel.getString("res_strexprDisplayName")); // Generated
                 fJLabelexpr.setToolTipText(resBundel.getString("res_strexprDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelexpr;
    }


    /**
     * This method initializes  fJPanelexpr
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelexpr() {
        if (fJPanelexpr == null) {
            try {
                fJPanelexpr = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelexpr.setLayout(layFlowLayout); // Generated
                fJPanelexpr.add(getJLabelexpr(), null); // Generated
                fJPanelexpr.add(getStringTextFieldexpr(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelexpr;
    }
//end DB field expr
//start DB field macroname_a
    /**
     * This method initializes fStringTextFieldmacroname_a
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmacroname_a() {
        if (fStringTextFieldmacroname_a == null) {
            try {
                fStringTextFieldmacroname_a = new StringTextField(); // Generated
                fStringTextFieldmacroname_a.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmacroname_a;
    }
        
    /**
     * This method initializes  fJLabelmacroname_a
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmacroname_a() {
        if (fJLabelmacroname_a == null) {
            try {
                 fJLabelmacroname_a = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmacroname_a.setText(resBundel.getString("res_strmacroname_aDisplayName")); // Generated
                 fJLabelmacroname_a.setToolTipText(resBundel.getString("res_strmacroname_aDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmacroname_a;
    }


    /**
     * This method initializes  fJPanelmacroname_a
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmacroname_a() {
        if (fJPanelmacroname_a == null) {
            try {
                fJPanelmacroname_a = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmacroname_a.setLayout(layFlowLayout); // Generated
                fJPanelmacroname_a.add(getJLabelmacroname_a(), null); // Generated
                fJPanelmacroname_a.add(getStringTextFieldmacroname_a(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmacroname_a;
    }
//end DB field macroname_a
//start DB field macroname_b
    /**
     * This method initializes fStringTextFieldmacroname_b
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmacroname_b() {
        if (fStringTextFieldmacroname_b == null) {
            try {
                fStringTextFieldmacroname_b = new StringTextField(); // Generated
                fStringTextFieldmacroname_b.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmacroname_b;
    }
        
    /**
     * This method initializes  fJLabelmacroname_b
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmacroname_b() {
        if (fJLabelmacroname_b == null) {
            try {
                 fJLabelmacroname_b = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmacroname_b.setText(resBundel.getString("res_strmacroname_bDisplayName")); // Generated
                 fJLabelmacroname_b.setToolTipText(resBundel.getString("res_strmacroname_bDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmacroname_b;
    }


    /**
     * This method initializes  fJPanelmacroname_b
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmacroname_b() {
        if (fJPanelmacroname_b == null) {
            try {
                fJPanelmacroname_b = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmacroname_b.setLayout(layFlowLayout); // Generated
                fJPanelmacroname_b.add(getJLabelmacroname_b(), null); // Generated
                fJPanelmacroname_b.add(getStringTextFieldmacroname_b(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmacroname_b;
    }
//end DB field macroname_b
//start DB field arg1
    /**
     * This method initializes fStringTextFieldarg1
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldarg1() {
        if (fStringTextFieldarg1 == null) {
            try {
                fStringTextFieldarg1 = new StringTextField(); // Generated
                fStringTextFieldarg1.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldarg1;
    }
        
    /**
     * This method initializes  fJLabelarg1
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelarg1() {
        if (fJLabelarg1 == null) {
            try {
                 fJLabelarg1 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelarg1.setText(resBundel.getString("res_strarg1DisplayName")); // Generated
                 fJLabelarg1.setToolTipText(resBundel.getString("res_strarg1Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelarg1;
    }


    /**
     * This method initializes  fJPanelarg1
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelarg1() {
        if (fJPanelarg1 == null) {
            try {
                fJPanelarg1 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelarg1.setLayout(layFlowLayout); // Generated
                fJPanelarg1.add(getJLabelarg1(), null); // Generated
                fJPanelarg1.add(getStringTextFieldarg1(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelarg1;
    }
//end DB field arg1

}

	