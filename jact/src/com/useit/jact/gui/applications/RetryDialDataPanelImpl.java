package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * RetryDialDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:51 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RetryDialDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class RetryDialDataPanelImpl extends RetryDialDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public RetryDialDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getRetryDialResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getRetryDialResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/RetryDialResFile");
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
		this.setSize(400,(10)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(10); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelannounce(), null); // Generated
        this.add(getJPanelsleep(), null); // Generated
        this.add(getJPanelloops(), null); // Generated
        this.add(getJPaneltechnology(), null); // Generated
        this.add(getJPanelresource(), null); // Generated
        this.add(getJPaneltechnology2(), null); // Generated
        this.add(getJPanelresource2(), null); // Generated
        this.add(getJPaneltimeout(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
        this.add(getJPaneluRL(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
