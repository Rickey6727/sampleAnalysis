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
public class TPresentBox5Listener implements EntityListener<TPresentBox5> {

    @Override
    public void preInsert(TPresentBox5 entity, PreInsertContext<TPresentBox5> context) {
    }

    @Override
    public void preUpdate(TPresentBox5 entity, PreUpdateContext<TPresentBox5> context) {
    }

    @Override
    public void preDelete(TPresentBox5 entity, PreDeleteContext<TPresentBox5> context) {
    }

    @Override
    public void postInsert(TPresentBox5 entity, PostInsertContext<TPresentBox5> context) {
    }

    @Override
    public void postUpdate(TPresentBox5 entity, PostUpdateContext<TPresentBox5> context) {
    }

    @Override
    public void postDelete(TPresentBox5 entity, PostDeleteContext<TPresentBox5> context) {
    }
}