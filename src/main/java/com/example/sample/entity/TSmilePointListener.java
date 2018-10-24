package com.example.sample.entity;

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
public class TSmilePointListener implements EntityListener<TSmilePoint> {

    @Override
    public void preInsert(TSmilePoint entity, PreInsertContext<TSmilePoint> context) {
    }

    @Override
    public void preUpdate(TSmilePoint entity, PreUpdateContext<TSmilePoint> context) {
    }

    @Override
    public void preDelete(TSmilePoint entity, PreDeleteContext<TSmilePoint> context) {
    }

    @Override
    public void postInsert(TSmilePoint entity, PostInsertContext<TSmilePoint> context) {
    }

    @Override
    public void postUpdate(TSmilePoint entity, PostUpdateContext<TSmilePoint> context) {
    }

    @Override
    public void postDelete(TSmilePoint entity, PostDeleteContext<TSmilePoint> context) {
    }
}