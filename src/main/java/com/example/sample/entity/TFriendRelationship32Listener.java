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
public class TFriendRelationship32Listener implements EntityListener<TFriendRelationship32> {

    @Override
    public void preInsert(TFriendRelationship32 entity, PreInsertContext<TFriendRelationship32> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship32 entity, PreUpdateContext<TFriendRelationship32> context) {
    }

    @Override
    public void preDelete(TFriendRelationship32 entity, PreDeleteContext<TFriendRelationship32> context) {
    }

    @Override
    public void postInsert(TFriendRelationship32 entity, PostInsertContext<TFriendRelationship32> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship32 entity, PostUpdateContext<TFriendRelationship32> context) {
    }

    @Override
    public void postDelete(TFriendRelationship32 entity, PostDeleteContext<TFriendRelationship32> context) {
    }
}