package com.example.sample.entity.operation;

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
public class MCoinEventProductListener implements EntityListener<MCoinEventProduct> {

    @Override
    public void preInsert(MCoinEventProduct entity, PreInsertContext<MCoinEventProduct> context) {
    }

    @Override
    public void preUpdate(MCoinEventProduct entity, PreUpdateContext<MCoinEventProduct> context) {
    }

    @Override
    public void preDelete(MCoinEventProduct entity, PreDeleteContext<MCoinEventProduct> context) {
    }

    @Override
    public void postInsert(MCoinEventProduct entity, PostInsertContext<MCoinEventProduct> context) {
    }

    @Override
    public void postUpdate(MCoinEventProduct entity, PostUpdateContext<MCoinEventProduct> context) {
    }

    @Override
    public void postDelete(MCoinEventProduct entity, PostDeleteContext<MCoinEventProduct> context) {
    }
}