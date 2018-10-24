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
public class TQuestOwn15Listener implements EntityListener<TQuestOwn15> {

    @Override
    public void preInsert(TQuestOwn15 entity, PreInsertContext<TQuestOwn15> context) {
    }

    @Override
    public void preUpdate(TQuestOwn15 entity, PreUpdateContext<TQuestOwn15> context) {
    }

    @Override
    public void preDelete(TQuestOwn15 entity, PreDeleteContext<TQuestOwn15> context) {
    }

    @Override
    public void postInsert(TQuestOwn15 entity, PostInsertContext<TQuestOwn15> context) {
    }

    @Override
    public void postUpdate(TQuestOwn15 entity, PostUpdateContext<TQuestOwn15> context) {
    }

    @Override
    public void postDelete(TQuestOwn15 entity, PostDeleteContext<TQuestOwn15> context) {
    }
}