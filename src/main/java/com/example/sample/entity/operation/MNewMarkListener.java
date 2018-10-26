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
public class MNewMarkListener implements EntityListener<MNewMark> {

    @Override
    public void preInsert(MNewMark entity, PreInsertContext<MNewMark> context) {
    }

    @Override
    public void preUpdate(MNewMark entity, PreUpdateContext<MNewMark> context) {
    }

    @Override
    public void preDelete(MNewMark entity, PreDeleteContext<MNewMark> context) {
    }

    @Override
    public void postInsert(MNewMark entity, PostInsertContext<MNewMark> context) {
    }

    @Override
    public void postUpdate(MNewMark entity, PostUpdateContext<MNewMark> context) {
    }

    @Override
    public void postDelete(MNewMark entity, PostDeleteContext<MNewMark> context) {
    }
}