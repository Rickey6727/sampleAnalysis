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
public class MRushGachaListener implements EntityListener<MRushGacha> {

    @Override
    public void preInsert(MRushGacha entity, PreInsertContext<MRushGacha> context) {
    }

    @Override
    public void preUpdate(MRushGacha entity, PreUpdateContext<MRushGacha> context) {
    }

    @Override
    public void preDelete(MRushGacha entity, PreDeleteContext<MRushGacha> context) {
    }

    @Override
    public void postInsert(MRushGacha entity, PostInsertContext<MRushGacha> context) {
    }

    @Override
    public void postUpdate(MRushGacha entity, PostUpdateContext<MRushGacha> context) {
    }

    @Override
    public void postDelete(MRushGacha entity, PostDeleteContext<MRushGacha> context) {
    }
}