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
public class MExchangeSideListener implements EntityListener<MExchangeSide> {

    @Override
    public void preInsert(MExchangeSide entity, PreInsertContext<MExchangeSide> context) {
    }

    @Override
    public void preUpdate(MExchangeSide entity, PreUpdateContext<MExchangeSide> context) {
    }

    @Override
    public void preDelete(MExchangeSide entity, PreDeleteContext<MExchangeSide> context) {
    }

    @Override
    public void postInsert(MExchangeSide entity, PostInsertContext<MExchangeSide> context) {
    }

    @Override
    public void postUpdate(MExchangeSide entity, PostUpdateContext<MExchangeSide> context) {
    }

    @Override
    public void postDelete(MExchangeSide entity, PostDeleteContext<MExchangeSide> context) {
    }
}