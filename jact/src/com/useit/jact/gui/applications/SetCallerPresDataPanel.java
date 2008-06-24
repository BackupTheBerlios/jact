package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SetCallerPres;

/**
 * <p>
 * SetCallerPresDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:40 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCallerPresDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SetCallerPresDataPanel extends SimpleDataObjectPanel{
	protected SetCallerPres dataObject;
	//protected SetCallerPresChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SetCallerPresDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSetCallerPresResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSetCallerPresResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SetCallerPresResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SetCallerPresCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldpresentation,		
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
		this.setSize(400,(1)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(1); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelpresentation(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldpresentation.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldpresentation.setValue(dataObject.getPresentation());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setPresentation(fStringTextFieldpresentation.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SetCallerPres
	 */
	public void setDataObject(Object aSetCallerPres) {
	    //abstractdataObject = (AbstractConfigObject) aSetCallerPres;
		setDataObject((SetCallerPres) aSetCallerPres);
		//dataObject = aSetCallerPres;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SetCallerPres
	 */
	public void setDataObject(SetCallerPres aSetCallerPres) {
	    //abstractdataObject = (AbstractConfigObject) aSetCallerPres;
		dataObject = aSetCallerPres;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldpresentation;
    protected javax.swing.JLabel fJLabelpresentation;
	protected javax.swing.JPanel fJPanelpresentation;
    

//start DB field presentation
    /**
     * This method initializes fStringTextFieldpresentation
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpresentation() {
        if (fStringTextFieldpresentation == null) {
            try {
                fStringTextFieldpresentation = new StringTextField(); // Generated
                fStringTextFieldpresentation.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpresentation;
    }
        
    /**
     * This method initializes  fJLabelpresentation
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpresentation() {
        if (fJLabelpresentation == null) {
            try {
                 fJLabelpresentation = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelpresentation.setText(resBundel.getString("res_strpresentationDisplayName")); // Generated
                 fJLabelpresentation.setToolTipText(resBundel.getString("res_strpresentationDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelpresentation;
    }


    /**
     * This method initializes  fJPanelpresentation
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpresentation() {
        if (fJPanelpresentation == null) {
            try {
                fJPanelpresentation = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpresentation.setLayout(layFlowLayout); // Generated
                fJPanelpresentation.add(getJLabelpresentation(), null); // Generated
                fJPanelpresentation.add(getStringTextFieldpresentation(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpresentation;
    }
//end DB field presentation

}

	