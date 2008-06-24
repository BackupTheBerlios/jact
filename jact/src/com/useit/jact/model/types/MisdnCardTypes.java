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
 * MisdnCardTypes, Kartentypen
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnCardTypes.java,v 1.7 2006/01/06 19:04:05
 *          urs Exp $
 */
public class MisdnCardTypes extends AbstractSimpleEnum {
    public static final String[] ENAMES = { "hfcmulti", "avmfritz", "hfpci",
            "hfcmulti8s0", "hfcmulti4s0" };

    /**  */
    public static final String ENAME_HFCMULTI = "hfcmulti";

    /**  */
    public static final String ENAME_AVMFRITZ = "avmfritz";

    /**  */
    public static final String ENAME_HFPCI = "hfpci";

    /**  */
    public static final String ENAME_HFCMULTI8S0 = "hfcmulti8s0";

    /**  */
    public static final String ENAME_HFCMULTI4S0 = "hfcmulti4s0";

    /**  */
    public static final int EVAL_HFCMULTI = 0;

    /**  */
    public static final int EVAL_AVMFRITZ = 1;

    /**  */
    public static final int EVAL_HFPCI = 2;

    /**  */
    public static final int EVAL_HFCMULTI8S0 = 3;

    /**  */
    public static final int EVAL_HFCMULTI4S0 = 4;

    /**
     * @param type
     */
    public MisdnCardTypes() {
        super();
    }

    /**
     * @param type
     */
    public MisdnCardTypes(String type) {
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
        return new MisdnCardTypes(name);
    }

}
