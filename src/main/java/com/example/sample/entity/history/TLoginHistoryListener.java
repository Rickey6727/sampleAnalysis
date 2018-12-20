package com.example.sample.entity.history;

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
public class TLoginHistoryListener implements EntityListener<TLoginHistory> {

    @Override
    public void preInsert(TLoginHistory entity, PreInsertContext<TLoginHistory> context) {
    }

    @Override
    public void preUpdate(TLoginHistory entity, PreUpdateContext<TLoginHistory> context) {
    }

    @Override
    public void preDelete(TLoginHistory entity, PreDeleteContext<TLoginHistory> context) {
    }

    @Override
    public void postInsert(TLoginHistory entity, PostInsertContext<TLoginHistory> context) {
    }

    @Override
    public void postUpdate(TLoginHistory entity, PostUpdateContext<TLoginHistory> context) {
    }

    @Override
    public void postDelete(TLoginHistory entity, PostDeleteContext<TLoginHistory> context) {
    }
}