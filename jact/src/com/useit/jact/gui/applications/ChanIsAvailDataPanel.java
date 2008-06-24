package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ChanIsAvail;

/**
 * <p>
 * ChanIsAvailDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:22 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ChanIsAvailDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class ChanIsAvailDataPanel extends SimpleDataObjectPanel{
	protected ChanIsAvail dataObject;
	//protected ChanIsAvailChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ChanIsAvailDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getChanIsAvailResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getChanIsAvailResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ChanIsAvailResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ChanIsAvailCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldformatstr,		
			fStringTextFieldtechnology,		
			fStringTextFieldresource,		
			fStringTextFieldtechnology2,		
			fStringTextFieldresource2,		
			fStringTextFieldoption,		
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
        this.add(getJPanelformatstr(), null); // Generated
        this.add(getJPaneltechnology(), null); // Generated
        this.add(getJPanelresource(), null); // Generated
        this.add(getJPaneltechnology2(), null); // Generated
        this.add(getJPanelresource2(), null); // Generated
        this.add(getJPaneloption(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldformatstr.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtechnology.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldresource.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtechnology2.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldresource2.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldoption.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldformatstr.setValue(dataObject.getFormatstr());
        fStringTextFieldtechnology.setValue(dataObject.getTechnology());
        fStringTextFieldresource.setValue(dataObject.getResource());
        fStringTextFieldtechnology2.setValue(dataObject.getTechnology2());
        fStringTextFieldresource2.setValue(dataObject.getResource2());
        fStringTextFieldoption.setValue(dataObject.getOption());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFormatstr(fStringTextFieldformatstr.getValue());
        dataObject.setTechnology(fStringTextFieldtechnology.getValue());
        dataObject.setResource(fStringTextFieldresource.getValue());
        dataObject.setTechnology2(fStringTextFieldtechnology2.getValue());
        dataObject.setResource2(fStringTextFieldresource2.getValue());
        dataObject.setOption(fStringTextFieldoption.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ChanIsAvail
	 */
	public void setDataObject(Object aChanIsAvail) {
	    //abstractdataObject = (AbstractConfigObject) aChanIsAvail;
		setDataObject((ChanIsAvail) aChanIsAvail);
		//dataObject = aChanIsAvail;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ChanIsAvail
	 */
	public void setDataObject(ChanIsAvail aChanIsAvail) {
	    //abstractdataObject = (AbstractConfigObject) aChanIsAvail;
		dataObject = aChanIsAvail;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldformatstr;
    protected javax.swing.JLabel fJLabelformatstr;
	protected javax.swing.JPanel fJPanelformatstr;
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
    protected StringTextField fStringTextFieldoption;
    protected javax.swing.JLabel fJLabeloption;
	protected javax.swing.JPanel fJPaneloption;
    

//start DB field formatstr
    /**
     * This method initializes fStringTextFieldformatstr
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldformatstr() {
        if (fStringTextFieldformatstr == null) {
            try {
                fStringTextFieldformatstr = new StringTextField(); // Generated
                fStringTextFieldformatstr.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldformatstr;
    }
        
    /**
     * This method initializes  fJLabelformatstr
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelformatstr() {
        if (fJLabelformatstr == null) {
            try {
                 fJLabelformatstr = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelformatstr.setText(resBundel.getString("res_strformatstrDisplayName")); // Generated
                 fJLabelformatstr.setToolTipText(resBundel.getString("res_strformatstrDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelformatstr;
    }


    /**
     * This method initializes  fJPanelformatstr
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelformatstr() {
        if (fJPanelformatstr == null) {
            try {
                fJPanelformatstr = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelformatstr.setLayout(layFlowLayout); // Generated
                fJPanelformatstr.add(getJLabelformatstr(), null); // Generated
                fJPanelformatstr.add(getStringTextFieldformatstr(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelformatstr;
    }
//end DB field formatstr
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

}

	