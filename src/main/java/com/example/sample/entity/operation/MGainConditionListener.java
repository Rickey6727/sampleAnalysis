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
public class MGainConditionListener implements EntityListener<MGainCondition> {

    @Override
    public void preInsert(MGainCondition entity, PreInsertContext<MGainCondition> context) {
    }

    @Override
    public void preUpdate(MGainCondition entity, PreUpdateContext<MGainCondition> context) {
    }

    @Override
    public void preDelete(MGainCondition entity, PreDeleteContext<MGainCondition> context) {
    }

    @Override
    public void postInsert(MGainCondition entity, PostInsertContext<MGainCondition> context) {
    }

    @Override
    public void postUpdate(MGainCondition entity, PostUpdateContext<MGainCondition> context) {
    }

    @Override
    public void postDelete(MGainCondition entity, PostDeleteContext<MGainCondition> context) {
    }
}