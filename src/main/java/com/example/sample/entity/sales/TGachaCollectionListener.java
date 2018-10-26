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
public class TGachaCollectionListener implements EntityListener<TGachaCollection> {

    @Override
    public void preInsert(TGachaCollection entity, PreInsertContext<TGachaCollection> context) {
    }

    @Override
    public void preUpdate(TGachaCollection entity, PreUpdateContext<TGachaCollection> context) {
    }

    @Override
    public void preDelete(TGachaCollection entity, PreDeleteContext<TGachaCollection> context) {
    }

    @Override
    public void postInsert(TGachaCollection entity, PostInsertContext<TGachaCollection> context) {
    }

    @Override
    public void postUpdate(TGachaCollection entity, PostUpdateContext<TGachaCollection> context) {
    }

    @Override
    public void postDelete(TGachaCollection entity, PostDeleteContext<TGachaCollection> context) {
    }
}