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
public class TCocoppaAccountListener implements EntityListener<TCocoppaAccount> {

    @Override
    public void preInsert(TCocoppaAccount entity, PreInsertContext<TCocoppaAccount> context) {
    }

    @Override
    public void preUpdate(TCocoppaAccount entity, PreUpdateContext<TCocoppaAccount> context) {
    }

    @Override
    public void preDelete(TCocoppaAccount entity, PreDeleteContext<TCocoppaAccount> context) {
    }

    @Override
    public void postInsert(TCocoppaAccount entity, PostInsertContext<TCocoppaAccount> context) {
    }

    @Override
    public void postUpdate(TCocoppaAccount entity, PostUpdateContext<TCocoppaAccount> context) {
    }

    @Override
    public void postDelete(TCocoppaAccount entity, PostDeleteContext<TCocoppaAccount> context) {
    }
}