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
public class MNpcAccountListener implements EntityListener<MNpcAccount> {

    @Override
    public void preInsert(MNpcAccount entity, PreInsertContext<MNpcAccount> context) {
    }

    @Override
    public void preUpdate(MNpcAccount entity, PreUpdateContext<MNpcAccount> context) {
    }

    @Override
    public void preDelete(MNpcAccount entity, PreDeleteContext<MNpcAccount> context) {
    }

    @Override
    public void postInsert(MNpcAccount entity, PostInsertContext<MNpcAccount> context) {
    }

    @Override
    public void postUpdate(MNpcAccount entity, PostUpdateContext<MNpcAccount> context) {
    }

    @Override
    public void postDelete(MNpcAccount entity, PostDeleteContext<MNpcAccount> context) {
    }
}