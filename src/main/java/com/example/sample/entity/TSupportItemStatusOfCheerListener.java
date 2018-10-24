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
public class TSupportItemStatusOfCheerListener implements EntityListener<TSupportItemStatusOfCheer> {

    @Override
    public void preInsert(TSupportItemStatusOfCheer entity, PreInsertContext<TSupportItemStatusOfCheer> context) {
    }

    @Override
    public void preUpdate(TSupportItemStatusOfCheer entity, PreUpdateContext<TSupportItemStatusOfCheer> context) {
    }

    @Override
    public void preDelete(TSupportItemStatusOfCheer entity, PreDeleteContext<TSupportItemStatusOfCheer> context) {
    }

    @Override
    public void postInsert(TSupportItemStatusOfCheer entity, PostInsertContext<TSupportItemStatusOfCheer> context) {
    }

    @Override
    public void postUpdate(TSupportItemStatusOfCheer entity, PostUpdateContext<TSupportItemStatusOfCheer> context) {
    }

    @Override
    public void postDelete(TSupportItemStatusOfCheer entity, PostDeleteContext<TSupportItemStatusOfCheer> context) {
    }
}