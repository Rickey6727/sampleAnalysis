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
public class MRaiseEventCarePointListener implements EntityListener<MRaiseEventCarePoint> {

    @Override
    public void preInsert(MRaiseEventCarePoint entity, PreInsertContext<MRaiseEventCarePoint> context) {
    }

    @Override
    public void preUpdate(MRaiseEventCarePoint entity, PreUpdateContext<MRaiseEventCarePoint> context) {
    }

    @Override
    public void preDelete(MRaiseEventCarePoint entity, PreDeleteContext<MRaiseEventCarePoint> context) {
    }

    @Override
    public void postInsert(MRaiseEventCarePoint entity, PostInsertContext<MRaiseEventCarePoint> context) {
    }

    @Override
    public void postUpdate(MRaiseEventCarePoint entity, PostUpdateContext<MRaiseEventCarePoint> context) {
    }

    @Override
    public void postDelete(MRaiseEventCarePoint entity, PostDeleteContext<MRaiseEventCarePoint> context) {
    }
}