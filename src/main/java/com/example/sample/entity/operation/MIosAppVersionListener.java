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
public class MIosAppVersionListener implements EntityListener<MIosAppVersion> {

    @Override
    public void preInsert(MIosAppVersion entity, PreInsertContext<MIosAppVersion> context) {
    }

    @Override
    public void preUpdate(MIosAppVersion entity, PreUpdateContext<MIosAppVersion> context) {
    }

    @Override
    public void preDelete(MIosAppVersion entity, PreDeleteContext<MIosAppVersion> context) {
    }

    @Override
    public void postInsert(MIosAppVersion entity, PostInsertContext<MIosAppVersion> context) {
    }

    @Override
    public void postUpdate(MIosAppVersion entity, PostUpdateContext<MIosAppVersion> context) {
    }

    @Override
    public void postDelete(MIosAppVersion entity, PostDeleteContext<MIosAppVersion> context) {
    }
}