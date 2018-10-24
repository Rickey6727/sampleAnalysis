package com.example.sample.entity;

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
public class TPresentEventHistoryListener implements EntityListener<TPresentEventHistory> {

    @Override
    public void preInsert(TPresentEventHistory entity, PreInsertContext<TPresentEventHistory> context) {
    }

    @Override
    public void preUpdate(TPresentEventHistory entity, PreUpdateContext<TPresentEventHistory> context) {
    }

    @Override
    public void preDelete(TPresentEventHistory entity, PreDeleteContext<TPresentEventHistory> context) {
    }

    @Override
    public void postInsert(TPresentEventHistory entity, PostInsertContext<TPresentEventHistory> context) {
    }

    @Override
    public void postUpdate(TPresentEventHistory entity, PostUpdateContext<TPresentEventHistory> context) {
    }

    @Override
    public void postDelete(TPresentEventHistory entity, PostDeleteContext<TPresentEventHistory> context) {
    }
}