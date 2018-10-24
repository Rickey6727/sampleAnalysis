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
public class TFriendRelationship1Listener implements EntityListener<TFriendRelationship1> {

    @Override
    public void preInsert(TFriendRelationship1 entity, PreInsertContext<TFriendRelationship1> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship1 entity, PreUpdateContext<TFriendRelationship1> context) {
    }

    @Override
    public void preDelete(TFriendRelationship1 entity, PreDeleteContext<TFriendRelationship1> context) {
    }

    @Override
    public void postInsert(TFriendRelationship1 entity, PostInsertContext<TFriendRelationship1> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship1 entity, PostUpdateContext<TFriendRelationship1> context) {
    }

    @Override
    public void postDelete(TFriendRelationship1 entity, PostDeleteContext<TFriendRelationship1> context) {
    }
}