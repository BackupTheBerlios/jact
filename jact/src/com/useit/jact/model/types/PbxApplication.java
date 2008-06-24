/*
 * (c) urs zeidler
 */
package com.useit.jact.model.types;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.usertype.UserType;

import com.useit.jact.model.applications.ModelFactoryapplicationsImpl;

public class PbxApplication implements Serializable, UserType {

    private String appstring;

    public PbxApplication() {
        super();
    }

    public PbxApplication(String application) {
        super();
        this.appstring = application;
    }

    public String toString() {

        return appstring;
    }

    private static final int[] SQL_TYPES = { Types.VARCHAR };

    public int[] sqlTypes() {
        return SQL_TYPES;
    }

    public Object nullSafeGet(ResultSet resultSet, String[] names, Object owner)
            throws HibernateException, SQLException {
        String name = resultSet.getString(names[0]);
        return ModelFactoryapplicationsImpl.defaultModelFactory.createAppFromString(name); //new PbxApplication(name);
    }

    public void nullSafeSet(PreparedStatement preparedStatement, Object value,
            int index) throws HibernateException, SQLException {
        if (null == value) {
            preparedStatement.setNull(index, Types.VARCHAR);
        } else {
            preparedStatement.setString(index,
                    ((PbxApplication) value).toString());
        }
    }

    public Object deepCopy(Object value) throws HibernateException {
        return value;
    }

    public boolean isMutable() {
        return false;
    }

    public Object assemble(Serializable cached, Object owner)
            throws HibernateException {
        return cached;
    }

    public Serializable disassemble(Object value) throws HibernateException {
        return (Serializable) value;
    }

    public Object replace(Object original, Object target, Object owner)
            throws HibernateException {
        return original;
    }

    public int hashCode(Object x) throws HibernateException {
        return x.hashCode();
    }

    public boolean equals(Object x, Object y) throws HibernateException {
        if (x == y)
            return true;
        if (null == x || null == y)
            return false;
        return x.equals(y);
    }

    public Class returnedClass() {
        return getClass();
    }

}
