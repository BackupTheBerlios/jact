package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.EnumLookup;

/**
 * <p>
 * EnumLookupDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:28 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: EnumLookupDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class EnumLookupDataPanel extends SimpleDataObjectPanel{
	protected EnumLookup dataObject;
	//protected EnumLookupChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public EnumLookupDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getEnumLookupResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getEnumLookupResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/EnumLookupResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new EnumLookupCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldexten,		
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
        this.add(getJPanelexten(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldexten.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldexten.setValue(dataObject.getExten());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setExten(fStringTextFieldexten.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param EnumLookup
	 */
	public void setDataObject(Object aEnumLookup) {
	    //abstractdataObject = (AbstractConfigObject) aEnumLookup;
		setDataObject((EnumLookup) aEnumLookup);
		//dataObject = aEnumLookup;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param EnumLookup
	 */
	public void setDataObject(EnumLookup aEnumLookup) {
	    //abstractdataObject = (AbstractConfigObject) aEnumLookup;
		dataObject = aEnumLookup;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldexten;
    protected javax.swing.JLabel fJLabelexten;
	protected javax.swing.JPanel fJPanelexten;
    

//start DB field exten
    /**
     * This method initializes fStringTextFieldexten
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldexten() {
        if (fStringTextFieldexten == null) {
            try {
                fStringTextFieldexten = new StringTextField(); // Generated
                fStringTextFieldexten.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldexten;
    }
        
    /**
     * This method initializes  fJLabelexten
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelexten() {
        if (fJLabelexten == null) {
            try {
                 fJLabelexten = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelexten.setText(resBundel.getString("res_strextenDisplayName")); // Generated
                 fJLabelexten.setToolTipText(resBundel.getString("res_strextenDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelexten;
    }


    /**
     * This method initializes  fJPanelexten
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelexten() {
        if (fJPanelexten == null) {
            try {
                fJPanelexten = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelexten.setLayout(layFlowLayout); // Generated
                fJPanelexten.add(getJLabelexten(), null); // Generated
                fJPanelexten.add(getStringTextFieldexten(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelexten;
    }
//end DB field exten

}

	