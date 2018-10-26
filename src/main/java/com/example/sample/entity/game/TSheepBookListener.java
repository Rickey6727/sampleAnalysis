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
public class TSheepBookListener implements EntityListener<TSheepBook> {

    @Override
    public void preInsert(TSheepBook entity, PreInsertContext<TSheepBook> context) {
    }

    @Override
    public void preUpdate(TSheepBook entity, PreUpdateContext<TSheepBook> context) {
    }

    @Override
    public void preDelete(TSheepBook entity, PreDeleteContext<TSheepBook> context) {
    }

    @Override
    public void postInsert(TSheepBook entity, PostInsertContext<TSheepBook> context) {
    }

    @Override
    public void postUpdate(TSheepBook entity, PostUpdateContext<TSheepBook> context) {
    }

    @Override
    public void postDelete(TSheepBook entity, PostDeleteContext<TSheepBook> context) {
    }
}