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
public class MEventReturnListener implements EntityListener<MEventReturn> {

    @Override
    public void preInsert(MEventReturn entity, PreInsertContext<MEventReturn> context) {
    }

    @Override
    public void preUpdate(MEventReturn entity, PreUpdateContext<MEventReturn> context) {
    }

    @Override
    public void preDelete(MEventReturn entity, PreDeleteContext<MEventReturn> context) {
    }

    @Override
    public void postInsert(MEventReturn entity, PostInsertContext<MEventReturn> context) {
    }

    @Override
    public void postUpdate(MEventReturn entity, PostUpdateContext<MEventReturn> context) {
    }

    @Override
    public void postDelete(MEventReturn entity, PostDeleteContext<MEventReturn> context) {
    }
}