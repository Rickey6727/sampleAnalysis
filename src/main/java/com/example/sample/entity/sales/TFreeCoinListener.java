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
public class TFreeCoinListener implements EntityListener<TFreeCoin> {

    @Override
    public void preInsert(TFreeCoin entity, PreInsertContext<TFreeCoin> context) {
    }

    @Override
    public void preUpdate(TFreeCoin entity, PreUpdateContext<TFreeCoin> context) {
    }

    @Override
    public void preDelete(TFreeCoin entity, PreDeleteContext<TFreeCoin> context) {
    }

    @Override
    public void postInsert(TFreeCoin entity, PostInsertContext<TFreeCoin> context) {
    }

    @Override
    public void postUpdate(TFreeCoin entity, PostUpdateContext<TFreeCoin> context) {
    }

    @Override
    public void postDelete(TFreeCoin entity, PostDeleteContext<TFreeCoin> context) {
    }
}