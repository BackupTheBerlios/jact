package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.UserEvent;

/**
 * <p>
 * UserEventDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:28 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: UserEventDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class UserEventDataPanel extends SimpleDataObjectPanel{
	protected UserEvent dataObject;
	//protected UserEventChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public UserEventDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getUserEventResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getUserEventResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/UserEventResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new UserEventCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldeventname,		
			fStringTextFieldbody,		
		};
		dataChecker.initChecker(array);
	}

*/

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(400,(2)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneleventname(), null); // Generated
        this.add(getJPanelbody(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldeventname.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldbody.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldeventname.setValue(dataObject.getEventname());
        fStringTextFieldbody.setValue(dataObject.getBody());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setEventname(fStringTextFieldeventname.getValue());
        dataObject.setBody(fStringTextFieldbody.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param UserEvent
	 */
	public void setDataObject(Object aUserEvent) {
	    //abstractdataObject = (AbstractConfigObject) aUserEvent;
		setDataObject((UserEvent) aUserEvent);
		//dataObject = aUserEvent;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param UserEvent
	 */
	public void setDataObject(UserEvent aUserEvent) {
	    //abstractdataObject = (AbstractConfigObject) aUserEvent;
		dataObject = aUserEvent;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldeventname;
    protected javax.swing.JLabel fJLabeleventname;
	protected javax.swing.JPanel fJPaneleventname;
    protected StringTextField fStringTextFieldbody;
    protected javax.swing.JLabel fJLabelbody;
	protected javax.swing.JPanel fJPanelbody;
    

//start DB field eventname
    /**
     * This method initializes fStringTextFieldeventname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldeventname() {
        if (fStringTextFieldeventname == null) {
            try {
                fStringTextFieldeventname = new StringTextField(); // Generated
                fStringTextFieldeventname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldeventname;
    }
        
    /**
     * This method initializes  fJLabeleventname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeleventname() {
        if (fJLabeleventname == null) {
            try {
                 fJLabeleventname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeleventname.setText(resBundel.getString("res_streventnameDisplayName")); // Generated
                 fJLabeleventname.setToolTipText(resBundel.getString("res_streventnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeleventname;
    }


    /**
     * This method initializes  fJPaneleventname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneleventname() {
        if (fJPaneleventname == null) {
            try {
                fJPaneleventname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneleventname.setLayout(layFlowLayout); // Generated
                fJPaneleventname.add(getJLabeleventname(), null); // Generated
                fJPaneleventname.add(getStringTextFieldeventname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneleventname;
    }
//end DB field eventname
//start DB field body
    /**
     * This method initializes fStringTextFieldbody
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldbody() {
        if (fStringTextFieldbody == null) {
            try {
                fStringTextFieldbody = new StringTextField(); // Generated
                fStringTextFieldbody.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldbody;
    }
        
    /**
     * This method initializes  fJLabelbody
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelbody() {
        if (fJLabelbody == null) {
            try {
                 fJLabelbody = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelbody.setText(resBundel.getString("res_strbodyDisplayName")); // Generated
                 fJLabelbody.setToolTipText(resBundel.getString("res_strbodyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelbody;
    }


    /**
     * This method initializes  fJPanelbody
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelbody() {
        if (fJPanelbody == null) {
            try {
                fJPanelbody = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelbody.setLayout(layFlowLayout); // Generated
                fJPanelbody.add(getJLabelbody(), null); // Generated
                fJPanelbody.add(getStringTextFieldbody(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelbody;
    }
//end DB field body

}

	