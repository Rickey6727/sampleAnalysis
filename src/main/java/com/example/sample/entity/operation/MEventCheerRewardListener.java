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
public class MEventCheerRewardListener implements EntityListener<MEventCheerReward> {

    @Override
    public void preInsert(MEventCheerReward entity, PreInsertContext<MEventCheerReward> context) {
    }

    @Override
    public void preUpdate(MEventCheerReward entity, PreUpdateContext<MEventCheerReward> context) {
    }

    @Override
    public void preDelete(MEventCheerReward entity, PreDeleteContext<MEventCheerReward> context) {
    }

    @Override
    public void postInsert(MEventCheerReward entity, PostInsertContext<MEventCheerReward> context) {
    }

    @Override
    public void postUpdate(MEventCheerReward entity, PostUpdateContext<MEventCheerReward> context) {
    }

    @Override
    public void postDelete(MEventCheerReward entity, PostDeleteContext<MEventCheerReward> context) {
    }
}