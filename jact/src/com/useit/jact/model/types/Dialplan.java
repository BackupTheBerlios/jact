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
 * Dialplan,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Dialplan.java,v 1.4 2006/01/06 19:04:05 urs
 *          Exp $
 */
public class Dialplan extends AbstractSimpleEnum {
    public static final String[] ENAMES = { "national", "subscriber",
            "international", "unknown" };

    /**  */
    public static final String ENAME_NATIONAL = "national";

    /**  */
    public static final String ENAME_SUBSCRIBER = "subscriber";

    /**  */
    public static final String ENAME_INTERNATIONAL = "international";

    /**  */
    public static final String ENAME_UNKNOWN = "unknown";

    /**  */
    public static final int EVAL_NATIONAL = 0;

    /**  */
    public static final int EVAL_SUBSCRIBER = 1;

    /**  */
    public static final int EVAL_INTERNATIONAL = 2;

    /**  */
    public static final int EVAL_UNKNOWN = 3;

    /**
     * @param type
     */
    public Dialplan() {
        super();
    }

    /**
     * @param type
     */
    public Dialplan(String type) {
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
        return new Dialplan(name);
    }

}
