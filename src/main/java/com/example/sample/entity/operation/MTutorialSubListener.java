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
public class MTutorialSubListener implements EntityListener<MTutorialSub> {

    @Override
    public void preInsert(MTutorialSub entity, PreInsertContext<MTutorialSub> context) {
    }

    @Override
    public void preUpdate(MTutorialSub entity, PreUpdateContext<MTutorialSub> context) {
    }

    @Override
    public void preDelete(MTutorialSub entity, PreDeleteContext<MTutorialSub> context) {
    }

    @Override
    public void postInsert(MTutorialSub entity, PostInsertContext<MTutorialSub> context) {
    }

    @Override
    public void postUpdate(MTutorialSub entity, PostUpdateContext<MTutorialSub> context) {
    }

    @Override
    public void postDelete(MTutorialSub entity, PostDeleteContext<MTutorialSub> context) {
    }
}