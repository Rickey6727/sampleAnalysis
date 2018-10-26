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
public class MExchangeSpMessageListener implements EntityListener<MExchangeSpMessage> {

    @Override
    public void preInsert(MExchangeSpMessage entity, PreInsertContext<MExchangeSpMessage> context) {
    }

    @Override
    public void preUpdate(MExchangeSpMessage entity, PreUpdateContext<MExchangeSpMessage> context) {
    }

    @Override
    public void preDelete(MExchangeSpMessage entity, PreDeleteContext<MExchangeSpMessage> context) {
    }

    @Override
    public void postInsert(MExchangeSpMessage entity, PostInsertContext<MExchangeSpMessage> context) {
    }

    @Override
    public void postUpdate(MExchangeSpMessage entity, PostUpdateContext<MExchangeSpMessage> context) {
    }

    @Override
    public void postDelete(MExchangeSpMessage entity, PostDeleteContext<MExchangeSpMessage> context) {
    }
}