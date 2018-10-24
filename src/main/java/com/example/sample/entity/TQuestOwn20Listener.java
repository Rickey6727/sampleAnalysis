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
public class TQuestOwn20Listener implements EntityListener<TQuestOwn20> {

    @Override
    public void preInsert(TQuestOwn20 entity, PreInsertContext<TQuestOwn20> context) {
    }

    @Override
    public void preUpdate(TQuestOwn20 entity, PreUpdateContext<TQuestOwn20> context) {
    }

    @Override
    public void preDelete(TQuestOwn20 entity, PreDeleteContext<TQuestOwn20> context) {
    }

    @Override
    public void postInsert(TQuestOwn20 entity, PostInsertContext<TQuestOwn20> context) {
    }

    @Override
    public void postUpdate(TQuestOwn20 entity, PostUpdateContext<TQuestOwn20> context) {
    }

    @Override
    public void postDelete(TQuestOwn20 entity, PostDeleteContext<TQuestOwn20> context) {
    }
}