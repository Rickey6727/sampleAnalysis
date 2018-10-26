package com.example.sample.entity.sales;

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
public class TGachaCountListener implements EntityListener<TGachaCount> {

    @Override
    public void preInsert(TGachaCount entity, PreInsertContext<TGachaCount> context) {
    }

    @Override
    public void preUpdate(TGachaCount entity, PreUpdateContext<TGachaCount> context) {
    }

    @Override
    public void preDelete(TGachaCount entity, PreDeleteContext<TGachaCount> context) {
    }

    @Override
    public void postInsert(TGachaCount entity, PostInsertContext<TGachaCount> context) {
    }

    @Override
    public void postUpdate(TGachaCount entity, PostUpdateContext<TGachaCount> context) {
    }

    @Override
    public void postDelete(TGachaCount entity, PostDeleteContext<TGachaCount> context) {
    }
}