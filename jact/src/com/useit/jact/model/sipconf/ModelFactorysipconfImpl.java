/*
 * (c) urs zeidler
 */
package com.useit.jact.model.sipconf;

import com.useit.app.framework.model.dataModel.IModelFactory;
import com.useit.jact.model.types.ModelFactorypxbtypesImpl;



/** 
 * <p> 
 * ModelFactorysipconfImpl
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactorysipconfImpl.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $ 
 */
public  class ModelFactorysipconfImpl extends ModelFactorysipconf {

    public static final IModelFactory defaultModelFactory = new ModelFactorysipconfImpl();

    public ModelFactorysipconfImpl() {
        super();
        fact.add(new ModelFactorypxbtypesImpl());
    }

}

