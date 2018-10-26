package com.example.sample.entity.operation;

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
public class MInviteListener implements EntityListener<MInvite> {

    @Override
    public void preInsert(MInvite entity, PreInsertContext<MInvite> context) {
    }

    @Override
    public void preUpdate(MInvite entity, PreUpdateContext<MInvite> context) {
    }

    @Override
    public void preDelete(MInvite entity, PreDeleteContext<MInvite> context) {
    }

    @Override
    public void postInsert(MInvite entity, PostInsertContext<MInvite> context) {
    }

    @Override
    public void postUpdate(MInvite entity, PostUpdateContext<MInvite> context) {
    }

    @Override
    public void postDelete(MInvite entity, PostDeleteContext<MInvite> context) {
    }
}