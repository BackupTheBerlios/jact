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
 * Amaflags, Sets the AMA flags, affecting the categorization of entries in the
 * call detail records.
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Amaflags.java,v 1.2 2006/01/06 19:04:05 urs
 *          Exp $
 */
public class Amaflags extends AbstractSimpleEnum {
    public static final String[] ENAMES = { "default", "documentation",
            "billing", "omit" };

    /**  */
    public static final String ENAME_DEFAULT = "default";

    /**  */
    public static final String ENAME_DOCUMENTATION = "documentation";

    /**  */
    public static final String ENAME_BILLING = "billing";

    /**  */
    public static final String ENAME_OMIT = "omit";

    /**  */
    public static final int EVAL_DEFAULT = 0;

    /**  */
    public static final int EVAL_DOCUMENTATION = 1;

    /**  */
    public static final int EVAL_BILLING = 2;

    /**  */
    public static final int EVAL_OMIT = 3;

    /**
     * @param type
     */
    public Amaflags() {
        super();
    }

    /**
     * @param type
     */
    public Amaflags(String type) {
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
        return new Amaflags(name);
    }

}
