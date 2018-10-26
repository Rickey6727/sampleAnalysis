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
public class MGachaCountRewardListener implements EntityListener<MGachaCountReward> {

    @Override
    public void preInsert(MGachaCountReward entity, PreInsertContext<MGachaCountReward> context) {
    }

    @Override
    public void preUpdate(MGachaCountReward entity, PreUpdateContext<MGachaCountReward> context) {
    }

    @Override
    public void preDelete(MGachaCountReward entity, PreDeleteContext<MGachaCountReward> context) {
    }

    @Override
    public void postInsert(MGachaCountReward entity, PostInsertContext<MGachaCountReward> context) {
    }

    @Override
    public void postUpdate(MGachaCountReward entity, PostUpdateContext<MGachaCountReward> context) {
    }

    @Override
    public void postDelete(MGachaCountReward entity, PostDeleteContext<MGachaCountReward> context) {
    }
}