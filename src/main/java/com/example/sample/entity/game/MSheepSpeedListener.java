package com.example.sample.entity.game;

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
public class MSheepSpeedListener implements EntityListener<MSheepSpeed> {

    @Override
    public void preInsert(MSheepSpeed entity, PreInsertContext<MSheepSpeed> context) {
    }

    @Override
    public void preUpdate(MSheepSpeed entity, PreUpdateContext<MSheepSpeed> context) {
    }

    @Override
    public void preDelete(MSheepSpeed entity, PreDeleteContext<MSheepSpeed> context) {
    }

    @Override
    public void postInsert(MSheepSpeed entity, PostInsertContext<MSheepSpeed> context) {
    }

    @Override
    public void postUpdate(MSheepSpeed entity, PostUpdateContext<MSheepSpeed> context) {
    }

    @Override
    public void postDelete(MSheepSpeed entity, PostDeleteContext<MSheepSpeed> context) {
    }
}