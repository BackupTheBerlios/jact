package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.Playtones;

/**
 * <p>
 * PlaytonesDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:34 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: PlaytonesDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class PlaytonesDataPanel extends SimpleDataObjectPanel{
	protected Playtones dataObject;
	//protected PlaytonesChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public PlaytonesDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getPlaytonesResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getPlaytonesResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/PlaytonesResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new PlaytonesCheckerImpl(resBundel);
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
	 * @param Playtones
	 */
	public void setDataObject(Object aPlaytones) {
	    //abstractdataObject = (AbstractConfigObject) aPlaytones;
		setDataObject((Playtones) aPlaytones);
		//dataObject = aPlaytones;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Playtones
	 */
	public void setDataObject(Playtones aPlaytones) {
	    //abstractdataObject = (AbstractConfigObject) aPlaytones;
		dataObject = aPlaytones;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	