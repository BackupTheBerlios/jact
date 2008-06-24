package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

/**
 * <p>
 * MailboxExistsDataPanelImpl,
 * das wirkliche panel, kann �berarbeitet und angepasst werden.
 * </p>
 * Created : Mon Jul 10 18:40:47 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MailboxExistsDataPanelImpl.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class MailboxExistsDataPanelImpl extends MailboxExistsDataPanel{

	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MailboxExistsDataPanelImpl() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMailboxExistsResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMailboxExistsResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MailboxExistsResFile");
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
        this.add(getJPanelmailbox(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
	}


//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

}
