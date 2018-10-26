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
public class TRubyPointScoreHistoryListener implements EntityListener<TRubyPointScoreHistory> {

    @Override
    public void preInsert(TRubyPointScoreHistory entity, PreInsertContext<TRubyPointScoreHistory> context) {
    }

    @Override
    public void preUpdate(TRubyPointScoreHistory entity, PreUpdateContext<TRubyPointScoreHistory> context) {
    }

    @Override
    public void preDelete(TRubyPointScoreHistory entity, PreDeleteContext<TRubyPointScoreHistory> context) {
    }

    @Override
    public void postInsert(TRubyPointScoreHistory entity, PostInsertContext<TRubyPointScoreHistory> context) {
    }

    @Override
    public void postUpdate(TRubyPointScoreHistory entity, PostUpdateContext<TRubyPointScoreHistory> context) {
    }

    @Override
    public void postDelete(TRubyPointScoreHistory entity, PostDeleteContext<TRubyPointScoreHistory> context) {
    }
}