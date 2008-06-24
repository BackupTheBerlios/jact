/*
 * (c) urs zeidler
 */
package com.useit.jact.model.agentconf;

import com.useit.jact.model.types.ModelFactorypxbtypesImpl;



/** 
 * <p> 
 * ModelFactoryagentconfImpl
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryagentconfImpl.java,v 1.1 2008/06/24 20:45:19 urszeidler Exp $ 
 */
public  class ModelFactoryagentconfImpl extends ModelFactoryagentconf {

    public ModelFactoryagentconfImpl() {
        super();
        fact.add(new ModelFactorypxbtypesImpl());
    }

}

