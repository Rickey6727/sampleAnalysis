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
public class TQuestOwn6Listener implements EntityListener<TQuestOwn6> {

    @Override
    public void preInsert(TQuestOwn6 entity, PreInsertContext<TQuestOwn6> context) {
    }

    @Override
    public void preUpdate(TQuestOwn6 entity, PreUpdateContext<TQuestOwn6> context) {
    }

    @Override
    public void preDelete(TQuestOwn6 entity, PreDeleteContext<TQuestOwn6> context) {
    }

    @Override
    public void postInsert(TQuestOwn6 entity, PostInsertContext<TQuestOwn6> context) {
    }

    @Override
    public void postUpdate(TQuestOwn6 entity, PostUpdateContext<TQuestOwn6> context) {
    }

    @Override
    public void postDelete(TQuestOwn6 entity, PostDeleteContext<TQuestOwn6> context) {
    }
}