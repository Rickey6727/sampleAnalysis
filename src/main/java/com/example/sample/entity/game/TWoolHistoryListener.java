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
public class TWoolHistoryListener implements EntityListener<TWoolHistory> {

    @Override
    public void preInsert(TWoolHistory entity, PreInsertContext<TWoolHistory> context) {
    }

    @Override
    public void preUpdate(TWoolHistory entity, PreUpdateContext<TWoolHistory> context) {
    }

    @Override
    public void preDelete(TWoolHistory entity, PreDeleteContext<TWoolHistory> context) {
    }

    @Override
    public void postInsert(TWoolHistory entity, PostInsertContext<TWoolHistory> context) {
    }

    @Override
    public void postUpdate(TWoolHistory entity, PostUpdateContext<TWoolHistory> context) {
    }

    @Override
    public void postDelete(TWoolHistory entity, PostDeleteContext<TWoolHistory> context) {
    }
}