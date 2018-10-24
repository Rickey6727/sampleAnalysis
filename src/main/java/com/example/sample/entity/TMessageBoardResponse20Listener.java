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
public class TMessageBoardResponse20Listener implements EntityListener<TMessageBoardResponse20> {

    @Override
    public void preInsert(TMessageBoardResponse20 entity, PreInsertContext<TMessageBoardResponse20> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse20 entity, PreUpdateContext<TMessageBoardResponse20> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse20 entity, PreDeleteContext<TMessageBoardResponse20> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse20 entity, PostInsertContext<TMessageBoardResponse20> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse20 entity, PostUpdateContext<TMessageBoardResponse20> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse20 entity, PostDeleteContext<TMessageBoardResponse20> context) {
    }
}