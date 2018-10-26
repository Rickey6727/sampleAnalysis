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
public class MSplashListener implements EntityListener<MSplash> {

    @Override
    public void preInsert(MSplash entity, PreInsertContext<MSplash> context) {
    }

    @Override
    public void preUpdate(MSplash entity, PreUpdateContext<MSplash> context) {
    }

    @Override
    public void preDelete(MSplash entity, PreDeleteContext<MSplash> context) {
    }

    @Override
    public void postInsert(MSplash entity, PostInsertContext<MSplash> context) {
    }

    @Override
    public void postUpdate(MSplash entity, PostUpdateContext<MSplash> context) {
    }

    @Override
    public void postDelete(MSplash entity, PostDeleteContext<MSplash> context) {
    }
}