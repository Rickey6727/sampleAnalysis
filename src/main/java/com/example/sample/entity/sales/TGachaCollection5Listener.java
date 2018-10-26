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
public class TGachaCollection5Listener implements EntityListener<TGachaCollection5> {

    @Override
    public void preInsert(TGachaCollection5 entity, PreInsertContext<TGachaCollection5> context) {
    }

    @Override
    public void preUpdate(TGachaCollection5 entity, PreUpdateContext<TGachaCollection5> context) {
    }

    @Override
    public void preDelete(TGachaCollection5 entity, PreDeleteContext<TGachaCollection5> context) {
    }

    @Override
    public void postInsert(TGachaCollection5 entity, PostInsertContext<TGachaCollection5> context) {
    }

    @Override
    public void postUpdate(TGachaCollection5 entity, PostUpdateContext<TGachaCollection5> context) {
    }

    @Override
    public void postDelete(TGachaCollection5 entity, PostDeleteContext<TGachaCollection5> context) {
    }
}