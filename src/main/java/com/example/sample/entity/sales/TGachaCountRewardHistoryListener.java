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
public class TGachaCountRewardHistoryListener implements EntityListener<TGachaCountRewardHistory> {

    @Override
    public void preInsert(TGachaCountRewardHistory entity, PreInsertContext<TGachaCountRewardHistory> context) {
    }

    @Override
    public void preUpdate(TGachaCountRewardHistory entity, PreUpdateContext<TGachaCountRewardHistory> context) {
    }

    @Override
    public void preDelete(TGachaCountRewardHistory entity, PreDeleteContext<TGachaCountRewardHistory> context) {
    }

    @Override
    public void postInsert(TGachaCountRewardHistory entity, PostInsertContext<TGachaCountRewardHistory> context) {
    }

    @Override
    public void postUpdate(TGachaCountRewardHistory entity, PostUpdateContext<TGachaCountRewardHistory> context) {
    }

    @Override
    public void postDelete(TGachaCountRewardHistory entity, PostDeleteContext<TGachaCountRewardHistory> context) {
    }
}