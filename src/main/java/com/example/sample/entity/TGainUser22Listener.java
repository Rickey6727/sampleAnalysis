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
public class TGainUser22Listener implements EntityListener<TGainUser22> {

    @Override
    public void preInsert(TGainUser22 entity, PreInsertContext<TGainUser22> context) {
    }

    @Override
    public void preUpdate(TGainUser22 entity, PreUpdateContext<TGainUser22> context) {
    }

    @Override
    public void preDelete(TGainUser22 entity, PreDeleteContext<TGainUser22> context) {
    }

    @Override
    public void postInsert(TGainUser22 entity, PostInsertContext<TGainUser22> context) {
    }

    @Override
    public void postUpdate(TGainUser22 entity, PostUpdateContext<TGainUser22> context) {
    }

    @Override
    public void postDelete(TGainUser22 entity, PostDeleteContext<TGainUser22> context) {
    }
}