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
public class TGachaCollection1Listener implements EntityListener<TGachaCollection1> {

    @Override
    public void preInsert(TGachaCollection1 entity, PreInsertContext<TGachaCollection1> context) {
    }

    @Override
    public void preUpdate(TGachaCollection1 entity, PreUpdateContext<TGachaCollection1> context) {
    }

    @Override
    public void preDelete(TGachaCollection1 entity, PreDeleteContext<TGachaCollection1> context) {
    }

    @Override
    public void postInsert(TGachaCollection1 entity, PostInsertContext<TGachaCollection1> context) {
    }

    @Override
    public void postUpdate(TGachaCollection1 entity, PostUpdateContext<TGachaCollection1> context) {
    }

    @Override
    public void postDelete(TGachaCollection1 entity, PostDeleteContext<TGachaCollection1> context) {
    }
}