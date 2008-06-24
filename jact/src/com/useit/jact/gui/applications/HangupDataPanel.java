package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.Hangup;

/**
 * <p>
 * HangupDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: HangupDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class HangupDataPanel extends SimpleDataObjectPanel{
	protected Hangup dataObject;
	//protected HangupChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public HangupDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getHangupResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getHangupResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/HangupResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new HangupCheckerImpl(resBundel);
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
	 * @param Hangup
	 */
	public void setDataObject(Object aHangup) {
	    //abstractdataObject = (AbstractConfigObject) aHangup;
		setDataObject((Hangup) aHangup);
		//dataObject = aHangup;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Hangup
	 */
	public void setDataObject(Hangup aHangup) {
	    //abstractdataObject = (AbstractConfigObject) aHangup;
		dataObject = aHangup;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	