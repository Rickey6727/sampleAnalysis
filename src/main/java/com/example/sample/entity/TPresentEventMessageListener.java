package com.example.sample.entity;

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
public class TPresentEventMessageListener implements EntityListener<TPresentEventMessage> {

    @Override
    public void preInsert(TPresentEventMessage entity, PreInsertContext<TPresentEventMessage> context) {
    }

    @Override
    public void preUpdate(TPresentEventMessage entity, PreUpdateContext<TPresentEventMessage> context) {
    }

    @Override
    public void preDelete(TPresentEventMessage entity, PreDeleteContext<TPresentEventMessage> context) {
    }

    @Override
    public void postInsert(TPresentEventMessage entity, PostInsertContext<TPresentEventMessage> context) {
    }

    @Override
    public void postUpdate(TPresentEventMessage entity, PostUpdateContext<TPresentEventMessage> context) {
    }

    @Override
    public void postDelete(TPresentEventMessage entity, PostDeleteContext<TPresentEventMessage> context) {
    }
}