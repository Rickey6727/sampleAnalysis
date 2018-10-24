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
public class TNativeUserListener implements EntityListener<TNativeUser> {

    @Override
    public void preInsert(TNativeUser entity, PreInsertContext<TNativeUser> context) {
    }

    @Override
    public void preUpdate(TNativeUser entity, PreUpdateContext<TNativeUser> context) {
    }

    @Override
    public void preDelete(TNativeUser entity, PreDeleteContext<TNativeUser> context) {
    }

    @Override
    public void postInsert(TNativeUser entity, PostInsertContext<TNativeUser> context) {
    }

    @Override
    public void postUpdate(TNativeUser entity, PostUpdateContext<TNativeUser> context) {
    }

    @Override
    public void postDelete(TNativeUser entity, PostDeleteContext<TNativeUser> context) {
    }
}