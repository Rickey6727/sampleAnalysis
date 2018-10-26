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
public class TCoinEventListener implements EntityListener<TCoinEvent> {

    @Override
    public void preInsert(TCoinEvent entity, PreInsertContext<TCoinEvent> context) {
    }

    @Override
    public void preUpdate(TCoinEvent entity, PreUpdateContext<TCoinEvent> context) {
    }

    @Override
    public void preDelete(TCoinEvent entity, PreDeleteContext<TCoinEvent> context) {
    }

    @Override
    public void postInsert(TCoinEvent entity, PostInsertContext<TCoinEvent> context) {
    }

    @Override
    public void postUpdate(TCoinEvent entity, PostUpdateContext<TCoinEvent> context) {
    }

    @Override
    public void postDelete(TCoinEvent entity, PostDeleteContext<TCoinEvent> context) {
    }
}