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
public class TMessageBoardResponse21Listener implements EntityListener<TMessageBoardResponse21> {

    @Override
    public void preInsert(TMessageBoardResponse21 entity, PreInsertContext<TMessageBoardResponse21> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse21 entity, PreUpdateContext<TMessageBoardResponse21> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse21 entity, PreDeleteContext<TMessageBoardResponse21> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse21 entity, PostInsertContext<TMessageBoardResponse21> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse21 entity, PostUpdateContext<TMessageBoardResponse21> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse21 entity, PostDeleteContext<TMessageBoardResponse21> context) {
    }
}