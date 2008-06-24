/*
 * (c) urs zeidler
 */
package com.useit.jact.model.types;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;

import com.useit.app.framework.model.types.AbstractSimpleEnum;
import com.useit.app.framework.model.types.AbstractSimpleEnumSet;

/**
 * <p>
 * SignallingSet, The signalling type to use with your interface is the only
 * mandatory setting. You must set a signalling type before allocating a
 * channel. If you are connecting analog telephone equipment, note that analog
 * phone signalling can be a source of some confusion. FXS channels are
 * signalled with FXO signalling, and vice versa. Asterisk 'talks' to internal
 * devices as the opposite side. An FXO interface card is signalled with FXS
 * signalling by Asterisk, and should be configured as such. signalling<paraDesc>Sets
 * the channel signaling type. These parameters should match the Zaptel driver
 * configuration. The setting to use depends partly on which interface card you
 * have. Asterisk will fail to start if a channel signaling definition is
 * incorrect or unworkable, if the statements do not match the Zaptel driver
 * configuration, or if the device is not present or properly configured. The
 * correct setting to use is almost certainly one of the following four<paraDesc>fxs_ks,
 * fxo_ks, pri_cpe or pri_net. This setting has no default value; you must set a
 * value before allocating a channel.
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SignallingSet.java,v 1.3 2006/01/09 10:17:34
 *          urs Exp $
 */
public class SignallingSet extends AbstractSimpleEnumSet {
    public static final String[] ENAMES = Signalling.ENAMES;

    /**  */
    public static final Signalling E_PRI_NET = new Signalling("pri_net");

    /**  */
    public static final Signalling E_SF_FEATDMF = new Signalling("sf_featdmf");

    /**  */
    public static final Signalling E_SF_FEATD = new Signalling("sf_featd");

    /**  */
    public static final Signalling E_EM_RXTX = new Signalling("em_rxtx");

    /**  */
    public static final Signalling E_FEATD = new Signalling("featd");

    /**  */
    public static final Signalling E_FXS_GS = new Signalling("fxs_gs");

    /**  */
    public static final Signalling E_FXO_RX = new Signalling("fxo_rx");

    /**  */
    public static final Signalling E_FXS_LS = new Signalling("fxs_ls");

    /**  */
    public static final Signalling E_FXS_TX = new Signalling("fxs_tx");

    /**  */
    public static final Signalling E_FXS_RX = new Signalling("fxs_rx");

    /**  */
    public static final Signalling E_FXO_KS = new Signalling("fxo_ks");

    /**  */
    public static final Signalling E_FEATB = new Signalling("featb");

    /**  */
    public static final Signalling E_SF_FEATB = new Signalling("sf_featb");

    /**  */
    public static final Signalling E_SF_RX = new Signalling("sf_rx");

    /**  */
    public static final Signalling E_SF_W = new Signalling("sf_w");

    /**  */
    public static final Signalling E_FXO_TX = new Signalling("fxo_tx");

    /**  */
    public static final Signalling E_EM = new Signalling("em");

    /**  */
    public static final Signalling E_EM_W = new Signalling("em_w");

    /**  */
    public static final Signalling E_FXO_LS = new Signalling("fxo_ls");

    /**  */
    public static final Signalling E_EM_TX = new Signalling("em_tx");

    /**  */
    public static final Signalling E_PRI_CPE = new Signalling("pri_cpe");

    /**  */
    public static final Signalling E_E911 = new Signalling("e911");

    /**  */
    public static final Signalling E_SF_TX = new Signalling("sf_tx");

    /**  */
    public static final Signalling E_EM_TXRX = new Signalling("em_txrx");

    /**  */
    public static final Signalling E_FEATDMF = new Signalling("featdmf");

    /**  */
    public static final Signalling E_SF = new Signalling("sf");

    /**  */
    public static final Signalling E_FXS_KS = new Signalling("fxs_ks");

    /**  */
    public static final Signalling E_FXO_GS = new Signalling("fxo_gs");

    /**  */
    public static final Signalling E_EM_RX = new Signalling("em_rx");

    /**  */
    public static final Signalling E_SF_TXRX = new Signalling("sf_txrx");

    /**  */
    public static final Signalling E_SF_RXTX = new Signalling("sf_rxtx");

    /**  */
    public static final Signalling E_EM_E1 = new Signalling("em_e1");

    /** alle statischen enums instancen in einem array * */
    public static final Signalling[] EINSTANCE = { E_PRI_NET, E_SF_FEATDMF,
            E_SF_FEATD, E_EM_RXTX, E_FEATD, E_FXS_GS, E_FXO_RX, E_FXS_LS,
            E_FXS_TX, E_FXS_RX, E_FXO_KS, E_FEATB, E_SF_FEATB, E_SF_RX, E_SF_W,
            E_FXO_TX, E_EM, E_EM_W, E_FXO_LS, E_EM_TX, E_PRI_CPE, E_E911,
            E_SF_TX, E_EM_TXRX, E_FEATDMF, E_SF, E_FXS_KS, E_FXO_GS, E_EM_RX,
            E_SF_TXRX, E_SF_RXTX, E_EM_E1 };

    /**
     * @param type
     */
    public SignallingSet() {
        super();
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public SignallingSet(String[] list) {
        super();
        makeEnumSet(list);
    }

    /**
     * erstellt den enums set aus dem Array der enum namen
     * 
     * @param type
     */
    public SignallingSet(String elist) {
        super(elist);
        // makeEnumSet(list);
    }

    public boolean add(Signalling en) {
        return enumSet.add(en);
    }

    public boolean add(String ename) {
        return enumSet.add(new Signalling(ename));
    }

    public boolean remove(Signalling en) {
        return enumSet.remove(en);
    }

    /**
     * erzeugt das enum aus einer Array liste von enumnames
     * 
     * @param list
     */
    public void makeEnumSet(String[] list) {
        for (int i = 0; i < list.length; i++) {
            String ename = list[i];
            add(new Signalling(ename));

        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.model.types.AbstractSimpleEnum#getEnumList()
     */
    public String[] getEnumList() {

        return ENAMES;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.model.types.AbstractSimpleEnumSet#getEnumInstanceList()
     */
    public AbstractSimpleEnum[] getEnumInstanceList() {
        return EINSTANCE;
    }

    public Object nullSafeGet(ResultSet resultSet, String[] names, Object owner)
            throws HibernateException, SQLException {
        String name = resultSet.getString(names[0]);
        return new SignallingSet(name);
    }

}
