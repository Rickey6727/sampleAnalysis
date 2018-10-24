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
public class TLoginListener implements EntityListener<TLogin> {

    @Override
    public void preInsert(TLogin entity, PreInsertContext<TLogin> context) {
    }

    @Override
    public void preUpdate(TLogin entity, PreUpdateContext<TLogin> context) {
    }

    @Override
    public void preDelete(TLogin entity, PreDeleteContext<TLogin> context) {
    }

    @Override
    public void postInsert(TLogin entity, PostInsertContext<TLogin> context) {
    }

    @Override
    public void postUpdate(TLogin entity, PostUpdateContext<TLogin> context) {
    }

    @Override
    public void postDelete(TLogin entity, PostDeleteContext<TLogin> context) {
    }
}