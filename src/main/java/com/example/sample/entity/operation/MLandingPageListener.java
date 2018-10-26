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
public class MLandingPageListener implements EntityListener<MLandingPage> {

    @Override
    public void preInsert(MLandingPage entity, PreInsertContext<MLandingPage> context) {
    }

    @Override
    public void preUpdate(MLandingPage entity, PreUpdateContext<MLandingPage> context) {
    }

    @Override
    public void preDelete(MLandingPage entity, PreDeleteContext<MLandingPage> context) {
    }

    @Override
    public void postInsert(MLandingPage entity, PostInsertContext<MLandingPage> context) {
    }

    @Override
    public void postUpdate(MLandingPage entity, PostUpdateContext<MLandingPage> context) {
    }

    @Override
    public void postDelete(MLandingPage entity, PostDeleteContext<MLandingPage> context) {
    }
}