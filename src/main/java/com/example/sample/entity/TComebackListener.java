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
public class TComebackListener implements EntityListener<TComeback> {

    @Override
    public void preInsert(TComeback entity, PreInsertContext<TComeback> context) {
    }

    @Override
    public void preUpdate(TComeback entity, PreUpdateContext<TComeback> context) {
    }

    @Override
    public void preDelete(TComeback entity, PreDeleteContext<TComeback> context) {
    }

    @Override
    public void postInsert(TComeback entity, PostInsertContext<TComeback> context) {
    }

    @Override
    public void postUpdate(TComeback entity, PostUpdateContext<TComeback> context) {
    }

    @Override
    public void postDelete(TComeback entity, PostDeleteContext<TComeback> context) {
    }
}