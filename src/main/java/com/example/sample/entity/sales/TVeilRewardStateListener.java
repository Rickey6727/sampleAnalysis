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
public class TVeilRewardStateListener implements EntityListener<TVeilRewardState> {

    @Override
    public void preInsert(TVeilRewardState entity, PreInsertContext<TVeilRewardState> context) {
    }

    @Override
    public void preUpdate(TVeilRewardState entity, PreUpdateContext<TVeilRewardState> context) {
    }

    @Override
    public void preDelete(TVeilRewardState entity, PreDeleteContext<TVeilRewardState> context) {
    }

    @Override
    public void postInsert(TVeilRewardState entity, PostInsertContext<TVeilRewardState> context) {
    }

    @Override
    public void postUpdate(TVeilRewardState entity, PostUpdateContext<TVeilRewardState> context) {
    }

    @Override
    public void postDelete(TVeilRewardState entity, PostDeleteContext<TVeilRewardState> context) {
    }
}