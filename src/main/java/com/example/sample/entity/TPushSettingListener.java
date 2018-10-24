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
public class TPushSettingListener implements EntityListener<TPushSetting> {

    @Override
    public void preInsert(TPushSetting entity, PreInsertContext<TPushSetting> context) {
    }

    @Override
    public void preUpdate(TPushSetting entity, PreUpdateContext<TPushSetting> context) {
    }

    @Override
    public void preDelete(TPushSetting entity, PreDeleteContext<TPushSetting> context) {
    }

    @Override
    public void postInsert(TPushSetting entity, PostInsertContext<TPushSetting> context) {
    }

    @Override
    public void postUpdate(TPushSetting entity, PostUpdateContext<TPushSetting> context) {
    }

    @Override
    public void postDelete(TPushSetting entity, PostDeleteContext<TPushSetting> context) {
    }
}