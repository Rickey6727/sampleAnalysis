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
public class MPushCountryListener implements EntityListener<MPushCountry> {

    @Override
    public void preInsert(MPushCountry entity, PreInsertContext<MPushCountry> context) {
    }

    @Override
    public void preUpdate(MPushCountry entity, PreUpdateContext<MPushCountry> context) {
    }

    @Override
    public void preDelete(MPushCountry entity, PreDeleteContext<MPushCountry> context) {
    }

    @Override
    public void postInsert(MPushCountry entity, PostInsertContext<MPushCountry> context) {
    }

    @Override
    public void postUpdate(MPushCountry entity, PostUpdateContext<MPushCountry> context) {
    }

    @Override
    public void postDelete(MPushCountry entity, PostDeleteContext<MPushCountry> context) {
    }
}