package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.ExtensionWidget;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Goto;

/**
 * <p>
 * GotoDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:45 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GotoDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class GotoDataPanel extends SimpleDataObjectPanel{
	protected Goto dataObject;
	//protected GotoChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public GotoDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getGotoResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getGotoResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/GotoResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new GotoCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldcontext,		
			fExtensionWidgetextension,		
			fStringTextFieldpriority,		
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
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPanelextension(), null); // Generated
        this.add(getJPanelpriority(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldcontext.getDocument().addDocumentListener(textChangeAct);
		fExtensionWidgetextension.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldpriority.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldcontext.setValue(dataObject.getContext());
        fExtensionWidgetextension.setValue(dataObject.getExtension());
        fStringTextFieldpriority.setValue(dataObject.getPriority());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setContext(fStringTextFieldcontext.getValue());
        dataObject.setExtension(fExtensionWidgetextension.getValue());
        dataObject.setPriority(fStringTextFieldpriority.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Goto
	 */
	public void setDataObject(Object aGoto) {
	    //abstractdataObject = (AbstractConfigObject) aGoto;
		setDataObject((Goto) aGoto);
		//dataObject = aGoto;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Goto
	 */
	public void setDataObject(Goto aGoto) {
	    //abstractdataObject = (AbstractConfigObject) aGoto;
		dataObject = aGoto;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldcontext;
    protected javax.swing.JLabel fJLabelcontext;
	protected javax.swing.JPanel fJPanelcontext;
    protected ExtensionWidget fExtensionWidgetextension;
    protected javax.swing.JLabel fJLabelextension;
	protected javax.swing.JPanel fJPanelextension;
    protected StringTextField fStringTextFieldpriority;
    protected javax.swing.JLabel fJLabelpriority;
	protected javax.swing.JPanel fJPanelpriority;
    

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
//start DB field extension
    /**
     * This method initializes fExtensionWidgetextension
     *
     * @return ExtensionWidget
     */
    public ExtensionWidget getExtensionWidgetextension() {
        if (fExtensionWidgetextension == null) {
            try {
                fExtensionWidgetextension = new ExtensionWidget(); // Generated
                fExtensionWidgetextension.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fExtensionWidgetextension;
    }
        
    /**
     * This method initializes  fJLabelextension
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelextension() {
        if (fJLabelextension == null) {
            try {
                 fJLabelextension = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelextension.setText(resBundel.getString("res_strextensionDisplayName")); // Generated
                 fJLabelextension.setToolTipText(resBundel.getString("res_strextensionDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelextension;
    }


    /**
     * This method initializes  fJPanelextension
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelextension() {
        if (fJPanelextension == null) {
            try {
                fJPanelextension = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelextension.setLayout(layFlowLayout); // Generated
                fJPanelextension.add(getJLabelextension(), null); // Generated
                fJPanelextension.add(getExtensionWidgetextension(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelextension;
    }
//end DB field extension
//start DB field priority
    /**
     * This method initializes fStringTextFieldpriority
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpriority() {
        if (fStringTextFieldpriority == null) {
            try {
                fStringTextFieldpriority = new StringTextField(); // Generated
                fStringTextFieldpriority.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpriority;
    }
        
    /**
     * This method initializes  fJLabelpriority
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpriority() {
        if (fJLabelpriority == null) {
            try {
                 fJLabelpriority = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelpriority.setText(resBundel.getString("res_strpriorityDisplayName")); // Generated
                 fJLabelpriority.setToolTipText(resBundel.getString("res_strpriorityDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelpriority;
    }


    /**
     * This method initializes  fJPanelpriority
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpriority() {
        if (fJPanelpriority == null) {
            try {
                fJPanelpriority = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpriority.setLayout(layFlowLayout); // Generated
                fJPanelpriority.add(getJLabelpriority(), null); // Generated
                fJPanelpriority.add(getStringTextFieldpriority(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpriority;
    }
//end DB field priority

}

	