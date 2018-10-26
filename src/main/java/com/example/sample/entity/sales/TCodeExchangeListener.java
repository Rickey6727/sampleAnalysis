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
public class TCodeExchangeListener implements EntityListener<TCodeExchange> {

    @Override
    public void preInsert(TCodeExchange entity, PreInsertContext<TCodeExchange> context) {
    }

    @Override
    public void preUpdate(TCodeExchange entity, PreUpdateContext<TCodeExchange> context) {
    }

    @Override
    public void preDelete(TCodeExchange entity, PreDeleteContext<TCodeExchange> context) {
    }

    @Override
    public void postInsert(TCodeExchange entity, PostInsertContext<TCodeExchange> context) {
    }

    @Override
    public void postUpdate(TCodeExchange entity, PostUpdateContext<TCodeExchange> context) {
    }

    @Override
    public void postDelete(TCodeExchange entity, PostDeleteContext<TCodeExchange> context) {
    }
}