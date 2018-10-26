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
public class TRubyPointTmpHistoryListener implements EntityListener<TRubyPointTmpHistory> {

    @Override
    public void preInsert(TRubyPointTmpHistory entity, PreInsertContext<TRubyPointTmpHistory> context) {
    }

    @Override
    public void preUpdate(TRubyPointTmpHistory entity, PreUpdateContext<TRubyPointTmpHistory> context) {
    }

    @Override
    public void preDelete(TRubyPointTmpHistory entity, PreDeleteContext<TRubyPointTmpHistory> context) {
    }

    @Override
    public void postInsert(TRubyPointTmpHistory entity, PostInsertContext<TRubyPointTmpHistory> context) {
    }

    @Override
    public void postUpdate(TRubyPointTmpHistory entity, PostUpdateContext<TRubyPointTmpHistory> context) {
    }

    @Override
    public void postDelete(TRubyPointTmpHistory entity, PostDeleteContext<TRubyPointTmpHistory> context) {
    }
}