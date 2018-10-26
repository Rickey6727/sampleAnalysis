package com.example.sample.entity.sales;

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
public class MVeilRewardListener implements EntityListener<MVeilReward> {

    @Override
    public void preInsert(MVeilReward entity, PreInsertContext<MVeilReward> context) {
    }

    @Override
    public void preUpdate(MVeilReward entity, PreUpdateContext<MVeilReward> context) {
    }

    @Override
    public void preDelete(MVeilReward entity, PreDeleteContext<MVeilReward> context) {
    }

    @Override
    public void postInsert(MVeilReward entity, PostInsertContext<MVeilReward> context) {
    }

    @Override
    public void postUpdate(MVeilReward entity, PostUpdateContext<MVeilReward> context) {
    }

    @Override
    public void postDelete(MVeilReward entity, PostDeleteContext<MVeilReward> context) {
    }
}