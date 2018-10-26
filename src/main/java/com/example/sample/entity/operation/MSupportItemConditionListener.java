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
public class MSupportItemConditionListener implements EntityListener<MSupportItemCondition> {

    @Override
    public void preInsert(MSupportItemCondition entity, PreInsertContext<MSupportItemCondition> context) {
    }

    @Override
    public void preUpdate(MSupportItemCondition entity, PreUpdateContext<MSupportItemCondition> context) {
    }

    @Override
    public void preDelete(MSupportItemCondition entity, PreDeleteContext<MSupportItemCondition> context) {
    }

    @Override
    public void postInsert(MSupportItemCondition entity, PostInsertContext<MSupportItemCondition> context) {
    }

    @Override
    public void postUpdate(MSupportItemCondition entity, PostUpdateContext<MSupportItemCondition> context) {
    }

    @Override
    public void postDelete(MSupportItemCondition entity, PostDeleteContext<MSupportItemCondition> context) {
    }
}