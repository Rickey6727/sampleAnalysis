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
public class TMessageBoardResponse5Listener implements EntityListener<TMessageBoardResponse5> {

    @Override
    public void preInsert(TMessageBoardResponse5 entity, PreInsertContext<TMessageBoardResponse5> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse5 entity, PreUpdateContext<TMessageBoardResponse5> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse5 entity, PreDeleteContext<TMessageBoardResponse5> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse5 entity, PostInsertContext<TMessageBoardResponse5> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse5 entity, PostUpdateContext<TMessageBoardResponse5> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse5 entity, PostDeleteContext<TMessageBoardResponse5> context) {
    }
}