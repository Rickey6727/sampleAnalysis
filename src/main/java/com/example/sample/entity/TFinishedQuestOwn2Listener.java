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
public class TFinishedQuestOwn2Listener implements EntityListener<TFinishedQuestOwn2> {

    @Override
    public void preInsert(TFinishedQuestOwn2 entity, PreInsertContext<TFinishedQuestOwn2> context) {
    }

    @Override
    public void preUpdate(TFinishedQuestOwn2 entity, PreUpdateContext<TFinishedQuestOwn2> context) {
    }

    @Override
    public void preDelete(TFinishedQuestOwn2 entity, PreDeleteContext<TFinishedQuestOwn2> context) {
    }

    @Override
    public void postInsert(TFinishedQuestOwn2 entity, PostInsertContext<TFinishedQuestOwn2> context) {
    }

    @Override
    public void postUpdate(TFinishedQuestOwn2 entity, PostUpdateContext<TFinishedQuestOwn2> context) {
    }

    @Override
    public void postDelete(TFinishedQuestOwn2 entity, PostDeleteContext<TFinishedQuestOwn2> context) {
    }
}