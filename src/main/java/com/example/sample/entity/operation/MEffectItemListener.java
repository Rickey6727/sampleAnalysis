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
public class MEffectItemListener implements EntityListener<MEffectItem> {

    @Override
    public void preInsert(MEffectItem entity, PreInsertContext<MEffectItem> context) {
    }

    @Override
    public void preUpdate(MEffectItem entity, PreUpdateContext<MEffectItem> context) {
    }

    @Override
    public void preDelete(MEffectItem entity, PreDeleteContext<MEffectItem> context) {
    }

    @Override
    public void postInsert(MEffectItem entity, PostInsertContext<MEffectItem> context) {
    }

    @Override
    public void postUpdate(MEffectItem entity, PostUpdateContext<MEffectItem> context) {
    }

    @Override
    public void postDelete(MEffectItem entity, PostDeleteContext<MEffectItem> context) {
    }
}