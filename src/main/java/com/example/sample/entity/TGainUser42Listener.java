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
public class TGainUser42Listener implements EntityListener<TGainUser42> {

    @Override
    public void preInsert(TGainUser42 entity, PreInsertContext<TGainUser42> context) {
    }

    @Override
    public void preUpdate(TGainUser42 entity, PreUpdateContext<TGainUser42> context) {
    }

    @Override
    public void preDelete(TGainUser42 entity, PreDeleteContext<TGainUser42> context) {
    }

    @Override
    public void postInsert(TGainUser42 entity, PostInsertContext<TGainUser42> context) {
    }

    @Override
    public void postUpdate(TGainUser42 entity, PostUpdateContext<TGainUser42> context) {
    }

    @Override
    public void postDelete(TGainUser42 entity, PostDeleteContext<TGainUser42> context) {
    }
}