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
public class TBonusState3Listener implements EntityListener<TBonusState3> {

    @Override
    public void preInsert(TBonusState3 entity, PreInsertContext<TBonusState3> context) {
    }

    @Override
    public void preUpdate(TBonusState3 entity, PreUpdateContext<TBonusState3> context) {
    }

    @Override
    public void preDelete(TBonusState3 entity, PreDeleteContext<TBonusState3> context) {
    }

    @Override
    public void postInsert(TBonusState3 entity, PostInsertContext<TBonusState3> context) {
    }

    @Override
    public void postUpdate(TBonusState3 entity, PostUpdateContext<TBonusState3> context) {
    }

    @Override
    public void postDelete(TBonusState3 entity, PostDeleteContext<TBonusState3> context) {
    }
}