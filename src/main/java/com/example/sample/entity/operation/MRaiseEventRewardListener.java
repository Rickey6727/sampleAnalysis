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
public class MRaiseEventRewardListener implements EntityListener<MRaiseEventReward> {

    @Override
    public void preInsert(MRaiseEventReward entity, PreInsertContext<MRaiseEventReward> context) {
    }

    @Override
    public void preUpdate(MRaiseEventReward entity, PreUpdateContext<MRaiseEventReward> context) {
    }

    @Override
    public void preDelete(MRaiseEventReward entity, PreDeleteContext<MRaiseEventReward> context) {
    }

    @Override
    public void postInsert(MRaiseEventReward entity, PostInsertContext<MRaiseEventReward> context) {
    }

    @Override
    public void postUpdate(MRaiseEventReward entity, PostUpdateContext<MRaiseEventReward> context) {
    }

    @Override
    public void postDelete(MRaiseEventReward entity, PostDeleteContext<MRaiseEventReward> context) {
    }
}