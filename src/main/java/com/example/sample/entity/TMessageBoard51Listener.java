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
public class TMessageBoard51Listener implements EntityListener<TMessageBoard51> {

    @Override
    public void preInsert(TMessageBoard51 entity, PreInsertContext<TMessageBoard51> context) {
    }

    @Override
    public void preUpdate(TMessageBoard51 entity, PreUpdateContext<TMessageBoard51> context) {
    }

    @Override
    public void preDelete(TMessageBoard51 entity, PreDeleteContext<TMessageBoard51> context) {
    }

    @Override
    public void postInsert(TMessageBoard51 entity, PostInsertContext<TMessageBoard51> context) {
    }

    @Override
    public void postUpdate(TMessageBoard51 entity, PostUpdateContext<TMessageBoard51> context) {
    }

    @Override
    public void postDelete(TMessageBoard51 entity, PostDeleteContext<TMessageBoard51> context) {
    }
}