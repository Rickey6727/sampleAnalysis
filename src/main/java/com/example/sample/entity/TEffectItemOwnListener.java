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
public class TEffectItemOwnListener implements EntityListener<TEffectItemOwn> {

    @Override
    public void preInsert(TEffectItemOwn entity, PreInsertContext<TEffectItemOwn> context) {
    }

    @Override
    public void preUpdate(TEffectItemOwn entity, PreUpdateContext<TEffectItemOwn> context) {
    }

    @Override
    public void preDelete(TEffectItemOwn entity, PreDeleteContext<TEffectItemOwn> context) {
    }

    @Override
    public void postInsert(TEffectItemOwn entity, PostInsertContext<TEffectItemOwn> context) {
    }

    @Override
    public void postUpdate(TEffectItemOwn entity, PostUpdateContext<TEffectItemOwn> context) {
    }

    @Override
    public void postDelete(TEffectItemOwn entity, PostDeleteContext<TEffectItemOwn> context) {
    }
}