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
public class TQuestOwn11Listener implements EntityListener<TQuestOwn11> {

    @Override
    public void preInsert(TQuestOwn11 entity, PreInsertContext<TQuestOwn11> context) {
    }

    @Override
    public void preUpdate(TQuestOwn11 entity, PreUpdateContext<TQuestOwn11> context) {
    }

    @Override
    public void preDelete(TQuestOwn11 entity, PreDeleteContext<TQuestOwn11> context) {
    }

    @Override
    public void postInsert(TQuestOwn11 entity, PostInsertContext<TQuestOwn11> context) {
    }

    @Override
    public void postUpdate(TQuestOwn11 entity, PostUpdateContext<TQuestOwn11> context) {
    }

    @Override
    public void postDelete(TQuestOwn11 entity, PostDeleteContext<TQuestOwn11> context) {
    }
}