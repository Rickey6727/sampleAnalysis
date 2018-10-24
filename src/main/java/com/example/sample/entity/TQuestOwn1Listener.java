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
public class TQuestOwn1Listener implements EntityListener<TQuestOwn1> {

    @Override
    public void preInsert(TQuestOwn1 entity, PreInsertContext<TQuestOwn1> context) {
    }

    @Override
    public void preUpdate(TQuestOwn1 entity, PreUpdateContext<TQuestOwn1> context) {
    }

    @Override
    public void preDelete(TQuestOwn1 entity, PreDeleteContext<TQuestOwn1> context) {
    }

    @Override
    public void postInsert(TQuestOwn1 entity, PostInsertContext<TQuestOwn1> context) {
    }

    @Override
    public void postUpdate(TQuestOwn1 entity, PostUpdateContext<TQuestOwn1> context) {
    }

    @Override
    public void postDelete(TQuestOwn1 entity, PostDeleteContext<TQuestOwn1> context) {
    }
}