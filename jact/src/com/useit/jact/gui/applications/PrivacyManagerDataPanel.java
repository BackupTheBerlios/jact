package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.PrivacyManager;

/**
 * <p>
 * PrivacyManagerDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:11 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: PrivacyManagerDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class PrivacyManagerDataPanel extends SimpleDataObjectPanel{
	protected PrivacyManager dataObject;
	//protected PrivacyManagerChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public PrivacyManagerDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getPrivacyManagerResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getPrivacyManagerResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/PrivacyManagerResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new PrivacyManagerCheckerImpl(resBundel);
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
	 * @param PrivacyManager
	 */
	public void setDataObject(Object aPrivacyManager) {
	    //abstractdataObject = (AbstractConfigObject) aPrivacyManager;
		setDataObject((PrivacyManager) aPrivacyManager);
		//dataObject = aPrivacyManager;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param PrivacyManager
	 */
	public void setDataObject(PrivacyManager aPrivacyManager) {
	    //abstractdataObject = (AbstractConfigObject) aPrivacyManager;
		dataObject = aPrivacyManager;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	