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
public class TQuestOwn8Listener implements EntityListener<TQuestOwn8> {

    @Override
    public void preInsert(TQuestOwn8 entity, PreInsertContext<TQuestOwn8> context) {
    }

    @Override
    public void preUpdate(TQuestOwn8 entity, PreUpdateContext<TQuestOwn8> context) {
    }

    @Override
    public void preDelete(TQuestOwn8 entity, PreDeleteContext<TQuestOwn8> context) {
    }

    @Override
    public void postInsert(TQuestOwn8 entity, PostInsertContext<TQuestOwn8> context) {
    }

    @Override
    public void postUpdate(TQuestOwn8 entity, PostUpdateContext<TQuestOwn8> context) {
    }

    @Override
    public void postDelete(TQuestOwn8 entity, PostDeleteContext<TQuestOwn8> context) {
    }
}