package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.MD5_checksum_application;

/**
 * <p>
 * MD5_checksum_applicationDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:41 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MD5_checksum_applicationDataPanel.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class MD5_checksum_applicationDataPanel extends SimpleDataObjectPanel{
	protected MD5_checksum_application dataObject;
	//protected MD5_checksum_applicationChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MD5_checksum_applicationDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMD5_checksum_applicationResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMD5_checksum_applicationResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MD5_checksum_applicationResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MD5_checksum_applicationCheckerImpl(resBundel);
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
	 * @param MD5_checksum_application
	 */
	public void setDataObject(Object aMD5_checksum_application) {
	    //abstractdataObject = (AbstractConfigObject) aMD5_checksum_application;
		setDataObject((MD5_checksum_application) aMD5_checksum_application);
		//dataObject = aMD5_checksum_application;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param MD5_checksum_application
	 */
	public void setDataObject(MD5_checksum_application aMD5_checksum_application) {
	    //abstractdataObject = (AbstractConfigObject) aMD5_checksum_application;
		dataObject = aMD5_checksum_application;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	