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
public class MTutorialRewardListener implements EntityListener<MTutorialReward> {

    @Override
    public void preInsert(MTutorialReward entity, PreInsertContext<MTutorialReward> context) {
    }

    @Override
    public void preUpdate(MTutorialReward entity, PreUpdateContext<MTutorialReward> context) {
    }

    @Override
    public void preDelete(MTutorialReward entity, PreDeleteContext<MTutorialReward> context) {
    }

    @Override
    public void postInsert(MTutorialReward entity, PostInsertContext<MTutorialReward> context) {
    }

    @Override
    public void postUpdate(MTutorialReward entity, PostUpdateContext<MTutorialReward> context) {
    }

    @Override
    public void postDelete(MTutorialReward entity, PostDeleteContext<MTutorialReward> context) {
    }
}