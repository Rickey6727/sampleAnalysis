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
public class TMessageBoardResponse1Listener implements EntityListener<TMessageBoardResponse1> {

    @Override
    public void preInsert(TMessageBoardResponse1 entity, PreInsertContext<TMessageBoardResponse1> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse1 entity, PreUpdateContext<TMessageBoardResponse1> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse1 entity, PreDeleteContext<TMessageBoardResponse1> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse1 entity, PostInsertContext<TMessageBoardResponse1> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse1 entity, PostUpdateContext<TMessageBoardResponse1> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse1 entity, PostDeleteContext<TMessageBoardResponse1> context) {
    }
}