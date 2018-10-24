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
public class TFriendRelationship11Listener implements EntityListener<TFriendRelationship11> {

    @Override
    public void preInsert(TFriendRelationship11 entity, PreInsertContext<TFriendRelationship11> context) {
    }

    @Override
    public void preUpdate(TFriendRelationship11 entity, PreUpdateContext<TFriendRelationship11> context) {
    }

    @Override
    public void preDelete(TFriendRelationship11 entity, PreDeleteContext<TFriendRelationship11> context) {
    }

    @Override
    public void postInsert(TFriendRelationship11 entity, PostInsertContext<TFriendRelationship11> context) {
    }

    @Override
    public void postUpdate(TFriendRelationship11 entity, PostUpdateContext<TFriendRelationship11> context) {
    }

    @Override
    public void postDelete(TFriendRelationship11 entity, PostDeleteContext<TFriendRelationship11> context) {
    }
}