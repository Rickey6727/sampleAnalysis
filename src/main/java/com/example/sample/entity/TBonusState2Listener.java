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
public class TBonusState2Listener implements EntityListener<TBonusState2> {

    @Override
    public void preInsert(TBonusState2 entity, PreInsertContext<TBonusState2> context) {
    }

    @Override
    public void preUpdate(TBonusState2 entity, PreUpdateContext<TBonusState2> context) {
    }

    @Override
    public void preDelete(TBonusState2 entity, PreDeleteContext<TBonusState2> context) {
    }

    @Override
    public void postInsert(TBonusState2 entity, PostInsertContext<TBonusState2> context) {
    }

    @Override
    public void postUpdate(TBonusState2 entity, PostUpdateContext<TBonusState2> context) {
    }

    @Override
    public void postDelete(TBonusState2 entity, PostDeleteContext<TBonusState2> context) {
    }
}