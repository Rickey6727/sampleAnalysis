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
public class TGainGachaCountListener implements EntityListener<TGainGachaCount> {

    @Override
    public void preInsert(TGainGachaCount entity, PreInsertContext<TGainGachaCount> context) {
    }

    @Override
    public void preUpdate(TGainGachaCount entity, PreUpdateContext<TGainGachaCount> context) {
    }

    @Override
    public void preDelete(TGainGachaCount entity, PreDeleteContext<TGainGachaCount> context) {
    }

    @Override
    public void postInsert(TGainGachaCount entity, PostInsertContext<TGainGachaCount> context) {
    }

    @Override
    public void postUpdate(TGainGachaCount entity, PostUpdateContext<TGainGachaCount> context) {
    }

    @Override
    public void postDelete(TGainGachaCount entity, PostDeleteContext<TGainGachaCount> context) {
    }
}