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
public class TMessageBoardResponse50Listener implements EntityListener<TMessageBoardResponse50> {

    @Override
    public void preInsert(TMessageBoardResponse50 entity, PreInsertContext<TMessageBoardResponse50> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse50 entity, PreUpdateContext<TMessageBoardResponse50> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse50 entity, PreDeleteContext<TMessageBoardResponse50> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse50 entity, PostInsertContext<TMessageBoardResponse50> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse50 entity, PostUpdateContext<TMessageBoardResponse50> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse50 entity, PostDeleteContext<TMessageBoardResponse50> context) {
    }
}