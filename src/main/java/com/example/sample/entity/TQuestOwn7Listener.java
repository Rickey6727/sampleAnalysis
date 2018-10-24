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
public class TQuestOwn7Listener implements EntityListener<TQuestOwn7> {

    @Override
    public void preInsert(TQuestOwn7 entity, PreInsertContext<TQuestOwn7> context) {
    }

    @Override
    public void preUpdate(TQuestOwn7 entity, PreUpdateContext<TQuestOwn7> context) {
    }

    @Override
    public void preDelete(TQuestOwn7 entity, PreDeleteContext<TQuestOwn7> context) {
    }

    @Override
    public void postInsert(TQuestOwn7 entity, PostInsertContext<TQuestOwn7> context) {
    }

    @Override
    public void postUpdate(TQuestOwn7 entity, PostUpdateContext<TQuestOwn7> context) {
    }

    @Override
    public void postDelete(TQuestOwn7 entity, PostDeleteContext<TQuestOwn7> context) {
    }
}