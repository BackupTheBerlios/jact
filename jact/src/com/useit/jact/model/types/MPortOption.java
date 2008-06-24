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
 * MPortOption,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MPortOption.java,v 1.4 2006/01/06 19:04:05
 *          urs Exp $
 */
public class MPortOption extends AbstractSimpleEnum {
    public static final String[] ENAMES = { "slip", "los", "optical",
            "master_clock", "ais" };

    /**  */
    public static final String ENAME_SLIP = "slip";

    /**  */
    public static final String ENAME_LOS = "los";

    /**  */
    public static final String ENAME_OPTICAL = "optical";

    /**  */
    public static final String ENAME_MASTER_CLOCK = "master_clock";

    /**  */
    public static final String ENAME_AIS = "ais";

    /**  */
    public static final int EVAL_SLIP = 0;

    /**  */
    public static final int EVAL_LOS = 1;

    /**  */
    public static final int EVAL_OPTICAL = 2;

    /**  */
    public static final int EVAL_MASTER_CLOCK = 3;

    /**  */
    public static final int EVAL_AIS = 4;

    /**
     * @param type
     */
    public MPortOption() {
        super();
    }

    /**
     * @param type
     */
    public MPortOption(String type) {
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
        return new MPortOption(name);
    }

}
