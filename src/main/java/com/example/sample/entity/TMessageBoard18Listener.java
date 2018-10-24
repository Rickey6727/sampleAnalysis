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
public class TMessageBoard18Listener implements EntityListener<TMessageBoard18> {

    @Override
    public void preInsert(TMessageBoard18 entity, PreInsertContext<TMessageBoard18> context) {
    }

    @Override
    public void preUpdate(TMessageBoard18 entity, PreUpdateContext<TMessageBoard18> context) {
    }

    @Override
    public void preDelete(TMessageBoard18 entity, PreDeleteContext<TMessageBoard18> context) {
    }

    @Override
    public void postInsert(TMessageBoard18 entity, PostInsertContext<TMessageBoard18> context) {
    }

    @Override
    public void postUpdate(TMessageBoard18 entity, PostUpdateContext<TMessageBoard18> context) {
    }

    @Override
    public void postDelete(TMessageBoard18 entity, PostDeleteContext<TMessageBoard18> context) {
    }
}