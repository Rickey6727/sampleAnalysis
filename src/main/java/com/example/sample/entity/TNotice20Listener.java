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
public class TNotice20Listener implements EntityListener<TNotice20> {

    @Override
    public void preInsert(TNotice20 entity, PreInsertContext<TNotice20> context) {
    }

    @Override
    public void preUpdate(TNotice20 entity, PreUpdateContext<TNotice20> context) {
    }

    @Override
    public void preDelete(TNotice20 entity, PreDeleteContext<TNotice20> context) {
    }

    @Override
    public void postInsert(TNotice20 entity, PostInsertContext<TNotice20> context) {
    }

    @Override
    public void postUpdate(TNotice20 entity, PostUpdateContext<TNotice20> context) {
    }

    @Override
    public void postDelete(TNotice20 entity, PostDeleteContext<TNotice20> context) {
    }
}