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
public class MNoticeMessageListener implements EntityListener<MNoticeMessage> {

    @Override
    public void preInsert(MNoticeMessage entity, PreInsertContext<MNoticeMessage> context) {
    }

    @Override
    public void preUpdate(MNoticeMessage entity, PreUpdateContext<MNoticeMessage> context) {
    }

    @Override
    public void preDelete(MNoticeMessage entity, PreDeleteContext<MNoticeMessage> context) {
    }

    @Override
    public void postInsert(MNoticeMessage entity, PostInsertContext<MNoticeMessage> context) {
    }

    @Override
    public void postUpdate(MNoticeMessage entity, PostUpdateContext<MNoticeMessage> context) {
    }

    @Override
    public void postDelete(MNoticeMessage entity, PostDeleteContext<MNoticeMessage> context) {
    }
}