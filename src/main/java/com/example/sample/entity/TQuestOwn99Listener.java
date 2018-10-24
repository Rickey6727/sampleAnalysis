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
public class TQuestOwn99Listener implements EntityListener<TQuestOwn99> {

    @Override
    public void preInsert(TQuestOwn99 entity, PreInsertContext<TQuestOwn99> context) {
    }

    @Override
    public void preUpdate(TQuestOwn99 entity, PreUpdateContext<TQuestOwn99> context) {
    }

    @Override
    public void preDelete(TQuestOwn99 entity, PreDeleteContext<TQuestOwn99> context) {
    }

    @Override
    public void postInsert(TQuestOwn99 entity, PostInsertContext<TQuestOwn99> context) {
    }

    @Override
    public void postUpdate(TQuestOwn99 entity, PostUpdateContext<TQuestOwn99> context) {
    }

    @Override
    public void postDelete(TQuestOwn99 entity, PostDeleteContext<TQuestOwn99> context) {
    }
}