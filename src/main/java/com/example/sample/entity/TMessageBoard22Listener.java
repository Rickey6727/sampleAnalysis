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
public class TMessageBoard22Listener implements EntityListener<TMessageBoard22> {

    @Override
    public void preInsert(TMessageBoard22 entity, PreInsertContext<TMessageBoard22> context) {
    }

    @Override
    public void preUpdate(TMessageBoard22 entity, PreUpdateContext<TMessageBoard22> context) {
    }

    @Override
    public void preDelete(TMessageBoard22 entity, PreDeleteContext<TMessageBoard22> context) {
    }

    @Override
    public void postInsert(TMessageBoard22 entity, PostInsertContext<TMessageBoard22> context) {
    }

    @Override
    public void postUpdate(TMessageBoard22 entity, PostUpdateContext<TMessageBoard22> context) {
    }

    @Override
    public void postDelete(TMessageBoard22 entity, PostDeleteContext<TMessageBoard22> context) {
    }
}