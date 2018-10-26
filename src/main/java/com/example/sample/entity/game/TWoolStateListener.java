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
public class TWoolStateListener implements EntityListener<TWoolState> {

    @Override
    public void preInsert(TWoolState entity, PreInsertContext<TWoolState> context) {
    }

    @Override
    public void preUpdate(TWoolState entity, PreUpdateContext<TWoolState> context) {
    }

    @Override
    public void preDelete(TWoolState entity, PreDeleteContext<TWoolState> context) {
    }

    @Override
    public void postInsert(TWoolState entity, PostInsertContext<TWoolState> context) {
    }

    @Override
    public void postUpdate(TWoolState entity, PostUpdateContext<TWoolState> context) {
    }

    @Override
    public void postDelete(TWoolState entity, PostDeleteContext<TWoolState> context) {
    }
}