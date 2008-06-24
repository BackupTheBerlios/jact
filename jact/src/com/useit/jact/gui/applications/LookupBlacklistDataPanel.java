package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.LookupBlacklist;

/**
 * <p>
 * LookupBlacklistDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:42 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: LookupBlacklistDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class LookupBlacklistDataPanel extends SimpleDataObjectPanel{
	protected LookupBlacklist dataObject;
	//protected LookupBlacklistChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public LookupBlacklistDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getLookupBlacklistResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getLookupBlacklistResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/LookupBlacklistResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new LookupBlacklistCheckerImpl(resBundel);
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
	 * @param LookupBlacklist
	 */
	public void setDataObject(Object aLookupBlacklist) {
	    //abstractdataObject = (AbstractConfigObject) aLookupBlacklist;
		setDataObject((LookupBlacklist) aLookupBlacklist);
		//dataObject = aLookupBlacklist;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param LookupBlacklist
	 */
	public void setDataObject(LookupBlacklist aLookupBlacklist) {
	    //abstractdataObject = (AbstractConfigObject) aLookupBlacklist;
		dataObject = aLookupBlacklist;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	