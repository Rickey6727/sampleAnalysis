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
public class MBannerListener implements EntityListener<MBanner> {

    @Override
    public void preInsert(MBanner entity, PreInsertContext<MBanner> context) {
    }

    @Override
    public void preUpdate(MBanner entity, PreUpdateContext<MBanner> context) {
    }

    @Override
    public void preDelete(MBanner entity, PreDeleteContext<MBanner> context) {
    }

    @Override
    public void postInsert(MBanner entity, PostInsertContext<MBanner> context) {
    }

    @Override
    public void postUpdate(MBanner entity, PostUpdateContext<MBanner> context) {
    }

    @Override
    public void postDelete(MBanner entity, PostDeleteContext<MBanner> context) {
    }
}