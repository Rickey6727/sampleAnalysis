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
public class TTestAccountListener implements EntityListener<TTestAccount> {

    @Override
    public void preInsert(TTestAccount entity, PreInsertContext<TTestAccount> context) {
    }

    @Override
    public void preUpdate(TTestAccount entity, PreUpdateContext<TTestAccount> context) {
    }

    @Override
    public void preDelete(TTestAccount entity, PreDeleteContext<TTestAccount> context) {
    }

    @Override
    public void postInsert(TTestAccount entity, PostInsertContext<TTestAccount> context) {
    }

    @Override
    public void postUpdate(TTestAccount entity, PostUpdateContext<TTestAccount> context) {
    }

    @Override
    public void postDelete(TTestAccount entity, PostDeleteContext<TTestAccount> context) {
    }
}