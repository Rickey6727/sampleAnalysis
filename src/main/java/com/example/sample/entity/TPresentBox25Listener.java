package com.example.sample.entity;

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
public class TPresentBox25Listener implements EntityListener<TPresentBox25> {

    @Override
    public void preInsert(TPresentBox25 entity, PreInsertContext<TPresentBox25> context) {
    }

    @Override
    public void preUpdate(TPresentBox25 entity, PreUpdateContext<TPresentBox25> context) {
    }

    @Override
    public void preDelete(TPresentBox25 entity, PreDeleteContext<TPresentBox25> context) {
    }

    @Override
    public void postInsert(TPresentBox25 entity, PostInsertContext<TPresentBox25> context) {
    }

    @Override
    public void postUpdate(TPresentBox25 entity, PostUpdateContext<TPresentBox25> context) {
    }

    @Override
    public void postDelete(TPresentBox25 entity, PostDeleteContext<TPresentBox25> context) {
    }
}