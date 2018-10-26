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
public class MIpLocatorListener implements EntityListener<MIpLocator> {

    @Override
    public void preInsert(MIpLocator entity, PreInsertContext<MIpLocator> context) {
    }

    @Override
    public void preUpdate(MIpLocator entity, PreUpdateContext<MIpLocator> context) {
    }

    @Override
    public void preDelete(MIpLocator entity, PreDeleteContext<MIpLocator> context) {
    }

    @Override
    public void postInsert(MIpLocator entity, PostInsertContext<MIpLocator> context) {
    }

    @Override
    public void postUpdate(MIpLocator entity, PostUpdateContext<MIpLocator> context) {
    }

    @Override
    public void postDelete(MIpLocator entity, PostDeleteContext<MIpLocator> context) {
    }
}