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
public class TPresentBoxListener implements EntityListener<TPresentBox> {

    @Override
    public void preInsert(TPresentBox entity, PreInsertContext<TPresentBox> context) {
    }

    @Override
    public void preUpdate(TPresentBox entity, PreUpdateContext<TPresentBox> context) {
    }

    @Override
    public void preDelete(TPresentBox entity, PreDeleteContext<TPresentBox> context) {
    }

    @Override
    public void postInsert(TPresentBox entity, PostInsertContext<TPresentBox> context) {
    }

    @Override
    public void postUpdate(TPresentBox entity, PostUpdateContext<TPresentBox> context) {
    }

    @Override
    public void postDelete(TPresentBox entity, PostDeleteContext<TPresentBox> context) {
    }
}