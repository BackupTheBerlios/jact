package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * RealTimeUpdateDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:07 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RealTimeUpdateDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class RealTimeUpdateDataPanelImpl extends RealTimeUpdateDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public RealTimeUpdateDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getRealTimeUpdateResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getRealTimeUpdateResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/RealTimeUpdateResFile");
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
        this.add(getJPanelfamily(), null); // Generated
        this.add(getJPanelcolmatch(), null); // Generated
        this.add(getJPanelvalue(), null); // Generated
        this.add(getJPanelnewcol(), null); // Generated
        this.add(getJPanelnewval(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
