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
public class TInformationListener implements EntityListener<TInformation> {

    @Override
    public void preInsert(TInformation entity, PreInsertContext<TInformation> context) {
    }

    @Override
    public void preUpdate(TInformation entity, PreUpdateContext<TInformation> context) {
    }

    @Override
    public void preDelete(TInformation entity, PreDeleteContext<TInformation> context) {
    }

    @Override
    public void postInsert(TInformation entity, PostInsertContext<TInformation> context) {
    }

    @Override
    public void postUpdate(TInformation entity, PostUpdateContext<TInformation> context) {
    }

    @Override
    public void postDelete(TInformation entity, PostDeleteContext<TInformation> context) {
    }
}