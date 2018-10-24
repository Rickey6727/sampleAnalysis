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
public class TFinishedQuestOwn3Listener implements EntityListener<TFinishedQuestOwn3> {

    @Override
    public void preInsert(TFinishedQuestOwn3 entity, PreInsertContext<TFinishedQuestOwn3> context) {
    }

    @Override
    public void preUpdate(TFinishedQuestOwn3 entity, PreUpdateContext<TFinishedQuestOwn3> context) {
    }

    @Override
    public void preDelete(TFinishedQuestOwn3 entity, PreDeleteContext<TFinishedQuestOwn3> context) {
    }

    @Override
    public void postInsert(TFinishedQuestOwn3 entity, PostInsertContext<TFinishedQuestOwn3> context) {
    }

    @Override
    public void postUpdate(TFinishedQuestOwn3 entity, PostUpdateContext<TFinishedQuestOwn3> context) {
    }

    @Override
    public void postDelete(TFinishedQuestOwn3 entity, PostDeleteContext<TFinishedQuestOwn3> context) {
    }
}