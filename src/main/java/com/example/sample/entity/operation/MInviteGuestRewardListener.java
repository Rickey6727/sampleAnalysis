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
public class MInviteGuestRewardListener implements EntityListener<MInviteGuestReward> {

    @Override
    public void preInsert(MInviteGuestReward entity, PreInsertContext<MInviteGuestReward> context) {
    }

    @Override
    public void preUpdate(MInviteGuestReward entity, PreUpdateContext<MInviteGuestReward> context) {
    }

    @Override
    public void preDelete(MInviteGuestReward entity, PreDeleteContext<MInviteGuestReward> context) {
    }

    @Override
    public void postInsert(MInviteGuestReward entity, PostInsertContext<MInviteGuestReward> context) {
    }

    @Override
    public void postUpdate(MInviteGuestReward entity, PostUpdateContext<MInviteGuestReward> context) {
    }

    @Override
    public void postDelete(MInviteGuestReward entity, PostDeleteContext<MInviteGuestReward> context) {
    }
}