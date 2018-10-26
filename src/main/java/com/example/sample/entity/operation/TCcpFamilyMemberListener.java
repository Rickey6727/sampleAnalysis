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
public class TCcpFamilyMemberListener implements EntityListener<TCcpFamilyMember> {

    @Override
    public void preInsert(TCcpFamilyMember entity, PreInsertContext<TCcpFamilyMember> context) {
    }

    @Override
    public void preUpdate(TCcpFamilyMember entity, PreUpdateContext<TCcpFamilyMember> context) {
    }

    @Override
    public void preDelete(TCcpFamilyMember entity, PreDeleteContext<TCcpFamilyMember> context) {
    }

    @Override
    public void postInsert(TCcpFamilyMember entity, PostInsertContext<TCcpFamilyMember> context) {
    }

    @Override
    public void postUpdate(TCcpFamilyMember entity, PostUpdateContext<TCcpFamilyMember> context) {
    }

    @Override
    public void postDelete(TCcpFamilyMember entity, PostDeleteContext<TCcpFamilyMember> context) {
    }
}