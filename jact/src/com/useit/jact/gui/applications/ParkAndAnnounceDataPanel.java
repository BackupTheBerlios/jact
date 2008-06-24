package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ParkAndAnnounce;

/**
 * <p>
 * ParkAndAnnounceDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:19 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ParkAndAnnounceDataPanel.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
public class ParkAndAnnounceDataPanel extends SimpleDataObjectPanel{
	protected ParkAndAnnounce dataObject;
	//protected ParkAndAnnounceChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ParkAndAnnounceDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getParkAndAnnounceResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getParkAndAnnounceResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ParkAndAnnounceResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ParkAndAnnounceCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldannounce,		
			fStringTextFieldtemplate,		
			fStringTextFieldtimeout,		
			fStringTextFielddial,		
			fStringTextFieldreturn_context,		
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
        this.add(getJPanelannounce(), null); // Generated
        this.add(getJPaneltemplate(), null); // Generated
        this.add(getJPaneltimeout(), null); // Generated
        this.add(getJPaneldial(), null); // Generated
        this.add(getJPanelreturn_context(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldannounce.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtemplate.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtimeout.getDocument().addDocumentListener(textChangeAct);
		fStringTextFielddial.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldreturn_context.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldannounce.setValue(dataObject.getAnnounce());
        fStringTextFieldtemplate.setValue(dataObject.getTemplate());
        fStringTextFieldtimeout.setValue(dataObject.getTimeout());
        fStringTextFielddial.setValue(dataObject.getDial());
        fStringTextFieldreturn_context.setValue(dataObject.getReturn_context());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setAnnounce(fStringTextFieldannounce.getValue());
        dataObject.setTemplate(fStringTextFieldtemplate.getValue());
        dataObject.setTimeout(fStringTextFieldtimeout.getValue());
        dataObject.setDial(fStringTextFielddial.getValue());
        dataObject.setReturn_context(fStringTextFieldreturn_context.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ParkAndAnnounce
	 */
	public void setDataObject(Object aParkAndAnnounce) {
	    //abstractdataObject = (AbstractConfigObject) aParkAndAnnounce;
		setDataObject((ParkAndAnnounce) aParkAndAnnounce);
		//dataObject = aParkAndAnnounce;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ParkAndAnnounce
	 */
	public void setDataObject(ParkAndAnnounce aParkAndAnnounce) {
	    //abstractdataObject = (AbstractConfigObject) aParkAndAnnounce;
		dataObject = aParkAndAnnounce;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldannounce;
    protected javax.swing.JLabel fJLabelannounce;
	protected javax.swing.JPanel fJPanelannounce;
    protected StringTextField fStringTextFieldtemplate;
    protected javax.swing.JLabel fJLabeltemplate;
	protected javax.swing.JPanel fJPaneltemplate;
    protected StringTextField fStringTextFieldtimeout;
    protected javax.swing.JLabel fJLabeltimeout;
	protected javax.swing.JPanel fJPaneltimeout;
    protected StringTextField fStringTextFielddial;
    protected javax.swing.JLabel fJLabeldial;
	protected javax.swing.JPanel fJPaneldial;
    protected StringTextField fStringTextFieldreturn_context;
    protected javax.swing.JLabel fJLabelreturn_context;
	protected javax.swing.JPanel fJPanelreturn_context;
    

//start DB field announce
    /**
     * This method initializes fStringTextFieldannounce
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldannounce() {
        if (fStringTextFieldannounce == null) {
            try {
                fStringTextFieldannounce = new StringTextField(); // Generated
                fStringTextFieldannounce.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldannounce;
    }
        
    /**
     * This method initializes  fJLabelannounce
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelannounce() {
        if (fJLabelannounce == null) {
            try {
                 fJLabelannounce = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelannounce.setText(resBundel.getString("res_strannounceDisplayName")); // Generated
                 fJLabelannounce.setToolTipText(resBundel.getString("res_strannounceDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelannounce;
    }


    /**
     * This method initializes  fJPanelannounce
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelannounce() {
        if (fJPanelannounce == null) {
            try {
                fJPanelannounce = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelannounce.setLayout(layFlowLayout); // Generated
                fJPanelannounce.add(getJLabelannounce(), null); // Generated
                fJPanelannounce.add(getStringTextFieldannounce(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelannounce;
    }
//end DB field announce
//start DB field template
    /**
     * This method initializes fStringTextFieldtemplate
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtemplate() {
        if (fStringTextFieldtemplate == null) {
            try {
                fStringTextFieldtemplate = new StringTextField(); // Generated
                fStringTextFieldtemplate.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtemplate;
    }
        
    /**
     * This method initializes  fJLabeltemplate
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltemplate() {
        if (fJLabeltemplate == null) {
            try {
                 fJLabeltemplate = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltemplate.setText(resBundel.getString("res_strtemplateDisplayName")); // Generated
                 fJLabeltemplate.setToolTipText(resBundel.getString("res_strtemplateDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltemplate;
    }


    /**
     * This method initializes  fJPaneltemplate
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltemplate() {
        if (fJPaneltemplate == null) {
            try {
                fJPaneltemplate = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltemplate.setLayout(layFlowLayout); // Generated
                fJPaneltemplate.add(getJLabeltemplate(), null); // Generated
                fJPaneltemplate.add(getStringTextFieldtemplate(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltemplate;
    }
//end DB field template
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
//start DB field return_context
    /**
     * This method initializes fStringTextFieldreturn_context
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldreturn_context() {
        if (fStringTextFieldreturn_context == null) {
            try {
                fStringTextFieldreturn_context = new StringTextField(); // Generated
                fStringTextFieldreturn_context.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldreturn_context;
    }
        
    /**
     * This method initializes  fJLabelreturn_context
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelreturn_context() {
        if (fJLabelreturn_context == null) {
            try {
                 fJLabelreturn_context = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelreturn_context.setText(resBundel.getString("res_strreturn_contextDisplayName")); // Generated
                 fJLabelreturn_context.setToolTipText(resBundel.getString("res_strreturn_contextDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelreturn_context;
    }


    /**
     * This method initializes  fJPanelreturn_context
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelreturn_context() {
        if (fJPanelreturn_context == null) {
            try {
                fJPanelreturn_context = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelreturn_context.setLayout(layFlowLayout); // Generated
                fJPanelreturn_context.add(getJLabelreturn_context(), null); // Generated
                fJPanelreturn_context.add(getStringTextFieldreturn_context(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelreturn_context;
    }
//end DB field return_context

}

	