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
 * PeerType,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: PeerType.java,v 1.6 2006/01/06 19:04:05 urs
 *          Exp $
 */
public class PeerType extends AbstractSimpleEnum {
    public static final String[] ENAMES = { "friend", "user", "peer" };

    /**  */
    public static final String ENAME_FRIEND = "friend";

    /**  */
    public static final String ENAME_USER = "user";

    /**  */
    public static final String ENAME_PEER = "peer";

    /**  */
    public static final int EVAL_FRIEND = 0;

    /**  */
    public static final int EVAL_USER = 1;

    /**  */
    public static final int EVAL_PEER = 2;

    /**
     * @param type
     */
    public PeerType() {
        super();
    }

    /**
     * @param type
     */
    public PeerType(String type) {
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
        return new PeerType(name);
    }

}
