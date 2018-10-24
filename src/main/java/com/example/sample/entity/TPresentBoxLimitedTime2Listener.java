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
public class TPresentBoxLimitedTime2Listener implements EntityListener<TPresentBoxLimitedTime2> {

    @Override
    public void preInsert(TPresentBoxLimitedTime2 entity, PreInsertContext<TPresentBoxLimitedTime2> context) {
    }

    @Override
    public void preUpdate(TPresentBoxLimitedTime2 entity, PreUpdateContext<TPresentBoxLimitedTime2> context) {
    }

    @Override
    public void preDelete(TPresentBoxLimitedTime2 entity, PreDeleteContext<TPresentBoxLimitedTime2> context) {
    }

    @Override
    public void postInsert(TPresentBoxLimitedTime2 entity, PostInsertContext<TPresentBoxLimitedTime2> context) {
    }

    @Override
    public void postUpdate(TPresentBoxLimitedTime2 entity, PostUpdateContext<TPresentBoxLimitedTime2> context) {
    }

    @Override
    public void postDelete(TPresentBoxLimitedTime2 entity, PostDeleteContext<TPresentBoxLimitedTime2> context) {
    }
}