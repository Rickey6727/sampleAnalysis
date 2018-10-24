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
public class TCodeAchievementListener implements EntityListener<TCodeAchievement> {

    @Override
    public void preInsert(TCodeAchievement entity, PreInsertContext<TCodeAchievement> context) {
    }

    @Override
    public void preUpdate(TCodeAchievement entity, PreUpdateContext<TCodeAchievement> context) {
    }

    @Override
    public void preDelete(TCodeAchievement entity, PreDeleteContext<TCodeAchievement> context) {
    }

    @Override
    public void postInsert(TCodeAchievement entity, PostInsertContext<TCodeAchievement> context) {
    }

    @Override
    public void postUpdate(TCodeAchievement entity, PostUpdateContext<TCodeAchievement> context) {
    }

    @Override
    public void postDelete(TCodeAchievement entity, PostDeleteContext<TCodeAchievement> context) {
    }
}