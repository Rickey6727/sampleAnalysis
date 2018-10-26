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
public class MTutorialBodyListener implements EntityListener<MTutorialBody> {

    @Override
    public void preInsert(MTutorialBody entity, PreInsertContext<MTutorialBody> context) {
    }

    @Override
    public void preUpdate(MTutorialBody entity, PreUpdateContext<MTutorialBody> context) {
    }

    @Override
    public void preDelete(MTutorialBody entity, PreDeleteContext<MTutorialBody> context) {
    }

    @Override
    public void postInsert(MTutorialBody entity, PostInsertContext<MTutorialBody> context) {
    }

    @Override
    public void postUpdate(MTutorialBody entity, PostUpdateContext<MTutorialBody> context) {
    }

    @Override
    public void postDelete(MTutorialBody entity, PostDeleteContext<MTutorialBody> context) {
    }
}