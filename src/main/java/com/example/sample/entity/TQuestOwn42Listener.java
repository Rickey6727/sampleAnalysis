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
public class TQuestOwn42Listener implements EntityListener<TQuestOwn42> {

    @Override
    public void preInsert(TQuestOwn42 entity, PreInsertContext<TQuestOwn42> context) {
    }

    @Override
    public void preUpdate(TQuestOwn42 entity, PreUpdateContext<TQuestOwn42> context) {
    }

    @Override
    public void preDelete(TQuestOwn42 entity, PreDeleteContext<TQuestOwn42> context) {
    }

    @Override
    public void postInsert(TQuestOwn42 entity, PostInsertContext<TQuestOwn42> context) {
    }

    @Override
    public void postUpdate(TQuestOwn42 entity, PostUpdateContext<TQuestOwn42> context) {
    }

    @Override
    public void postDelete(TQuestOwn42 entity, PostDeleteContext<TQuestOwn42> context) {
    }
}