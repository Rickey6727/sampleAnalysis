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
public class TRubyPointPossessionListener implements EntityListener<TRubyPointPossession> {

    @Override
    public void preInsert(TRubyPointPossession entity, PreInsertContext<TRubyPointPossession> context) {
    }

    @Override
    public void preUpdate(TRubyPointPossession entity, PreUpdateContext<TRubyPointPossession> context) {
    }

    @Override
    public void preDelete(TRubyPointPossession entity, PreDeleteContext<TRubyPointPossession> context) {
    }

    @Override
    public void postInsert(TRubyPointPossession entity, PostInsertContext<TRubyPointPossession> context) {
    }

    @Override
    public void postUpdate(TRubyPointPossession entity, PostUpdateContext<TRubyPointPossession> context) {
    }

    @Override
    public void postDelete(TRubyPointPossession entity, PostDeleteContext<TRubyPointPossession> context) {
    }
}