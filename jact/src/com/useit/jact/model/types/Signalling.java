/*
 * (c) urs zeidler
 */
package com.useit.jact.model.types;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;

import com.useit.app.framework.model.types.AbstractSimpleEnum;

/**
 * <p>
 * Signalling, The signalling type to use with your interface is the only
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
 * @version $Revision: 1.1 $, $Id: Signalling.java,v 1.2 2006/01/06 19:04:05 urs
 *          Exp $
 */
public class Signalling extends AbstractSimpleEnum {
    public static final String[] ENAMES = { "fxo_ks", "em_e1", "sf_tx",
            "fxs_rx", "fxo_ls", "featd", "pri_net", "em", "pri_cpe", "sf_txrx",
            "sf_featb", "fxs_gs", "e911", "fxs_tx", "fxs_ks", "fxo_gs",
            "sf_featdmf", "featb", "featdmf", "em_txrx", "em_rx", "fxo_rx",
            "sf", "fxo_tx", "sf_featd", "sf_rxtx", "sf_rx", "sf_w", "em_tx",
            "fxs_ls", "em_rxtx", "em_w" };

    /**  */
    public static final String ENAME_FXO_KS = "fxo_ks";

    /**  */
    public static final String ENAME_EM_E1 = "em_e1";

    /**  */
    public static final String ENAME_SF_TX = "sf_tx";

    /**  */
    public static final String ENAME_FXS_RX = "fxs_rx";

    /**  */
    public static final String ENAME_FXO_LS = "fxo_ls";

    /**  */
    public static final String ENAME_FEATD = "featd";

    /**  */
    public static final String ENAME_PRI_NET = "pri_net";

    /**  */
    public static final String ENAME_EM = "em";

    /**  */
    public static final String ENAME_PRI_CPE = "pri_cpe";

    /**  */
    public static final String ENAME_SF_TXRX = "sf_txrx";

    /**  */
    public static final String ENAME_SF_FEATB = "sf_featb";

    /**  */
    public static final String ENAME_FXS_GS = "fxs_gs";

    /**  */
    public static final String ENAME_E911 = "e911";

    /**  */
    public static final String ENAME_FXS_TX = "fxs_tx";

    /**  */
    public static final String ENAME_FXS_KS = "fxs_ks";

    /**  */
    public static final String ENAME_FXO_GS = "fxo_gs";

    /**  */
    public static final String ENAME_SF_FEATDMF = "sf_featdmf";

    /**  */
    public static final String ENAME_FEATB = "featb";

    /**  */
    public static final String ENAME_FEATDMF = "featdmf";

    /**  */
    public static final String ENAME_EM_TXRX = "em_txrx";

    /**  */
    public static final String ENAME_EM_RX = "em_rx";

    /**  */
    public static final String ENAME_FXO_RX = "fxo_rx";

    /**  */
    public static final String ENAME_SF = "sf";

    /**  */
    public static final String ENAME_FXO_TX = "fxo_tx";

    /**  */
    public static final String ENAME_SF_FEATD = "sf_featd";

    /**  */
    public static final String ENAME_SF_RXTX = "sf_rxtx";

    /**  */
    public static final String ENAME_SF_RX = "sf_rx";

    /**  */
    public static final String ENAME_SF_W = "sf_w";

    /**  */
    public static final String ENAME_EM_TX = "em_tx";

    /**  */
    public static final String ENAME_FXS_LS = "fxs_ls";

    /**  */
    public static final String ENAME_EM_RXTX = "em_rxtx";

    /**  */
    public static final String ENAME_EM_W = "em_w";

    /**  */
    public static final int EVAL_FXO_KS = 0;

    /**  */
    public static final int EVAL_EM_E1 = 1;

    /**  */
    public static final int EVAL_SF_TX = 2;

    /**  */
    public static final int EVAL_FXS_RX = 3;

    /**  */
    public static final int EVAL_FXO_LS = 4;

    /**  */
    public static final int EVAL_FEATD = 5;

    /**  */
    public static final int EVAL_PRI_NET = 6;

    /**  */
    public static final int EVAL_EM = 7;

    /**  */
    public static final int EVAL_PRI_CPE = 8;

    /**  */
    public static final int EVAL_SF_TXRX = 9;

    /**  */
    public static final int EVAL_SF_FEATB = 10;

    /**  */
    public static final int EVAL_FXS_GS = 11;

    /**  */
    public static final int EVAL_E911 = 12;

    /**  */
    public static final int EVAL_FXS_TX = 13;

    /**  */
    public static final int EVAL_FXS_KS = 14;

    /**  */
    public static final int EVAL_FXO_GS = 15;

    /**  */
    public static final int EVAL_SF_FEATDMF = 16;

    /**  */
    public static final int EVAL_FEATB = 17;

    /**  */
    public static final int EVAL_FEATDMF = 18;

    /**  */
    public static final int EVAL_EM_TXRX = 19;

    /**  */
    public static final int EVAL_EM_RX = 20;

    /**  */
    public static final int EVAL_FXO_RX = 21;

    /**  */
    public static final int EVAL_SF = 22;

    /**  */
    public static final int EVAL_FXO_TX = 23;

    /**  */
    public static final int EVAL_SF_FEATD = 24;

    /**  */
    public static final int EVAL_SF_RXTX = 25;

    /**  */
    public static final int EVAL_SF_RX = 26;

    /**  */
    public static final int EVAL_SF_W = 27;

    /**  */
    public static final int EVAL_EM_TX = 28;

    /**  */
    public static final int EVAL_FXS_LS = 29;

    /**  */
    public static final int EVAL_EM_RXTX = 30;

    /**  */
    public static final int EVAL_EM_W = 31;

    /**
     * @param type
     */
    public Signalling() {
        super();
    }

    /**
     * @param type
     */
    public Signalling(String type) {
        super(type);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.app.framework.model.types.AbstractSimpleEnum#getEnumList()
     */
    public String[] getEnumList() {
        return ENAMES;
    }

    public Object nullSafeGet(ResultSet resultSet, String[] names, Object owner)
            throws HibernateException, SQLException {
        String name = resultSet.getString(names[0]);
        return new Signalling(name);
    }

}
