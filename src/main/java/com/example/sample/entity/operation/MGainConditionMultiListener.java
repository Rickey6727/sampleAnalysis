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
public class MGainConditionMultiListener implements EntityListener<MGainConditionMulti> {

    @Override
    public void preInsert(MGainConditionMulti entity, PreInsertContext<MGainConditionMulti> context) {
    }

    @Override
    public void preUpdate(MGainConditionMulti entity, PreUpdateContext<MGainConditionMulti> context) {
    }

    @Override
    public void preDelete(MGainConditionMulti entity, PreDeleteContext<MGainConditionMulti> context) {
    }

    @Override
    public void postInsert(MGainConditionMulti entity, PostInsertContext<MGainConditionMulti> context) {
    }

    @Override
    public void postUpdate(MGainConditionMulti entity, PostUpdateContext<MGainConditionMulti> context) {
    }

    @Override
    public void postDelete(MGainConditionMulti entity, PostDeleteContext<MGainConditionMulti> context) {
    }
}