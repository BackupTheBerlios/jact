package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.Progress;

/**
 * <p>
 * ProgressDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:57 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ProgressDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class ProgressDataPanel extends SimpleDataObjectPanel{
	protected Progress dataObject;
	//protected ProgressChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ProgressDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getProgressResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getProgressResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ProgressResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ProgressCheckerImpl(resBundel);
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
	 * @param Progress
	 */
	public void setDataObject(Object aProgress) {
	    //abstractdataObject = (AbstractConfigObject) aProgress;
		setDataObject((Progress) aProgress);
		//dataObject = aProgress;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Progress
	 */
	public void setDataObject(Progress aProgress) {
	    //abstractdataObject = (AbstractConfigObject) aProgress;
		dataObject = aProgress;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	