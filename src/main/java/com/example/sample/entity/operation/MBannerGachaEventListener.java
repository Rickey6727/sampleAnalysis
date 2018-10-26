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
public class MBannerGachaEventListener implements EntityListener<MBannerGachaEvent> {

    @Override
    public void preInsert(MBannerGachaEvent entity, PreInsertContext<MBannerGachaEvent> context) {
    }

    @Override
    public void preUpdate(MBannerGachaEvent entity, PreUpdateContext<MBannerGachaEvent> context) {
    }

    @Override
    public void preDelete(MBannerGachaEvent entity, PreDeleteContext<MBannerGachaEvent> context) {
    }

    @Override
    public void postInsert(MBannerGachaEvent entity, PostInsertContext<MBannerGachaEvent> context) {
    }

    @Override
    public void postUpdate(MBannerGachaEvent entity, PostUpdateContext<MBannerGachaEvent> context) {
    }

    @Override
    public void postDelete(MBannerGachaEvent entity, PostDeleteContext<MBannerGachaEvent> context) {
    }
}