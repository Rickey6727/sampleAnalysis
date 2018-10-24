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
public class TFriendRelationship99Listener implements EntityListener<TFriendRelationship99> {

    @Override
    public void preInsert(TFriendRelationship99 entity, PreInsertContext<TFriendRelationship99> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship99 entity, PreUpdateContext<TFriendRelationship99> context) {
    }

    @Override
    public void preDelete(TFriendRelationship99 entity, PreDeleteContext<TFriendRelationship99> context) {
    }

    @Override
    public void postInsert(TFriendRelationship99 entity, PostInsertContext<TFriendRelationship99> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship99 entity, PostUpdateContext<TFriendRelationship99> context) {
    }

    @Override
    public void postDelete(TFriendRelationship99 entity, PostDeleteContext<TFriendRelationship99> context) {
    }
}