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
public class TMessageBoard42Listener implements EntityListener<TMessageBoard42> {

    @Override
    public void preInsert(TMessageBoard42 entity, PreInsertContext<TMessageBoard42> context) {
    }

    @Override
    public void preUpdate(TMessageBoard42 entity, PreUpdateContext<TMessageBoard42> context) {
    }

    @Override
    public void preDelete(TMessageBoard42 entity, PreDeleteContext<TMessageBoard42> context) {
    }

    @Override
    public void postInsert(TMessageBoard42 entity, PostInsertContext<TMessageBoard42> context) {
    }

    @Override
    public void postUpdate(TMessageBoard42 entity, PostUpdateContext<TMessageBoard42> context) {
    }

    @Override
    public void postDelete(TMessageBoard42 entity, PostDeleteContext<TMessageBoard42> context) {
    }
}