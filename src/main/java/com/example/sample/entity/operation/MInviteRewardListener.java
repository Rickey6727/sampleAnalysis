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
public class MInviteRewardListener implements EntityListener<MInviteReward> {

    @Override
    public void preInsert(MInviteReward entity, PreInsertContext<MInviteReward> context) {
    }

    @Override
    public void preUpdate(MInviteReward entity, PreUpdateContext<MInviteReward> context) {
    }

    @Override
    public void preDelete(MInviteReward entity, PreDeleteContext<MInviteReward> context) {
    }

    @Override
    public void postInsert(MInviteReward entity, PostInsertContext<MInviteReward> context) {
    }

    @Override
    public void postUpdate(MInviteReward entity, PostUpdateContext<MInviteReward> context) {
    }

    @Override
    public void postDelete(MInviteReward entity, PostDeleteContext<MInviteReward> context) {
    }
}