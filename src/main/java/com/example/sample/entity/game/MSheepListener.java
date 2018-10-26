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
public class MSheepListener implements EntityListener<MSheep> {

    @Override
    public void preInsert(MSheep entity, PreInsertContext<MSheep> context) {
    }

    @Override
    public void preUpdate(MSheep entity, PreUpdateContext<MSheep> context) {
    }

    @Override
    public void preDelete(MSheep entity, PreDeleteContext<MSheep> context) {
    }

    @Override
    public void postInsert(MSheep entity, PostInsertContext<MSheep> context) {
    }

    @Override
    public void postUpdate(MSheep entity, PostUpdateContext<MSheep> context) {
    }

    @Override
    public void postDelete(MSheep entity, PostDeleteContext<MSheep> context) {
    }
}