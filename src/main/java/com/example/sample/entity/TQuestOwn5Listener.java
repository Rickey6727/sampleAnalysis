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
public class TQuestOwn5Listener implements EntityListener<TQuestOwn5> {

    @Override
    public void preInsert(TQuestOwn5 entity, PreInsertContext<TQuestOwn5> context) {
    }

    @Override
    public void preUpdate(TQuestOwn5 entity, PreUpdateContext<TQuestOwn5> context) {
    }

    @Override
    public void preDelete(TQuestOwn5 entity, PreDeleteContext<TQuestOwn5> context) {
    }

    @Override
    public void postInsert(TQuestOwn5 entity, PostInsertContext<TQuestOwn5> context) {
    }

    @Override
    public void postUpdate(TQuestOwn5 entity, PostUpdateContext<TQuestOwn5> context) {
    }

    @Override
    public void postDelete(TQuestOwn5 entity, PostDeleteContext<TQuestOwn5> context) {
    }
}