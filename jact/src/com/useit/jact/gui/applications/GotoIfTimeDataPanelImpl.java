package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * GotoIfTimeDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:11 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GotoIfTimeDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class GotoIfTimeDataPanelImpl extends GotoIfTimeDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public GotoIfTimeDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getGotoIfTimeResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getGotoIfTimeResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/GotoIfTimeResFile");
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
		this.setSize(400,(7)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(7); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneltimes(), null); // Generated
        this.add(getJPanelweekdays(), null); // Generated
        this.add(getJPanelmdays(), null); // Generated
        this.add(getJPanelmonths(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPanelextension(), null); // Generated
        this.add(getJPanelpri(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
