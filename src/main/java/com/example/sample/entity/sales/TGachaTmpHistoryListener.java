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
public class TGachaTmpHistoryListener implements EntityListener<TGachaTmpHistory> {

    @Override
    public void preInsert(TGachaTmpHistory entity, PreInsertContext<TGachaTmpHistory> context) {
    }

    @Override
    public void preUpdate(TGachaTmpHistory entity, PreUpdateContext<TGachaTmpHistory> context) {
    }

    @Override
    public void preDelete(TGachaTmpHistory entity, PreDeleteContext<TGachaTmpHistory> context) {
    }

    @Override
    public void postInsert(TGachaTmpHistory entity, PostInsertContext<TGachaTmpHistory> context) {
    }

    @Override
    public void postUpdate(TGachaTmpHistory entity, PostUpdateContext<TGachaTmpHistory> context) {
    }

    @Override
    public void postDelete(TGachaTmpHistory entity, PostDeleteContext<TGachaTmpHistory> context) {
    }
}