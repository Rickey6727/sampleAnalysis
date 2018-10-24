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
public class TAccountListener implements EntityListener<TAccount> {

    @Override
    public void preInsert(TAccount entity, PreInsertContext<TAccount> context) {
    }

    @Override
    public void preUpdate(TAccount entity, PreUpdateContext<TAccount> context) {
    }

    @Override
    public void preDelete(TAccount entity, PreDeleteContext<TAccount> context) {
    }

    @Override
    public void postInsert(TAccount entity, PostInsertContext<TAccount> context) {
    }

    @Override
    public void postUpdate(TAccount entity, PostUpdateContext<TAccount> context) {
    }

    @Override
    public void postDelete(TAccount entity, PostDeleteContext<TAccount> context) {
    }
}