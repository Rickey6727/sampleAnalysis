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
public class TFriendRelationship7Listener implements EntityListener<TFriendRelationship7> {

    @Override
    public void preInsert(TFriendRelationship7 entity, PreInsertContext<TFriendRelationship7> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship7 entity, PreUpdateContext<TFriendRelationship7> context) {
    }

    @Override
    public void preDelete(TFriendRelationship7 entity, PreDeleteContext<TFriendRelationship7> context) {
    }

    @Override
    public void postInsert(TFriendRelationship7 entity, PostInsertContext<TFriendRelationship7> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship7 entity, PostUpdateContext<TFriendRelationship7> context) {
    }

    @Override
    public void postDelete(TFriendRelationship7 entity, PostDeleteContext<TFriendRelationship7> context) {
    }
}