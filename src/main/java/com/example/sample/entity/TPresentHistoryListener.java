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
public class TPresentHistoryListener implements EntityListener<TPresentHistory> {

    @Override
    public void preInsert(TPresentHistory entity, PreInsertContext<TPresentHistory> context) {
    }

    @Override
    public void preUpdate(TPresentHistory entity, PreUpdateContext<TPresentHistory> context) {
    }

    @Override
    public void preDelete(TPresentHistory entity, PreDeleteContext<TPresentHistory> context) {
    }

    @Override
    public void postInsert(TPresentHistory entity, PostInsertContext<TPresentHistory> context) {
    }

    @Override
    public void postUpdate(TPresentHistory entity, PostUpdateContext<TPresentHistory> context) {
    }

    @Override
    public void postDelete(TPresentHistory entity, PostDeleteContext<TPresentHistory> context) {
    }
}