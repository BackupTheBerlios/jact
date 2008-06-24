package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ExecIfTime;

/**
 * <p>
 * ExecIfTimeDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:45 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExecIfTimeDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class ExecIfTimeDataPanel extends SimpleDataObjectPanel{
	protected ExecIfTime dataObject;
	//protected ExecIfTimeChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ExecIfTimeDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getExecIfTimeResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getExecIfTimeResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ExecIfTimeResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ExecIfTimeCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldtimes,		
			fStringTextFieldweekdays,		
			fStringTextFieldmdays,		
			fStringTextFieldmonths,		
			fStringTextFieldappname,		
			fStringTextFieldappdata,		
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
        this.add(getJPaneltimes(), null); // Generated
        this.add(getJPanelweekdays(), null); // Generated
        this.add(getJPanelmdays(), null); // Generated
        this.add(getJPanelmonths(), null); // Generated
        this.add(getJPanelappname(), null); // Generated
        this.add(getJPanelappdata(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldtimes.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldweekdays.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmdays.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldmonths.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldappname.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldappdata.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldtimes.setValue(dataObject.getTimes());
        fStringTextFieldweekdays.setValue(dataObject.getWeekdays());
        fStringTextFieldmdays.setValue(dataObject.getMdays());
        fStringTextFieldmonths.setValue(dataObject.getMonths());
        fStringTextFieldappname.setValue(dataObject.getAppname());
        fStringTextFieldappdata.setValue(dataObject.getAppdata());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setTimes(fStringTextFieldtimes.getValue());
        dataObject.setWeekdays(fStringTextFieldweekdays.getValue());
        dataObject.setMdays(fStringTextFieldmdays.getValue());
        dataObject.setMonths(fStringTextFieldmonths.getValue());
        dataObject.setAppname(fStringTextFieldappname.getValue());
        dataObject.setAppdata(fStringTextFieldappdata.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ExecIfTime
	 */
	public void setDataObject(Object aExecIfTime) {
	    //abstractdataObject = (AbstractConfigObject) aExecIfTime;
		setDataObject((ExecIfTime) aExecIfTime);
		//dataObject = aExecIfTime;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ExecIfTime
	 */
	public void setDataObject(ExecIfTime aExecIfTime) {
	    //abstractdataObject = (AbstractConfigObject) aExecIfTime;
		dataObject = aExecIfTime;
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
    protected StringTextField fStringTextFieldappname;
    protected javax.swing.JLabel fJLabelappname;
	protected javax.swing.JPanel fJPanelappname;
    protected StringTextField fStringTextFieldappdata;
    protected javax.swing.JLabel fJLabelappdata;
	protected javax.swing.JPanel fJPanelappdata;
    

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
//start DB field appname
    /**
     * This method initializes fStringTextFieldappname
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldappname() {
        if (fStringTextFieldappname == null) {
            try {
                fStringTextFieldappname = new StringTextField(); // Generated
                fStringTextFieldappname.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldappname;
    }
        
    /**
     * This method initializes  fJLabelappname
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelappname() {
        if (fJLabelappname == null) {
            try {
                 fJLabelappname = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelappname.setText(resBundel.getString("res_strappnameDisplayName")); // Generated
                 fJLabelappname.setToolTipText(resBundel.getString("res_strappnameDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelappname;
    }


    /**
     * This method initializes  fJPanelappname
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelappname() {
        if (fJPanelappname == null) {
            try {
                fJPanelappname = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelappname.setLayout(layFlowLayout); // Generated
                fJPanelappname.add(getJLabelappname(), null); // Generated
                fJPanelappname.add(getStringTextFieldappname(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelappname;
    }
//end DB field appname
//start DB field appdata
    /**
     * This method initializes fStringTextFieldappdata
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldappdata() {
        if (fStringTextFieldappdata == null) {
            try {
                fStringTextFieldappdata = new StringTextField(); // Generated
                fStringTextFieldappdata.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldappdata;
    }
        
    /**
     * This method initializes  fJLabelappdata
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelappdata() {
        if (fJLabelappdata == null) {
            try {
                 fJLabelappdata = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelappdata.setText(resBundel.getString("res_strappdataDisplayName")); // Generated
                 fJLabelappdata.setToolTipText(resBundel.getString("res_strappdataDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelappdata;
    }


    /**
     * This method initializes  fJPanelappdata
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelappdata() {
        if (fJPanelappdata == null) {
            try {
                fJPanelappdata = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelappdata.setLayout(layFlowLayout); // Generated
                fJPanelappdata.add(getJLabelappdata(), null); // Generated
                fJPanelappdata.add(getStringTextFieldappdata(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelappdata;
    }
//end DB field appdata

}

	