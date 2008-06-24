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
 * Switchtype, Sets the type of PRI switch being used. Default: national.
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Switchtype.java,v 1.2 2006/01/06 19:04:05 urs
 *          Exp $
 */
public class Switchtype extends AbstractSimpleEnum {
    public static final String[] ENAMES = { "4ess", "dms100", "5ess",
            "euroisdn", "national", "qsig", "ni1" };

    /**  */
    public static final String ENAME_4ESS = "4ess";

    /**  */
    public static final String ENAME_DMS100 = "dms100";

    /**  */
    public static final String ENAME_5ESS = "5ess";

    /**  */
    public static final String ENAME_EUROISDN = "euroisdn";

    /**  */
    public static final String ENAME_NATIONAL = "national";

    /**  */
    public static final String ENAME_QSIG = "qsig";

    /**  */
    public static final String ENAME_NI1 = "ni1";

    /**  */
    public static final int EVAL_4ESS = 0;

    /**  */
    public static final int EVAL_DMS100 = 1;

    /**  */
    public static final int EVAL_5ESS = 2;

    /**  */
    public static final int EVAL_EUROISDN = 3;

    /**  */
    public static final int EVAL_NATIONAL = 4;

    /**  */
    public static final int EVAL_QSIG = 5;

    /**  */
    public static final int EVAL_NI1 = 6;

    /**
     * @param type
     */
    public Switchtype() {
        super();
    }

    /**
     * @param type
     */
    public Switchtype(String type) {
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
        return new Switchtype(name);
    }

}
