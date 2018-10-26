package com.example.sample.entity.game;

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
public class TBatteryStateListener implements EntityListener<TBatteryState> {

    @Override
    public void preInsert(TBatteryState entity, PreInsertContext<TBatteryState> context) {
    }

    @Override
    public void preUpdate(TBatteryState entity, PreUpdateContext<TBatteryState> context) {
    }

    @Override
    public void preDelete(TBatteryState entity, PreDeleteContext<TBatteryState> context) {
    }

    @Override
    public void postInsert(TBatteryState entity, PostInsertContext<TBatteryState> context) {
    }

    @Override
    public void postUpdate(TBatteryState entity, PostUpdateContext<TBatteryState> context) {
    }

    @Override
    public void postDelete(TBatteryState entity, PostDeleteContext<TBatteryState> context) {
    }
}