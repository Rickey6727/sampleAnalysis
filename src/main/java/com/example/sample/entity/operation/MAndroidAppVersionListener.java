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
public class MAndroidAppVersionListener implements EntityListener<MAndroidAppVersion> {

    @Override
    public void preInsert(MAndroidAppVersion entity, PreInsertContext<MAndroidAppVersion> context) {
    }

    @Override
    public void preUpdate(MAndroidAppVersion entity, PreUpdateContext<MAndroidAppVersion> context) {
    }

    @Override
    public void preDelete(MAndroidAppVersion entity, PreDeleteContext<MAndroidAppVersion> context) {
    }

    @Override
    public void postInsert(MAndroidAppVersion entity, PostInsertContext<MAndroidAppVersion> context) {
    }

    @Override
    public void postUpdate(MAndroidAppVersion entity, PostUpdateContext<MAndroidAppVersion> context) {
    }

    @Override
    public void postDelete(MAndroidAppVersion entity, PostDeleteContext<MAndroidAppVersion> context) {
    }
}