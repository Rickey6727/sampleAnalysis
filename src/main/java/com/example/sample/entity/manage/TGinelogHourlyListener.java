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
public class TGinelogHourlyListener implements EntityListener<TGinelogHourly> {

    @Override
    public void preInsert(TGinelogHourly entity, PreInsertContext<TGinelogHourly> context) {
    }

    @Override
    public void preUpdate(TGinelogHourly entity, PreUpdateContext<TGinelogHourly> context) {
    }

    @Override
    public void preDelete(TGinelogHourly entity, PreDeleteContext<TGinelogHourly> context) {
    }

    @Override
    public void postInsert(TGinelogHourly entity, PostInsertContext<TGinelogHourly> context) {
    }

    @Override
    public void postUpdate(TGinelogHourly entity, PostUpdateContext<TGinelogHourly> context) {
    }

    @Override
    public void postDelete(TGinelogHourly entity, PostDeleteContext<TGinelogHourly> context) {
    }
}