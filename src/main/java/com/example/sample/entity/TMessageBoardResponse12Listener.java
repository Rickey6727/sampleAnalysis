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
public class TMessageBoardResponse12Listener implements EntityListener<TMessageBoardResponse12> {

    @Override
    public void preInsert(TMessageBoardResponse12 entity, PreInsertContext<TMessageBoardResponse12> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse12 entity, PreUpdateContext<TMessageBoardResponse12> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse12 entity, PreDeleteContext<TMessageBoardResponse12> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse12 entity, PostInsertContext<TMessageBoardResponse12> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse12 entity, PostUpdateContext<TMessageBoardResponse12> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse12 entity, PostDeleteContext<TMessageBoardResponse12> context) {
    }
}