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
public class TGachaCollection2Listener implements EntityListener<TGachaCollection2> {

    @Override
    public void preInsert(TGachaCollection2 entity, PreInsertContext<TGachaCollection2> context) {
    }

    @Override
    public void preUpdate(TGachaCollection2 entity, PreUpdateContext<TGachaCollection2> context) {
    }

    @Override
    public void preDelete(TGachaCollection2 entity, PreDeleteContext<TGachaCollection2> context) {
    }

    @Override
    public void postInsert(TGachaCollection2 entity, PostInsertContext<TGachaCollection2> context) {
    }

    @Override
    public void postUpdate(TGachaCollection2 entity, PostUpdateContext<TGachaCollection2> context) {
    }

    @Override
    public void postDelete(TGachaCollection2 entity, PostDeleteContext<TGachaCollection2> context) {
    }
}