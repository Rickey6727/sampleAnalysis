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
public class MGachaSmilepointListener implements EntityListener<MGachaSmilepoint> {

    @Override
    public void preInsert(MGachaSmilepoint entity, PreInsertContext<MGachaSmilepoint> context) {
    }

    @Override
    public void preUpdate(MGachaSmilepoint entity, PreUpdateContext<MGachaSmilepoint> context) {
    }

    @Override
    public void preDelete(MGachaSmilepoint entity, PreDeleteContext<MGachaSmilepoint> context) {
    }

    @Override
    public void postInsert(MGachaSmilepoint entity, PostInsertContext<MGachaSmilepoint> context) {
    }

    @Override
    public void postUpdate(MGachaSmilepoint entity, PostUpdateContext<MGachaSmilepoint> context) {
    }

    @Override
    public void postDelete(MGachaSmilepoint entity, PostDeleteContext<MGachaSmilepoint> context) {
    }
}