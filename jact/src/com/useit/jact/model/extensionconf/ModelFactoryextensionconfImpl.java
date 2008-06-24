/*
 * (c) urs zeidler
 */
package com.useit.jact.model.extensionconf;


import com.useit.app.framework.model.dataModel.IModelFactory;

/** 
 * <p> 
 * ModelFactoryextensionconfImpl
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryextensionconfImpl.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $ 
 */
public  class ModelFactoryextensionconfImpl extends ModelFactoryextensionconf {
    public static final IModelFactory defaultModelFactory = new ModelFactoryextensionconfImpl();

}

