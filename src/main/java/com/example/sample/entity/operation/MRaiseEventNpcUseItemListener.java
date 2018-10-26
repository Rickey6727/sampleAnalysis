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
public class MRaiseEventNpcUseItemListener implements EntityListener<MRaiseEventNpcUseItem> {

    @Override
    public void preInsert(MRaiseEventNpcUseItem entity, PreInsertContext<MRaiseEventNpcUseItem> context) {
    }

    @Override
    public void preUpdate(MRaiseEventNpcUseItem entity, PreUpdateContext<MRaiseEventNpcUseItem> context) {
    }

    @Override
    public void preDelete(MRaiseEventNpcUseItem entity, PreDeleteContext<MRaiseEventNpcUseItem> context) {
    }

    @Override
    public void postInsert(MRaiseEventNpcUseItem entity, PostInsertContext<MRaiseEventNpcUseItem> context) {
    }

    @Override
    public void postUpdate(MRaiseEventNpcUseItem entity, PostUpdateContext<MRaiseEventNpcUseItem> context) {
    }

    @Override
    public void postDelete(MRaiseEventNpcUseItem entity, PostDeleteContext<MRaiseEventNpcUseItem> context) {
    }
}