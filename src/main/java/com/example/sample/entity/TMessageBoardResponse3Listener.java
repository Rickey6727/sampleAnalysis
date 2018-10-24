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
public class TMessageBoardResponse3Listener implements EntityListener<TMessageBoardResponse3> {

    @Override
    public void preInsert(TMessageBoardResponse3 entity, PreInsertContext<TMessageBoardResponse3> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse3 entity, PreUpdateContext<TMessageBoardResponse3> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse3 entity, PreDeleteContext<TMessageBoardResponse3> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse3 entity, PostInsertContext<TMessageBoardResponse3> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse3 entity, PostUpdateContext<TMessageBoardResponse3> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse3 entity, PostDeleteContext<TMessageBoardResponse3> context) {
    }
}