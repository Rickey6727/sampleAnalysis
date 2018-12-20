package com.example.sample.entity.event;

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
public class TCaptureUserStateListener implements EntityListener<TCaptureUserState> {

    @Override
    public void preInsert(TCaptureUserState entity, PreInsertContext<TCaptureUserState> context) {
    }

    @Override
    public void preUpdate(TCaptureUserState entity, PreUpdateContext<TCaptureUserState> context) {
    }

    @Override
    public void preDelete(TCaptureUserState entity, PreDeleteContext<TCaptureUserState> context) {
    }

    @Override
    public void postInsert(TCaptureUserState entity, PostInsertContext<TCaptureUserState> context) {
    }

    @Override
    public void postUpdate(TCaptureUserState entity, PostUpdateContext<TCaptureUserState> context) {
    }

    @Override
    public void postDelete(TCaptureUserState entity, PostDeleteContext<TCaptureUserState> context) {
    }
}