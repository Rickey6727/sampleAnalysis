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
public class TGachaCollection4Listener implements EntityListener<TGachaCollection4> {

    @Override
    public void preInsert(TGachaCollection4 entity, PreInsertContext<TGachaCollection4> context) {
    }

    @Override
    public void preUpdate(TGachaCollection4 entity, PreUpdateContext<TGachaCollection4> context) {
    }

    @Override
    public void preDelete(TGachaCollection4 entity, PreDeleteContext<TGachaCollection4> context) {
    }

    @Override
    public void postInsert(TGachaCollection4 entity, PostInsertContext<TGachaCollection4> context) {
    }

    @Override
    public void postUpdate(TGachaCollection4 entity, PostUpdateContext<TGachaCollection4> context) {
    }

    @Override
    public void postDelete(TGachaCollection4 entity, PostDeleteContext<TGachaCollection4> context) {
    }
}