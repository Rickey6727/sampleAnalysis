package com.example.sample.entity.manage;

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
public class MPushMessageListener implements EntityListener<MPushMessage> {

    @Override
    public void preInsert(MPushMessage entity, PreInsertContext<MPushMessage> context) {
    }

    @Override
    public void preUpdate(MPushMessage entity, PreUpdateContext<MPushMessage> context) {
    }

    @Override
    public void preDelete(MPushMessage entity, PreDeleteContext<MPushMessage> context) {
    }

    @Override
    public void postInsert(MPushMessage entity, PostInsertContext<MPushMessage> context) {
    }

    @Override
    public void postUpdate(MPushMessage entity, PostUpdateContext<MPushMessage> context) {
    }

    @Override
    public void postDelete(MPushMessage entity, PostDeleteContext<MPushMessage> context) {
    }
}