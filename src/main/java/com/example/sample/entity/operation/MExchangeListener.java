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
public class MExchangeListener implements EntityListener<MExchange> {

    @Override
    public void preInsert(MExchange entity, PreInsertContext<MExchange> context) {
    }

    @Override
    public void preUpdate(MExchange entity, PreUpdateContext<MExchange> context) {
    }

    @Override
    public void preDelete(MExchange entity, PreDeleteContext<MExchange> context) {
    }

    @Override
    public void postInsert(MExchange entity, PostInsertContext<MExchange> context) {
    }

    @Override
    public void postUpdate(MExchange entity, PostUpdateContext<MExchange> context) {
    }

    @Override
    public void postDelete(MExchange entity, PostDeleteContext<MExchange> context) {
    }
}