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
public class TQuestOwn50Listener implements EntityListener<TQuestOwn50> {

    @Override
    public void preInsert(TQuestOwn50 entity, PreInsertContext<TQuestOwn50> context) {
    }

    @Override
    public void preUpdate(TQuestOwn50 entity, PreUpdateContext<TQuestOwn50> context) {
    }

    @Override
    public void preDelete(TQuestOwn50 entity, PreDeleteContext<TQuestOwn50> context) {
    }

    @Override
    public void postInsert(TQuestOwn50 entity, PostInsertContext<TQuestOwn50> context) {
    }

    @Override
    public void postUpdate(TQuestOwn50 entity, PostUpdateContext<TQuestOwn50> context) {
    }

    @Override
    public void postDelete(TQuestOwn50 entity, PostDeleteContext<TQuestOwn50> context) {
    }
}