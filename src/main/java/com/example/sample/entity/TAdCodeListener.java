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
public class TAdCodeListener implements EntityListener<TAdCode> {

    @Override
    public void preInsert(TAdCode entity, PreInsertContext<TAdCode> context) {
    }

    @Override
    public void preUpdate(TAdCode entity, PreUpdateContext<TAdCode> context) {
    }

    @Override
    public void preDelete(TAdCode entity, PreDeleteContext<TAdCode> context) {
    }

    @Override
    public void postInsert(TAdCode entity, PostInsertContext<TAdCode> context) {
    }

    @Override
    public void postUpdate(TAdCode entity, PostUpdateContext<TAdCode> context) {
    }

    @Override
    public void postDelete(TAdCode entity, PostDeleteContext<TAdCode> context) {
    }
}