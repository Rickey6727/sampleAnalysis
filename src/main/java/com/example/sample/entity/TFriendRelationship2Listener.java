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
public class TFriendRelationship2Listener implements EntityListener<TFriendRelationship2> {

    @Override
    public void preInsert(TFriendRelationship2 entity, PreInsertContext<TFriendRelationship2> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship2 entity, PreUpdateContext<TFriendRelationship2> context) {
    }

    @Override
    public void preDelete(TFriendRelationship2 entity, PreDeleteContext<TFriendRelationship2> context) {
    }

    @Override
    public void postInsert(TFriendRelationship2 entity, PostInsertContext<TFriendRelationship2> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship2 entity, PostUpdateContext<TFriendRelationship2> context) {
    }

    @Override
    public void postDelete(TFriendRelationship2 entity, PostDeleteContext<TFriendRelationship2> context) {
    }
}