package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ADSIProg;

/**
 * <p>
 * ADSIProgDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ADSIProgDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class ADSIProgDataPanel extends SimpleDataObjectPanel{
	protected ADSIProg dataObject;
	//protected ADSIProgChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ADSIProgDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getADSIProgResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getADSIProgResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ADSIProgResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ADSIProgCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldscript,		
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
        this.add(getJPanelscript(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldscript.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldscript.setValue(dataObject.getScript());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setScript(fStringTextFieldscript.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ADSIProg
	 */
	public void setDataObject(Object aADSIProg) {
	    //abstractdataObject = (AbstractConfigObject) aADSIProg;
		setDataObject((ADSIProg) aADSIProg);
		//dataObject = aADSIProg;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ADSIProg
	 */
	public void setDataObject(ADSIProg aADSIProg) {
	    //abstractdataObject = (AbstractConfigObject) aADSIProg;
		dataObject = aADSIProg;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldscript;
    protected javax.swing.JLabel fJLabelscript;
	protected javax.swing.JPanel fJPanelscript;
    

//start DB field script
    /**
     * This method initializes fStringTextFieldscript
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldscript() {
        if (fStringTextFieldscript == null) {
            try {
                fStringTextFieldscript = new StringTextField(); // Generated
                fStringTextFieldscript.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldscript;
    }
        
    /**
     * This method initializes  fJLabelscript
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelscript() {
        if (fJLabelscript == null) {
            try {
                 fJLabelscript = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelscript.setText(resBundel.getString("res_strscriptDisplayName")); // Generated
                 fJLabelscript.setToolTipText(resBundel.getString("res_strscriptDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelscript;
    }


    /**
     * This method initializes  fJPanelscript
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelscript() {
        if (fJPanelscript == null) {
            try {
                fJPanelscript = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelscript.setLayout(layFlowLayout); // Generated
                fJPanelscript.add(getJLabelscript(), null); // Generated
                fJPanelscript.add(getStringTextFieldscript(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelscript;
    }
//end DB field script

}

	