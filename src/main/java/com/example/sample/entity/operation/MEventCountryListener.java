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
public class MEventCountryListener implements EntityListener<MEventCountry> {

    @Override
    public void preInsert(MEventCountry entity, PreInsertContext<MEventCountry> context) {
    }

    @Override
    public void preUpdate(MEventCountry entity, PreUpdateContext<MEventCountry> context) {
    }

    @Override
    public void preDelete(MEventCountry entity, PreDeleteContext<MEventCountry> context) {
    }

    @Override
    public void postInsert(MEventCountry entity, PostInsertContext<MEventCountry> context) {
    }

    @Override
    public void postUpdate(MEventCountry entity, PostUpdateContext<MEventCountry> context) {
    }

    @Override
    public void postDelete(MEventCountry entity, PostDeleteContext<MEventCountry> context) {
    }
}