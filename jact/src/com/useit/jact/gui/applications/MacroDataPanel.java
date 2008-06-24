package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Macro;

/**
 * <p>
 * MacroDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:23 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MacroDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class MacroDataPanel extends SimpleDataObjectPanel{
	protected Macro dataObject;
	//protected MacroChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MacroDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMacroResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMacroResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MacroResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MacroCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldmacroname,		
			fStringTextFieldarg1,		
			fStringTextFieldarg2,		
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
        this.add(getJPanelmacroname(), null); // Generated
        this.add(getJPanelarg1(), null); // Generated
        this.add(getJPanelarg2(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldmacroname.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldarg1.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldarg2.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldmacroname.setValue(dataObject.getMacroname());
        fStringTextFieldarg1.setValue(dataObject.getArg1());
        fStringTextFieldarg2.setValue(dataObject.getArg2());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setMacroname(fStringTextFieldmacroname.getValue());
        dataObject.setArg1(fStringTextFieldarg1.getValue());
        dataObject.setArg2(fStringTextFieldarg2.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Macro
	 */
	public void setDataObject(Object aMacro) {
	    //abstractdataObject = (AbstractConfigObject) aMacro;
		setDataObject((Macro) aMacro);
		//dataObject = aMacro;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Macro
	 */
	public void setDataObject(Macro aMacro) {
	    //abstractdataObject = (AbstractConfigObject) aMacro;
		dataObject = aMacro;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldmacroname;
    protected javax.swing.JLabel fJLabelmacroname;
	protected javax.swing.JPanel fJPanelmacroname;
    protected StringTextField fStringTextFieldarg1;
    protected javax.swing.JLabel fJLabelarg1;
	protected javax.swing.JPanel fJPanelarg1;
    protected StringTextField fStringTextFieldarg2;
    protected javax.swing.JLabel fJLabelarg2;
	protected javax.swing.JPanel fJPanelarg2;
    

//start DB field macroname
    /**
     * This method initializes fStringTextFieldmacroname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmacroname() {
        if (fStringTextFieldmacroname == null) {
            try {
                fStringTextFieldmacroname = new StringTextField(); // Generated
                fStringTextFieldmacroname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmacroname;
    }
        
    /**
     * This method initializes  fJLabelmacroname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmacroname() {
        if (fJLabelmacroname == null) {
            try {
                 fJLabelmacroname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmacroname.setText(resBundel.getString("res_strmacronameDisplayName")); // Generated
                 fJLabelmacroname.setToolTipText(resBundel.getString("res_strmacronameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmacroname;
    }


    /**
     * This method initializes  fJPanelmacroname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmacroname() {
        if (fJPanelmacroname == null) {
            try {
                fJPanelmacroname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmacroname.setLayout(layFlowLayout); // Generated
                fJPanelmacroname.add(getJLabelmacroname(), null); // Generated
                fJPanelmacroname.add(getStringTextFieldmacroname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmacroname;
    }
//end DB field macroname
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
//start DB field arg2
    /**
     * This method initializes fStringTextFieldarg2
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldarg2() {
        if (fStringTextFieldarg2 == null) {
            try {
                fStringTextFieldarg2 = new StringTextField(); // Generated
                fStringTextFieldarg2.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldarg2;
    }
        
    /**
     * This method initializes  fJLabelarg2
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelarg2() {
        if (fJLabelarg2 == null) {
            try {
                 fJLabelarg2 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelarg2.setText(resBundel.getString("res_strarg2DisplayName")); // Generated
                 fJLabelarg2.setToolTipText(resBundel.getString("res_strarg2Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelarg2;
    }


    /**
     * This method initializes  fJPanelarg2
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelarg2() {
        if (fJPanelarg2 == null) {
            try {
                fJPanelarg2 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelarg2.setLayout(layFlowLayout); // Generated
                fJPanelarg2.add(getJLabelarg2(), null); // Generated
                fJPanelarg2.add(getStringTextFieldarg2(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelarg2;
    }
//end DB field arg2

}

	