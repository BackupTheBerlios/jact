package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Read;

/**
 * <p>
 * ReadDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:48 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ReadDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class ReadDataPanel extends SimpleDataObjectPanel{
	protected Read dataObject;
	//protected ReadChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ReadDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getReadResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getReadResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ReadResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ReadCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldvariable,		
			fStringTextFieldfilename,		
			fStringTextFieldmaxdigits,		
			fStringTextFieldoption,		
			fStringTextFieldattempts,		
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
		this.setSize(400,(6)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(6); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelvariable(), null); // Generated
        this.add(getJPanelfilename(), null); // Generated
        this.add(getJPanelmaxdigits(), null); // Generated
        this.add(getJPaneloption(), null); // Generated
        this.add(getJPanelattempts(), null); // Generated
        this.add(getJPaneltimeout(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldvariable.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldfilename.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmaxdigits.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoption.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldattempts.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtimeout.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldvariable.setValue(dataObject.getVariable());
        fStringTextFieldfilename.setValue(dataObject.getFilename());
        fStringTextFieldmaxdigits.setValue(dataObject.getMaxdigits());
        fStringTextFieldoption.setValue(dataObject.getOption());
        fStringTextFieldattempts.setValue(dataObject.getAttempts());
        fStringTextFieldtimeout.setValue(dataObject.getTimeout());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setVariable(fStringTextFieldvariable.getValue());
        dataObject.setFilename(fStringTextFieldfilename.getValue());
        dataObject.setMaxdigits(fStringTextFieldmaxdigits.getValue());
        dataObject.setOption(fStringTextFieldoption.getValue());
        dataObject.setAttempts(fStringTextFieldattempts.getValue());
        dataObject.setTimeout(fStringTextFieldtimeout.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Read
	 */
	public void setDataObject(Object aRead) {
	    //abstractdataObject = (AbstractConfigObject) aRead;
		setDataObject((Read) aRead);
		//dataObject = aRead;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Read
	 */
	public void setDataObject(Read aRead) {
	    //abstractdataObject = (AbstractConfigObject) aRead;
		dataObject = aRead;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldvariable;
    protected javax.swing.JLabel fJLabelvariable;
	protected javax.swing.JPanel fJPanelvariable;
    protected StringTextField fStringTextFieldfilename;
    protected javax.swing.JLabel fJLabelfilename;
	protected javax.swing.JPanel fJPanelfilename;
    protected StringTextField fStringTextFieldmaxdigits;
    protected javax.swing.JLabel fJLabelmaxdigits;
	protected javax.swing.JPanel fJPanelmaxdigits;
    protected StringTextField fStringTextFieldoption;
    protected javax.swing.JLabel fJLabeloption;
	protected javax.swing.JPanel fJPaneloption;
    protected StringTextField fStringTextFieldattempts;
    protected javax.swing.JLabel fJLabelattempts;
	protected javax.swing.JPanel fJPanelattempts;
    protected StringTextField fStringTextFieldtimeout;
    protected javax.swing.JLabel fJLabeltimeout;
	protected javax.swing.JPanel fJPaneltimeout;
    

//start DB field variable
    /**
     * This method initializes fStringTextFieldvariable
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvariable() {
        if (fStringTextFieldvariable == null) {
            try {
                fStringTextFieldvariable = new StringTextField(); // Generated
                fStringTextFieldvariable.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvariable;
    }
        
    /**
     * This method initializes  fJLabelvariable
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvariable() {
        if (fJLabelvariable == null) {
            try {
                 fJLabelvariable = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvariable.setText(resBundel.getString("res_strvariableDisplayName")); // Generated
                 fJLabelvariable.setToolTipText(resBundel.getString("res_strvariableDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvariable;
    }


    /**
     * This method initializes  fJPanelvariable
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvariable() {
        if (fJPanelvariable == null) {
            try {
                fJPanelvariable = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvariable.setLayout(layFlowLayout); // Generated
                fJPanelvariable.add(getJLabelvariable(), null); // Generated
                fJPanelvariable.add(getStringTextFieldvariable(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvariable;
    }
//end DB field variable
//start DB field filename
    /**
     * This method initializes fStringTextFieldfilename
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfilename() {
        if (fStringTextFieldfilename == null) {
            try {
                fStringTextFieldfilename = new StringTextField(); // Generated
                fStringTextFieldfilename.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfilename;
    }
        
    /**
     * This method initializes  fJLabelfilename
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfilename() {
        if (fJLabelfilename == null) {
            try {
                 fJLabelfilename = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfilename.setText(resBundel.getString("res_strfilenameDisplayName")); // Generated
                 fJLabelfilename.setToolTipText(resBundel.getString("res_strfilenameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfilename;
    }


    /**
     * This method initializes  fJPanelfilename
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfilename() {
        if (fJPanelfilename == null) {
            try {
                fJPanelfilename = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfilename.setLayout(layFlowLayout); // Generated
                fJPanelfilename.add(getJLabelfilename(), null); // Generated
                fJPanelfilename.add(getStringTextFieldfilename(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfilename;
    }
//end DB field filename
//start DB field maxdigits
    /**
     * This method initializes fStringTextFieldmaxdigits
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmaxdigits() {
        if (fStringTextFieldmaxdigits == null) {
            try {
                fStringTextFieldmaxdigits = new StringTextField(); // Generated
                fStringTextFieldmaxdigits.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmaxdigits;
    }
        
    /**
     * This method initializes  fJLabelmaxdigits
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmaxdigits() {
        if (fJLabelmaxdigits == null) {
            try {
                 fJLabelmaxdigits = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmaxdigits.setText(resBundel.getString("res_strmaxdigitsDisplayName")); // Generated
                 fJLabelmaxdigits.setToolTipText(resBundel.getString("res_strmaxdigitsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmaxdigits;
    }


    /**
     * This method initializes  fJPanelmaxdigits
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmaxdigits() {
        if (fJPanelmaxdigits == null) {
            try {
                fJPanelmaxdigits = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmaxdigits.setLayout(layFlowLayout); // Generated
                fJPanelmaxdigits.add(getJLabelmaxdigits(), null); // Generated
                fJPanelmaxdigits.add(getStringTextFieldmaxdigits(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmaxdigits;
    }
//end DB field maxdigits
//start DB field option
    /**
     * This method initializes fStringTextFieldoption
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldoption() {
        if (fStringTextFieldoption == null) {
            try {
                fStringTextFieldoption = new StringTextField(); // Generated
                fStringTextFieldoption.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldoption;
    }
        
    /**
     * This method initializes  fJLabeloption
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeloption() {
        if (fJLabeloption == null) {
            try {
                 fJLabeloption = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeloption.setText(resBundel.getString("res_stroptionDisplayName")); // Generated
                 fJLabeloption.setToolTipText(resBundel.getString("res_stroptionDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeloption;
    }


    /**
     * This method initializes  fJPaneloption
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneloption() {
        if (fJPaneloption == null) {
            try {
                fJPaneloption = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneloption.setLayout(layFlowLayout); // Generated
                fJPaneloption.add(getJLabeloption(), null); // Generated
                fJPaneloption.add(getStringTextFieldoption(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneloption;
    }
//end DB field option
//start DB field attempts
    /**
     * This method initializes fStringTextFieldattempts
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldattempts() {
        if (fStringTextFieldattempts == null) {
            try {
                fStringTextFieldattempts = new StringTextField(); // Generated
                fStringTextFieldattempts.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldattempts;
    }
        
    /**
     * This method initializes  fJLabelattempts
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelattempts() {
        if (fJLabelattempts == null) {
            try {
                 fJLabelattempts = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelattempts.setText(resBundel.getString("res_strattemptsDisplayName")); // Generated
                 fJLabelattempts.setToolTipText(resBundel.getString("res_strattemptsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelattempts;
    }


    /**
     * This method initializes  fJPanelattempts
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelattempts() {
        if (fJPanelattempts == null) {
            try {
                fJPanelattempts = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelattempts.setLayout(layFlowLayout); // Generated
                fJPanelattempts.add(getJLabelattempts(), null); // Generated
                fJPanelattempts.add(getStringTextFieldattempts(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelattempts;
    }
//end DB field attempts
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

	