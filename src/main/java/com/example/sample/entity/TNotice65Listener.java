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
public class TNotice65Listener implements EntityListener<TNotice65> {

    @Override
    public void preInsert(TNotice65 entity, PreInsertContext<TNotice65> context) {
    }

    @Override
    public void preUpdate(TNotice65 entity, PreUpdateContext<TNotice65> context) {
    }

    @Override
    public void preDelete(TNotice65 entity, PreDeleteContext<TNotice65> context) {
    }

    @Override
    public void postInsert(TNotice65 entity, PostInsertContext<TNotice65> context) {
    }

    @Override
    public void postUpdate(TNotice65 entity, PostUpdateContext<TNotice65> context) {
    }

    @Override
    public void postDelete(TNotice65 entity, PostDeleteContext<TNotice65> context) {
    }
}