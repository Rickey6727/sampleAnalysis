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
public class TMessageBoardResponse25Listener implements EntityListener<TMessageBoardResponse25> {

    @Override
    public void preInsert(TMessageBoardResponse25 entity, PreInsertContext<TMessageBoardResponse25> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse25 entity, PreUpdateContext<TMessageBoardResponse25> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse25 entity, PreDeleteContext<TMessageBoardResponse25> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse25 entity, PostInsertContext<TMessageBoardResponse25> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse25 entity, PostUpdateContext<TMessageBoardResponse25> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse25 entity, PostDeleteContext<TMessageBoardResponse25> context) {
    }
}