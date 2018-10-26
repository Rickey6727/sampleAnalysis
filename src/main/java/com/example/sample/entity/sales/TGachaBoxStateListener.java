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
public class TGachaBoxStateListener implements EntityListener<TGachaBoxState> {

    @Override
    public void preInsert(TGachaBoxState entity, PreInsertContext<TGachaBoxState> context) {
    }

    @Override
    public void preUpdate(TGachaBoxState entity, PreUpdateContext<TGachaBoxState> context) {
    }

    @Override
    public void preDelete(TGachaBoxState entity, PreDeleteContext<TGachaBoxState> context) {
    }

    @Override
    public void postInsert(TGachaBoxState entity, PostInsertContext<TGachaBoxState> context) {
    }

    @Override
    public void postUpdate(TGachaBoxState entity, PostUpdateContext<TGachaBoxState> context) {
    }

    @Override
    public void postDelete(TGachaBoxState entity, PostDeleteContext<TGachaBoxState> context) {
    }
}