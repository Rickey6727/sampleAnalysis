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
public class TFriendRelationship21Listener implements EntityListener<TFriendRelationship21> {

    @Override
    public void preInsert(TFriendRelationship21 entity, PreInsertContext<TFriendRelationship21> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship21 entity, PreUpdateContext<TFriendRelationship21> context) {
    }

    @Override
    public void preDelete(TFriendRelationship21 entity, PreDeleteContext<TFriendRelationship21> context) {
    }

    @Override
    public void postInsert(TFriendRelationship21 entity, PostInsertContext<TFriendRelationship21> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship21 entity, PostUpdateContext<TFriendRelationship21> context) {
    }

    @Override
    public void postDelete(TFriendRelationship21 entity, PostDeleteContext<TFriendRelationship21> context) {
    }
}