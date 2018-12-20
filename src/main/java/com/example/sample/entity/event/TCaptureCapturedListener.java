package com.example.sample.entity.event;

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
public class TCaptureCapturedListener implements EntityListener<TCaptureCaptured> {

    @Override
    public void preInsert(TCaptureCaptured entity, PreInsertContext<TCaptureCaptured> context) {
    }

    @Override
    public void preUpdate(TCaptureCaptured entity, PreUpdateContext<TCaptureCaptured> context) {
    }

    @Override
    public void preDelete(TCaptureCaptured entity, PreDeleteContext<TCaptureCaptured> context) {
    }

    @Override
    public void postInsert(TCaptureCaptured entity, PostInsertContext<TCaptureCaptured> context) {
    }

    @Override
    public void postUpdate(TCaptureCaptured entity, PostUpdateContext<TCaptureCaptured> context) {
    }

    @Override
    public void postDelete(TCaptureCaptured entity, PostDeleteContext<TCaptureCaptured> context) {
    }
}