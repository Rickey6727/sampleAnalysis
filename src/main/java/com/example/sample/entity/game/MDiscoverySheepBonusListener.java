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
public class MDiscoverySheepBonusListener implements EntityListener<MDiscoverySheepBonus> {

    @Override
    public void preInsert(MDiscoverySheepBonus entity, PreInsertContext<MDiscoverySheepBonus> context) {
    }

    @Override
    public void preUpdate(MDiscoverySheepBonus entity, PreUpdateContext<MDiscoverySheepBonus> context) {
    }

    @Override
    public void preDelete(MDiscoverySheepBonus entity, PreDeleteContext<MDiscoverySheepBonus> context) {
    }

    @Override
    public void postInsert(MDiscoverySheepBonus entity, PostInsertContext<MDiscoverySheepBonus> context) {
    }

    @Override
    public void postUpdate(MDiscoverySheepBonus entity, PostUpdateContext<MDiscoverySheepBonus> context) {
    }

    @Override
    public void postDelete(MDiscoverySheepBonus entity, PostDeleteContext<MDiscoverySheepBonus> context) {
    }
}