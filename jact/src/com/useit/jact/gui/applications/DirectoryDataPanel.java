package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Directory;

/**
 * <p>
 * DirectoryDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:55 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DirectoryDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class DirectoryDataPanel extends SimpleDataObjectPanel{
	protected Directory dataObject;
	//protected DirectoryChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public DirectoryDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getDirectoryResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getDirectoryResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/DirectoryResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new DirectoryCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldvm,		
			fStringTextFielddial,		
			fStringTextFieldcontext,		
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
        this.add(getJPanelvm(), null); // Generated
        this.add(getJPaneldial(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldvm.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielddial.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcontext.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoptions.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldvm.setValue(dataObject.getVm());
        fStringTextFielddial.setValue(dataObject.getDial());
        fStringTextFieldcontext.setValue(dataObject.getContext());
        fStringTextFieldoptions.setValue(dataObject.getOptions());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setVm(fStringTextFieldvm.getValue());
        dataObject.setDial(fStringTextFielddial.getValue());
        dataObject.setContext(fStringTextFieldcontext.getValue());
        dataObject.setOptions(fStringTextFieldoptions.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Directory
	 */
	public void setDataObject(Object aDirectory) {
	    //abstractdataObject = (AbstractConfigObject) aDirectory;
		setDataObject((Directory) aDirectory);
		//dataObject = aDirectory;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Directory
	 */
	public void setDataObject(Directory aDirectory) {
	    //abstractdataObject = (AbstractConfigObject) aDirectory;
		dataObject = aDirectory;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldvm;
    protected javax.swing.JLabel fJLabelvm;
	protected javax.swing.JPanel fJPanelvm;
    protected StringTextField fStringTextFielddial;
    protected javax.swing.JLabel fJLabeldial;
	protected javax.swing.JPanel fJPaneldial;
    protected StringTextField fStringTextFieldcontext;
    protected javax.swing.JLabel fJLabelcontext;
	protected javax.swing.JPanel fJPanelcontext;
    protected StringTextField fStringTextFieldoptions;
    protected javax.swing.JLabel fJLabeloptions;
	protected javax.swing.JPanel fJPaneloptions;
    

//start DB field vm
    /**
     * This method initializes fStringTextFieldvm
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvm() {
        if (fStringTextFieldvm == null) {
            try {
                fStringTextFieldvm = new StringTextField(); // Generated
                fStringTextFieldvm.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvm;
    }
        
    /**
     * This method initializes  fJLabelvm
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvm() {
        if (fJLabelvm == null) {
            try {
                 fJLabelvm = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvm.setText(resBundel.getString("res_strvmDisplayName")); // Generated
                 fJLabelvm.setToolTipText(resBundel.getString("res_strvmDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvm;
    }


    /**
     * This method initializes  fJPanelvm
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvm() {
        if (fJPanelvm == null) {
            try {
                fJPanelvm = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvm.setLayout(layFlowLayout); // Generated
                fJPanelvm.add(getJLabelvm(), null); // Generated
                fJPanelvm.add(getStringTextFieldvm(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvm;
    }
//end DB field vm
//start DB field dial
    /**
     * This method initializes fStringTextFielddial
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFielddial() {
        if (fStringTextFielddial == null) {
            try {
                fStringTextFielddial = new StringTextField(); // Generated
                fStringTextFielddial.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFielddial;
    }
        
    /**
     * This method initializes  fJLabeldial
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeldial() {
        if (fJLabeldial == null) {
            try {
                 fJLabeldial = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeldial.setText(resBundel.getString("res_strdialDisplayName")); // Generated
                 fJLabeldial.setToolTipText(resBundel.getString("res_strdialDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeldial;
    }


    /**
     * This method initializes  fJPaneldial
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneldial() {
        if (fJPaneldial == null) {
            try {
                fJPaneldial = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneldial.setLayout(layFlowLayout); // Generated
                fJPaneldial.add(getJLabeldial(), null); // Generated
                fJPaneldial.add(getStringTextFielddial(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneldial;
    }
//end DB field dial
//start DB field context
    /**
     * This method initializes fStringTextFieldcontext
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcontext() {
        if (fStringTextFieldcontext == null) {
            try {
                fStringTextFieldcontext = new StringTextField(); // Generated
                fStringTextFieldcontext.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcontext;
    }
        
    /**
     * This method initializes  fJLabelcontext
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcontext() {
        if (fJLabelcontext == null) {
            try {
                 fJLabelcontext = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcontext.setText(resBundel.getString("res_strcontextDisplayName")); // Generated
                 fJLabelcontext.setToolTipText(resBundel.getString("res_strcontextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcontext;
    }


    /**
     * This method initializes  fJPanelcontext
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcontext() {
        if (fJPanelcontext == null) {
            try {
                fJPanelcontext = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcontext.setLayout(layFlowLayout); // Generated
                fJPanelcontext.add(getJLabelcontext(), null); // Generated
                fJPanelcontext.add(getStringTextFieldcontext(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcontext;
    }
//end DB field context
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

	