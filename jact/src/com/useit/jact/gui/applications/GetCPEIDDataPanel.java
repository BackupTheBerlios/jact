package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.GetCPEID;

/**
 * <p>
 * GetCPEIDDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:09 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GetCPEIDDataPanel.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class GetCPEIDDataPanel extends SimpleDataObjectPanel{
	protected GetCPEID dataObject;
	//protected GetCPEIDChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public GetCPEIDDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getGetCPEIDResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getGetCPEIDResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/GetCPEIDResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new GetCPEIDCheckerImpl(resBundel);
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
	 * @param GetCPEID
	 */
	public void setDataObject(Object aGetCPEID) {
	    //abstractdataObject = (AbstractConfigObject) aGetCPEID;
		setDataObject((GetCPEID) aGetCPEID);
		//dataObject = aGetCPEID;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param GetCPEID
	 */
	public void setDataObject(GetCPEID aGetCPEID) {
	    //abstractdataObject = (AbstractConfigObject) aGetCPEID;
		dataObject = aGetCPEID;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	