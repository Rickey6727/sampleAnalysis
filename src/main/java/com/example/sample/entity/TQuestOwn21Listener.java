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
public class TQuestOwn21Listener implements EntityListener<TQuestOwn21> {

    @Override
    public void preInsert(TQuestOwn21 entity, PreInsertContext<TQuestOwn21> context) {
    }

    @Override
    public void preUpdate(TQuestOwn21 entity, PreUpdateContext<TQuestOwn21> context) {
    }

    @Override
    public void preDelete(TQuestOwn21 entity, PreDeleteContext<TQuestOwn21> context) {
    }

    @Override
    public void postInsert(TQuestOwn21 entity, PostInsertContext<TQuestOwn21> context) {
    }

    @Override
    public void postUpdate(TQuestOwn21 entity, PostUpdateContext<TQuestOwn21> context) {
    }

    @Override
    public void postDelete(TQuestOwn21 entity, PostDeleteContext<TQuestOwn21> context) {
    }
}