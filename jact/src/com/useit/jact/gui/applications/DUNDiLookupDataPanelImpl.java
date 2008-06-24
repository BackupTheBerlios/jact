package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * DUNDiLookupDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:31 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DUNDiLookupDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class DUNDiLookupDataPanelImpl extends DUNDiLookupDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public DUNDiLookupDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getDUNDiLookupResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getDUNDiLookupResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/DUNDiLookupResFile");
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
        this.add(getJPanelnumber(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
