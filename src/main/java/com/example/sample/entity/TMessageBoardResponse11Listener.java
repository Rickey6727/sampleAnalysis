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
public class TMessageBoardResponse11Listener implements EntityListener<TMessageBoardResponse11> {

    @Override
    public void preInsert(TMessageBoardResponse11 entity, PreInsertContext<TMessageBoardResponse11> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse11 entity, PreUpdateContext<TMessageBoardResponse11> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse11 entity, PreDeleteContext<TMessageBoardResponse11> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse11 entity, PostInsertContext<TMessageBoardResponse11> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse11 entity, PostUpdateContext<TMessageBoardResponse11> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse11 entity, PostDeleteContext<TMessageBoardResponse11> context) {
    }
}