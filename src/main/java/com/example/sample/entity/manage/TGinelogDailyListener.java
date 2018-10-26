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
public class TGinelogDailyListener implements EntityListener<TGinelogDaily> {

    @Override
    public void preInsert(TGinelogDaily entity, PreInsertContext<TGinelogDaily> context) {
    }

    @Override
    public void preUpdate(TGinelogDaily entity, PreUpdateContext<TGinelogDaily> context) {
    }

    @Override
    public void preDelete(TGinelogDaily entity, PreDeleteContext<TGinelogDaily> context) {
    }

    @Override
    public void postInsert(TGinelogDaily entity, PostInsertContext<TGinelogDaily> context) {
    }

    @Override
    public void postUpdate(TGinelogDaily entity, PostUpdateContext<TGinelogDaily> context) {
    }

    @Override
    public void postDelete(TGinelogDaily entity, PostDeleteContext<TGinelogDaily> context) {
    }
}