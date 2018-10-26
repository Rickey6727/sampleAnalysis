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
public class MBonusListener implements EntityListener<MBonus> {

    @Override
    public void preInsert(MBonus entity, PreInsertContext<MBonus> context) {
    }

    @Override
    public void preUpdate(MBonus entity, PreUpdateContext<MBonus> context) {
    }

    @Override
    public void preDelete(MBonus entity, PreDeleteContext<MBonus> context) {
    }

    @Override
    public void postInsert(MBonus entity, PostInsertContext<MBonus> context) {
    }

    @Override
    public void postUpdate(MBonus entity, PostUpdateContext<MBonus> context) {
    }

    @Override
    public void postDelete(MBonus entity, PostDeleteContext<MBonus> context) {
    }
}