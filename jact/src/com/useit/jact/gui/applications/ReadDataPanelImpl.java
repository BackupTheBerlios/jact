package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * ReadDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ReadDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class ReadDataPanelImpl extends ReadDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ReadDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getReadResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getReadResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ReadResFile");
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
        this.add(getJPanelvariable(), null); // Generated
        this.add(getJPanelfilename(), null); // Generated
        this.add(getJPanelmaxdigits(), null); // Generated
        this.add(getJPaneloption(), null); // Generated
        this.add(getJPanelattempts(), null); // Generated
        this.add(getJPaneltimeout(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
