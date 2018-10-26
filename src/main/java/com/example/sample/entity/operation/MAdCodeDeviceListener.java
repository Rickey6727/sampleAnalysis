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
public class MAdCodeDeviceListener implements EntityListener<MAdCodeDevice> {

    @Override
    public void preInsert(MAdCodeDevice entity, PreInsertContext<MAdCodeDevice> context) {
    }

    @Override
    public void preUpdate(MAdCodeDevice entity, PreUpdateContext<MAdCodeDevice> context) {
    }

    @Override
    public void preDelete(MAdCodeDevice entity, PreDeleteContext<MAdCodeDevice> context) {
    }

    @Override
    public void postInsert(MAdCodeDevice entity, PostInsertContext<MAdCodeDevice> context) {
    }

    @Override
    public void postUpdate(MAdCodeDevice entity, PostUpdateContext<MAdCodeDevice> context) {
    }

    @Override
    public void postDelete(MAdCodeDevice entity, PostDeleteContext<MAdCodeDevice> context) {
    }
}