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
public class TQuestOwn80Listener implements EntityListener<TQuestOwn80> {

    @Override
    public void preInsert(TQuestOwn80 entity, PreInsertContext<TQuestOwn80> context) {
    }

    @Override
    public void preUpdate(TQuestOwn80 entity, PreUpdateContext<TQuestOwn80> context) {
    }

    @Override
    public void preDelete(TQuestOwn80 entity, PreDeleteContext<TQuestOwn80> context) {
    }

    @Override
    public void postInsert(TQuestOwn80 entity, PostInsertContext<TQuestOwn80> context) {
    }

    @Override
    public void postUpdate(TQuestOwn80 entity, PostUpdateContext<TQuestOwn80> context) {
    }

    @Override
    public void postDelete(TQuestOwn80 entity, PostDeleteContext<TQuestOwn80> context) {
    }
}