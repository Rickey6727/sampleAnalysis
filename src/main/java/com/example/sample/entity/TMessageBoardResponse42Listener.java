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
public class TMessageBoardResponse42Listener implements EntityListener<TMessageBoardResponse42> {

    @Override
    public void preInsert(TMessageBoardResponse42 entity, PreInsertContext<TMessageBoardResponse42> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse42 entity, PreUpdateContext<TMessageBoardResponse42> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse42 entity, PreDeleteContext<TMessageBoardResponse42> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse42 entity, PostInsertContext<TMessageBoardResponse42> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse42 entity, PostUpdateContext<TMessageBoardResponse42> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse42 entity, PostDeleteContext<TMessageBoardResponse42> context) {
    }
}