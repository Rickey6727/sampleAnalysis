package com.example.sample.entity;

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
public class TCheerNoticeListener implements EntityListener<TCheerNotice> {

    @Override
    public void preInsert(TCheerNotice entity, PreInsertContext<TCheerNotice> context) {
    }

    @Override
    public void preUpdate(TCheerNotice entity, PreUpdateContext<TCheerNotice> context) {
    }

    @Override
    public void preDelete(TCheerNotice entity, PreDeleteContext<TCheerNotice> context) {
    }

    @Override
    public void postInsert(TCheerNotice entity, PostInsertContext<TCheerNotice> context) {
    }

    @Override
    public void postUpdate(TCheerNotice entity, PostUpdateContext<TCheerNotice> context) {
    }

    @Override
    public void postDelete(TCheerNotice entity, PostDeleteContext<TCheerNotice> context) {
    }
}