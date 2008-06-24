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
 * MisdnPortOptions, Port betriebsarten
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnPortOptions.java,v 1.7 2006/01/06
 *          19:04:05 urs Exp $
 */
public class MisdnPortOptions extends AbstractSimpleEnum {
    public static final String[] ENAMES = { "te_ptmp", "nt_ptp", "te_ptp",
            "nt_ptmp" };

    /**  */
    public static final String ENAME_TE_PTMP = "te_ptmp";

    /**  */
    public static final String ENAME_NT_PTP = "nt_ptp";

    /**  */
    public static final String ENAME_TE_PTP = "te_ptp";

    /**  */
    public static final String ENAME_NT_PTMP = "nt_ptmp";

    /**  */
    public static final int EVAL_TE_PTMP = 0;

    /**  */
    public static final int EVAL_NT_PTP = 1;

    /**  */
    public static final int EVAL_TE_PTP = 2;

    /**  */
    public static final int EVAL_NT_PTMP = 3;

    /**
     * @param type
     */
    public MisdnPortOptions() {
        super();
    }

    /**
     * @param type
     */
    public MisdnPortOptions(String type) {
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
        return new MisdnPortOptions(name);
    }

}
