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
 * Presentation,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Presentation.java,v 1.4 2006/01/06 19:04:05
 *          urs Exp $
 */
public class Presentation extends AbstractSimpleEnum {
    public static final String[] ENAMES = { "allowed", "not_screened" };

    /**  */
    public static final String ENAME_ALLOWED = "allowed";

    /**  */
    public static final String ENAME_NOT_SCREENED = "not_screened";

    /**  */
    public static final int EVAL_ALLOWED = 0;

    /**  */
    public static final int EVAL_NOT_SCREENED = 1;

    /**
     * @param type
     */
    public Presentation() {
        super();
    }

    /**
     * @param type
     */
    public Presentation(String type) {
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
        return new Presentation(name);
    }

}
