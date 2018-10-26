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
public class MRaiseEventLevelListener implements EntityListener<MRaiseEventLevel> {

    @Override
    public void preInsert(MRaiseEventLevel entity, PreInsertContext<MRaiseEventLevel> context) {
    }

    @Override
    public void preUpdate(MRaiseEventLevel entity, PreUpdateContext<MRaiseEventLevel> context) {
    }

    @Override
    public void preDelete(MRaiseEventLevel entity, PreDeleteContext<MRaiseEventLevel> context) {
    }

    @Override
    public void postInsert(MRaiseEventLevel entity, PostInsertContext<MRaiseEventLevel> context) {
    }

    @Override
    public void postUpdate(MRaiseEventLevel entity, PostUpdateContext<MRaiseEventLevel> context) {
    }

    @Override
    public void postDelete(MRaiseEventLevel entity, PostDeleteContext<MRaiseEventLevel> context) {
    }
}