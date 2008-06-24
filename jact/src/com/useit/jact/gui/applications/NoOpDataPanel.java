package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.NoOp;

/**
 * <p>
 * NoOpDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:51 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: NoOpDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class NoOpDataPanel extends SimpleDataObjectPanel{
	protected NoOp dataObject;
	//protected NoOpChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public NoOpDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getNoOpResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getNoOpResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/NoOpResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new NoOpCheckerImpl(resBundel);
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
	 * @param NoOp
	 */
	public void setDataObject(Object aNoOp) {
	    //abstractdataObject = (AbstractConfigObject) aNoOp;
		setDataObject((NoOp) aNoOp);
		//dataObject = aNoOp;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param NoOp
	 */
	public void setDataObject(NoOp aNoOp) {
	    //abstractdataObject = (AbstractConfigObject) aNoOp;
		dataObject = aNoOp;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	