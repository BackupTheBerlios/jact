package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * UnpauseQueueMemberDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:37 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: UnpauseQueueMemberDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class UnpauseQueueMemberDataPanelImpl extends UnpauseQueueMemberDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public UnpauseQueueMemberDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getUnpauseQueueMemberResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getUnpauseQueueMemberResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/UnpauseQueueMemberResFile");
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
