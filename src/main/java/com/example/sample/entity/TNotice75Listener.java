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
public class TNotice75Listener implements EntityListener<TNotice75> {

    @Override
    public void preInsert(TNotice75 entity, PreInsertContext<TNotice75> context) {
    }

    @Override
    public void preUpdate(TNotice75 entity, PreUpdateContext<TNotice75> context) {
    }

    @Override
    public void preDelete(TNotice75 entity, PreDeleteContext<TNotice75> context) {
    }

    @Override
    public void postInsert(TNotice75 entity, PostInsertContext<TNotice75> context) {
    }

    @Override
    public void postUpdate(TNotice75 entity, PostUpdateContext<TNotice75> context) {
    }

    @Override
    public void postDelete(TNotice75 entity, PostDeleteContext<TNotice75> context) {
    }
}