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
public class TQuestOwn9Listener implements EntityListener<TQuestOwn9> {

    @Override
    public void preInsert(TQuestOwn9 entity, PreInsertContext<TQuestOwn9> context) {
    }

    @Override
    public void preUpdate(TQuestOwn9 entity, PreUpdateContext<TQuestOwn9> context) {
    }

    @Override
    public void preDelete(TQuestOwn9 entity, PreDeleteContext<TQuestOwn9> context) {
    }

    @Override
    public void postInsert(TQuestOwn9 entity, PostInsertContext<TQuestOwn9> context) {
    }

    @Override
    public void postUpdate(TQuestOwn9 entity, PostUpdateContext<TQuestOwn9> context) {
    }

    @Override
    public void postDelete(TQuestOwn9 entity, PostDeleteContext<TQuestOwn9> context) {
    }
}