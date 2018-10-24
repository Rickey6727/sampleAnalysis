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
public class TFriendRelationship4Listener implements EntityListener<TFriendRelationship4> {

    @Override
    public void preInsert(TFriendRelationship4 entity, PreInsertContext<TFriendRelationship4> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship4 entity, PreUpdateContext<TFriendRelationship4> context) {
    }

    @Override
    public void preDelete(TFriendRelationship4 entity, PreDeleteContext<TFriendRelationship4> context) {
    }

    @Override
    public void postInsert(TFriendRelationship4 entity, PostInsertContext<TFriendRelationship4> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship4 entity, PostUpdateContext<TFriendRelationship4> context) {
    }

    @Override
    public void postDelete(TFriendRelationship4 entity, PostDeleteContext<TFriendRelationship4> context) {
    }
}