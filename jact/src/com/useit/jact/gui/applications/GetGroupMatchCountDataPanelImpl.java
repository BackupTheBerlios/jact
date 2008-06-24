package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * GetGroupMatchCountDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:52 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GetGroupMatchCountDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class GetGroupMatchCountDataPanelImpl extends GetGroupMatchCountDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public GetGroupMatchCountDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getGetGroupMatchCountResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getGetGroupMatchCountResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/GetGroupMatchCountResFile");
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
		this.setSize(400,(2)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelgroupmatch(), null); // Generated
        this.add(getJPanelcategory(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
