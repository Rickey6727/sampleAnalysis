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
public class TSelfyBookAchievementListener implements EntityListener<TSelfyBookAchievement> {

    @Override
    public void preInsert(TSelfyBookAchievement entity, PreInsertContext<TSelfyBookAchievement> context) {
    }

    @Override
    public void preUpdate(TSelfyBookAchievement entity, PreUpdateContext<TSelfyBookAchievement> context) {
    }

    @Override
    public void preDelete(TSelfyBookAchievement entity, PreDeleteContext<TSelfyBookAchievement> context) {
    }

    @Override
    public void postInsert(TSelfyBookAchievement entity, PostInsertContext<TSelfyBookAchievement> context) {
    }

    @Override
    public void postUpdate(TSelfyBookAchievement entity, PostUpdateContext<TSelfyBookAchievement> context) {
    }

    @Override
    public void postDelete(TSelfyBookAchievement entity, PostDeleteContext<TSelfyBookAchievement> context) {
    }
}