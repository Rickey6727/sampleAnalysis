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
public class MEventGachaRewardListener implements EntityListener<MEventGachaReward> {

    @Override
    public void preInsert(MEventGachaReward entity, PreInsertContext<MEventGachaReward> context) {
    }

    @Override
    public void preUpdate(MEventGachaReward entity, PreUpdateContext<MEventGachaReward> context) {
    }

    @Override
    public void preDelete(MEventGachaReward entity, PreDeleteContext<MEventGachaReward> context) {
    }

    @Override
    public void postInsert(MEventGachaReward entity, PostInsertContext<MEventGachaReward> context) {
    }

    @Override
    public void postUpdate(MEventGachaReward entity, PostUpdateContext<MEventGachaReward> context) {
    }

    @Override
    public void postDelete(MEventGachaReward entity, PostDeleteContext<MEventGachaReward> context) {
    }
}