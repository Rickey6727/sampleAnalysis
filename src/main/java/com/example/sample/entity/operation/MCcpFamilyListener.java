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
public class MCcpFamilyListener implements EntityListener<MCcpFamily> {

    @Override
    public void preInsert(MCcpFamily entity, PreInsertContext<MCcpFamily> context) {
    }

    @Override
    public void preUpdate(MCcpFamily entity, PreUpdateContext<MCcpFamily> context) {
    }

    @Override
    public void preDelete(MCcpFamily entity, PreDeleteContext<MCcpFamily> context) {
    }

    @Override
    public void postInsert(MCcpFamily entity, PostInsertContext<MCcpFamily> context) {
    }

    @Override
    public void postUpdate(MCcpFamily entity, PostUpdateContext<MCcpFamily> context) {
    }

    @Override
    public void postDelete(MCcpFamily entity, PostDeleteContext<MCcpFamily> context) {
    }
}