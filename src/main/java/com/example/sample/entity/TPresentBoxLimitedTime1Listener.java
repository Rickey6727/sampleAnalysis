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
public class TPresentBoxLimitedTime1Listener implements EntityListener<TPresentBoxLimitedTime1> {

    @Override
    public void preInsert(TPresentBoxLimitedTime1 entity, PreInsertContext<TPresentBoxLimitedTime1> context) {
    }

    @Override
    public void preUpdate(TPresentBoxLimitedTime1 entity, PreUpdateContext<TPresentBoxLimitedTime1> context) {
    }

    @Override
    public void preDelete(TPresentBoxLimitedTime1 entity, PreDeleteContext<TPresentBoxLimitedTime1> context) {
    }

    @Override
    public void postInsert(TPresentBoxLimitedTime1 entity, PostInsertContext<TPresentBoxLimitedTime1> context) {
    }

    @Override
    public void postUpdate(TPresentBoxLimitedTime1 entity, PostUpdateContext<TPresentBoxLimitedTime1> context) {
    }

    @Override
    public void postDelete(TPresentBoxLimitedTime1 entity, PostDeleteContext<TPresentBoxLimitedTime1> context) {
    }
}