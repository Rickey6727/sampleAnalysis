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
public class TPresentBox42Listener implements EntityListener<TPresentBox42> {

    @Override
    public void preInsert(TPresentBox42 entity, PreInsertContext<TPresentBox42> context) {
    }

    @Override
    public void preUpdate(TPresentBox42 entity, PreUpdateContext<TPresentBox42> context) {
    }

    @Override
    public void preDelete(TPresentBox42 entity, PreDeleteContext<TPresentBox42> context) {
    }

    @Override
    public void postInsert(TPresentBox42 entity, PostInsertContext<TPresentBox42> context) {
    }

    @Override
    public void postUpdate(TPresentBox42 entity, PostUpdateContext<TPresentBox42> context) {
    }

    @Override
    public void postDelete(TPresentBox42 entity, PostDeleteContext<TPresentBox42> context) {
    }
}