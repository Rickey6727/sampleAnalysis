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
public class TEventCoinHistoryListener implements EntityListener<TEventCoinHistory> {

    @Override
    public void preInsert(TEventCoinHistory entity, PreInsertContext<TEventCoinHistory> context) {
    }

    @Override
    public void preUpdate(TEventCoinHistory entity, PreUpdateContext<TEventCoinHistory> context) {
    }

    @Override
    public void preDelete(TEventCoinHistory entity, PreDeleteContext<TEventCoinHistory> context) {
    }

    @Override
    public void postInsert(TEventCoinHistory entity, PostInsertContext<TEventCoinHistory> context) {
    }

    @Override
    public void postUpdate(TEventCoinHistory entity, PostUpdateContext<TEventCoinHistory> context) {
    }

    @Override
    public void postDelete(TEventCoinHistory entity, PostDeleteContext<TEventCoinHistory> context) {
    }
}