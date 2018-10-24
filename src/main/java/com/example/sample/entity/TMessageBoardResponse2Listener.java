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
public class TMessageBoardResponse2Listener implements EntityListener<TMessageBoardResponse2> {

    @Override
    public void preInsert(TMessageBoardResponse2 entity, PreInsertContext<TMessageBoardResponse2> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse2 entity, PreUpdateContext<TMessageBoardResponse2> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse2 entity, PreDeleteContext<TMessageBoardResponse2> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse2 entity, PostInsertContext<TMessageBoardResponse2> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse2 entity, PostUpdateContext<TMessageBoardResponse2> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse2 entity, PostDeleteContext<TMessageBoardResponse2> context) {
    }
}