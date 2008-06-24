/*
 * (c) urs zeidler
 */
package com.useit.jact.model.types;



/** 
 * <p> 
 * ModelFactorypxbtypesImpl
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactorypxbtypesImpl.java,v 1.1 2008/06/24 20:45:01 urszeidler Exp $ 
 */
public  class ModelFactorypxbtypesImpl extends ModelFactorypxbtypes {
private static final String INTEGER = "integer";
private static final String STRING = "string";
private static final String BOOLEAN = "boolean";

@Override
public Object createTypeFromString(Class type, String value) {
    if(String.class.isAssignableFrom(type))
        return value;
    if(Integer.class.isAssignableFrom(type))
        return createType_Integer(value);
    if(Boolean.class.isAssignableFrom(type))
        return createType_Boolean(value);
     return super.createTypeFromString(type, value);
     
}

private Object createType_Boolean(String value) {
    Boolean bool = Boolean.valueOf(value);
    return bool;
}

private Object createType_Integer(String value) {
    Integer integer = Integer.valueOf(value);
    return integer;
}

@Override
public Object createTypeFromString(String typeName, String value) {
    if(STRING.equalsIgnoreCase(typeName))
        return value;
    if(INTEGER.equalsIgnoreCase(typeName))
        return value;
    if(BOOLEAN.equalsIgnoreCase(typeName))
        return value;
    return super.createTypeFromString(typeName, value);
}
}

