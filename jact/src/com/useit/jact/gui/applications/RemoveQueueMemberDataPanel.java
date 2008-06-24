package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.RemoveQueueMember;

/**
 * <p>
 * RemoveQueueMemberDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RemoveQueueMemberDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class RemoveQueueMemberDataPanel extends SimpleDataObjectPanel{
	protected RemoveQueueMember dataObject;
	//protected RemoveQueueMemberChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public RemoveQueueMemberDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getRemoveQueueMemberResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getRemoveQueueMemberResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/RemoveQueueMemberResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new RemoveQueueMemberCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldqueuename,		
			fStringTextFieldinterface_,		
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
        this.add(getJPanelqueuename(), null); // Generated
        this.add(getJPanelinterface_(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldqueuename.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldinterface_.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldqueuename.setValue(dataObject.getQueuename());
        fStringTextFieldinterface_.setValue(dataObject.getInterface_());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setQueuename(fStringTextFieldqueuename.getValue());
        dataObject.setInterface_(fStringTextFieldinterface_.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param RemoveQueueMember
	 */
	public void setDataObject(Object aRemoveQueueMember) {
	    //abstractdataObject = (AbstractConfigObject) aRemoveQueueMember;
		setDataObject((RemoveQueueMember) aRemoveQueueMember);
		//dataObject = aRemoveQueueMember;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param RemoveQueueMember
	 */
	public void setDataObject(RemoveQueueMember aRemoveQueueMember) {
	    //abstractdataObject = (AbstractConfigObject) aRemoveQueueMember;
		dataObject = aRemoveQueueMember;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldqueuename;
    protected javax.swing.JLabel fJLabelqueuename;
	protected javax.swing.JPanel fJPanelqueuename;
    protected StringTextField fStringTextFieldinterface_;
    protected javax.swing.JLabel fJLabelinterface_;
	protected javax.swing.JPanel fJPanelinterface_;
    

//start DB field queuename
    /**
     * This method initializes fStringTextFieldqueuename
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldqueuename() {
        if (fStringTextFieldqueuename == null) {
            try {
                fStringTextFieldqueuename = new StringTextField(); // Generated
                fStringTextFieldqueuename.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldqueuename;
    }
        
    /**
     * This method initializes  fJLabelqueuename
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelqueuename() {
        if (fJLabelqueuename == null) {
            try {
                 fJLabelqueuename = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelqueuename.setText(resBundel.getString("res_strqueuenameDisplayName")); // Generated
                 fJLabelqueuename.setToolTipText(resBundel.getString("res_strqueuenameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelqueuename;
    }


    /**
     * This method initializes  fJPanelqueuename
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelqueuename() {
        if (fJPanelqueuename == null) {
            try {
                fJPanelqueuename = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelqueuename.setLayout(layFlowLayout); // Generated
                fJPanelqueuename.add(getJLabelqueuename(), null); // Generated
                fJPanelqueuename.add(getStringTextFieldqueuename(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelqueuename;
    }
//end DB field queuename
//start DB field interface_
    /**
     * This method initializes fStringTextFieldinterface_
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldinterface_() {
        if (fStringTextFieldinterface_ == null) {
            try {
                fStringTextFieldinterface_ = new StringTextField(); // Generated
                fStringTextFieldinterface_.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldinterface_;
    }
        
    /**
     * This method initializes  fJLabelinterface_
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelinterface_() {
        if (fJLabelinterface_ == null) {
            try {
                 fJLabelinterface_ = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelinterface_.setText(resBundel.getString("res_strinterface_DisplayName")); // Generated
                 fJLabelinterface_.setToolTipText(resBundel.getString("res_strinterface_Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelinterface_;
    }


    /**
     * This method initializes  fJPanelinterface_
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelinterface_() {
        if (fJPanelinterface_ == null) {
            try {
                fJPanelinterface_ = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelinterface_.setLayout(layFlowLayout); // Generated
                fJPanelinterface_.add(getJLabelinterface_(), null); // Generated
                fJPanelinterface_.add(getStringTextFieldinterface_(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelinterface_;
    }
//end DB field interface_

}

	