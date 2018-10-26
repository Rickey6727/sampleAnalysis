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
public class MExchangeMessageListener implements EntityListener<MExchangeMessage> {

    @Override
    public void preInsert(MExchangeMessage entity, PreInsertContext<MExchangeMessage> context) {
    }

    @Override
    public void preUpdate(MExchangeMessage entity, PreUpdateContext<MExchangeMessage> context) {
    }

    @Override
    public void preDelete(MExchangeMessage entity, PreDeleteContext<MExchangeMessage> context) {
    }

    @Override
    public void postInsert(MExchangeMessage entity, PostInsertContext<MExchangeMessage> context) {
    }

    @Override
    public void postUpdate(MExchangeMessage entity, PostUpdateContext<MExchangeMessage> context) {
    }

    @Override
    public void postDelete(MExchangeMessage entity, PostDeleteContext<MExchangeMessage> context) {
    }
}