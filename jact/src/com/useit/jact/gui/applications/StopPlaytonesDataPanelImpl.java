package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * StopPlaytonesDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:38:49 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: StopPlaytonesDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class StopPlaytonesDataPanelImpl extends StopPlaytonesDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public StopPlaytonesDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getStopPlaytonesResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getStopPlaytonesResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/StopPlaytonesResFile");
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
		this.setSize(400,(0)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(0); // Generated
        this.setLayout(layGridLayout); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
