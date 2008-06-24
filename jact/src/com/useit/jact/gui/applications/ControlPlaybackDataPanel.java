package com.useit.jact.gui.applications;

import java.util.ResourceBundle;

import javax.swing.JToolTip;

import com.useit.app.framework.gui.guiHelper.JMultiLineToolTip;
import com.useit.app.framework.gui.guiHelper.SimpleDataObjectPanel;
import com.useit.jact.gui.widgets.StringTextField;
import com.useit.jact.model.applications.ControlPlayback;

/**
 * <p>
 * ControlPlaybackDataPanel
 * </p>
 * Created : Mon Jul 10 18:06:54 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ControlPlaybackDataPanel.java,v 1.1 2008/06/24 20:44:55 urszeidler Exp $
 */
public class ControlPlaybackDataPanel extends SimpleDataObjectPanel{
	protected ControlPlayback dataObject;
	//protected ControlPlaybackChecker dataChecker;

	
	/**
	 * initalisiert die Resourcen alleine
	 * This is the default constructor
	 */
	public ControlPlaybackDataPanel() {
		super();
		//super(ApplicationConfig.getInstance().getConfigResManager().getControlPlaybackResFile(),
		//ApplicationConfig.getInstance().getDefaultRes());
		//resBundel = ApplicationConfig.getInstance().getConfigResManager().getControlPlaybackResFile();
		//defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
		resBundel = ResourceBundle.getBundle("resourceBundels/ControlPlaybackResFile");
		defaultresBundel = ResourceBundle.getBundle("resourceBundels/DefaultResBundel");
		
		//initialize();
	}


/**	
	private void initDatachecker() {
		//dataChecker = new ControlPlaybackCheckerImpl(resBundel);
		//abstractDataChecker = dataChecker;
		
		Object[] array = {
			fStringTextFieldfilename,		
			fStringTextFieldskipms,		
			fStringTextFieldffchar,		
			fStringTextFieldrewchar,		
			fStringTextFieldstopchar,		
			fStringTextFieldpausechr,		
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
        this.add(getJPanelfilename(), null); // Generated
        this.add(getJPanelskipms(), null); // Generated
        this.add(getJPanelffchar(), null); // Generated
        this.add(getJPanelrewchar(), null); // Generated
        this.add(getJPanelstopchar(), null); // Generated
        this.add(getJPanelpausechr(), null); // Generated
	initActions();		
	}
//-----------------------------
	public void initActions() {
	super.initActions();
		fStringTextFieldfilename.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldskipms.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldffchar.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldrewchar.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldstopchar.getDocument().addDocumentListener(textChangeAct);
		fStringTextFieldpausechr.getDocument().addDocumentListener(textChangeAct);

}

//------------------------------
//set the data
protected  void setConfigToWidget(){
   		textChangeAct.setEnabled(false);
        fStringTextFieldfilename.setValue(dataObject.getFilename());
        fStringTextFieldskipms.setValue(dataObject.getSkipms());
        fStringTextFieldffchar.setValue(dataObject.getFfchar());
        fStringTextFieldrewchar.setValue(dataObject.getRewchar());
        fStringTextFieldstopchar.setValue(dataObject.getStopchar());
        fStringTextFieldpausechr.setValue(dataObject.getPausechr());


   		textChangeAct.setEnabled(true);   		
   }
// get the Data
    protected void getConfigFromWidget() {
        dataObject.setFilename(fStringTextFieldfilename.getValue());
        dataObject.setSkipms(fStringTextFieldskipms.getValue());
        dataObject.setFfchar(fStringTextFieldffchar.getValue());
        dataObject.setRewchar(fStringTextFieldrewchar.getValue());
        dataObject.setStopchar(fStringTextFieldstopchar.getValue());
        dataObject.setPausechr(fStringTextFieldpausechr.getValue());
	}

	/**
	 * setzt das DatenObject
	 * @param ControlPlayback
	 */
	public void setDataObject(Object aControlPlayback) {
	    //abstractdataObject = (AbstractConfigObject) aControlPlayback;
		setDataObject((ControlPlayback) aControlPlayback);
		//dataObject = aControlPlayback;
		//setConfigToWidget();
	}


	/**
	 * setzt das DatenObject
	 * @param ControlPlayback
	 */
	public void setDataObject(ControlPlayback aControlPlayback) {
	    //abstractdataObject = (AbstractConfigObject) aControlPlayback;
		dataObject = aControlPlayback;
		setConfigToWidget();
	}
//--------------------------------defaultActions.vm
//--------------------------------createWidgets.vm

    protected StringTextField fStringTextFieldfilename;
    protected javax.swing.JLabel fJLabelfilename;
	protected javax.swing.JPanel fJPanelfilename;
    protected StringTextField fStringTextFieldskipms;
    protected javax.swing.JLabel fJLabelskipms;
	protected javax.swing.JPanel fJPanelskipms;
    protected StringTextField fStringTextFieldffchar;
    protected javax.swing.JLabel fJLabelffchar;
	protected javax.swing.JPanel fJPanelffchar;
    protected StringTextField fStringTextFieldrewchar;
    protected javax.swing.JLabel fJLabelrewchar;
	protected javax.swing.JPanel fJPanelrewchar;
    protected StringTextField fStringTextFieldstopchar;
    protected javax.swing.JLabel fJLabelstopchar;
	protected javax.swing.JPanel fJPanelstopchar;
    protected StringTextField fStringTextFieldpausechr;
    protected javax.swing.JLabel fJLabelpausechr;
	protected javax.swing.JPanel fJPanelpausechr;
    

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
//start DB field skipms
    /**
     * This method initializes fStringTextFieldskipms
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldskipms() {
        if (fStringTextFieldskipms == null) {
            try {
                fStringTextFieldskipms = new StringTextField(); // Generated
                fStringTextFieldskipms.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldskipms;
    }
        
    /**
     * This method initializes  fJLabelskipms
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelskipms() {
        if (fJLabelskipms == null) {
            try {
                 fJLabelskipms = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelskipms.setText(resBundel.getString("res_strskipmsDisplayName")); // Generated
                 fJLabelskipms.setToolTipText(resBundel.getString("res_strskipmsDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelskipms;
    }


    /**
     * This method initializes  fJPanelskipms
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelskipms() {
        if (fJPanelskipms == null) {
            try {
                fJPanelskipms = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelskipms.setLayout(layFlowLayout); // Generated
                fJPanelskipms.add(getJLabelskipms(), null); // Generated
                fJPanelskipms.add(getStringTextFieldskipms(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelskipms;
    }
//end DB field skipms
//start DB field ffchar
    /**
     * This method initializes fStringTextFieldffchar
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldffchar() {
        if (fStringTextFieldffchar == null) {
            try {
                fStringTextFieldffchar = new StringTextField(); // Generated
                fStringTextFieldffchar.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldffchar;
    }
        
    /**
     * This method initializes  fJLabelffchar
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelffchar() {
        if (fJLabelffchar == null) {
            try {
                 fJLabelffchar = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelffchar.setText(resBundel.getString("res_strffcharDisplayName")); // Generated
                 fJLabelffchar.setToolTipText(resBundel.getString("res_strffcharDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelffchar;
    }


    /**
     * This method initializes  fJPanelffchar
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelffchar() {
        if (fJPanelffchar == null) {
            try {
                fJPanelffchar = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelffchar.setLayout(layFlowLayout); // Generated
                fJPanelffchar.add(getJLabelffchar(), null); // Generated
                fJPanelffchar.add(getStringTextFieldffchar(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelffchar;
    }
//end DB field ffchar
//start DB field rewchar
    /**
     * This method initializes fStringTextFieldrewchar
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldrewchar() {
        if (fStringTextFieldrewchar == null) {
            try {
                fStringTextFieldrewchar = new StringTextField(); // Generated
                fStringTextFieldrewchar.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldrewchar;
    }
        
    /**
     * This method initializes  fJLabelrewchar
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelrewchar() {
        if (fJLabelrewchar == null) {
            try {
                 fJLabelrewchar = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelrewchar.setText(resBundel.getString("res_strrewcharDisplayName")); // Generated
                 fJLabelrewchar.setToolTipText(resBundel.getString("res_strrewcharDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelrewchar;
    }


    /**
     * This method initializes  fJPanelrewchar
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelrewchar() {
        if (fJPanelrewchar == null) {
            try {
                fJPanelrewchar = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelrewchar.setLayout(layFlowLayout); // Generated
                fJPanelrewchar.add(getJLabelrewchar(), null); // Generated
                fJPanelrewchar.add(getStringTextFieldrewchar(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelrewchar;
    }
//end DB field rewchar
//start DB field stopchar
    /**
     * This method initializes fStringTextFieldstopchar
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldstopchar() {
        if (fStringTextFieldstopchar == null) {
            try {
                fStringTextFieldstopchar = new StringTextField(); // Generated
                fStringTextFieldstopchar.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldstopchar;
    }
        
    /**
     * This method initializes  fJLabelstopchar
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelstopchar() {
        if (fJLabelstopchar == null) {
            try {
                 fJLabelstopchar = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelstopchar.setText(resBundel.getString("res_strstopcharDisplayName")); // Generated
                 fJLabelstopchar.setToolTipText(resBundel.getString("res_strstopcharDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelstopchar;
    }


    /**
     * This method initializes  fJPanelstopchar
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelstopchar() {
        if (fJPanelstopchar == null) {
            try {
                fJPanelstopchar = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelstopchar.setLayout(layFlowLayout); // Generated
                fJPanelstopchar.add(getJLabelstopchar(), null); // Generated
                fJPanelstopchar.add(getStringTextFieldstopchar(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelstopchar;
    }
//end DB field stopchar
//start DB field pausechr
    /**
     * This method initializes fStringTextFieldpausechr
     *
     * @return StringTextField
     */
    public StringTextField getStringTextFieldpausechr() {
        if (fStringTextFieldpausechr == null) {
            try {
                fStringTextFieldpausechr = new StringTextField(); // Generated
                fStringTextFieldpausechr.setPreferredSize(new java.awt.Dimension(150, 20)); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fStringTextFieldpausechr;
    }
        
    /**
     * This method initializes  fJLabelpausechr
     *
     * @return javax.swing.JLabel
     */
    protected javax.swing.JLabel getJLabelpausechr() {
        if (fJLabelpausechr == null) {
            try {
                 fJLabelpausechr = new javax.swing.JLabel(){
                     public JToolTip createToolTip()
             		{
             			return new JMultiLineToolTip();
             		}    
                 }; // Generated
                 fJLabelpausechr.setText(resBundel.getString("res_strpausechrDisplayName")); // Generated
                 fJLabelpausechr.setToolTipText(resBundel.getString("res_strpausechrDescription")); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }

        return  fJLabelpausechr;
    }


    /**
     * This method initializes  fJPanelpausechr
     *
     * @return javax.swing.JPanel
     */
    protected javax.swing.JPanel getJPanelpausechr() {
        if (fJPanelpausechr == null) {
            try {
                fJPanelpausechr = new javax.swing.JPanel(); // Generated

                java.awt.FlowLayout layFlowLayout = new java.awt.FlowLayout(); // Generated
                layFlowLayout.setAlignment(java.awt.FlowLayout.RIGHT); // Generated
                fJPanelpausechr.setLayout(layFlowLayout); // Generated
                fJPanelpausechr.add(getJLabelpausechr(), null); // Generated
                fJPanelpausechr.add(getStringTextFieldpausechr(), null); // Generated
            } catch (java.lang.Throwable e) {
                e.printStackTrace();
            }
        }
        return fJPanelpausechr;
    }
//end DB field pausechr

}

	