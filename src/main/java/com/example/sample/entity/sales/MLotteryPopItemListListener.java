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
public class MLotteryPopItemListListener implements EntityListener<MLotteryPopItemList> {

    @Override
    public void preInsert(MLotteryPopItemList entity, PreInsertContext<MLotteryPopItemList> context) {
    }

    @Override
    public void preUpdate(MLotteryPopItemList entity, PreUpdateContext<MLotteryPopItemList> context) {
    }

    @Override
    public void preDelete(MLotteryPopItemList entity, PreDeleteContext<MLotteryPopItemList> context) {
    }

    @Override
    public void postInsert(MLotteryPopItemList entity, PostInsertContext<MLotteryPopItemList> context) {
    }

    @Override
    public void postUpdate(MLotteryPopItemList entity, PostUpdateContext<MLotteryPopItemList> context) {
    }

    @Override
    public void postDelete(MLotteryPopItemList entity, PostDeleteContext<MLotteryPopItemList> context) {
    }
}