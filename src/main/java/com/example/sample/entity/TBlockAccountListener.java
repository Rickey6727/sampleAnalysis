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
public class TBlockAccountListener implements EntityListener<TBlockAccount> {

    @Override
    public void preInsert(TBlockAccount entity, PreInsertContext<TBlockAccount> context) {
    }

    @Override
    public void preUpdate(TBlockAccount entity, PreUpdateContext<TBlockAccount> context) {
    }

    @Override
    public void preDelete(TBlockAccount entity, PreDeleteContext<TBlockAccount> context) {
    }

    @Override
    public void postInsert(TBlockAccount entity, PostInsertContext<TBlockAccount> context) {
    }

    @Override
    public void postUpdate(TBlockAccount entity, PostUpdateContext<TBlockAccount> context) {
    }

    @Override
    public void postDelete(TBlockAccount entity, PostDeleteContext<TBlockAccount> context) {
    }
}