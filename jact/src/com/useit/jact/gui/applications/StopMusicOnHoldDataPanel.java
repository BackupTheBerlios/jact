package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.StopMusicOnHold;

/**
 * <p>
 * StopMusicOnHoldDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:49 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: StopMusicOnHoldDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class StopMusicOnHoldDataPanel extends SimpleDataObjectPanel{
	protected StopMusicOnHold dataObject;
	//protected StopMusicOnHoldChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public StopMusicOnHoldDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getStopMusicOnHoldResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getStopMusicOnHoldResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/StopMusicOnHoldResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new StopMusicOnHoldCheckerImpl(resBundel);
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
	 * @param StopMusicOnHold
	 */
	public void setDataObject(Object aStopMusicOnHold) {
	    //abstractdataObject = (AbstractConfigObject) aStopMusicOnHold;
		setDataObject((StopMusicOnHold) aStopMusicOnHold);
		//dataObject = aStopMusicOnHold;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param StopMusicOnHold
	 */
	public void setDataObject(StopMusicOnHold aStopMusicOnHold) {
	    //abstractdataObject = (AbstractConfigObject) aStopMusicOnHold;
		dataObject = aStopMusicOnHold;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	