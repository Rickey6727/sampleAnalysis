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
public class MInformationLimitListener implements EntityListener<MInformationLimit> {

    @Override
    public void preInsert(MInformationLimit entity, PreInsertContext<MInformationLimit> context) {
    }

    @Override
    public void preUpdate(MInformationLimit entity, PreUpdateContext<MInformationLimit> context) {
    }

    @Override
    public void preDelete(MInformationLimit entity, PreDeleteContext<MInformationLimit> context) {
    }

    @Override
    public void postInsert(MInformationLimit entity, PostInsertContext<MInformationLimit> context) {
    }

    @Override
    public void postUpdate(MInformationLimit entity, PostUpdateContext<MInformationLimit> context) {
    }

    @Override
    public void postDelete(MInformationLimit entity, PostDeleteContext<MInformationLimit> context) {
    }
}