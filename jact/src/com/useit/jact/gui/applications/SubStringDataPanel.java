package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.SubString;

/**
 * <p>
 * SubStringDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:21 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SubStringDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SubStringDataPanel extends SimpleDataObjectPanel{
	protected SubString dataObject;
	//protected SubStringChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SubStringDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSubStringResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSubStringResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SubStringResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SubStringCheckerImpl(resBundel);
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
	 * @param SubString
	 */
	public void setDataObject(Object aSubString) {
	    //abstractdataObject = (AbstractConfigObject) aSubString;
		setDataObject((SubString) aSubString);
		//dataObject = aSubString;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SubString
	 */
	public void setDataObject(SubString aSubString) {
	    //abstractdataObject = (AbstractConfigObject) aSubString;
		dataObject = aSubString;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	