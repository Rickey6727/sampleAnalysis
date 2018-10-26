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
public class TAdGachaListener implements EntityListener<TAdGacha> {

    @Override
    public void preInsert(TAdGacha entity, PreInsertContext<TAdGacha> context) {
    }

    @Override
    public void preUpdate(TAdGacha entity, PreUpdateContext<TAdGacha> context) {
    }

    @Override
    public void preDelete(TAdGacha entity, PreDeleteContext<TAdGacha> context) {
    }

    @Override
    public void postInsert(TAdGacha entity, PostInsertContext<TAdGacha> context) {
    }

    @Override
    public void postUpdate(TAdGacha entity, PostUpdateContext<TAdGacha> context) {
    }

    @Override
    public void postDelete(TAdGacha entity, PostDeleteContext<TAdGacha> context) {
    }
}