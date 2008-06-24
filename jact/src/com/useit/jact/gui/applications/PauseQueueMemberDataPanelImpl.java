package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * PauseQueueMemberDataPanelImpl,
 * das wirkliche panel, kann �berarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:38:52 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: PauseQueueMemberDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class PauseQueueMemberDataPanelImpl extends PauseQueueMemberDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public PauseQueueMemberDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getPauseQueueMemberResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getPauseQueueMemberResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/PauseQueueMemberResFile");
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
		this.setSize(400,(2)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelqueuename(), null); // Generated
        this.add(getJPanelinterface_(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
