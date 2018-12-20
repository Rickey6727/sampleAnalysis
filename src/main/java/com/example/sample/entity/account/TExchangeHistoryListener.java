package com.example.sample.entity.account;

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
public class TExchangeHistoryListener implements EntityListener<TExchangeHistory> {

    @Override
    public void preInsert(TExchangeHistory entity, PreInsertContext<TExchangeHistory> context) {
    }

    @Override
    public void preUpdate(TExchangeHistory entity, PreUpdateContext<TExchangeHistory> context) {
    }

    @Override
    public void preDelete(TExchangeHistory entity, PreDeleteContext<TExchangeHistory> context) {
    }

    @Override
    public void postInsert(TExchangeHistory entity, PostInsertContext<TExchangeHistory> context) {
    }

    @Override
    public void postUpdate(TExchangeHistory entity, PostUpdateContext<TExchangeHistory> context) {
    }

    @Override
    public void postDelete(TExchangeHistory entity, PostDeleteContext<TExchangeHistory> context) {
    }
}