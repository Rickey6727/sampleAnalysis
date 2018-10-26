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
public class MCheerEventDetailListener implements EntityListener<MCheerEventDetail> {

    @Override
    public void preInsert(MCheerEventDetail entity, PreInsertContext<MCheerEventDetail> context) {
    }

    @Override
    public void preUpdate(MCheerEventDetail entity, PreUpdateContext<MCheerEventDetail> context) {
    }

    @Override
    public void preDelete(MCheerEventDetail entity, PreDeleteContext<MCheerEventDetail> context) {
    }

    @Override
    public void postInsert(MCheerEventDetail entity, PostInsertContext<MCheerEventDetail> context) {
    }

    @Override
    public void postUpdate(MCheerEventDetail entity, PostUpdateContext<MCheerEventDetail> context) {
    }

    @Override
    public void postDelete(MCheerEventDetail entity, PostDeleteContext<MCheerEventDetail> context) {
    }
}