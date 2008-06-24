package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * AddQueueMemberDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:34 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AddQueueMemberDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class AddQueueMemberDataPanelImpl extends AddQueueMemberDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public AddQueueMemberDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getAddQueueMemberResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getAddQueueMemberResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/AddQueueMemberResFile");
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
		this.setSize(400,(3)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelqueuename(), null); // Generated
        this.add(getJPanelinterface_(), null); // Generated
        this.add(getJPanelpenalty(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
