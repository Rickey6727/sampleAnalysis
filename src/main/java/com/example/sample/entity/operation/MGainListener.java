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
public class MGainListener implements EntityListener<MGain> {

    @Override
    public void preInsert(MGain entity, PreInsertContext<MGain> context) {
    }

    @Override
    public void preUpdate(MGain entity, PreUpdateContext<MGain> context) {
    }

    @Override
    public void preDelete(MGain entity, PreDeleteContext<MGain> context) {
    }

    @Override
    public void postInsert(MGain entity, PostInsertContext<MGain> context) {
    }

    @Override
    public void postUpdate(MGain entity, PostUpdateContext<MGain> context) {
    }

    @Override
    public void postDelete(MGain entity, PostDeleteContext<MGain> context) {
    }
}