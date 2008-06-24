package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * ControlPlaybackDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:08 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ControlPlaybackDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class ControlPlaybackDataPanelImpl extends ControlPlaybackDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ControlPlaybackDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getControlPlaybackResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getControlPlaybackResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ControlPlaybackResFile");
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
		this.setSize(400,(6)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(6); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelfilename(), null); // Generated
        this.add(getJPanelskipms(), null); // Generated
        this.add(getJPanelffchar(), null); // Generated
        this.add(getJPanelrewchar(), null); // Generated
        this.add(getJPanelstopchar(), null); // Generated
        this.add(getJPanelpausechr(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
