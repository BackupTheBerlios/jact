package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Dial;

/**
 * <p>
 * DialDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:43 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DialDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class DialDataPanel extends SimpleDataObjectPanel{
	protected Dial dataObject;
	//protected DialChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public DialDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getDialResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getDialResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/DialResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new DialCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
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
		this.setSize(400,(7)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(7); // Generated
        this.setLayout(layGridLayout); // Generated
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
	 * @param Dial
	 */
	public void setDataObject(Object aDial) {
	    //abstractdataObject = (AbstractConfigObject) aDial;
		setDataObject((Dial) aDial);
		//dataObject = aDial;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Dial
	 */
	public void setDataObject(Dial aDial) {
	    //abstractdataObject = (AbstractConfigObject) aDial;
		dataObject = aDial;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

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

	