package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.TestClient;

/**
 * <p>
 * TestClientDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:14 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: TestClientDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class TestClientDataPanel extends SimpleDataObjectPanel{
	protected TestClient dataObject;
	//protected TestClientChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public TestClientDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getTestClientResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getTestClientResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/TestClientResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new TestClientCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldtestid,		
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
        this.add(getJPaneltestid(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldtestid.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldtestid.setValue(dataObject.getTestid());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setTestid(fStringTextFieldtestid.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param TestClient
	 */
	public void setDataObject(Object aTestClient) {
	    //abstractdataObject = (AbstractConfigObject) aTestClient;
		setDataObject((TestClient) aTestClient);
		//dataObject = aTestClient;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param TestClient
	 */
	public void setDataObject(TestClient aTestClient) {
	    //abstractdataObject = (AbstractConfigObject) aTestClient;
		dataObject = aTestClient;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldtestid;
    protected javax.swing.JLabel fJLabeltestid;
	protected javax.swing.JPanel fJPaneltestid;
    

//start DB field testid
    /**
     * This method initializes fStringTextFieldtestid
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldtestid() {
        if (fStringTextFieldtestid == null) {
            try {
                fStringTextFieldtestid = new StringTextField(); // Generated
                fStringTextFieldtestid.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldtestid;
    }
        
    /**
     * This method initializes  fJLabeltestid
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabeltestid() {
        if (fJLabeltestid == null) {
            try {
                 fJLabeltestid = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabeltestid.setText(resBundel.getString("res_strtestidDisplayName")); // Generated
                 fJLabeltestid.setToolTipText(resBundel.getString("res_strtestidDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabeltestid;
    }


    /**
     * This method initializes  fJPaneltestid
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPaneltestid() {
        if (fJPaneltestid == null) {
            try {
                fJPaneltestid = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPaneltestid.setLayout(layFlowLayout); // Generated
                fJPaneltestid.add(getJLabeltestid(), null); // Generated
                fJPaneltestid.add(getStringTextFieldtestid(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPaneltestid;
    }
//end DB field testid

}

	