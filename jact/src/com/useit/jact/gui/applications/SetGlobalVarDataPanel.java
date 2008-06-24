package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SetGlobalVar;

/**
 * <p>
 * SetGlobalVarDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetGlobalVarDataPanel.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class SetGlobalVarDataPanel extends SimpleDataObjectPanel{
	protected SetGlobalVar dataObject;
	//protected SetGlobalVarChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetGlobalVarDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetGlobalVarResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetGlobalVarResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetGlobalVarResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SetGlobalVarCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldn,		
			fStringTextFieldvalue,		
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
		this.setSize(400,(2)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneln(), null); // Generated
        this.add(getJPanelvalue(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldn.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldvalue.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldn.setValue(dataObject.getN());
        fStringTextFieldvalue.setValue(dataObject.getValue());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setN(fStringTextFieldn.getValue());
        dataObject.setValue(fStringTextFieldvalue.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SetGlobalVar
	 */
	public void setDataObject(Object aSetGlobalVar) {
	    //abstractdataObject = (AbstractConfigObject) aSetGlobalVar;
		setDataObject((SetGlobalVar) aSetGlobalVar);
		//dataObject = aSetGlobalVar;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SetGlobalVar
	 */
	public void setDataObject(SetGlobalVar aSetGlobalVar) {
	    //abstractdataObject = (AbstractConfigObject) aSetGlobalVar;
		dataObject = aSetGlobalVar;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldn;
    protected javax.swing.JLabel fJLabeln;
	protected javax.swing.JPanel fJPaneln;
    protected StringTextField fStringTextFieldvalue;
    protected javax.swing.JLabel fJLabelvalue;
	protected javax.swing.JPanel fJPanelvalue;
    

//start DB field n
    /**
     * This method initializes fStringTextFieldn
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldn() {
        if (fStringTextFieldn == null) {
            try {
                fStringTextFieldn = new StringTextField(); // Generated
                fStringTextFieldn.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldn;
    }
        
    /**
     * This method initializes  fJLabeln
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeln() {
        if (fJLabeln == null) {
            try {
                 fJLabeln = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeln.setText(resBundel.getString("res_strnDisplayName")); // Generated
                 fJLabeln.setToolTipText(resBundel.getString("res_strnDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeln;
    }


    /**
     * This method initializes  fJPaneln
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneln() {
        if (fJPaneln == null) {
            try {
                fJPaneln = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneln.setLayout(layFlowLayout); // Generated
                fJPaneln.add(getJLabeln(), null); // Generated
                fJPaneln.add(getStringTextFieldn(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneln;
    }
//end DB field n
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

}

	