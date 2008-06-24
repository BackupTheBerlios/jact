package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.MeetMeCount;

/**
 * <p>
 * MeetMeCountDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:01 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetMeCountDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class MeetMeCountDataPanel extends SimpleDataObjectPanel{
	protected MeetMeCount dataObject;
	//protected MeetMeCountChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public MeetMeCountDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getMeetMeCountResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getMeetMeCountResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/MeetMeCountResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new MeetMeCountCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldconfno,		
			fStringTextFieldvar,		
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
		this.setSize(400,(2)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelconfno(), null); // Generated
        this.add(getJPanelvar(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldconfno.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldvar.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldconfno.setValue(dataObject.getConfno());
        fStringTextFieldvar.setValue(dataObject.getVar());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setConfno(fStringTextFieldconfno.getValue());
        dataObject.setVar(fStringTextFieldvar.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param MeetMeCount
	 */
	public void setDataObject(Object aMeetMeCount) {
	    //abstractdataObject = (AbstractConfigObject) aMeetMeCount;
		setDataObject((MeetMeCount) aMeetMeCount);
		//dataObject = aMeetMeCount;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param MeetMeCount
	 */
	public void setDataObject(MeetMeCount aMeetMeCount) {
	    //abstractdataObject = (AbstractConfigObject) aMeetMeCount;
		dataObject = aMeetMeCount;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldconfno;
    protected javax.swing.JLabel fJLabelconfno;
	protected javax.swing.JPanel fJPanelconfno;
    protected StringTextField fStringTextFieldvar;
    protected javax.swing.JLabel fJLabelvar;
	protected javax.swing.JPanel fJPanelvar;
    

//start DB field confno
    /**
     * This method initializes fStringTextFieldconfno
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldconfno() {
        if (fStringTextFieldconfno == null) {
            try {
                fStringTextFieldconfno = new StringTextField(); // Generated
                fStringTextFieldconfno.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldconfno;
    }
        
    /**
     * This method initializes  fJLabelconfno
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelconfno() {
        if (fJLabelconfno == null) {
            try {
                 fJLabelconfno = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelconfno.setText(resBundel.getString("res_strconfnoDisplayName")); // Generated
                 fJLabelconfno.setToolTipText(resBundel.getString("res_strconfnoDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelconfno;
    }


    /**
     * This method initializes  fJPanelconfno
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelconfno() {
        if (fJPanelconfno == null) {
            try {
                fJPanelconfno = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelconfno.setLayout(layFlowLayout); // Generated
                fJPanelconfno.add(getJLabelconfno(), null); // Generated
                fJPanelconfno.add(getStringTextFieldconfno(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelconfno;
    }
//end DB field confno
//start DB field var
    /**
     * This method initializes fStringTextFieldvar
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldvar() {
        if (fStringTextFieldvar == null) {
            try {
                fStringTextFieldvar = new StringTextField(); // Generated
                fStringTextFieldvar.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldvar;
    }
        
    /**
     * This method initializes  fJLabelvar
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelvar() {
        if (fJLabelvar == null) {
            try {
                 fJLabelvar = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelvar.setText(resBundel.getString("res_strvarDisplayName")); // Generated
                 fJLabelvar.setToolTipText(resBundel.getString("res_strvarDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelvar;
    }


    /**
     * This method initializes  fJPanelvar
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelvar() {
        if (fJPanelvar == null) {
            try {
                fJPanelvar = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelvar.setLayout(layFlowLayout); // Generated
                fJPanelvar.add(getJLabelvar(), null); // Generated
                fJPanelvar.add(getStringTextFieldvar(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelvar;
    }
//end DB field var

}

	