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
public class TMessageBoardResponse80Listener implements EntityListener<TMessageBoardResponse80> {

    @Override
    public void preInsert(TMessageBoardResponse80 entity, PreInsertContext<TMessageBoardResponse80> context) {
    }

    @Override
    public void preUpdate(TMessageBoardResponse80 entity, PreUpdateContext<TMessageBoardResponse80> context) {
    }

    @Override
    public void preDelete(TMessageBoardResponse80 entity, PreDeleteContext<TMessageBoardResponse80> context) {
    }

    @Override
    public void postInsert(TMessageBoardResponse80 entity, PostInsertContext<TMessageBoardResponse80> context) {
    }

    @Override
    public void postUpdate(TMessageBoardResponse80 entity, PostUpdateContext<TMessageBoardResponse80> context) {
    }

    @Override
    public void postDelete(TMessageBoardResponse80 entity, PostDeleteContext<TMessageBoardResponse80> context) {
    }
}