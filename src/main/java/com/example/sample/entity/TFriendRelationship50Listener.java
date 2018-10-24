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
public class TFriendRelationship50Listener implements EntityListener<TFriendRelationship50> {

    @Override
    public void preInsert(TFriendRelationship50 entity, PreInsertContext<TFriendRelationship50> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship50 entity, PreUpdateContext<TFriendRelationship50> context) {
    }

    @Override
    public void preDelete(TFriendRelationship50 entity, PreDeleteContext<TFriendRelationship50> context) {
    }

    @Override
    public void postInsert(TFriendRelationship50 entity, PostInsertContext<TFriendRelationship50> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship50 entity, PostUpdateContext<TFriendRelationship50> context) {
    }

    @Override
    public void postDelete(TFriendRelationship50 entity, PostDeleteContext<TFriendRelationship50> context) {
    }
}