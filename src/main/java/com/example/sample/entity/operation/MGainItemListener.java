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
public class MGainItemListener implements EntityListener<MGainItem> {

    @Override
    public void preInsert(MGainItem entity, PreInsertContext<MGainItem> context) {
    }

    @Override
    public void preUpdate(MGainItem entity, PreUpdateContext<MGainItem> context) {
    }

    @Override
    public void preDelete(MGainItem entity, PreDeleteContext<MGainItem> context) {
    }

    @Override
    public void postInsert(MGainItem entity, PostInsertContext<MGainItem> context) {
    }

    @Override
    public void postUpdate(MGainItem entity, PostUpdateContext<MGainItem> context) {
    }

    @Override
    public void postDelete(MGainItem entity, PostDeleteContext<MGainItem> context) {
    }
}