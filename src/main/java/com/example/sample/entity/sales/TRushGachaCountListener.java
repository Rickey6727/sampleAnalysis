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
public class TRushGachaCountListener implements EntityListener<TRushGachaCount> {

    @Override
    public void preInsert(TRushGachaCount entity, PreInsertContext<TRushGachaCount> context) {
    }

    @Override
    public void preUpdate(TRushGachaCount entity, PreUpdateContext<TRushGachaCount> context) {
    }

    @Override
    public void preDelete(TRushGachaCount entity, PreDeleteContext<TRushGachaCount> context) {
    }

    @Override
    public void postInsert(TRushGachaCount entity, PostInsertContext<TRushGachaCount> context) {
    }

    @Override
    public void postUpdate(TRushGachaCount entity, PostUpdateContext<TRushGachaCount> context) {
    }

    @Override
    public void postDelete(TRushGachaCount entity, PostDeleteContext<TRushGachaCount> context) {
    }
}