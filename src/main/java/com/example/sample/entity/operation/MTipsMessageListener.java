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
public class MTipsMessageListener implements EntityListener<MTipsMessage> {

    @Override
    public void preInsert(MTipsMessage entity, PreInsertContext<MTipsMessage> context) {
    }

    @Override
    public void preUpdate(MTipsMessage entity, PreUpdateContext<MTipsMessage> context) {
    }

    @Override
    public void preDelete(MTipsMessage entity, PreDeleteContext<MTipsMessage> context) {
    }

    @Override
    public void postInsert(MTipsMessage entity, PostInsertContext<MTipsMessage> context) {
    }

    @Override
    public void postUpdate(MTipsMessage entity, PostUpdateContext<MTipsMessage> context) {
    }

    @Override
    public void postDelete(MTipsMessage entity, PostDeleteContext<MTipsMessage> context) {
    }
}