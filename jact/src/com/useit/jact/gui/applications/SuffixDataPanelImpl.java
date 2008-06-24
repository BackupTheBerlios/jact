package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * SuffixDataPanelImpl,
 * das wirkliche panel, kann �berarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:39:58 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SuffixDataPanelImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class SuffixDataPanelImpl extends SuffixDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SuffixDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSuffixResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSuffixResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SuffixResFile");
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
        this.add(getJPaneldigits(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
