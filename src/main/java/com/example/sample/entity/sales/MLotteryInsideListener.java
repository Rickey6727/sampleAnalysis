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
public class MLotteryInsideListener implements EntityListener<MLotteryInside> {

    @Override
    public void preInsert(MLotteryInside entity, PreInsertContext<MLotteryInside> context) {
    }

    @Override
    public void preUpdate(MLotteryInside entity, PreUpdateContext<MLotteryInside> context) {
    }

    @Override
    public void preDelete(MLotteryInside entity, PreDeleteContext<MLotteryInside> context) {
    }

    @Override
    public void postInsert(MLotteryInside entity, PostInsertContext<MLotteryInside> context) {
    }

    @Override
    public void postUpdate(MLotteryInside entity, PostUpdateContext<MLotteryInside> context) {
    }

    @Override
    public void postDelete(MLotteryInside entity, PostDeleteContext<MLotteryInside> context) {
    }
}