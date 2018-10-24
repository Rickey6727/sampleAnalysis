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
public class TDressupAchievementListener implements EntityListener<TDressupAchievement> {

    @Override
    public void preInsert(TDressupAchievement entity, PreInsertContext<TDressupAchievement> context) {
    }

    @Override
    public void preUpdate(TDressupAchievement entity, PreUpdateContext<TDressupAchievement> context) {
    }

    @Override
    public void preDelete(TDressupAchievement entity, PreDeleteContext<TDressupAchievement> context) {
    }

    @Override
    public void postInsert(TDressupAchievement entity, PostInsertContext<TDressupAchievement> context) {
    }

    @Override
    public void postUpdate(TDressupAchievement entity, PostUpdateContext<TDressupAchievement> context) {
    }

    @Override
    public void postDelete(TDressupAchievement entity, PostDeleteContext<TDressupAchievement> context) {
    }
}