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
public class TTitleOwnListener implements EntityListener<TTitleOwn> {

    @Override
    public void preInsert(TTitleOwn entity, PreInsertContext<TTitleOwn> context) {
    }

    @Override
    public void preUpdate(TTitleOwn entity, PreUpdateContext<TTitleOwn> context) {
    }

    @Override
    public void preDelete(TTitleOwn entity, PreDeleteContext<TTitleOwn> context) {
    }

    @Override
    public void postInsert(TTitleOwn entity, PostInsertContext<TTitleOwn> context) {
    }

    @Override
    public void postUpdate(TTitleOwn entity, PostUpdateContext<TTitleOwn> context) {
    }

    @Override
    public void postDelete(TTitleOwn entity, PostDeleteContext<TTitleOwn> context) {
    }
}