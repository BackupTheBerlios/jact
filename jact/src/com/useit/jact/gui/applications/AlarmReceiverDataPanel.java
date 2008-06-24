package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.AlarmReceiver;

/**
 * <p>
 * AlarmReceiverDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:47 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AlarmReceiverDataPanel.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class AlarmReceiverDataPanel extends SimpleDataObjectPanel{
	protected AlarmReceiver dataObject;
	//protected AlarmReceiverChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public AlarmReceiverDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getAlarmReceiverResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getAlarmReceiverResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/AlarmReceiverResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new AlarmReceiverCheckerImpl(resBundel);
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
	 * @param AlarmReceiver
	 */
	public void setDataObject(Object aAlarmReceiver) {
	    //abstractdataObject = (AbstractConfigObject) aAlarmReceiver;
		setDataObject((AlarmReceiver) aAlarmReceiver);
		//dataObject = aAlarmReceiver;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param AlarmReceiver
	 */
	public void setDataObject(AlarmReceiver aAlarmReceiver) {
	    //abstractdataObject = (AbstractConfigObject) aAlarmReceiver;
		dataObject = aAlarmReceiver;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	