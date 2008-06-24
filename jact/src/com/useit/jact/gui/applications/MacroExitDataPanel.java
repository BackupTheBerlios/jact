package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.MacroExit;

/**
 * <p>
 * MacroExitDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:20 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MacroExitDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class MacroExitDataPanel extends SimpleDataObjectPanel{
	protected MacroExit dataObject;
	//protected MacroExitChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MacroExitDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMacroExitResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMacroExitResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MacroExitResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MacroExitCheckerImpl(resBundel);
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
	 * @param MacroExit
	 */
	public void setDataObject(Object aMacroExit) {
	    //abstractdataObject = (AbstractConfigObject) aMacroExit;
		setDataObject((MacroExit) aMacroExit);
		//dataObject = aMacroExit;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param MacroExit
	 */
	public void setDataObject(MacroExit aMacroExit) {
	    //abstractdataObject = (AbstractConfigObject) aMacroExit;
		dataObject = aMacroExit;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	