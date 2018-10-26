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
public class TGachaCollection3Listener implements EntityListener<TGachaCollection3> {

    @Override
    public void preInsert(TGachaCollection3 entity, PreInsertContext<TGachaCollection3> context) {
    }

    @Override
    public void preUpdate(TGachaCollection3 entity, PreUpdateContext<TGachaCollection3> context) {
    }

    @Override
    public void preDelete(TGachaCollection3 entity, PreDeleteContext<TGachaCollection3> context) {
    }

    @Override
    public void postInsert(TGachaCollection3 entity, PostInsertContext<TGachaCollection3> context) {
    }

    @Override
    public void postUpdate(TGachaCollection3 entity, PostUpdateContext<TGachaCollection3> context) {
    }

    @Override
    public void postDelete(TGachaCollection3 entity, PostDeleteContext<TGachaCollection3> context) {
    }
}