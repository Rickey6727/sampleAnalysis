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
public class TMaintenanceListener implements EntityListener<TMaintenance> {

    @Override
    public void preInsert(TMaintenance entity, PreInsertContext<TMaintenance> context) {
    }

    @Override
    public void preUpdate(TMaintenance entity, PreUpdateContext<TMaintenance> context) {
    }

    @Override
    public void preDelete(TMaintenance entity, PreDeleteContext<TMaintenance> context) {
    }

    @Override
    public void postInsert(TMaintenance entity, PostInsertContext<TMaintenance> context) {
    }

    @Override
    public void postUpdate(TMaintenance entity, PostUpdateContext<TMaintenance> context) {
    }

    @Override
    public void postDelete(TMaintenance entity, PostDeleteContext<TMaintenance> context) {
    }
}