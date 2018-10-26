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
public class MTutorialListener implements EntityListener<MTutorial> {

    @Override
    public void preInsert(MTutorial entity, PreInsertContext<MTutorial> context) {
    }

    @Override
    public void preUpdate(MTutorial entity, PreUpdateContext<MTutorial> context) {
    }

    @Override
    public void preDelete(MTutorial entity, PreDeleteContext<MTutorial> context) {
    }

    @Override
    public void postInsert(MTutorial entity, PostInsertContext<MTutorial> context) {
    }

    @Override
    public void postUpdate(MTutorial entity, PostUpdateContext<MTutorial> context) {
    }

    @Override
    public void postDelete(MTutorial entity, PostDeleteContext<MTutorial> context) {
    }
}