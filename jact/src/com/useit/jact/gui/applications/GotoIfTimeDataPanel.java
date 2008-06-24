package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.GotoIfTime;

/**
 * <p>
 * GotoIfTimeDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:54 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GotoIfTimeDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class GotoIfTimeDataPanel extends SimpleDataObjectPanel{
	protected GotoIfTime dataObject;
	//protected GotoIfTimeChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public GotoIfTimeDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getGotoIfTimeResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getGotoIfTimeResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/GotoIfTimeResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new GotoIfTimeCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldtimes,		
			fStringTextFieldweekdays,		
			fStringTextFieldmdays,		
			fStringTextFieldmonths,		
			fStringTextFieldcontext,		
			fStringTextFieldextension,		
			fStringTextFieldpri,		
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
		this.setSize(400,(7)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(7); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneltimes(), null); // Generated
        this.add(getJPanelweekdays(), null); // Generated
        this.add(getJPanelmdays(), null); // Generated
        this.add(getJPanelmonths(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPanelextension(), null); // Generated
        this.add(getJPanelpri(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldtimes.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldweekdays.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmdays.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmonths.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldcontext.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldextension.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldpri.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldtimes.setValue(dataObject.getTimes());
        fStringTextFieldweekdays.setValue(dataObject.getWeekdays());
        fStringTextFieldmdays.setValue(dataObject.getMdays());
        fStringTextFieldmonths.setValue(dataObject.getMonths());
        fStringTextFieldcontext.setValue(dataObject.getContext());
        fStringTextFieldextension.setValue(dataObject.getExtension());
        fStringTextFieldpri.setValue(dataObject.getPri());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setTimes(fStringTextFieldtimes.getValue());
        dataObject.setWeekdays(fStringTextFieldweekdays.getValue());
        dataObject.setMdays(fStringTextFieldmdays.getValue());
        dataObject.setMonths(fStringTextFieldmonths.getValue());
        dataObject.setContext(fStringTextFieldcontext.getValue());
        dataObject.setExtension(fStringTextFieldextension.getValue());
        dataObject.setPri(fStringTextFieldpri.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param GotoIfTime
	 */
	public void setDataObject(Object aGotoIfTime) {
	    //abstractdataObject = (AbstractConfigObject) aGotoIfTime;
		setDataObject((GotoIfTime) aGotoIfTime);
		//dataObject = aGotoIfTime;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param GotoIfTime
	 */
	public void setDataObject(GotoIfTime aGotoIfTime) {
	    //abstractdataObject = (AbstractConfigObject) aGotoIfTime;
		dataObject = aGotoIfTime;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldtimes;
    protected javax.swing.JLabel fJLabeltimes;
	protected javax.swing.JPanel fJPaneltimes;
    protected StringTextField fStringTextFieldweekdays;
    protected javax.swing.JLabel fJLabelweekdays;
	protected javax.swing.JPanel fJPanelweekdays;
    protected StringTextField fStringTextFieldmdays;
    protected javax.swing.JLabel fJLabelmdays;
	protected javax.swing.JPanel fJPanelmdays;
    protected StringTextField fStringTextFieldmonths;
    protected javax.swing.JLabel fJLabelmonths;
	protected javax.swing.JPanel fJPanelmonths;
    protected StringTextField fStringTextFieldcontext;
    protected javax.swing.JLabel fJLabelcontext;
	protected javax.swing.JPanel fJPanelcontext;
    protected StringTextField fStringTextFieldextension;
    protected javax.swing.JLabel fJLabelextension;
	protected javax.swing.JPanel fJPanelextension;
    protected StringTextField fStringTextFieldpri;
    protected javax.swing.JLabel fJLabelpri;
	protected javax.swing.JPanel fJPanelpri;
    

//start DB field times
    /**
     * This method initializes fStringTextFieldtimes
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtimes() {
        if (fStringTextFieldtimes == null) {
            try {
                fStringTextFieldtimes = new StringTextField(); // Generated
                fStringTextFieldtimes.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtimes;
    }
        
    /**
     * This method initializes  fJLabeltimes
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltimes() {
        if (fJLabeltimes == null) {
            try {
                 fJLabeltimes = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltimes.setText(resBundel.getString("res_strtimesDisplayName")); // Generated
                 fJLabeltimes.setToolTipText(resBundel.getString("res_strtimesDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltimes;
    }


    /**
     * This method initializes  fJPaneltimes
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltimes() {
        if (fJPaneltimes == null) {
            try {
                fJPaneltimes = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltimes.setLayout(layFlowLayout); // Generated
                fJPaneltimes.add(getJLabeltimes(), null); // Generated
                fJPaneltimes.add(getStringTextFieldtimes(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltimes;
    }
//end DB field times
//start DB field weekdays
    /**
     * This method initializes fStringTextFieldweekdays
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldweekdays() {
        if (fStringTextFieldweekdays == null) {
            try {
                fStringTextFieldweekdays = new StringTextField(); // Generated
                fStringTextFieldweekdays.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldweekdays;
    }
        
    /**
     * This method initializes  fJLabelweekdays
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelweekdays() {
        if (fJLabelweekdays == null) {
            try {
                 fJLabelweekdays = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelweekdays.setText(resBundel.getString("res_strweekdaysDisplayName")); // Generated
                 fJLabelweekdays.setToolTipText(resBundel.getString("res_strweekdaysDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelweekdays;
    }


    /**
     * This method initializes  fJPanelweekdays
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelweekdays() {
        if (fJPanelweekdays == null) {
            try {
                fJPanelweekdays = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelweekdays.setLayout(layFlowLayout); // Generated
                fJPanelweekdays.add(getJLabelweekdays(), null); // Generated
                fJPanelweekdays.add(getStringTextFieldweekdays(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelweekdays;
    }
//end DB field weekdays
//start DB field mdays
    /**
     * This method initializes fStringTextFieldmdays
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmdays() {
        if (fStringTextFieldmdays == null) {
            try {
                fStringTextFieldmdays = new StringTextField(); // Generated
                fStringTextFieldmdays.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmdays;
    }
        
    /**
     * This method initializes  fJLabelmdays
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmdays() {
        if (fJLabelmdays == null) {
            try {
                 fJLabelmdays = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmdays.setText(resBundel.getString("res_strmdaysDisplayName")); // Generated
                 fJLabelmdays.setToolTipText(resBundel.getString("res_strmdaysDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmdays;
    }


    /**
     * This method initializes  fJPanelmdays
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmdays() {
        if (fJPanelmdays == null) {
            try {
                fJPanelmdays = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmdays.setLayout(layFlowLayout); // Generated
                fJPanelmdays.add(getJLabelmdays(), null); // Generated
                fJPanelmdays.add(getStringTextFieldmdays(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmdays;
    }
//end DB field mdays
//start DB field months
    /**
     * This method initializes fStringTextFieldmonths
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldmonths() {
        if (fStringTextFieldmonths == null) {
            try {
                fStringTextFieldmonths = new StringTextField(); // Generated
                fStringTextFieldmonths.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldmonths;
    }
        
    /**
     * This method initializes  fJLabelmonths
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelmonths() {
        if (fJLabelmonths == null) {
            try {
                 fJLabelmonths = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelmonths.setText(resBundel.getString("res_strmonthsDisplayName")); // Generated
                 fJLabelmonths.setToolTipText(resBundel.getString("res_strmonthsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelmonths;
    }


    /**
     * This method initializes  fJPanelmonths
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelmonths() {
        if (fJPanelmonths == null) {
            try {
                fJPanelmonths = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelmonths.setLayout(layFlowLayout); // Generated
                fJPanelmonths.add(getJLabelmonths(), null); // Generated
                fJPanelmonths.add(getStringTextFieldmonths(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelmonths;
    }
//end DB field months
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
//start DB field pri
    /**
     * This method initializes fStringTextFieldpri
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpri() {
        if (fStringTextFieldpri == null) {
            try {
                fStringTextFieldpri = new StringTextField(); // Generated
                fStringTextFieldpri.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpri;
    }
        
    /**
     * This method initializes  fJLabelpri
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpri() {
        if (fJLabelpri == null) {
            try {
                 fJLabelpri = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelpri.setText(resBundel.getString("res_strpriDisplayName")); // Generated
                 fJLabelpri.setToolTipText(resBundel.getString("res_strpriDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelpri;
    }


    /**
     * This method initializes  fJPanelpri
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpri() {
        if (fJPanelpri == null) {
            try {
                fJPanelpri = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpri.setLayout(layFlowLayout); // Generated
                fJPanelpri.add(getJLabelpri(), null); // Generated
                fJPanelpri.add(getStringTextFieldpri(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpri;
    }
//end DB field pri

}

	