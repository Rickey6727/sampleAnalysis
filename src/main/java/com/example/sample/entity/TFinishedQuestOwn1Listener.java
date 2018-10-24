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
public class TFinishedQuestOwn1Listener implements EntityListener<TFinishedQuestOwn1> {

    @Override
    public void preInsert(TFinishedQuestOwn1 entity, PreInsertContext<TFinishedQuestOwn1> context) {
    }

    @Override
    public void preUpdate(TFinishedQuestOwn1 entity, PreUpdateContext<TFinishedQuestOwn1> context) {
    }

    @Override
    public void preDelete(TFinishedQuestOwn1 entity, PreDeleteContext<TFinishedQuestOwn1> context) {
    }

    @Override
    public void postInsert(TFinishedQuestOwn1 entity, PostInsertContext<TFinishedQuestOwn1> context) {
    }

    @Override
    public void postUpdate(TFinishedQuestOwn1 entity, PostUpdateContext<TFinishedQuestOwn1> context) {
    }

    @Override
    public void postDelete(TFinishedQuestOwn1 entity, PostDeleteContext<TFinishedQuestOwn1> context) {
    }
}