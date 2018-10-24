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
public class TPresentBoxLimitedTime60Listener implements EntityListener<TPresentBoxLimitedTime60> {

    @Override
    public void preInsert(TPresentBoxLimitedTime60 entity, PreInsertContext<TPresentBoxLimitedTime60> context) {
    }

    @Override
    public void preUpdate(TPresentBoxLimitedTime60 entity, PreUpdateContext<TPresentBoxLimitedTime60> context) {
    }

    @Override
    public void preDelete(TPresentBoxLimitedTime60 entity, PreDeleteContext<TPresentBoxLimitedTime60> context) {
    }

    @Override
    public void postInsert(TPresentBoxLimitedTime60 entity, PostInsertContext<TPresentBoxLimitedTime60> context) {
    }

    @Override
    public void postUpdate(TPresentBoxLimitedTime60 entity, PostUpdateContext<TPresentBoxLimitedTime60> context) {
    }

    @Override
    public void postDelete(TPresentBoxLimitedTime60 entity, PostDeleteContext<TPresentBoxLimitedTime60> context) {
    }
}