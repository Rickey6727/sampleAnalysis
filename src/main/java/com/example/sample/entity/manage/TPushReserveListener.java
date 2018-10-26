package com.example.sample.entity.manage;

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
public class TPushReserveListener implements EntityListener<TPushReserve> {

    @Override
    public void preInsert(TPushReserve entity, PreInsertContext<TPushReserve> context) {
    }

    @Override
    public void preUpdate(TPushReserve entity, PreUpdateContext<TPushReserve> context) {
    }

    @Override
    public void preDelete(TPushReserve entity, PreDeleteContext<TPushReserve> context) {
    }

    @Override
    public void postInsert(TPushReserve entity, PostInsertContext<TPushReserve> context) {
    }

    @Override
    public void postUpdate(TPushReserve entity, PostUpdateContext<TPushReserve> context) {
    }

    @Override
    public void postDelete(TPushReserve entity, PostDeleteContext<TPushReserve> context) {
    }
}