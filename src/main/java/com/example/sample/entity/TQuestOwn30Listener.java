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
public class TQuestOwn30Listener implements EntityListener<TQuestOwn30> {

    @Override
    public void preInsert(TQuestOwn30 entity, PreInsertContext<TQuestOwn30> context) {
    }

    @Override
    public void preUpdate(TQuestOwn30 entity, PreUpdateContext<TQuestOwn30> context) {
    }

    @Override
    public void preDelete(TQuestOwn30 entity, PreDeleteContext<TQuestOwn30> context) {
    }

    @Override
    public void postInsert(TQuestOwn30 entity, PostInsertContext<TQuestOwn30> context) {
    }

    @Override
    public void postUpdate(TQuestOwn30 entity, PostUpdateContext<TQuestOwn30> context) {
    }

    @Override
    public void postDelete(TQuestOwn30 entity, PostDeleteContext<TQuestOwn30> context) {
    }
}