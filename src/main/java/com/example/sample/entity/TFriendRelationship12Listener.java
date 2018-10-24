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
public class TFriendRelationship12Listener implements EntityListener<TFriendRelationship12> {

    @Override
    public void preInsert(TFriendRelationship12 entity, PreInsertContext<TFriendRelationship12> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship12 entity, PreUpdateContext<TFriendRelationship12> context) {
    }

    @Override
    public void preDelete(TFriendRelationship12 entity, PreDeleteContext<TFriendRelationship12> context) {
    }

    @Override
    public void postInsert(TFriendRelationship12 entity, PostInsertContext<TFriendRelationship12> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship12 entity, PostUpdateContext<TFriendRelationship12> context) {
    }

    @Override
    public void postDelete(TFriendRelationship12 entity, PostDeleteContext<TFriendRelationship12> context) {
    }
}