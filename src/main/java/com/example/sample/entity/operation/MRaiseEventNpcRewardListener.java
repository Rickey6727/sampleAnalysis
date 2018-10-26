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
public class MRaiseEventNpcRewardListener implements EntityListener<MRaiseEventNpcReward> {

    @Override
    public void preInsert(MRaiseEventNpcReward entity, PreInsertContext<MRaiseEventNpcReward> context) {
    }

    @Override
    public void preUpdate(MRaiseEventNpcReward entity, PreUpdateContext<MRaiseEventNpcReward> context) {
    }

    @Override
    public void preDelete(MRaiseEventNpcReward entity, PreDeleteContext<MRaiseEventNpcReward> context) {
    }

    @Override
    public void postInsert(MRaiseEventNpcReward entity, PostInsertContext<MRaiseEventNpcReward> context) {
    }

    @Override
    public void postUpdate(MRaiseEventNpcReward entity, PostUpdateContext<MRaiseEventNpcReward> context) {
    }

    @Override
    public void postDelete(MRaiseEventNpcReward entity, PostDeleteContext<MRaiseEventNpcReward> context) {
    }
}