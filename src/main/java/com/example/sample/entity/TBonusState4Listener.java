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
public class TBonusState4Listener implements EntityListener<TBonusState4> {

    @Override
    public void preInsert(TBonusState4 entity, PreInsertContext<TBonusState4> context) {
    }

    @Override
    public void preUpdate(TBonusState4 entity, PreUpdateContext<TBonusState4> context) {
    }

    @Override
    public void preDelete(TBonusState4 entity, PreDeleteContext<TBonusState4> context) {
    }

    @Override
    public void postInsert(TBonusState4 entity, PostInsertContext<TBonusState4> context) {
    }

    @Override
    public void postUpdate(TBonusState4 entity, PostUpdateContext<TBonusState4> context) {
    }

    @Override
    public void postDelete(TBonusState4 entity, PostDeleteContext<TBonusState4> context) {
    }
}