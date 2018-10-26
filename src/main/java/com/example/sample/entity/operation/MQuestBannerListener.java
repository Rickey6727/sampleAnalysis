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
public class MQuestBannerListener implements EntityListener<MQuestBanner> {

    @Override
    public void preInsert(MQuestBanner entity, PreInsertContext<MQuestBanner> context) {
    }

    @Override
    public void preUpdate(MQuestBanner entity, PreUpdateContext<MQuestBanner> context) {
    }

    @Override
    public void preDelete(MQuestBanner entity, PreDeleteContext<MQuestBanner> context) {
    }

    @Override
    public void postInsert(MQuestBanner entity, PostInsertContext<MQuestBanner> context) {
    }

    @Override
    public void postUpdate(MQuestBanner entity, PostUpdateContext<MQuestBanner> context) {
    }

    @Override
    public void postDelete(MQuestBanner entity, PostDeleteContext<MQuestBanner> context) {
    }
}