package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.StopPlaytones;

/**
 * <p>
 * StopPlaytonesDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:34 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: StopPlaytonesDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class StopPlaytonesDataPanel extends SimpleDataObjectPanel{
	protected StopPlaytones dataObject;
	//protected StopPlaytonesChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public StopPlaytonesDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getStopPlaytonesResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getStopPlaytonesResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/StopPlaytonesResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new StopPlaytonesCheckerImpl(resBundel);
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
	 * @param StopPlaytones
	 */
	public void setDataObject(Object aStopPlaytones) {
	    //abstractdataObject = (AbstractConfigObject) aStopPlaytones;
		setDataObject((StopPlaytones) aStopPlaytones);
		//dataObject = aStopPlaytones;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param StopPlaytones
	 */
	public void setDataObject(StopPlaytones aStopPlaytones) {
	    //abstractdataObject = (AbstractConfigObject) aStopPlaytones;
		dataObject = aStopPlaytones;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	