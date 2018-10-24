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
public class TFriendRelationship8Listener implements EntityListener<TFriendRelationship8> {

    @Override
    public void preInsert(TFriendRelationship8 entity, PreInsertContext<TFriendRelationship8> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship8 entity, PreUpdateContext<TFriendRelationship8> context) {
    }

    @Override
    public void preDelete(TFriendRelationship8 entity, PreDeleteContext<TFriendRelationship8> context) {
    }

    @Override
    public void postInsert(TFriendRelationship8 entity, PostInsertContext<TFriendRelationship8> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship8 entity, PostUpdateContext<TFriendRelationship8> context) {
    }

    @Override
    public void postDelete(TFriendRelationship8 entity, PostDeleteContext<TFriendRelationship8> context) {
    }
}