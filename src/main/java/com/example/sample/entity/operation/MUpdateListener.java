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
public class MUpdateListener implements EntityListener<MUpdate> {

    @Override
    public void preInsert(MUpdate entity, PreInsertContext<MUpdate> context) {
    }

    @Override
    public void preUpdate(MUpdate entity, PreUpdateContext<MUpdate> context) {
    }

    @Override
    public void preDelete(MUpdate entity, PreDeleteContext<MUpdate> context) {
    }

    @Override
    public void postInsert(MUpdate entity, PostInsertContext<MUpdate> context) {
    }

    @Override
    public void postUpdate(MUpdate entity, PostUpdateContext<MUpdate> context) {
    }

    @Override
    public void postDelete(MUpdate entity, PostDeleteContext<MUpdate> context) {
    }
}