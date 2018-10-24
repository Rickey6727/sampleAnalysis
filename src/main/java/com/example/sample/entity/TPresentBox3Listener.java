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
public class TPresentBox3Listener implements EntityListener<TPresentBox3> {

    @Override
    public void preInsert(TPresentBox3 entity, PreInsertContext<TPresentBox3> context) {
    }

    @Override
    public void preUpdate(TPresentBox3 entity, PreUpdateContext<TPresentBox3> context) {
    }

    @Override
    public void preDelete(TPresentBox3 entity, PreDeleteContext<TPresentBox3> context) {
    }

    @Override
    public void postInsert(TPresentBox3 entity, PostInsertContext<TPresentBox3> context) {
    }

    @Override
    public void postUpdate(TPresentBox3 entity, PostUpdateContext<TPresentBox3> context) {
    }

    @Override
    public void postDelete(TPresentBox3 entity, PostDeleteContext<TPresentBox3> context) {
    }
}