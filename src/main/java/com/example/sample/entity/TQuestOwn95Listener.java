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
public class TQuestOwn95Listener implements EntityListener<TQuestOwn95> {

    @Override
    public void preInsert(TQuestOwn95 entity, PreInsertContext<TQuestOwn95> context) {
    }

    @Override
    public void preUpdate(TQuestOwn95 entity, PreUpdateContext<TQuestOwn95> context) {
    }

    @Override
    public void preDelete(TQuestOwn95 entity, PreDeleteContext<TQuestOwn95> context) {
    }

    @Override
    public void postInsert(TQuestOwn95 entity, PostInsertContext<TQuestOwn95> context) {
    }

    @Override
    public void postUpdate(TQuestOwn95 entity, PostUpdateContext<TQuestOwn95> context) {
    }

    @Override
    public void postDelete(TQuestOwn95 entity, PostDeleteContext<TQuestOwn95> context) {
    }
}