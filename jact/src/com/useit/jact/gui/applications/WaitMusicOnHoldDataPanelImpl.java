package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * WaitMusicOnHoldDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:28 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WaitMusicOnHoldDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class WaitMusicOnHoldDataPanelImpl extends WaitMusicOnHoldDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public WaitMusicOnHoldDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getWaitMusicOnHoldResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getWaitMusicOnHoldResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/WaitMusicOnHoldResFile");
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
        this.add(getJPaneldelay(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
