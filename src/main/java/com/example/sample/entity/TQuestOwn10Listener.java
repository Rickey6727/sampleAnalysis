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
public class TQuestOwn10Listener implements EntityListener<TQuestOwn10> {

    @Override
    public void preInsert(TQuestOwn10 entity, PreInsertContext<TQuestOwn10> context) {
    }

    @Override
    public void preUpdate(TQuestOwn10 entity, PreUpdateContext<TQuestOwn10> context) {
    }

    @Override
    public void preDelete(TQuestOwn10 entity, PreDeleteContext<TQuestOwn10> context) {
    }

    @Override
    public void postInsert(TQuestOwn10 entity, PostInsertContext<TQuestOwn10> context) {
    }

    @Override
    public void postUpdate(TQuestOwn10 entity, PostUpdateContext<TQuestOwn10> context) {
    }

    @Override
    public void postDelete(TQuestOwn10 entity, PostDeleteContext<TQuestOwn10> context) {
    }
}