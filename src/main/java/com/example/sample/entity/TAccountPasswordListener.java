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
public class TAccountPasswordListener implements EntityListener<TAccountPassword> {

    @Override
    public void preInsert(TAccountPassword entity, PreInsertContext<TAccountPassword> context) {
    }

    @Override
    public void preUpdate(TAccountPassword entity, PreUpdateContext<TAccountPassword> context) {
    }

    @Override
    public void preDelete(TAccountPassword entity, PreDeleteContext<TAccountPassword> context) {
    }

    @Override
    public void postInsert(TAccountPassword entity, PostInsertContext<TAccountPassword> context) {
    }

    @Override
    public void postUpdate(TAccountPassword entity, PostUpdateContext<TAccountPassword> context) {
    }

    @Override
    public void postDelete(TAccountPassword entity, PostDeleteContext<TAccountPassword> context) {
    }
}