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
public class TPresentBox10Listener implements EntityListener<TPresentBox10> {

    @Override
    public void preInsert(TPresentBox10 entity, PreInsertContext<TPresentBox10> context) {
    }

    @Override
    public void preUpdate(TPresentBox10 entity, PreUpdateContext<TPresentBox10> context) {
    }

    @Override
    public void preDelete(TPresentBox10 entity, PreDeleteContext<TPresentBox10> context) {
    }

    @Override
    public void postInsert(TPresentBox10 entity, PostInsertContext<TPresentBox10> context) {
    }

    @Override
    public void postUpdate(TPresentBox10 entity, PostUpdateContext<TPresentBox10> context) {
    }

    @Override
    public void postDelete(TPresentBox10 entity, PostDeleteContext<TPresentBox10> context) {
    }
}