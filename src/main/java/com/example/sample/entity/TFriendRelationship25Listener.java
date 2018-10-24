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
public class TFriendRelationship25Listener implements EntityListener<TFriendRelationship25> {

    @Override
    public void preInsert(TFriendRelationship25 entity, PreInsertContext<TFriendRelationship25> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship25 entity, PreUpdateContext<TFriendRelationship25> context) {
    }

    @Override
    public void preDelete(TFriendRelationship25 entity, PreDeleteContext<TFriendRelationship25> context) {
    }

    @Override
    public void postInsert(TFriendRelationship25 entity, PostInsertContext<TFriendRelationship25> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship25 entity, PostUpdateContext<TFriendRelationship25> context) {
    }

    @Override
    public void postDelete(TFriendRelationship25 entity, PostDeleteContext<TFriendRelationship25> context) {
    }
}