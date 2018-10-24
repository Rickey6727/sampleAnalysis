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
public class TQuestOwn25Listener implements EntityListener<TQuestOwn25> {

    @Override
    public void preInsert(TQuestOwn25 entity, PreInsertContext<TQuestOwn25> context) {
    }

    @Override
    public void preUpdate(TQuestOwn25 entity, PreUpdateContext<TQuestOwn25> context) {
    }

    @Override
    public void preDelete(TQuestOwn25 entity, PreDeleteContext<TQuestOwn25> context) {
    }

    @Override
    public void postInsert(TQuestOwn25 entity, PostInsertContext<TQuestOwn25> context) {
    }

    @Override
    public void postUpdate(TQuestOwn25 entity, PostUpdateContext<TQuestOwn25> context) {
    }

    @Override
    public void postDelete(TQuestOwn25 entity, PostDeleteContext<TQuestOwn25> context) {
    }
}