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
public class TGainUser33Listener implements EntityListener<TGainUser33> {

    @Override
    public void preInsert(TGainUser33 entity, PreInsertContext<TGainUser33> context) {
    }

    @Override
    public void preUpdate(TGainUser33 entity, PreUpdateContext<TGainUser33> context) {
    }

    @Override
    public void preDelete(TGainUser33 entity, PreDeleteContext<TGainUser33> context) {
    }

    @Override
    public void postInsert(TGainUser33 entity, PostInsertContext<TGainUser33> context) {
    }

    @Override
    public void postUpdate(TGainUser33 entity, PostUpdateContext<TGainUser33> context) {
    }

    @Override
    public void postDelete(TGainUser33 entity, PostDeleteContext<TGainUser33> context) {
    }
}