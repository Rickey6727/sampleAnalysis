package com.example.sample.entity.operation;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class MExchangeSideDescriptionListener implements EntityListener<MExchangeSideDescription> {

    @Override
    public void preInsert(MExchangeSideDescription entity, PreInsertContext<MExchangeSideDescription> context) {
    }

    @Override
    public void preUpdate(MExchangeSideDescription entity, PreUpdateContext<MExchangeSideDescription> context) {
    }

    @Override
    public void preDelete(MExchangeSideDescription entity, PreDeleteContext<MExchangeSideDescription> context) {
    }

    @Override
    public void postInsert(MExchangeSideDescription entity, PostInsertContext<MExchangeSideDescription> context) {
    }

    @Override
    public void postUpdate(MExchangeSideDescription entity, PostUpdateContext<MExchangeSideDescription> context) {
    }

    @Override
    public void postDelete(MExchangeSideDescription entity, PostDeleteContext<MExchangeSideDescription> context) {
    }
}