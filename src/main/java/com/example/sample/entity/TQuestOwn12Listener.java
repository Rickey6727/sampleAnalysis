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
public class TQuestOwn12Listener implements EntityListener<TQuestOwn12> {

    @Override
    public void preInsert(TQuestOwn12 entity, PreInsertContext<TQuestOwn12> context) {
    }

    @Override
    public void preUpdate(TQuestOwn12 entity, PreUpdateContext<TQuestOwn12> context) {
    }

    @Override
    public void preDelete(TQuestOwn12 entity, PreDeleteContext<TQuestOwn12> context) {
    }

    @Override
    public void postInsert(TQuestOwn12 entity, PostInsertContext<TQuestOwn12> context) {
    }

    @Override
    public void postUpdate(TQuestOwn12 entity, PostUpdateContext<TQuestOwn12> context) {
    }

    @Override
    public void postDelete(TQuestOwn12 entity, PostDeleteContext<TQuestOwn12> context) {
    }
}