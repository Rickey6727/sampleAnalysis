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
public class MTipsListener implements EntityListener<MTips> {

    @Override
    public void preInsert(MTips entity, PreInsertContext<MTips> context) {
    }

    @Override
    public void preUpdate(MTips entity, PreUpdateContext<MTips> context) {
    }

    @Override
    public void preDelete(MTips entity, PreDeleteContext<MTips> context) {
    }

    @Override
    public void postInsert(MTips entity, PostInsertContext<MTips> context) {
    }

    @Override
    public void postUpdate(MTips entity, PostUpdateContext<MTips> context) {
    }

    @Override
    public void postDelete(MTips entity, PostDeleteContext<MTips> context) {
    }
}