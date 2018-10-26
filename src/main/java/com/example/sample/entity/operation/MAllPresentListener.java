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
public class MAllPresentListener implements EntityListener<MAllPresent> {

    @Override
    public void preInsert(MAllPresent entity, PreInsertContext<MAllPresent> context) {
    }

    @Override
    public void preUpdate(MAllPresent entity, PreUpdateContext<MAllPresent> context) {
    }

    @Override
    public void preDelete(MAllPresent entity, PreDeleteContext<MAllPresent> context) {
    }

    @Override
    public void postInsert(MAllPresent entity, PostInsertContext<MAllPresent> context) {
    }

    @Override
    public void postUpdate(MAllPresent entity, PostUpdateContext<MAllPresent> context) {
    }

    @Override
    public void postDelete(MAllPresent entity, PostDeleteContext<MAllPresent> context) {
    }
}