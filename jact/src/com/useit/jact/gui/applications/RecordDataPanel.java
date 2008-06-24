package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Record;

/**
 * <p>
 * RecordDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:19 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RecordDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class RecordDataPanel extends SimpleDataObjectPanel{
	protected Record dataObject;
	//protected RecordChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public RecordDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getRecordResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getRecordResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/RecordResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new RecordCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldfilename,		
			fStringTextFieldformat,		
			fStringTextFieldsilence,		
			fStringTextFieldmaxduration,		
			fStringTextFieldoptions,		
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
        this.add(getJPanelfilename(), null); // Generated
        this.add(getJPanelformat(), null); // Generated
        this.add(getJPanelsilence(), null); // Generated
        this.add(getJPanelmaxduration(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldfilename.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldformat.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldsilence.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmaxduration.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoptions.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldfilename.setValue(dataObject.getFilename());
        fStringTextFieldformat.setValue(dataObject.getFormat());
        fStringTextFieldsilence.setValue(dataObject.getSilence());
        fStringTextFieldmaxduration.setValue(dataObject.getMaxduration());
        fStringTextFieldoptions.setValue(dataObject.getOptions());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFilename(fStringTextFieldfilename.getValue());
        dataObject.setFormat(fStringTextFieldformat.getValue());
        dataObject.setSilence(fStringTextFieldsilence.getValue());
        dataObject.setMaxduration(fStringTextFieldmaxduration.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Record
	 */
	public void setDataObject(Object aRecord) {
	    //abstractdataObject = (AbstractConfigObject) aRecord;
		setDataObject((Record) aRecord);
		//dataObject = aRecord;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Record
	 */
	public void setDataObject(Record aRecord) {
	    //abstractdataObject = (AbstractConfigObject) aRecord;
		dataObject = aRecord;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldfilename;
    protected javax.swing.JLabel fJLabelfilename;
	protected javax.swing.JPanel fJPanelfilename;
    protected StringTextField fStringTextFieldformat;
    protected javax.swing.JLabel fJLabelformat;
	protected javax.swing.JPanel fJPanelformat;
    protected StringTextField fStringTextFieldsilence;
    protected javax.swing.JLabel fJLabelsilence;
	protected javax.swing.JPanel fJPanelsilence;
    protected StringTextField fStringTextFieldmaxduration;
    protected javax.swing.JLabel fJLabelmaxduration;
	protected javax.swing.JPanel fJPanelmaxduration;
    protected StringTextField fStringTextFieldoptions;
    protected javax.swing.JLabel fJLabeloptions;
	protected javax.swing.JPanel fJPaneloptions;
    

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
//start DB field format
    /**
     * This method initializes fStringTextFieldformat
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldformat() {
        if (fStringTextFieldformat == null) {
            try {
                fStringTextFieldformat = new StringTextField(); // Generated
                fStringTextFieldformat.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldformat;
    }
        
    /**
     * This method initializes  fJLabelformat
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelformat() {
        if (fJLabelformat == null) {
            try {
                 fJLabelformat = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelformat.setText(resBundel.getString("res_strformatDisplayName")); // Generated
                 fJLabelformat.setToolTipText(resBundel.getString("res_strformatDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelformat;
    }


    /**
     * This method initializes  fJPanelformat
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelformat() {
        if (fJPanelformat == null) {
            try {
                fJPanelformat = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelformat.setLayout(layFlowLayout); // Generated
                fJPanelformat.add(getJLabelformat(), null); // Generated
                fJPanelformat.add(getStringTextFieldformat(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelformat;
    }
//end DB field format
//start DB field silence
    /**
     * This method initializes fStringTextFieldsilence
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsilence() {
        if (fStringTextFieldsilence == null) {
            try {
                fStringTextFieldsilence = new StringTextField(); // Generated
                fStringTextFieldsilence.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsilence;
    }
        
    /**
     * This method initializes  fJLabelsilence
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsilence() {
        if (fJLabelsilence == null) {
            try {
                 fJLabelsilence = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelsilence.setText(resBundel.getString("res_strsilenceDisplayName")); // Generated
                 fJLabelsilence.setToolTipText(resBundel.getString("res_strsilenceDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelsilence;
    }


    /**
     * This method initializes  fJPanelsilence
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsilence() {
        if (fJPanelsilence == null) {
            try {
                fJPanelsilence = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsilence.setLayout(layFlowLayout); // Generated
                fJPanelsilence.add(getJLabelsilence(), null); // Generated
                fJPanelsilence.add(getStringTextFieldsilence(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsilence;
    }
//end DB field silence
//start DB field maxduration
    /**
     * This method initializes fStringTextFieldmaxduration
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmaxduration() {
        if (fStringTextFieldmaxduration == null) {
            try {
                fStringTextFieldmaxduration = new StringTextField(); // Generated
                fStringTextFieldmaxduration.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmaxduration;
    }
        
    /**
     * This method initializes  fJLabelmaxduration
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmaxduration() {
        if (fJLabelmaxduration == null) {
            try {
                 fJLabelmaxduration = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmaxduration.setText(resBundel.getString("res_strmaxdurationDisplayName")); // Generated
                 fJLabelmaxduration.setToolTipText(resBundel.getString("res_strmaxdurationDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmaxduration;
    }


    /**
     * This method initializes  fJPanelmaxduration
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmaxduration() {
        if (fJPanelmaxduration == null) {
            try {
                fJPanelmaxduration = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmaxduration.setLayout(layFlowLayout); // Generated
                fJPanelmaxduration.add(getJLabelmaxduration(), null); // Generated
                fJPanelmaxduration.add(getStringTextFieldmaxduration(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmaxduration;
    }
//end DB field maxduration
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

}

	