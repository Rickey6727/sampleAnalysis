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
public class S2sessionListener implements EntityListener<S2session> {

    @Override
    public void preInsert(S2session entity, PreInsertContext<S2session> context) {
    }

    @Override
    public void preUpdate(S2session entity, PreUpdateContext<S2session> context) {
    }

    @Override
    public void preDelete(S2session entity, PreDeleteContext<S2session> context) {
    }

    @Override
    public void postInsert(S2session entity, PostInsertContext<S2session> context) {
    }

    @Override
    public void postUpdate(S2session entity, PostUpdateContext<S2session> context) {
    }

    @Override
    public void postDelete(S2session entity, PostDeleteContext<S2session> context) {
    }
}