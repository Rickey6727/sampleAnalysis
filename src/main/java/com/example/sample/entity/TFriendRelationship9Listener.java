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
public class TFriendRelationship9Listener implements EntityListener<TFriendRelationship9> {

    @Override
    public void preInsert(TFriendRelationship9 entity, PreInsertContext<TFriendRelationship9> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship9 entity, PreUpdateContext<TFriendRelationship9> context) {
    }

    @Override
    public void preDelete(TFriendRelationship9 entity, PreDeleteContext<TFriendRelationship9> context) {
    }

    @Override
    public void postInsert(TFriendRelationship9 entity, PostInsertContext<TFriendRelationship9> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship9 entity, PostUpdateContext<TFriendRelationship9> context) {
    }

    @Override
    public void postDelete(TFriendRelationship9 entity, PostDeleteContext<TFriendRelationship9> context) {
    }
}