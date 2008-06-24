package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.MeetMeAdmin;

/**
 * <p>
 * MeetMeAdminDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:30 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetMeAdminDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class MeetMeAdminDataPanel extends SimpleDataObjectPanel{
	protected MeetMeAdmin dataObject;
	//protected MeetMeAdminChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MeetMeAdminDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMeetMeAdminResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMeetMeAdminResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MeetMeAdminResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MeetMeAdminCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldconfno,		
			fStringTextFieldcommand,		
			fStringTextFielduser,		
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
		this.setSize(400,(3)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelconfno(), null); // Generated
        this.add(getJPanelcommand(), null); // Generated
        this.add(getJPaneluser(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldconfno.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcommand.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielduser.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldconfno.setValue(dataObject.getConfno());
        fStringTextFieldcommand.setValue(dataObject.getCommand());
        fStringTextFielduser.setValue(dataObject.getUser());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setConfno(fStringTextFieldconfno.getValue());
        dataObject.setCommand(fStringTextFieldcommand.getValue());
        dataObject.setUser(fStringTextFielduser.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param MeetMeAdmin
	 */
	public void setDataObject(Object aMeetMeAdmin) {
	    //abstractdataObject = (AbstractConfigObject) aMeetMeAdmin;
		setDataObject((MeetMeAdmin) aMeetMeAdmin);
		//dataObject = aMeetMeAdmin;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param MeetMeAdmin
	 */
	public void setDataObject(MeetMeAdmin aMeetMeAdmin) {
	    //abstractdataObject = (AbstractConfigObject) aMeetMeAdmin;
		dataObject = aMeetMeAdmin;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldconfno;
    protected javax.swing.JLabel fJLabelconfno;
	protected javax.swing.JPanel fJPanelconfno;
    protected StringTextField fStringTextFieldcommand;
    protected javax.swing.JLabel fJLabelcommand;
	protected javax.swing.JPanel fJPanelcommand;
    protected StringTextField fStringTextFielduser;
    protected javax.swing.JLabel fJLabeluser;
	protected javax.swing.JPanel fJPaneluser;
    

//start DB field confno
    /**
     * This method initializes fStringTextFieldconfno
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldconfno() {
        if (fStringTextFieldconfno == null) {
            try {
                fStringTextFieldconfno = new StringTextField(); // Generated
                fStringTextFieldconfno.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldconfno;
    }
        
    /**
     * This method initializes  fJLabelconfno
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelconfno() {
        if (fJLabelconfno == null) {
            try {
                 fJLabelconfno = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelconfno.setText(resBundel.getString("res_strconfnoDisplayName")); // Generated
                 fJLabelconfno.setToolTipText(resBundel.getString("res_strconfnoDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelconfno;
    }


    /**
     * This method initializes  fJPanelconfno
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelconfno() {
        if (fJPanelconfno == null) {
            try {
                fJPanelconfno = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelconfno.setLayout(layFlowLayout); // Generated
                fJPanelconfno.add(getJLabelconfno(), null); // Generated
                fJPanelconfno.add(getStringTextFieldconfno(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelconfno;
    }
//end DB field confno
//start DB field command
    /**
     * This method initializes fStringTextFieldcommand
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcommand() {
        if (fStringTextFieldcommand == null) {
            try {
                fStringTextFieldcommand = new StringTextField(); // Generated
                fStringTextFieldcommand.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcommand;
    }
        
    /**
     * This method initializes  fJLabelcommand
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcommand() {
        if (fJLabelcommand == null) {
            try {
                 fJLabelcommand = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcommand.setText(resBundel.getString("res_strcommandDisplayName")); // Generated
                 fJLabelcommand.setToolTipText(resBundel.getString("res_strcommandDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcommand;
    }


    /**
     * This method initializes  fJPanelcommand
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcommand() {
        if (fJPanelcommand == null) {
            try {
                fJPanelcommand = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcommand.setLayout(layFlowLayout); // Generated
                fJPanelcommand.add(getJLabelcommand(), null); // Generated
                fJPanelcommand.add(getStringTextFieldcommand(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcommand;
    }
//end DB field command
//start DB field user
    /**
     * This method initializes fStringTextFielduser
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielduser() {
        if (fStringTextFielduser == null) {
            try {
                fStringTextFielduser = new StringTextField(); // Generated
                fStringTextFielduser.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielduser;
    }
        
    /**
     * This method initializes  fJLabeluser
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeluser() {
        if (fJLabeluser == null) {
            try {
                 fJLabeluser = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeluser.setText(resBundel.getString("res_struserDisplayName")); // Generated
                 fJLabeluser.setToolTipText(resBundel.getString("res_struserDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeluser;
    }


    /**
     * This method initializes  fJPaneluser
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneluser() {
        if (fJPaneluser == null) {
            try {
                fJPaneluser = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneluser.setLayout(layFlowLayout); // Generated
                fJPaneluser.add(getJLabeluser(), null); // Generated
                fJPaneluser.add(getStringTextFielduser(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneluser;
    }
//end DB field user

}

	