package com.example.sample.entity.sales;

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
public class MBeforeExchangeListener implements EntityListener<MBeforeExchange> {

    @Override
    public void preInsert(MBeforeExchange entity, PreInsertContext<MBeforeExchange> context) {
    }

    @Override
    public void preUpdate(MBeforeExchange entity, PreUpdateContext<MBeforeExchange> context) {
    }

    @Override
    public void preDelete(MBeforeExchange entity, PreDeleteContext<MBeforeExchange> context) {
    }

    @Override
    public void postInsert(MBeforeExchange entity, PostInsertContext<MBeforeExchange> context) {
    }

    @Override
    public void postUpdate(MBeforeExchange entity, PostUpdateContext<MBeforeExchange> context) {
    }

    @Override
    public void postDelete(MBeforeExchange entity, PostDeleteContext<MBeforeExchange> context) {
    }
}