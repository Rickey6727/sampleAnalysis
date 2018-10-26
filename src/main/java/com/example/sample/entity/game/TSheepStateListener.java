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
public class TSheepStateListener implements EntityListener<TSheepState> {

    @Override
    public void preInsert(TSheepState entity, PreInsertContext<TSheepState> context) {
    }

    @Override
    public void preUpdate(TSheepState entity, PreUpdateContext<TSheepState> context) {
    }

    @Override
    public void preDelete(TSheepState entity, PreDeleteContext<TSheepState> context) {
    }

    @Override
    public void postInsert(TSheepState entity, PostInsertContext<TSheepState> context) {
    }

    @Override
    public void postUpdate(TSheepState entity, PostUpdateContext<TSheepState> context) {
    }

    @Override
    public void postDelete(TSheepState entity, PostDeleteContext<TSheepState> context) {
    }
}