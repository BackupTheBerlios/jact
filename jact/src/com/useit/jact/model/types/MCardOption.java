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
 * MCardOption,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MCardOption.java,v 1.4 2006/01/06 19:04:05
 *          urs Exp $
 */
public class MCardOption extends AbstractSimpleEnum {
    public static final String[] ENAMES = { "ulaw", "dtmf", "pcm_slave" };

    /**  */
    public static final String ENAME_ULAW = "ulaw";

    /**  */
    public static final String ENAME_DTMF = "dtmf";

    /**  */
    public static final String ENAME_PCM_SLAVE = "pcm_slave";

    /**  */
    public static final int EVAL_ULAW = 0;

    /**  */
    public static final int EVAL_DTMF = 1;

    /**  */
    public static final int EVAL_PCM_SLAVE = 2;

    /**
     * @param type
     */
    public MCardOption() {
        super();
    }

    /**
     * @param type
     */
    public MCardOption(String type) {
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
        return new MCardOption(name);
    }

}
