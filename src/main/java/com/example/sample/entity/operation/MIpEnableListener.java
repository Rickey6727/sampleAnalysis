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
public class MIpEnableListener implements EntityListener<MIpEnable> {

    @Override
    public void preInsert(MIpEnable entity, PreInsertContext<MIpEnable> context) {
    }

    @Override
    public void preUpdate(MIpEnable entity, PreUpdateContext<MIpEnable> context) {
    }

    @Override
    public void preDelete(MIpEnable entity, PreDeleteContext<MIpEnable> context) {
    }

    @Override
    public void postInsert(MIpEnable entity, PostInsertContext<MIpEnable> context) {
    }

    @Override
    public void postUpdate(MIpEnable entity, PostUpdateContext<MIpEnable> context) {
    }

    @Override
    public void postDelete(MIpEnable entity, PostDeleteContext<MIpEnable> context) {
    }
}