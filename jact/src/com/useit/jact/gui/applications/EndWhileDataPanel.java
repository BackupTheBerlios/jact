package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.EndWhile;

/**
 * <p>
 * EndWhileDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:08 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: EndWhileDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class EndWhileDataPanel extends SimpleDataObjectPanel{
	protected EndWhile dataObject;
	//protected EndWhileChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public EndWhileDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getEndWhileResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getEndWhileResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/EndWhileResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new EndWhileCheckerImpl(resBundel);
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
	 * @param EndWhile
	 */
	public void setDataObject(Object aEndWhile) {
	    //abstractdataObject = (AbstractConfigObject) aEndWhile;
		setDataObject((EndWhile) aEndWhile);
		//dataObject = aEndWhile;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param EndWhile
	 */
	public void setDataObject(EndWhile aEndWhile) {
	    //abstractdataObject = (AbstractConfigObject) aEndWhile;
		dataObject = aEndWhile;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	