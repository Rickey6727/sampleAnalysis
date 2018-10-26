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
public class MBonusSpotListener implements EntityListener<MBonusSpot> {

    @Override
    public void preInsert(MBonusSpot entity, PreInsertContext<MBonusSpot> context) {
    }

    @Override
    public void preUpdate(MBonusSpot entity, PreUpdateContext<MBonusSpot> context) {
    }

    @Override
    public void preDelete(MBonusSpot entity, PreDeleteContext<MBonusSpot> context) {
    }

    @Override
    public void postInsert(MBonusSpot entity, PostInsertContext<MBonusSpot> context) {
    }

    @Override
    public void postUpdate(MBonusSpot entity, PostUpdateContext<MBonusSpot> context) {
    }

    @Override
    public void postDelete(MBonusSpot entity, PostDeleteContext<MBonusSpot> context) {
    }
}