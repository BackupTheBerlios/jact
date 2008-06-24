package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.TXTCIDName;

/**
 * <p>
 * TXTCIDNameDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:08 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: TXTCIDNameDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class TXTCIDNameDataPanel extends SimpleDataObjectPanel{
	protected TXTCIDName dataObject;
	//protected TXTCIDNameChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public TXTCIDNameDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getTXTCIDNameResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getTXTCIDNameResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/TXTCIDNameResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new TXTCIDNameCheckerImpl(resBundel);
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
	 * @param TXTCIDName
	 */
	public void setDataObject(Object aTXTCIDName) {
	    //abstractdataObject = (AbstractConfigObject) aTXTCIDName;
		setDataObject((TXTCIDName) aTXTCIDName);
		//dataObject = aTXTCIDName;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param TXTCIDName
	 */
	public void setDataObject(TXTCIDName aTXTCIDName) {
	    //abstractdataObject = (AbstractConfigObject) aTXTCIDName;
		dataObject = aTXTCIDName;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	