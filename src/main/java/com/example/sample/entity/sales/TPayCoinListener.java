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
public class TPayCoinListener implements EntityListener<TPayCoin> {

    @Override
    public void preInsert(TPayCoin entity, PreInsertContext<TPayCoin> context) {
    }

    @Override
    public void preUpdate(TPayCoin entity, PreUpdateContext<TPayCoin> context) {
    }

    @Override
    public void preDelete(TPayCoin entity, PreDeleteContext<TPayCoin> context) {
    }

    @Override
    public void postInsert(TPayCoin entity, PostInsertContext<TPayCoin> context) {
    }

    @Override
    public void postUpdate(TPayCoin entity, PostUpdateContext<TPayCoin> context) {
    }

    @Override
    public void postDelete(TPayCoin entity, PostDeleteContext<TPayCoin> context) {
    }
}