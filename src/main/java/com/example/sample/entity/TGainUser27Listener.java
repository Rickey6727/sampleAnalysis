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
public class TGainUser27Listener implements EntityListener<TGainUser27> {

    @Override
    public void preInsert(TGainUser27 entity, PreInsertContext<TGainUser27> context) {
    }

    @Override
    public void preUpdate(TGainUser27 entity, PreUpdateContext<TGainUser27> context) {
    }

    @Override
    public void preDelete(TGainUser27 entity, PreDeleteContext<TGainUser27> context) {
    }

    @Override
    public void postInsert(TGainUser27 entity, PostInsertContext<TGainUser27> context) {
    }

    @Override
    public void postUpdate(TGainUser27 entity, PostUpdateContext<TGainUser27> context) {
    }

    @Override
    public void postDelete(TGainUser27 entity, PostDeleteContext<TGainUser27> context) {
    }
}