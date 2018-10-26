package com.example.sample.entity.sales;

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
public class TExchangeDataHistoryListener implements EntityListener<TExchangeDataHistory> {

    @Override
    public void preInsert(TExchangeDataHistory entity, PreInsertContext<TExchangeDataHistory> context) {
    }

    @Override
    public void preUpdate(TExchangeDataHistory entity, PreUpdateContext<TExchangeDataHistory> context) {
    }

    @Override
    public void preDelete(TExchangeDataHistory entity, PreDeleteContext<TExchangeDataHistory> context) {
    }

    @Override
    public void postInsert(TExchangeDataHistory entity, PostInsertContext<TExchangeDataHistory> context) {
    }

    @Override
    public void postUpdate(TExchangeDataHistory entity, PostUpdateContext<TExchangeDataHistory> context) {
    }

    @Override
    public void postDelete(TExchangeDataHistory entity, PostDeleteContext<TExchangeDataHistory> context) {
    }
}