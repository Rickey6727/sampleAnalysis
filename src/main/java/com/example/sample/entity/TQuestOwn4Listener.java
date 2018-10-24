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
public class TQuestOwn4Listener implements EntityListener<TQuestOwn4> {

    @Override
    public void preInsert(TQuestOwn4 entity, PreInsertContext<TQuestOwn4> context) {
    }

    @Override
    public void preUpdate(TQuestOwn4 entity, PreUpdateContext<TQuestOwn4> context) {
    }

    @Override
    public void preDelete(TQuestOwn4 entity, PreDeleteContext<TQuestOwn4> context) {
    }

    @Override
    public void postInsert(TQuestOwn4 entity, PostInsertContext<TQuestOwn4> context) {
    }

    @Override
    public void postUpdate(TQuestOwn4 entity, PostUpdateContext<TQuestOwn4> context) {
    }

    @Override
    public void postDelete(TQuestOwn4 entity, PostDeleteContext<TQuestOwn4> context) {
    }
}