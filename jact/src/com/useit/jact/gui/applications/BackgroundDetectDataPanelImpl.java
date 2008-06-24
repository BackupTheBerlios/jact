package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * BackgroundDetectDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:12 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: BackgroundDetectDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class BackgroundDetectDataPanelImpl extends BackgroundDetectDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public BackgroundDetectDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getBackgroundDetectResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getBackgroundDetectResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/BackgroundDetectResFile");
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
        this.add(getJPanelfilename(), null); // Generated
        this.add(getJPanelsil(), null); // Generated
        this.add(getJPanelmin(), null); // Generated
        this.add(getJPanelmax(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
