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
public class TFriendRelationship6Listener implements EntityListener<TFriendRelationship6> {

    @Override
    public void preInsert(TFriendRelationship6 entity, PreInsertContext<TFriendRelationship6> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship6 entity, PreUpdateContext<TFriendRelationship6> context) {
    }

    @Override
    public void preDelete(TFriendRelationship6 entity, PreDeleteContext<TFriendRelationship6> context) {
    }

    @Override
    public void postInsert(TFriendRelationship6 entity, PostInsertContext<TFriendRelationship6> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship6 entity, PostUpdateContext<TFriendRelationship6> context) {
    }

    @Override
    public void postDelete(TFriendRelationship6 entity, PostDeleteContext<TFriendRelationship6> context) {
    }
}