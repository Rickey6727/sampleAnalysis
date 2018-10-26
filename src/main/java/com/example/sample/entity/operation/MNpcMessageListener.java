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
public class MNpcMessageListener implements EntityListener<MNpcMessage> {

    @Override
    public void preInsert(MNpcMessage entity, PreInsertContext<MNpcMessage> context) {
    }

    @Override
    public void preUpdate(MNpcMessage entity, PreUpdateContext<MNpcMessage> context) {
    }

    @Override
    public void preDelete(MNpcMessage entity, PreDeleteContext<MNpcMessage> context) {
    }

    @Override
    public void postInsert(MNpcMessage entity, PostInsertContext<MNpcMessage> context) {
    }

    @Override
    public void postUpdate(MNpcMessage entity, PostUpdateContext<MNpcMessage> context) {
    }

    @Override
    public void postDelete(MNpcMessage entity, PostDeleteContext<MNpcMessage> context) {
    }
}