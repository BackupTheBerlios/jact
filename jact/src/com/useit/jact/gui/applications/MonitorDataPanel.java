package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Monitor;

/**
 * <p>
 * MonitorDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:47 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MonitorDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class MonitorDataPanel extends SimpleDataObjectPanel{
	protected Monitor dataObject;
	//protected MonitorChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MonitorDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMonitorResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMonitorResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MonitorResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MonitorCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldfile_format,		
			fStringTextFieldurlbase,		
			fStringTextFieldfname_base,		
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
		this.setSize(400,(4)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelfile_format(), null); // Generated
        this.add(getJPanelurlbase(), null); // Generated
        this.add(getJPanelfname_base(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldfile_format.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldurlbase.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldfname_base.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoptions.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldfile_format.setValue(dataObject.getFile_format());
        fStringTextFieldurlbase.setValue(dataObject.getUrlbase());
        fStringTextFieldfname_base.setValue(dataObject.getFname_base());
        fStringTextFieldoptions.setValue(dataObject.getOptions());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFile_format(fStringTextFieldfile_format.getValue());
        dataObject.setUrlbase(fStringTextFieldurlbase.getValue());
        dataObject.setFname_base(fStringTextFieldfname_base.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Monitor
	 */
	public void setDataObject(Object aMonitor) {
	    //abstractdataObject = (AbstractConfigObject) aMonitor;
		setDataObject((Monitor) aMonitor);
		//dataObject = aMonitor;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Monitor
	 */
	public void setDataObject(Monitor aMonitor) {
	    //abstractdataObject = (AbstractConfigObject) aMonitor;
		dataObject = aMonitor;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldfile_format;
    protected javax.swing.JLabel fJLabelfile_format;
	protected javax.swing.JPanel fJPanelfile_format;
    protected StringTextField fStringTextFieldurlbase;
    protected javax.swing.JLabel fJLabelurlbase;
	protected javax.swing.JPanel fJPanelurlbase;
    protected StringTextField fStringTextFieldfname_base;
    protected javax.swing.JLabel fJLabelfname_base;
	protected javax.swing.JPanel fJPanelfname_base;
    protected StringTextField fStringTextFieldoptions;
    protected javax.swing.JLabel fJLabeloptions;
	protected javax.swing.JPanel fJPaneloptions;
    

//start DB field file_format
    /**
     * This method initializes fStringTextFieldfile_format
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfile_format() {
        if (fStringTextFieldfile_format == null) {
            try {
                fStringTextFieldfile_format = new StringTextField(); // Generated
                fStringTextFieldfile_format.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfile_format;
    }
        
    /**
     * This method initializes  fJLabelfile_format
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfile_format() {
        if (fJLabelfile_format == null) {
            try {
                 fJLabelfile_format = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfile_format.setText(resBundel.getString("res_strfile_formatDisplayName")); // Generated
                 fJLabelfile_format.setToolTipText(resBundel.getString("res_strfile_formatDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfile_format;
    }


    /**
     * This method initializes  fJPanelfile_format
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfile_format() {
        if (fJPanelfile_format == null) {
            try {
                fJPanelfile_format = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfile_format.setLayout(layFlowLayout); // Generated
                fJPanelfile_format.add(getJLabelfile_format(), null); // Generated
                fJPanelfile_format.add(getStringTextFieldfile_format(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfile_format;
    }
//end DB field file_format
//start DB field urlbase
    /**
     * This method initializes fStringTextFieldurlbase
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldurlbase() {
        if (fStringTextFieldurlbase == null) {
            try {
                fStringTextFieldurlbase = new StringTextField(); // Generated
                fStringTextFieldurlbase.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldurlbase;
    }
        
    /**
     * This method initializes  fJLabelurlbase
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelurlbase() {
        if (fJLabelurlbase == null) {
            try {
                 fJLabelurlbase = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelurlbase.setText(resBundel.getString("res_strurlbaseDisplayName")); // Generated
                 fJLabelurlbase.setToolTipText(resBundel.getString("res_strurlbaseDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelurlbase;
    }


    /**
     * This method initializes  fJPanelurlbase
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelurlbase() {
        if (fJPanelurlbase == null) {
            try {
                fJPanelurlbase = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelurlbase.setLayout(layFlowLayout); // Generated
                fJPanelurlbase.add(getJLabelurlbase(), null); // Generated
                fJPanelurlbase.add(getStringTextFieldurlbase(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelurlbase;
    }
//end DB field urlbase
//start DB field fname_base
    /**
     * This method initializes fStringTextFieldfname_base
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfname_base() {
        if (fStringTextFieldfname_base == null) {
            try {
                fStringTextFieldfname_base = new StringTextField(); // Generated
                fStringTextFieldfname_base.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfname_base;
    }
        
    /**
     * This method initializes  fJLabelfname_base
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfname_base() {
        if (fJLabelfname_base == null) {
            try {
                 fJLabelfname_base = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfname_base.setText(resBundel.getString("res_strfname_baseDisplayName")); // Generated
                 fJLabelfname_base.setToolTipText(resBundel.getString("res_strfname_baseDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfname_base;
    }


    /**
     * This method initializes  fJPanelfname_base
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfname_base() {
        if (fJPanelfname_base == null) {
            try {
                fJPanelfname_base = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfname_base.setLayout(layFlowLayout); // Generated
                fJPanelfname_base.add(getJLabelfname_base(), null); // Generated
                fJPanelfname_base.add(getStringTextFieldfname_base(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfname_base;
    }
//end DB field fname_base
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

	