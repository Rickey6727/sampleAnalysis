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
public class MExchangeEventListener implements EntityListener<MExchangeEvent> {

    @Override
    public void preInsert(MExchangeEvent entity, PreInsertContext<MExchangeEvent> context) {
    }

    @Override
    public void preUpdate(MExchangeEvent entity, PreUpdateContext<MExchangeEvent> context) {
    }

    @Override
    public void preDelete(MExchangeEvent entity, PreDeleteContext<MExchangeEvent> context) {
    }

    @Override
    public void postInsert(MExchangeEvent entity, PostInsertContext<MExchangeEvent> context) {
    }

    @Override
    public void postUpdate(MExchangeEvent entity, PostUpdateContext<MExchangeEvent> context) {
    }

    @Override
    public void postDelete(MExchangeEvent entity, PostDeleteContext<MExchangeEvent> context) {
    }
}