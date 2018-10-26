package com.example.sample.entity.manage;

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
public class MGachaPushListener implements EntityListener<MGachaPush> {

    @Override
    public void preInsert(MGachaPush entity, PreInsertContext<MGachaPush> context) {
    }

    @Override
    public void preUpdate(MGachaPush entity, PreUpdateContext<MGachaPush> context) {
    }

    @Override
    public void preDelete(MGachaPush entity, PreDeleteContext<MGachaPush> context) {
    }

    @Override
    public void postInsert(MGachaPush entity, PostInsertContext<MGachaPush> context) {
    }

    @Override
    public void postUpdate(MGachaPush entity, PostUpdateContext<MGachaPush> context) {
    }

    @Override
    public void postDelete(MGachaPush entity, PostDeleteContext<MGachaPush> context) {
    }
}