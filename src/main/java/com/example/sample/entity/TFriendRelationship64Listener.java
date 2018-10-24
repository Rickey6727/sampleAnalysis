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
public class TFriendRelationship64Listener implements EntityListener<TFriendRelationship64> {

    @Override
    public void preInsert(TFriendRelationship64 entity, PreInsertContext<TFriendRelationship64> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship64 entity, PreUpdateContext<TFriendRelationship64> context) {
    }

    @Override
    public void preDelete(TFriendRelationship64 entity, PreDeleteContext<TFriendRelationship64> context) {
    }

    @Override
    public void postInsert(TFriendRelationship64 entity, PostInsertContext<TFriendRelationship64> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship64 entity, PostUpdateContext<TFriendRelationship64> context) {
    }

    @Override
    public void postDelete(TFriendRelationship64 entity, PostDeleteContext<TFriendRelationship64> context) {
    }
}