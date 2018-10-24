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
public class TBonusState10Listener implements EntityListener<TBonusState10> {

    @Override
    public void preInsert(TBonusState10 entity, PreInsertContext<TBonusState10> context) {
    }

    @Override
    public void preUpdate(TBonusState10 entity, PreUpdateContext<TBonusState10> context) {
    }

    @Override
    public void preDelete(TBonusState10 entity, PreDeleteContext<TBonusState10> context) {
    }

    @Override
    public void postInsert(TBonusState10 entity, PostInsertContext<TBonusState10> context) {
    }

    @Override
    public void postUpdate(TBonusState10 entity, PostUpdateContext<TBonusState10> context) {
    }

    @Override
    public void postDelete(TBonusState10 entity, PostDeleteContext<TBonusState10> context) {
    }
}