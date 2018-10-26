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
public class MGuildPushMessageListener implements EntityListener<MGuildPushMessage> {

    @Override
    public void preInsert(MGuildPushMessage entity, PreInsertContext<MGuildPushMessage> context) {
    }

    @Override
    public void preUpdate(MGuildPushMessage entity, PreUpdateContext<MGuildPushMessage> context) {
    }

    @Override
    public void preDelete(MGuildPushMessage entity, PreDeleteContext<MGuildPushMessage> context) {
    }

    @Override
    public void postInsert(MGuildPushMessage entity, PostInsertContext<MGuildPushMessage> context) {
    }

    @Override
    public void postUpdate(MGuildPushMessage entity, PostUpdateContext<MGuildPushMessage> context) {
    }

    @Override
    public void postDelete(MGuildPushMessage entity, PostDeleteContext<MGuildPushMessage> context) {
    }
}