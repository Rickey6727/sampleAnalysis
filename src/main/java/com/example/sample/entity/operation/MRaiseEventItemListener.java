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
public class MRaiseEventItemListener implements EntityListener<MRaiseEventItem> {

    @Override
    public void preInsert(MRaiseEventItem entity, PreInsertContext<MRaiseEventItem> context) {
    }

    @Override
    public void preUpdate(MRaiseEventItem entity, PreUpdateContext<MRaiseEventItem> context) {
    }

    @Override
    public void preDelete(MRaiseEventItem entity, PreDeleteContext<MRaiseEventItem> context) {
    }

    @Override
    public void postInsert(MRaiseEventItem entity, PostInsertContext<MRaiseEventItem> context) {
    }

    @Override
    public void postUpdate(MRaiseEventItem entity, PostUpdateContext<MRaiseEventItem> context) {
    }

    @Override
    public void postDelete(MRaiseEventItem entity, PostDeleteContext<MRaiseEventItem> context) {
    }
}