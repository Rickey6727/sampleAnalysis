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
public class TPresentEventMessageHistoryListener implements EntityListener<TPresentEventMessageHistory> {

    @Override
    public void preInsert(TPresentEventMessageHistory entity, PreInsertContext<TPresentEventMessageHistory> context) {
    }

    @Override
    public void preUpdate(TPresentEventMessageHistory entity, PreUpdateContext<TPresentEventMessageHistory> context) {
    }

    @Override
    public void preDelete(TPresentEventMessageHistory entity, PreDeleteContext<TPresentEventMessageHistory> context) {
    }

    @Override
    public void postInsert(TPresentEventMessageHistory entity, PostInsertContext<TPresentEventMessageHistory> context) {
    }

    @Override
    public void postUpdate(TPresentEventMessageHistory entity, PostUpdateContext<TPresentEventMessageHistory> context) {
    }

    @Override
    public void postDelete(TPresentEventMessageHistory entity, PostDeleteContext<TPresentEventMessageHistory> context) {
    }
}