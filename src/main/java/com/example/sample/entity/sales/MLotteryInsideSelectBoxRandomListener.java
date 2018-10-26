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
public class MLotteryInsideSelectBoxRandomListener implements EntityListener<MLotteryInsideSelectBoxRandom> {

    @Override
    public void preInsert(MLotteryInsideSelectBoxRandom entity, PreInsertContext<MLotteryInsideSelectBoxRandom> context) {
    }

    @Override
    public void preUpdate(MLotteryInsideSelectBoxRandom entity, PreUpdateContext<MLotteryInsideSelectBoxRandom> context) {
    }

    @Override
    public void preDelete(MLotteryInsideSelectBoxRandom entity, PreDeleteContext<MLotteryInsideSelectBoxRandom> context) {
    }

    @Override
    public void postInsert(MLotteryInsideSelectBoxRandom entity, PostInsertContext<MLotteryInsideSelectBoxRandom> context) {
    }

    @Override
    public void postUpdate(MLotteryInsideSelectBoxRandom entity, PostUpdateContext<MLotteryInsideSelectBoxRandom> context) {
    }

    @Override
    public void postDelete(MLotteryInsideSelectBoxRandom entity, PostDeleteContext<MLotteryInsideSelectBoxRandom> context) {
    }
}