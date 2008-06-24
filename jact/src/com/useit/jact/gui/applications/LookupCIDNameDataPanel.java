package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.LookupCIDName;

/**
 * <p>
 * LookupCIDNameDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:35 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: LookupCIDNameDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class LookupCIDNameDataPanel extends SimpleDataObjectPanel{
	protected LookupCIDName dataObject;
	//protected LookupCIDNameChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public LookupCIDNameDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getLookupCIDNameResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getLookupCIDNameResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/LookupCIDNameResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new LookupCIDNameCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
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
		this.setSize(400,(0)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(0); // Generated
        this.setLayout(layGridLayout); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
	}

	/**
	 * setzt das DatenObject
	 * @param LookupCIDName
	 */
	public void setDataObject(Object aLookupCIDName) {
	    //abstractdataObject = (AbstractConfigObject) aLookupCIDName;
		setDataObject((LookupCIDName) aLookupCIDName);
		//dataObject = aLookupCIDName;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param LookupCIDName
	 */
	public void setDataObject(LookupCIDName aLookupCIDName) {
	    //abstractdataObject = (AbstractConfigObject) aLookupCIDName;
		dataObject = aLookupCIDName;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	