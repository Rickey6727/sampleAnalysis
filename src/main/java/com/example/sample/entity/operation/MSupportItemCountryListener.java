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
public class MSupportItemCountryListener implements EntityListener<MSupportItemCountry> {

    @Override
    public void preInsert(MSupportItemCountry entity, PreInsertContext<MSupportItemCountry> context) {
    }

    @Override
    public void preUpdate(MSupportItemCountry entity, PreUpdateContext<MSupportItemCountry> context) {
    }

    @Override
    public void preDelete(MSupportItemCountry entity, PreDeleteContext<MSupportItemCountry> context) {
    }

    @Override
    public void postInsert(MSupportItemCountry entity, PostInsertContext<MSupportItemCountry> context) {
    }

    @Override
    public void postUpdate(MSupportItemCountry entity, PostUpdateContext<MSupportItemCountry> context) {
    }

    @Override
    public void postDelete(MSupportItemCountry entity, PostDeleteContext<MSupportItemCountry> context) {
    }
}