package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.NBScat;

/**
 * <p>
 * NBScatDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: NBScatDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class NBScatDataPanel extends SimpleDataObjectPanel{
	protected NBScat dataObject;
	//protected NBScatChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public NBScatDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getNBScatResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getNBScatResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/NBScatResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new NBScatCheckerImpl(resBundel);
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
	 * @param NBScat
	 */
	public void setDataObject(Object aNBScat) {
	    //abstractdataObject = (AbstractConfigObject) aNBScat;
		setDataObject((NBScat) aNBScat);
		//dataObject = aNBScat;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param NBScat
	 */
	public void setDataObject(NBScat aNBScat) {
	    //abstractdataObject = (AbstractConfigObject) aNBScat;
		dataObject = aNBScat;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	