package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * ResetCDRDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:06 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ResetCDRDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class ResetCDRDataPanelImpl extends ResetCDRDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ResetCDRDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getResetCDRResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getResetCDRResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ResetCDRResFile");
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
        this.add(getJPaneloptions(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
