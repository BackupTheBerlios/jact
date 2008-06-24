package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.DateTime;

/**
 * <p>
 * DateTimeDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:43 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DateTimeDataPanel.java,v 1.1 2008/06/24 20:44:54 urszeidler Exp $
 */
public class DateTimeDataPanel extends SimpleDataObjectPanel{
	protected DateTime dataObject;
	//protected DateTimeChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public DateTimeDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getDateTimeResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getDateTimeResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/DateTimeResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new DateTimeCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldunixtime,		
			fStringTextFieldtimezone,		
			fStringTextFieldformat,		
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
        this.add(getJPanelunixtime(), null); // Generated
        this.add(getJPaneltimezone(), null); // Generated
        this.add(getJPanelformat(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldunixtime.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldtimezone.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldformat.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldunixtime.setValue(dataObject.getUnixtime());
        fStringTextFieldtimezone.setValue(dataObject.getTimezone());
        fStringTextFieldformat.setValue(dataObject.getFormat());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setUnixtime(fStringTextFieldunixtime.getValue());
        dataObject.setTimezone(fStringTextFieldtimezone.getValue());
        dataObject.setFormat(fStringTextFieldformat.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param DateTime
	 */
	public void setDataObject(Object aDateTime) {
	    //abstractdataObject = (AbstractConfigObject) aDateTime;
		setDataObject((DateTime) aDateTime);
		//dataObject = aDateTime;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param DateTime
	 */
	public void setDataObject(DateTime aDateTime) {
	    //abstractdataObject = (AbstractConfigObject) aDateTime;
		dataObject = aDateTime;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldunixtime;
    protected javax.swing.JLabel fJLabelunixtime;
	protected javax.swing.JPanel fJPanelunixtime;
    protected StringTextField fStringTextFieldtimezone;
    protected javax.swing.JLabel fJLabeltimezone;
	protected javax.swing.JPanel fJPaneltimezone;
    protected StringTextField fStringTextFieldformat;
    protected javax.swing.JLabel fJLabelformat;
	protected javax.swing.JPanel fJPanelformat;
    

//start DB field unixtime
    /**
     * This method initializes fStringTextFieldunixtime
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldunixtime() {
        if (fStringTextFieldunixtime == null) {
            try {
                fStringTextFieldunixtime = new StringTextField(); // Generated
                fStringTextFieldunixtime.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldunixtime;
    }
        
    /**
     * This method initializes  fJLabelunixtime
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelunixtime() {
        if (fJLabelunixtime == null) {
            try {
                 fJLabelunixtime = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelunixtime.setText(resBundel.getString("res_strunixtimeDisplayName")); // Generated
                 fJLabelunixtime.setToolTipText(resBundel.getString("res_strunixtimeDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelunixtime;
    }


    /**
     * This method initializes  fJPanelunixtime
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelunixtime() {
        if (fJPanelunixtime == null) {
            try {
                fJPanelunixtime = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelunixtime.setLayout(layFlowLayout); // Generated
                fJPanelunixtime.add(getJLabelunixtime(), null); // Generated
                fJPanelunixtime.add(getStringTextFieldunixtime(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelunixtime;
    }
//end DB field unixtime
//start DB field timezone
    /**
     * This method initializes fStringTextFieldtimezone
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtimezone() {
        if (fStringTextFieldtimezone == null) {
            try {
                fStringTextFieldtimezone = new StringTextField(); // Generated
                fStringTextFieldtimezone.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtimezone;
    }
        
    /**
     * This method initializes  fJLabeltimezone
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltimezone() {
        if (fJLabeltimezone == null) {
            try {
                 fJLabeltimezone = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltimezone.setText(resBundel.getString("res_strtimezoneDisplayName")); // Generated
                 fJLabeltimezone.setToolTipText(resBundel.getString("res_strtimezoneDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltimezone;
    }


    /**
     * This method initializes  fJPaneltimezone
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltimezone() {
        if (fJPaneltimezone == null) {
            try {
                fJPaneltimezone = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltimezone.setLayout(layFlowLayout); // Generated
                fJPaneltimezone.add(getJLabeltimezone(), null); // Generated
                fJPaneltimezone.add(getStringTextFieldtimezone(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltimezone;
    }
//end DB field timezone
//start DB field format
    /**
     * This method initializes fStringTextFieldformat
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldformat() {
        if (fStringTextFieldformat == null) {
            try {
                fStringTextFieldformat = new StringTextField(); // Generated
                fStringTextFieldformat.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldformat;
    }
        
    /**
     * This method initializes  fJLabelformat
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelformat() {
        if (fJLabelformat == null) {
            try {
                 fJLabelformat = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelformat.setText(resBundel.getString("res_strformatDisplayName")); // Generated
                 fJLabelformat.setToolTipText(resBundel.getString("res_strformatDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelformat;
    }


    /**
     * This method initializes  fJPanelformat
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelformat() {
        if (fJPanelformat == null) {
            try {
                fJPanelformat = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelformat.setLayout(layFlowLayout); // Generated
                fJPanelformat.add(getJLabelformat(), null); // Generated
                fJPanelformat.add(getStringTextFieldformat(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelformat;
    }
//end DB field format

}

	