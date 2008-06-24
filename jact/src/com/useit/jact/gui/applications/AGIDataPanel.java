package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.AGI;

/**
 * <p>
 * AGIDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:06 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AGIDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class AGIDataPanel extends SimpleDataObjectPanel{
	protected AGI dataObject;
	//protected AGIChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public AGIDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getAGIResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getAGIResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/AGIResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new AGICheckerImpl(resBundel);
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
	 * @param AGI
	 */
	public void setDataObject(Object aAGI) {
	    //abstractdataObject = (AbstractConfigObject) aAGI;
		setDataObject((AGI) aAGI);
		//dataObject = aAGI;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param AGI
	 */
	public void setDataObject(AGI aAGI) {
	    //abstractdataObject = (AbstractConfigObject) aAGI;
		dataObject = aAGI;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	