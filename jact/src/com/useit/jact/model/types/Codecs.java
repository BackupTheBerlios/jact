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
 * Codecs,
 * </p>
 * Created : 04.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Codecs.java,v 1.1 2008/06/24 20:45:01 urszeidler Exp $
 */
public class Codecs extends AbstractSimpleEnum {
    public static final String[] ENAMES = { "ilbc", "lpc10", "g723_1", "speex",
            "slin", "ulaw", "adpcm", "g726", "g729", "alaw", "gsm", "all" };

    /**  */
    public static final String ENAME_ILBC = "ilbc";

    /**  */
    public static final String ENAME_LPC10 = "lpc10";

    /**  */
    public static final String ENAME_G723_1 = "g723_1";

    /**  */
    public static final String ENAME_SPEEX = "speex";

    /**  */
    public static final String ENAME_SLIN = "slin";

    /**  */
    public static final String ENAME_ULAW = "ulaw";

    /**  */
    public static final String ENAME_ADPCM = "adpcm";

    /**  */
    public static final String ENAME_G726 = "g726";

    /**  */
    public static final String ENAME_G729 = "g729";

    /**  */
    public static final String ENAME_ALAW = "alaw";

    /**  */
    public static final String ENAME_GSM = "gsm";

    /**  */
    public static final String ENAME_ALL = "all";

    /**  */
    public static final int EVAL_ILBC = 0;

    /**  */
    public static final int EVAL_LPC10 = 1;

    /**  */
    public static final int EVAL_G723_1 = 2;

    /**  */
    public static final int EVAL_SPEEX = 3;

    /**  */
    public static final int EVAL_SLIN = 4;

    /**  */
    public static final int EVAL_ULAW = 5;

    /**  */
    public static final int EVAL_ADPCM = 6;

    /**  */
    public static final int EVAL_G726 = 7;

    /**  */
    public static final int EVAL_G729 = 8;

    /**  */
    public static final int EVAL_ALAW = 9;

    /**  */
    public static final int EVAL_GSM = 10;

    /**  */
    public static final int EVAL_ALL = 11;

    /**
     * @param type
     */
    public Codecs() {
        super();
    }

    /**
     * @param type
     */
    public Codecs(String type) {
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
        return new Codecs(name);
    }

}
