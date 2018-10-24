package com.example.sample.entity;

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
public class TFriendInviteAchievementListener implements EntityListener<TFriendInviteAchievement> {

    @Override
    public void preInsert(TFriendInviteAchievement entity, PreInsertContext<TFriendInviteAchievement> context) {
    }

    @Override
    public void preUpdate(TFriendInviteAchievement entity, PreUpdateContext<TFriendInviteAchievement> context) {
    }

    @Override
    public void preDelete(TFriendInviteAchievement entity, PreDeleteContext<TFriendInviteAchievement> context) {
    }

    @Override
    public void postInsert(TFriendInviteAchievement entity, PostInsertContext<TFriendInviteAchievement> context) {
    }

    @Override
    public void postUpdate(TFriendInviteAchievement entity, PostUpdateContext<TFriendInviteAchievement> context) {
    }

    @Override
    public void postDelete(TFriendInviteAchievement entity, PostDeleteContext<TFriendInviteAchievement> context) {
    }
}