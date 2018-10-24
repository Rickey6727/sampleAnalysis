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
public class TQuestOwn23Listener implements EntityListener<TQuestOwn23> {

    @Override
    public void preInsert(TQuestOwn23 entity, PreInsertContext<TQuestOwn23> context) {
    }

    @Override
    public void preUpdate(TQuestOwn23 entity, PreUpdateContext<TQuestOwn23> context) {
    }

    @Override
    public void preDelete(TQuestOwn23 entity, PreDeleteContext<TQuestOwn23> context) {
    }

    @Override
    public void postInsert(TQuestOwn23 entity, PostInsertContext<TQuestOwn23> context) {
    }

    @Override
    public void postUpdate(TQuestOwn23 entity, PostUpdateContext<TQuestOwn23> context) {
    }

    @Override
    public void postDelete(TQuestOwn23 entity, PostDeleteContext<TQuestOwn23> context) {
    }
}