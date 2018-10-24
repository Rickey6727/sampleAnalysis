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
public class TAccountBasicInfoListener implements EntityListener<TAccountBasicInfo> {

    @Override
    public void preInsert(TAccountBasicInfo entity, PreInsertContext<TAccountBasicInfo> context) {
    }

    @Override
    public void preUpdate(TAccountBasicInfo entity, PreUpdateContext<TAccountBasicInfo> context) {
    }

    @Override
    public void preDelete(TAccountBasicInfo entity, PreDeleteContext<TAccountBasicInfo> context) {
    }

    @Override
    public void postInsert(TAccountBasicInfo entity, PostInsertContext<TAccountBasicInfo> context) {
    }

    @Override
    public void postUpdate(TAccountBasicInfo entity, PostUpdateContext<TAccountBasicInfo> context) {
    }

    @Override
    public void postDelete(TAccountBasicInfo entity, PostDeleteContext<TAccountBasicInfo> context) {
    }
}