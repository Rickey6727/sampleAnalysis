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
public class TMessageBoardResponse10Listener implements EntityListener<TMessageBoardResponse10> {

    @Override
    public void preInsert(TMessageBoardResponse10 entity, PreInsertContext<TMessageBoardResponse10> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse10 entity, PreUpdateContext<TMessageBoardResponse10> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse10 entity, PreDeleteContext<TMessageBoardResponse10> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse10 entity, PostInsertContext<TMessageBoardResponse10> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse10 entity, PostUpdateContext<TMessageBoardResponse10> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse10 entity, PostDeleteContext<TMessageBoardResponse10> context) {
    }
}