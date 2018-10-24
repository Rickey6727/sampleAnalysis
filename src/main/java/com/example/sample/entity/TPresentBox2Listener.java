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
public class TPresentBox2Listener implements EntityListener<TPresentBox2> {

    @Override
    public void preInsert(TPresentBox2 entity, PreInsertContext<TPresentBox2> context) {
    }

    @Override
    public void preUpdate(TPresentBox2 entity, PreUpdateContext<TPresentBox2> context) {
    }

    @Override
    public void preDelete(TPresentBox2 entity, PreDeleteContext<TPresentBox2> context) {
    }

    @Override
    public void postInsert(TPresentBox2 entity, PostInsertContext<TPresentBox2> context) {
    }

    @Override
    public void postUpdate(TPresentBox2 entity, PostUpdateContext<TPresentBox2> context) {
    }

    @Override
    public void postDelete(TPresentBox2 entity, PostDeleteContext<TPresentBox2> context) {
    }
}