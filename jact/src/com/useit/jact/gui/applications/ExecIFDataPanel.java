package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ExecIF;

/**
 * <p>
 * ExecIFDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:29 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExecIFDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class ExecIFDataPanel extends SimpleDataObjectPanel{
	protected ExecIF dataObject;
	//protected ExecIFChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ExecIFDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getExecIFResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getExecIFResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ExecIFResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ExecIFCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldexpr,		
			fStringTextFieldapp,		
			fStringTextFielddata,		
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
        this.add(getJPanelexpr(), null); // Generated
        this.add(getJPanelapp(), null); // Generated
        this.add(getJPaneldata(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldexpr.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldapp.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielddata.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldexpr.setValue(dataObject.getExpr());
        fStringTextFieldapp.setValue(dataObject.getApp());
        fStringTextFielddata.setValue(dataObject.getData());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setExpr(fStringTextFieldexpr.getValue());
        dataObject.setApp(fStringTextFieldapp.getValue());
        dataObject.setData(fStringTextFielddata.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ExecIF
	 */
	public void setDataObject(Object aExecIF) {
	    //abstractdataObject = (AbstractConfigObject) aExecIF;
		setDataObject((ExecIF) aExecIF);
		//dataObject = aExecIF;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ExecIF
	 */
	public void setDataObject(ExecIF aExecIF) {
	    //abstractdataObject = (AbstractConfigObject) aExecIF;
		dataObject = aExecIF;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldexpr;
    protected javax.swing.JLabel fJLabelexpr;
	protected javax.swing.JPanel fJPanelexpr;
    protected StringTextField fStringTextFieldapp;
    protected javax.swing.JLabel fJLabelapp;
	protected javax.swing.JPanel fJPanelapp;
    protected StringTextField fStringTextFielddata;
    protected javax.swing.JLabel fJLabeldata;
	protected javax.swing.JPanel fJPaneldata;
    

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
//start DB field app
    /**
     * This method initializes fStringTextFieldapp
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldapp() {
        if (fStringTextFieldapp == null) {
            try {
                fStringTextFieldapp = new StringTextField(); // Generated
                fStringTextFieldapp.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldapp;
    }
        
    /**
     * This method initializes  fJLabelapp
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelapp() {
        if (fJLabelapp == null) {
            try {
                 fJLabelapp = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelapp.setText(resBundel.getString("res_strappDisplayName")); // Generated
                 fJLabelapp.setToolTipText(resBundel.getString("res_strappDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelapp;
    }


    /**
     * This method initializes  fJPanelapp
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelapp() {
        if (fJPanelapp == null) {
            try {
                fJPanelapp = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelapp.setLayout(layFlowLayout); // Generated
                fJPanelapp.add(getJLabelapp(), null); // Generated
                fJPanelapp.add(getStringTextFieldapp(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelapp;
    }
//end DB field app
//start DB field data
    /**
     * This method initializes fStringTextFielddata
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielddata() {
        if (fStringTextFielddata == null) {
            try {
                fStringTextFielddata = new StringTextField(); // Generated
                fStringTextFielddata.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddata;
    }
        
    /**
     * This method initializes  fJLabeldata
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldata() {
        if (fJLabeldata == null) {
            try {
                 fJLabeldata = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeldata.setText(resBundel.getString("res_strdataDisplayName")); // Generated
                 fJLabeldata.setToolTipText(resBundel.getString("res_strdataDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeldata;
    }


    /**
     * This method initializes  fJPaneldata
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldata() {
        if (fJPaneldata == null) {
            try {
                fJPaneldata = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldata.setLayout(layFlowLayout); // Generated
                fJPaneldata.add(getJLabeldata(), null); // Generated
                fJPaneldata.add(getStringTextFielddata(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldata;
    }
//end DB field data

}

	