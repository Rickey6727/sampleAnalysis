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
public class TBonusState5Listener implements EntityListener<TBonusState5> {

    @Override
    public void preInsert(TBonusState5 entity, PreInsertContext<TBonusState5> context) {
    }

    @Override
    public void preUpdate(TBonusState5 entity, PreUpdateContext<TBonusState5> context) {
    }

    @Override
    public void preDelete(TBonusState5 entity, PreDeleteContext<TBonusState5> context) {
    }

    @Override
    public void postInsert(TBonusState5 entity, PostInsertContext<TBonusState5> context) {
    }

    @Override
    public void postUpdate(TBonusState5 entity, PostUpdateContext<TBonusState5> context) {
    }

    @Override
    public void postDelete(TBonusState5 entity, PostDeleteContext<TBonusState5> context) {
    }
}