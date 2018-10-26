package com.example.sample.entity.operation;

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
public class MTransitionListener implements EntityListener<MTransition> {

    @Override
    public void preInsert(MTransition entity, PreInsertContext<MTransition> context) {
    }

    @Override
    public void preUpdate(MTransition entity, PreUpdateContext<MTransition> context) {
    }

    @Override
    public void preDelete(MTransition entity, PreDeleteContext<MTransition> context) {
    }

    @Override
    public void postInsert(MTransition entity, PostInsertContext<MTransition> context) {
    }

    @Override
    public void postUpdate(MTransition entity, PostUpdateContext<MTransition> context) {
    }

    @Override
    public void postDelete(MTransition entity, PostDeleteContext<MTransition> context) {
    }
}