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
public class MPresentEventMessageListener implements EntityListener<MPresentEventMessage> {

    @Override
    public void preInsert(MPresentEventMessage entity, PreInsertContext<MPresentEventMessage> context) {
    }

    @Override
    public void preUpdate(MPresentEventMessage entity, PreUpdateContext<MPresentEventMessage> context) {
    }

    @Override
    public void preDelete(MPresentEventMessage entity, PreDeleteContext<MPresentEventMessage> context) {
    }

    @Override
    public void postInsert(MPresentEventMessage entity, PostInsertContext<MPresentEventMessage> context) {
    }

    @Override
    public void postUpdate(MPresentEventMessage entity, PostUpdateContext<MPresentEventMessage> context) {
    }

    @Override
    public void postDelete(MPresentEventMessage entity, PostDeleteContext<MPresentEventMessage> context) {
    }
}