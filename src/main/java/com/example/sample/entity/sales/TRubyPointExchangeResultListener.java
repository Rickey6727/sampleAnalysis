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
public class TRubyPointExchangeResultListener implements EntityListener<TRubyPointExchangeResult> {

    @Override
    public void preInsert(TRubyPointExchangeResult entity, PreInsertContext<TRubyPointExchangeResult> context) {
    }

    @Override
    public void preUpdate(TRubyPointExchangeResult entity, PreUpdateContext<TRubyPointExchangeResult> context) {
    }

    @Override
    public void preDelete(TRubyPointExchangeResult entity, PreDeleteContext<TRubyPointExchangeResult> context) {
    }

    @Override
    public void postInsert(TRubyPointExchangeResult entity, PostInsertContext<TRubyPointExchangeResult> context) {
    }

    @Override
    public void postUpdate(TRubyPointExchangeResult entity, PostUpdateContext<TRubyPointExchangeResult> context) {
    }

    @Override
    public void postDelete(TRubyPointExchangeResult entity, PostDeleteContext<TRubyPointExchangeResult> context) {
    }
}