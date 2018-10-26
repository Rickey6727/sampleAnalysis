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
public class MAfterExchangeListener implements EntityListener<MAfterExchange> {

    @Override
    public void preInsert(MAfterExchange entity, PreInsertContext<MAfterExchange> context) {
    }

    @Override
    public void preUpdate(MAfterExchange entity, PreUpdateContext<MAfterExchange> context) {
    }

    @Override
    public void preDelete(MAfterExchange entity, PreDeleteContext<MAfterExchange> context) {
    }

    @Override
    public void postInsert(MAfterExchange entity, PostInsertContext<MAfterExchange> context) {
    }

    @Override
    public void postUpdate(MAfterExchange entity, PostUpdateContext<MAfterExchange> context) {
    }

    @Override
    public void postDelete(MAfterExchange entity, PostDeleteContext<MAfterExchange> context) {
    }
}