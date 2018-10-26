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
public class MCcpFamilyApplyListener implements EntityListener<MCcpFamilyApply> {

    @Override
    public void preInsert(MCcpFamilyApply entity, PreInsertContext<MCcpFamilyApply> context) {
    }

    @Override
    public void preUpdate(MCcpFamilyApply entity, PreUpdateContext<MCcpFamilyApply> context) {
    }

    @Override
    public void preDelete(MCcpFamilyApply entity, PreDeleteContext<MCcpFamilyApply> context) {
    }

    @Override
    public void postInsert(MCcpFamilyApply entity, PostInsertContext<MCcpFamilyApply> context) {
    }

    @Override
    public void postUpdate(MCcpFamilyApply entity, PostUpdateContext<MCcpFamilyApply> context) {
    }

    @Override
    public void postDelete(MCcpFamilyApply entity, PostDeleteContext<MCcpFamilyApply> context) {
    }
}