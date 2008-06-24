package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * SIPDtmfModeDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:40 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SIPDtmfModeDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SIPDtmfModeDataPanelImpl extends SIPDtmfModeDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SIPDtmfModeDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSIPDtmfModeResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSIPDtmfModeResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SIPDtmfModeResFile");
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
        this.add(getJPanelinband(), null); // Generated
        this.add(getJPanelinfo(), null); // Generated
        this.add(getJPanelrfc2833(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
