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
public class TCcpFamilyMemberApplicantListener implements EntityListener<TCcpFamilyMemberApplicant> {

    @Override
    public void preInsert(TCcpFamilyMemberApplicant entity, PreInsertContext<TCcpFamilyMemberApplicant> context) {
    }

    @Override
    public void preUpdate(TCcpFamilyMemberApplicant entity, PreUpdateContext<TCcpFamilyMemberApplicant> context) {
    }

    @Override
    public void preDelete(TCcpFamilyMemberApplicant entity, PreDeleteContext<TCcpFamilyMemberApplicant> context) {
    }

    @Override
    public void postInsert(TCcpFamilyMemberApplicant entity, PostInsertContext<TCcpFamilyMemberApplicant> context) {
    }

    @Override
    public void postUpdate(TCcpFamilyMemberApplicant entity, PostUpdateContext<TCcpFamilyMemberApplicant> context) {
    }

    @Override
    public void postDelete(TCcpFamilyMemberApplicant entity, PostDeleteContext<TCcpFamilyMemberApplicant> context) {
    }
}