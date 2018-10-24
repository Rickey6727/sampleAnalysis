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
public class TQuestOwn16Listener implements EntityListener<TQuestOwn16> {

    @Override
    public void preInsert(TQuestOwn16 entity, PreInsertContext<TQuestOwn16> context) {
    }

    @Override
    public void preUpdate(TQuestOwn16 entity, PreUpdateContext<TQuestOwn16> context) {
    }

    @Override
    public void preDelete(TQuestOwn16 entity, PreDeleteContext<TQuestOwn16> context) {
    }

    @Override
    public void postInsert(TQuestOwn16 entity, PostInsertContext<TQuestOwn16> context) {
    }

    @Override
    public void postUpdate(TQuestOwn16 entity, PostUpdateContext<TQuestOwn16> context) {
    }

    @Override
    public void postDelete(TQuestOwn16 entity, PostDeleteContext<TQuestOwn16> context) {
    }
}