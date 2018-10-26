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
public class MPresentEventSendItemListener implements EntityListener<MPresentEventSendItem> {

    @Override
    public void preInsert(MPresentEventSendItem entity, PreInsertContext<MPresentEventSendItem> context) {
    }

    @Override
    public void preUpdate(MPresentEventSendItem entity, PreUpdateContext<MPresentEventSendItem> context) {
    }

    @Override
    public void preDelete(MPresentEventSendItem entity, PreDeleteContext<MPresentEventSendItem> context) {
    }

    @Override
    public void postInsert(MPresentEventSendItem entity, PostInsertContext<MPresentEventSendItem> context) {
    }

    @Override
    public void postUpdate(MPresentEventSendItem entity, PostUpdateContext<MPresentEventSendItem> context) {
    }

    @Override
    public void postDelete(MPresentEventSendItem entity, PostDeleteContext<MPresentEventSendItem> context) {
    }
}