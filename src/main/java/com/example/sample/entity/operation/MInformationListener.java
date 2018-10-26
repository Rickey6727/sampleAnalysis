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
public class MInformationListener implements EntityListener<MInformation> {

    @Override
    public void preInsert(MInformation entity, PreInsertContext<MInformation> context) {
    }

    @Override
    public void preUpdate(MInformation entity, PreUpdateContext<MInformation> context) {
    }

    @Override
    public void preDelete(MInformation entity, PreDeleteContext<MInformation> context) {
    }

    @Override
    public void postInsert(MInformation entity, PostInsertContext<MInformation> context) {
    }

    @Override
    public void postUpdate(MInformation entity, PostUpdateContext<MInformation> context) {
    }

    @Override
    public void postDelete(MInformation entity, PostDeleteContext<MInformation> context) {
    }
}