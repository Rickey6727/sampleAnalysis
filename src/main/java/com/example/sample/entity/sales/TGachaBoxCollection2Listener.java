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
public class TGachaBoxCollection2Listener implements EntityListener<TGachaBoxCollection2> {

    @Override
    public void preInsert(TGachaBoxCollection2 entity, PreInsertContext<TGachaBoxCollection2> context) {
    }

    @Override
    public void preUpdate(TGachaBoxCollection2 entity, PreUpdateContext<TGachaBoxCollection2> context) {
    }

    @Override
    public void preDelete(TGachaBoxCollection2 entity, PreDeleteContext<TGachaBoxCollection2> context) {
    }

    @Override
    public void postInsert(TGachaBoxCollection2 entity, PostInsertContext<TGachaBoxCollection2> context) {
    }

    @Override
    public void postUpdate(TGachaBoxCollection2 entity, PostUpdateContext<TGachaBoxCollection2> context) {
    }

    @Override
    public void postDelete(TGachaBoxCollection2 entity, PostDeleteContext<TGachaBoxCollection2> context) {
    }
}