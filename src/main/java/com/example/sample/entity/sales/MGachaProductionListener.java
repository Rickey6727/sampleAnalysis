package com.example.sample.entity.sales;

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
public class MGachaProductionListener implements EntityListener<MGachaProduction> {

    @Override
    public void preInsert(MGachaProduction entity, PreInsertContext<MGachaProduction> context) {
    }

    @Override
    public void preUpdate(MGachaProduction entity, PreUpdateContext<MGachaProduction> context) {
    }

    @Override
    public void preDelete(MGachaProduction entity, PreDeleteContext<MGachaProduction> context) {
    }

    @Override
    public void postInsert(MGachaProduction entity, PostInsertContext<MGachaProduction> context) {
    }

    @Override
    public void postUpdate(MGachaProduction entity, PostUpdateContext<MGachaProduction> context) {
    }

    @Override
    public void postDelete(MGachaProduction entity, PostDeleteContext<MGachaProduction> context) {
    }
}