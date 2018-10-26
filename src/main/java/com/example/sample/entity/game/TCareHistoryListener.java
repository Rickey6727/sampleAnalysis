package com.example.sample.entity.game;

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
public class TCareHistoryListener implements EntityListener<TCareHistory> {

    @Override
    public void preInsert(TCareHistory entity, PreInsertContext<TCareHistory> context) {
    }

    @Override
    public void preUpdate(TCareHistory entity, PreUpdateContext<TCareHistory> context) {
    }

    @Override
    public void preDelete(TCareHistory entity, PreDeleteContext<TCareHistory> context) {
    }

    @Override
    public void postInsert(TCareHistory entity, PostInsertContext<TCareHistory> context) {
    }

    @Override
    public void postUpdate(TCareHistory entity, PostUpdateContext<TCareHistory> context) {
    }

    @Override
    public void postDelete(TCareHistory entity, PostDeleteContext<TCareHistory> context) {
    }
}