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
public class TMessageBoardResponse99Listener implements EntityListener<TMessageBoardResponse99> {

    @Override
    public void preInsert(TMessageBoardResponse99 entity, PreInsertContext<TMessageBoardResponse99> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse99 entity, PreUpdateContext<TMessageBoardResponse99> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse99 entity, PreDeleteContext<TMessageBoardResponse99> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse99 entity, PostInsertContext<TMessageBoardResponse99> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse99 entity, PostUpdateContext<TMessageBoardResponse99> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse99 entity, PostDeleteContext<TMessageBoardResponse99> context) {
    }
}