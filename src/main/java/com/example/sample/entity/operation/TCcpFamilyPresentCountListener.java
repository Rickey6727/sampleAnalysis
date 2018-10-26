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
public class TCcpFamilyPresentCountListener implements EntityListener<TCcpFamilyPresentCount> {

    @Override
    public void preInsert(TCcpFamilyPresentCount entity, PreInsertContext<TCcpFamilyPresentCount> context) {
    }

    @Override
    public void preUpdate(TCcpFamilyPresentCount entity, PreUpdateContext<TCcpFamilyPresentCount> context) {
    }

    @Override
    public void preDelete(TCcpFamilyPresentCount entity, PreDeleteContext<TCcpFamilyPresentCount> context) {
    }

    @Override
    public void postInsert(TCcpFamilyPresentCount entity, PostInsertContext<TCcpFamilyPresentCount> context) {
    }

    @Override
    public void postUpdate(TCcpFamilyPresentCount entity, PostUpdateContext<TCcpFamilyPresentCount> context) {
    }

    @Override
    public void postDelete(TCcpFamilyPresentCount entity, PostDeleteContext<TCcpFamilyPresentCount> context) {
    }
}