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
public class TFriendRelationship5Listener implements EntityListener<TFriendRelationship5> {

    @Override
    public void preInsert(TFriendRelationship5 entity, PreInsertContext<TFriendRelationship5> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship5 entity, PreUpdateContext<TFriendRelationship5> context) {
    }

    @Override
    public void preDelete(TFriendRelationship5 entity, PreDeleteContext<TFriendRelationship5> context) {
    }

    @Override
    public void postInsert(TFriendRelationship5 entity, PostInsertContext<TFriendRelationship5> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship5 entity, PostUpdateContext<TFriendRelationship5> context) {
    }

    @Override
    public void postDelete(TFriendRelationship5 entity, PostDeleteContext<TFriendRelationship5> context) {
    }
}