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
public class TMessageBoard7Listener implements EntityListener<TMessageBoard7> {

    @Override
    public void preInsert(TMessageBoard7 entity, PreInsertContext<TMessageBoard7> context) {
    }

    @Override
    public void preUpdate(TMessageBoard7 entity, PreUpdateContext<TMessageBoard7> context) {
    }

    @Override
    public void preDelete(TMessageBoard7 entity, PreDeleteContext<TMessageBoard7> context) {
    }

    @Override
    public void postInsert(TMessageBoard7 entity, PostInsertContext<TMessageBoard7> context) {
    }

    @Override
    public void postUpdate(TMessageBoard7 entity, PostUpdateContext<TMessageBoard7> context) {
    }

    @Override
    public void postDelete(TMessageBoard7 entity, PostDeleteContext<TMessageBoard7> context) {
    }
}