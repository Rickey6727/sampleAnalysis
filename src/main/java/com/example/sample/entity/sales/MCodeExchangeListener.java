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
public class MCodeExchangeListener implements EntityListener<MCodeExchange> {

    @Override
    public void preInsert(MCodeExchange entity, PreInsertContext<MCodeExchange> context) {
    }

    @Override
    public void preUpdate(MCodeExchange entity, PreUpdateContext<MCodeExchange> context) {
    }

    @Override
    public void preDelete(MCodeExchange entity, PreDeleteContext<MCodeExchange> context) {
    }

    @Override
    public void postInsert(MCodeExchange entity, PostInsertContext<MCodeExchange> context) {
    }

    @Override
    public void postUpdate(MCodeExchange entity, PostUpdateContext<MCodeExchange> context) {
    }

    @Override
    public void postDelete(MCodeExchange entity, PostDeleteContext<MCodeExchange> context) {
    }
}