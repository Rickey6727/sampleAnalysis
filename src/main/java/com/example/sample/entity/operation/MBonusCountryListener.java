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
public class MBonusCountryListener implements EntityListener<MBonusCountry> {

    @Override
    public void preInsert(MBonusCountry entity, PreInsertContext<MBonusCountry> context) {
    }

    @Override
    public void preUpdate(MBonusCountry entity, PreUpdateContext<MBonusCountry> context) {
    }

    @Override
    public void preDelete(MBonusCountry entity, PreDeleteContext<MBonusCountry> context) {
    }

    @Override
    public void postInsert(MBonusCountry entity, PostInsertContext<MBonusCountry> context) {
    }

    @Override
    public void postUpdate(MBonusCountry entity, PostUpdateContext<MBonusCountry> context) {
    }

    @Override
    public void postDelete(MBonusCountry entity, PostDeleteContext<MBonusCountry> context) {
    }
}