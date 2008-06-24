package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.StripLSD;

/**
 * <p>
 * StripLSDDataPanel
 * </p>
 * Created : Mon Jul 10 18:07:20 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: StripLSDDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class StripLSDDataPanel extends SimpleDataObjectPanel{
	protected StripLSD dataObject;
	//protected StripLSDChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public StripLSDDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getStripLSDResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getStripLSDResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/StripLSDResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new StripLSDCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldcount,		
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
		this.setSize(400,(1)*30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(1); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelcount(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldcount.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldcount.setValue(dataObject.getCount());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setCount(fStringTextFieldcount.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param StripLSD
	 */
	public void setDataObject(Object aStripLSD) {
	    //abstractdataObject = (AbstractConfigObject) aStripLSD;
		setDataObject((StripLSD) aStripLSD);
		//dataObject = aStripLSD;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param StripLSD
	 */
	public void setDataObject(StripLSD aStripLSD) {
	    //abstractdataObject = (AbstractConfigObject) aStripLSD;
		dataObject = aStripLSD;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldcount;
    protected javax.swing.JLabel fJLabelcount;
	protected javax.swing.JPanel fJPanelcount;
    

//start DB field count
    /**
     * This method initializes fStringTextFieldcount
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldcount() {
        if (fStringTextFieldcount == null) {
            try {
                fStringTextFieldcount = new StringTextField(); // Generated
                fStringTextFieldcount.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldcount;
    }
        
    /**
     * This method initializes  fJLabelcount
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelcount() {
        if (fJLabelcount == null) {
            try {
                 fJLabelcount = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelcount.setText(resBundel.getString("res_strcountDisplayName")); // Generated
                 fJLabelcount.setToolTipText(resBundel.getString("res_strcountDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelcount;
    }


    /**
     * This method initializes  fJPanelcount
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelcount() {
        if (fJPanelcount == null) {
            try {
                fJPanelcount = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelcount.setLayout(layFlowLayout); // Generated
                fJPanelcount.add(getJLabelcount(), null); // Generated
                fJPanelcount.add(getStringTextFieldcount(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelcount;
    }
//end DB field count

}

	