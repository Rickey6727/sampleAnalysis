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
public class TSheepShopHistoryListener implements EntityListener<TSheepShopHistory> {

    @Override
    public void preInsert(TSheepShopHistory entity, PreInsertContext<TSheepShopHistory> context) {
    }

    @Override
    public void preUpdate(TSheepShopHistory entity, PreUpdateContext<TSheepShopHistory> context) {
    }

    @Override
    public void preDelete(TSheepShopHistory entity, PreDeleteContext<TSheepShopHistory> context) {
    }

    @Override
    public void postInsert(TSheepShopHistory entity, PostInsertContext<TSheepShopHistory> context) {
    }

    @Override
    public void postUpdate(TSheepShopHistory entity, PostUpdateContext<TSheepShopHistory> context) {
    }

    @Override
    public void postDelete(TSheepShopHistory entity, PostDeleteContext<TSheepShopHistory> context) {
    }
}