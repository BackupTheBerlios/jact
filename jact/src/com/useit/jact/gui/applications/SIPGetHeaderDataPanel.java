package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SIPGetHeader;

/**
 * <p>
 * SIPGetHeaderDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:47 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SIPGetHeaderDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SIPGetHeaderDataPanel extends SimpleDataObjectPanel{
	protected SIPGetHeader dataObject;
	//protected SIPGetHeaderChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SIPGetHeaderDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSIPGetHeaderResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSIPGetHeaderResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SIPGetHeaderResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SIPGetHeaderCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldvar,		
			fStringTextFieldheadername,		
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
        this.add(getJPanelvar(), null); // Generated
        this.add(getJPanelheadername(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldvar.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldheadername.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldvar.setValue(dataObject.getVar());
        fStringTextFieldheadername.setValue(dataObject.getHeadername());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setVar(fStringTextFieldvar.getValue());
        dataObject.setHeadername(fStringTextFieldheadername.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SIPGetHeader
	 */
	public void setDataObject(Object aSIPGetHeader) {
	    //abstractdataObject = (AbstractConfigObject) aSIPGetHeader;
		setDataObject((SIPGetHeader) aSIPGetHeader);
		//dataObject = aSIPGetHeader;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SIPGetHeader
	 */
	public void setDataObject(SIPGetHeader aSIPGetHeader) {
	    //abstractdataObject = (AbstractConfigObject) aSIPGetHeader;
		dataObject = aSIPGetHeader;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldvar;
    protected javax.swing.JLabel fJLabelvar;
	protected javax.swing.JPanel fJPanelvar;
    protected StringTextField fStringTextFieldheadername;
    protected javax.swing.JLabel fJLabelheadername;
	protected javax.swing.JPanel fJPanelheadername;
    

//start DB field var
    /**
     * This method initializes fStringTextFieldvar
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvar() {
        if (fStringTextFieldvar == null) {
            try {
                fStringTextFieldvar = new StringTextField(); // Generated
                fStringTextFieldvar.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvar;
    }
        
    /**
     * This method initializes  fJLabelvar
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvar() {
        if (fJLabelvar == null) {
            try {
                 fJLabelvar = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvar.setText(resBundel.getString("res_strvarDisplayName")); // Generated
                 fJLabelvar.setToolTipText(resBundel.getString("res_strvarDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvar;
    }


    /**
     * This method initializes  fJPanelvar
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvar() {
        if (fJPanelvar == null) {
            try {
                fJPanelvar = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvar.setLayout(layFlowLayout); // Generated
                fJPanelvar.add(getJLabelvar(), null); // Generated
                fJPanelvar.add(getStringTextFieldvar(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvar;
    }
//end DB field var
//start DB field headername
    /**
     * This method initializes fStringTextFieldheadername
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldheadername() {
        if (fStringTextFieldheadername == null) {
            try {
                fStringTextFieldheadername = new StringTextField(); // Generated
                fStringTextFieldheadername.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldheadername;
    }
        
    /**
     * This method initializes  fJLabelheadername
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelheadername() {
        if (fJLabelheadername == null) {
            try {
                 fJLabelheadername = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelheadername.setText(resBundel.getString("res_strheadernameDisplayName")); // Generated
                 fJLabelheadername.setToolTipText(resBundel.getString("res_strheadernameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelheadername;
    }


    /**
     * This method initializes  fJPanelheadername
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelheadername() {
        if (fJPanelheadername == null) {
            try {
                fJPanelheadername = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelheadername.setLayout(layFlowLayout); // Generated
                fJPanelheadername.add(getJLabelheadername(), null); // Generated
                fJPanelheadername.add(getStringTextFieldheadername(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelheadername;
    }
//end DB field headername

}

	