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
public class MBatteryListener implements EntityListener<MBattery> {

    @Override
    public void preInsert(MBattery entity, PreInsertContext<MBattery> context) {
    }

    @Override
    public void preUpdate(MBattery entity, PreUpdateContext<MBattery> context) {
    }

    @Override
    public void preDelete(MBattery entity, PreDeleteContext<MBattery> context) {
    }

    @Override
    public void postInsert(MBattery entity, PostInsertContext<MBattery> context) {
    }

    @Override
    public void postUpdate(MBattery entity, PostUpdateContext<MBattery> context) {
    }

    @Override
    public void postDelete(MBattery entity, PostDeleteContext<MBattery> context) {
    }
}