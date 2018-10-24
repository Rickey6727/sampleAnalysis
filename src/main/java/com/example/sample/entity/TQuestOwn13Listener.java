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
public class TQuestOwn13Listener implements EntityListener<TQuestOwn13> {

    @Override
    public void preInsert(TQuestOwn13 entity, PreInsertContext<TQuestOwn13> context) {
    }

    @Override
    public void preUpdate(TQuestOwn13 entity, PreUpdateContext<TQuestOwn13> context) {
    }

    @Override
    public void preDelete(TQuestOwn13 entity, PreDeleteContext<TQuestOwn13> context) {
    }

    @Override
    public void postInsert(TQuestOwn13 entity, PostInsertContext<TQuestOwn13> context) {
    }

    @Override
    public void postUpdate(TQuestOwn13 entity, PostUpdateContext<TQuestOwn13> context) {
    }

    @Override
    public void postDelete(TQuestOwn13 entity, PostDeleteContext<TQuestOwn13> context) {
    }
}