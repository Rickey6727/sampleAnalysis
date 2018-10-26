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
public class MPresentEventReceiveItemListener implements EntityListener<MPresentEventReceiveItem> {

    @Override
    public void preInsert(MPresentEventReceiveItem entity, PreInsertContext<MPresentEventReceiveItem> context) {
    }

    @Override
    public void preUpdate(MPresentEventReceiveItem entity, PreUpdateContext<MPresentEventReceiveItem> context) {
    }

    @Override
    public void preDelete(MPresentEventReceiveItem entity, PreDeleteContext<MPresentEventReceiveItem> context) {
    }

    @Override
    public void postInsert(MPresentEventReceiveItem entity, PostInsertContext<MPresentEventReceiveItem> context) {
    }

    @Override
    public void postUpdate(MPresentEventReceiveItem entity, PostUpdateContext<MPresentEventReceiveItem> context) {
    }

    @Override
    public void postDelete(MPresentEventReceiveItem entity, PostDeleteContext<MPresentEventReceiveItem> context) {
    }
}