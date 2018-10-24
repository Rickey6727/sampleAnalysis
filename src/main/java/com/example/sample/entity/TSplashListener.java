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
public class TSplashListener implements EntityListener<TSplash> {

    @Override
    public void preInsert(TSplash entity, PreInsertContext<TSplash> context) {
    }

    @Override
    public void preUpdate(TSplash entity, PreUpdateContext<TSplash> context) {
    }

    @Override
    public void preDelete(TSplash entity, PreDeleteContext<TSplash> context) {
    }

    @Override
    public void postInsert(TSplash entity, PostInsertContext<TSplash> context) {
    }

    @Override
    public void postUpdate(TSplash entity, PostUpdateContext<TSplash> context) {
    }

    @Override
    public void postDelete(TSplash entity, PostDeleteContext<TSplash> context) {
    }
}