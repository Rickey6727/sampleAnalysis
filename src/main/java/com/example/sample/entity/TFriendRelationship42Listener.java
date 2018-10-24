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
public class TFriendRelationship42Listener implements EntityListener<TFriendRelationship42> {

    @Override
    public void preInsert(TFriendRelationship42 entity, PreInsertContext<TFriendRelationship42> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship42 entity, PreUpdateContext<TFriendRelationship42> context) {
    }

    @Override
    public void preDelete(TFriendRelationship42 entity, PreDeleteContext<TFriendRelationship42> context) {
    }

    @Override
    public void postInsert(TFriendRelationship42 entity, PostInsertContext<TFriendRelationship42> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship42 entity, PostUpdateContext<TFriendRelationship42> context) {
    }

    @Override
    public void postDelete(TFriendRelationship42 entity, PostDeleteContext<TFriendRelationship42> context) {
    }
}