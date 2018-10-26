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
public class MPresentEventSendConditionListener implements EntityListener<MPresentEventSendCondition> {

    @Override
    public void preInsert(MPresentEventSendCondition entity, PreInsertContext<MPresentEventSendCondition> context) {
    }

    @Override
    public void preUpdate(MPresentEventSendCondition entity, PreUpdateContext<MPresentEventSendCondition> context) {
    }

    @Override
    public void preDelete(MPresentEventSendCondition entity, PreDeleteContext<MPresentEventSendCondition> context) {
    }

    @Override
    public void postInsert(MPresentEventSendCondition entity, PostInsertContext<MPresentEventSendCondition> context) {
    }

    @Override
    public void postUpdate(MPresentEventSendCondition entity, PostUpdateContext<MPresentEventSendCondition> context) {
    }

    @Override
    public void postDelete(MPresentEventSendCondition entity, PostDeleteContext<MPresentEventSendCondition> context) {
    }
}