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
public class TQuestOwn32Listener implements EntityListener<TQuestOwn32> {

    @Override
    public void preInsert(TQuestOwn32 entity, PreInsertContext<TQuestOwn32> context) {
    }

    @Override
    public void preUpdate(TQuestOwn32 entity, PreUpdateContext<TQuestOwn32> context) {
    }

    @Override
    public void preDelete(TQuestOwn32 entity, PreDeleteContext<TQuestOwn32> context) {
    }

    @Override
    public void postInsert(TQuestOwn32 entity, PostInsertContext<TQuestOwn32> context) {
    }

    @Override
    public void postUpdate(TQuestOwn32 entity, PostUpdateContext<TQuestOwn32> context) {
    }

    @Override
    public void postDelete(TQuestOwn32 entity, PostDeleteContext<TQuestOwn32> context) {
    }
}