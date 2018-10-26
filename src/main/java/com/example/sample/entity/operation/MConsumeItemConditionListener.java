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
public class MConsumeItemConditionListener implements EntityListener<MConsumeItemCondition> {

    @Override
    public void preInsert(MConsumeItemCondition entity, PreInsertContext<MConsumeItemCondition> context) {
    }

    @Override
    public void preUpdate(MConsumeItemCondition entity, PreUpdateContext<MConsumeItemCondition> context) {
    }

    @Override
    public void preDelete(MConsumeItemCondition entity, PreDeleteContext<MConsumeItemCondition> context) {
    }

    @Override
    public void postInsert(MConsumeItemCondition entity, PostInsertContext<MConsumeItemCondition> context) {
    }

    @Override
    public void postUpdate(MConsumeItemCondition entity, PostUpdateContext<MConsumeItemCondition> context) {
    }

    @Override
    public void postDelete(MConsumeItemCondition entity, PostDeleteContext<MConsumeItemCondition> context) {
    }
}