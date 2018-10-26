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
public class MIpEventListener implements EntityListener<MIpEvent> {

    @Override
    public void preInsert(MIpEvent entity, PreInsertContext<MIpEvent> context) {
    }

    @Override
    public void preUpdate(MIpEvent entity, PreUpdateContext<MIpEvent> context) {
    }

    @Override
    public void preDelete(MIpEvent entity, PreDeleteContext<MIpEvent> context) {
    }

    @Override
    public void postInsert(MIpEvent entity, PostInsertContext<MIpEvent> context) {
    }

    @Override
    public void postUpdate(MIpEvent entity, PostUpdateContext<MIpEvent> context) {
    }

    @Override
    public void postDelete(MIpEvent entity, PostDeleteContext<MIpEvent> context) {
    }
}