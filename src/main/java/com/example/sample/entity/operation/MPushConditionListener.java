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
public class MPushConditionListener implements EntityListener<MPushCondition> {

    @Override
    public void preInsert(MPushCondition entity, PreInsertContext<MPushCondition> context) {
    }

    @Override
    public void preUpdate(MPushCondition entity, PreUpdateContext<MPushCondition> context) {
    }

    @Override
    public void preDelete(MPushCondition entity, PreDeleteContext<MPushCondition> context) {
    }

    @Override
    public void postInsert(MPushCondition entity, PostInsertContext<MPushCondition> context) {
    }

    @Override
    public void postUpdate(MPushCondition entity, PostUpdateContext<MPushCondition> context) {
    }

    @Override
    public void postDelete(MPushCondition entity, PostDeleteContext<MPushCondition> context) {
    }
}