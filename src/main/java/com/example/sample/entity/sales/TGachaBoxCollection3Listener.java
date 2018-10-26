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
public class TGachaBoxCollection3Listener implements EntityListener<TGachaBoxCollection3> {

    @Override
    public void preInsert(TGachaBoxCollection3 entity, PreInsertContext<TGachaBoxCollection3> context) {
    }

    @Override
    public void preUpdate(TGachaBoxCollection3 entity, PreUpdateContext<TGachaBoxCollection3> context) {
    }

    @Override
    public void preDelete(TGachaBoxCollection3 entity, PreDeleteContext<TGachaBoxCollection3> context) {
    }

    @Override
    public void postInsert(TGachaBoxCollection3 entity, PostInsertContext<TGachaBoxCollection3> context) {
    }

    @Override
    public void postUpdate(TGachaBoxCollection3 entity, PostUpdateContext<TGachaBoxCollection3> context) {
    }

    @Override
    public void postDelete(TGachaBoxCollection3 entity, PostDeleteContext<TGachaBoxCollection3> context) {
    }
}