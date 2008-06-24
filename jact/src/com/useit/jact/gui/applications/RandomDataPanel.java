package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.Random;

/**
 * <p>
 * RandomDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:51 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RandomDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class RandomDataPanel extends SimpleDataObjectPanel{
	protected Random dataObject;
	//protected RandomChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public RandomDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getRandomResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getRandomResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/RandomResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new RandomCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldprobability,		
			fStringTextFieldcontext,		
			fStringTextFieldextension,		
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
		this.setSize(400,(4)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelprobability(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPanelextension(), null); // Generated
        this.add(getJPanelpriority(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldprobability.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcontext.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldextension.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldpriority.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldprobability.setValue(dataObject.getProbability());
        fStringTextFieldcontext.setValue(dataObject.getContext());
        fStringTextFieldextension.setValue(dataObject.getExtension());
        fStringTextFieldpriority.setValue(dataObject.getPriority());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setProbability(fStringTextFieldprobability.getValue());
        dataObject.setContext(fStringTextFieldcontext.getValue());
        dataObject.setExtension(fStringTextFieldextension.getValue());
        dataObject.setPriority(fStringTextFieldpriority.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param Random
	 */
	public void setDataObject(Object aRandom) {
	    //abstractdataObject = (AbstractConfigObject) aRandom;
		setDataObject((Random) aRandom);
		//dataObject = aRandom;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param Random
	 */
	public void setDataObject(Random aRandom) {
	    //abstractdataObject = (AbstractConfigObject) aRandom;
		dataObject = aRandom;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldprobability;
    protected javax.swing.JLabel fJLabelprobability;
	protected javax.swing.JPanel fJPanelprobability;
    protected StringTextField fStringTextFieldcontext;
    protected javax.swing.JLabel fJLabelcontext;
	protected javax.swing.JPanel fJPanelcontext;
    protected StringTextField fStringTextFieldextension;
    protected javax.swing.JLabel fJLabelextension;
	protected javax.swing.JPanel fJPanelextension;
    protected StringTextField fStringTextFieldpriority;
    protected javax.swing.JLabel fJLabelpriority;
	protected javax.swing.JPanel fJPanelpriority;
    

//start DB field probability
    /**
     * This method initializes fStringTextFieldprobability
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldprobability() {
        if (fStringTextFieldprobability == null) {
            try {
                fStringTextFieldprobability = new StringTextField(); // Generated
                fStringTextFieldprobability.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldprobability;
    }
        
    /**
     * This method initializes  fJLabelprobability
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelprobability() {
        if (fJLabelprobability == null) {
            try {
                 fJLabelprobability = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelprobability.setText(resBundel.getString("res_strprobabilityDisplayName")); // Generated
                 fJLabelprobability.setToolTipText(resBundel.getString("res_strprobabilityDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelprobability;
    }


    /**
     * This method initializes  fJPanelprobability
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelprobability() {
        if (fJPanelprobability == null) {
            try {
                fJPanelprobability = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelprobability.setLayout(layFlowLayout); // Generated
                fJPanelprobability.add(getJLabelprobability(), null); // Generated
                fJPanelprobability.add(getStringTextFieldprobability(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelprobability;
    }
//end DB field probability
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
     * This method initializes fStringTextFieldextension
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldextension() {
        if (fStringTextFieldextension == null) {
            try {
                fStringTextFieldextension = new StringTextField(); // Generated
                fStringTextFieldextension.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldextension;
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
                fJPanelextension.add(getStringTextFieldextension(), null); // Generated
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

	