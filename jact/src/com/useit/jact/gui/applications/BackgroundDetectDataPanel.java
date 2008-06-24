package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.BackgroundDetect;

/**
 * <p>
 * BackgroundDetectDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: BackgroundDetectDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class BackgroundDetectDataPanel extends SimpleDataObjectPanel{
	protected BackgroundDetect dataObject;
	//protected BackgroundDetectChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public BackgroundDetectDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getBackgroundDetectResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getBackgroundDetectResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/BackgroundDetectResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new BackgroundDetectCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldfilename,		
			fStringTextFieldsil,		
			fStringTextFieldmin,		
			fStringTextFieldmax,		
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
        this.add(getJPanelfilename(), null); // Generated
        this.add(getJPanelsil(), null); // Generated
        this.add(getJPanelmin(), null); // Generated
        this.add(getJPanelmax(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldfilename.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldsil.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmin.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmax.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldfilename.setValue(dataObject.getFilename());
        fStringTextFieldsil.setValue(dataObject.getSil());
        fStringTextFieldmin.setValue(dataObject.getMin());
        fStringTextFieldmax.setValue(dataObject.getMax());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFilename(fStringTextFieldfilename.getValue());
        dataObject.setSil(fStringTextFieldsil.getValue());
        dataObject.setMin(fStringTextFieldmin.getValue());
        dataObject.setMax(fStringTextFieldmax.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param BackgroundDetect
	 */
	public void setDataObject(Object aBackgroundDetect) {
	    //abstractdataObject = (AbstractConfigObject) aBackgroundDetect;
		setDataObject((BackgroundDetect) aBackgroundDetect);
		//dataObject = aBackgroundDetect;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param BackgroundDetect
	 */
	public void setDataObject(BackgroundDetect aBackgroundDetect) {
	    //abstractdataObject = (AbstractConfigObject) aBackgroundDetect;
		dataObject = aBackgroundDetect;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldfilename;
    protected javax.swing.JLabel fJLabelfilename;
	protected javax.swing.JPanel fJPanelfilename;
    protected StringTextField fStringTextFieldsil;
    protected javax.swing.JLabel fJLabelsil;
	protected javax.swing.JPanel fJPanelsil;
    protected StringTextField fStringTextFieldmin;
    protected javax.swing.JLabel fJLabelmin;
	protected javax.swing.JPanel fJPanelmin;
    protected StringTextField fStringTextFieldmax;
    protected javax.swing.JLabel fJLabelmax;
	protected javax.swing.JPanel fJPanelmax;
    

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
//start DB field sil
    /**
     * This method initializes fStringTextFieldsil
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldsil() {
        if (fStringTextFieldsil == null) {
            try {
                fStringTextFieldsil = new StringTextField(); // Generated
                fStringTextFieldsil.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldsil;
    }
        
    /**
     * This method initializes  fJLabelsil
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelsil() {
        if (fJLabelsil == null) {
            try {
                 fJLabelsil = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelsil.setText(resBundel.getString("res_strsilDisplayName")); // Generated
                 fJLabelsil.setToolTipText(resBundel.getString("res_strsilDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelsil;
    }


    /**
     * This method initializes  fJPanelsil
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelsil() {
        if (fJPanelsil == null) {
            try {
                fJPanelsil = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelsil.setLayout(layFlowLayout); // Generated
                fJPanelsil.add(getJLabelsil(), null); // Generated
                fJPanelsil.add(getStringTextFieldsil(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelsil;
    }
//end DB field sil
//start DB field min
    /**
     * This method initializes fStringTextFieldmin
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmin() {
        if (fStringTextFieldmin == null) {
            try {
                fStringTextFieldmin = new StringTextField(); // Generated
                fStringTextFieldmin.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmin;
    }
        
    /**
     * This method initializes  fJLabelmin
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmin() {
        if (fJLabelmin == null) {
            try {
                 fJLabelmin = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmin.setText(resBundel.getString("res_strminDisplayName")); // Generated
                 fJLabelmin.setToolTipText(resBundel.getString("res_strminDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmin;
    }


    /**
     * This method initializes  fJPanelmin
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmin() {
        if (fJPanelmin == null) {
            try {
                fJPanelmin = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmin.setLayout(layFlowLayout); // Generated
                fJPanelmin.add(getJLabelmin(), null); // Generated
                fJPanelmin.add(getStringTextFieldmin(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmin;
    }
//end DB field min
//start DB field max
    /**
     * This method initializes fStringTextFieldmax
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmax() {
        if (fStringTextFieldmax == null) {
            try {
                fStringTextFieldmax = new StringTextField(); // Generated
                fStringTextFieldmax.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmax;
    }
        
    /**
     * This method initializes  fJLabelmax
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmax() {
        if (fJLabelmax == null) {
            try {
                 fJLabelmax = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmax.setText(resBundel.getString("res_strmaxDisplayName")); // Generated
                 fJLabelmax.setToolTipText(resBundel.getString("res_strmaxDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmax;
    }


    /**
     * This method initializes  fJPanelmax
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmax() {
        if (fJPanelmax == null) {
            try {
                fJPanelmax = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmax.setLayout(layFlowLayout); // Generated
                fJPanelmax.add(getJLabelmax(), null); // Generated
                fJPanelmax.add(getStringTextFieldmax(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmax;
    }
//end DB field max

}

	