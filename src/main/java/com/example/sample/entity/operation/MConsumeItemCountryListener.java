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
public class MConsumeItemCountryListener implements EntityListener<MConsumeItemCountry> {

    @Override
    public void preInsert(MConsumeItemCountry entity, PreInsertContext<MConsumeItemCountry> context) {
    }

    @Override
    public void preUpdate(MConsumeItemCountry entity, PreUpdateContext<MConsumeItemCountry> context) {
    }

    @Override
    public void preDelete(MConsumeItemCountry entity, PreDeleteContext<MConsumeItemCountry> context) {
    }

    @Override
    public void postInsert(MConsumeItemCountry entity, PostInsertContext<MConsumeItemCountry> context) {
    }

    @Override
    public void postUpdate(MConsumeItemCountry entity, PostUpdateContext<MConsumeItemCountry> context) {
    }

    @Override
    public void postDelete(MConsumeItemCountry entity, PostDeleteContext<MConsumeItemCountry> context) {
    }
}