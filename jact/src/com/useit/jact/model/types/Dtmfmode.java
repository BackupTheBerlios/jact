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
 * Dtmfmode,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Dtmfmode.java,v 1.6 2006/01/06 19:04:05 urs
 *          Exp $
 */
public class Dtmfmode extends AbstractSimpleEnum {
    public static final String[] ENAMES = { "info", "inband", "rfc2833" };

    /**  */
    public static final String ENAME_INFO = "info";

    /**  */
    public static final String ENAME_INBAND = "inband";

    /**  */
    public static final String ENAME_RFC2833 = "rfc2833";

    /**  */
    public static final int EVAL_INFO = 0;

    /**  */
    public static final int EVAL_INBAND = 1;

    /**  */
    public static final int EVAL_RFC2833 = 2;

    /**
     * @param type
     */
    public Dtmfmode() {
        super();
    }

    /**
     * @param type
     */
    public Dtmfmode(String type) {
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
        return new Dtmfmode(name);
    }

}
