package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * ResponseTimeoutDataPanelImpl,
 * das wirkliche panel, kann �berarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:56 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ResponseTimeoutDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class ResponseTimeoutDataPanelImpl extends ResponseTimeoutDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ResponseTimeoutDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getResponseTimeoutResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getResponseTimeoutResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ResponseTimeoutResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		initialize();
		initActions();
	}

	

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(400,(1)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(1); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelseconds(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
