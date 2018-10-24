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
public class TFriendRelationship3Listener implements EntityListener<TFriendRelationship3> {

    @Override
    public void preInsert(TFriendRelationship3 entity, PreInsertContext<TFriendRelationship3> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship3 entity, PreUpdateContext<TFriendRelationship3> context) {
    }

    @Override
    public void preDelete(TFriendRelationship3 entity, PreDeleteContext<TFriendRelationship3> context) {
    }

    @Override
    public void postInsert(TFriendRelationship3 entity, PostInsertContext<TFriendRelationship3> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship3 entity, PostUpdateContext<TFriendRelationship3> context) {
    }

    @Override
    public void postDelete(TFriendRelationship3 entity, PostDeleteContext<TFriendRelationship3> context) {
    }
}