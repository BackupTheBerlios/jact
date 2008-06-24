package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * HasVoicemailDataPanelImpl,
 * das wirkliche panel, kann überarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:32 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: HasVoicemailDataPanelImpl.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class HasVoicemailDataPanelImpl extends HasVoicemailDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public HasVoicemailDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getHasVoicemailResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getHasVoicemailResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/HasVoicemailResFile");
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
        this.add(getJPanelvmbox(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPanelfolder(), null); // Generated
        this.add(getJPanelvarname(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
