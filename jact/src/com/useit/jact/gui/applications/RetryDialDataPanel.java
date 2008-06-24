package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.RetryDial;

/**
 * <p>
 * RetryDialDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:40 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RetryDialDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class RetryDialDataPanel extends SimpleDataObjectPanel{
	protected RetryDial dataObject;
	//protected RetryDialChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public RetryDialDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getRetryDialResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getRetryDialResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/RetryDialResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new RetryDialCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldannounce,		
			fStringTextFieldsleep,		
			fStringTextFieldloops,		
			fStringTextFieldtechnology,		
			fStringTextFieldresource,		
			fStringTextFieldtechnology2,		
			fStringTextFieldresource2,		
			fStringTextFieldtimeout,		
			fStringTextFieldoptions,		
			fStringTextFielduRL,		
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
		this.setSize(400,(10)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(10); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelannounce(), null); // Generated
        this.add(getJPanelsleep(), null); // Generated
        this.add(getJPanelloops(), null); // Generated
        this.add(getJPaneltechnology(), null); // Generated
        this.add(getJPanelresource(), null); // Generated
        this.add(getJPaneltechnology2(), null); // Generated
        this.add(getJPanelresource2(), null); // Generated
        this.add(getJPaneltimeout(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
        this.add(getJPaneluRL(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldannounce.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldsleep.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldloops.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtechnology.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldresource.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtechnology2.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldresource2.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtimeout.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoptions.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielduRL.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldannounce.setValue(dataObject.getAnnounce());
        fStringTextFieldsleep.setValue(dataObject.getSleep());
        fStringTextFieldloops.setValue(dataObject.getLoops());
        fStringTextFieldtechnology.setValue(dataObject.getTechnology());
        fStringTextFieldresource.setValue(dataObject.getResource());
        fStringTextFieldtechnology2.setValue(dataObject.getTechnology2());
        fStringTextFieldresource2.setValue(dataObject.getResource2());
        fStringTextFieldtimeout.setValue(dataObject.getTimeout());
        fStringTextFieldoptions.setValue(dataObject.getOptions());
        fStringTextFielduRL.setValue(dataObject.getURL());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setAnnounce(fStringTextFieldannounce.getValue());
        dataObject.setSleep(fStringTextFieldsleep.getValue());
        dataObject.setLoops(fStringTextFieldloops.getValue());
        dataObject.setTechnology(fStringTextFieldtechnology.getValue());
        dataObject.setResource(fStringTextFieldresource.getValue());
        dataObject.setTechnology2(fStringTextFieldtechnology2.getValue());
        dataObject.setResource2(fStringTextFieldresource2.getValue());
        dataObject.setTimeout(fStringTextFieldtimeout.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
        dataObject.setURL(fStringTextFielduRL.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param RetryDial
	 */
	public void setDataObject(Object aRetryDial) {
	    //abstractdataObject = (AbstractConfigObject) aRetryDial;
		setDataObject((RetryDial) aRetryDial);
		//dataObject = aRetryDial;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param RetryDial
	 */
	public void setDataObject(RetryDial aRetryDial) {
	    //abstractdataObject = (AbstractConfigObject) aRetryDial;
		dataObject = aRetryDial;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldannounce;
    protected javax.swing.JLabel fJLabelannounce;
	protected javax.swing.JPanel fJPanelannounce;
    protected StringTextField fStringTextFieldsleep;
    protected javax.swing.JLabel fJLabelsleep;
	protected javax.swing.JPanel fJPanelsleep;
    protected StringTextField fStringTextFieldloops;
    protected javax.swing.JLabel fJLabelloops;
	protected javax.swing.JPanel fJPanelloops;
    protected StringTextField fStringTextFieldtechnology;
    protected javax.swing.JLabel fJLabeltechnology;
	protected javax.swing.JPanel fJPaneltechnology;
    protected StringTextField fStringTextFieldresource;
    protected javax.swing.JLabel fJLabelresource;
	protected javax.swing.JPanel fJPanelresource;
    protected StringTextField fStringTextFieldtechnology2;
    protected javax.swing.JLabel fJLabeltechnology2;
	protected javax.swing.JPanel fJPaneltechnology2;
    protected StringTextField fStringTextFieldresource2;
    protected javax.swing.JLabel fJLabelresource2;
	protected javax.swing.JPanel fJPanelresource2;
    protected StringTextField fStringTextFieldtimeout;
    protected javax.swing.JLabel fJLabeltimeout;
	protected javax.swing.JPanel fJPaneltimeout;
    protected StringTextField fStringTextFieldoptions;
    protected javax.swing.JLabel fJLabeloptions;
	protected javax.swing.JPanel fJPaneloptions;
    protected StringTextField fStringTextFielduRL;
    protected javax.swing.JLabel fJLabeluRL;
	protected javax.swing.JPanel fJPaneluRL;
    

//start DB field announce
    /**
     * This method initializes fStringTextFieldannounce
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldannounce() {
        if (fStringTextFieldannounce == null) {
            try {
                fStringTextFieldannounce = new StringTextField(); // Generated
                fStringTextFieldannounce.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldannounce;
    }
        
    /**
     * This method initializes  fJLabelannounce
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelannounce() {
        if (fJLabelannounce == null) {
            try {
                 fJLabelannounce = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelannounce.setText(resBundel.getString("res_strannounceDisplayName")); // Generated
                 fJLabelannounce.setToolTipText(resBundel.getString("res_strannounceDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelannounce;
    }


    /**
     * This method initializes  fJPanelannounce
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelannounce() {
        if (fJPanelannounce == null) {
            try {
                fJPanelannounce = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelannounce.setLayout(layFlowLayout); // Generated
                fJPanelannounce.add(getJLabelannounce(), null); // Generated
                fJPanelannounce.add(getStringTextFieldannounce(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelannounce;
    }
//end DB field announce
//start DB field sleep
    /**
     * This method initializes fStringTextFieldsleep
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsleep() {
        if (fStringTextFieldsleep == null) {
            try {
                fStringTextFieldsleep = new StringTextField(); // Generated
                fStringTextFieldsleep.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsleep;
    }
        
    /**
     * This method initializes  fJLabelsleep
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsleep() {
        if (fJLabelsleep == null) {
            try {
                 fJLabelsleep = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelsleep.setText(resBundel.getString("res_strsleepDisplayName")); // Generated
                 fJLabelsleep.setToolTipText(resBundel.getString("res_strsleepDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelsleep;
    }


    /**
     * This method initializes  fJPanelsleep
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsleep() {
        if (fJPanelsleep == null) {
            try {
                fJPanelsleep = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsleep.setLayout(layFlowLayout); // Generated
                fJPanelsleep.add(getJLabelsleep(), null); // Generated
                fJPanelsleep.add(getStringTextFieldsleep(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsleep;
    }
//end DB field sleep
//start DB field loops
    /**
     * This method initializes fStringTextFieldloops
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldloops() {
        if (fStringTextFieldloops == null) {
            try {
                fStringTextFieldloops = new StringTextField(); // Generated
                fStringTextFieldloops.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldloops;
    }
        
    /**
     * This method initializes  fJLabelloops
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelloops() {
        if (fJLabelloops == null) {
            try {
                 fJLabelloops = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelloops.setText(resBundel.getString("res_strloopsDisplayName")); // Generated
                 fJLabelloops.setToolTipText(resBundel.getString("res_strloopsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelloops;
    }


    /**
     * This method initializes  fJPanelloops
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelloops() {
        if (fJPanelloops == null) {
            try {
                fJPanelloops = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelloops.setLayout(layFlowLayout); // Generated
                fJPanelloops.add(getJLabelloops(), null); // Generated
                fJPanelloops.add(getStringTextFieldloops(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelloops;
    }
//end DB field loops
//start DB field technology
    /**
     * This method initializes fStringTextFieldtechnology
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtechnology() {
        if (fStringTextFieldtechnology == null) {
            try {
                fStringTextFieldtechnology = new StringTextField(); // Generated
                fStringTextFieldtechnology.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtechnology;
    }
        
    /**
     * This method initializes  fJLabeltechnology
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltechnology() {
        if (fJLabeltechnology == null) {
            try {
                 fJLabeltechnology = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltechnology.setText(resBundel.getString("res_strtechnologyDisplayName")); // Generated
                 fJLabeltechnology.setToolTipText(resBundel.getString("res_strtechnologyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltechnology;
    }


    /**
     * This method initializes  fJPaneltechnology
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltechnology() {
        if (fJPaneltechnology == null) {
            try {
                fJPaneltechnology = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltechnology.setLayout(layFlowLayout); // Generated
                fJPaneltechnology.add(getJLabeltechnology(), null); // Generated
                fJPaneltechnology.add(getStringTextFieldtechnology(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltechnology;
    }
//end DB field technology
//start DB field resource
    /**
     * This method initializes fStringTextFieldresource
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldresource() {
        if (fStringTextFieldresource == null) {
            try {
                fStringTextFieldresource = new StringTextField(); // Generated
                fStringTextFieldresource.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldresource;
    }
        
    /**
     * This method initializes  fJLabelresource
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelresource() {
        if (fJLabelresource == null) {
            try {
                 fJLabelresource = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelresource.setText(resBundel.getString("res_strresourceDisplayName")); // Generated
                 fJLabelresource.setToolTipText(resBundel.getString("res_strresourceDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelresource;
    }


    /**
     * This method initializes  fJPanelresource
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelresource() {
        if (fJPanelresource == null) {
            try {
                fJPanelresource = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelresource.setLayout(layFlowLayout); // Generated
                fJPanelresource.add(getJLabelresource(), null); // Generated
                fJPanelresource.add(getStringTextFieldresource(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelresource;
    }
//end DB field resource
//start DB field technology2
    /**
     * This method initializes fStringTextFieldtechnology2
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtechnology2() {
        if (fStringTextFieldtechnology2 == null) {
            try {
                fStringTextFieldtechnology2 = new StringTextField(); // Generated
                fStringTextFieldtechnology2.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtechnology2;
    }
        
    /**
     * This method initializes  fJLabeltechnology2
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltechnology2() {
        if (fJLabeltechnology2 == null) {
            try {
                 fJLabeltechnology2 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltechnology2.setText(resBundel.getString("res_strtechnology2DisplayName")); // Generated
                 fJLabeltechnology2.setToolTipText(resBundel.getString("res_strtechnology2Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltechnology2;
    }


    /**
     * This method initializes  fJPaneltechnology2
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltechnology2() {
        if (fJPaneltechnology2 == null) {
            try {
                fJPaneltechnology2 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltechnology2.setLayout(layFlowLayout); // Generated
                fJPaneltechnology2.add(getJLabeltechnology2(), null); // Generated
                fJPaneltechnology2.add(getStringTextFieldtechnology2(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltechnology2;
    }
//end DB field technology2
//start DB field resource2
    /**
     * This method initializes fStringTextFieldresource2
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldresource2() {
        if (fStringTextFieldresource2 == null) {
            try {
                fStringTextFieldresource2 = new StringTextField(); // Generated
                fStringTextFieldresource2.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldresource2;
    }
        
    /**
     * This method initializes  fJLabelresource2
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelresource2() {
        if (fJLabelresource2 == null) {
            try {
                 fJLabelresource2 = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelresource2.setText(resBundel.getString("res_strresource2DisplayName")); // Generated
                 fJLabelresource2.setToolTipText(resBundel.getString("res_strresource2Description")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelresource2;
    }


    /**
     * This method initializes  fJPanelresource2
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelresource2() {
        if (fJPanelresource2 == null) {
            try {
                fJPanelresource2 = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelresource2.setLayout(layFlowLayout); // Generated
                fJPanelresource2.add(getJLabelresource2(), null); // Generated
                fJPanelresource2.add(getStringTextFieldresource2(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelresource2;
    }
//end DB field resource2
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

}

	