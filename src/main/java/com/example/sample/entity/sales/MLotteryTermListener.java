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
public class MLotteryTermListener implements EntityListener<MLotteryTerm> {

    @Override
    public void preInsert(MLotteryTerm entity, PreInsertContext<MLotteryTerm> context) {
    }

    @Override
    public void preUpdate(MLotteryTerm entity, PreUpdateContext<MLotteryTerm> context) {
    }

    @Override
    public void preDelete(MLotteryTerm entity, PreDeleteContext<MLotteryTerm> context) {
    }

    @Override
    public void postInsert(MLotteryTerm entity, PostInsertContext<MLotteryTerm> context) {
    }

    @Override
    public void postUpdate(MLotteryTerm entity, PostUpdateContext<MLotteryTerm> context) {
    }

    @Override
    public void postDelete(MLotteryTerm entity, PostDeleteContext<MLotteryTerm> context) {
    }
}