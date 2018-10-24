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
public class TFriendRelationship10Listener implements EntityListener<TFriendRelationship10> {

    @Override
    public void preInsert(TFriendRelationship10 entity, PreInsertContext<TFriendRelationship10> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship10 entity, PreUpdateContext<TFriendRelationship10> context) {
    }

    @Override
    public void preDelete(TFriendRelationship10 entity, PreDeleteContext<TFriendRelationship10> context) {
    }

    @Override
    public void postInsert(TFriendRelationship10 entity, PostInsertContext<TFriendRelationship10> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship10 entity, PostUpdateContext<TFriendRelationship10> context) {
    }

    @Override
    public void postDelete(TFriendRelationship10 entity, PostDeleteContext<TFriendRelationship10> context) {
    }
}