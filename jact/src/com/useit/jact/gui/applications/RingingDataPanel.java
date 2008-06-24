package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.Ringing;

/**
 * <p>
 * RingingDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:39 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RingingDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class RingingDataPanel extends SimpleDataObjectPanel{
	protected Ringing dataObject;
	//protected RingingChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public RingingDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getRingingResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getRingingResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/RingingResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new RingingCheckerImpl(resBundel);
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
	 * @param Ringing
	 */
	public void setDataObject(Object aRinging) {
	    //abstractdataObject = (AbstractConfigObject) aRinging;
		setDataObject((Ringing) aRinging);
		//dataObject = aRinging;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Ringing
	 */
	public void setDataObject(Ringing aRinging) {
	    //abstractdataObject = (AbstractConfigObject) aRinging;
		dataObject = aRinging;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	