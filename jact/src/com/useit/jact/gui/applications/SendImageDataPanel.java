package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.SendImage;

/**
 * <p>
 * SendImageDataPanel
 * </p>
 * Created : Mon Jul 10 18:05:41 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SendImageDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class SendImageDataPanel extends SimpleDataObjectPanel{
	protected SendImage dataObject;
	//protected SendImageChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public SendImageDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getSendImageResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getSendImageResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/SendImageResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new SendImageCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldfilename,		
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
        this.add(getJPanelfilename(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldfilename.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldfilename.setValue(dataObject.getFilename());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFilename(fStringTextFieldfilename.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param SendImage
	 */
	public void setDataObject(Object aSendImage) {
	    //abstractdataObject = (AbstractConfigObject) aSendImage;
		setDataObject((SendImage) aSendImage);
		//dataObject = aSendImage;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param SendImage
	 */
	public void setDataObject(SendImage aSendImage) {
	    //abstractdataObject = (AbstractConfigObject) aSendImage;
		dataObject = aSendImage;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldfilename;
    protected javax.swing.JLabel fJLabelfilename;
	protected javax.swing.JPanel fJPanelfilename;
    

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

}

	