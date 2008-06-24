package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.RealTimeUpdate;

/**
 * <p>
 * RealTimeUpdateDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:53 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RealTimeUpdateDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class RealTimeUpdateDataPanel extends SimpleDataObjectPanel{
	protected RealTimeUpdate dataObject;
	//protected RealTimeUpdateChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public RealTimeUpdateDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getRealTimeUpdateResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getRealTimeUpdateResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/RealTimeUpdateResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new RealTimeUpdateCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldfamily,		
			fStringTextFieldcolmatch,		
			fStringTextFieldvalue,		
			fStringTextFieldnewcol,		
			fStringTextFieldnewval,		
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
        this.add(getJPanelfamily(), null); // Generated
        this.add(getJPanelcolmatch(), null); // Generated
        this.add(getJPanelvalue(), null); // Generated
        this.add(getJPanelnewcol(), null); // Generated
        this.add(getJPanelnewval(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldfamily.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcolmatch.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldvalue.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldnewcol.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldnewval.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldfamily.setValue(dataObject.getFamily());
        fStringTextFieldcolmatch.setValue(dataObject.getColmatch());
        fStringTextFieldvalue.setValue(dataObject.getValue());
        fStringTextFieldnewcol.setValue(dataObject.getNewcol());
        fStringTextFieldnewval.setValue(dataObject.getNewval());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFamily(fStringTextFieldfamily.getValue());
        dataObject.setColmatch(fStringTextFieldcolmatch.getValue());
        dataObject.setValue(fStringTextFieldvalue.getValue());
        dataObject.setNewcol(fStringTextFieldnewcol.getValue());
        dataObject.setNewval(fStringTextFieldnewval.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param RealTimeUpdate
	 */
	public void setDataObject(Object aRealTimeUpdate) {
	    //abstractdataObject = (AbstractConfigObject) aRealTimeUpdate;
		setDataObject((RealTimeUpdate) aRealTimeUpdate);
		//dataObject = aRealTimeUpdate;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param RealTimeUpdate
	 */
	public void setDataObject(RealTimeUpdate aRealTimeUpdate) {
	    //abstractdataObject = (AbstractConfigObject) aRealTimeUpdate;
		dataObject = aRealTimeUpdate;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldfamily;
    protected javax.swing.JLabel fJLabelfamily;
	protected javax.swing.JPanel fJPanelfamily;
    protected StringTextField fStringTextFieldcolmatch;
    protected javax.swing.JLabel fJLabelcolmatch;
	protected javax.swing.JPanel fJPanelcolmatch;
    protected StringTextField fStringTextFieldvalue;
    protected javax.swing.JLabel fJLabelvalue;
	protected javax.swing.JPanel fJPanelvalue;
    protected StringTextField fStringTextFieldnewcol;
    protected javax.swing.JLabel fJLabelnewcol;
	protected javax.swing.JPanel fJPanelnewcol;
    protected StringTextField fStringTextFieldnewval;
    protected javax.swing.JLabel fJLabelnewval;
	protected javax.swing.JPanel fJPanelnewval;
    

//start DB field family
    /**
     * This method initializes fStringTextFieldfamily
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldfamily() {
        if (fStringTextFieldfamily == null) {
            try {
                fStringTextFieldfamily = new StringTextField(); // Generated
                fStringTextFieldfamily.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldfamily;
    }
        
    /**
     * This method initializes  fJLabelfamily
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelfamily() {
        if (fJLabelfamily == null) {
            try {
                 fJLabelfamily = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelfamily.setText(resBundel.getString("res_strfamilyDisplayName")); // Generated
                 fJLabelfamily.setToolTipText(resBundel.getString("res_strfamilyDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelfamily;
    }


    /**
     * This method initializes  fJPanelfamily
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelfamily() {
        if (fJPanelfamily == null) {
            try {
                fJPanelfamily = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelfamily.setLayout(layFlowLayout); // Generated
                fJPanelfamily.add(getJLabelfamily(), null); // Generated
                fJPanelfamily.add(getStringTextFieldfamily(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelfamily;
    }
//end DB field family
//start DB field colmatch
    /**
     * This method initializes fStringTextFieldcolmatch
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcolmatch() {
        if (fStringTextFieldcolmatch == null) {
            try {
                fStringTextFieldcolmatch = new StringTextField(); // Generated
                fStringTextFieldcolmatch.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcolmatch;
    }
        
    /**
     * This method initializes  fJLabelcolmatch
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcolmatch() {
        if (fJLabelcolmatch == null) {
            try {
                 fJLabelcolmatch = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcolmatch.setText(resBundel.getString("res_strcolmatchDisplayName")); // Generated
                 fJLabelcolmatch.setToolTipText(resBundel.getString("res_strcolmatchDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcolmatch;
    }


    /**
     * This method initializes  fJPanelcolmatch
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcolmatch() {
        if (fJPanelcolmatch == null) {
            try {
                fJPanelcolmatch = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcolmatch.setLayout(layFlowLayout); // Generated
                fJPanelcolmatch.add(getJLabelcolmatch(), null); // Generated
                fJPanelcolmatch.add(getStringTextFieldcolmatch(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcolmatch;
    }
//end DB field colmatch
//start DB field value
    /**
     * This method initializes fStringTextFieldvalue
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvalue() {
        if (fStringTextFieldvalue == null) {
            try {
                fStringTextFieldvalue = new StringTextField(); // Generated
                fStringTextFieldvalue.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvalue;
    }
        
    /**
     * This method initializes  fJLabelvalue
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvalue() {
        if (fJLabelvalue == null) {
            try {
                 fJLabelvalue = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvalue.setText(resBundel.getString("res_strvalueDisplayName")); // Generated
                 fJLabelvalue.setToolTipText(resBundel.getString("res_strvalueDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvalue;
    }


    /**
     * This method initializes  fJPanelvalue
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvalue() {
        if (fJPanelvalue == null) {
            try {
                fJPanelvalue = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvalue.setLayout(layFlowLayout); // Generated
                fJPanelvalue.add(getJLabelvalue(), null); // Generated
                fJPanelvalue.add(getStringTextFieldvalue(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvalue;
    }
//end DB field value
//start DB field newcol
    /**
     * This method initializes fStringTextFieldnewcol
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldnewcol() {
        if (fStringTextFieldnewcol == null) {
            try {
                fStringTextFieldnewcol = new StringTextField(); // Generated
                fStringTextFieldnewcol.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldnewcol;
    }
        
    /**
     * This method initializes  fJLabelnewcol
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelnewcol() {
        if (fJLabelnewcol == null) {
            try {
                 fJLabelnewcol = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelnewcol.setText(resBundel.getString("res_strnewcolDisplayName")); // Generated
                 fJLabelnewcol.setToolTipText(resBundel.getString("res_strnewcolDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelnewcol;
    }


    /**
     * This method initializes  fJPanelnewcol
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelnewcol() {
        if (fJPanelnewcol == null) {
            try {
                fJPanelnewcol = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelnewcol.setLayout(layFlowLayout); // Generated
                fJPanelnewcol.add(getJLabelnewcol(), null); // Generated
                fJPanelnewcol.add(getStringTextFieldnewcol(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelnewcol;
    }
//end DB field newcol
//start DB field newval
    /**
     * This method initializes fStringTextFieldnewval
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldnewval() {
        if (fStringTextFieldnewval == null) {
            try {
                fStringTextFieldnewval = new StringTextField(); // Generated
                fStringTextFieldnewval.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldnewval;
    }
        
    /**
     * This method initializes  fJLabelnewval
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelnewval() {
        if (fJLabelnewval == null) {
            try {
                 fJLabelnewval = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelnewval.setText(resBundel.getString("res_strnewvalDisplayName")); // Generated
                 fJLabelnewval.setToolTipText(resBundel.getString("res_strnewvalDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelnewval;
    }


    /**
     * This method initializes  fJPanelnewval
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelnewval() {
        if (fJPanelnewval == null) {
            try {
                fJPanelnewval = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelnewval.setLayout(layFlowLayout); // Generated
                fJPanelnewval.add(getJLabelnewval(), null); // Generated
                fJPanelnewval.add(getStringTextFieldnewval(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelnewval;
    }
//end DB field newval

}

	