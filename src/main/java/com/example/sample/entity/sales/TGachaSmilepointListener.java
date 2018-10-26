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
public class TGachaSmilepointListener implements EntityListener<TGachaSmilepoint> {

    @Override
    public void preInsert(TGachaSmilepoint entity, PreInsertContext<TGachaSmilepoint> context) {
    }

    @Override
    public void preUpdate(TGachaSmilepoint entity, PreUpdateContext<TGachaSmilepoint> context) {
    }

    @Override
    public void preDelete(TGachaSmilepoint entity, PreDeleteContext<TGachaSmilepoint> context) {
    }

    @Override
    public void postInsert(TGachaSmilepoint entity, PostInsertContext<TGachaSmilepoint> context) {
    }

    @Override
    public void postUpdate(TGachaSmilepoint entity, PostUpdateContext<TGachaSmilepoint> context) {
    }

    @Override
    public void postDelete(TGachaSmilepoint entity, PostDeleteContext<TGachaSmilepoint> context) {
    }
}