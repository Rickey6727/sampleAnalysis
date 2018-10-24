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
public class TMessageBoard32Listener implements EntityListener<TMessageBoard32> {

    @Override
    public void preInsert(TMessageBoard32 entity, PreInsertContext<TMessageBoard32> context) {
    }

    @Override
    public void preUpdate(TMessageBoard32 entity, PreUpdateContext<TMessageBoard32> context) {
    }

    @Override
    public void preDelete(TMessageBoard32 entity, PreDeleteContext<TMessageBoard32> context) {
    }

    @Override
    public void postInsert(TMessageBoard32 entity, PostInsertContext<TMessageBoard32> context) {
    }

    @Override
    public void postUpdate(TMessageBoard32 entity, PostUpdateContext<TMessageBoard32> context) {
    }

    @Override
    public void postDelete(TMessageBoard32 entity, PostDeleteContext<TMessageBoard32> context) {
    }
}