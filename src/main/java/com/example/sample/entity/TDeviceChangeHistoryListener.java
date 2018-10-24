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
public class TDeviceChangeHistoryListener implements EntityListener<TDeviceChangeHistory> {

    @Override
    public void preInsert(TDeviceChangeHistory entity, PreInsertContext<TDeviceChangeHistory> context) {
    }

    @Override
    public void preUpdate(TDeviceChangeHistory entity, PreUpdateContext<TDeviceChangeHistory> context) {
    }

    @Override
    public void preDelete(TDeviceChangeHistory entity, PreDeleteContext<TDeviceChangeHistory> context) {
    }

    @Override
    public void postInsert(TDeviceChangeHistory entity, PostInsertContext<TDeviceChangeHistory> context) {
    }

    @Override
    public void postUpdate(TDeviceChangeHistory entity, PostUpdateContext<TDeviceChangeHistory> context) {
    }

    @Override
    public void postDelete(TDeviceChangeHistory entity, PostDeleteContext<TDeviceChangeHistory> context) {
    }
}