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
public class TMessageBoardResponse4Listener implements EntityListener<TMessageBoardResponse4> {

    @Override
    public void preInsert(TMessageBoardResponse4 entity, PreInsertContext<TMessageBoardResponse4> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse4 entity, PreUpdateContext<TMessageBoardResponse4> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse4 entity, PreDeleteContext<TMessageBoardResponse4> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse4 entity, PostInsertContext<TMessageBoardResponse4> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse4 entity, PostUpdateContext<TMessageBoardResponse4> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse4 entity, PostDeleteContext<TMessageBoardResponse4> context) {
    }
}