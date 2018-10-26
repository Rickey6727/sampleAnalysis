package com.example.sample.entity.operation;

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
public class TTimeLimitGachaAccountListener implements EntityListener<TTimeLimitGachaAccount> {

    @Override
    public void preInsert(TTimeLimitGachaAccount entity, PreInsertContext<TTimeLimitGachaAccount> context) {
    }

    @Override
    public void preUpdate(TTimeLimitGachaAccount entity, PreUpdateContext<TTimeLimitGachaAccount> context) {
    }

    @Override
    public void preDelete(TTimeLimitGachaAccount entity, PreDeleteContext<TTimeLimitGachaAccount> context) {
    }

    @Override
    public void postInsert(TTimeLimitGachaAccount entity, PostInsertContext<TTimeLimitGachaAccount> context) {
    }

    @Override
    public void postUpdate(TTimeLimitGachaAccount entity, PostUpdateContext<TTimeLimitGachaAccount> context) {
    }

    @Override
    public void postDelete(TTimeLimitGachaAccount entity, PostDeleteContext<TTimeLimitGachaAccount> context) {
    }
}