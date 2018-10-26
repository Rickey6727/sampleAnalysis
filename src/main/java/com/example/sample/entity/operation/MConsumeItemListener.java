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
public class MConsumeItemListener implements EntityListener<MConsumeItem> {

    @Override
    public void preInsert(MConsumeItem entity, PreInsertContext<MConsumeItem> context) {
    }

    @Override
    public void preUpdate(MConsumeItem entity, PreUpdateContext<MConsumeItem> context) {
    }

    @Override
    public void preDelete(MConsumeItem entity, PreDeleteContext<MConsumeItem> context) {
    }

    @Override
    public void postInsert(MConsumeItem entity, PostInsertContext<MConsumeItem> context) {
    }

    @Override
    public void postUpdate(MConsumeItem entity, PostUpdateContext<MConsumeItem> context) {
    }

    @Override
    public void postDelete(MConsumeItem entity, PostDeleteContext<MConsumeItem> context) {
    }
}