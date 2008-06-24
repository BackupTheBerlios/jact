package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * ParkAndAnnounceDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:35 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ParkAndAnnounceDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class ParkAndAnnounceDataPanelImpl extends ParkAndAnnounceDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ParkAndAnnounceDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getParkAndAnnounceResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getParkAndAnnounceResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ParkAndAnnounceResFile");
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
		this.setSize(400,(5)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(5); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelannounce(), null); // Generated
        this.add(getJPaneltemplate(), null); // Generated
        this.add(getJPaneltimeout(), null); // Generated
        this.add(getJPaneldial(), null); // Generated
        this.add(getJPanelreturn_context(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
