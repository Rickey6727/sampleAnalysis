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
public class MRaiseEventResultRewardListener implements EntityListener<MRaiseEventResultReward> {

    @Override
    public void preInsert(MRaiseEventResultReward entity, PreInsertContext<MRaiseEventResultReward> context) {
    }

    @Override
    public void preUpdate(MRaiseEventResultReward entity, PreUpdateContext<MRaiseEventResultReward> context) {
    }

    @Override
    public void preDelete(MRaiseEventResultReward entity, PreDeleteContext<MRaiseEventResultReward> context) {
    }

    @Override
    public void postInsert(MRaiseEventResultReward entity, PostInsertContext<MRaiseEventResultReward> context) {
    }

    @Override
    public void postUpdate(MRaiseEventResultReward entity, PostUpdateContext<MRaiseEventResultReward> context) {
    }

    @Override
    public void postDelete(MRaiseEventResultReward entity, PostDeleteContext<MRaiseEventResultReward> context) {
    }
}