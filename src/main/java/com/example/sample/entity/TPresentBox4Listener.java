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
public class TPresentBox4Listener implements EntityListener<TPresentBox4> {

    @Override
    public void preInsert(TPresentBox4 entity, PreInsertContext<TPresentBox4> context) {
    }

    @Override
    public void preUpdate(TPresentBox4 entity, PreUpdateContext<TPresentBox4> context) {
    }

    @Override
    public void preDelete(TPresentBox4 entity, PreDeleteContext<TPresentBox4> context) {
    }

    @Override
    public void postInsert(TPresentBox4 entity, PostInsertContext<TPresentBox4> context) {
    }

    @Override
    public void postUpdate(TPresentBox4 entity, PostUpdateContext<TPresentBox4> context) {
    }

    @Override
    public void postDelete(TPresentBox4 entity, PostDeleteContext<TPresentBox4> context) {
    }
}