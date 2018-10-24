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
public class TAccountMigrationListener implements EntityListener<TAccountMigration> {

    @Override
    public void preInsert(TAccountMigration entity, PreInsertContext<TAccountMigration> context) {
    }

    @Override
    public void preUpdate(TAccountMigration entity, PreUpdateContext<TAccountMigration> context) {
    }

    @Override
    public void preDelete(TAccountMigration entity, PreDeleteContext<TAccountMigration> context) {
    }

    @Override
    public void postInsert(TAccountMigration entity, PostInsertContext<TAccountMigration> context) {
    }

    @Override
    public void postUpdate(TAccountMigration entity, PostUpdateContext<TAccountMigration> context) {
    }

    @Override
    public void postDelete(TAccountMigration entity, PostDeleteContext<TAccountMigration> context) {
    }
}