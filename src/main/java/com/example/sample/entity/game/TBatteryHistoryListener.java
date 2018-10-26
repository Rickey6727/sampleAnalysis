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
public class TBatteryHistoryListener implements EntityListener<TBatteryHistory> {

    @Override
    public void preInsert(TBatteryHistory entity, PreInsertContext<TBatteryHistory> context) {
    }

    @Override
    public void preUpdate(TBatteryHistory entity, PreUpdateContext<TBatteryHistory> context) {
    }

    @Override
    public void preDelete(TBatteryHistory entity, PreDeleteContext<TBatteryHistory> context) {
    }

    @Override
    public void postInsert(TBatteryHistory entity, PostInsertContext<TBatteryHistory> context) {
    }

    @Override
    public void postUpdate(TBatteryHistory entity, PostUpdateContext<TBatteryHistory> context) {
    }

    @Override
    public void postDelete(TBatteryHistory entity, PostDeleteContext<TBatteryHistory> context) {
    }
}