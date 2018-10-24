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
public class TFriendRelationship20Listener implements EntityListener<TFriendRelationship20> {

    @Override
    public void preInsert(TFriendRelationship20 entity, PreInsertContext<TFriendRelationship20> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship20 entity, PreUpdateContext<TFriendRelationship20> context) {
    }

    @Override
    public void preDelete(TFriendRelationship20 entity, PreDeleteContext<TFriendRelationship20> context) {
    }

    @Override
    public void postInsert(TFriendRelationship20 entity, PostInsertContext<TFriendRelationship20> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship20 entity, PostUpdateContext<TFriendRelationship20> context) {
    }

    @Override
    public void postDelete(TFriendRelationship20 entity, PostDeleteContext<TFriendRelationship20> context) {
    }
}