package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Queue;

/**
 * <p>
 * QueueDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:18 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueueDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class QueueDataPanel extends SimpleDataObjectPanel{
	protected Queue dataObject;
	//protected QueueChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public QueueDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getQueueResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getQueueResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/QueueResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new QueueCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldqueuename,		
			fStringTextFieldoptions,		
			fStringTextFielduRL,		
			fStringTextFieldannounceoverride,		
			fStringTextFieldtimeout,		
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
		this.setSize(400,(5)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(5); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelqueuename(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
        this.add(getJPaneluRL(), null); // Generated
        this.add(getJPanelannounceoverride(), null); // Generated
        this.add(getJPaneltimeout(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldqueuename.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoptions.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielduRL.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldannounceoverride.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtimeout.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldqueuename.setValue(dataObject.getQueuename());
        fStringTextFieldoptions.setValue(dataObject.getOptions());
        fStringTextFielduRL.setValue(dataObject.getURL());
        fStringTextFieldannounceoverride.setValue(dataObject.getAnnounceoverride());
        fStringTextFieldtimeout.setValue(dataObject.getTimeout());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setQueuename(fStringTextFieldqueuename.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
        dataObject.setURL(fStringTextFielduRL.getValue());
        dataObject.setAnnounceoverride(fStringTextFieldannounceoverride.getValue());
        dataObject.setTimeout(fStringTextFieldtimeout.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Queue
	 */
	public void setDataObject(Object aQueue) {
	    //abstractdataObject = (AbstractConfigObject) aQueue;
		setDataObject((Queue) aQueue);
		//dataObject = aQueue;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Queue
	 */
	public void setDataObject(Queue aQueue) {
	    //abstractdataObject = (AbstractConfigObject) aQueue;
		dataObject = aQueue;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldqueuename;
    protected javax.swing.JLabel fJLabelqueuename;
	protected javax.swing.JPanel fJPanelqueuename;
    protected StringTextField fStringTextFieldoptions;
    protected javax.swing.JLabel fJLabeloptions;
	protected javax.swing.JPanel fJPaneloptions;
    protected StringTextField fStringTextFielduRL;
    protected javax.swing.JLabel fJLabeluRL;
	protected javax.swing.JPanel fJPaneluRL;
    protected StringTextField fStringTextFieldannounceoverride;
    protected javax.swing.JLabel fJLabelannounceoverride;
	protected javax.swing.JPanel fJPanelannounceoverride;
    protected StringTextField fStringTextFieldtimeout;
    protected javax.swing.JLabel fJLabeltimeout;
	protected javax.swing.JPanel fJPaneltimeout;
    

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
//start DB field options
    /**
     * This method initializes fStringTextFieldoptions
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldoptions() {
        if (fStringTextFieldoptions == null) {
            try {
                fStringTextFieldoptions = new StringTextField(); // Generated
                fStringTextFieldoptions.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldoptions;
    }
        
    /**
     * This method initializes  fJLabeloptions
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeloptions() {
        if (fJLabeloptions == null) {
            try {
                 fJLabeloptions = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeloptions.setText(resBundel.getString("res_stroptionsDisplayName")); // Generated
                 fJLabeloptions.setToolTipText(resBundel.getString("res_stroptionsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeloptions;
    }


    /**
     * This method initializes  fJPaneloptions
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneloptions() {
        if (fJPaneloptions == null) {
            try {
                fJPaneloptions = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneloptions.setLayout(layFlowLayout); // Generated
                fJPaneloptions.add(getJLabeloptions(), null); // Generated
                fJPaneloptions.add(getStringTextFieldoptions(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneloptions;
    }
//end DB field options
//start DB field uRL
    /**
     * This method initializes fStringTextFielduRL
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielduRL() {
        if (fStringTextFielduRL == null) {
            try {
                fStringTextFielduRL = new StringTextField(); // Generated
                fStringTextFielduRL.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielduRL;
    }
        
    /**
     * This method initializes  fJLabeluRL
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeluRL() {
        if (fJLabeluRL == null) {
            try {
                 fJLabeluRL = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeluRL.setText(resBundel.getString("res_struRLDisplayName")); // Generated
                 fJLabeluRL.setToolTipText(resBundel.getString("res_struRLDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeluRL;
    }


    /**
     * This method initializes  fJPaneluRL
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneluRL() {
        if (fJPaneluRL == null) {
            try {
                fJPaneluRL = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneluRL.setLayout(layFlowLayout); // Generated
                fJPaneluRL.add(getJLabeluRL(), null); // Generated
                fJPaneluRL.add(getStringTextFielduRL(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneluRL;
    }
//end DB field uRL
//start DB field announceoverride
    /**
     * This method initializes fStringTextFieldannounceoverride
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldannounceoverride() {
        if (fStringTextFieldannounceoverride == null) {
            try {
                fStringTextFieldannounceoverride = new StringTextField(); // Generated
                fStringTextFieldannounceoverride.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldannounceoverride;
    }
        
    /**
     * This method initializes  fJLabelannounceoverride
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelannounceoverride() {
        if (fJLabelannounceoverride == null) {
            try {
                 fJLabelannounceoverride = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelannounceoverride.setText(resBundel.getString("res_strannounceoverrideDisplayName")); // Generated
                 fJLabelannounceoverride.setToolTipText(resBundel.getString("res_strannounceoverrideDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelannounceoverride;
    }


    /**
     * This method initializes  fJPanelannounceoverride
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelannounceoverride() {
        if (fJPanelannounceoverride == null) {
            try {
                fJPanelannounceoverride = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelannounceoverride.setLayout(layFlowLayout); // Generated
                fJPanelannounceoverride.add(getJLabelannounceoverride(), null); // Generated
                fJPanelannounceoverride.add(getStringTextFieldannounceoverride(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelannounceoverride;
    }
//end DB field announceoverride
//start DB field timeout
    /**
     * This method initializes fStringTextFieldtimeout
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtimeout() {
        if (fStringTextFieldtimeout == null) {
            try {
                fStringTextFieldtimeout = new StringTextField(); // Generated
                fStringTextFieldtimeout.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtimeout;
    }
        
    /**
     * This method initializes  fJLabeltimeout
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltimeout() {
        if (fJLabeltimeout == null) {
            try {
                 fJLabeltimeout = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltimeout.setText(resBundel.getString("res_strtimeoutDisplayName")); // Generated
                 fJLabeltimeout.setToolTipText(resBundel.getString("res_strtimeoutDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltimeout;
    }


    /**
     * This method initializes  fJPaneltimeout
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltimeout() {
        if (fJPaneltimeout == null) {
            try {
                fJPaneltimeout = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltimeout.setLayout(layFlowLayout); // Generated
                fJPaneltimeout.add(getJLabeltimeout(), null); // Generated
                fJPaneltimeout.add(getStringTextFieldtimeout(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltimeout;
    }
//end DB field timeout

}

	