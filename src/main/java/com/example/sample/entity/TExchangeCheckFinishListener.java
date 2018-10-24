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
public class TExchangeCheckFinishListener implements EntityListener<TExchangeCheckFinish> {

    @Override
    public void preInsert(TExchangeCheckFinish entity, PreInsertContext<TExchangeCheckFinish> context) {
    }

    @Override
    public void preUpdate(TExchangeCheckFinish entity, PreUpdateContext<TExchangeCheckFinish> context) {
    }

    @Override
    public void preDelete(TExchangeCheckFinish entity, PreDeleteContext<TExchangeCheckFinish> context) {
    }

    @Override
    public void postInsert(TExchangeCheckFinish entity, PostInsertContext<TExchangeCheckFinish> context) {
    }

    @Override
    public void postUpdate(TExchangeCheckFinish entity, PostUpdateContext<TExchangeCheckFinish> context) {
    }

    @Override
    public void postDelete(TExchangeCheckFinish entity, PostDeleteContext<TExchangeCheckFinish> context) {
    }
}