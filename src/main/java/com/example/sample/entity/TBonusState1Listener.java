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
public class TBonusState1Listener implements EntityListener<TBonusState1> {

    @Override
    public void preInsert(TBonusState1 entity, PreInsertContext<TBonusState1> context) {
    }

    @Override
    public void preUpdate(TBonusState1 entity, PreUpdateContext<TBonusState1> context) {
    }

    @Override
    public void preDelete(TBonusState1 entity, PreDeleteContext<TBonusState1> context) {
    }

    @Override
    public void postInsert(TBonusState1 entity, PostInsertContext<TBonusState1> context) {
    }

    @Override
    public void postUpdate(TBonusState1 entity, PostUpdateContext<TBonusState1> context) {
    }

    @Override
    public void postDelete(TBonusState1 entity, PostDeleteContext<TBonusState1> context) {
    }
}