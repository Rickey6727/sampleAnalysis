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
public class TSupportItemStatusListener implements EntityListener<TSupportItemStatus> {

    @Override
    public void preInsert(TSupportItemStatus entity, PreInsertContext<TSupportItemStatus> context) {
    }

    @Override
    public void preUpdate(TSupportItemStatus entity, PreUpdateContext<TSupportItemStatus> context) {
    }

    @Override
    public void preDelete(TSupportItemStatus entity, PreDeleteContext<TSupportItemStatus> context) {
    }

    @Override
    public void postInsert(TSupportItemStatus entity, PostInsertContext<TSupportItemStatus> context) {
    }

    @Override
    public void postUpdate(TSupportItemStatus entity, PostUpdateContext<TSupportItemStatus> context) {
    }

    @Override
    public void postDelete(TSupportItemStatus entity, PostDeleteContext<TSupportItemStatus> context) {
    }
}