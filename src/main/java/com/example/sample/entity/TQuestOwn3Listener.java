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
public class TQuestOwn3Listener implements EntityListener<TQuestOwn3> {

    @Override
    public void preInsert(TQuestOwn3 entity, PreInsertContext<TQuestOwn3> context) {
    }

    @Override
    public void preUpdate(TQuestOwn3 entity, PreUpdateContext<TQuestOwn3> context) {
    }

    @Override
    public void preDelete(TQuestOwn3 entity, PreDeleteContext<TQuestOwn3> context) {
    }

    @Override
    public void postInsert(TQuestOwn3 entity, PostInsertContext<TQuestOwn3> context) {
    }

    @Override
    public void postUpdate(TQuestOwn3 entity, PostUpdateContext<TQuestOwn3> context) {
    }

    @Override
    public void postDelete(TQuestOwn3 entity, PostDeleteContext<TQuestOwn3> context) {
    }
}