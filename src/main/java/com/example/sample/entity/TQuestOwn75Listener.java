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
public class TQuestOwn75Listener implements EntityListener<TQuestOwn75> {

    @Override
    public void preInsert(TQuestOwn75 entity, PreInsertContext<TQuestOwn75> context) {
    }

    @Override
    public void preUpdate(TQuestOwn75 entity, PreUpdateContext<TQuestOwn75> context) {
    }

    @Override
    public void preDelete(TQuestOwn75 entity, PreDeleteContext<TQuestOwn75> context) {
    }

    @Override
    public void postInsert(TQuestOwn75 entity, PostInsertContext<TQuestOwn75> context) {
    }

    @Override
    public void postUpdate(TQuestOwn75 entity, PostUpdateContext<TQuestOwn75> context) {
    }

    @Override
    public void postDelete(TQuestOwn75 entity, PostDeleteContext<TQuestOwn75> context) {
    }
}