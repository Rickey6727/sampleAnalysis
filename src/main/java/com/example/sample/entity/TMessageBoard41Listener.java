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
public class TMessageBoard41Listener implements EntityListener<TMessageBoard41> {

    @Override
    public void preInsert(TMessageBoard41 entity, PreInsertContext<TMessageBoard41> context) {
    }

    @Override
    public void preUpdate(TMessageBoard41 entity, PreUpdateContext<TMessageBoard41> context) {
    }

    @Override
    public void preDelete(TMessageBoard41 entity, PreDeleteContext<TMessageBoard41> context) {
    }

    @Override
    public void postInsert(TMessageBoard41 entity, PostInsertContext<TMessageBoard41> context) {
    }

    @Override
    public void postUpdate(TMessageBoard41 entity, PostUpdateContext<TMessageBoard41> context) {
    }

    @Override
    public void postDelete(TMessageBoard41 entity, PostDeleteContext<TMessageBoard41> context) {
    }
}