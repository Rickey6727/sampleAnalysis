package com.example.sample.entity.game;

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
public class TSheepBonusHistoryListener implements EntityListener<TSheepBonusHistory> {

    @Override
    public void preInsert(TSheepBonusHistory entity, PreInsertContext<TSheepBonusHistory> context) {
    }

    @Override
    public void preUpdate(TSheepBonusHistory entity, PreUpdateContext<TSheepBonusHistory> context) {
    }

    @Override
    public void preDelete(TSheepBonusHistory entity, PreDeleteContext<TSheepBonusHistory> context) {
    }

    @Override
    public void postInsert(TSheepBonusHistory entity, PostInsertContext<TSheepBonusHistory> context) {
    }

    @Override
    public void postUpdate(TSheepBonusHistory entity, PostUpdateContext<TSheepBonusHistory> context) {
    }

    @Override
    public void postDelete(TSheepBonusHistory entity, PostDeleteContext<TSheepBonusHistory> context) {
    }
}