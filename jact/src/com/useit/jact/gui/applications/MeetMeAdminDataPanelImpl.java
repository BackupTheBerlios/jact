package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * MeetMeAdminDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:45 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetMeAdminDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class MeetMeAdminDataPanelImpl extends MeetMeAdminDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MeetMeAdminDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMeetMeAdminResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMeetMeAdminResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MeetMeAdminResFile");
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
        this.add(getJPanelconfno(), null); // Generated
        this.add(getJPanelcommand(), null); // Generated
        this.add(getJPaneluser(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
