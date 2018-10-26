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
public class MLotteryListener implements EntityListener<MLottery> {

    @Override
    public void preInsert(MLottery entity, PreInsertContext<MLottery> context) {
    }

    @Override
    public void preUpdate(MLottery entity, PreUpdateContext<MLottery> context) {
    }

    @Override
    public void preDelete(MLottery entity, PreDeleteContext<MLottery> context) {
    }

    @Override
    public void postInsert(MLottery entity, PostInsertContext<MLottery> context) {
    }

    @Override
    public void postUpdate(MLottery entity, PostUpdateContext<MLottery> context) {
    }

    @Override
    public void postDelete(MLottery entity, PostDeleteContext<MLottery> context) {
    }
}