package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.RealTime;

/**
 * <p>
 * RealTimeDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:04 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RealTimeDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class RealTimeDataPanel extends SimpleDataObjectPanel{
	protected RealTime dataObject;
	//protected RealTimeChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public RealTimeDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getRealTimeResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getRealTimeResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/RealTimeResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new RealTimeCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldfamily,		
			fStringTextFieldcolmatch,		
			fStringTextFieldvalue,		
			fStringTextFieldprefix,		
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
        this.add(getJPanelfamily(), null); // Generated
        this.add(getJPanelcolmatch(), null); // Generated
        this.add(getJPanelvalue(), null); // Generated
        this.add(getJPanelprefix(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldfamily.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcolmatch.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldvalue.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldprefix.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldfamily.setValue(dataObject.getFamily());
        fStringTextFieldcolmatch.setValue(dataObject.getColmatch());
        fStringTextFieldvalue.setValue(dataObject.getValue());
        fStringTextFieldprefix.setValue(dataObject.getPrefix());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFamily(fStringTextFieldfamily.getValue());
        dataObject.setColmatch(fStringTextFieldcolmatch.getValue());
        dataObject.setValue(fStringTextFieldvalue.getValue());
        dataObject.setPrefix(fStringTextFieldprefix.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param RealTime
	 */
	public void setDataObject(Object aRealTime) {
	    //abstractdataObject = (AbstractConfigObject) aRealTime;
		setDataObject((RealTime) aRealTime);
		//dataObject = aRealTime;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param RealTime
	 */
	public void setDataObject(RealTime aRealTime) {
	    //abstractdataObject = (AbstractConfigObject) aRealTime;
		dataObject = aRealTime;
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
    protected StringTextField fStringTextFieldprefix;
    protected javax.swing.JLabel fJLabelprefix;
	protected javax.swing.JPanel fJPanelprefix;
    

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
//start DB field prefix
    /**
     * This method initializes fStringTextFieldprefix
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldprefix() {
        if (fStringTextFieldprefix == null) {
            try {
                fStringTextFieldprefix = new StringTextField(); // Generated
                fStringTextFieldprefix.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldprefix;
    }
        
    /**
     * This method initializes  fJLabelprefix
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelprefix() {
        if (fJLabelprefix == null) {
            try {
                 fJLabelprefix = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelprefix.setText(resBundel.getString("res_strprefixDisplayName")); // Generated
                 fJLabelprefix.setToolTipText(resBundel.getString("res_strprefixDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelprefix;
    }


    /**
     * This method initializes  fJPanelprefix
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelprefix() {
        if (fJPanelprefix == null) {
            try {
                fJPanelprefix = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelprefix.setLayout(layFlowLayout); // Generated
                fJPanelprefix.add(getJLabelprefix(), null); // Generated
                fJPanelprefix.add(getStringTextFieldprefix(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelprefix;
    }
//end DB field prefix

}

	