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
public class MInformationSimpleListener implements EntityListener<MInformationSimple> {

    @Override
    public void preInsert(MInformationSimple entity, PreInsertContext<MInformationSimple> context) {
    }

    @Override
    public void preUpdate(MInformationSimple entity, PreUpdateContext<MInformationSimple> context) {
    }

    @Override
    public void preDelete(MInformationSimple entity, PreDeleteContext<MInformationSimple> context) {
    }

    @Override
    public void postInsert(MInformationSimple entity, PostInsertContext<MInformationSimple> context) {
    }

    @Override
    public void postUpdate(MInformationSimple entity, PostUpdateContext<MInformationSimple> context) {
    }

    @Override
    public void postDelete(MInformationSimple entity, PostDeleteContext<MInformationSimple> context) {
    }
}