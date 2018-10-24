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
public class TMessageBoardResponse32Listener implements EntityListener<TMessageBoardResponse32> {

    @Override
    public void preInsert(TMessageBoardResponse32 entity, PreInsertContext<TMessageBoardResponse32> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse32 entity, PreUpdateContext<TMessageBoardResponse32> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse32 entity, PreDeleteContext<TMessageBoardResponse32> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse32 entity, PostInsertContext<TMessageBoardResponse32> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse32 entity, PostUpdateContext<TMessageBoardResponse32> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse32 entity, PostDeleteContext<TMessageBoardResponse32> context) {
    }
}