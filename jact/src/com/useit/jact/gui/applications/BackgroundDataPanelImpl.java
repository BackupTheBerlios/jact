package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * BackgroundDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:39 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: BackgroundDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class BackgroundDataPanelImpl extends BackgroundDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public BackgroundDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getBackgroundResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getBackgroundResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/BackgroundResFile");
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
		this.setSize(400,(4)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelfilename1(), null); // Generated
        this.add(getJPanelfilename2(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
        this.add(getJPanellangoverride(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
