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
public class TQuestOwn24Listener implements EntityListener<TQuestOwn24> {

    @Override
    public void preInsert(TQuestOwn24 entity, PreInsertContext<TQuestOwn24> context) {
    }

    @Override
    public void preUpdate(TQuestOwn24 entity, PreUpdateContext<TQuestOwn24> context) {
    }

    @Override
    public void preDelete(TQuestOwn24 entity, PreDeleteContext<TQuestOwn24> context) {
    }

    @Override
    public void postInsert(TQuestOwn24 entity, PostInsertContext<TQuestOwn24> context) {
    }

    @Override
    public void postUpdate(TQuestOwn24 entity, PostUpdateContext<TQuestOwn24> context) {
    }

    @Override
    public void postDelete(TQuestOwn24 entity, PostDeleteContext<TQuestOwn24> context) {
    }
}