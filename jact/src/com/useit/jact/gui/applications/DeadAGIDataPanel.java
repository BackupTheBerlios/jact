package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.DeadAGI;

/**
 * <p>
 * DeadAGIDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:38 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DeadAGIDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class DeadAGIDataPanel extends SimpleDataObjectPanel{
	protected DeadAGI dataObject;
	//protected DeadAGIChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public DeadAGIDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getDeadAGIResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getDeadAGIResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/DeadAGIResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new DeadAGICheckerImpl(resBundel);
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
	 * @param DeadAGI
	 */
	public void setDataObject(Object aDeadAGI) {
	    //abstractdataObject = (AbstractConfigObject) aDeadAGI;
		setDataObject((DeadAGI) aDeadAGI);
		//dataObject = aDeadAGI;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param DeadAGI
	 */
	public void setDataObject(DeadAGI aDeadAGI) {
	    //abstractdataObject = (AbstractConfigObject) aDeadAGI;
		dataObject = aDeadAGI;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	