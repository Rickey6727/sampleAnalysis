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
public class TGachaBoxCollection1Listener implements EntityListener<TGachaBoxCollection1> {

    @Override
    public void preInsert(TGachaBoxCollection1 entity, PreInsertContext<TGachaBoxCollection1> context) {
    }

    @Override
    public void preUpdate(TGachaBoxCollection1 entity, PreUpdateContext<TGachaBoxCollection1> context) {
    }

    @Override
    public void preDelete(TGachaBoxCollection1 entity, PreDeleteContext<TGachaBoxCollection1> context) {
    }

    @Override
    public void postInsert(TGachaBoxCollection1 entity, PostInsertContext<TGachaBoxCollection1> context) {
    }

    @Override
    public void postUpdate(TGachaBoxCollection1 entity, PostUpdateContext<TGachaBoxCollection1> context) {
    }

    @Override
    public void postDelete(TGachaBoxCollection1 entity, PostDeleteContext<TGachaBoxCollection1> context) {
    }
}