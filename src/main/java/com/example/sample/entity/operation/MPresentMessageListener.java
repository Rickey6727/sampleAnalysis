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
public class MPresentMessageListener implements EntityListener<MPresentMessage> {

    @Override
    public void preInsert(MPresentMessage entity, PreInsertContext<MPresentMessage> context) {
    }

    @Override
    public void preUpdate(MPresentMessage entity, PreUpdateContext<MPresentMessage> context) {
    }

    @Override
    public void preDelete(MPresentMessage entity, PreDeleteContext<MPresentMessage> context) {
    }

    @Override
    public void postInsert(MPresentMessage entity, PostInsertContext<MPresentMessage> context) {
    }

    @Override
    public void postUpdate(MPresentMessage entity, PostUpdateContext<MPresentMessage> context) {
    }

    @Override
    public void postDelete(MPresentMessage entity, PostDeleteContext<MPresentMessage> context) {
    }
}