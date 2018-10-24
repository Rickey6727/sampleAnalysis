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
public class TExchangeSideHistoryListener implements EntityListener<TExchangeSideHistory> {

    @Override
    public void preInsert(TExchangeSideHistory entity, PreInsertContext<TExchangeSideHistory> context) {
    }

    @Override
    public void preUpdate(TExchangeSideHistory entity, PreUpdateContext<TExchangeSideHistory> context) {
    }

    @Override
    public void preDelete(TExchangeSideHistory entity, PreDeleteContext<TExchangeSideHistory> context) {
    }

    @Override
    public void postInsert(TExchangeSideHistory entity, PostInsertContext<TExchangeSideHistory> context) {
    }

    @Override
    public void postUpdate(TExchangeSideHistory entity, PostUpdateContext<TExchangeSideHistory> context) {
    }

    @Override
    public void postDelete(TExchangeSideHistory entity, PostDeleteContext<TExchangeSideHistory> context) {
    }
}