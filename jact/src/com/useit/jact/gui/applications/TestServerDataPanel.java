package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.model.applications.TestServer;

/**
 * <p>
 * TestServerDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:06 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: TestServerDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class TestServerDataPanel extends SimpleDataObjectPanel{
	protected TestServer dataObject;
	//protected TestServerChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public TestServerDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getTestServerResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getTestServerResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/TestServerResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new TestServerCheckerImpl(resBundel);
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
	 * @param TestServer
	 */
	public void setDataObject(Object aTestServer) {
	    //abstractdataObject = (AbstractConfigObject) aTestServer;
		setDataObject((TestServer) aTestServer);
		//dataObject = aTestServer;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param TestServer
	 */
	public void setDataObject(TestServer aTestServer) {
	    //abstractdataObject = (AbstractConfigObject) aTestServer;
		dataObject = aTestServer;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    


}

	