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
public class TManageUserListener implements EntityListener<TManageUser> {

    @Override
    public void preInsert(TManageUser entity, PreInsertContext<TManageUser> context) {
    }

    @Override
    public void preUpdate(TManageUser entity, PreUpdateContext<TManageUser> context) {
    }

    @Override
    public void preDelete(TManageUser entity, PreDeleteContext<TManageUser> context) {
    }

    @Override
    public void postInsert(TManageUser entity, PostInsertContext<TManageUser> context) {
    }

    @Override
    public void postUpdate(TManageUser entity, PostUpdateContext<TManageUser> context) {
    }

    @Override
    public void postDelete(TManageUser entity, PostDeleteContext<TManageUser> context) {
    }
}