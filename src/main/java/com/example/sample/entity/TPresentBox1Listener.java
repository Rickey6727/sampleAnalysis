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
public class TPresentBox1Listener implements EntityListener<TPresentBox1> {

    @Override
    public void preInsert(TPresentBox1 entity, PreInsertContext<TPresentBox1> context) {
    }

    @Override
    public void preUpdate(TPresentBox1 entity, PreUpdateContext<TPresentBox1> context) {
    }

    @Override
    public void preDelete(TPresentBox1 entity, PreDeleteContext<TPresentBox1> context) {
    }

    @Override
    public void postInsert(TPresentBox1 entity, PostInsertContext<TPresentBox1> context) {
    }

    @Override
    public void postUpdate(TPresentBox1 entity, PostUpdateContext<TPresentBox1> context) {
    }

    @Override
    public void postDelete(TPresentBox1 entity, PostDeleteContext<TPresentBox1> context) {
    }
}