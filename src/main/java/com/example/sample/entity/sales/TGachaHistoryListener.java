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
public class TGachaHistoryListener implements EntityListener<TGachaHistory> {

    @Override
    public void preInsert(TGachaHistory entity, PreInsertContext<TGachaHistory> context) {
    }

    @Override
    public void preUpdate(TGachaHistory entity, PreUpdateContext<TGachaHistory> context) {
    }

    @Override
    public void preDelete(TGachaHistory entity, PreDeleteContext<TGachaHistory> context) {
    }

    @Override
    public void postInsert(TGachaHistory entity, PostInsertContext<TGachaHistory> context) {
    }

    @Override
    public void postUpdate(TGachaHistory entity, PostUpdateContext<TGachaHistory> context) {
    }

    @Override
    public void postDelete(TGachaHistory entity, PostDeleteContext<TGachaHistory> context) {
    }
}