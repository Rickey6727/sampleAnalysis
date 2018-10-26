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
public class MRaiseEventNpcListener implements EntityListener<MRaiseEventNpc> {

    @Override
    public void preInsert(MRaiseEventNpc entity, PreInsertContext<MRaiseEventNpc> context) {
    }

    @Override
    public void preUpdate(MRaiseEventNpc entity, PreUpdateContext<MRaiseEventNpc> context) {
    }

    @Override
    public void preDelete(MRaiseEventNpc entity, PreDeleteContext<MRaiseEventNpc> context) {
    }

    @Override
    public void postInsert(MRaiseEventNpc entity, PostInsertContext<MRaiseEventNpc> context) {
    }

    @Override
    public void postUpdate(MRaiseEventNpc entity, PostUpdateContext<MRaiseEventNpc> context) {
    }

    @Override
    public void postDelete(MRaiseEventNpc entity, PostDeleteContext<MRaiseEventNpc> context) {
    }
}