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
public class TQuestOwn2Listener implements EntityListener<TQuestOwn2> {

    @Override
    public void preInsert(TQuestOwn2 entity, PreInsertContext<TQuestOwn2> context) {
    }

    @Override
    public void preUpdate(TQuestOwn2 entity, PreUpdateContext<TQuestOwn2> context) {
    }

    @Override
    public void preDelete(TQuestOwn2 entity, PreDeleteContext<TQuestOwn2> context) {
    }

    @Override
    public void postInsert(TQuestOwn2 entity, PostInsertContext<TQuestOwn2> context) {
    }

    @Override
    public void postUpdate(TQuestOwn2 entity, PostUpdateContext<TQuestOwn2> context) {
    }

    @Override
    public void postDelete(TQuestOwn2 entity, PostDeleteContext<TQuestOwn2> context) {
    }
}