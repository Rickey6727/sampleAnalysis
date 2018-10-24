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
public class TCreatorsAchievementListener implements EntityListener<TCreatorsAchievement> {

    @Override
    public void preInsert(TCreatorsAchievement entity, PreInsertContext<TCreatorsAchievement> context) {
    }

    @Override
    public void preUpdate(TCreatorsAchievement entity, PreUpdateContext<TCreatorsAchievement> context) {
    }

    @Override
    public void preDelete(TCreatorsAchievement entity, PreDeleteContext<TCreatorsAchievement> context) {
    }

    @Override
    public void postInsert(TCreatorsAchievement entity, PostInsertContext<TCreatorsAchievement> context) {
    }

    @Override
    public void postUpdate(TCreatorsAchievement entity, PostUpdateContext<TCreatorsAchievement> context) {
    }

    @Override
    public void postDelete(TCreatorsAchievement entity, PostDeleteContext<TCreatorsAchievement> context) {
    }
}