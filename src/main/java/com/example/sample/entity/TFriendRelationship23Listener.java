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
public class TFriendRelationship23Listener implements EntityListener<TFriendRelationship23> {

    @Override
    public void preInsert(TFriendRelationship23 entity, PreInsertContext<TFriendRelationship23> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship23 entity, PreUpdateContext<TFriendRelationship23> context) {
    }

    @Override
    public void preDelete(TFriendRelationship23 entity, PreDeleteContext<TFriendRelationship23> context) {
    }

    @Override
    public void postInsert(TFriendRelationship23 entity, PostInsertContext<TFriendRelationship23> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship23 entity, PostUpdateContext<TFriendRelationship23> context) {
    }

    @Override
    public void postDelete(TFriendRelationship23 entity, PostDeleteContext<TFriendRelationship23> context) {
    }
}