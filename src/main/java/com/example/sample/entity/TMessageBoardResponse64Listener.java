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
public class TMessageBoardResponse64Listener implements EntityListener<TMessageBoardResponse64> {

    @Override
    public void preInsert(TMessageBoardResponse64 entity, PreInsertContext<TMessageBoardResponse64> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse64 entity, PreUpdateContext<TMessageBoardResponse64> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse64 entity, PreDeleteContext<TMessageBoardResponse64> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse64 entity, PostInsertContext<TMessageBoardResponse64> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse64 entity, PostUpdateContext<TMessageBoardResponse64> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse64 entity, PostDeleteContext<TMessageBoardResponse64> context) {
    }
}